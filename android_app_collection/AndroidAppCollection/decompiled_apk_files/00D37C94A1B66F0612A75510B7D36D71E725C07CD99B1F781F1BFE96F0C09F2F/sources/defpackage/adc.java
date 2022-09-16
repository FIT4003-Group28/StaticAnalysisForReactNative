package defpackage;
/* compiled from: PG */
/* renamed from: adc  reason: default package */
/* loaded from: classes.dex */
final class adc implements Runnable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ adm b;

    public adc(adm admVar, CharSequence charSequence) {
        this.b = admVar;
        this.a = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.t().c(this.a);
    }
}
