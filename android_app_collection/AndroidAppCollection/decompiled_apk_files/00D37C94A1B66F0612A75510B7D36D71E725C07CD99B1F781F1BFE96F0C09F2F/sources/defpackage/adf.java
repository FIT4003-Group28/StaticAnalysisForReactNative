package defpackage;
/* compiled from: PG */
/* renamed from: adf  reason: default package */
/* loaded from: classes.dex */
final class adf implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ CharSequence b;
    final /* synthetic */ adm c;

    public adf(adm admVar, int i, CharSequence charSequence) {
        this.c = admVar;
        this.a = i;
        this.b = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.o(this.a, this.b);
    }
}
