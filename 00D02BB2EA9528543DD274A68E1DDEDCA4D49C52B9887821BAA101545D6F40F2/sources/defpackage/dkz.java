package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dkz  reason: default package */
/* loaded from: classes6.dex */
public final class dkz implements aa<dad> {
    final /* synthetic */ dld a;

    public dkz(dld dldVar) {
        this.a = dldVar;
    }

    @Override // defpackage.aa
    public final /* bridge */ /* synthetic */ void m(dad dadVar) {
        dad dadVar2 = dadVar;
        if (dadVar2 == null) {
            return;
        }
        dld dldVar = this.a;
        if (!dldVar.v) {
            return;
        }
        boolean z = true;
        if (dadVar2.d() != 1 || !dldVar.x) {
            return;
        }
        float c = (float) dadVar2.c();
        akqq f = dadVar2.f();
        float g = akrb.g(c, dldVar.y);
        float f2 = dldVar.h.a;
        akqq akqqVar = dldVar.o;
        if (akqqVar != null && akqo.e(f, akqqVar) <= dldVar.h.b) {
            z = false;
        }
        if ((g <= f2 && !z) || !dldVar.i.c()) {
            return;
        }
        dldVar.y = c;
        dldVar.o = f;
        alaa a = alad.a();
        a.c(f);
        a.c = 17.0f;
        a.e = c;
        akyc e = akyt.e(a.a());
        e.b = 0;
        dldVar.d.q(e, new dla(dldVar));
    }
}
