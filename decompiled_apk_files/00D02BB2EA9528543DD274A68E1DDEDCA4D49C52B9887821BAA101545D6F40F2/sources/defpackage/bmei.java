package defpackage;
/* compiled from: PG */
/* renamed from: bmei  reason: default package */
/* loaded from: classes3.dex */
final class bmei implements Runnable {
    final /* synthetic */ ceet a;
    final /* synthetic */ String b;

    public bmei(ceet ceetVar, String str) {
        this.a = ceetVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.i(this.b);
    }
}
