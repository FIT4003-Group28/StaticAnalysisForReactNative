package defpackage;
/* compiled from: PG */
/* renamed from: pyb  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class pyb implements Runnable {
    public final /* synthetic */ pyj a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    private final /* synthetic */ int d;

    public /* synthetic */ pyb(pyj pyjVar, int i, long j, int i2) {
        this.d = i2;
        this.a = pyjVar;
        this.c = i;
        this.b = j;
    }

    public /* synthetic */ pyb(pyj pyjVar, long j, int i) {
        this.a = pyjVar;
        this.b = j;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            pyj pyjVar = this.a;
            long j = this.b;
            int i = this.c;
            pyk pykVar = pyjVar.b;
            int i2 = pxi.a;
            pykVar.D(j, i);
            return;
        }
        pyj pyjVar2 = this.a;
        int i3 = this.c;
        long j2 = this.b;
        pyk pykVar2 = pyjVar2.b;
        int i4 = pxi.a;
        pykVar2.m(i3, j2);
    }
}
