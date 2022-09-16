package defpackage;
/* compiled from: PG */
/* renamed from: abui  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abui implements Runnable {
    public final /* synthetic */ abus a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ abui(abus abusVar, int i) {
        this.a = abusVar;
        this.b = i;
    }

    public /* synthetic */ abui(abus abusVar, int i, int i2) {
        this.c = i2;
        this.a = abusVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            abus abusVar = this.a;
            int i = this.b;
            abtu abtuVar = abusVar.n;
            if (abtuVar == null) {
                return;
            }
            abtuVar.a(i);
            return;
        }
        abus abusVar2 = this.a;
        int i2 = this.b;
        abxj abxjVar = abusVar2.B;
        if (abxjVar == null) {
            return;
        }
        abxjVar.a(i2);
        abusVar2.B = null;
    }
}
