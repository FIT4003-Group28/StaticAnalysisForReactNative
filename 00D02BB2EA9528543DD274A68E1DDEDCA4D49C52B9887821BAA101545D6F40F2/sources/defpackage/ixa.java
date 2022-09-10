package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ixa  reason: default package */
/* loaded from: classes6.dex */
public class ixa implements jbd {
    private final bwrs<ilo> a;
    private final cdjd b;
    private final ff c;
    private final aput d;
    private final String e;
    private final boolean f;
    @dzsi
    private String g;

    public ixa(bwrs<ilo> bwrsVar, cdjd cdjdVar, bhhf bhhfVar, ff ffVar, aput aputVar) {
        this.a = bwrsVar;
        this.b = cdjdVar;
        this.c = ffVar;
        this.d = aputVar;
        String c = cdjdVar.a().f().c("");
        this.e = c;
        boolean f = bhhfVar.f(bwrsVar);
        boolean z = false;
        if (f && dbsj.d((String) cdjdVar.d().h(iwy.a).c("")) && !c.isEmpty()) {
            z = true;
        }
        this.f = z;
    }

    private final void h(int i) {
        String str = (String) this.b.a().b().h(iwz.a).c("");
        if (str.isEmpty()) {
            this.g = "";
        } else if (i <= 0) {
            this.g = this.c.getString(R.string.REPLY_TO_REVIEW_CHIP_CONTENT_DESCRIPTION, new Object[]{str});
        } else {
            this.g = this.c.getString(R.string.REPLY_TO_REVIEW_CHIP_CONTENT_DESCRIPTION_WITH_ORDINAL, new Object[]{Integer.valueOf(i), str});
        }
    }

    @Override // defpackage.jbd
    @dzsi
    public CharSequence a() {
        return this.c.getString(R.string.REPLY_TO_REVIEW_CHIP);
    }

    @Override // defpackage.jbd
    @dzsi
    /* renamed from: b */
    public String g() {
        if (this.g == null) {
            h(-1);
        }
        return this.g;
    }

    @Override // defpackage.jbd
    public Boolean c() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.jbd
    public cqkl d() {
        if (this.e.isEmpty()) {
            return cqkl.a;
        }
        this.d.e(this.a, this.e, this.c.getString(R.string.REPLY_TO_REVIEW_PAGE_TITLE), false);
        return cqkl.a;
    }

    @Override // defpackage.jbd
    @dzsi
    public cjtd e() {
        ilo c = this.a.c();
        dbsk.s(c);
        cjta c2 = cjtd.c(c.bZ());
        c2.d = dtxv.cL;
        if (this.b.a().h().a()) {
            c2.g(this.b.a().h().b());
        }
        return c2.a();
    }

    @Override // defpackage.jbd
    public void f(int i) {
        h(i);
    }
}
