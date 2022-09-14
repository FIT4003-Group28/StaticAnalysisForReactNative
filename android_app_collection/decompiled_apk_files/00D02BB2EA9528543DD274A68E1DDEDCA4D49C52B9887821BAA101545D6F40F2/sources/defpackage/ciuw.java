package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ciuw  reason: default package */
/* loaded from: classes4.dex */
public class ciuw implements ciur {
    public final chrx a;
    public final axwy b;
    private final chva c;

    public ciuw(axwy axwyVar, chva chvaVar, chrx chrxVar) {
        this.c = chvaVar;
        this.b = axwyVar;
        this.a = chrxVar;
    }

    @Override // defpackage.ciur
    public chuz a() {
        chuz b = chuz.b(this.c.i);
        return b == null ? chuz.CHECK_BACK_LATER : b;
    }

    @Override // defpackage.ciur
    public cqkl b() {
        chuz chuzVar = chuz.CHECK_BACK_LATER;
        chuz b = chuz.b(this.c.i);
        if (b == null) {
            b = chuz.CHECK_BACK_LATER;
        }
        int ordinal = b.ordinal();
        if (ordinal == 2) {
            this.a.i(chtq.f());
        } else if (ordinal == 3) {
            this.a.i(chtq.h());
        }
        return cqkl.a;
    }

    @Override // defpackage.ciur
    public Boolean c() {
        chuz chuzVar = chuz.CHECK_BACK_LATER;
        int ordinal = a().ordinal();
        if (ordinal != 2 && ordinal == 3) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ciur
    public cjtd d() {
        chuz chuzVar = chuz.CHECK_BACK_LATER;
        int ordinal = a().ordinal();
        ddho ddhoVar = null;
        if (ordinal == 0) {
            ddhoVar = dtxl.ia;
        } else if (ordinal == 1) {
            ddhoVar = dtxl.ic;
        } else if (ordinal == 2) {
            ddhoVar = dtxl.ie;
        } else if (ordinal == 3 || (ordinal != 4 && ordinal == 5)) {
            ddhoVar = dtxl.f13if;
        }
        return (cjtd) dbsg.j(ddhoVar).h(cius.a).f();
    }

    @Override // defpackage.ciur
    public izx e() {
        chuz chuzVar = chuz.CHECK_BACK_LATER;
        chuz b = chuz.b(this.c.i);
        if (b == null) {
            b = chuz.CHECK_BACK_LATER;
        }
        int ordinal = b.ordinal();
        if (ordinal != 2) {
            if (ordinal == 4) {
                return new ivd(cqrt.g(2131232137, ibm.x()), new cqvf(R.string.CZ_ZERO_STATE_SUBHEADING_CREATE_NEW_LIST_BUTTON_TEXT), ibm.c(), new ivc(this) { // from class: ciut
                    private final ciuw a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ivc
                    public final void a(cjqm cjqmVar) {
                        this.a.b.n();
                    }
                }, cjtd.a(dtxl.id));
            }
            if (ordinal == 5) {
                return new ivd(null, new cqvf(R.string.CZ_ZERO_STATE_UPLOAD_PHOTO_BEFORE_TAG_V2_BUTTON), ibm.c(), new ivc(this) { // from class: ciuu
                    private final ciuw a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ivc
                    public final void a(cjqm cjqmVar) {
                        this.a.a.i(chtq.h());
                    }
                }, cjtd.a(dtxl.ig));
            }
            return null;
        }
        return new ivd(null, new cqvf(R.string.CZ_ZERO_STATE_RATE_BEFORE_REVIEW_BUTTON), ibm.c(), new ivc(this) { // from class: ciuv
            private final ciuw a;

            {
                this.a = this;
            }

            @Override // defpackage.ivc
            public final void a(cjqm cjqmVar) {
                this.a.a.i(chtq.f());
            }
        }, cjtd.a(dtxl.ie));
    }
}
