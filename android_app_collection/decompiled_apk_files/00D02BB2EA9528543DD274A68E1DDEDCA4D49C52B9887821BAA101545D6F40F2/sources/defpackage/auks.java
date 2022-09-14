package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: auks  reason: default package */
/* loaded from: classes2.dex */
public final class auks extends aulg {
    private final dbsg<String> a;
    private final dbsg<dplx> b;
    private final List<dlhl> c;
    private final dbsg<auhw> d;
    private final aulc e;

    public auks(dbsg<String> dbsgVar, dbsg<dplx> dbsgVar2, List<dlhl> list, dbsg<auhw> dbsgVar3, aulc aulcVar) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
        this.c = list;
        this.d = dbsgVar3;
        this.e = aulcVar;
    }

    @Override // defpackage.aulg
    public final dbsg<String> a() {
        return this.a;
    }

    @Override // defpackage.aulg
    public final dbsg<dplx> b() {
        return this.b;
    }

    @Override // defpackage.aulg
    public final List<dlhl> c() {
        return this.c;
    }

    @Override // defpackage.aulg
    public final dbsg<auhw> d() {
        return this.d;
    }

    @Override // defpackage.aulg
    public final aulc e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aulg) {
            aulg aulgVar = (aulg) obj;
            if (this.a.equals(aulgVar.a()) && this.b.equals(aulgVar.b()) && this.c.equals(aulgVar.c()) && this.d.equals(aulgVar.d()) && this.e.equals(aulgVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 73 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("NotificationIntent{url=");
        sb.append(valueOf);
        sb.append(", intent=");
        sb.append(valueOf2);
        sb.append(", intentData=");
        sb.append(valueOf3);
        sb.append(", intentType=");
        sb.append(valueOf4);
        sb.append(", loggingInfo=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
