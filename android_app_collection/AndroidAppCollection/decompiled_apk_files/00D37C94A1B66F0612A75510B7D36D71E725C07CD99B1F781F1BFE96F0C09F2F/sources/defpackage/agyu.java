package defpackage;
/* compiled from: PG */
/* renamed from: agyu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agyu implements Runnable {
    public final /* synthetic */ agyy a;
    public final /* synthetic */ agqz b;
    private final /* synthetic */ int c;

    public /* synthetic */ agyu(agyy agyyVar, agqz agqzVar) {
        this.a = agyyVar;
        this.b = agqzVar;
    }

    public /* synthetic */ agyu(agyy agyyVar, agqz agqzVar, int i) {
        this.c = i;
        this.a = agyyVar;
        this.b = agqzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            agyy agyyVar = this.a;
            agyyVar.a.f(this.b);
        } else if (i == 1) {
            agyy agyyVar2 = this.a;
            agyyVar2.a.e(this.b);
        } else if (i == 2) {
            agyy agyyVar3 = this.a;
            agyyVar3.a.h(this.b);
        } else if (i == 3) {
            agyy agyyVar4 = this.a;
            agyyVar4.a.i(this.b);
        } else if (i == 4) {
            agyy agyyVar5 = this.a;
            agyyVar5.a.j(this.b);
        } else if (i == 5) {
            agyy agyyVar6 = this.a;
            agyyVar6.a.k(this.b);
        } else {
            agyy agyyVar7 = this.a;
            agyyVar7.a.m(this.b);
        }
    }
}
