package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avyr  reason: default package */
/* loaded from: classes3.dex */
public class avyr implements avyl {
    public static final cjtd a = cjtd.a(dtxx.aV);
    public static final cjtd b = cjtd.a(dtxx.aW);
    public final ges c;
    public final avij d;
    public final cjqy e;
    public final crzm<avlj> f;
    private final Executor g;
    private final crzm<avkc> h;
    private final akfa i;
    private final awfh j;
    private final cjqq k;
    @dzsi
    private crzp<avlj> l;
    private avlj m;
    @dzsi
    private crzp<avkc> n;

    public avyr(fd fdVar, avij avijVar, cjqy cjqyVar, Executor executor, cqhn cqhnVar, crzm<avkc> crzmVar, akfa akfaVar, awfh awfhVar, cjqq cjqqVar) {
        this.c = (ges) fdVar;
        this.d = avijVar;
        this.e = cjqyVar;
        crzm<avlj> D = avijVar.D();
        this.f = D;
        this.m = (avlj) dbsc.a(D.l(), avlj.f());
        this.g = executor;
        this.h = crzmVar;
        this.i = akfaVar;
        this.j = awfhVar;
        this.k = cjqqVar;
    }

    @dzsi
    private final synchronized avlj l() {
        return this.m;
    }

    @Override // defpackage.avyl
    public cqkl a() {
        if (!this.c.aD) {
            return cqkl.a;
        }
        final cjql d = this.k.g().d(a);
        final cjql d2 = this.k.g().d(b);
        new AlertDialog.Builder(this.c.J()).setTitle(R.string.OFFLINE_CANCEL_SAVING_DIALOG_TITLE).setMessage(R.string.OFFLINE_CANCEL_SAVING_MESSAGE).setNegativeButton(R.string.OFFLINE_CANCEL_SAVING_CONTINUE_BUTTON, new DialogInterface.OnClickListener(this, d) { // from class: avyp
            private final avyr a;
            private final cjql b;

            {
                this.a = this;
                this.b = d;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                avyr avyrVar = this.a;
                avyrVar.e.j(this.b, avyr.a);
            }
        }).setPositiveButton(R.string.OK_BUTTON, new DialogInterface.OnClickListener(this, d2) { // from class: avyq
            private final avyr a;
            private final cjql b;

            {
                this.a = this;
                this.b = d2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                avyr avyrVar = this.a;
                avyrVar.e.j(this.b, avyr.b);
                avyrVar.d.k();
            }
        }).show();
        return cqkl.a;
    }

    @Override // defpackage.avyl
    public Boolean c() {
        boolean z = true;
        if (!d().booleanValue() && !f().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.avyl
    public String e() {
        ges gesVar = this.c;
        return !gesVar.aD ? "" : gesVar.Rp(R.string.OFFLINE_SIGNED_OUT_TO_SIGN_IN_TRANSITION_TEXT);
    }

    @Override // defpackage.avyl
    public Boolean f() {
        boolean z = false;
        if (this.j.b() && btlu.i(this.i.j()).equals(btlt.SIGNED_OUT)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public synchronized void g() {
        crzp<avlj> crzpVar = new crzp(this) { // from class: avym
            private final avyr a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                this.a.i(crzmVar);
            }
        };
        this.l = crzpVar;
        this.f.d(crzpVar, this.g);
        crzp<avkc> crzpVar2 = new crzp(this) { // from class: avyn
            private final avyr a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                avyr avyrVar = this.a;
                if (avyrVar.c.aD) {
                    cqkx.p(avyrVar);
                }
            }
        };
        this.n = crzpVar2;
        this.h.a(crzpVar2, this.g);
    }

    public synchronized void h() {
        crzp<avlj> crzpVar = this.l;
        if (crzpVar != null) {
            this.f.c(crzpVar);
            this.l = null;
        }
        crzp<avkc> crzpVar2 = this.n;
        if (crzpVar2 != null) {
            this.h.c(crzpVar2);
            this.n = null;
        }
    }

    public final synchronized void i(crzm<avlj> crzmVar) {
        this.m = (avlj) dbsc.a(crzmVar.l(), avlj.f());
        if (this.c.aD) {
            cqkx.p(this);
        }
    }

    public void j() {
        this.g.execute(new Runnable(this) { // from class: avyo
            private final avyr a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                avyr avyrVar = this.a;
                avyrVar.i(avyrVar.f);
            }
        });
    }

    @Override // defpackage.avyl
    /* renamed from: k */
    public String b() {
        int c;
        if (!c().booleanValue()) {
            return "";
        }
        avlj l = l();
        dbsk.s(l);
        dlua b2 = l.b();
        if (b2 == null) {
            b2 = dlua.h;
        }
        avkc l2 = this.h.l();
        dbsk.s(l2);
        int a2 = dlpv.a(b2.e);
        if (a2 == 0 || a2 != 3) {
            c = l2.c();
        } else {
            c = l2.d();
        }
        int i = c - 1;
        if (c == 0) {
            throw null;
        }
        if (i != 0) {
            if (i == 2) {
                return this.c.Rp(R.string.OFFLINE_NOTIFICATION_CONTENT_TEXT_WAITING_FOR_WIFI);
            }
            return this.c.Rp(R.string.OFFLINE_NOTIFICATION_CONTENT_TEXT_WAITING_FOR_DATA_CONNECTION);
        }
        String e = l.e();
        if (e == null) {
            return this.c.Rq(R.string.OFFLINE_SNACKBAR_UPDATE_PROGRESS, Integer.valueOf(b2.d));
        }
        return this.c.Rq(R.string.OFFLINE_SNACKBAR_SINGLE_REGION_UPDATE_PROGRESS, e, Integer.valueOf(b2.d));
    }

    @Override // defpackage.avyl
    public Boolean d() {
        int a2;
        int a3;
        avlj l = l();
        boolean z = false;
        if (!this.c.aD || l == null) {
            return false;
        }
        dlua b2 = l.b();
        if ((b2 != null && (a2 = dltx.a(b2.b)) != 0 && a2 != 1 && ((a3 = dltx.a(b2.b)) == 0 || a3 != 4)) || l.c()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
