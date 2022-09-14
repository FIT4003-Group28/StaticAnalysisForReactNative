package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.database.Cursor;
import android.text.Html;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azlv  reason: default package */
/* loaded from: classes.dex */
public final class azlv implements axwq {
    private final bunw A;
    public final bvrb a;
    public final batm b;
    public final btrm c;
    public final akfa d;
    public final dxio<axwp> e;
    public final dxio<axyh> f;
    public final azks g;
    public final azof h;
    public final dxio<azhi> i;
    public btlu j = btlu.a;
    public volatile dcdc<azva> k = dcdc.e();
    public dcde<Long, azvo> l = dcax.a;
    public final Object m = new Object();
    public boolean n = false;
    @dzsi
    public dehn<Boolean> o = null;
    private final Application p;
    private final ckcw q;
    private final axwb r;
    private final axxf s;
    private final ania t;
    private final dxio<axwi> u;
    private final dxio<axwk> v;
    private final anhk w;
    private final dehp x;
    private int y;
    private final bull z;

    public azlv(Application application, ckcw ckcwVar, dxio dxioVar, btrm btrmVar, akfa akfaVar, azks azksVar, anhk anhkVar, azof azofVar, bvrb bvrbVar, batm batmVar, dehp dehpVar, ania aniaVar, axwb axwbVar, axxf axxfVar, bull bullVar, bunw bunwVar, dxio dxioVar2, dxio dxioVar3, dxio dxioVar4, dxio dxioVar5) {
        this.p = application;
        this.a = bvrbVar;
        this.b = batmVar;
        this.x = dehpVar;
        this.c = btrmVar;
        this.q = ckcwVar;
        this.d = akfaVar;
        this.g = azksVar;
        this.h = azofVar;
        this.w = anhkVar;
        this.i = dxioVar;
        this.t = aniaVar;
        this.e = dxioVar2;
        this.f = dxioVar3;
        this.r = axwbVar;
        this.s = axxfVar;
        this.z = bullVar;
        this.A = bunwVar;
        this.u = dxioVar4;
        this.v = dxioVar5;
    }

    public static boolean E(dndr dndrVar) {
        return dndrVar == dndr.HOME || dndrVar == dndr.WORK || dndrVar == dndr.NICKNAME;
    }

    private final boolean M() {
        return this.d.j().l();
    }

    @Override // defpackage.axwq
    public final void A(azwm<?> azwmVar, azkm azkmVar, bvrj bvrjVar) {
        if (!azwmVar.f()) {
            K(Collections.emptyList(), Collections.emptyList(), azwmVar, azkmVar, bvrjVar);
        } else if (this.d.j().l()) {
            long j = azwmVar.m;
            azlq azlqVar = new azlq(this, azwmVar, azkmVar, bvrjVar);
            dvoo bZ = dvor.e.bZ();
            dvop bZ2 = dvoq.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dvoq dvoqVar = (dvoq) bZ2.b;
            dvoqVar.a |= 1;
            dvoqVar.b = j;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvor dvorVar = (dvor) bZ.b;
            dvoq bK = bZ2.bK();
            bK.getClass();
            dsrj<dvoq> dsrjVar = dvorVar.b;
            if (!dsrjVar.a()) {
                dvorVar.b = dsqw.cl(dsrjVar);
            }
            dvorVar.b.add(bK);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvor dvorVar2 = (dvor) bZ.b;
            dvorVar2.a |= 2;
            dvorVar2.d = true;
            String b = b();
            if (b != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dvor dvorVar3 = (dvor) bZ.b;
                b.getClass();
                dvorVar3.a |= 1;
                dvorVar3.c = b;
            }
            baao baaoVar = new baao(bZ.bK(), azlqVar);
            this.A.a(baaoVar.a, new azlr(this, baaoVar), bvrj.UI_THREAD);
        } else {
            azkmVar.a();
        }
    }

    @Override // defpackage.axwq
    public final void B(azwf azwfVar, azkn azknVar, bvrj bvrjVar) {
        azwm<?> azwmVar = azwfVar.a;
        List<byte[]> list = azwfVar.b;
        if (list.isEmpty()) {
            L(azwmVar, azknVar, bvrjVar);
            return;
        }
        azls azlsVar = new azls(this, azwmVar, azknVar, bvrjVar);
        dvoi bZ = dvoj.d.bZ();
        for (byte[] bArr : list) {
            dspd x = dspd.x(bArr);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvoj dvojVar = (dvoj) bZ.b;
            x.getClass();
            dsrj<dspd> dsrjVar = dvojVar.b;
            if (!dsrjVar.a()) {
                dvojVar.b = dsqw.cl(dsrjVar);
            }
            dvojVar.b.add(x);
        }
        String b = b();
        if (b != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvoj dvojVar2 = (dvoj) bZ.b;
            b.getClass();
            dvojVar2.a |= 1;
            dvojVar2.c = b;
        }
        baan baanVar = new baan(bZ.bK(), azlsVar);
        this.z.a(baanVar.a, new azlt(this, baanVar), bvrj.UI_THREAD);
    }

    public final synchronized void C(btlu btluVar) {
        bvrj.BACKGROUND_THREADPOOL.c();
        if (!btluVar.r()) {
            this.v.a().e(btluVar);
        } else {
            H();
        }
    }

    public final dcdc<azva> D() {
        dcdc<azva> e;
        azva azvaVar;
        String str;
        long j;
        long c;
        dxag dxagVar;
        dndr b;
        long j2;
        akqq akqqVar;
        String str2;
        int i;
        azxa azxaVar;
        azva azvaVar2;
        azks azksVar = this.g;
        azwd<azva> azwdVar = azwd.a;
        int i2 = 0;
        if (azwdVar == null) {
            bvoo.h("corpus is null.", new Object[0]);
            e = dcdc.e();
        } else {
            try {
                Cursor query = azksVar.d.b(false).query("sync_item", null, "corpus = ?", new String[]{Integer.toString(dxby.PLACE_ALIASES.k)}, null, null, "timestamp DESC");
                ArrayList<azoj> a = dchl.a();
                while (azol.c(query)) {
                    azoj azojVar = new azoj();
                    azojVar.a = dxby.b(query.getInt(0));
                    azojVar.b = query.getString(1);
                    azojVar.c = query.getLong(2);
                    azojVar.d = query.getLong(3);
                    azojVar.e = query.isNull(4) ? null : Long.valueOf(query.getLong(4));
                    azojVar.f = query.isNull(5) ? null : Integer.valueOf(query.getInt(5));
                    azojVar.g = query.isNull(6) ? null : Integer.valueOf(query.getInt(6));
                    azojVar.h = query.getInt(7) != 0;
                    try {
                        azojVar.i = (dxci) dsqw.cq(dxci.e, query.getBlob(8));
                        a.add(azojVar);
                    } catch (IOException e2) {
                        throw new RuntimeException("Cannot parse SyncItem proto.", e2);
                    }
                }
                query.close();
                dccx F = dcdc.F();
                for (azoj azojVar2 : a) {
                    dxci dxciVar = azojVar2.i;
                    try {
                        str = dxciVar.c;
                        j = (dxciVar.a & 16) != 0 ? dxciVar.d : 0L;
                        c = ((azwe) azwdVar).c(dxciVar);
                        dxagVar = dxciVar.b;
                        if (dxagVar == null) {
                            dxagVar = dxag.i;
                        }
                        dxae dxaeVar = dxagVar.b;
                        if (dxaeVar == null) {
                            dxaeVar = dxae.c;
                        }
                        b = dndr.b(dxaeVar.a);
                        if (b == null) {
                            b = dndr.UNKNOWN_ALIAS_TYPE;
                        }
                        dxae dxaeVar2 = dxagVar.b;
                        if (dxaeVar2 == null) {
                            dxaeVar2 = dxae.c;
                        }
                        j2 = dxaeVar2.b;
                    } catch (RuntimeException e3) {
                        bvoo.f(e3);
                        azvaVar = null;
                    }
                    if ((b != dndr.HOME && b != dndr.WORK) || j2 == 0) {
                        String str3 = "";
                        akqi f = akqi.f((dxagVar.a & 4) != 0 ? dxagVar.d : str3);
                        if (!akqi.d(f)) {
                            f = akqi.a;
                        }
                        akqi akqiVar = f;
                        int i3 = dxagVar.a;
                        if ((i3 & 2) != 0) {
                            str3 = dxagVar.c;
                        }
                        String str4 = str3;
                        if ((i3 & 8) != 0) {
                            dwzq dwzqVar = dxagVar.e;
                            if (dwzqVar == null) {
                                dwzqVar = dwzq.d;
                            }
                            akqqVar = akqg.b(akra.c(dwzqVar.b, dwzqVar.c));
                        } else {
                            akqqVar = null;
                        }
                        if (b != dndr.NICKNAME) {
                            str2 = null;
                        } else if ((dxagVar.a & 64) == 0) {
                            throw new azxc("NICKNAME must have non-null nickname.");
                        } else {
                            str2 = dxagVar.g;
                        }
                        azvaVar = new azva(str, c, j, b, Long.valueOf(j2), akqiVar, str4, akqqVar, str2, (dxagVar.a & 128) != 0 ? decq.a(dxagVar.h) : null);
                        if (azvaVar != null && !dbsj.d(azvaVar.e(azksVar.c))) {
                            F.g(azvaVar);
                        }
                    } else {
                        throw new azxc("HOME and WORK subId must be 0.");
                    }
                }
                e = F.f();
            } catch (azom unused) {
                e = dcdc.e();
            }
        }
        dcdc a2 = this.h.a(azxm.h);
        ckco ckcoVar = (ckco) this.q.a(ckdc.b);
        dcdc z = dcbg.b(e).o(azli.a).z();
        dcdc z2 = dcbg.b(a2).o(azlj.a).z();
        if (z.size() != z2.size()) {
            i = 2;
        } else {
            HashMap f2 = dcjz.f(z.size());
            int size = e.size();
            for (int i4 = 0; i4 < size; i4++) {
                azva azvaVar3 = e.get(i4);
                dndk bZ = dndl.d.bZ();
                String l = azvaVar3.b.toString();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dndl dndlVar = (dndl) bZ.b;
                l.getClass();
                int i5 = dndlVar.a | 2;
                dndlVar.a = i5;
                dndlVar.c = l;
                dndlVar.b = azvaVar3.a.h;
                dndlVar.a = i5 | 1;
                f2.put(bZ.bK(), azvaVar3);
            }
            int size2 = z2.size();
            do {
                if (i2 >= size2) {
                    i = 1;
                    break;
                }
                azxaVar = (azxa) z2.get(i2);
                dndl dndlVar2 = azxaVar.k().b;
                if (dndlVar2 == null) {
                    dndlVar2 = dndl.d;
                }
                azvaVar2 = (azva) f2.get(dndlVar2);
                if (azvaVar2 == null) {
                    i = 3;
                    break;
                } else if (!azvaVar2.j(azxaVar.d())) {
                    break;
                } else {
                    i2++;
                }
            } while (azvaVar2.c.equals(azxaVar.b()));
            i = 4;
        }
        ckcoVar.a(i - 1);
        return e;
    }

    public final synchronized void F() {
        bvrj.BACKGROUND_THREADPOOL.c();
        if (!this.d.j().l()) {
            return;
        }
        this.i.a().b(null);
    }

    public final synchronized void G() {
        this.e.a().h();
    }

    public final void H() {
        if (!M()) {
            return;
        }
        this.b.b(new Runnable(this) { // from class: azld
            private final azlv a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.J();
            }
        });
    }

    public final void I() {
        if (this.o != null) {
            return;
        }
        boolean z = this.y > 0 && M();
        if (z == this.n) {
            return;
        }
        if (z) {
            this.o = this.x.b(new Runnable(this) { // from class: azle
                private final azlv a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.J();
                }
            }, true);
        } else {
            this.o = this.x.b(new Runnable(this) { // from class: azlf
                private final azlv a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.G();
                }
            }, false);
        }
        bvqj.c(this.o, new bvqg(this) { // from class: azlg
            private final azlv a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                azlv azlvVar = this.a;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                synchronized (azlvVar.m) {
                    azlvVar.n = booleanValue;
                    azlvVar.o = null;
                    azlvVar.I();
                }
            }
        }, this.x);
    }

    public final synchronized void J() {
        List<azvo> e;
        String t;
        String c;
        dcdc g;
        bvrj.UI_THREAD.d();
        ckcq a = ((ckcr) this.q.a(ckir.e)).a();
        dcdc.e();
        try {
            g = g(azxm.e);
        } catch (axxc unused) {
        }
        dcdc<azva> e2 = dcdc.e();
        if (this.t.a()) {
            try {
                e2 = D();
            } catch (axxc unused2) {
            }
        }
        dcdc<azva> dcdcVar = e2;
        if (this.t.a()) {
            e = this.r.a();
        } else {
            e = dcdc.e();
        }
        this.k = dcdc.r(dcdcVar);
        dcdd a2 = dcde.a();
        for (azvo azvoVar : e) {
            dolk dolkVar = azvoVar.m().b;
            if (dolkVar == null) {
                dolkVar = dolk.h;
            }
            String str = dolkVar.g;
            if (!str.isEmpty()) {
                try {
                    a2.b(Long.valueOf(akqi.b(str).c), azvoVar);
                } catch (IllegalArgumentException e3) {
                    e3.getMessage();
                }
            }
        }
        this.l = a2.a();
        g.size();
        dcdcVar.size();
        e.size();
        azwy azwyVar = new azwy(this.p, g, dcdcVar, this.l, (List) deha.s(this.u.a().g()));
        dccx F = dcdc.F();
        dbyv N = dbyv.N();
        dcwg<baal> dcwgVar = new dcwg<>();
        List<baal> list = azwyVar.i;
        azww azwwVar = new azww();
        azwx azwxVar = new azwx();
        for (baal baalVar : list) {
            akqi a3 = azwwVar.a(baalVar);
            if (akqi.d(a3)) {
                N.n(Long.valueOf(a3.c), baalVar);
            } else {
                akqq a4 = azwxVar.a(baalVar);
                if (a4 != null) {
                    dcwgVar.b(dcvs.b(a4.a, a4.b).k(), baalVar);
                }
            }
        }
        Iterator<azva> it = azwyVar.e.iterator();
        while (true) {
            List<azvo> list2 = null;
            if (!it.hasNext()) {
                break;
            }
            azva next = it.next();
            akqi akqiVar = next.c;
            dbsk.s(akqiVar);
            akqq akqqVar = next.e;
            dbsk.s(akqqVar);
            String str2 = next.d;
            azwq t2 = azwv.t(akqiVar, akqqVar, str2, str2);
            ((azve) t2).f = dndr.NICKNAME;
            ((azve) t2).g = next.b;
            ((azve) t2).j = next.f;
            if (akqi.d(akqiVar)) {
                list2 = azwyVar.h.d(Long.valueOf(akqiVar.c));
            }
            ((azve) t2).h = list2;
            t2.j(azwyVar.b(akqiVar, akqqVar, N, dcwgVar));
            F.g(t2.i());
        }
        for (azva azvaVar : azwyVar.f) {
            akqi akqiVar2 = azvaVar.c;
            dbsk.s(akqiVar2);
            akqq akqqVar2 = azvaVar.e;
            dbsk.s(akqqVar2);
            String str3 = azvaVar.d;
            azwq t3 = azwv.t(akqiVar2, akqqVar2, str3, str3);
            ((azve) t3).f = dndr.NICKNAME;
            ((azve) t3).g = azvaVar.b;
            t3.h(true);
            ((azve) t3).j = azvaVar.f;
            ((azve) t3).h = !akqi.d(akqiVar2) ? null : azwyVar.h.d(Long.valueOf(akqiVar2.c));
            t3.j(azwyVar.b(akqiVar2, akqqVar2, N, dcwgVar));
            F.g(t3.i());
        }
        azva azvaVar2 = azwyVar.a;
        if (azvaVar2 != null) {
            akqi akqiVar3 = azvaVar2.c;
            dbsk.s(akqiVar3);
            azva azvaVar3 = azwyVar.a;
            dbsk.s(azvaVar3);
            akqq akqqVar3 = azvaVar3.e;
            dbsk.s(akqqVar3);
            azva azvaVar4 = azwyVar.a;
            dbsk.s(azvaVar4);
            String str4 = azvaVar4.d;
            azva azvaVar5 = azwyVar.a;
            dbsk.s(azvaVar5);
            azwq t4 = azwv.t(akqiVar3, akqqVar3, str4, azvaVar5.d);
            ((azve) t4).f = dndr.HOME;
            t4.h(azwyVar.c.booleanValue());
            azva azvaVar6 = azwyVar.a;
            dbsk.s(azvaVar6);
            ((azve) t4).k = azvaVar6.g;
            ((azve) t4).h = !akqi.d(akqiVar3) ? null : azwyVar.h.d(Long.valueOf(akqiVar3.c));
            t4.j(azwyVar.b(akqiVar3, akqqVar3, N, dcwgVar));
            F.g(t4.i());
        }
        azva azvaVar7 = azwyVar.b;
        if (azvaVar7 != null) {
            akqi akqiVar4 = azvaVar7.c;
            dbsk.s(akqiVar4);
            azva azvaVar8 = azwyVar.b;
            dbsk.s(azvaVar8);
            akqq akqqVar4 = azvaVar8.e;
            dbsk.s(akqqVar4);
            azva azvaVar9 = azwyVar.b;
            dbsk.s(azvaVar9);
            String str5 = azvaVar9.d;
            azva azvaVar10 = azwyVar.b;
            dbsk.s(azvaVar10);
            azwq t5 = azwv.t(akqiVar4, akqqVar4, str5, azvaVar10.d);
            ((azve) t5).f = dndr.WORK;
            azva azvaVar11 = azwyVar.b;
            dbsk.s(azvaVar11);
            ((azve) t5).k = azvaVar11.g;
            t5.h(azwyVar.d.booleanValue());
            ((azve) t5).h = !akqi.d(akqiVar4) ? null : azwyVar.h.d(Long.valueOf(akqiVar4.c));
            t5.j(azwyVar.b(akqiVar4, akqqVar4, N, dcwgVar));
            F.g(t5.i());
        }
        List<azxk> list3 = azwyVar.g;
        dcha<Long, azvo> dchaVar = azwyVar.h;
        for (azxk azxkVar : list3) {
            akqi b = azxkVar.b();
            if (!akqi.d(b)) {
                t = azxkVar.e(null);
                c = null;
            } else {
                t = azxkVar.t();
                c = azxkVar.c();
            }
            dolk r = azxkVar.r();
            dbsk.s(r);
            if ((r.a & 4) != 0) {
                akqq d = azxkVar.d();
                dbsk.s(b);
                azwq t6 = azwv.t(b, d, t, c);
                t6.h(true);
                ((azve) t6).h = !akqi.d(b) ? null : dchaVar.d(Long.valueOf(b.c));
                dbsk.s(b);
                t6.j(azwyVar.b(b, d, N, dcwgVar));
                F.g(t6.i());
            }
        }
        Iterator<Collection<azvo>> it2 = azwyVar.h.L().values().iterator();
        while (it2.hasNext()) {
            List<azvo> list4 = (List) it2.next();
            azvo azvoVar2 = list4.get(0);
            akqi b2 = azvoVar2.b();
            akqq d2 = azvoVar2.d();
            dbsk.s(d2);
            azwq t7 = azwv.t(b2, d2, azvoVar2.c(), azvoVar2.c());
            ((azve) t7).h = list4;
            akqi b3 = azvoVar2.b();
            akqq d3 = azvoVar2.d();
            dbsk.s(d3);
            t7.j(azwyVar.b(b3, d3, N, dcwgVar));
            F.g(t7.i());
        }
        HashSet<Long> hashSet = new HashSet();
        hashSet.addAll(N.J());
        for (Long l : hashSet) {
            F.g(azwyVar.a((baal) N.c(l).get(0), azwyVar.c(l, N)));
        }
        for (dcvr<dcwf<baal>> a5 = dcwgVar.a(); !a5.k(); a5 = dcwgVar.a()) {
            baal baalVar2 = a5.g().b;
            baak z = baalVar2.z();
            dbsk.s(z);
            F.g(azwyVar.a(baalVar2, azwyVar.d(z.b(), dcwgVar)));
        }
        this.e.a().f(F.f());
        this.s.e();
        this.c.b(new gdu());
        a.b();
    }

    public final void K(List<byte[]> list, List<String> list2, azwm<?> azwmVar, final azkm azkmVar, bvrj bvrjVar) {
        final String sb;
        Application application = this.p;
        String e = azwmVar.e(application);
        if (list2.isEmpty()) {
            sb = application.getString(R.string.MY_PLACES_DELETE_CONFIRM, TextUtils.htmlEncode(e));
        } else {
            String string = application.getString(R.string.MY_PLACES_DELETE_PLACE_CONFIRM, TextUtils.htmlEncode(e));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append("<br/>");
            for (String str : list2) {
                sb2.append("<br/>");
                sb2.append(TextUtils.htmlEncode(str));
            }
            sb = sb2.toString();
        }
        final azwf azwfVar = new azwf(azwmVar, list);
        this.a.b(new Runnable(azkmVar, sb, azwfVar) { // from class: azkz
            private final String a;
            private final azwf b;
            private final azkm c;

            {
                this.c = azkmVar;
                this.a = sb;
                this.b = azwfVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azkm azkmVar2 = this.c;
                String str2 = this.a;
                azwf azwfVar2 = this.b;
                azko azkoVar = azkmVar2.a;
                azkoVar.c = azwfVar2;
                azkoVar.b.getButton(-1).setEnabled(true);
                azkoVar.b.setMessage(Html.fromHtml(str2));
            }
        }, bvrjVar);
    }

    public final void L(final azwm<?> azwmVar, final azkn azknVar, final bvrj bvrjVar) {
        this.b.b(new Runnable(this, azwmVar, azknVar, bvrjVar) { // from class: azla
            private final azlv a;
            private final azwm b;
            private final bvrj c;
            private final azkn d;

            {
                this.a = this;
                this.b = azwmVar;
                this.d = azknVar;
                this.c = bvrjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azlv azlvVar = this.a;
                azwm azwmVar2 = this.b;
                final azkn azknVar2 = this.d;
                bvrj bvrjVar2 = this.c;
                dcpd<azwd<?>> it = azwd.b.iterator();
                while (it.hasNext()) {
                    azwd<?> next = it.next();
                    azks azksVar = azlvVar.g;
                    try {
                        azksVar.d.a(new azkp(azksVar, next, azwmVar2.m));
                    } catch (azom | batj unused) {
                    }
                }
                azlvVar.c.b(new azrd(3, azwd.b));
                azlvVar.H();
                bvrb bvrbVar = azlvVar.a;
                azknVar2.getClass();
                bvrbVar.b(new Runnable(azknVar2) { // from class: azlb
                    private final azkn a;

                    {
                        this.a = azknVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        azkn azknVar3 = this.a;
                        int i = azko.e;
                        azknVar3.a.b.dismiss();
                        nvl nvlVar = azknVar3.a.d;
                        if (nvlVar != null) {
                            nvlVar.a.e.c();
                        }
                    }
                }, bvrjVar2);
            }
        });
    }

    @Override // defpackage.akpi
    @dzsi
    public final akqs a() {
        akqq akqqVar;
        akqr a = akqs.a();
        dcdc<azva> dcdcVar = this.k;
        int size = dcdcVar.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            azva azvaVar = dcdcVar.get(i2);
            if ((azvaVar.a == dndr.HOME || azvaVar.a == dndr.WORK) && (akqqVar = azvaVar.e) != null) {
                a.d(akqqVar);
                i++;
            }
        }
        if (i < 2) {
            return null;
        }
        return a.b();
    }

    @Override // defpackage.axwq
    @dzsi
    public final String b() {
        dnwb a = this.w.a();
        if ((a.a & 2) != 0) {
            return a.c;
        }
        return null;
    }

    @Override // defpackage.axwq
    public final void c(String str) {
        if (!dbsj.d(str)) {
            this.w.e(str);
        }
    }

    @Override // defpackage.axwq
    public final boolean d() {
        return this.i.a().c();
    }

    @Override // defpackage.axwq
    public final dehn<Boolean> e() {
        final azhi a = this.i.a();
        return deew.g(a.l.c(new Callable(a) { // from class: azha
            private final azhi a;

            {
                this.a = a;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.a.c());
            }
        }), new defg(a) { // from class: azhb
            private final azhi a;

            {
                this.a = a;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                Boolean bool = (Boolean) obj;
                return (bool == null || !bool.booleanValue()) ? this.a.H : deha.a(true);
            }
        }, dege.a);
    }

    @Override // defpackage.axwq
    public final dehn<Boolean> f() {
        return this.e.a().i();
    }

    @Override // defpackage.axwq
    public final <T extends azwm<T>> dcdc<T> g(azxm<T> azxmVar) {
        return this.h.a(azxmVar);
    }

    @Override // defpackage.axwq
    public final <T extends azwm<T>> dcdc<T> h(azxm<T> azxmVar, akqq akqqVar) {
        List<aznp> e;
        bvrj.UI_THREAD.d();
        try {
            String[] strArr = {Integer.toString(azxl.STARRED_PLACE.n), Integer.toString(aznp.a(akqqVar.a)), Integer.toString(aznp.a(akqqVar.b)), Integer.toString(aznl.DELETE.e)};
            synchronized (aznn.class) {
                Cursor c = aznn.c("corpus = ? AND latitude_e6 = ? AND longitude_e6 = ? AND feature_fprint IS NULL AND sync_state != ? ", strArr, null);
                try {
                    e = aznn.e(c);
                    if (c != null) {
                        c.close();
                    }
                } catch (Throwable th) {
                    if (c != null) {
                        try {
                            c.close();
                        } catch (Throwable th2) {
                            deki.a(th, th2);
                        }
                    }
                    throw th;
                }
            }
            return azof.d(azxmVar, e);
        } catch (azom e2) {
            throw new axxc("Read transaction error.", e2);
        }
    }

    @Override // defpackage.axwq
    public final <T extends azwm<T>> dcdc<T> i(azxm<T> azxmVar, akqi akqiVar) {
        bvrj.UI_THREAD.d();
        return azof.p(azxmVar, akqiVar.n());
    }

    @Override // defpackage.axwq
    public final dehn<Boolean> j() {
        batm batmVar = this.b;
        final azof azofVar = this.h;
        azofVar.getClass();
        return batmVar.c(new Callable(azofVar) { // from class: azlk
            private final azof a;

            {
                this.a = azofVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(azof.t());
            }
        });
    }

    @Override // defpackage.axwq
    public final dbsg<azva> k(akqi akqiVar) {
        final long j = akqiVar.c;
        return j == 0 ? dbpy.a : dcbg.b(this.k).r(new dbsl(j) { // from class: azll
            private final long a;

            {
                this.a = j;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                long j2 = this.a;
                azva azvaVar = (azva) obj;
                dbsk.s(azvaVar);
                return azvaVar.c.c == j2;
            }
        });
    }

    @Override // defpackage.axwq
    public final dbsg<azva> l(final akqq akqqVar) {
        return akqqVar == null ? dbpy.a : dcbg.b(this.k).r(new dbsl(akqqVar) { // from class: azlm
            private final akqq a;

            {
                this.a = akqqVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                akqq akqqVar2 = this.a;
                azva azvaVar = (azva) obj;
                dbsk.s(azvaVar);
                return azvaVar.j(akqqVar2);
            }
        });
    }

    @Override // defpackage.axwq
    public final dehn<dcdc<azva>> m() {
        return this.b.c(new Callable(this) { // from class: azln
            private final azlv a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.D();
            }
        });
    }

    @Override // defpackage.axwq
    public final dcdc<azva> n() {
        return this.k;
    }

    @Override // defpackage.axwq
    public final List<azvo> o(akqi akqiVar) {
        if (this.l.m(Long.valueOf(akqiVar.c))) {
            return this.l.h(Long.valueOf(akqiVar.c));
        }
        return dcdc.e();
    }

    @Override // defpackage.axwq
    public final <T extends azwm<T>> dehn<T> p(final azxm<T> azxmVar, final T t) {
        return this.b.c(new Callable(this, t, azxmVar) { // from class: azlo
            private final azlv a;
            private final azwm b;
            private final azxm c;

            {
                this.a = this;
                this.b = t;
                this.c = azxmVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                azlv azlvVar = this.a;
                azwm azwmVar = this.b;
                azxm azxmVar2 = this.c;
                azlvVar.i.a().a();
                azlvVar.f.a().a(azwmVar);
                return azlvVar.h.g(azxmVar2, azwmVar);
            }
        });
    }

    @Override // defpackage.axwq
    public final <T extends azwm<T>> dehn<Boolean> q(final T t) {
        return this.b.c(new Callable(this, t) { // from class: azlp
            private final azlv a;
            private final azwm b;

            {
                this.a = this;
                this.b = t;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                azlv azlvVar = this.a;
                azwm<?> azwmVar = this.b;
                boolean j = azlvVar.h.j(azwmVar);
                if (j) {
                    azlvVar.i.a().a();
                    azlvVar.f.a().c(azwmVar);
                }
                return Boolean.valueOf(j);
            }
        });
    }

    @Override // defpackage.axwq
    public final void r() {
        this.b.b(new Runnable(this) { // from class: azkx
            private final azlv a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.F();
            }
        });
    }

    @Override // defpackage.axwq
    public final void s(@dzsi axxd axxdVar) {
        this.i.a().b(axxdVar);
    }

    @Override // defpackage.axwq
    public final <T> void t(dehn<T> dehnVar) {
        deha.q(dehnVar, new azlu(this), dege.a);
    }

    @Override // defpackage.axwq
    public final void u() {
        final azhi a = this.i.a();
        if (a.I != null) {
            a.c.a(a.I);
            a.I = null;
        }
        BroadcastReceiver broadcastReceiver = a.J;
        if (broadcastReceiver != null) {
            a.d.unregisterReceiver(broadcastReceiver);
            a.J = null;
        }
        a.k.b(new Runnable(a) { // from class: azgw
            private final azhi a;

            {
                this.a = a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azhi azhiVar = this.a;
                synchronized (azhiVar.A) {
                    azhiVar.e.b(false);
                    azhiVar.d();
                }
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // defpackage.axwq
    public final void v() {
        synchronized (this.m) {
            dbsk.l(this.y >= 0);
            this.y++;
            I();
        }
    }

    @Override // defpackage.axwq
    public final void w() {
        synchronized (this.m) {
            dbsk.l(this.y > 0);
            this.y--;
            I();
        }
    }

    @Override // defpackage.axwq
    public final axwb x() {
        return this.r;
    }

    @Override // defpackage.axwq
    public final axxf y() {
        return this.s;
    }

    @Override // defpackage.axwq
    public final void z(final int i) {
        final azhi a = this.i.a();
        if (a.I == null) {
            a.I = new azhf(a);
            btrm btrmVar = a.c;
            azhf azhfVar = a.I;
            dceq a2 = dcet.a();
            a2.b(gds.class, new azhk(gds.class, azhfVar));
            btrmVar.g(azhfVar, a2.a());
        }
        if (a.J == null) {
            a.J = new azhe(a);
            a.d.registerReceiver(a.J, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        a.k.b(new Runnable(a, i) { // from class: azgv
            private final azhi a;
            private final int b;

            {
                this.a = a;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azhi azhiVar = this.a;
                int i2 = this.b;
                synchronized (azhiVar.A) {
                    boolean c = azhiVar.e.c();
                    azhiVar.e.b(true);
                    if (azhiVar.E.get() != Long.MIN_VALUE && azhiVar.E.get() > azhiVar.h.b()) {
                        azhiVar.E.set(Long.MIN_VALUE);
                    }
                    if (!azhiVar.i.j().l()) {
                        return;
                    }
                    azhiVar.e.a();
                    if (azhiVar.e.a) {
                        boolean z = false;
                        try {
                            if (azof.t() && !c) {
                                z = true;
                            }
                        } catch (axxc unused) {
                        }
                        azhiVar.i(azxm.n, 0L, null, !z, i2);
                    }
                }
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }
}
