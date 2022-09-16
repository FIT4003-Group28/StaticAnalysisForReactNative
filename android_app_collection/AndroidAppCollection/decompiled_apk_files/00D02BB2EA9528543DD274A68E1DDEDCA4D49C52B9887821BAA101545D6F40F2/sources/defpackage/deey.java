package defpackage;
/* compiled from: PG */
/* renamed from: deey  reason: default package */
/* loaded from: classes6.dex */
final class deey implements Runnable {
    final /* synthetic */ dccr a;
    final /* synthetic */ defa b;

    public deey(defa defaVar, dccr dccrVar) {
        this.b = defaVar;
        this.a = dccrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.h(this.a);
    }
}
