package defpackage;
/* compiled from: PG */
/* renamed from: abvm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abvm implements Runnable {
    public final /* synthetic */ abxd a;
    private final /* synthetic */ int b;

    public /* synthetic */ abvm(abxd abxdVar) {
        this.a = abxdVar;
    }

    public /* synthetic */ abvm(abxd abxdVar, int i) {
        this.b = i;
        this.a = abxdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            abxd abxdVar = this.a;
            int[] iArr = abvr.a;
            abxdVar.a();
        } else if (i == 1) {
            abxd abxdVar2 = this.a;
            int i2 = abuz.c;
            abxdVar2.a();
        } else {
            this.a.a();
        }
    }
}
