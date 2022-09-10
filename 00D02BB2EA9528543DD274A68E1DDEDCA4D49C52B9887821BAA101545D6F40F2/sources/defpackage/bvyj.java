package defpackage;
/* compiled from: PG */
/* renamed from: bvyj  reason: default package */
/* loaded from: classes4.dex */
final class bvyj extends akvn<aktj<?, ?>> {
    final /* synthetic */ bvyk a;
    private final dsqa b;

    public bvyj(bvyk bvykVar) {
        this.a = bvykVar;
        dsqa a = dsqa.a();
        this.b = a;
        a.e(dmdn.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        bvrj.UI_THREAD.c();
        if (!(obj.k() instanceof dmpn)) {
            return;
        }
        dmpn dmpnVar = (dmpn) obj.k();
        dsqv<dmpn, dmdn> dsqvVar = dmdn.c;
        dmpnVar.f(dsqvVar);
        if (!dmpnVar.V.k(dsqvVar.d)) {
            return;
        }
        dsqv<dmpn, dmdn> dsqvVar2 = dmdn.c;
        dmpnVar.f(dsqvVar2);
        Object l = dmpnVar.V.l(dsqvVar2.d);
        dspd dspdVar = ((dmdn) (l == null ? dsqvVar2.b : dsqvVar2.b(l))).a;
        bvws bvwsVar = this.a.e;
        dmcu bZ = dmcv.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmcv dmcvVar = (dmcv) bZ.b;
        dspdVar.getClass();
        dmcvVar.a |= 1;
        dmcvVar.b = dspdVar;
        bvwsVar.b(bZ.bK(), dmcv.d);
    }
}
