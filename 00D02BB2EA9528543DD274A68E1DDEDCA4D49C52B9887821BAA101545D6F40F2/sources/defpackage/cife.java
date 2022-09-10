package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: cife  reason: default package */
/* loaded from: classes4.dex */
public class cife extends cifc {
    private final Activity f;
    private final LinkedHashMap<bydi, String> g;

    public cife(Activity activity, cifv cifvVar, chrx chrxVar, chxl chxlVar, chxk chxkVar) {
        super(chrxVar, chxlVar, chxkVar);
        this.g = new LinkedHashMap<>();
        boolean z = false;
        if (q().equals(dqgh.BUSINESS_HOURS) && (p().a & 4) != 0) {
            dnfe dnfeVar = p().d;
            if (((dnfeVar == null ? dnfe.p : dnfeVar).a & 2048) != 0) {
                z = true;
            }
        }
        dbsk.l(z);
        this.f = activity;
        bydk bydkVar = new bydk(activity);
        dnfe dnfeVar2 = p().d;
        dgsl dgslVar = (dnfeVar2 == null ? dnfe.p : dnfeVar2).l;
        for (Map.Entry<bydi, List<String>> entry : bydkVar.d(dgslVar == null ? dgsl.b : dgslVar, TimeZone.getDefault()).entrySet()) {
            this.g.put(entry.getKey(), dbrz.e("\n").g(entry.getValue()));
        }
    }

    @Override // defpackage.cifc
    public final String e() {
        return this.f.getString(R.string.CONFIRM_HOURS_TASK_TITLE);
    }

    @Override // defpackage.cifc
    public final String f() {
        return this.f.getString(R.string.FACTUAL_MODERATION_HOURS_QUESTION);
    }

    @Override // defpackage.cifc
    public final dcdc<cqix<?>> g() {
        return dcdc.f(cqgr.fT(new cifs(), new cifu(this.g)));
    }

    @Override // defpackage.cifc
    public cjtd h() {
        return s(dtxl.gI);
    }

    @Override // defpackage.cifc
    public cjtd i() {
        return s(dtxl.gL);
    }

    @Override // defpackage.cifc
    public cjtd j() {
        return s(dtxl.gJ);
    }

    @Override // defpackage.cifc
    public cjtd k() {
        return s(dtxl.gK);
    }

    @Override // defpackage.cifc
    public String l() {
        return this.f.getString(R.string.MODERATE_EDIT_BUSINESS_HOURS_YES_BUTTON_CONTENT_DESCRIPTION, new Object[]{r()});
    }

    @Override // defpackage.cifc
    public String m() {
        return this.f.getString(R.string.MODERATE_EDIT_BUSINESS_HOURS_NO_BUTTON_CONTENT_DESCRIPTION, new Object[]{r()});
    }

    @Override // defpackage.cifc
    public String n() {
        return this.f.getString(R.string.MODERATE_EDIT_BUSINESS_HOURS_NOT_SURE_BUTTON_CONTENT_DESCRIPTION, new Object[]{r()});
    }
}
