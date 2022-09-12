package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: clfv  reason: default package */
/* loaded from: classes5.dex */
public final class clfv extends clge {
    private final clig a;
    private final Map<clcv, clgc> b;

    public clfv(clig cligVar, Map<clcv, clgc> map) {
        if (cligVar != null) {
            this.a = cligVar;
            if (map != null) {
                this.b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    @Override // defpackage.clge
    public final clig a() {
        return this.a;
    }

    @Override // defpackage.clge
    public final Map<clcv, clgc> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof clge) {
            clge clgeVar = (clge) obj;
            if (this.a.equals(clgeVar.a()) && this.b.equals(clgeVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length());
        sb.append("SchedulerConfig{clock=");
        sb.append(valueOf);
        sb.append(", values=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
