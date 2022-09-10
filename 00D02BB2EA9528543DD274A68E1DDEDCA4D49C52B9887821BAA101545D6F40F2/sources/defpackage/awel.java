package defpackage;
/* compiled from: PG */
/* renamed from: awel  reason: default package */
/* loaded from: classes3.dex */
final class awel implements Runnable {
    final /* synthetic */ awet a;

    public awel(awet awetVar) {
        this.a = awetVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.n();
        this.a.o();
        this.a.h.invalidate();
    }
}
