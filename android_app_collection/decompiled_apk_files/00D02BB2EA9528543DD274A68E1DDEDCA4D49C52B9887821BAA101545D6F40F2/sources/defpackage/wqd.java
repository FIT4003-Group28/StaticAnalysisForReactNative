package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
/* compiled from: PG */
/* renamed from: wqd  reason: default package */
/* loaded from: classes7.dex */
public class wqd implements jad {
    public final qsc a;
    public final Integer b;
    @dzsi
    public final qco c;
    public Runnable d;
    public cqkp e;
    public eaow f = qsc.a;
    eapd g;
    @dzsi
    wpy h;
    private final cqkj i;
    private final Activity j;
    @dzsi
    private Dialog k;

    public wqd(Activity activity, cqkj cqkjVar, qsc qscVar, cqhn cqhnVar, Integer num, eapd eapdVar, Runnable runnable, cqkp cqkpVar, @dzsi qco qcoVar) {
        this.j = activity;
        this.i = cqkjVar;
        this.a = qscVar;
        this.b = num;
        this.g = eapdVar;
        this.d = runnable;
        this.e = cqkpVar;
        this.c = qcoVar;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return true;
    }

    public void b(Runnable runnable) {
        this.d = runnable;
    }

    @Override // defpackage.jad
    public cqkl c() {
        l();
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return cjtd.a(dtyc.bY);
    }

    @Override // defpackage.jad
    public CharSequence e() {
        long f = this.f.f();
        StringBuilder sb = new StringBuilder(32);
        sb.append(f);
        sb.append(" mins before");
        return sb.toString();
    }

    @Override // defpackage.jad
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jad
    public cqkl g(cjqm cjqmVar) {
        return jac.b(this);
    }

    @Override // defpackage.jad
    public Boolean h() {
        return jac.a();
    }

    @Override // defpackage.jad
    public cqtd i() {
        return null;
    }

    public void j(cqkp cqkpVar) {
        this.e = cqkpVar;
    }

    public void k() {
        Dialog dialog = this.k;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        dialog.dismiss();
        this.h = null;
    }

    public void l() {
        Dialog dialog = this.k;
        if (dialog == null || !dialog.isShowing()) {
            if (this.h == null) {
                this.h = new wpy(this.g, new mw(this) { // from class: wqa
                    private final wqd a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj) {
                        wqd wqdVar = this.a;
                        wqdVar.f = (eaow) obj;
                        wqdVar.a.a(wqdVar.b.intValue(), wqdVar.g, wqdVar.f, wqdVar.c);
                        wqdVar.k();
                        cqkx.p(wqdVar);
                    }
                }, this.f, new Runnable(this) { // from class: wpz
                    private final wqd a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        wqd wqdVar = this.a;
                        qsc qscVar = wqdVar.a;
                        qscVar.b.cancel(qscVar.b(wqdVar.b.intValue(), null, null));
                        wqdVar.k();
                        cqkx.p(wqdVar);
                        wqdVar.d.run();
                        cqkx.p(wqdVar.e);
                    }
                });
            }
            wkv wkvVar = new wkv();
            wpy wpyVar = this.h;
            dbsk.s(wpyVar);
            cqkf c = this.i.c(wkvVar, null);
            c.e(wpyVar);
            gdf gdfVar = new gdf(this.j, 16974129);
            this.k = gdfVar;
            gdfVar.requestWindowFeature(1);
            this.k.setContentView(c.c());
            this.k.setOnCancelListener(new wqb(this));
            this.k.setOnDismissListener(new wqc(c));
            this.k.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            Dialog dialog2 = this.k;
            dbsk.s(dialog2);
            dialog2.show();
        }
    }
}
