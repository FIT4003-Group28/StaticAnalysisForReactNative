package defpackage;
/* compiled from: PG */
/* renamed from: aibu  reason: default package */
/* loaded from: classes2.dex */
public final class aibu {
    public static final dcqe a = dcqe.c("aibu");
    public final cqat b;
    public final bvrb c;
    public final aibg d;
    public final aibt e;
    public final aibi f;
    public final aica g;
    public final aihe<ailz, aihs> h;
    public final aihe<aimj, aiig> i;
    public final aiki j;
    public final btvo k;
    private final btpc l;
    private final aibh m;
    private final aiby n;

    public aibu(cqat cqatVar, bvrb bvrbVar, aibg aibgVar, btpc btpcVar, aihe aiheVar, aihe aiheVar2, aiki aikiVar, btvo btvoVar, aibx aibxVar, btlu btluVar, aibt aibtVar, aibk aibkVar) {
        aibq aibqVar = new aibq(this);
        this.m = aibqVar;
        aibs aibsVar = new aibs(this);
        this.n = aibsVar;
        this.b = cqatVar;
        this.c = bvrbVar;
        this.d = aibgVar;
        this.e = aibtVar;
        this.l = btpcVar;
        this.f = new aibi(btluVar, aibkVar, aibqVar);
        this.g = aibxVar.a(aibsVar);
        this.h = aiheVar;
        this.i = aiheVar2;
        this.j = aikiVar;
        this.k = btvoVar;
    }

    public final boolean a() {
        return this.f.d != null;
    }

    public final boolean b() {
        return this.f.b();
    }

    public final void c() {
        if (this.f.a()) {
            return;
        }
        this.f.c(ahvn.CANCELLED);
    }

    public final dqyd d() {
        dqyc bZ = dqyd.d.bZ();
        boolean a2 = this.l.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqyd dqydVar = (dqyd) bZ.b;
        int i = 1;
        dqydVar.a |= 1;
        dqydVar.b = a2;
        int b = this.l.b();
        if (b < 0 || b > 100) {
            i = 0;
        } else if (b != 0) {
            i = b;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqyd dqydVar2 = (dqyd) bZ.b;
        dqydVar2.a |= 2;
        dqydVar2.c = i;
        return bZ.bK();
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.f("hashCode", hashCode());
        b.b("share", this.f);
        b.b("journeySession", this.g);
        return b.toString();
    }
}
