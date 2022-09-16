package defpackage;

import android.content.Context;
import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: cmo  reason: default package */
/* loaded from: classes5.dex */
public final class cmo {
    public static final int a(cmm cmmVar, Context context, Resources resources) {
        cmm cmmVar2 = cmm.DRAWER_HEADER_HEIGHT;
        int identifier = resources.getIdentifier(cmmVar.d, "dimen", context.getPackageName());
        if (identifier == 0) {
            String valueOf = String.valueOf(cmmVar.d);
            throw new Resources.NotFoundException(valueOf.length() != 0 ? "Can't find resource: @dimen/".concat(valueOf) : new String("Can't find resource: @dimen/"));
        }
        return resources.getDimensionPixelOffset(identifier);
    }

    public static final boolean b(cml cmlVar, Context context, Resources resources) {
        cml cmlVar2 = cml.SUPPORTS_WINDOW_INSETS;
        int identifier = resources.getIdentifier(cmlVar.d, "bool", context.getPackageName());
        if (identifier == 0) {
            Boolean bool = cmlVar.e;
            if (bool != null) {
                return bool.booleanValue();
            }
            String valueOf = String.valueOf(cmlVar.d);
            throw new Resources.NotFoundException(valueOf.length() != 0 ? "Can't find resource: @bool/".concat(valueOf) : new String("Can't find resource: @bool/"));
        }
        return resources.getBoolean(identifier);
    }
}
