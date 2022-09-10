package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: brjt  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class brjt implements cqjb {
    static final cqjb a = new brjt();

    private brjt() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        return context.getString(true != ((brvd) cqkpVar).T().booleanValue() ? R.string.ACCESSIBILITY_NOT_WHEELCHAIR_ACCESSIBLE : R.string.ACCESSIBILITY_WHEELCHAIR_ACCESSIBLE);
    }
}
