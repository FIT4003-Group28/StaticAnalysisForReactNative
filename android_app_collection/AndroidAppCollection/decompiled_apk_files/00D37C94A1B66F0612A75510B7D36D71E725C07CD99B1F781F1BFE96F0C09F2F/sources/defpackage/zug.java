package defpackage;
/* compiled from: PG */
/* renamed from: zug  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zug implements Runnable {
    public final /* synthetic */ zuk a;
    private final /* synthetic */ int b;

    public /* synthetic */ zug(zuk zukVar, int i) {
        this.b = i;
        this.a = zukVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.p();
        } else if (i == 1) {
            zuk zukVar = this.a;
            zukVar.h(zukVar.c);
        } else {
            this.a.p();
        }
    }
}
