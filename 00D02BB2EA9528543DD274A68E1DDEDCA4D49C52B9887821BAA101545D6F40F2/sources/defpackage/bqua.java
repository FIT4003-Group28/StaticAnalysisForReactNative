package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bqua  reason: default package */
/* loaded from: classes4.dex */
class bqua implements bqsu {
    private static final docg e = docg.M;
    public final ff a;
    public final Runnable b;
    public jho c;
    private final ges f;
    private final cpv g;
    public cjtd d = cjtd.b;
    private bqtz i = bqtz.NO_DRAFT;
    private final int h = cqir.a();

    public bqua(ges gesVar, Runnable runnable, ff ffVar, cqhn cqhnVar, cpv cpvVar) {
        this.a = ffVar;
        this.f = gesVar;
        this.g = cpvVar;
        this.b = runnable;
        this.c = i(ffVar, cjtd.b);
    }

    public static jho i(Activity activity, cjtd cjtdVar) {
        jhm jhmVar = new jhm();
        jhmVar.a = activity.getString(R.string.DELETE_DRAFT_REVIEW);
        jhmVar.l = R.string.DELETE_DRAFT_REVIEW;
        jhmVar.f = cjtdVar;
        return jhmVar.c();
    }

    @Override // defpackage.bqsu
    public Boolean a() {
        return Boolean.valueOf(!this.i.equals(bqtz.NO_DRAFT));
    }

    @Override // defpackage.bqsu
    public cqkl b() {
        View findViewById;
        View view = this.f.P;
        if (view != null && (findViewById = view.findViewById(c().intValue())) != null) {
            findViewById.performClick();
        }
        return cqkl.a;
    }

    @Override // defpackage.bqsu
    public Integer c() {
        return Integer.valueOf(this.h);
    }

    @Override // defpackage.bqsu
    public jht d() {
        jhu h = jhv.h();
        jhi jhiVar = (jhi) h;
        jhiVar.a = new jhs(this) { // from class: bqtx
            private final bqua a;

            {
                this.a = this;
            }

            @Override // defpackage.jhs
            public final void a() {
                this.a.j(R.string.OVERFLOW_MENU_OPENED_ACCESSIBILITY);
            }
        };
        jhiVar.c = 2131232148;
        jhiVar.b = new jhr(this) { // from class: bqty
            private final bqua a;

            {
                this.a = this;
            }

            @Override // defpackage.jhr
            public final void a(int i) {
                bqua bquaVar = this.a;
                if (i == R.string.DELETE_DRAFT_REVIEW) {
                    bquaVar.b.run();
                }
            }
        };
        if (a().booleanValue()) {
            h.d(this.c);
        }
        return jhiVar.b();
    }

    @Override // defpackage.bqsu
    @dzsi
    public cjtd e() {
        return this.d;
    }

    @Override // defpackage.bqsu
    public CharSequence f() {
        bqtz bqtzVar = this.i;
        bqtz bqtzVar2 = bqtz.NO_DRAFT;
        int i = bqtzVar.e;
        return i == 0 ? "" : this.a.getString(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(bqtz bqtzVar) {
        bqtz bqtzVar2 = this.i;
        bqtz bqtzVar3 = bqtz.NO_DRAFT;
        int i = 0;
        if (bqtzVar2.equals(bqtz.SAVING) && bqtzVar.equals(bqtz.SAVED)) {
            i = bqtzVar.e;
        }
        j(i);
        this.i = bqtzVar;
        cqkx.p(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(docg docgVar) {
        g(docgVar.equals(e) ? bqtz.NO_DRAFT : bqtz.SAVED);
        cqkx.p(this);
    }

    public final void j(int i) {
        View currentFocus;
        if (i == 0 || (currentFocus = this.a.getCurrentFocus()) == null) {
            return;
        }
        this.g.f(currentFocus, this.a.getString(i));
    }
}
