package defpackage;
/* compiled from: PG */
/* renamed from: ahmz  reason: default package */
/* loaded from: classes.dex */
final class ahmz implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ahnh b;

    public ahmz(ahnh ahnhVar, String str) {
        this.b = ahnhVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.j.setText(this.a);
    }
}
