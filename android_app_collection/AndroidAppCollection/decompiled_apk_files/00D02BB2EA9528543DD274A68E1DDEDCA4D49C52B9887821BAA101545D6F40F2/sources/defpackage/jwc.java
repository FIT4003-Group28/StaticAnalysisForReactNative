package defpackage;
/* compiled from: PG */
/* renamed from: jwc  reason: default package */
/* loaded from: classes7.dex */
final class jwc implements crzp<Boolean> {
    final /* synthetic */ jwf a;

    public jwc(jwf jwfVar) {
        this.a = jwfVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<Boolean> crzmVar) {
        Boolean l = crzmVar.l();
        dbsk.s(l);
        boolean booleanValue = l.booleanValue();
        jwf jwfVar = this.a;
        if (jwfVar.o == booleanValue) {
            return;
        }
        jwfVar.o = booleanValue;
        if (!booleanValue) {
            dukx dukxVar = jwfVar.d.getCarParameters().e;
            if (dukxVar == null) {
                dukxVar = dukx.c;
            }
            jwfVar.p = dukxVar.b;
            this.a.n = false;
        }
        if (this.a.m.isEmpty()) {
            return;
        }
        int b = this.a.l.b();
        jwf jwfVar2 = this.a;
        jwfVar2.l(Math.max(0, b + jwfVar2.q));
    }
}
