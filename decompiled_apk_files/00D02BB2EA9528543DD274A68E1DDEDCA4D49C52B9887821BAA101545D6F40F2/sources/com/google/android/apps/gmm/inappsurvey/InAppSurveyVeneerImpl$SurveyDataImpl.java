package com.google.android.apps.gmm.inappsurvey;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gmm.inappsurvey.api.SurveyData;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class InAppSurveyVeneerImpl$SurveyDataImpl implements SurveyData, Parcelable {
    @dzsi
    private final String f(String str) {
        Bundle extras = a().getExtras();
        if (extras != null) {
            return extras.getString(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Intent a();

    @Override // com.google.android.apps.gmm.inappsurvey.api.SurveyData
    @dzsi
    public final String b() {
        return f("survey_url");
    }

    @Override // com.google.android.apps.gmm.inappsurvey.api.SurveyData
    @dzsi
    public final String c() {
        return f("notification_tag");
    }

    @Override // com.google.android.apps.gmm.inappsurvey.api.SurveyData
    @dzsi
    public final Long d() {
        String f = f("survey_expiration");
        if (f != null) {
            try {
                return Long.valueOf(Long.parseLong(f));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.apps.gmm.inappsurvey.api.SurveyData
    public final Bundle e() {
        Bundle extras = a().getExtras();
        return extras != null ? extras : Bundle.EMPTY;
    }
}
