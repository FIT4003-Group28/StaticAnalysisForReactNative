package defpackage;
/* compiled from: PG */
/* renamed from: ykp  reason: default package */
/* loaded from: classes4.dex */
final class ykp implements Runnable {
    final /* synthetic */ ykr a;

    public ykp(ykr ykrVar) {
        this.a = ykrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.h();
        this.a.a.open();
    }
}
