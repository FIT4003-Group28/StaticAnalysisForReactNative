package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ciel  reason: default package */
/* loaded from: classes4.dex */
public class ciel extends cifc {
    private final Activity f;

    public ciel(Activity activity, chrx chrxVar, chxl chxlVar, chxk chxkVar) {
        super(chrxVar, chxlVar, chxkVar);
        boolean z = false;
        if (q().equals(dqgh.CLOSED) && (p().a & 4) != 0) {
            z = true;
        }
        dbsk.l(z);
        this.f = activity;
    }

    private final boolean t() {
        dnfe dnfeVar = p().d;
        if (dnfeVar == null) {
            dnfeVar = dnfe.p;
        }
        return dnfeVar.d;
    }

    @Override // defpackage.cifc
    public final String e() {
        return this.f.getString(R.string.CONFIRM_PLACE_INFO_TASK_TITLE);
    }

    @Override // defpackage.cifc
    public final String f() {
        if (t()) {
            return this.f.getString(R.string.FACTUAL_MODERATION_CLOSED_QUESTION);
        }
        return this.f.getString(R.string.FACTUAL_MODERATION_OPEN_QUESTION);
    }

    @Override // defpackage.cifc
    public final dcdc<cqix<?>> g() {
        return dcdc.e();
    }

    @Override // defpackage.cifc
    public cjtd h() {
        if (t()) {
            return s(dtxl.gM);
        }
        return s(dtxl.gU);
    }

    @Override // defpackage.cifc
    public cjtd i() {
        if (t()) {
            return s(dtxl.gP);
        }
        return s(dtxl.gX);
    }

    @Override // defpackage.cifc
    public cjtd j() {
        if (t()) {
            return s(dtxl.gN);
        }
        return s(dtxl.gV);
    }

    @Override // defpackage.cifc
    public cjtd k() {
        if (t()) {
            return s(dtxl.gO);
        }
        return s(dtxl.gW);
    }

    @Override // defpackage.cifc
    public String l() {
        return t() ? this.f.getString(R.string.MODERATE_EDIT_CLOSED_YES_BUTTON_CONTENT_DESCRIPTION, new Object[]{r()}) : this.f.getString(R.string.MODERATE_EDIT_REOPENED_YES_BUTTON_CONTENT_DESCRIPTION, new Object[]{r()});
    }

    @Override // defpackage.cifc
    public String m() {
        return t() ? this.f.getString(R.string.MODERATE_EDIT_CLOSED_NO_BUTTON_CONTENT_DESCRIPTION, new Object[]{r()}) : this.f.getString(R.string.MODERATE_EDIT_REOPENED_NO_BUTTON_CONTENT_DESCRIPTION, new Object[]{r()});
    }

    @Override // defpackage.cifc
    public String n() {
        if (t()) {
            return this.f.getString(R.string.MODERATE_EDIT_CLOSED_NOT_SURE_BUTTON_CONTENT_DESCRIPTION, new Object[]{r()});
        }
        return this.f.getString(R.string.MODERATE_EDIT_REOPENED_NOT_SURE_BUTTON_CONTENT_DESCRIPTION, new Object[]{r()});
    }
}
