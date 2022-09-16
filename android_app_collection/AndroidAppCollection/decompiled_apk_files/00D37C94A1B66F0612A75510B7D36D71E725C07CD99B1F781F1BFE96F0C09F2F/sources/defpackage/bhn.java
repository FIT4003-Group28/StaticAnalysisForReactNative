package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bhn  reason: default package */
/* loaded from: classes2.dex */
public final class bhn implements Runnable {
    final /* synthetic */ bho a;
    private final /* synthetic */ int b;

    public bhn(bho bhoVar) {
        this.a = bhoVar;
    }

    public bhn(bho bhoVar, int i) {
        this.b = i;
        this.a = bhoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            bho bhoVar = this.a;
            bhu bhuVar = bhoVar.h;
            if (bhuVar.d != bhoVar) {
                return;
            }
            bhuVar.k();
            return;
        }
        bho bhoVar2 = this.a;
        int size = bhoVar2.g.size();
        for (int i = 0; i < size; i++) {
            ((ku) bhoVar2.g.valueAt(i)).i(null, null);
        }
        bhoVar2.g.clear();
    }
}
