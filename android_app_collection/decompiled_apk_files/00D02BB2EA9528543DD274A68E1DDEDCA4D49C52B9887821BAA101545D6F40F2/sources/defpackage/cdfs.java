package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cdfs  reason: default package */
/* loaded from: classes4.dex */
public final class cdfs extends itb implements cdfx {
    public final gga a;
    public final dxio<akfa> b;
    public final akfc c;
    public final bvrb d;
    public final anhk e;
    public final Set<String> f = new HashSet();
    private final bbul g;
    private final ckcw h;
    private final dxio<bumx> i;
    private final bbtk j;

    public cdfs(gga ggaVar, dxio<akfa> dxioVar, akfc akfcVar, bbul bbulVar, ckcw ckcwVar, bvrb bvrbVar, anhk anhkVar, dxio<bumx> dxioVar2, bbtk bbtkVar) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = akfcVar;
        this.g = bbulVar;
        this.h = ckcwVar;
        this.d = bvrbVar;
        this.e = anhkVar;
        this.i = dxioVar2;
        this.j = bbtkVar;
    }

    private final void p(dupe dupeVar, @dzsi cdfu cdfuVar) {
        this.i.a().a(dupeVar, new cdfr(this, cdfuVar), bvrj.UI_THREAD);
    }

    @Override // defpackage.cdfx
    public final void e(@dzsi String str, @dzsi dwyd dwydVar, cdfv cdfvVar, @dzsi dspd dspdVar) {
        btlu j = this.b.a().j();
        if (str != null && (j == null || !j.d.equals(str))) {
            this.c.f(str, new cdfn(this, dwydVar, cdfvVar, dspdVar));
        } else {
            f(dwydVar, cdfvVar, dspdVar);
        }
    }

    public final void f(@dzsi dwyd dwydVar, cdfv cdfvVar, @dzsi dspd dspdVar) {
        gga ggaVar = this.a;
        if (dwydVar == null) {
            dwydVar = dwyd.UNKNOWN_ENTRY_POINT;
        }
        cdbb cdbbVar = new cdbb();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ep_key", dwydVar);
        bundle.putSerializable("rtcie_key", cdfvVar);
        if (dspdVar != null) {
            bundle.putByteArray("ctok_key", dspdVar.G());
        }
        cdbbVar.B(bundle);
        ggaVar.D(cdbbVar);
    }

    @Override // defpackage.cdfx
    public final void i(Intent intent) {
        String stringExtra = intent.getStringExtra("obfuscated_gaia_id");
        byte[] byteArrayExtra = intent.getByteArrayExtra("ctok_key");
        e(stringExtra, (dwyd) intent.getSerializableExtra("ep_key"), (cdfv) intent.getSerializableExtra("rtcie_key"), byteArrayExtra == null ? null : dspd.x(byteArrayExtra));
    }

    @Override // defpackage.cdfx
    public final void j(dcka<ilo, bbtn> dckaVar, dcha<ilo, Uri> dchaVar, dwyd dwydVar, int i, cjqm cjqmVar, cdfw cdfwVar) {
        deig deigVar;
        dehn dehnVar;
        dbsk.b(!dckaVar.D() || !dchaVar.D(), "Empty photo list is passed.");
        Account m = this.b.a().m();
        if (m == null) {
            dehnVar = deha.a(false);
        } else {
            dckaVar.l();
            ((ckco) this.h.a(ckdz.X)).a(dckaVar.J().size() + ((dced) dchaVar).J().size());
            if (dckaVar.D()) {
                k(dchaVar, m.name, dwydVar, cjqmVar);
                dehnVar = deha.a(true);
            } else {
                deig d = deig.d();
                try {
                    deigVar = d;
                    try {
                        this.g.l(m.name, dwydVar, dckaVar, new cdfp(this, dckaVar, dchaVar, m, dwydVar, cjqmVar, d), cjqmVar);
                    } catch (Throwable th) {
                        th = th;
                        deigVar.k(th);
                        dehnVar = deigVar;
                        cdfq cdfqVar = new cdfq(cdfwVar);
                        Executor g = this.d.g(bvrj.UI_THREAD);
                        dbuh.d(g);
                        deha.q(dehnVar, cdfqVar, g);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    deigVar = d;
                }
                dehnVar = deigVar;
            }
        }
        cdfq cdfqVar2 = new cdfq(cdfwVar);
        Executor g2 = this.d.g(bvrj.UI_THREAD);
        dbuh.d(g2);
        deha.q(dehnVar, cdfqVar2, g2);
    }

    public final void k(dcha<ilo, Uri> dchaVar, String str, dwyd dwydVar, cjqm cjqmVar) {
        for (ilo iloVar : ((dced) dchaVar).J()) {
            ArrayList arrayList = new ArrayList();
            for (Uri uri : ((dcde) dchaVar).h(iloVar)) {
                arrayList.add(this.j.a(uri));
                this.f.add(uri.toString());
            }
            this.g.h(str, dwydVar, bbvh.e(iloVar), arrayList, cjqmVar);
        }
    }

    @Override // defpackage.cdfx
    public final void l(ilo iloVar, @dzsi cdfu cdfuVar) {
        dupc bZ = dupe.e.bZ();
        String o = iloVar.ai().o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dupe dupeVar = (dupe) bZ.b;
        o.getClass();
        dupeVar.a |= 4;
        dupeVar.d = o;
        p(bZ.bK(), cdfuVar);
    }

    @Override // defpackage.cdfx
    public final dcep<String> m() {
        bvrj.UI_THREAD.c();
        return dcep.K(this.f);
    }

    @Override // defpackage.cdfx
    public final void n() {
        cdbb cdbbVar = (cdbb) this.a.z(cdbb.class);
        if (cdbbVar == null) {
            e(null, dwyd.PUBLISH_PRIVATE_PHOTO, cdfv.SHOW_EMPTY_PAGE, null);
            return;
        }
        cdbf cdbfVar = cdbbVar.ax;
        if (cdbfVar != null) {
            cdbfVar.j(cdbbVar.g.m());
        }
        cdei cdeiVar = cdbbVar.ay;
        if (cdeiVar == null) {
            return;
        }
        cqkx.p(cdeiVar);
    }

    @Override // defpackage.cdfx
    public final void o(int i, Collection<String> collection, @dzsi cdfu cdfuVar) {
        if (collection.isEmpty()) {
            cdfuVar.a(true);
            return;
        }
        this.f.addAll(collection);
        ((ckco) this.h.a(ckdz.Y)).a(collection.size());
        dupc bZ = dupe.e.bZ();
        bZ.a(collection);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dupe dupeVar = (dupe) bZ.b;
        dupeVar.b = i - 1;
        dupeVar.a |= 2;
        p(bZ.bK(), cdfuVar);
    }
}
