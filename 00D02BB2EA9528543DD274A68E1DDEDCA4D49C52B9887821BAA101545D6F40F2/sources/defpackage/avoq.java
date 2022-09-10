package defpackage;

import android.location.Location;
/* compiled from: PG */
/* renamed from: avoq  reason: default package */
/* loaded from: classes3.dex */
public final class avoq extends avpd {
    public final Location a;
    public final dlsw b;
    public final dlqi c;

    public avoq(Location location, dlsw dlswVar, dlqi dlqiVar) {
        this.a = location;
        if (dlswVar != null) {
            this.b = dlswVar;
            if (dlqiVar != null) {
                this.c = dlqiVar;
                return;
            }
            throw new NullPointerException("Null dynamicPaddingLocationStatusResponse");
        }
        throw new NullPointerException("Null owner");
    }

    @Override // defpackage.avpd
    public final Location a() {
        return this.a;
    }

    @Override // defpackage.avpd
    public final dlsw b() {
        return this.b;
    }

    @Override // defpackage.avpd
    public final dlqi c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avpd) {
            avpd avpdVar = (avpd) obj;
            if (this.a.equals(avpdVar.a()) && this.b.equals(avpdVar.b()) && this.c.equals(avpdVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        dlsw dlswVar = this.b;
        int i = dlswVar.bC;
        if (i == 0) {
            i = dsst.a.b(dlswVar).c(dlswVar);
            dlswVar.bC = i;
        }
        int i2 = (hashCode ^ i) * 1000003;
        dlqi dlqiVar = this.c;
        int i3 = dlqiVar.bC;
        if (i3 == 0) {
            i3 = dsst.a.b(dlqiVar).c(dlqiVar);
            dlqiVar.bC = i3;
        }
        return i2 ^ i3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 78 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("LocationCheckInEvent{location=");
        sb.append(valueOf);
        sb.append(", owner=");
        sb.append(valueOf2);
        sb.append(", dynamicPaddingLocationStatusResponse=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
