package defpackage;
/* compiled from: PG */
/* renamed from: dyrs  reason: default package */
/* loaded from: classes6.dex */
final class dyrs implements Runnable {
    final /* synthetic */ dysz a;

    public dyrs(dysz dyszVar) {
        this.a = dyszVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(dyfl.a(dyfk.SHUTDOWN));
    }
}
