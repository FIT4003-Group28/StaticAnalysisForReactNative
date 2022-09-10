package defpackage;
/* compiled from: PG */
/* renamed from: dynf  reason: default package */
/* loaded from: classes6.dex */
final class dynf implements Runnable {
    final /* synthetic */ dyfi a;
    final /* synthetic */ dynv b;

    public dynf(dynv dynvVar, dyfi dyfiVar) {
        this.b = dynvVar;
        this.a = dyfiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.d.h(this.a);
    }
}
