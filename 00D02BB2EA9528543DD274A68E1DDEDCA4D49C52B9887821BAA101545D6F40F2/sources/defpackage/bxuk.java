package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bxuk  reason: default package */
/* loaded from: classes4.dex */
public class bxuk implements bxuj {
    private static final cqtd a = cqrt.g(2131232154, iva.b(ibl.s(), ibl.b()));
    private static final cqss b = iva.b(ibl.i(), ibl.s());
    private final ff c;
    private final dxio<brba> d;
    private final gft e;
    private final cjtd f;
    private final crym g;
    private final int h;
    private final ddho i;

    public bxuk(ff ffVar, dxio<brba> dxioVar, gft gftVar, cjqy cjqyVar, crym crymVar) {
        int i;
        ddho ddhoVar;
        this.c = ffVar;
        this.d = dxioVar;
        this.e = gftVar;
        this.g = crymVar;
        cryl a2 = crymVar.a();
        cryl crylVar = cryl.ADDRESS;
        int ordinal = a2.ordinal();
        if (ordinal == 0) {
            i = R.string.COPIED_ADDRESS_SUGGESTION_CONTENT_DESCRIPTION;
        } else if (ordinal != 1) {
            String valueOf = String.valueOf(a2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Unexpected suggestion type: ");
            sb.append(valueOf);
            throw new AssertionError(sb.toString());
        } else {
            i = R.string.COPIED_RESTAURANT_NAME_SUGGESTION_CONTENT_DESCRIPTION;
        }
        this.h = i;
        cryl a3 = crymVar.a();
        int ordinal2 = a3.ordinal();
        if (ordinal2 == 0) {
            ddhoVar = dtxl.eE;
        } else if (ordinal2 == 1) {
            ddhoVar = dtyb.ci;
        } else {
            String valueOf2 = String.valueOf(a3);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
            sb2.append("Unexpected suggestion type: ");
            sb2.append(valueOf2);
            throw new AssertionError(sb2.toString());
        }
        this.i = ddhoVar;
        ddxt bZ = ddxv.g.bZ();
        long d = crymVar.d();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddxv ddxvVar = (ddxv) bZ.b;
        ddxvVar.a |= 1;
        ddxvVar.b = d;
        float b2 = crymVar.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddxv ddxvVar2 = (ddxv) bZ.b;
        int i2 = 2;
        ddxvVar2.a |= 2;
        ddxvVar2.c = b2;
        int length = crymVar.c().length();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddxv ddxvVar3 = (ddxv) bZ.b;
        ddxvVar3.a |= 4;
        ddxvVar3.d = length;
        int e = crymVar.e();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddxv ddxvVar4 = (ddxv) bZ.b;
        ddxvVar4.a |= 8;
        ddxvVar4.e = e;
        cryl a4 = crymVar.a();
        int ordinal3 = a4.ordinal();
        if (ordinal3 != 0) {
            if (ordinal3 != 1) {
                String valueOf3 = String.valueOf(a4);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 28);
                sb3.append("Unexpected suggestion type: ");
                sb3.append(valueOf3);
                throw new AssertionError(sb3.toString());
            }
            i2 = 3;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddxv ddxvVar5 = (ddxv) bZ.b;
        ddxvVar5.f = i2 - 1;
        ddxvVar5.a |= 128;
        ddxv bK = bZ.bK();
        cjst d2 = cjsu.d();
        d2.d(ddda.G);
        cjry e2 = cjrz.e();
        e2.b(ddcu.k);
        ddzf bZ2 = ddzg.t.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddzg ddzgVar = (ddzg) bZ2.b;
        bK.getClass();
        ddzgVar.n = bK;
        ddzgVar.b |= 1024;
        ((cjrn) e2).a = bZ2.bK();
        d2.f(e2.a());
        cjsu e3 = d2.e();
        cjqyVar.l(e3);
        dbsk.s(ddhoVar);
        cjtd f = e3.f(0);
        cjta b3 = cjtd.b();
        b3.d = ddhoVar;
        b3.g(f.d);
        this.f = b3.a();
    }

    @Override // defpackage.bxuj
    public String a() {
        return this.g.c();
    }

    @Override // defpackage.bxuj
    public String b() {
        return this.c.getString(this.h, new Object[]{a()});
    }

    @Override // defpackage.bxuj
    @dzsi
    public cqss c() {
        return b;
    }

    @Override // defpackage.bxuj
    public cqtd d() {
        return a;
    }

    @Override // defpackage.bxuj
    public cqkl e(cjqm cjqmVar) {
        if (this.e.bb()) {
            dnqg bZ = dnqh.p.bZ();
            int i = ddda.aA.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ.b;
            dnqhVar.a |= 64;
            dnqhVar.g = i;
            if (cjqmVar.a().a()) {
                String b2 = cjqmVar.a().b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar2 = (dnqh) bZ.b;
                b2.getClass();
                dnqhVar2.a |= 2;
                dnqhVar2.c = b2;
                doeh bZ2 = doei.d.bZ();
                String b3 = cjqmVar.a().b();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                doei doeiVar = (doei) bZ2.b;
                b3.getClass();
                doeiVar.a |= 4;
                doeiVar.c = b3;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar3 = (dnqh) bZ.b;
                doei bK = bZ2.bK();
                bK.getClass();
                dnqhVar3.m = bK;
                dnqhVar3.a |= 262144;
            }
            this.d.a().j(this.g.c(), bZ.bK());
        }
        return cqkl.a;
    }

    @Override // defpackage.bxuj
    public cjtd f() {
        return this.f;
    }

    public crym g() {
        return this.g;
    }
}
