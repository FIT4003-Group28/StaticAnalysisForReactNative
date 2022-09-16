package defpackage;
/* compiled from: PG */
/* renamed from: ibt  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ibt implements Runnable {
    public final /* synthetic */ ico a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ artv d;
    private final /* synthetic */ int e;

    public /* synthetic */ ibt(ico icoVar, long j, long j2, artv artvVar) {
        this.a = icoVar;
        this.b = j;
        this.c = j2;
        this.d = artvVar;
    }

    public /* synthetic */ ibt(ico icoVar, long j, long j2, artv artvVar, int i) {
        this.e = i;
        this.a = icoVar;
        this.b = j;
        this.c = j2;
        this.d = artvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e == 0) {
            ico icoVar = this.a;
            long j = this.b;
            long j2 = this.c;
            artv artvVar = this.d;
            icoVar.bg.f(j);
            icoVar.aU(j2, artvVar, j);
            return;
        }
        ico icoVar2 = this.a;
        long j3 = this.b;
        long j4 = this.c;
        artv artvVar2 = this.d;
        icoVar2.bg.f(j3);
        icoVar2.aU(j4, artvVar2, j3);
    }
}
