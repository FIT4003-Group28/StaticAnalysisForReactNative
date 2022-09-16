package defpackage;
/* compiled from: PG */
/* renamed from: mcz  reason: default package */
/* loaded from: classes3.dex */
public final class mcz implements abea {
    public String a = "";
    public String b = "";
    public String c = "";
    private final aadd d;

    public mcz(aadd aaddVar) {
        this.d = aaddVar;
    }

    @Override // defpackage.abea
    public final void nq(abed abedVar) {
        asxp asxpVar = this.d.a().e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        String str = asxpVar.aY;
        asxp asxpVar2 = this.d.a().e;
        if (asxpVar2 == null) {
            asxpVar2 = asxp.a;
        }
        String str2 = asxpVar2.aZ;
        if (!str.isEmpty() || !str2.isEmpty()) {
            abedVar.x = this.a;
            abedVar.y = this.b;
            abedVar.z = this.c;
            this.a = "";
            this.b = "";
            this.c = "";
        }
    }
}
