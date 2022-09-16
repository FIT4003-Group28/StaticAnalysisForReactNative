package defpackage;
/* compiled from: PG */
/* renamed from: aylo  reason: default package */
/* loaded from: classes2.dex */
final class aylo implements Runnable {
    final /* synthetic */ aylt a;
    final /* synthetic */ ayls b;

    public aylo(ayls aylsVar, aylt ayltVar) {
        this.b = aylsVar;
        this.a = ayltVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.t(this.a);
    }
}
