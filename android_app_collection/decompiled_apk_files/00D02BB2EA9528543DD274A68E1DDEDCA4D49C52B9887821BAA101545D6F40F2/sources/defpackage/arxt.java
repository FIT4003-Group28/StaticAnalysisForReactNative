package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: arxt  reason: default package */
/* loaded from: classes2.dex */
public class arxt extends ivw {
    @dzsi
    arxa c;
    private final Context d;
    private final aufc e;
    private final Executor f;
    @dzsi
    private arrd g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final crzp<aufb> k;

    public arxt(Context context, cqhn cqhnVar, aufc aufcVar, Executor executor) {
        super(context, ivu.FIXED, jaq.NO_TINT_ON_WHITE_WITH_GREY_SHADOW, R(), context.getString(R.string.EXPAND_MEDIA_REMOTE_CONTROL_CONTENT_DESCRIPTION), cjtd.a(dtxv.ag), false, 0, O(context) ? ivv.MEDIUM : ivv.FULL);
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = new arxs(this);
        this.d = context;
        this.e = aufcVar;
        this.f = executor;
    }

    private static boolean O(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp <= 360;
    }

    private final void P() {
        String string;
        boolean z = false;
        if (A().booleanValue() && this.i) {
            z = true;
        }
        if (this.h == z) {
            return;
        }
        this.h = z;
        if (z) {
            string = this.d.getString(R.string.MINIMIZE_MEDIA_REMOTE_CONTROL_CONTENT_DESCRIPTION);
        } else {
            string = this.d.getString(R.string.EXPAND_MEDIA_REMOTE_CONTROL_CONTENT_DESCRIPTION);
        }
        E(string);
        arrd arrdVar = this.g;
        if (arrdVar != null) {
            boolean z2 = this.h;
            atcp atcpVar = ((atcf) arrdVar).a;
            atcpVar.i = z2;
            atcpVar.e();
        }
        cqkx.p(this);
    }

    private final void Q() {
        btpf c = btpf.c(this.d);
        boolean z = false;
        boolean z2 = !c.f || c.e;
        if (this.c != null && z2) {
            z = true;
        }
        H(z);
    }

    private static cqtd R() {
        return cqrt.g(2131232799, ibl.q());
    }

    public final void N() {
        jaq jaqVar;
        if (this.e.b()) {
            jaqVar = jaq.NO_TINT_ON_BLACK_WITH_WHITE_SHADOW;
        } else if (this.j) {
            jaqVar = jaq.NO_TINT_ON_DARK_GREY_WITH_WHITE_SHADOW;
        } else {
            jaqVar = jaq.NO_TINT_ON_WHITE_WITH_GREY_SHADOW;
        }
        D(jaqVar);
        cqkx.p(this);
    }

    @Override // defpackage.ivw
    protected final boolean NE() {
        return false;
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        if (A().booleanValue()) {
            this.i = !this.i;
            P();
        }
        return cqkl.a;
    }

    public void g() {
        this.e.i().a(this.k, this.f);
        N();
    }

    public void h() {
        this.e.i().c(this.k);
    }

    public void i(@dzsi arxa arxaVar) {
        cqtd R;
        this.c = arxaVar;
        Q();
        if (arxaVar == null || arxaVar.L() == null) {
            R = R();
        } else {
            R = arxaVar.L();
            dbsk.s(R);
        }
        G(R);
        P();
        cqkx.p(this);
    }

    public void j(arrd arrdVar) {
        this.g = arrdVar;
    }

    public void k() {
        Q();
        P();
    }

    public void l(boolean z) {
        if (this.j != z) {
            this.j = z;
            N();
        }
    }

    @Override // defpackage.ivw, defpackage.jar
    public cqtv s() {
        return cqrp.d(O(this.d) ? 24.0d : 40.0d);
    }

    @Override // defpackage.ivw, defpackage.jar
    public Boolean t() {
        return true;
    }
}
