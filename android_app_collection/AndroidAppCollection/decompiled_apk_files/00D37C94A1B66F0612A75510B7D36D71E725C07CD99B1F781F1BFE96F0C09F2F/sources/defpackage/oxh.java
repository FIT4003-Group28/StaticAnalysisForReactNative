package defpackage;
/* compiled from: PG */
/* renamed from: oxh  reason: default package */
/* loaded from: classes4.dex */
final class oxh implements Runnable {
    final /* synthetic */ oux a;
    final /* synthetic */ oxk b;

    public oxh(oxk oxkVar, oux ouxVar) {
        this.b = oxkVar;
        this.a = ouxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.d(this.a);
    }
}
