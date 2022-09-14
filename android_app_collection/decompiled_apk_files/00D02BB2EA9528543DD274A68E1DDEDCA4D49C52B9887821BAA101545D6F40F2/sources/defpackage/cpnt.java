package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpnt  reason: default package */
/* loaded from: classes5.dex */
public final class cpnt implements Runnable {
    final /* synthetic */ cpnv a;

    public cpnt(cpnv cpnvVar) {
        this.a = cpnvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e().setVisibility(8);
        this.a.d().setVisibility(8);
    }
}
