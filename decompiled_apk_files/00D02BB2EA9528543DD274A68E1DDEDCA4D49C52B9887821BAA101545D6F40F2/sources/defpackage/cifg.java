package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cifg  reason: default package */
/* loaded from: classes4.dex */
public class cifg extends cifc {
    private final Activity f;

    public cifg(Activity activity, chrx chrxVar, chxl chxlVar, chxk chxkVar) {
        super(chrxVar, chxlVar, chxkVar);
        dbsk.l(q().equals(dqgh.DOES_NOT_EXIST));
        this.f = activity;
    }

    @Override // defpackage.cifc
    public final String e() {
        return this.f.getString(R.string.CONFIRM_PLACE_TASK_TITLE);
    }

    @Override // defpackage.cifc
    public final String f() {
        return this.f.getString(R.string.FACTUAL_MODERATION_EXIST_QUESTION);
    }

    @Override // defpackage.cifc
    public final dcdc<cqix<?>> g() {
        return dcdc.e();
    }

    @Override // defpackage.cifc
    public cjtd h() {
        return s(dtxl.gQ);
    }

    @Override // defpackage.cifc
    public cjtd i() {
        return s(dtxl.gT);
    }

    @Override // defpackage.cifc
    public cjtd j() {
        return s(dtxl.gR);
    }

    @Override // defpackage.cifc
    public cjtd k() {
        return s(dtxl.gS);
    }

    @Override // defpackage.cifc
    public String l() {
        return this.f.getString(R.string.MODERATE_EDIT_DOES_NOT_EXIST_YES_BUTTON_CONTENT_DESCRIPTION, new Object[]{r()});
    }

    @Override // defpackage.cifc
    public String m() {
        return this.f.getString(R.string.MODERATE_EDIT_DOES_NOT_EXIST_NO_BUTTON_CONTENT_DESCRIPTION, new Object[]{r()});
    }

    @Override // defpackage.cifc
    public String n() {
        return this.f.getString(R.string.MODERATE_EDIT_DOES_NOT_EXIST_NOT_SURE_BUTTON_CONTENT_DESCRIPTION, new Object[]{r()});
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cifc
    public final View.OnClickListener o(dosq dosqVar) {
        dosq dosqVar2;
        dnfe dnfeVar = p().d;
        if (dnfeVar == null) {
            dnfeVar = dnfe.p;
        }
        if (dnfeVar.d) {
            if (dosqVar == dosq.VOTE_CORRECT) {
                dosqVar2 = dosq.VOTE_INCORRECT;
            } else if (dosqVar == dosq.VOTE_INCORRECT) {
                dosqVar2 = dosq.VOTE_CORRECT;
            }
            return super.o(dosqVar2);
        }
        return super.o(dosqVar);
    }
}
