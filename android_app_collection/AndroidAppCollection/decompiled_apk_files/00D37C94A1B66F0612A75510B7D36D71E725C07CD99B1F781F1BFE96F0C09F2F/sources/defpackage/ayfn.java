package defpackage;
/* compiled from: PG */
/* renamed from: ayfn  reason: default package */
/* loaded from: classes2.dex */
final class ayfn implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ ayfq b;

    public ayfn(ayfq ayfqVar, Object obj) {
        this.b = ayfqVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.c(this.a);
    }
}
