package defpackage;

import android.text.SpannableString;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cchl  reason: default package */
/* loaded from: classes4.dex */
public class cchl implements ccid {
    public cchi a;
    public dpvk b;
    private final cchk c;
    private final ff d;
    private final CharSequence e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;

    public cchl(ff ffVar, dpvk dpvkVar, cchi cchiVar, cchk cchkVar, boolean z, boolean z2, boolean z3) {
        this.d = ffVar;
        this.b = dpvkVar;
        this.c = cchkVar;
        this.a = cchiVar;
        this.f = z;
        this.g = z2;
        this.i = z3;
        String string = ffVar.getString(R.string.LOCAL_GUIDE_OPT_IN_PROGRAM_RULES);
        SpannableString spannableString = new SpannableString(ffVar.getString(R.string.LOCAL_GUIDE_OPT_IN_18_UP, new Object[]{string}));
        jmw.h(spannableString, string, cjxr.f(Locale.getDefault().toString()));
        this.e = spannableString;
    }

    @Override // defpackage.ccid
    public CharSequence a() {
        return this.b.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        if ((r0 & 2) != 0) goto L11;
     */
    @Override // defpackage.ccid
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.cqkl b() {
        /*
            r2 = this;
            java.lang.Boolean r0 = r2.c()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L27
            boolean r0 = r2.g
            if (r0 == 0) goto L1e
            boolean r0 = r2.f
            if (r0 == 0) goto L1e
            dpvk r0 = r2.b
            int r0 = r0.a
            r1 = r0 & 1
            if (r1 == 0) goto L1e
            r0 = r0 & 2
            if (r0 != 0) goto L24
        L1e:
            r0 = 1
            r2.i = r0
            defpackage.cqkx.p(r2)
        L24:
            cqkl r0 = defpackage.cqkl.a
            return r0
        L27:
            cchk r0 = r2.c
            cchj r0 = (defpackage.cchj) r0
            r0.w()
            cqkl r0 = defpackage.cqkl.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cchl.b():cqkl");
    }

    @Override // defpackage.ccid
    public Boolean c() {
        boolean z = false;
        if (this.g && this.f) {
            int i = this.b.a;
            if ((i & 1) != 0 && (i & 2) != 0 && this.a == cchi.ELIGIBLE && !this.h) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ccid
    public cqkl d() {
        cchk cchkVar = this.c;
        cchj cchjVar = (cchj) cchkVar;
        bwqv bwqvVar = cchjVar.a;
        bxko bxkoVar = new bxko();
        bxkoVar.c(bxla.SEARCH);
        fd fdVar = (fd) cchkVar;
        bxkoVar.g(fdVar.J().getString(R.string.LOCAL_GUIDE_CITY_PLACE_HOLDER_HINT));
        bxkoVar.q(false);
        bxkoVar.s(false);
        bxkoVar.j = false;
        bxkoVar.z(301989889);
        bxkoVar.f = false;
        bxkoVar.o(dwjm.LOCAL_GUIDE_LOCATION);
        bxkoVar.e(cchjVar.g.a().toString());
        ((ges) cchkVar).aZ(bxel.bt(bwqvVar, bxkoVar, fdVar));
        return cqkl.a;
    }

    @Override // defpackage.ccid
    public cqkl e() {
        this.d.g().e();
        return cqkl.a;
    }

    @Override // defpackage.ccid
    public Boolean f() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.ccid
    public cqkl g() {
        this.f = !this.f;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.ccid
    public Boolean h() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.ccid
    public cqkl i() {
        this.g = !this.g;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.ccid
    public CharSequence j() {
        return this.e;
    }

    @Override // defpackage.ccid
    public Boolean k() {
        boolean z = false;
        if (this.i) {
            int i = this.b.a;
            if ((i & 1) == 0 || (i & 2) == 0) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ccid
    public Boolean l() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.ccid
    public Boolean m() {
        return Boolean.valueOf(this.a == cchi.CHECKING);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(cchi cchiVar) {
        this.a = cchiVar;
        cqkx.p(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(boolean z) {
        this.h = z;
        cqkx.p(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(dpvk dpvkVar) {
        this.b = dpvkVar;
        cqkx.p(this);
    }
}
