package defpackage;

import android.accounts.Account;
import android.app.Activity;
import com.google.android.libraries.surveys.SurveyData;
import java.util.List;
/* compiled from: PG */
/* renamed from: cznu  reason: default package */
/* loaded from: classes5.dex */
public final class cznu {
    public final Activity a;
    public Integer b;
    public Account c;
    public final SurveyData d;
    public List<mx<String, String>> e;
    public cznw f;
    public cznv g;
    public acwq h;

    public cznu(Activity activity, SurveyData surveyData) {
        if (activity != null) {
            this.a = activity;
            this.d = surveyData;
            this.f = cznw.FIRST_CARD_NON_MODAL;
            this.g = cznv.CARD;
            return;
        }
        throw new IllegalArgumentException("Client activity is not set.");
    }
}
