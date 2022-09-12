package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dymy  reason: default package */
/* loaded from: classes6.dex */
public final class dymy implements Runnable {
    final /* synthetic */ dysl a;

    public dymy(dysl dyslVar) {
        this.a = dyslVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dyqy dyqyVar = (dyqy) this.a;
        dbsk.m(dyqyVar.a.A.get(), "Channel must have been shut down");
        dyqyVar.a.C = true;
        dyqyVar.a.i(false);
        dyqyVar.a.h();
        dyqyVar.a.t();
    }
}
