package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atso  reason: default package */
/* loaded from: classes2.dex */
public class atso implements atxw {
    public static final cqsn b = cqrt.l(R.string.PROMPT_CANCEL);
    public static final cqsn c = cqrt.l(R.string.PROMPT_DISMISS);
    public static final cqsn d = cqrt.l(R.string.POI_PROMPT_NAVIGATE);
    public static final cqsn e = cqrt.l(R.string.POI_PROMPT_NAVIGATE_ACTION);
    public static final cqsn f = cqrt.l(R.string.POI_PROMPT_ADD_STOP);
    public static final cqsn g = cqrt.l(R.string.POI_PROMPT_ADD_STOP_ACTION);
    private final cqfc a;
    protected final atss<? extends crqw> i;
    protected final cjqy j;
    @dzsi
    protected final cqsn k;
    @dzsi
    protected final cqsn l;
    @dzsi
    protected final String m;
    @dzsi
    protected final atxv n;
    @dzsi
    protected final atsn o;
    @dzsi
    protected final cjtd p;
    @dzsi
    protected final cjtd q;
    protected final boolean r;
    protected final boolean s;
    protected final boolean t;
    protected final boolean u;
    @dzsi
    private final atxr z;
    cjwu h = new cjwu();
    public boolean v = false;
    public boolean w = false;
    protected boolean x = false;
    protected boolean y = false;

    public atso(atsm atsmVar) {
        this.i = atsmVar.a;
        this.j = atsmVar.b;
        this.k = atsmVar.c;
        this.l = atsmVar.d;
        this.m = atsmVar.e;
        this.n = atsmVar.f;
        this.o = atsmVar.g;
        this.p = atsmVar.h;
        this.q = atsmVar.i;
        this.r = atsmVar.j;
        this.s = atsmVar.k;
        boolean z = atsmVar.l;
        this.t = z;
        this.u = atsmVar.m;
        this.a = new attw(new atsj(this));
        this.z = z ? new atsk(this) : null;
    }

    public static cqsn d(int i) {
        return cqrt.n(R.plurals.POI_PROMPT_REPLACE_STOP, i);
    }

    public static cqsn e(int i) {
        return cqrt.n(R.plurals.POI_PROMPT_REPLACE_STOP_ACTION, i);
    }

    @Override // defpackage.atxw
    public cqkl c() {
        this.y = false;
        return t();
    }

    @Override // defpackage.atxw
    public cjwu f() {
        return this.h;
    }

    @Override // defpackage.atxw
    @dzsi
    public cqsn g() {
        return this.k;
    }

    @Override // defpackage.atxw
    @dzsi
    public cqsn h() {
        cqsn cqsnVar = this.l;
        return cqsnVar != null ? cqsnVar : this.k;
    }

    @Override // defpackage.atxw
    @dzsi
    public String i() {
        return this.m;
    }

    @Override // defpackage.atxw
    @dzsi
    public atxv j() {
        return this.n;
    }

    @Override // defpackage.atxw
    public cqfc k() {
        return this.a;
    }

    @Override // defpackage.atxw
    @dzsi
    public cjtd l() {
        return this.p;
    }

    @Override // defpackage.atxw
    @dzsi
    public cjtd m() {
        return this.q;
    }

    @Override // defpackage.atxw
    public Boolean n() {
        return Boolean.valueOf(this.r);
    }

    @Override // defpackage.atxw
    public Boolean o() {
        return Boolean.valueOf(this.s);
    }

    @Override // defpackage.atxw
    public Boolean p() {
        return Boolean.valueOf(this.t);
    }

    @Override // defpackage.atxw
    public Boolean q() {
        return Boolean.valueOf(this.u);
    }

    @Override // defpackage.atxw
    public Boolean r() {
        boolean z = false;
        if (this.i.ad() && this.x && this.t) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.atxw
    @dzsi
    public atxr s() {
        return this.z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cqkl t() {
        if (this.x) {
            return cqkl.a;
        }
        this.x = true;
        if (r().booleanValue()) {
            cqkx.p(this.i);
        } else {
            u();
        }
        return cqkl.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u() {
        atsn atsnVar = this.o;
        if (atsnVar != null) {
            atsnVar.a(this.y);
        }
        this.i.p();
    }

    @Override // defpackage.atxw
    public Boolean v() {
        return this.i.ak();
    }
}
