package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bbbc  reason: default package */
/* loaded from: classes3.dex */
public class bbbc implements baye {
    static final int[] a = {bzqb.WEB_AND_APP_ACTIVITY.d};
    private final gga b;
    private final cklf c;
    private final bzqa d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final int h;
    private final int i;
    private final int j;
    private final ddho k;

    public bbbc(gga ggaVar, cklf cklfVar, bzqa bzqaVar, boolean z, boolean z2, boolean z3) {
        ddho ddhoVar;
        this.b = ggaVar;
        this.c = cklfVar;
        this.d = bzqaVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        if (!z2) {
            this.i = R.string.UPCOMING_RESERVATIONS_EMPTY_STATE_HEADLINE_PROMPT;
            this.h = R.string.UPCOMING_RESERVATIONS_TURN_ON_WEB_AND_APP_ACTIVITY_PROMPT_GMAIL_AND_CALENDAR;
            this.j = R.string.TURN_ON;
            ddhoVar = dtyd.cT;
        } else if (!z3) {
            this.i = R.string.UPCOMING_RESERVATIONS_EMPTY_STATE_HEADLINE_PERSONAL_EVENTS;
            this.h = R.string.UPCOMING_RESERVATIONS_TURN_ON_PERSONAL_EVENTS_PROMPT;
            this.j = R.string.TURN_ON_PERSONAL_EVENTS;
            ddhoVar = dtyd.cU;
        } else {
            this.i = R.string.UPCOMING_RESERVATIONS_EMPTY_STATE_HEADLINE;
            this.h = R.string.UPCOMING_RESERVATIONS_EMPTY_STATE_DETAILS_GMAIL_AND_CALENDAR;
            this.j = R.string.LEARN_MORE;
            ddhoVar = dtyi.bW;
        }
        this.k = ddhoVar;
    }

    @Override // defpackage.baye
    public Boolean a() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.baye
    public String b() {
        return this.b.getString(this.i);
    }

    @Override // defpackage.baye
    public String c() {
        return this.b.getString(this.h);
    }

    @Override // defpackage.baye
    public String d() {
        return this.b.getString(this.j);
    }

    @Override // defpackage.baye
    public cqkl e() {
        if (!this.f) {
            this.d.a(a, new baty(), "geo_personal_place_upcoming_reservations");
        } else if (!this.g) {
            bszv.ba(this.b, btki.aU(1));
        } else {
            this.c.a("answers_cards_android");
        }
        return cqkl.a;
    }

    @Override // defpackage.baye
    public cjtd f() {
        return cjtd.a(this.k);
    }

    @Override // defpackage.baye
    public cqtd g() {
        return cqqg.a((int) R.drawable.yourplaces_illustration_upcoming);
    }

    @Override // defpackage.baye
    public Boolean h() {
        return false;
    }
}
