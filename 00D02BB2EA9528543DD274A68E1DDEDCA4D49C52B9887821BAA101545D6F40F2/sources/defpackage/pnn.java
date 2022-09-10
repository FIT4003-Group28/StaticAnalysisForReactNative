package defpackage;

import android.content.Context;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: pnn  reason: default package */
/* loaded from: classes.dex */
public final class pnn implements pnq {
    public final dehp a;
    public final dxio<cvin> b;
    public volatile pnm c = new pnl().a();
    private final Context d;

    public pnn(dehp dehpVar, dxio<cvin> dxioVar, Context context) {
        this.a = dehpVar;
        this.b = dxioVar;
        this.d = context;
    }

    public static String k(int i) {
        return String.format(Locale.US, "manifest_%d.json", Integer.valueOf(i));
    }

    public static String l(int i) {
        return String.format(Locale.US, "customization_%d.json", Integer.valueOf(i));
    }

    @Override // defpackage.pnq
    public final degp<dcdc<pns>> a(final String str, final String str2, final int i) {
        return (degp) deew.h(deew.g(degp.q(this.a.a(new Runnable(this, i) { // from class: pmt
            private final pnn a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.m(this.b);
            }
        })), new defg(this, str, str2, i) { // from class: pnc
            private final pnn a;
            private final String b;
            private final String c;
            private final int d;

            {
                this.a = this;
                this.b = str;
                this.c = str2;
                this.d = i;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                pnn pnnVar = this.a;
                String str3 = this.b;
                String str4 = this.c;
                int i2 = this.d;
                String valueOf = String.valueOf(str3);
                String valueOf2 = String.valueOf(str4);
                return pnnVar.r(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), pnn.k(i2));
            }
        }, this.a), new dbrn(this, i) { // from class: pnd
            private final pnn a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Void r3 = (Void) obj;
                return (dcdc) this.a.g(this.b).h(pmw.a).c(dcdc.e());
            }
        }, this.a);
    }

    @Override // defpackage.pnq
    public final degp<String> b(final String str, String str2, final int i) {
        return (degp) deew.g(a(str, str2, i), new defg(this, str, i) { // from class: pne
            private final pnn a;
            private final String b;
            private final int c;

            {
                this.a = this;
                this.b = str;
                this.c = i;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                pnn pnnVar = this.a;
                String str3 = this.b;
                dcdc dcdcVar = (dcdc) obj;
                return deew.g(degp.q(pnnVar.a.c(new Callable(pnnVar, this.c) { // from class: pmx
                    private final pnn a;
                    private final int b;

                    {
                        this.a = pnnVar;
                        this.b = r2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        pnn pnnVar2 = this.a;
                        int i2 = this.b;
                        dbsg<pny> g = pnnVar2.g(i2);
                        if (!g.a() || !g.b().b().a()) {
                            pnnVar2.m(i2);
                            throw new Exception("Manifest not present or empty.");
                        }
                        return g.b().b().b();
                    }
                })), new defg(pnnVar, str3) { // from class: pmy
                    private final pnn a;
                    private final String b;

                    {
                        this.a = pnnVar;
                        this.b = str3;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj2) {
                        final pob pobVar = (pob) obj2;
                        return deew.h(this.a.q(pobVar, this.b), new dbrn(pobVar) { // from class: pnb
                            private final pob a;

                            {
                                this.a = pobVar;
                            }

                            @Override // defpackage.dbrn
                            public final Object a(Object obj3) {
                                Void r2 = (Void) obj3;
                                return this.a.c.b();
                            }
                        }, dege.a);
                    }
                }, pnnVar.a);
            }
        }, this.a);
    }

    @Override // defpackage.pnq
    public final degp<Void> c(final String str, String str2, final int i, final String str3) {
        return (degp) deew.g(a(str, str2, i), new defg(this, str, i, str3) { // from class: pnf
            private final pnn a;
            private final String b;
            private final int c;
            private final String d;

            {
                this.a = this;
                this.b = str;
                this.c = i;
                this.d = str3;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dcdc dcdcVar = (dcdc) obj;
                return this.a.p(this.b, this.c, this.d);
            }
        }, this.a);
    }

    @Override // defpackage.pnq
    public final degp<pnv> d(final String str, final akvl akvlVar, final int i, final String str2) {
        return degp.q(this.a.c(new Callable(this, i, str, str2, akvlVar) { // from class: png
            private final pnn a;
            private final int b;
            private final String c;
            private final String d;
            private final akvl e;

            {
                this.a = this;
                this.b = i;
                this.c = str;
                this.d = str2;
                this.e = akvlVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                aksm aksmVar;
                pnn pnnVar = this.a;
                int i2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                akvl akvlVar2 = this.e;
                pnnVar.g(i2);
                pnm pnmVar = pnnVar.c;
                if (!pnmVar.a(i2, str3).a()) {
                    throw new Exception(String.format("Model \"%s\" not found", str3));
                }
                poc pocVar = new poc(str4, new File(pnnVar.j(), "model.dat"));
                pnm pnmVar2 = pnnVar.c;
                if (pnmVar2.a(i2, str3).a()) {
                    dcdg p = dcdn.p();
                    for (Map.Entry<pnu, String> entry : pnmVar2.a(i2, str3).b().h.entrySet()) {
                        pnu key = entry.getKey();
                        if (key != null) {
                            String value = entry.getValue();
                            byte[] a = pocVar.a(value);
                            if (a.length != 0) {
                                try {
                                    File file = new File(pnnVar.i(), value);
                                    if (!file.exists()) {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(a);
                                        fileOutputStream.close();
                                    }
                                    p.f(key, file.getAbsolutePath());
                                } catch (IOException unused) {
                                }
                            }
                        }
                    }
                    pnl pnlVar = new pnl(pnnVar.c);
                    pnlVar.b = p.b();
                    pnnVar.c = pnlVar.a();
                }
                pnm pnmVar3 = pnnVar.c;
                if (pnmVar3.a(i2, str3).a()) {
                    pob b = pnmVar3.a(i2, str3).b();
                    if (!b.e.isEmpty()) {
                        dccx dccxVar = new dccx();
                        for (String str5 : b.e) {
                            byte[] a2 = pocVar.a(str5);
                            if (a2.length != 0) {
                                dccxVar.g(new ByteArrayInputStream(a2));
                            }
                        }
                        dcdc f = dccxVar.f();
                        if (!b.f) {
                            byte[] a3 = pocVar.a(b.i.b());
                            if (f.isEmpty() || a3.length == 0) {
                                aksmVar = aksm.t;
                            } else {
                                dcdg dcdgVar = new dcdg();
                                Iterator<Map.Entry<String, String>> it = b.g.entrySet().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Map.Entry<String, String> next = it.next();
                                        byte[] a4 = pocVar.a(next.getValue());
                                        if (a4.length == 0) {
                                            aksmVar = aksm.t;
                                            break;
                                        }
                                        dcdgVar.f(next.getKey(), new ByteArrayInputStream(a4));
                                    } else {
                                        aksmVar = akvlVar2.c(f, new ByteArrayInputStream(a3), dcdgVar.b());
                                        break;
                                    }
                                }
                            }
                        } else {
                            aksmVar = akvlVar2.a((InputStream) f.get(0));
                        }
                    } else {
                        aksmVar = aksm.t;
                    }
                } else {
                    aksmVar = aksm.t;
                }
                return new pno(aksmVar, pnmVar.a(i2, str3).b());
            }
        }));
    }

    @Override // defpackage.pnq
    public final degp<Void> e(final String str, final int i) {
        return degp.q(this.a.c(new Callable(this, i, str) { // from class: pmv
            private final pnn a;
            private final int b;
            private final String c;

            {
                this.a = this;
                this.b = i;
                this.c = str;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                pnn pnnVar = this.a;
                int i2 = this.b;
                String str2 = this.c;
                try {
                    File file = new File(pnnVar.j(), pnn.l(i2));
                    if (file.exists()) {
                        file.delete();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(str2.getBytes());
                    fileOutputStream.close();
                    pnnVar.h(i2);
                    return null;
                } catch (IOException unused) {
                    return null;
                }
            }
        }));
    }

    public final void f() {
        this.c = new pnl().a();
        n();
        o();
    }

    public final dbsg<pny> g(int i) {
        pnm pnmVar = this.c;
        dcdn<Integer, pny> dcdnVar = pnmVar.a;
        Integer valueOf = Integer.valueOf(i);
        if (dcdnVar.containsKey(valueOf)) {
            return dbsg.j(pnmVar.a.get(valueOf));
        }
        return h(i);
    }

    public final dbsg<pny> h(int i) {
        dbsg<pny> dbsgVar;
        File file = new File(j(), k(i));
        File file2 = new File(j(), l(i));
        dbsg i2 = file2.exists() ? dbsg.i(file2) : dbpy.a;
        try {
            dbsgVar = dbsg.i(new pny(pny.c(file), i2.a() ? dbsg.i(pny.c((File) i2.b())) : dbpy.a, i));
        } catch (IOException unused) {
            dbsgVar = dbpy.a;
        }
        if (dbsgVar.a()) {
            pnl pnlVar = new pnl(this.c);
            pnlVar.a.put(Integer.valueOf(i), dbsgVar.b());
            this.c = pnlVar.a();
            return dbsgVar;
        }
        return dbpy.a;
    }

    public final File i() {
        File file = new File(this.d.getCacheDir(), "customchevron_sounds");
        file.mkdir();
        return file;
    }

    public final File j() {
        File file = this.c.b;
        if (file != null) {
            return file;
        }
        File dir = this.d.getDir("customchevron", 0);
        pnl pnlVar = new pnl(this.c);
        pnlVar.c = dir;
        this.c = pnlVar.a();
        return dir;
    }

    public final void m(int i) {
        new File(j(), k(i)).delete();
        new File(j(), l(i)).delete();
    }

    public final void n() {
        bvog.m(j());
        pnl pnlVar = new pnl(this.c);
        pnlVar.c = null;
        this.c = pnlVar.a();
    }

    public final void o() {
        bvog.m(i());
        pnl pnlVar = new pnl(this.c);
        pnlVar.b = dcmn.a;
        this.c = pnlVar.a();
    }

    @Override // defpackage.pnq
    public final degp<Void> p(final String str, final int i, final String str2) {
        return (degp) deew.g(degp.q(this.a.c(new Callable(this, i, str2) { // from class: pmz
            private final pnn a;
            private final int b;
            private final String c;

            {
                this.a = this;
                this.b = i;
                this.c = str2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                pnn pnnVar = this.a;
                int i2 = this.b;
                String str3 = this.c;
                dbsg<pny> g = pnnVar.g(i2);
                if (!g.a() || !g.b().a(str3).a()) {
                    pnnVar.m(i2);
                    throw new Exception("Manifest not present or empty.");
                }
                return g.b().a(str3).b();
            }
        })), new defg(this, str) { // from class: pna
            private final pnn a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                return this.a.q((pob) obj, this.b);
            }
        }, dege.a);
    }

    public final degp<Void> q(pob pobVar, final String str) {
        dbsg<V> h = pobVar.d.h(new dbrn(str) { // from class: poa
            private final String a;

            {
                this.a = str;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                String valueOf = String.valueOf(this.a);
                String valueOf2 = String.valueOf((String) obj);
                return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            }
        });
        if (!h.a() || !pobVar.c.a()) {
            f();
            return degp.q(deha.b(new IllegalStateException("Model not present.")));
        }
        new File(j(), "model.dat").delete();
        return r((String) h.b(), "model.dat");
    }

    public final degp<Void> r(String str, String str2) {
        deig d = deig.d();
        cvie a = this.b.a().a(str, j(), str2, new pnk(d, str));
        a.f(cvid.WIFI_OR_CELLULAR);
        a.d();
        return degp.q(d);
    }

    @Override // defpackage.pnq
    public final void s() {
        degp.q(this.a.a(new Runnable(this) { // from class: pnh
            private final pnn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                pnn pnnVar = this.a;
                pnnVar.b.a().e(pnnVar.j(), "model.dat");
                pnnVar.f();
            }
        }));
    }

    @Override // defpackage.pnq
    public final void t() {
        degp.q(this.a.a(new Runnable(this) { // from class: pmu
            private final pnn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.o();
            }
        }));
    }

    @Override // defpackage.pnq
    public final void u() {
        degp.q(this.a.a(new Runnable(this) { // from class: pnj
            private final pnn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.n();
            }
        }));
    }

    @Override // defpackage.pnq
    public final void v(final int i) {
        degp.q(this.a.a(new Runnable(this, i) { // from class: pni
            private final pnn a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.m(this.b);
            }
        }));
    }
}
