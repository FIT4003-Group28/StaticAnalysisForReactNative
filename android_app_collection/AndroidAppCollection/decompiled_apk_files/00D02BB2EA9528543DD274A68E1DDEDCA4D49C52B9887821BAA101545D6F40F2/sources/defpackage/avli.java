package defpackage;
/* compiled from: PG */
/* renamed from: avli  reason: default package */
/* loaded from: classes3.dex */
public final class avli {
    public final avlb a = avlc.g.bZ();
    private final avkz b = avla.d.bZ();

    public final avlj a() {
        avkz avkzVar = this.b;
        int i = ((avla) avkzVar.b).a;
        if ((i & 2) != 0 && (i & 1) != 0) {
            avlb avlbVar = this.a;
            if ((((avlc) avlbVar.b).a & 2) != 0) {
                if (avlbVar.c) {
                    avlbVar.bF();
                    avlbVar.c = false;
                }
                avlc avlcVar = (avlc) avlbVar.b;
                avla bK = avkzVar.bK();
                bK.getClass();
                avlcVar.b = bK;
                avlcVar.a |= 1;
                return new avlj(avlbVar.bK());
            }
        }
        throw new IllegalStateException("Cannot build SyncState without an Owner, OfflineInstanceId or UpdateState.");
    }

    public final void b(boolean z) {
        avlb avlbVar = this.a;
        if (avlbVar.c) {
            avlbVar.bF();
            avlbVar.c = false;
        }
        avlc avlcVar = (avlc) avlbVar.b;
        avlc avlcVar2 = avlc.g;
        avlcVar.a |= 4;
        avlcVar.d = z;
    }

    public final void c(boolean z) {
        avlb avlbVar = this.a;
        if (avlbVar.c) {
            avlbVar.bF();
            avlbVar.c = false;
        }
        avlc avlcVar = (avlc) avlbVar.b;
        avlc avlcVar2 = avlc.g;
        avlcVar.a |= 16;
        avlcVar.f = z;
    }

    public final void d(avze avzeVar) {
        avkz avkzVar = this.b;
        dlrl g = avzeVar.g();
        if (avkzVar.c) {
            avkzVar.bF();
            avkzVar.c = false;
        }
        avla avlaVar = (avla) avkzVar.b;
        avla avlaVar2 = avla.d;
        g.getClass();
        avlaVar.b = g;
        avlaVar.a |= 1;
    }

    public final void e(dlsw dlswVar) {
        avkz avkzVar = this.b;
        if (avkzVar.c) {
            avkzVar.bF();
            avkzVar.c = false;
        }
        avla avlaVar = (avla) avkzVar.b;
        avla avlaVar2 = avla.d;
        dlswVar.getClass();
        avlaVar.c = dlswVar;
        avlaVar.a |= 2;
    }

    public final void f(dlua dluaVar) {
        avlb avlbVar = this.a;
        if (avlbVar.c) {
            avlbVar.bF();
            avlbVar.c = false;
        }
        avlc avlcVar = (avlc) avlbVar.b;
        avlc avlcVar2 = avlc.g;
        dluaVar.getClass();
        avlcVar.c = dluaVar;
        avlcVar.a |= 2;
    }
}
