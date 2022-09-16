package defpackage;
/* compiled from: PG */
/* renamed from: abve  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abve implements Runnable {
    public final /* synthetic */ abvj a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    private final /* synthetic */ int d;

    public /* synthetic */ abve(abvj abvjVar, int i, String str) {
        this.a = abvjVar;
        this.b = i;
        this.c = str;
    }

    public /* synthetic */ abve(abvj abvjVar, int i, String str, int i2) {
        this.d = i2;
        this.a = abvjVar;
        this.b = i;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            abvj abvjVar = this.a;
            int i = this.b;
            String str = this.c;
            abyb abybVar = abvjVar.A;
            if (abybVar == null) {
                return;
            }
            abybVar.a(i, str, null);
            return;
        }
        abvj abvjVar2 = this.a;
        int i2 = this.b;
        String str2 = this.c;
        abyb abybVar2 = abvjVar2.A;
        if (abybVar2 == null) {
            return;
        }
        abyk abykVar = abybVar2.b;
        if (!abykVar.U) {
            return;
        }
        abykVar.e.g(i2, str2);
    }
}
