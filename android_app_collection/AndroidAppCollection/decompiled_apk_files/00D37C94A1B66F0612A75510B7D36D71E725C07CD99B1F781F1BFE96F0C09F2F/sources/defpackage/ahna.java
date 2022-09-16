package defpackage;
/* compiled from: PG */
/* renamed from: ahna  reason: default package */
/* loaded from: classes.dex */
final class ahna implements Runnable {
    final /* synthetic */ float a;
    final /* synthetic */ ahnh b;

    public ahna(ahnh ahnhVar, float f) {
        this.b = ahnhVar;
        this.a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.j.setTextSize(0, ahmr.s(this.a));
    }
}
