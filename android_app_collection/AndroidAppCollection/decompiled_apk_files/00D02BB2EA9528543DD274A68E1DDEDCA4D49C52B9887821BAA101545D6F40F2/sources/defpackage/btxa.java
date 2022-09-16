package defpackage;

import android.content.Context;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: btxa  reason: default package */
/* loaded from: classes.dex */
public final class btxa implements btwr {
    public final dxio<akfa> a;
    public final btwm b;
    public final Executor c;
    public final affr d;
    public final dxio<ckcw> e;
    public final cqat f;
    public final btwj g;
    public final btwk l;
    private final btxk m;
    private final dxio<afeh> n;
    private final dxio<btxm> o;
    private final bvjj p;
    public int k = 1;
    public volatile long h = 0;
    public final CountDownLatch i = new CountDownLatch(0);
    public boolean j = false;

    public btxa(dxio dxioVar, btwm btwmVar, btxk btxkVar, btwk btwkVar, btwj btwjVar, Executor executor, dxio dxioVar2, dxio dxioVar3, affr affrVar, bvjj bvjjVar, dxio dxioVar4, cqat cqatVar) {
        this.a = dxioVar;
        this.b = btwmVar;
        this.m = btxkVar;
        this.l = btwkVar;
        this.g = btwjVar;
        this.c = executor;
        this.n = dxioVar2;
        this.o = dxioVar3;
        this.d = affrVar;
        this.p = bvjjVar;
        this.e = dxioVar4;
        this.f = cqatVar;
    }

    @Override // defpackage.btph
    public final synchronized void NX(String str, PrintWriter printWriter) {
        printWriter.println(str.concat("ClientParametersManager:"));
        int i = this.k;
        String a = btwz.a(i);
        if (i != 0) {
            StringBuilder sb = new StringBuilder(str.length() + 10 + a.length());
            sb.append(str);
            sb.append("  Status: ");
            sb.append(a);
            printWriter.println(sb.toString());
            int i2 = this.k;
            StringBuilder sb2 = new StringBuilder(str.length() + 20);
            sb2.append(str);
            sb2.append("  Initialized: ");
            sb2.append(btwz.c(i2));
            printWriter.println(sb2.toString());
            int i3 = this.k;
            StringBuilder sb3 = new StringBuilder(str.length() + 14);
            sb3.append(str);
            sb3.append("  Ready: ");
            sb3.append(btwz.b(i3));
            printWriter.println(sb3.toString());
            String str2 = true != this.j ? "set to default" : "loaded from cache";
            StringBuilder sb4 = new StringBuilder(str.length() + 21 + str2.length());
            sb4.append(str);
            sb4.append("  Initial parameters ");
            sb4.append(str2);
            printWriter.println(sb4.toString());
            btwj btwjVar = this.g;
            String concat = str.concat("  ");
            printWriter.println(String.valueOf(concat).concat("ClientParametersBase:"));
            String concat2 = String.valueOf(concat).concat("  ");
            printWriter.println(String.valueOf(concat2).concat("Enroute categories:"));
            int i4 = 0;
            int i5 = 0;
            for (dupr duprVar : btvn.f(btwjVar).e) {
                String str3 = duprVar.c;
                StringBuilder sb5 = new StringBuilder(String.valueOf(concat2).length() + 24 + String.valueOf(str3).length());
                sb5.append(concat2);
                sb5.append("  display[");
                sb5.append(i5);
                sb5.append("]: ");
                sb5.append(str3);
                printWriter.println(sb5.toString());
                String str4 = duprVar.d;
                StringBuilder sb6 = new StringBuilder(String.valueOf(concat2).length() + 22 + String.valueOf(str4).length());
                sb6.append(concat2);
                sb6.append("  query[");
                sb6.append(i5);
                sb6.append("]: ");
                sb6.append(str4);
                printWriter.println(sb6.toString());
                i5++;
            }
            printWriter.println(String.valueOf(concat2).concat("Enroute categories (EV):"));
            for (dupr duprVar2 : btvn.f(btwjVar).h) {
                String str5 = duprVar2.c;
                StringBuilder sb7 = new StringBuilder(String.valueOf(concat2).length() + 24 + String.valueOf(str5).length());
                sb7.append(concat2);
                sb7.append("  display[");
                sb7.append(i4);
                sb7.append("]: ");
                sb7.append(str5);
                printWriter.println(sb7.toString());
                String str6 = duprVar2.d;
                StringBuilder sb8 = new StringBuilder(String.valueOf(concat2).length() + 22 + String.valueOf(str6).length());
                sb8.append(concat2);
                sb8.append("  query[");
                sb8.append(i4);
                sb8.append("]: ");
                sb8.append(str6);
                printWriter.println(sb8.toString());
                i4++;
            }
        } else {
            throw null;
        }
    }

    @Override // defpackage.btwr
    public final btvo a() {
        return this.g;
    }

    @Override // defpackage.btwr
    public final btvo b(btlu btluVar) {
        btlu.h(btluVar);
        return this.g;
    }

    @Override // defpackage.btwr
    public final boolean d() {
        return this.b.d();
    }

    @Override // defpackage.btwr
    public final boolean e() {
        return this.b.f();
    }

    @Override // defpackage.btwr
    public final synchronized String f() {
        StringBuilder sb;
        String sb2;
        sb = new StringBuilder();
        sb.append("Status: ");
        int i = this.k;
        String a = btwz.a(i);
        if (i != 0) {
            sb.append(a);
            sb.append('\n');
            sb.append("Initialized: ");
            sb.append(btwz.c(this.k));
            sb.append('\n');
            sb.append("Ready: ");
            sb.append(btwz.b(this.k));
            sb.append('\n');
            sb.append("Initial parameters ");
            sb.append(true != this.j ? "set to default" : "loaded from cache");
            sb.append('\n');
            sb.append('\n');
            btxk btxkVar = this.m;
            synchronized (btxkVar.e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Last updated ");
                if (btxkVar.i == 0) {
                    sb3.append("(never)\n");
                } else {
                    sb3.append(btxkVar.d(btxkVar.d.b() - btxkVar.i));
                    sb3.append(" ago");
                    if (!btxkVar.k.isEmpty()) {
                        sb3.append(" (");
                        sb3.append(btxkVar.k);
                        sb3.append(')');
                    }
                    sb3.append('\n');
                }
                long b = btxkVar.j - btxkVar.d.b();
                if (b > 0) {
                    sb3.append("Next update in ");
                    sb3.append(btxkVar.d(b));
                    sb3.append('\n');
                } else {
                    sb3.append("Next update happening now\n");
                }
                sb3.append("Number of update cycles: ");
                sb3.append(btxkVar.l);
                sb3.append('\n');
                sb3.append("Account: ");
                sb3.append(btxkVar.g.t());
                sb3.append('\n');
                sb3.append("Locale: ");
                sb3.append(btxkVar.h);
                sb3.append('\n');
                sb2 = sb3.toString();
            }
            sb.append(sb2);
        } else {
            throw null;
        }
        return sb.toString();
    }

    @Override // defpackage.btwr
    public final void g() {
        btxk btxkVar = this.m;
        synchronized (btxkVar.e) {
            if (btxkVar.p != 3) {
                btxkVar.p = 2;
                return;
            }
            String name = Thread.currentThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 26);
            sb.append("forced update from ");
            sb.append(name);
            sb.append(" thread");
            btxkVar.a(0L, sb.toString());
        }
    }

    @Override // defpackage.btwr
    public final btvo h() {
        return this.g;
    }

    @Override // defpackage.btwr
    public final void i(Locale locale, @dzsi btzi<dunb, dund> btziVar) {
        btxm a = this.o.a();
        btwm btwmVar = this.b;
        buac a2 = a.c.a().a();
        a2.b();
        a2.e = null;
        ckcq a3 = ((ckcr) a.e.a().a(ckfn.m)).a();
        Context context = a.a;
        dxio<btxn> dxioVar = a.d;
        duna bZ = dunb.f.bZ();
        List<dvgn> asList = Arrays.asList(dvgn.values());
        ArrayList arrayList = new ArrayList(asList.size());
        for (dvgn dvgnVar : asList) {
            dvgl bZ2 = dvgo.bZ.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dvgo dvgoVar = (dvgo) bZ2.b;
            dvgoVar.b = dvgnVar.ct;
            dvgoVar.a |= 1;
            arrayList.add(bZ2.bK());
        }
        bZ.a(arrayList);
        dumy bZ3 = dumz.i.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dumz.c((dumz) bZ3.b);
        boolean a4 = btxd.a(context);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dumz dumzVar = (dumz) bZ3.b;
        dumzVar.a |= 2;
        dumzVar.c = a4;
        dumz.e(dumzVar);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dumz.f((dumz) bZ3.b);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dumz dumzVar2 = (dumz) bZ3.b;
        dumzVar2.a |= 64;
        dumzVar2.h = false;
        dmxb a5 = dxioVar.a().a(dmxf.g, locale);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dumz dumzVar3 = (dumz) bZ3.b;
        a5.getClass();
        dumzVar3.f = a5;
        dumzVar3.a |= 16;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dunb dunbVar = (dunb) bZ.b;
        dumz bK = bZ3.bK();
        bK.getClass();
        dunbVar.c = bK;
        dunbVar.a |= 1;
        a.c.a().c().b((dunb) bZ.bK(), new btxl(a, a3, locale, btwmVar, btziVar), a.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b A[Catch: all -> 0x011b, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x002b, B:7:0x0031, B:18:0x0059, B:22:0x0061, B:23:0x006a, B:33:0x00b5, B:35:0x00bf, B:37:0x00c7, B:39:0x00d9, B:42:0x00eb, B:44:0x00f1, B:46:0x0113, B:11:0x0040, B:13:0x0046, B:15:0x004c, B:24:0x006b, B:28:0x0096, B:29:0x00a4, B:31:0x00aa, B:32:0x00b4, B:27:0x0090), top: B:59:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void j(defpackage.btyu r13) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btxa.j(btyu):void");
    }

    public final synchronized void k(int i) {
        this.k = i;
        if (btwz.b(i)) {
            notifyAll();
        }
    }
}
