package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: rej  reason: default package */
/* loaded from: classes4.dex */
abstract class rej extends qtt {
    public rej(qsx qsxVar) {
        super(rdz.a, qsxVar);
    }

    protected abstract void b(rep repVar);

    @Override // defpackage.qtt
    protected final /* bridge */ /* synthetic */ void c(qsi qsiVar) {
        ren renVar = (ren) qsiVar;
        Context context = renVar.q;
        b((rep) renVar.D());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qtt, defpackage.qtu
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        super.n(obj);
    }
}
