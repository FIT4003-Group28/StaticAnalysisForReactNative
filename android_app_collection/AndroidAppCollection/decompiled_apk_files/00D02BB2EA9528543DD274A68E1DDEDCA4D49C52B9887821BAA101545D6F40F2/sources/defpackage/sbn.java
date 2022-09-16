package defpackage;

import android.animation.AnimatorSet;
import android.app.Application;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: sbn  reason: default package */
/* loaded from: classes7.dex */
public class sbn extends sep implements sab, sar {
    private final sfc g;
    private final List<saa> h;
    private final boolean i;
    private boolean j;

    public sbn(Application application, sfd sfdVar, qjk qjkVar, cqhn cqhnVar, sbm sbmVar, sev sevVar, sei seiVar, dehq dehqVar, cpv cpvVar, boolean z, boolean z2, rzp rzpVar) {
        super(application, cqhnVar, qjkVar, sfdVar, sevVar, seiVar, dehqVar, cpvVar, rzpVar);
        this.g = sfdVar.b(application.getString(rny.ADVANCED_SCHEDULE_HEADING), dtxl.bZ, dtxl.ck, rzpVar);
        this.h = new ArrayList();
        this.i = z;
        this.j = true;
        this.e = false;
        dpol c = sht.c(application);
        for (int i = 0; i < 7; i++) {
            dpol d = sht.d(c, i);
            List<saa> list = this.h;
            Application a = sbmVar.a.a();
            sbm.a(a, 1);
            cqhn a2 = sbmVar.b.a();
            sbm.a(a2, 2);
            cqhu a3 = sbmVar.c.a();
            sbm.a(a3, 3);
            rzn a4 = sbmVar.d.a();
            sbm.a(a4, 4);
            sbm.a(d, 5);
            list.add(new sbl(a, a2, a3, a4, d, i));
        }
    }

    @Override // defpackage.sep, defpackage.jbk
    public jib NC() {
        return this.g.e().b();
    }

    @Override // defpackage.sab
    public List<saa> b() {
        return this.h;
    }

    @Override // defpackage.sab
    public void c(dpol dpolVar, Boolean bool, dngu dnguVar, dngu dnguVar2) {
        for (saa saaVar : this.h) {
            if (bool.booleanValue() || saaVar.j().equals(dpolVar)) {
                saaVar.e(dnguVar);
                saaVar.f(dnguVar2);
                if (saaVar.b().booleanValue()) {
                    saaVar.n(true);
                }
            }
            saaVar.d(bool.booleanValue());
        }
        this.e = true;
        cqkx.p(this);
        ArrayList arrayList = new ArrayList();
        for (saa saaVar2 : this.h) {
            if (saaVar2.b().booleanValue() && saaVar2.o().booleanValue()) {
                arrayList.add(saaVar2.i());
            }
        }
        if (!arrayList.isEmpty()) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r9.j == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        r0 = i().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r0.hasNext() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        r1 = r0.next();
        r3 = r9.h.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r3.hasNext() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
        r4 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r4.j().equals(r1.a()) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        r1.d(r4.b().booleanValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        r0 = r9.h.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
        if (r0.hasNext() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
        r1 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r1.b().booleanValue() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
        j().h(r1.g());
        k().h(r1.h());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
        r0 = j().d().b();
        r1 = k().d().b();
        r3 = r9.h.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:
        if (r3.hasNext() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
        r4 = r3.next();
        r5 = i().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
        if (r5.hasNext() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
        r6 = r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e4, code lost:
        if (r4.j().equals(r6.a()) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e6, code lost:
        r4.c(r6.e().booleanValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f1, code lost:
        r5 = defpackage.dngu.e.bZ();
        r6 = r0.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ff, code lost:
        if (r5.c == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0101, code lost:
        r5.bF();
        r5.c = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0106, code lost:
        r7 = (defpackage.dngu) r5.b;
        r7.a |= 1;
        r7.b = r6;
        r6 = r0.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0118, code lost:
        if (r5.c == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011a, code lost:
        r5.bF();
        r5.c = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011f, code lost:
        r7 = (defpackage.dngu) r5.b;
        r7.a |= 2;
        r7.c = r6;
        r4.e(r5.bK());
        r5 = defpackage.dngu.e.bZ();
        r6 = r1.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0142, code lost:
        if (r5.c == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0144, code lost:
        r5.bF();
        r5.c = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0149, code lost:
        r7 = (defpackage.dngu) r5.b;
        r7.a |= 1;
        r7.b = r6;
        r6 = r1.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x015b, code lost:
        if (r5.c == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015d, code lost:
        r5.bF();
        r5.c = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0162, code lost:
        r7 = (defpackage.dngu) r5.b;
        r7.a |= 2;
        r7.c = r6;
        r4.f(r5.bK());
     */
    @Override // defpackage.sab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.cqkl d() {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbn.d():cqkl");
    }

    @Override // defpackage.sab
    public Boolean e() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.sab
    public Boolean f() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.sab
    public cjtd g() {
        return cjtd.a(dtxl.ce);
    }

    @Override // defpackage.sab
    public cjtd h() {
        return cjtd.a(dtxl.cj);
    }

    @Override // defpackage.sep, defpackage.sav
    public Boolean m() {
        return false;
    }

    @Override // defpackage.sep, defpackage.sav
    public Boolean n() {
        return true;
    }

    @Override // defpackage.sep, defpackage.sav
    public cqkl o() {
        sfc sfcVar = this.g;
        return sfcVar.a(sfcVar.b());
    }

    @Override // defpackage.sep, defpackage.sav
    public cjtd p() {
        return this.g.b;
    }

    @Override // defpackage.sep, defpackage.sav
    public cqkl q() {
        return this.g.d();
    }

    @Override // defpackage.sep, defpackage.sav
    public cjtd r() {
        return this.g.a;
    }
}
