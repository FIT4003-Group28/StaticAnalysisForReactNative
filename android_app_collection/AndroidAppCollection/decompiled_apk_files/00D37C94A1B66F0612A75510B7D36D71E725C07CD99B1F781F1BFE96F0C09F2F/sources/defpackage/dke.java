package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dke  reason: default package */
/* loaded from: classes3.dex */
public final class dke implements Runnable {
    final /* synthetic */ diz a;
    private final /* synthetic */ int b;

    public dke(diz dizVar) {
        this.a = dizVar;
    }

    public dke(diz dizVar, int i) {
        this.b = i;
        this.a = dizVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            dlc.x(this.a);
        } else {
            this.a.k();
        }
    }
}
