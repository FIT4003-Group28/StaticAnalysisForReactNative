package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.DisplayMetrics;
/* compiled from: PG */
/* renamed from: mgq  reason: default package */
/* loaded from: classes3.dex */
final class mgq extends mgo {
    public mgq(Context context, LinearLayoutManager linearLayoutManager) {
        super(context, linearLayoutManager);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yk
    public final float a(DisplayMetrics displayMetrics) {
        return 37.5f / displayMetrics.densityDpi;
    }
}
