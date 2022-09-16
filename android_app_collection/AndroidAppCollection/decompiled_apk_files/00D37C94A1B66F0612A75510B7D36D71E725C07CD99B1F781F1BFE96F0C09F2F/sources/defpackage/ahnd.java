package defpackage;
/* compiled from: PG */
/* renamed from: ahnd  reason: default package */
/* loaded from: classes.dex */
final class ahnd implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ ahnh b;

    public ahnd(ahnh ahnhVar, boolean z) {
        this.b = ahnhVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.j.setVisibility(true != this.a ? 0 : 8);
    }
}
