package defpackage;

import android.text.Editable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: ivk  reason: default package */
/* loaded from: classes.dex */
public abstract class ivk implements izs {
    protected final acyp a;
    @dzsi
    public bwrs<brln> b;
    private final gga e;
    private final btrm f;
    private final eeu g;
    private final btvo h;
    private final iwc i;
    private final izp j;
    @dzsi
    private jmm l;
    @dzsi
    private TextWatcher m;
    private int r;
    private boolean t;
    private CharSequence n = "";
    private boolean o = true;
    private boolean p = true;
    private boolean s = false;
    private float u = 1.0f;
    private izr v = izr.VIEW;
    private final cjtd k = cjtd.a(dtxv.G);
    @dzsi
    private jbv q = null;
    @dzsi
    protected bryd c = null;

    public ivk(ivj ivjVar) {
        this.e = ivjVar.a;
        this.g = ivjVar.b;
        this.f = ivjVar.c;
        this.i = ivjVar.d;
        this.h = ivjVar.e;
        this.j = ivjVar.f;
        this.a = ivjVar.g;
    }

    private static boolean ag(Object obj, int i) {
        return (obj instanceof bxno) && (i & 51) != 51;
    }

    @Override // defpackage.izs
    public Boolean A() {
        return Boolean.valueOf(ae().c() != null);
    }

    @Override // defpackage.izs
    public Boolean B() {
        return Boolean.valueOf(this.t);
    }

    @Override // defpackage.izs
    public void C(boolean z) {
        this.t = z;
    }

    @Override // defpackage.izs
    public Integer D() {
        return Integer.valueOf(this.r);
    }

    @Override // defpackage.izs
    public String E() {
        return this.i.a(QG());
    }

    @Override // defpackage.izs
    public Boolean F() {
        boolean z = true;
        if (!this.h.getSuggestParameters().k && !this.h.getSuggestParameters().l) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.izs
    public Integer G() {
        return 33554435;
    }

    @Override // defpackage.izs
    public Integer H() {
        return Integer.valueOf((int) ImageMetadata.LENS_FILTER_DENSITY);
    }

    @Override // defpackage.izs
    public void I(CharSequence charSequence) {
        if (bvpb.b(charSequence).toString().contentEquals(bvpb.b(this.n))) {
            J(charSequence, this.r);
        } else {
            J(charSequence, bvpb.b(charSequence).length());
        }
    }

    public void J(CharSequence charSequence, int i) {
        Object[] spans;
        if (charSequence instanceof Spanned) {
            SpannableString spannableString = new SpannableString(charSequence.toString());
            Spanned spanned = (Spanned) charSequence;
            for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
                int spanFlags = spanned.getSpanFlags(obj);
                if (ag(obj, spanFlags)) {
                    spannableString.setSpan(obj, spanned.getSpanStart(obj), spanned.getSpanEnd(obj), spanFlags);
                }
            }
            charSequence = spannableString;
        }
        this.n = charSequence;
        if (charSequence != null && (i < 0 || i > charSequence.length())) {
            i = -1;
        }
        this.r = i;
    }

    public void K() {
        this.r = -1;
    }

    @Override // defpackage.izs
    public Boolean L() {
        return Boolean.valueOf(this.o);
    }

    @Override // defpackage.izs
    public boolean M(boolean z) {
        if (this.o != z) {
            this.o = z;
            return true;
        }
        return false;
    }

    @Override // defpackage.izs
    public izp N() {
        return this.j;
    }

    @Override // defpackage.izs
    public Boolean O() {
        return N().a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Ou(CharSequence charSequence) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Ov(Editable editable) {
        CharacterStyle[] characterStyleArr;
        for (CharacterStyle characterStyle : (CharacterStyle[]) editable.getSpans(0, editable.length(), CharacterStyle.class)) {
            int spanFlags = editable.getSpanFlags(characterStyle);
            if ((spanFlags & 256) != 256 && !ag(characterStyle, spanFlags)) {
                editable.removeSpan(characterStyle);
            }
        }
    }

    @Override // defpackage.izs
    @dzsi
    public bryd P() {
        return this.c;
    }

    @Override // defpackage.izs
    public void Q(@dzsi jbv jbvVar) {
        this.q = jbvVar;
    }

    public void QF(izr izrVar) {
        this.v = izrVar;
    }

    public izr QG() {
        return this.v;
    }

    @Override // defpackage.izs
    @dzsi
    public jbv R() {
        return this.q;
    }

    @Override // defpackage.izs
    public boolean S() {
        return false;
    }

    public void T(boolean z) {
    }

    @Override // defpackage.izs
    public izg U() {
        return null;
    }

    @Override // defpackage.izs
    public cjtd V() {
        return izq.a();
    }

    @Override // defpackage.izs
    public Boolean W() {
        return izq.c();
    }

    @Override // defpackage.izs
    public String X() {
        return "";
    }

    @Override // defpackage.izs
    public cjtd Y() {
        return cjtd.b;
    }

    @Override // defpackage.izs
    public izd Z() {
        return null;
    }

    @Override // defpackage.izs
    public Boolean aa() {
        return izq.b();
    }

    @Override // defpackage.izs
    public iyz ab() {
        return null;
    }

    @Override // defpackage.izs
    public Integer ac() {
        return null;
    }

    @Override // defpackage.izs
    public void ad(int i, float f) {
    }

    @Override // defpackage.izs
    public cqkl c() {
        throw null;
    }

    @Override // defpackage.izs
    public CharSequence d() {
        return this.n;
    }

    @Override // defpackage.izs
    public TextWatcher e() {
        if (this.m == null) {
            this.m = new ivi(this);
        }
        return this.m;
    }

    public void f(CharSequence charSequence) {
    }

    @Override // defpackage.izs
    public jmm g() {
        if (this.l == null) {
            this.l = new jmm(new jml(this) { // from class: ivh
                private final ivk a;

                {
                    this.a = this;
                }

                @Override // defpackage.jml
                public final void a(CharSequence charSequence) {
                    this.a.f(charSequence);
                }
            });
        }
        return this.l;
    }

    public void j(bwrs<brln> bwrsVar) {
        this.b = bwrsVar;
    }

    @Override // defpackage.izs
    public cqkl k() {
        if (!((efh) this.g).b || this.e.g().J()) {
            return cqkl.a;
        }
        I("");
        if (this.a.f()) {
            this.e.x(gfs.HOMETAB);
        } else {
            this.e.w();
        }
        this.f.b(new brco());
        return cqkl.a;
    }

    @Override // defpackage.izs
    public Boolean l() {
        return Boolean.valueOf(!bvpb.c(d()));
    }

    @Override // defpackage.izs
    public cjtd m() {
        return this.k;
    }

    @Override // defpackage.izs
    public Boolean n() {
        boolean z = true;
        if (!this.p && L().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void o(boolean z) {
        this.p = z;
    }

    @Override // defpackage.izs
    public Float p() {
        return Float.valueOf(n().booleanValue() ? 0.0f : 1.0f);
    }

    @Override // defpackage.izs
    public cqtv q() {
        return cqrp.d(Math.ceil((this.u * 5.0f) + 1.0f));
    }

    @Override // defpackage.izs
    public void r(float f) {
        if (this.u == f) {
            return;
        }
        this.u = dece.c(f, 0.0f, 1.0f);
        cqkx.p(this);
    }

    @Override // defpackage.izs
    public Boolean s() {
        return Boolean.valueOf(this.s);
    }

    public void t(boolean z) {
        this.s = z;
    }

    @Override // defpackage.izs
    public cqss u() {
        throw null;
    }

    @Override // defpackage.izs
    public Boolean v() {
        return Boolean.valueOf(QG() == izr.LOADING);
    }

    @Override // defpackage.izs
    public Boolean w() {
        return Boolean.valueOf(QG() == izr.EDIT);
    }

    @Override // defpackage.izs
    public Boolean x() {
        return true;
    }

    @Override // defpackage.izs
    public Boolean y() {
        boolean z = true;
        if (QG() != izr.VIEW && QG() != izr.LOADING) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.izs
    public Boolean z() {
        return n();
    }
}
