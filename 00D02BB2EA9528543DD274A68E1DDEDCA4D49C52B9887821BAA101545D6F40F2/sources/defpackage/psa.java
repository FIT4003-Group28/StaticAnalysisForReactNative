package defpackage;
/* compiled from: PG */
/* renamed from: psa  reason: default package */
/* loaded from: classes7.dex */
public final class psa<T> extends btrh<T> {
    public psa(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        prx prxVar = (prx) this.a;
        srf srfVar = (srf) obj;
        synchronized (prxVar) {
        }
        qbn qbnVar = srfVar.a;
        qbm qbmVar = srfVar.b;
        prxVar.l.b(srfVar);
        prxVar.h(qbnVar, qbmVar, true);
    }
}
