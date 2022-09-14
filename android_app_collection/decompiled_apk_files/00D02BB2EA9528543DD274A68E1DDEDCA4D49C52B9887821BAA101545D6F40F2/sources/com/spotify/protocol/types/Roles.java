package com.spotify.protocol.types;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Roles implements Item {
    @dgto(a = "broker")
    public final Empty broker;
    @dgto(a = "caller")
    public final Empty caller;
    @dgto(a = "dealer")
    public final Empty dealer;
    @dgto(a = "subscriber")
    public final Empty subscriber;

    public Roles() {
        this(null, null, null, null);
    }

    public Roles(Empty empty, Empty empty2, Empty empty3, Empty empty4) {
        this.dealer = empty;
        this.broker = empty2;
        this.subscriber = empty3;
        this.caller = empty4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Roles roles = (Roles) obj;
        Empty empty = this.dealer;
        if (empty == null ? roles.dealer != null : !empty.equals(roles.dealer)) {
            return false;
        }
        Empty empty2 = this.broker;
        if (empty2 == null ? roles.broker != null : !empty2.equals(roles.broker)) {
            return false;
        }
        Empty empty3 = this.subscriber;
        if (empty3 == null ? roles.subscriber != null : !empty3.equals(roles.subscriber)) {
            return false;
        }
        Empty empty4 = this.caller;
        return empty4 != null ? empty4.equals(roles.caller) : roles.caller == null;
    }

    public int hashCode() {
        Empty empty = this.dealer;
        int i = 0;
        int hashCode = (empty != null ? empty.hashCode() : 0) * 31;
        Empty empty2 = this.broker;
        int hashCode2 = (hashCode + (empty2 != null ? empty2.hashCode() : 0)) * 31;
        Empty empty3 = this.subscriber;
        int hashCode3 = (hashCode2 + (empty3 != null ? empty3.hashCode() : 0)) * 31;
        Empty empty4 = this.caller;
        if (empty4 != null) {
            i = empty4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.dealer);
        String valueOf2 = String.valueOf(this.broker);
        String valueOf3 = String.valueOf(this.subscriber);
        String valueOf4 = String.valueOf(this.caller);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 45 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Roles{dealer=");
        sb.append(valueOf);
        sb.append(", broker=");
        sb.append(valueOf2);
        sb.append(", subscriber=");
        sb.append(valueOf3);
        sb.append(", caller=");
        sb.append(valueOf4);
        sb.append('}');
        return sb.toString();
    }
}
