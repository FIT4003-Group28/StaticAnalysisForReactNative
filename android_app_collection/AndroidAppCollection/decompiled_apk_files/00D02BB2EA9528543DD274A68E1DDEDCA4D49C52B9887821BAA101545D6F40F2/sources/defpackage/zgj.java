package defpackage;
/* compiled from: PG */
/* renamed from: zgj  reason: default package */
/* loaded from: classes7.dex */
final class zgj extends zhd {
    private final cqtd a;
    private final cqsn b;
    private final cqsn c;
    private final cjtd d;
    private final cjtd e;
    private final Runnable f;
    private final Runnable g;

    public zgj(@dzsi cqtd cqtdVar, @dzsi cqsn cqsnVar, @dzsi cqsn cqsnVar2, cjtd cjtdVar, @dzsi cjtd cjtdVar2, Runnable runnable, Runnable runnable2) {
        this.a = cqtdVar;
        this.b = cqsnVar;
        this.c = cqsnVar2;
        this.d = cjtdVar;
        this.e = cjtdVar2;
        this.f = runnable;
        this.g = runnable2;
    }

    @Override // defpackage.zhd, defpackage.zbl
    @dzsi
    public cqtd c() {
        return this.a;
    }

    @Override // defpackage.zhd, defpackage.zbl
    @dzsi
    public cqsn d() {
        return this.b;
    }

    @Override // defpackage.zhd, defpackage.zbl
    @dzsi
    public cqsn e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        cjtd cjtdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zhd) {
            zhd zhdVar = (zhd) obj;
            cqtd cqtdVar = this.a;
            if (cqtdVar != null ? cqtdVar.equals(zhdVar.c()) : zhdVar.c() == null) {
                cqsn cqsnVar = this.b;
                if (cqsnVar != null ? cqsnVar.equals(zhdVar.d()) : zhdVar.d() == null) {
                    cqsn cqsnVar2 = this.c;
                    if (cqsnVar2 != null ? cqsnVar2.equals(zhdVar.e()) : zhdVar.e() == null) {
                        if (this.d.equals(zhdVar.s()) && ((cjtdVar = this.e) != null ? cjtdVar.equals(zhdVar.f()) : zhdVar.f() == null) && this.f.equals(zhdVar.g()) && this.g.equals(zhdVar.h())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.zhd, defpackage.zbl
    @dzsi
    public cjtd f() {
        return this.e;
    }

    @Override // defpackage.zhd
    public final Runnable g() {
        return this.f;
    }

    @Override // defpackage.zhd
    public final Runnable h() {
        return this.g;
    }

    public int hashCode() {
        cqtd cqtdVar = this.a;
        int i = 0;
        int hashCode = ((cqtdVar == null ? 0 : cqtdVar.hashCode()) ^ 1000003) * 1000003;
        cqsn cqsnVar = this.b;
        int hashCode2 = (hashCode ^ (cqsnVar == null ? 0 : cqsnVar.hashCode())) * 1000003;
        cqsn cqsnVar2 = this.c;
        int hashCode3 = (((hashCode2 ^ (cqsnVar2 == null ? 0 : cqsnVar2.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003;
        cjtd cjtdVar = this.e;
        if (cjtdVar != null) {
            i = cjtdVar.hashCode();
        }
        return ((((hashCode3 ^ i) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    @Override // defpackage.zhd, defpackage.zbq
    public cjtd s() {
        return this.d;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 137 + length2 + length3 + length4 + length5 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("DirectionsClickableNudgeBarViewModelImpl{icon=");
        sb.append(valueOf);
        sb.append(", title=");
        sb.append(valueOf2);
        sb.append(", description=");
        sb.append(valueOf3);
        sb.append(", barUe3Params=");
        sb.append(valueOf4);
        sb.append(", dismissUe3Params=");
        sb.append(valueOf5);
        sb.append(", clickCallback=");
        sb.append(valueOf6);
        sb.append(", dismissCallback=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }
}
