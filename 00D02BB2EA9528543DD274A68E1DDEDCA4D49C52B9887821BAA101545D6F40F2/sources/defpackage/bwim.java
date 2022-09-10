package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bwim  reason: default package */
/* loaded from: classes4.dex */
public final class bwim extends itb {
    public static final dcep<? extends ddhp> a = dcep.E(dtyi.ck, dtyi.cu, dtyi.cK, dtyi.cl);
    public static final long b = TimeUnit.MINUTES.toMillis(10);
    public final gga d;
    public final btrm e;
    public final cjqy f;
    public final ania g;
    public final ckcw h;
    public final efc i;
    public final dxio<ascb> j;
    public final dxio<begg> k;
    public final dxio<axwy> o;
    public final dxio<brba> p;
    public final dxio<qbt> q;
    public final cqat r;
    public final dbty<Boolean> s;
    public final cklq t;
    public boolean c = true;
    final bwil u = new bwil(this);

    public bwim(gga ggaVar, btrm btrmVar, cjqy cjqyVar, ania aniaVar, ckcw ckcwVar, efc efcVar, dxio<ascb> dxioVar, dxio<begg> dxioVar2, dxio<axwy> dxioVar3, dxio<brba> dxioVar4, dxio<qbt> dxioVar5, cklq cklqVar, cqat cqatVar, dbty<Boolean> dbtyVar) {
        this.d = ggaVar;
        this.e = btrmVar;
        this.f = cjqyVar;
        this.g = aniaVar;
        this.h = ckcwVar;
        this.i = efcVar;
        this.j = dxioVar;
        this.k = dxioVar2;
        this.o = dxioVar3;
        this.p = dxioVar4;
        this.q = dxioVar5;
        this.t = cklqVar;
        this.r = cqatVar;
        this.s = dbtyVar;
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        btrm btrmVar = this.e;
        dceq a2 = dcet.a();
        a2.b(alho.class, new bwin(0, alho.class, this, bvrj.UI_THREAD));
        a2.b(alhj.class, new bwin(1, alhj.class, this, bvrj.UI_THREAD));
        a2.b(alie.class, new bwin(2, alie.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a2.a());
        this.f.C(this.u);
    }

    @Override // defpackage.itb
    public final void Po() {
        btrm btrmVar = this.e;
        if (btrmVar != null) {
            btrmVar.a(this);
        }
        this.f.D(this.u);
        super.Po();
    }

    @dzsi
    public final brln e() {
        brlk G = this.p.a().G();
        if (G == null) {
            return null;
        }
        return G.d();
    }
}
