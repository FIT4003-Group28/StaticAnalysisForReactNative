package defpackage;
/* compiled from: PG */
/* renamed from: dynq  reason: default package */
/* loaded from: classes6.dex */
final class dynq implements Runnable {
    final /* synthetic */ dynu a;

    public dynq(dynu dynuVar) {
        this.a = dynuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.f();
    }
}
