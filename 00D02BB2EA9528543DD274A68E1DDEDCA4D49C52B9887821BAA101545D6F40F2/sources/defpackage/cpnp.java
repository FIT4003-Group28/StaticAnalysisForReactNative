package defpackage;
/* compiled from: PG */
/* renamed from: cpnp  reason: default package */
/* loaded from: classes5.dex */
final class cpnp implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ cpnv b;

    public cpnp(cpnv cpnvVar, String str) {
        this.b = cpnvVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.d().setText(this.a);
        this.b.d().setVisibility(0);
    }
}
