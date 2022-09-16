package defpackage;
/* compiled from: PG */
/* renamed from: aflt  reason: default package */
/* loaded from: classes2.dex */
public final class aflt implements Runnable {
    final /* synthetic */ dvct a;
    final /* synthetic */ dvcx b;
    final /* synthetic */ aflu c;

    public aflt(aflu afluVar, dvct dvctVar, dvcx dvcxVar) {
        this.c = afluVar;
        this.a = dvctVar;
        this.b = dvcxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.a().i(this.a, this.b);
    }
}
