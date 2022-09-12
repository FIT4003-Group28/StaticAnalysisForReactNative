package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: owp  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class owp implements cqjb {
    static final cqjb a = new owp();

    private owp() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        oxy oxyVar = (oxy) cqkpVar;
        return String.format("%s\n%s", context.getString(R.string.EDIT_DETAILS_CONTENT_DESCRIPTION, oxyVar.f(), oww.d(oxyVar, context), oxyVar.b()), oxyVar.h());
    }
}
