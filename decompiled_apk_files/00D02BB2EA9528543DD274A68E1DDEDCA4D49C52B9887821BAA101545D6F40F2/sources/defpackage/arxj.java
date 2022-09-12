package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: arxj  reason: default package */
/* loaded from: classes2.dex */
public abstract class arxj {
    public static arxj d(Context context, String str) {
        CharSequence charSequence;
        cqtd cqtdVar = null;
        try {
            charSequence = context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
        } catch (PackageManager.NameNotFoundException e) {
            e.getMessage();
            charSequence = null;
        }
        if (!str.equals("com.spotify.music")) {
            try {
                Drawable applicationIcon = context.getPackageManager().getApplicationIcon(str);
                if (applicationIcon != null) {
                    cqtdVar = new arxi(new Object[]{applicationIcon}, applicationIcon);
                }
            } catch (PackageManager.NameNotFoundException e2) {
                e2.getMessage();
            }
        } else {
            cqtdVar = cqrt.f(2131233066);
        }
        return new arxh(charSequence, cqtdVar, str);
    }

    @dzsi
    public abstract CharSequence a();

    @dzsi
    public abstract cqtd b();

    public abstract String c();
}
