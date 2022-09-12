package defpackage;
/* compiled from: PG */
/* renamed from: bmeh  reason: default package */
/* loaded from: classes3.dex */
final class bmeh implements Runnable {
    final /* synthetic */ cafi a;
    final /* synthetic */ String b;

    public bmeh(cafi cafiVar, String str) {
        this.a = cafiVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.k(this.b, null);
    }
}
