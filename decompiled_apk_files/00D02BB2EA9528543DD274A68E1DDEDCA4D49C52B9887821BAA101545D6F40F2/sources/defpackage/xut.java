package defpackage;

import android.content.Context;
import android.util.TypedValue;
/* renamed from: xut  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class xut implements cqjb {
    static final cqjb a = new xut();

    private xut() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        xzn O = ((xzo) cqkpVar).O();
        int i = 0;
        if (O != null && O.e().booleanValue()) {
            i = (int) TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics());
        }
        return Integer.valueOf(i);
    }
}
