package za.ac.mycput.factory;
/*
* Lease.java
* Lease for the tenant
* Malik Muhammed (230388175)
* 21/3/2026
 */

// Check if this matches your actual Lease.java package!
import za.ac.mycput.domain.Lease;

public class LeaseFactory {

    public static Lease createLease(String leaseId, String propertyId, String tenantName, double monthlyRent) {
        // Simple validation to ensure we don't create "empty" leases
        if (leaseId == null || leaseId.isEmpty() || tenantName == null || tenantName.isEmpty()) {
            return null;
        }

        // This calls the Constructor you (should) have in your Lease class
        return new Lease(leaseId, propertyId, tenantName, monthlyRent);
    }
}
