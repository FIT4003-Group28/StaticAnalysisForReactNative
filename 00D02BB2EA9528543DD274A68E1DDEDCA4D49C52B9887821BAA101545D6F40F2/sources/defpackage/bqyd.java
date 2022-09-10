package defpackage;
/* compiled from: PG */
/* renamed from: bqyd  reason: default package */
/* loaded from: classes4.dex */
public final class bqyd implements Runnable {
    final /* synthetic */ bqyf a;

    public bqyd(bqyf bqyfVar) {
        this.a = bqyfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.i.a(new bqyc(this), bvrj.BACKGROUND_THREADPOOL, 4372L);
    }
}
