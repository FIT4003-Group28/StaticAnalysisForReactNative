package defpackage;
/* compiled from: PG */
/* renamed from: yym  reason: default package */
/* loaded from: classes7.dex */
public final class yym extends yzq {
    private final String a;
    private final akrk b;
    private final amvh c;
    private final amvh d;
    private final dpej e;

    public yym(String str, akrk akrkVar, amvh amvhVar, amvh amvhVar2, dpej dpejVar) {
        this.a = str;
        this.b = akrkVar;
        if (amvhVar != null) {
            this.c = amvhVar;
            if (amvhVar2 != null) {
                this.d = amvhVar2;
                if (dpejVar != null) {
                    this.e = dpejVar;
                    return;
                }
                throw new NullPointerException("Null delayCategory");
            }
            throw new NullPointerException("Null endWaypoint");
        }
        throw new NullPointerException("Null startWaypoint");
    }

    @Override // defpackage.yzq
    public final String a() {
        return this.a;
    }

    @Override // defpackage.yzq
    public final akrk b() {
        return this.b;
    }

    @Override // defpackage.yzq
    public final amvh c() {
        return this.c;
    }

    @Override // defpackage.yzq
    public final amvh d() {
        return this.d;
    }

    @Override // defpackage.yzq
    public final dpej e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yzq) {
            yzq yzqVar = (yzq) obj;
            if (this.a.equals(yzqVar.a()) && this.b.equals(yzqVar.b()) && this.c.equals(yzqVar.c()) && this.d.equals(yzqVar.d()) && this.e.equals(yzqVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 90 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("DrivingLegDescription{etaString=");
        sb.append(str);
        sb.append(", polyline=");
        sb.append(valueOf);
        sb.append(", startWaypoint=");
        sb.append(valueOf2);
        sb.append(", endWaypoint=");
        sb.append(valueOf3);
        sb.append(", delayCategory=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
