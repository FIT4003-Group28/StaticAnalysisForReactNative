package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: citk  reason: default package */
/* loaded from: classes4.dex */
public class citk implements citj {
    private final chrx a;
    private final chtq b;

    public citk(chrx chrxVar, chtq chtqVar) {
        this.a = chrxVar;
        this.b = chtqVar;
    }

    @Override // defpackage.citj
    @dzsi
    public cqtd a() {
        chtq chtqVar = this.b;
        chxj chxjVar = chxj.RATING;
        drrx drrxVar = drrx.UNKNOWN_MODE;
        switch (chtqVar.a().ordinal()) {
            case 1:
                return cqrt.g(2131232922, ibm.x());
            case 2:
                return iup.c(R.raw.ic_rate_review_white, ibm.x());
            case 3:
                return iup.c(R.raw.ic_mod_add_photo, ibm.x());
            case 4:
                return cqrt.g(2131232403, ibm.x());
            case 5:
                return cqrt.g(2131232750, ibm.x());
            case 6:
                return cqrt.g(2131231724, ibm.x());
            case 7:
                return iup.c(R.raw.ic_mod_moderate_edit, ibm.x());
            default:
                return null;
        }
    }

    @Override // defpackage.citj
    @dzsi
    public cqsn b() {
        chtq chtqVar = this.b;
        chxj chxjVar = chxj.RATING;
        drrx drrxVar = drrx.UNKNOWN_MODE;
        switch (chtqVar.a().ordinal()) {
            case 1:
                return new cqvf(R.string.RATING_MODE_BUTTON);
            case 2:
                return new cqvf(R.string.REVIEW_MODE_BUTTON);
            case 3:
                return new cqvf(R.string.PHOTO_MODE_BUTTON);
            case 4:
                return new cqvf(R.string.TAG_MODE_BUTTON);
            case 5:
                return new cqvf(R.string.LIST_MODE_BUTTON);
            case 6:
                return new cqvf(R.string.ANSWER_QUESTION_MODE_BUTTON);
            case 7:
                return new cqvf(R.string.MODERATE_EDIT_MODE_BUTTON);
            default:
                return null;
        }
    }

    @Override // defpackage.citj
    public cqkl c() {
        this.a.i(this.b);
        return cqkl.a;
    }

    @Override // defpackage.citj
    @dzsi
    public cjtd d() {
        chtq chtqVar = this.b;
        chxj chxjVar = chxj.RATING;
        drrx drrxVar = drrx.UNKNOWN_MODE;
        switch (chtqVar.a().ordinal()) {
            case 1:
                cjta b = cjtd.b();
                b.d = dtxl.gF;
                return b.a();
            case 2:
                cjta b2 = cjtd.b();
                b2.d = dtxl.gG;
                return b2.a();
            case 3:
                cjta b3 = cjtd.b();
                b3.d = dtxl.gC;
                return b3.a();
            case 4:
                cjta b4 = cjtd.b();
                b4.d = dtxl.gH;
                return b4.a();
            case 5:
                cjta b5 = cjtd.b();
                b5.d = dtxl.gE;
                return b5.a();
            case 6:
                return cjtd.b;
            case 7:
                cjta b6 = cjtd.b();
                b6.d = dtxl.gD;
                return b6.a();
            default:
                return null;
        }
    }

    public boolean equals(@dzsi Object obj) {
        return (obj instanceof citk) && this.b.equals(((citk) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
