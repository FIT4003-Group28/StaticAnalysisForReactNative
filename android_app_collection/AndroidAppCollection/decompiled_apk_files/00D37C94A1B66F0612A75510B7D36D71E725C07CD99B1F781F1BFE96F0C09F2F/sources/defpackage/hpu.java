package defpackage;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hpu  reason: default package */
/* loaded from: classes3.dex */
public final class hpu {
    public final Context a;
    public final ajxz b;
    public final aafo c;
    public final acth d;
    public final hwq e;
    public final Map f = new HashMap();

    public hpu(Context context, ajxz ajxzVar, aafo aafoVar, hwq hwqVar, acth acthVar) {
        this.a = context;
        this.b = ajxzVar;
        this.c = aafoVar;
        this.d = acthVar;
        this.e = hwqVar;
    }

    public static void a(View view, boolean z) {
        view.setEnabled(z);
        view.setAlpha(true != z ? 0.33f : 1.0f);
    }
}
