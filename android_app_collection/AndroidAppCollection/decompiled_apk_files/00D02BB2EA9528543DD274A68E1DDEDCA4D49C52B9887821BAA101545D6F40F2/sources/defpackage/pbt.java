package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: pbt  reason: default package */
/* loaded from: classes7.dex */
public final class pbt implements cvtx {
    private final dxio<akfa> a;
    private final dxio b;
    private final dxio c;
    private final dxio d;
    private final dxio e;
    private final dxio f;
    private final dxio<buap> g;
    private final dxio<buas> h;
    private final dxio i;
    private final dxio j;
    private final dxio k;

    public pbt(dxio<akfa> dxioVar, dxio dxioVar2, dxio dxioVar3, dxio dxioVar4, dxio dxioVar5, dxio dxioVar6, dxio<buap> dxioVar7, dxio<buas> dxioVar8, dxio dxioVar9, dxio dxioVar10, dxio dxioVar11) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = dxioVar3;
        this.d = dxioVar4;
        this.e = dxioVar5;
        this.f = dxioVar6;
        this.g = dxioVar7;
        this.h = dxioVar8;
        this.i = dxioVar9;
        this.j = dxioVar10;
        this.k = dxioVar11;
    }

    private final <I extends dssj, O extends dssj> cvty<O> k(btzo<I, O> btzoVar, @dzsi String str, I i) {
        dbsg dbsgVar;
        bvrj.UI_THREAD.d();
        if (this.a.a().d()) {
            cvtv d = cvty.d();
            d.b = new RuntimeException("Incognito mode, cancelling RPC");
            d.b(false);
            return d.a();
        }
        i.getClass();
        if (!TextUtils.isEmpty(str)) {
            Iterator<btlu> it = this.a.a().t().iterator();
            while (true) {
                if (it.hasNext()) {
                    btlu next = it.next();
                    if (next.l() && next.s().name.equals(str)) {
                        dbsgVar = dbsg.i(next);
                        break;
                    }
                } else {
                    dbsgVar = dbpy.a;
                    break;
                }
            }
            if (!dbsgVar.a()) {
                cvtv d2 = cvty.d();
                String valueOf = String.valueOf(str);
                d2.b = new RuntimeException(valueOf.length() != 0 ? "Cannot find account: ".concat(valueOf) : new String("Cannot find account: "));
                d2.b(false);
                return d2.a();
            }
            btzoVar.a().e = (btlu) dbsgVar.b();
        }
        deig d3 = deig.d();
        btzoVar.b().a(i, new pbs(d3), bvrj.BACKGROUND_THREADPOOL);
        return (cvty) deha.s(d3);
    }

    @Override // defpackage.cvtx
    public final cvty<drzw> a(String str, drzu drzuVar) {
        return k((btzo) this.b.a(), str, drzuVar);
    }

    @Override // defpackage.cvtx
    public final cvty<drzo> b(String str, drzm drzmVar) {
        return k((btzo) this.c.a(), str, drzmVar);
    }

    @Override // defpackage.cvtx
    public final cvty<dryx> c(String str, dryv dryvVar) {
        return k((btzo) this.d.a(), str, dryvVar);
    }

    @Override // defpackage.cvtx
    public final cvty<drzg> d(String str, drze drzeVar) {
        return k((btzo) this.e.a(), str, drzeVar);
    }

    @Override // defpackage.cvtx
    public final cvty<drzb> e(String str, dryz dryzVar) {
        return k((btzo) this.f.a(), str, dryzVar);
    }

    @Override // defpackage.cvtx
    public final cvty<dryl> f(String str, dryj dryjVar) {
        return k((btzo) this.k.a(), str, dryjVar);
    }

    @Override // defpackage.cvtx
    public final cvty<dryp> g(String str, dryn drynVar) {
        return k(this.g.a(), str, drynVar);
    }

    @Override // defpackage.cvtx
    public final cvty<dryt> h(String str, dryr dryrVar) {
        return k(this.h.a(), str, dryrVar);
    }

    @Override // defpackage.cvtx
    public final cvty<drzs> i(String str, drzq drzqVar) {
        return k((btzo) this.i.a(), str, drzqVar);
    }

    @Override // defpackage.cvtx
    public final cvty<dsaa> j(drzy drzyVar) {
        return k((btzo) this.j.a(), null, drzyVar);
    }
}
