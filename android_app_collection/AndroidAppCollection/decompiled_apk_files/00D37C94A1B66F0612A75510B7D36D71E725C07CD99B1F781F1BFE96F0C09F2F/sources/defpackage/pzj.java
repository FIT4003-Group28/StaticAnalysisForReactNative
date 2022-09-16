package defpackage;
/* compiled from: PG */
/* renamed from: pzj  reason: default package */
/* loaded from: classes4.dex */
public final class pzj {
    private final Object a = new Object();
    private qcg b;

    public final qcg a() {
        qcg qcgVar;
        synchronized (this.a) {
            qcgVar = this.b;
        }
        return qcgVar;
    }

    public final void b(qcg qcgVar) {
        synchronized (this.a) {
            this.b = qcgVar;
        }
    }
}
