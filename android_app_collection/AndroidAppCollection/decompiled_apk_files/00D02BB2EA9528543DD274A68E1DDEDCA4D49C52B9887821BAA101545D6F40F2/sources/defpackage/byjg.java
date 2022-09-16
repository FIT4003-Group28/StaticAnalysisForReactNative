package defpackage;
/* compiled from: PG */
/* renamed from: byjg  reason: default package */
/* loaded from: classes4.dex */
public final class byjg<T> extends btrh<T> {
    public byjg(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        byje byjeVar = (byje) this.a;
        srf srfVar = (srf) obj;
        qbn qbnVar = srfVar.a;
        qbm qbmVar = srfVar.b;
        if (!byjeVar.d || qbnVar != byjeVar.l) {
            return;
        }
        if (qbmVar.d()) {
            byjeVar.n = byjw.ERROR_OFFLINE;
        }
        if (qbmVar.o()) {
            byjeVar.m = qbmVar.n();
            byjeVar.n = byjw.SUCCESS;
        } else {
            byjeVar.n = byjw.SUCCESS;
        }
        byjeVar.a();
    }
}
