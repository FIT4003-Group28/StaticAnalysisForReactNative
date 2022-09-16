package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axqe  reason: default package */
/* loaded from: classes3.dex */
public class axqe implements axne {
    private static final dcdn<dfqc, ddho> g;
    private static final dcdn<dfqc, ddho> h;
    private static final dcdn<dfqc, ddho> i;
    public final Context a;
    public final cpv b;
    public final crzo<dqaw> c;
    public dqaw d;
    public boolean e;
    public boolean f = false;
    private final Executor j;
    private final akfa k;
    private final axhs l;
    private final axjh m;
    private final akfc n;
    private final String o;
    private final String p;
    private final dfqc q;
    private final String r;
    private final crzo<axoj> s;
    private final crzp<axoj> t;

    static {
        dcdg p = dcdn.p();
        p.f(dfqc.UNKNOWN_FOLLOWEE_SOURCE, dtxy.Y);
        p.f(dfqc.PROFILE, dtxl.eU);
        p.f(dfqc.SELF_FOLLOWER_LIST, dtxy.Q);
        p.f(dfqc.SELF_FOLLOWING_LIST, dtxy.T);
        p.f(dfqc.OTHERS_FOLLOWER_LIST, dtxy.E);
        p.f(dfqc.OTHERS_FOLLOWING_LIST, dtxy.H);
        p.f(dfqc.STREAM_CONTENT_CARD, dtxu.cs);
        p.f(dfqc.STREAM_RECOMMENDATION_CARD, dtxu.cb);
        p.f(dfqc.YOUR_EXPLORE_CONTENT, dtxr.bJ);
        g = p.b();
        dcdg p2 = dcdn.p();
        p2.f(dfqc.UNKNOWN_FOLLOWEE_SOURCE, dtxy.Z);
        p2.f(dfqc.PROFILE, dtxl.fJ);
        p2.f(dfqc.SELF_FOLLOWER_LIST, dtxy.R);
        p2.f(dfqc.SELF_FOLLOWING_LIST, dtxy.U);
        p2.f(dfqc.OTHERS_FOLLOWER_LIST, dtxy.F);
        p2.f(dfqc.OTHERS_FOLLOWING_LIST, dtxy.I);
        p2.f(dfqc.STREAM_CONTENT_CARD, dtxu.cu);
        p2.f(dfqc.STREAM_RECOMMENDATION_CARD, dtxu.cc);
        p2.f(dfqc.YOUR_EXPLORE_CONTENT, dtxr.bK);
        h = p2.b();
        dcdg p3 = dcdn.p();
        p3.f(dfqc.UNKNOWN_FOLLOWEE_SOURCE, dtxy.X);
        p3.f(dfqc.PROFILE, dtxl.eN);
        p3.f(dfqc.SELF_FOLLOWER_LIST, dtxy.P);
        p3.f(dfqc.SELF_FOLLOWING_LIST, dtxy.S);
        p3.f(dfqc.OTHERS_FOLLOWER_LIST, dtxy.D);
        p3.f(dfqc.OTHERS_FOLLOWING_LIST, dtxy.G);
        p3.f(dfqc.STREAM_CONTENT_CARD, dtxu.cr);
        p3.f(dfqc.STREAM_RECOMMENDATION_CARD, dtxu.ca);
        p3.f(dfqc.YOUR_EXPLORE_CONTENT, dtxr.bI);
        i = p3.b();
    }

    public axqe(cqhn cqhnVar, Context context, Executor executor, akfa akfaVar, axhs axhsVar, axjh axjhVar, akfc akfcVar, cpv cpvVar, cqhu cqhuVar, String str, String str2, crzo<axoj> crzoVar, dfqc dfqcVar, String str3) {
        axqb axqbVar = new axqb(this);
        this.t = axqbVar;
        this.a = context;
        this.j = executor;
        this.k = akfaVar;
        this.l = axhsVar;
        this.m = axjhVar;
        this.n = akfcVar;
        this.b = cpvVar;
        this.o = str;
        this.p = str2;
        this.q = dfqcVar;
        this.r = str3;
        this.s = crzoVar;
        crzn<axoj> crznVar = crzoVar.a;
        axoj l = crznVar.l();
        dbsk.s(l);
        this.d = l.b;
        this.e = l.a;
        crznVar.b(axqbVar, executor);
        this.c = new crzo<>(this.d);
    }

    @Override // defpackage.jad
    public Boolean a() {
        return true;
    }

    @Override // defpackage.axne
    public CharSequence b() {
        dfqe dfqeVar = dfqe.UNDEFINED_STATE;
        dfqe b = dfqe.b(this.d.b);
        if (b == null) {
            b = dfqe.UNDEFINED_STATE;
        }
        int ordinal = b.ordinal();
        if (ordinal != 2) {
            if (ordinal == 3 || ordinal == 4) {
                return this.a.getString(R.string.BUTTON_FOLLOWING_CONTENT_DESCRIPTION, this.p);
            }
            return this.a.getString(R.string.BUTTON_FOLLOW_CONTENT_DESCRIPTION, this.p);
        }
        return this.a.getString(R.string.BUTTON_REQUESTED_CONTENT_DESCRIPTION, this.p);
    }

    @Override // defpackage.jad
    public cqkl c() {
        if (this.e) {
            return cqkl.a;
        }
        this.f = true;
        btlt i2 = btlu.i(this.k.j());
        if (i2 == btlt.SIGNED_OUT || i2 == btlt.INCOGNITO) {
            this.n.j();
        } else {
            dfqe dfqeVar = dfqe.UNDEFINED_STATE;
            dfqe b = dfqe.b(this.d.b);
            if (b == null) {
                b = dfqe.UNDEFINED_STATE;
            }
            int ordinal = b.ordinal();
            if (ordinal == 1) {
                dbsg<dqar> b2 = this.l.b();
                if (b2 == null) {
                    o(this.a.getString(R.string.REQUEST_FAILURE_ERROR_TOAST_SHORT));
                } else if (!b2.a()) {
                    cqkx.p(this);
                    deha.q(this.l.d(this.o, this.q), new axqc(this), this.j);
                } else {
                    this.m.O(this.o, this.q, b2.b());
                }
            } else if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                cqkx.p(this);
                deha.q(this.l.e(this.o), new axqd(this), this.j);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        cjta b = cjtd.b();
        b.g(this.r);
        dfqe dfqeVar = dfqe.UNDEFINED_STATE;
        dfqe b2 = dfqe.b(this.d.b);
        if (b2 == null) {
            b2 = dfqe.UNDEFINED_STATE;
        }
        int ordinal = b2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ddho ddhoVar = g.get(this.q);
                dbsk.s(ddhoVar);
                b.d = ddhoVar;
            } else if (ordinal == 2) {
                ddho ddhoVar2 = i.get(this.q);
                dbsk.s(ddhoVar2);
                b.d = ddhoVar2;
            } else if (ordinal == 3 || ordinal == 4) {
                ddho ddhoVar3 = h.get(this.q);
                dbsk.s(ddhoVar3);
                b.d = ddhoVar3;
            }
            return b.a();
        }
        return cjtd.b;
    }

    @Override // defpackage.jad
    public CharSequence e() {
        dfqe dfqeVar = dfqe.UNDEFINED_STATE;
        dfqe b = dfqe.b(this.d.b);
        if (b == null) {
            b = dfqe.UNDEFINED_STATE;
        }
        int ordinal = b.ordinal();
        if (ordinal != 2) {
            if (ordinal == 3 || ordinal == 4) {
                return this.a.getString(R.string.BUTTON_FOLLOWING);
            }
            return this.a.getString(R.string.BUTTON_FOLLOW);
        }
        return this.a.getString(R.string.BUTTON_REQUESTED);
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

    @Override // defpackage.axne, defpackage.jad
    public cqtd i() {
        dfqe dfqeVar = dfqe.UNDEFINED_STATE;
        dfqe b = dfqe.b(this.d.b);
        if (b == null) {
            b = dfqe.UNDEFINED_STATE;
        }
        int ordinal = b.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return iup.c(R.raw.ic_person_request, ibm.x());
            }
            return cqrt.g(2131232566, ibm.x());
        }
        return cqrt.g(2131232381, ibm.x());
    }

    @Override // defpackage.axne
    public Boolean j() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.axne
    public Boolean k() {
        boolean z = false;
        if (l().booleanValue() && !j().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.axne
    public Boolean l() {
        dfqe b = dfqe.b(this.d.b);
        if (b == null) {
            b = dfqe.UNDEFINED_STATE;
        }
        return Boolean.valueOf(b == dfqe.UNDEFINED_STATE);
    }

    @Override // defpackage.axne
    public crzm<dqaw> m() {
        return this.c.a;
    }

    @Override // defpackage.axne
    public cqtd n() {
        if (!this.e) {
            dfqe b = dfqe.b(this.d.b);
            if (b == null) {
                b = dfqe.UNDEFINED_STATE;
            }
            if (b != dfqe.FOLLOWING_PRIVATELY) {
                dfqe b2 = dfqe.b(this.d.b);
                if (b2 == null) {
                    b2 = dfqe.UNDEFINED_STATE;
                }
                if (b2 != dfqe.FOLLOWING_PUBLICLY) {
                    return null;
                }
            }
            return cqrt.g(2131232566, ibm.x());
        }
        return null;
    }

    public final void o(String str) {
        Toast.makeText(this.a, str, 0).show();
    }
}
