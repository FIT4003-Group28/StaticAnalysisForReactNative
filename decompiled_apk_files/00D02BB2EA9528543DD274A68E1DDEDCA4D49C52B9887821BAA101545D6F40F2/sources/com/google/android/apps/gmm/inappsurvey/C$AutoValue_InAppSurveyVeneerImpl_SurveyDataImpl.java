package com.google.android.apps.gmm.inappsurvey;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.inappsurvey.$AutoValue_InAppSurveyVeneerImpl_SurveyDataImpl  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_InAppSurveyVeneerImpl_SurveyDataImpl extends InAppSurveyVeneerImpl$SurveyDataImpl {
    public final Intent a;

    public C$AutoValue_InAppSurveyVeneerImpl_SurveyDataImpl(Intent intent) {
        if (intent != null) {
            this.a = intent;
            return;
        }
        throw new NullPointerException("Null intent");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gmm.inappsurvey.InAppSurveyVeneerImpl$SurveyDataImpl
    public final Intent a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InAppSurveyVeneerImpl$SurveyDataImpl)) {
            return false;
        }
        return this.a.equals(((InAppSurveyVeneerImpl$SurveyDataImpl) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("SurveyDataImpl{intent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
