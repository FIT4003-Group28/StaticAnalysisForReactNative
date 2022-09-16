package defpackage;
/* compiled from: PG */
/* renamed from: ayfh  reason: default package */
/* loaded from: classes2.dex */
final class ayfh implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ ayfr b;

    public ayfh(ayfr ayfrVar, Object obj) {
        this.b = ayfrVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.e(this.a);
    }
}
