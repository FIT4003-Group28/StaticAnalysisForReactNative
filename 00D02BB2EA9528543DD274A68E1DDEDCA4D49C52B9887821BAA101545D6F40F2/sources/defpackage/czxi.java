package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czxi  reason: default package */
/* loaded from: classes5.dex */
public final class czxi implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ czxs b;

    public czxi(czxs czxsVar, int i) {
        this.b = czxsVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.n(this.a);
    }
}
