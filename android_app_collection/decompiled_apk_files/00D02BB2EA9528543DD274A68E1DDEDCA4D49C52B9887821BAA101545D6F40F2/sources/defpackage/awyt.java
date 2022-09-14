package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: awyt  reason: default package */
/* loaded from: classes.dex */
public final class awyt extends awyv {
    public final int a;
    public final GmmLocation b;
    public final dhjx c;
    public final axev d;

    public awyt(int i, @dzsi GmmLocation gmmLocation, @dzsi dhjx dhjxVar, axev axevVar) {
        this.a = i;
        this.b = gmmLocation;
        this.c = dhjxVar;
        if (axevVar != null) {
            this.d = axevVar;
            return;
        }
        throw new NullPointerException("Null updatedTimestamps");
    }

    @Override // defpackage.awyv
    public final int a() {
        return this.a;
    }

    @Override // defpackage.awyv
    @dzsi
    public final GmmLocation b() {
        return this.b;
    }

    @Override // defpackage.awyv
    @dzsi
    public final dhjx c() {
        return this.c;
    }

    @Override // defpackage.awyv
    public final axev d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        GmmLocation gmmLocation;
        dhjx dhjxVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof awyv) {
            awyv awyvVar = (awyv) obj;
            if (this.a == awyvVar.a() && ((gmmLocation = this.b) != null ? gmmLocation.equals(awyvVar.b()) : awyvVar.b() == null) && ((dhjxVar = this.c) != null ? dhjxVar.equals(awyvVar.c()) : awyvVar.c() == null) && this.d.equals(awyvVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        GmmLocation gmmLocation = this.b;
        int i2 = 0;
        int hashCode = (i ^ (gmmLocation == null ? 0 : gmmLocation.hashCode())) * 1000003;
        dhjx dhjxVar = this.c;
        if (dhjxVar != null && (i2 = dhjxVar.bC) == 0) {
            i2 = dsst.a.b(dhjxVar).c(dhjxVar);
            dhjxVar.bC = i2;
        }
        int i3 = (hashCode ^ i2) * 1000003;
        axev axevVar = this.d;
        int i4 = axevVar.bC;
        if (i4 == 0) {
            i4 = dsst.a.b(axevVar).c(axevVar);
            axevVar.bC = i4;
        }
        return i3 ^ i4;
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 93 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("UserContext{currentTimeSec=");
        sb.append(i);
        sb.append(", currentLocation=");
        sb.append(valueOf);
        sb.append(", currentCamera=");
        sb.append(valueOf2);
        sb.append(", updatedTimestamps=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
