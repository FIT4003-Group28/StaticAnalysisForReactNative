package defpackage;
/* compiled from: PG */
/* renamed from: cnrh  reason: default package */
/* loaded from: classes5.dex */
public final class cnrh implements Runnable {
    final /* synthetic */ cnri a;

    public cnrh(cnri cnriVar) {
        this.a = cnriVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cnnz cnnzVar = this.a.a.b;
        cnnzVar.h(String.valueOf(cnnzVar.getClass().getName()).concat(" disconnecting because it was signed out."));
    }
}
