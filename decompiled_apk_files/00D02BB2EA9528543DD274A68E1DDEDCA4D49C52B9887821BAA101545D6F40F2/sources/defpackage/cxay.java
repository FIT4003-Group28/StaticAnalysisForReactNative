package defpackage;
/* compiled from: PG */
/* renamed from: cxay  reason: default package */
/* loaded from: classes.dex */
public final class cxay implements Runnable {
    final /* synthetic */ cxbe a;

    public cxay(cxbe cxbeVar) {
        this.a = cxbeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cxbe cxbeVar = this.a;
        cxbeVar.b = cxbeVar.j.b != null;
    }
}
