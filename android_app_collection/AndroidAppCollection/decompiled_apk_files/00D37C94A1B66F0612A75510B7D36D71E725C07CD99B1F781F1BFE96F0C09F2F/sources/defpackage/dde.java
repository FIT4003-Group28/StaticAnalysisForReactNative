package defpackage;

import android.content.Context;
import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: dde  reason: default package */
/* loaded from: classes3.dex */
public final class dde {
    public final Resources.Theme a;
    private final Resources b;
    private final Context c;

    public dde(cyv cyvVar) {
        Context context = cyvVar.b;
        this.c = context;
        this.b = context.getResources();
        this.a = context.getTheme();
    }

    public final int a(float f) {
        return czu.f(f * this.b.getDisplayMetrics().density);
    }

    public final int b(float f) {
        return czu.f(f * this.b.getDisplayMetrics().scaledDensity);
    }
}
