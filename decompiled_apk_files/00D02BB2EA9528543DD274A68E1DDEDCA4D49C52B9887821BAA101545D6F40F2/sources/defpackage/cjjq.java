package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cjjq  reason: default package */
/* loaded from: classes4.dex */
public enum cjjq {
    TOOLTIP(2132018033, cjjz.b, -2),
    CALLOUT(2132018032, cjjz.a, -1);
    
    public final dzvk<cjjr, cjiz, Integer, Integer, Integer> c;
    private final int e;
    private final int f;

    cjjq(int i, dzvk dzvkVar, int i2) {
        this.e = i;
        this.c = dzvkVar;
        this.f = i2;
    }

    public final cjjr a(Context context) {
        dzvx.c(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, cjka.a, 0, this.e);
        int i = this.f;
        Resources resources = context.getResources();
        dzvx.b(resources, "context.resources");
        Configuration configuration = resources.getConfiguration();
        dzvx.b(configuration, "context.resources.configuration");
        boolean z = configuration.getLayoutDirection() == 1;
        cjjr cjjrVar = new cjjr(obtainStyledAttributes.getResourceId(4, 0), i, z, obtainStyledAttributes.getDimensionPixelSize(3, 0), obtainStyledAttributes.getDimensionPixelSize(0, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0), obtainStyledAttributes.getDimensionPixelSize(1, 0), obtainStyledAttributes.getDimensionPixelSize(5, 0), context.getResources().getDimensionPixelSize(R.dimen.terra_callout_overlap));
        obtainStyledAttributes.recycle();
        return cjjrVar;
    }
}
