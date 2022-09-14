package com.spotify.protocol.types;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class WelcomeDetails implements Item {
    @dgto(a = "roles")
    public final Roles roles;

    private WelcomeDetails() {
        this(null);
    }

    public WelcomeDetails(Roles roles) {
        this.roles = roles;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WelcomeDetails welcomeDetails = (WelcomeDetails) obj;
        Roles roles = this.roles;
        if (roles != null) {
            return roles.equals(welcomeDetails.roles);
        }
        return welcomeDetails.roles == null;
    }

    public int hashCode() {
        Roles roles = this.roles;
        if (roles != null) {
            return roles.hashCode();
        }
        return 0;
    }

    public String toString() {
        String valueOf = String.valueOf(this.roles);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("WelcomeDetails{roles=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
