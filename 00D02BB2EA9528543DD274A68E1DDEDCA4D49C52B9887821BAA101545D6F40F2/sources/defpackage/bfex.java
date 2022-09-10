package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: bfex  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bfex implements cqjb {
    static final cqjb a = new bfex();

    private bfex() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = bffj.a;
        return context.getString(true != ((bfgt) cqkpVar).H().booleanValue() ? R.string.ACCESSIBILITY_NOT_WHEELCHAIR_ACCESSIBLE : R.string.ACCESSIBILITY_WHEELCHAIR_ACCESSIBLE);
    }
}
