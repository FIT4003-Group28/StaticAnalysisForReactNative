package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.DisplayMetrics;
/* compiled from: PG */
/* renamed from: mgp  reason: default package */
/* loaded from: classes3.dex */
final class mgp extends mgo {
    public mgp(Context context, LinearLayoutManager linearLayoutManager) {
        super(context, linearLayoutManager);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yk
    public final float a(DisplayMetrics displayMetrics) {
        return 50.0f / displayMetrics.densityDpi;
    }
}
