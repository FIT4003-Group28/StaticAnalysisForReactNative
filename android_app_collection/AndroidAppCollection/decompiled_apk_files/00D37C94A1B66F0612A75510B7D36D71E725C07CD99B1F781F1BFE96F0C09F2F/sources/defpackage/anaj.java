package defpackage;
/* compiled from: PG */
/* renamed from: anaj  reason: default package */
/* loaded from: classes.dex */
final class anaj implements Runnable {
    final /* synthetic */ anai a;
    final /* synthetic */ anak b;

    public anaj(anak anakVar, anai anaiVar) {
        this.b = anakVar;
        this.a = anaiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.remove(this.a);
    }
}
