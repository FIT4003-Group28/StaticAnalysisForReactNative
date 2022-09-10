package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aeho  reason: default package */
/* loaded from: classes2.dex */
public class aeho implements aehl {
    private final gen a;
    private final duul b;
    private final bvsx c;
    private final dxio<afha> d;
    private final boolean e;

    public aeho(duul duulVar, dxio<afha> dxioVar, gen genVar, boolean z) {
        this.a = genVar;
        this.c = new bvsx(genVar.Rn());
        this.b = duulVar;
        this.d = dxioVar;
        this.e = z;
    }

    private final cqkl h(String str) {
        this.d.a().k(this.a.J(), cjxr.w(str), 1);
        this.a.aT();
        return cqkl.a;
    }

    @Override // defpackage.aehl
    public Boolean a() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.aehl
    public cqkl b() {
        String c = this.b.c();
        if (true == dbsj.d(c)) {
            c = "https://support.google.com/websearch/answer/54068";
        }
        return h(c);
    }

    @Override // defpackage.aehl
    public cjtd c() {
        return cjtd.a(dtxr.cc);
    }

    @Override // defpackage.aehl
    public cqkl d() {
        String b = this.b.b();
        if (true == dbsj.d(b)) {
            b = "https://support.google.com/websearch/answer/6276008";
        }
        return h(b);
    }

    @Override // defpackage.aehl
    public cjtd e() {
        return cjtd.a(dtxr.cd);
    }

    @Override // defpackage.aehl
    public CharSequence f() {
        bvsu c = this.c.c(R.string.HOTEL_RESULTS_DISCLAIMER_BROWSING_ACTIVITY_SECTION_TEXT);
        bvsu c2 = this.c.c(R.string.HOTEL_RESULTS_DISCLAIMER_BROWSING_ACTIVITY_SECTION_LINK_TEXT);
        c2.l(ibm.w().b(this.a.H()));
        c.a(c2);
        return c.c();
    }

    @Override // defpackage.aehl
    public CharSequence g() {
        bvsu c = this.c.c(R.string.HOTEL_RESULTS_DISCLAIMER_ABOUT_PRICING_SECTION_TEXT);
        bvsu c2 = this.c.c(R.string.HOTEL_RESULTS_DISCLAIMER_ABOUT_PRICING_SECTION_LINK_TEXT);
        c2.l(ibm.w().b(this.a.H()));
        c.a(c2);
        return c.c();
    }
}
