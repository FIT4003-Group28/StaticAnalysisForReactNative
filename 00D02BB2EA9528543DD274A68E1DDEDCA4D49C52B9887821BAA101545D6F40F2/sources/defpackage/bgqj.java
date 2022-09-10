package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: bgqj  reason: default package */
/* loaded from: classes3.dex */
public class bgqj implements bgoc {
    public final dipk a;
    public final diov b;
    public final bgqh c;
    public final gga d;
    public final bgpx e;
    public final apnq f;
    public final HashSet<bgqj> g;
    public final bgez h;
    public final bgnk i;
    public final bgqg j = new bgqg(this);
    public final int k;
    public int l;
    @dzsi
    public Runnable m;
    private final cjtd n;
    private final bgqi o;
    private boolean p;

    public bgqj(Activity activity, cqhn cqhnVar, apqe apqeVar, cjqy cjqyVar, gga ggaVar, bgpx bgpxVar, dipk dipkVar, int i, diov diovVar, apnq apnqVar, HashSet<bgqj> hashSet, bgez bgezVar, bgnk bgnkVar) {
        this.d = ggaVar;
        this.e = bgpxVar;
        this.a = dipkVar;
        this.b = diovVar;
        this.l = i;
        this.f = apnqVar;
        this.g = hashSet;
        this.h = bgezVar;
        this.i = bgnkVar;
        bgqh bgqhVar = new bgqh(this, activity, cqhnVar, apqeVar, cjqyVar);
        this.c = bgqhVar;
        bgqi bgqiVar = new bgqi(this);
        this.o = bgqiVar;
        bgqhVar.C(bgqiVar);
        bgqhVar.G(true);
        bgqhVar.E(true);
        ddho ddhoVar = bgnkVar.ordinal() != 1 ? dtxu.aG : dtxy.jE;
        cjta b = cjtd.b();
        b.d = ddhoVar;
        b.g(dipkVar.q);
        this.n = b.a();
        this.k = dipkVar.m.indexOf(diovVar);
    }

    @Override // defpackage.apns
    public int QL() {
        return this.l;
    }

    @Override // defpackage.apns
    public void QM(@dzsi Runnable runnable) {
        this.m = runnable;
    }

    @Override // defpackage.apns
    public void QN(boolean z) {
        this.p = z;
        cqkx.p(this);
    }

    @Override // defpackage.apns
    public void QO() {
        this.c.J();
    }

    @Override // defpackage.apns
    public Boolean QP() {
        bgqg bgqgVar = this.j;
        View view = bgqgVar.b;
        boolean z = false;
        if (view != null && view.getHeight() != 0 && view.getGlobalVisibleRect(bgqgVar.a) && bgqgVar.a.height() > view.getHeight() / 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.apns
    public void QQ(@dzsi apnr apnrVar) {
        this.j.c = apnrVar;
    }

    @Override // defpackage.bgfa
    public void a(int i) {
        this.l = i;
    }

    @Override // defpackage.bgoc
    public String e() {
        return this.b.c;
    }

    @Override // defpackage.bgoc
    public Boolean f() {
        return Boolean.valueOf(this.p);
    }

    @Override // defpackage.bgoc
    public appj i() {
        return this.c;
    }

    @Override // defpackage.bgoc
    public cjtd k() {
        return this.n;
    }

    @Override // defpackage.bgoc
    public CharSequence l() {
        return this.d.getResources().getQuantityString(R.plurals.VIDEO_FOR_POST, this.a.m.size(), Integer.valueOf(this.l + 1), Integer.valueOf(this.k + 1));
    }

    @Override // defpackage.bgoc
    public String m() {
        return this.b.b;
    }

    @Override // defpackage.bgoc
    public View.OnClickListener n() {
        return new View.OnClickListener(this) { // from class: bgqf
            private final bgqj a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bgpw bgpwVar = this.a.j.d;
                if (bgpwVar != null) {
                    bgpwVar.d();
                }
            }
        };
    }

    @Override // defpackage.bgoc
    public View.OnAttachStateChangeListener o() {
        return this.j;
    }

    public void p() {
        this.j.a();
    }

    public final cjta q(ddho ddhoVar) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        b.g(this.a.q);
        return b;
    }
}
