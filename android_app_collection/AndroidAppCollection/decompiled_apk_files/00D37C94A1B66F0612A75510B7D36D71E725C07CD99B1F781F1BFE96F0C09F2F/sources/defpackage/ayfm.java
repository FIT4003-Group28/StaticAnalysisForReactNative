package defpackage;
/* compiled from: PG */
/* renamed from: ayfm  reason: default package */
/* loaded from: classes2.dex */
final class ayfm implements Runnable {
    final /* synthetic */ ayat a;
    final /* synthetic */ ayfq b;

    public ayfm(ayfq ayfqVar, ayat ayatVar) {
        this.b = ayfqVar;
        this.a = ayatVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.b(this.a);
    }
}
