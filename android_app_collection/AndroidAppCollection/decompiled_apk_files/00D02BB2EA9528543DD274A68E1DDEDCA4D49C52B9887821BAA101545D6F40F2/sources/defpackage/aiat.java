package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: aiat  reason: default package */
/* loaded from: classes2.dex */
final class aiat extends aibz {
    public final doek a;
    public final GmmLocation b;
    private final long c;

    public aiat(long j, doek doekVar, @dzsi GmmLocation gmmLocation) {
        this.c = j;
        if (doekVar != null) {
            this.a = doekVar;
            this.b = gmmLocation;
            return;
        }
        throw new NullPointerException("Null journey");
    }

    @Override // defpackage.aibz
    protected final long a() {
        return this.c;
    }

    @Override // defpackage.aibz
    public final doek b() {
        return this.a;
    }

    @Override // defpackage.aibz
    @dzsi
    public final GmmLocation c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        GmmLocation gmmLocation;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aibz) {
            aibz aibzVar = (aibz) obj;
            if (this.c == aibzVar.a() && this.a.equals(aibzVar.b()) && ((gmmLocation = this.b) != null ? gmmLocation.equals(aibzVar.c()) : aibzVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.c;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        doek doekVar = this.a;
        int i2 = doekVar.bC;
        if (i2 == 0) {
            i2 = dsst.a.b(doekVar).c(doekVar);
            doekVar.bC = i2;
        }
        int i3 = (i ^ i2) * 1000003;
        GmmLocation gmmLocation = this.b;
        return (gmmLocation == null ? 0 : gmmLocation.hashCode()) ^ i3;
    }

    public final String toString() {
        long j = this.c;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 78 + String.valueOf(valueOf2).length());
        sb.append("TimestampedUpdate{creationTimestamp=");
        sb.append(j);
        sb.append(", journey=");
        sb.append(valueOf);
        sb.append(", location=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
