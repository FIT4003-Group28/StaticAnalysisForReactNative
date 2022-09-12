package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cet  reason: default package */
/* loaded from: classes4.dex */
public final class cet {
    private static volatile boolean a = true;

    public static Drawable a(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (a) {
                return sl.b(theme != null ? new uf(context2, theme) : context2, i);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return context2.getDrawable(i);
            }
            throw e;
        } catch (NoClassDefFoundError unused2) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return context2.getResources().getDrawable(i, theme);
    }
}
