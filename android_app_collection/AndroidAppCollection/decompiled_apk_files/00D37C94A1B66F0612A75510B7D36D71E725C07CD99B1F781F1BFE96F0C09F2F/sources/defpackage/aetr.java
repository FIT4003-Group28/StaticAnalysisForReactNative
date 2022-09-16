package defpackage;
/* compiled from: PG */
/* renamed from: aetr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aetr implements Runnable {
    public final /* synthetic */ aett a;
    public final /* synthetic */ long b;
    private final /* synthetic */ int c;

    public /* synthetic */ aetr(aett aettVar, long j) {
        this.a = aettVar;
        this.b = j;
    }

    public /* synthetic */ aetr(aett aettVar, long j, int i) {
        this.c = i;
        this.a = aettVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            aett aettVar = this.a;
            aettVar.a.s(this.b);
        } else if (i == 1) {
            aett aettVar2 = this.a;
            aettVar2.a.o(this.b);
        } else if (i == 2) {
            aett aettVar3 = this.a;
            aettVar3.a.t(this.b);
        } else if (i == 3) {
            aett aettVar4 = this.a;
            aettVar4.a.u(this.b);
        } else {
            aett aettVar5 = this.a;
            aettVar5.a.y(this.b);
        }
    }
}
