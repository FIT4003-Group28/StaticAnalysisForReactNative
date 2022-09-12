package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aap  reason: default package */
/* loaded from: classes2.dex */
public final class aap implements Runnable {
    final /* synthetic */ aaq a;

    public aap(aaq aaqVar) {
        this.a = aaqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zh zhVar = this.a.e;
        if (zhVar == null || !od.ak(zhVar) || this.a.e.getCount() <= this.a.e.getChildCount()) {
            return;
        }
        int childCount = this.a.e.getChildCount();
        aaq aaqVar = this.a;
        if (childCount > aaqVar.k) {
            return;
        }
        aaqVar.q.setInputMethodMode(2);
        this.a.MY();
    }
}
