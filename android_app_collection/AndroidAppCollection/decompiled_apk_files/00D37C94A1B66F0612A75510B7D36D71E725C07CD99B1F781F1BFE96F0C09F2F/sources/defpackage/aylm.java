package defpackage;
/* compiled from: PG */
/* renamed from: aylm  reason: default package */
/* loaded from: classes2.dex */
final class aylm implements Runnable {
    final /* synthetic */ ayat a;
    final /* synthetic */ ayls b;

    public aylm(ayls aylsVar, ayat ayatVar) {
        this.b = aylsVar;
        this.a = ayatVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.u.c(this.a);
    }
}
