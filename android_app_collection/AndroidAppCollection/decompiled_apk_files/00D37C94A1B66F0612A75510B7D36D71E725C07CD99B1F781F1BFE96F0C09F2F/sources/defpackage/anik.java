package defpackage;
/* compiled from: PG */
/* renamed from: anik  reason: default package */
/* loaded from: classes.dex */
final class anik implements Runnable {
    final /* synthetic */ amub a;
    final /* synthetic */ anil b;

    public anik(anil anilVar, amub amubVar) {
        this.b = anilVar;
        this.a = amubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.i(this.a);
    }
}
