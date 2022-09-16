package defpackage;
/* compiled from: PG */
/* renamed from: cxd  reason: default package */
/* loaded from: classes3.dex */
public final class cxd extends axiw {
    private cwr a;

    public cxd() {
        super("trak");
    }

    public final cwh l() {
        for (cvs cvsVar : i()) {
            if (cvsVar instanceof cwh) {
                return (cwh) cvsVar;
            }
        }
        return null;
    }

    public final cwr m() {
        cwj n;
        cwr cwrVar = this.a;
        if (cwrVar != null) {
            return cwrVar;
        }
        cwh l = l();
        if (l == null || (n = l.n()) == null) {
            return null;
        }
        cwr l2 = n.l();
        this.a = l2;
        return l2;
    }

    public final cxe n() {
        for (cvs cvsVar : i()) {
            if (cvsVar instanceof cxe) {
                return (cxe) cvsVar;
            }
        }
        return null;
    }
}
