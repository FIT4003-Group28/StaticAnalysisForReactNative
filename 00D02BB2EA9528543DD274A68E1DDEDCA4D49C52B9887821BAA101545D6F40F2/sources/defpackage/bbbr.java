package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bbbr  reason: default package */
/* loaded from: classes3.dex */
class bbbr implements baye {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ bbbv c;

    public bbbr(bbbv bbbvVar, boolean z, boolean z2) {
        this.c = bbbvVar;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.baye
    public Boolean a() {
        boolean z = false;
        if (this.c.QI().isEmpty() && !this.c.d().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.baye
    public String d() {
        return (!this.a || !this.b) ? this.c.d.getString(R.string.TURN_ON) : "";
    }

    @Override // defpackage.baye
    public cqkl e() {
        this.c.e();
        return cqkl.a;
    }

    @Override // defpackage.baye
    public cjtd f() {
        return cjtd.a(dtyd.dm);
    }

    @Override // defpackage.baye
    public cqtd g() {
        return cqqg.a((int) R.drawable.yourplaces_illustration_visited);
    }

    @Override // defpackage.baye
    public Boolean h() {
        return false;
    }

    @Override // defpackage.baye
    public String b() {
        if (!this.a || !this.b) {
            return this.c.d.getString(R.string.VISITED_PLACES_EMPTY_STATE_HEADLINE_PROMPT);
        }
        return this.c.d.getString(R.string.VISITED_PLACES_EMPTY_STATE_HEADLINE);
    }

    @Override // defpackage.baye
    public String c() {
        if (this.a) {
            if (!this.b) {
                return this.c.d.getString(R.string.VISITED_PLACES_TURN_ON_LOCATION_HISTORY_PROMPT);
            }
            return this.c.d.getString(R.string.VISITED_PLACES_EMPTY_STATE_DETAILS);
        } else if (this.b) {
            return this.c.d.getString(R.string.VISITED_PLACES_TURN_ON_WEB_AND_APP_ACTIVITY_PROMPT);
        } else {
            return this.c.d.getString(R.string.VISITED_PLACES_TURN_ON_GOOGLE_ACCOUNT_SETTINGS_PROMPT);
        }
    }
}
