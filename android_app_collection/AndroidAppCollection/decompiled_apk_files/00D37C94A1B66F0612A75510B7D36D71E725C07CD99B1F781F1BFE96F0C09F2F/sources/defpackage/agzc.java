package defpackage;
/* compiled from: PG */
/* renamed from: agzc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agzc implements Runnable {
    public final /* synthetic */ agzh a;
    public final /* synthetic */ agqz b;
    private final /* synthetic */ int c;

    public /* synthetic */ agzc(agzh agzhVar, agqz agqzVar) {
        this.a = agzhVar;
        this.b = agqzVar;
    }

    public /* synthetic */ agzc(agzh agzhVar, agqz agqzVar, int i) {
        this.c = i;
        this.a = agzhVar;
        this.b = agqzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            agzh agzhVar = this.a;
            agqz agqzVar = this.b;
            if (!agxg.ae(agqzVar.f)) {
                return;
            }
            if (agqzVar.b == avkl.TRANSFER_STATE_COMPLETE) {
                ((agrn) agzhVar.f.get()).A(agqzVar);
                return;
            } else if (agqzVar.b == avkl.TRANSFER_STATE_FAILED) {
                ((agrn) agzhVar.f.get()).B(agqzVar);
                return;
            } else if (agqzVar.b != avkl.TRANSFER_STATE_TRANSFER_IN_QUEUE || !agxg.ai(agqzVar)) {
                return;
            } else {
                agzhVar.n(agqzVar, false);
                return;
            }
        }
        agzh agzhVar2 = this.a;
        ((agrn) agzhVar2.f.get()).z(this.b);
    }
}
