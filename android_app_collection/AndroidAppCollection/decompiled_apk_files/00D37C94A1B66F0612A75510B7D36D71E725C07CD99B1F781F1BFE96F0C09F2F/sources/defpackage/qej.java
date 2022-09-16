package defpackage;
/* compiled from: PG */
/* renamed from: qej  reason: default package */
/* loaded from: classes4.dex */
public final class qej {
    public final dpa a;
    public final dpa b;
    private qds c;

    public qej(dpa dpaVar, dpa dpaVar2) {
        this.a = dpaVar;
        this.b = dpaVar2;
    }

    public final synchronized qds a(qdr qdrVar) {
        qds qdsVar = this.c;
        if (qdsVar != null) {
            return qdsVar;
        }
        qds qdsVar2 = new qds(qdrVar);
        this.c = qdsVar2;
        return qdsVar2;
    }
}
