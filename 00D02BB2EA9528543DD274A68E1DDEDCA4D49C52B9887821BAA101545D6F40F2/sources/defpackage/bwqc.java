package defpackage;
/* compiled from: PG */
/* renamed from: bwqc  reason: default package */
/* loaded from: classes4.dex */
public class bwqc implements bwoj {
    private final dxio<nut> a;
    private final CharSequence b;
    private final CharSequence c;
    @dzsi
    private final jic d;
    @dzsi
    private final String e;
    @dzsi
    private final dtid f;
    private final long g;
    @dzsi
    private final dthb h;
    @dzsi
    private final cjtd i;

    public bwqc(dtkf dtkfVar, long j, @dzsi String str, @dzsi dvnp dvnpVar, @dzsi dtid dtidVar, dxio<nut> dxioVar) {
        dthb dthbVar;
        dtkq dtkqVar;
        jic jicVar;
        this.g = j;
        this.e = str;
        this.f = dtidVar;
        this.a = dxioVar;
        String str2 = "";
        this.b = dtkfVar.b.size() > 0 ? dtkfVar.b.get(0) : str2;
        this.c = dtkfVar.c.size() > 0 ? dtkfVar.c.get(0) : str2;
        decs decsVar = null;
        if ((dtkfVar.a & 2) != 0) {
            dthbVar = dtkfVar.h;
            if (dthbVar == null) {
                dthbVar = dthb.F;
            }
        } else {
            dthbVar = null;
        }
        this.h = dthbVar;
        int i = 1;
        if ((dtkfVar.a & 1) != 0) {
            dtkqVar = dtkfVar.f;
            if (dtkqVar == null) {
                dtkqVar = dtkq.f;
            }
        } else {
            dtkqVar = null;
        }
        int a = dtkqVar != null ? dtkn.a(dtkqVar.b) : 0;
        if (a == 0) {
            jicVar = null;
        } else {
            dtkm bZ = dtkq.f.bZ();
            int i2 = a - 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dtkq dtkqVar2 = (dtkq) bZ.b;
            dtkqVar2.a |= 1;
            dtkqVar2.b = i2;
            dtkq bK = bZ.bK();
            String str3 = (bK.a & 2) != 0 ? bK.c : null;
            int a2 = dtkp.a(bK.d);
            jicVar = new jic(str3, jfv.c(a2 != 0 ? a2 : i), oxa.f(bK), 250);
        }
        this.d = jicVar;
        this.i = oyf.b(str, dtkfVar.k, dtxl.b, dvnpVar, (dtkfVar.a & 128) != 0 ? decs.a(dtkfVar.m) : decsVar);
    }

    @Override // defpackage.bwoj
    public CharSequence a() {
        return this.b;
    }

    @Override // defpackage.bwoj
    public CharSequence b() {
        return this.c;
    }

    @Override // defpackage.bwoj
    @dzsi
    public jic c() {
        return this.d;
    }

    @Override // defpackage.bwoj
    public cqkl d(cjqm cjqmVar) {
        if (this.h == null) {
            return cqkl.a;
        }
        this.a.a().f().d(null, this.h, nxc.a(this.f, this.e, cjqmVar), null, null);
        return cqkl.a;
    }

    @Override // defpackage.bwoj
    @dzsi
    public cjtd e() {
        return this.i;
    }

    public long f() {
        return this.g;
    }
}
