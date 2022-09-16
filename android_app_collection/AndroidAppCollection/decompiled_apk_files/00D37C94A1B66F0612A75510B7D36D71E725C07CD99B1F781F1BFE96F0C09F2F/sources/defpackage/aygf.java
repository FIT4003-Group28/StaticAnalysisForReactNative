package defpackage;
/* compiled from: PG */
/* renamed from: aygf  reason: default package */
/* loaded from: classes2.dex */
final class aygf implements Runnable {
    final /* synthetic */ ayat a;
    final /* synthetic */ aygh b;

    public aygf(aygh ayghVar, ayat ayatVar) {
        this.b = ayghVar;
        this.a = ayatVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.c(this.a);
    }
}
