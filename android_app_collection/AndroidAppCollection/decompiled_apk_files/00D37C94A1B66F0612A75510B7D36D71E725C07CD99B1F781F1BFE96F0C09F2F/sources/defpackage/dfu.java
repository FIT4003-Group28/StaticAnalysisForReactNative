package defpackage;
/* compiled from: PG */
/* renamed from: dfu  reason: default package */
/* loaded from: classes3.dex */
final class dfu implements Runnable {
    final /* synthetic */ dfv a;

    public dfu(dfv dfvVar) {
        this.a = dfvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(System.nanoTime());
    }
}
