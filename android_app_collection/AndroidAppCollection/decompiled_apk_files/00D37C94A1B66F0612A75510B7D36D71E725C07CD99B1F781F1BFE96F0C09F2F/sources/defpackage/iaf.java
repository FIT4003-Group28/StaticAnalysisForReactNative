package defpackage;
/* compiled from: PG */
/* renamed from: iaf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class iaf implements Runnable {
    public final /* synthetic */ iag a;
    private final /* synthetic */ int b;

    public /* synthetic */ iaf(iag iagVar) {
        this.a = iagVar;
    }

    public /* synthetic */ iaf(iag iagVar, int i) {
        this.b = i;
        this.a = iagVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            iag iagVar = this.a;
            int andSet = iagVar.b.i.getAndSet(-1);
            if (andSet < 0) {
                return;
            }
            if (iagVar.b.m.c(andSet) == 0) {
                iagVar.b.n.al(andSet + 1);
            } else {
                iagVar.b.n.al(andSet);
            }
        } else if (i == 1) {
            iag iagVar2 = this.a;
            int andSet2 = iagVar2.b.j.getAndSet(-1);
            if (andSet2 >= 0) {
                if (iagVar2.b.m.c(andSet2) != 1 || andSet2 <= 0) {
                    iagVar2.b.n.al(andSet2);
                } else {
                    iagVar2.b.n.al(andSet2 - 1);
                }
            }
            iagVar2.b.b.b();
        } else if (i == 2) {
            iag iagVar3 = this.a;
            int andSet3 = iagVar3.b.j.getAndSet(-1);
            if (andSet3 < 0) {
                return;
            }
            iagVar3.b.n.al(andSet3);
        } else {
            iag iagVar4 = this.a;
            int andSet4 = iagVar4.b.i.getAndSet(-1);
            if (andSet4 < 0) {
                return;
            }
            iagVar4.b.n.al(andSet4);
        }
    }
}
