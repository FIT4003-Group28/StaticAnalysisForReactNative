package defpackage;
/* compiled from: PG */
/* renamed from: abvd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abvd implements Runnable {
    public final /* synthetic */ abvj a;
    public final /* synthetic */ int b;
    public final /* synthetic */ arag c;
    private final /* synthetic */ int d;

    public /* synthetic */ abvd(abvj abvjVar, int i, arag aragVar) {
        this.a = abvjVar;
        this.b = i;
        this.c = aragVar;
    }

    public /* synthetic */ abvd(abvj abvjVar, int i, arag aragVar, int i2) {
        this.d = i2;
        this.a = abvjVar;
        this.b = i;
        this.c = aragVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            abvj abvjVar = this.a;
            int i = this.b;
            arag aragVar = this.c;
            abyb abybVar = abvjVar.A;
            if (abybVar == null) {
                return;
            }
            abybVar.a(i, null, aragVar);
            return;
        }
        abvj abvjVar2 = this.a;
        int i2 = this.b;
        arag aragVar2 = this.c;
        abyb abybVar2 = abvjVar2.A;
        if (abybVar2 == null) {
            return;
        }
        abyk abykVar = abybVar2.b;
        if (!abykVar.U) {
            return;
        }
        abykVar.H = aragVar2;
        abykVar.e.h(i2, aragVar2);
    }
}
