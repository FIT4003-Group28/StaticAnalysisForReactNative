package defpackage;
/* compiled from: PG */
/* renamed from: zhu  reason: default package */
/* loaded from: classes4.dex */
public final class zhu implements ayot {
    final /* synthetic */ zhv a;

    public zhu(zhv zhvVar) {
        this.a = zhvVar;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.a.e(th);
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        this.a.o(obj);
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        zhv zhvVar = this.a;
        zhvVar.a.set(aypgVar);
        if (zhvVar.isCancelled()) {
            zhvVar.d();
        }
    }
}
