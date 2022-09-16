package defpackage;

import android.content.Context;
import java.io.InputStream;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dbja  reason: default package */
/* loaded from: classes5.dex */
public final class dbja {
    public static Callable<InputStream> a(final Context context, final int i) {
        dbjb.d(context, "Parameter \"context\" was null.");
        String resourceTypeName = context.getResources().getResourceTypeName(i);
        if (resourceTypeName.equals("raw") || resourceTypeName.equals("drawable")) {
            return new Callable(context, i) { // from class: dbiz
                private final Context a;
                private final int b;

                {
                    this.a = context;
                    this.b = i;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = this.a;
                    return context2.getResources().openRawResource(this.b);
                }
            };
        }
        String resourceName = context.getResources().getResourceName(i);
        StringBuilder sb = new StringBuilder(String.valueOf(resourceTypeName).length() + 73 + String.valueOf(resourceName).length());
        sb.append("Unknown resource resourceType '");
        sb.append(resourceTypeName);
        sb.append("' in resId '");
        sb.append(resourceName);
        sb.append("'. Resource will not be loaded");
        throw new IllegalArgumentException(sb.toString());
    }
}
