package defpackage;

import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
/* compiled from: PG */
/* renamed from: bwez  reason: default package */
/* loaded from: classes4.dex */
public final class bwez implements bwft {
    private static final dcqe a = dcqe.c("bwez");
    private final gga b;
    private final bwqv c;
    private final btvo d;
    private final dxio<akfa> e;
    private final dehq f;
    private final cxrj g;

    public bwez(gga ggaVar, bwqv bwqvVar, btvo btvoVar, dxio<akfa> dxioVar, dehq dehqVar, cxrj cxrjVar) {
        this.b = ggaVar;
        this.c = bwqvVar;
        this.d = btvoVar;
        this.e = dxioVar;
        this.f = dehqVar;
        this.g = cxrjVar;
    }

    static cjtd m(@dzsi cjtd cjtdVar) {
        return cjtdVar != null ? cjtdVar : cjtd.a(dtyb.dp);
    }

    private final void q(ex exVar, String str) {
        gn g = this.b.g();
        if (g.J()) {
            bvoo.h("Attempted to start a share after onSaveInstanceState()", new Object[0]);
        } else {
            exVar.e(g, str);
        }
    }

    private final void r(bweo bweoVar, bwfs[] bwfsVarArr, @dzsi cjtd cjtdVar, int i, czgq czgqVar) {
        bwqv bwqvVar = this.c;
        bwfg bwfgVar = new bwfg(m(cjtdVar), bwfsVarArr, bweoVar, 37, czgqVar);
        bwfh bwfhVar = new bwfh();
        bwfh.aJ(bwfhVar, bwqvVar, bwfgVar);
        q(bwfhVar, bwfh.aw);
    }

    @Override // defpackage.bwft
    public final void a(@dzsi bwrs<ilo> bwrsVar, ddho ddhoVar) {
        int a2;
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            return;
        }
        String n = iloVar.n();
        boolean z = true;
        dbsk.s(bwrsVar);
        bwfs[] bwfsVarArr = {new bwdy(bwrsVar)};
        ilo c = bwrsVar.c();
        dbsk.s(c);
        if ((this.d.getSharingParameters().a & 128) == 0 || (a2 = dvsx.a(this.d.getSharingParameters().h)) == 0 || a2 != 3) {
            z = false;
        }
        bwdx bwdxVar = new bwdx(c, n, z, this.d);
        czgq a3 = bwec.a(ddhoVar);
        bwqv bwqvVar = this.c;
        bwex bwexVar = new bwex(iloVar, bwfsVarArr, bwdxVar, m(null), a3);
        bwey bweyVar = new bwey();
        bwey.aJ(bweyVar, bwqvVar, bwexVar);
        q(bweyVar, bwey.aw);
    }

    @Override // defpackage.bwft
    public final void b(@dzsi String str, @dzsi List<String> list, String str2, drrp drrpVar, int i, @dzsi ddho ddhoVar) {
        n(new bwdv(str, list, str2, drrpVar, i), new bwfs[0], null, ddhoVar);
    }

    @Override // defpackage.bwft
    public final void c(@dzsi String str, @dzsi String str2, @dzsi String str3, @dzsi String str4, awtn awtnVar, @dzsi ddho ddhoVar) {
        bwfs[] bwfsVarArr = new bwfs[0];
        String f = dbsj.f(dbrz.e("\n").j().i(str2, str3, str4));
        try {
            String encode = URLEncoder.encode(this.b.getString(R.string.PARKING_LOCATION_DESTINATION_WAYPOINT), "UTF-8");
            String q = awtnVar.q();
            StringBuilder sb = new StringBuilder(String.valueOf(encode).length() + 31 + String.valueOf(q).length());
            sb.append("http://maps.google.com/maps?q=");
            sb.append(encode);
            sb.append("@");
            sb.append(q);
            bwdt bwdtVar = new bwdt(sb.toString());
            bwdtVar.a = str;
            bwdtVar.b = f;
            bwdtVar.b();
            bwdtVar.d = 7;
            drro bZ = drrp.d.bZ();
            drrq bZ2 = drrr.j.bZ();
            droy bZ3 = droz.f.bZ();
            String q2 = awtnVar.q();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            droz drozVar = (droz) bZ3.b;
            q2.getClass();
            drozVar.a |= 8;
            drozVar.e = q2;
            droz drozVar2 = (droz) bZ3.b;
            drozVar2.c = 2;
            drozVar2.a = 2 | drozVar2.a;
            dnoh g = awtnVar.c().g();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            droz drozVar3 = (droz) bZ3.b;
            g.getClass();
            drozVar3.d = g;
            drozVar3.a |= 4;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            drrr drrrVar = (drrr) bZ2.b;
            droz bK = bZ3.bK();
            bK.getClass();
            drrrVar.c = bK;
            drrrVar.a |= 4;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drrp drrpVar = (drrp) bZ.b;
            drrr bK2 = bZ2.bK();
            bK2.getClass();
            drrpVar.c = bK2;
            drrpVar.a |= 8;
            bwdtVar.c = bZ.bK();
            n(bwdtVar.a(), bwfsVarArr, null, ddhoVar);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.bwft
    public final void d(@dzsi String str, String str2, String str3, @dzsi ddho ddhoVar, bwfs... bwfsVarArr) {
        dbsk.s(str2);
        bwdz bwdzVar = new bwdz(str, str2);
        cjta b = cjtd.b();
        b.d = dtya.dR;
        b.g(str3);
        n(bwdzVar, bwfsVarArr, b.a(), ddhoVar);
    }

    @Override // defpackage.bwft
    public final void e(String str, String str2, boolean z, int i, String str3, @dzsi ddho ddhoVar) {
        n(new bwds(str, str2, z, i, str3), new bwfs[0], cjtd.a(dtyd.cr), ddhoVar);
    }

    @Override // defpackage.bwft
    public final void f(String str, dipk dipkVar, @dzsi ddho ddhoVar, bwfs... bwfsVarArr) {
        bwdw bwdwVar = new bwdw(str, dipkVar.o);
        cjta b = cjtd.b();
        b.d = dtxu.aO;
        b.b = dipkVar.p;
        b.g(dipkVar.q);
        bgnf.a(b, dipkVar);
        n(bwdwVar, bwfsVarArr, b.a(), ddhoVar);
    }

    @Override // defpackage.bwft
    public final void g(dqhj dqhjVar, @dzsi ddho ddhoVar) {
        r(new bwfi(dqhjVar), new bwfs[0], m(null), 37, bwec.a(ddhoVar));
    }

    @Override // defpackage.bwft
    public final void h(dqhj dqhjVar, @dzsi ddho ddhoVar) {
        r(new bwfa(dqhjVar), new bwfs[0], m(null), 37, bwec.a(ddhoVar));
    }

    @Override // defpackage.bwft
    public final void i(baad baadVar, @dzsi ddho ddhoVar) {
        bwdt bwdtVar = new bwdt(baadVar.u());
        bwdtVar.a = baadVar.E(this.b);
        bwdtVar.d = 12;
        bwdtVar.c = axyk.b(baadVar, false);
        bwdu a2 = bwdtVar.a();
        cjtd m = m(null);
        bwqv bwqvVar = this.c;
        bwev bwevVar = new bwev(a2, baadVar.l(), baadVar.C(), baadVar.y(), m(m), bwec.a(ddhoVar));
        bwew bwewVar = new bwew();
        bwew.aJ(bwewVar, bwqvVar, bwevVar);
        q(bwewVar, bwew.aw);
    }

    @Override // defpackage.bwft
    public final void j(String str, String str2, drrp drrpVar, @dzsi ddho ddhoVar) {
        bwdt bwdtVar = new bwdt(str2);
        bwdtVar.a = str;
        bwdtVar.b();
        bwdtVar.d = 13;
        bwdtVar.c = drrpVar;
        n(bwdtVar.a(), new bwfs[0], null, ddhoVar);
    }

    @Override // defpackage.bwft
    public final void k(String str, String str2, String str3) {
        bwdt bwdtVar = new bwdt(str3);
        bwdtVar.a = str;
        bwdtVar.b = str2;
        bwdtVar.d = 15;
        n(bwdtVar.a(), new bwfs[0], null, null);
    }

    @Override // defpackage.bwft
    public final void l() {
        p(37);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(bweo bweoVar, bwfs[] bwfsVarArr, @dzsi cjtd cjtdVar, @dzsi ddho ddhoVar) {
        if (!this.d.getSharingParameters().c || !this.d.getSharingParameters().d) {
            if (this.b.g().J()) {
                bvoo.h("Attempted to start a share after onSaveInstanceState()", new Object[0]);
                return;
            }
            bwqv bwqvVar = this.c;
            cjtd m = m(cjtdVar);
            Bundle bundle = new Bundle();
            bwqvVar.c(bundle, "callbacks", bwfsVarArr);
            bwqvVar.c(bundle, "shareContent", bweoVar);
            bwqvVar.c(bundle, "itemUe3Params", m);
            bundle.putString("title", null);
            bwel bwelVar = new bwel();
            bwelVar.B(bundle);
            bwelVar.aJ(this.b);
            return;
        }
        r(bweoVar, bwfsVarArr, cjtdVar, 37, bwec.a(ddhoVar));
    }

    @Override // defpackage.bwft
    public final void o(String str, String str2, String str3, String str4, int i, @dzsi ddho ddhoVar) {
        bwdt bwdtVar = new bwdt(str3);
        bwdtVar.a = str;
        bwdtVar.b = str2;
        bwdtVar.d = 14;
        drro bZ = drrp.d.bZ();
        drrq bZ2 = drrr.j.bZ();
        drpa bZ3 = drpc.d.bZ();
        drpp bZ4 = drpq.c.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        drpq drpqVar = (drpq) bZ4.b;
        str4.getClass();
        drpqVar.a |= 1;
        drpqVar.b = str4;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        drpc drpcVar = (drpc) bZ3.b;
        drpq bK = bZ4.bK();
        bK.getClass();
        drpcVar.b = bK;
        drpcVar.a |= 1;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        drpc drpcVar2 = (drpc) bZ3.b;
        drpcVar2.c = i - 1;
        drpcVar2.a |= 2;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drrr drrrVar = (drrr) bZ2.b;
        drpc bK2 = bZ3.bK();
        bK2.getClass();
        drrrVar.g = bK2;
        drrrVar.a |= 16384;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drrp drrpVar = (drrp) bZ.b;
        drrr bK3 = bZ2.bK();
        bK3.getClass();
        drrpVar.c = bK3;
        drrpVar.a |= 8;
        bwdtVar.c = bZ.bK();
        n(bwdtVar.a(), new bwfs[0], null, ddhoVar);
    }

    public final void p(int i) {
        String charSequence;
        btlu j = this.e.a().j();
        if (!this.d.getSharingParameters().c || !this.d.getSharingParameters().g || !j.l()) {
            return;
        }
        int i2 = this.b.getApplicationInfo().labelRes;
        if (i2 != 0) {
            charSequence = this.b.getString(i2);
        } else {
            charSequence = this.b.getApplicationInfo().nonLocalizedLabel.toString();
        }
        cxrj cxrjVar = this.g;
        gga ggaVar = this.b;
        String t = j.t();
        dbsk.s(t);
        czgq czgqVar = czgq.UNKNOWN;
        cxod cxodVar = new cxod();
        cxodVar.a(this.b);
        cxrjVar.b(ggaVar, cxst.a(t, czgqVar, charSequence, 0, cxodVar), this.f);
    }
}
