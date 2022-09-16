package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.app.ui.WatchUpsellDialogController;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class WatchUpsellDialogController implements f, ynl {
    public final airr a;
    public boolean b;
    public String c;
    private final ahat d;
    private final acti e;
    private final feu f;
    private final zer g;
    private final yni h;
    private final airw i;
    private final aypf j = new aypf();
    private final aafo k;
    private final akcn l;
    private boolean m;
    private final aacz n;

    public WatchUpsellDialogController(airr airrVar, ahat ahatVar, acti actiVar, feu feuVar, yni yniVar, airw airwVar, aacz aaczVar, aafo aafoVar, akcn akcnVar) {
        this.a = airrVar;
        this.d = ahatVar;
        this.e = actiVar;
        this.f = feuVar;
        this.h = yniVar;
        this.i = airwVar;
        this.n = aaczVar;
        this.k = aafoVar;
        this.l = akcnVar;
        this.g = new ltz(this, feuVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x015c, code lost:
        if (r0 == 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a7, code lost:
        if (r2 == 0) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.ahhw r11) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.ui.WatchUpsellDialogController.g(ahhw):void");
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                g((ahhw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhw.class};
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        if (eog.aq(this.n)) {
            this.j.c();
        } else {
            this.h.m(this);
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (eog.aq(this.n)) {
            this.j.d(this.i.G().b.aa(new ayqb() { // from class: ltx
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    WatchUpsellDialogController.this.g((ahhw) obj);
                }
            }, kjt.l));
        } else {
            this.h.g(this);
        }
    }

    private final void h(apzj apzjVar) {
        int i = apzjVar.b;
        if ((i & 1) != 0) {
            this.a.a();
            aafo aafoVar = this.k;
            apzg apzgVar = apzjVar.c;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.a(apzgVar);
        } else if ((i & 2) != 0) {
            aafo aafoVar2 = this.k;
            apzg apzgVar2 = apzjVar.d;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafoVar2.a(apzgVar2);
            this.e.u(new acte(apzjVar.f), null);
        }
        this.m = true;
    }
}
