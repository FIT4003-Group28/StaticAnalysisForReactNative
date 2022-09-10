package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.google.android.apps.maps.R;
/* renamed from: athz  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class athz implements cqjb {
    static final cqjb a = new athz();

    private athz() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        atng atngVar = (atng) cqkpVar;
        return new PorterDuffColorFilter(context.getResources().getColor(R.color.mod_google_white), PorterDuff.Mode.SRC_IN);
    }
}
