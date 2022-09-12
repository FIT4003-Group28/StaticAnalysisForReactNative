package defpackage;

import android.content.Context;
import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: clbn  reason: default package */
/* loaded from: classes5.dex */
public final class clbn {
    public final Resources a;
    private final Context b;

    public clbn(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        Resources resources = applicationContext.getResources();
        this.a = resources;
        a(10);
        int i = resources.getDisplayMetrics().densityDpi;
    }

    public final int a(int i) {
        return (int) (i * this.a.getDisplayMetrics().density);
    }
}
