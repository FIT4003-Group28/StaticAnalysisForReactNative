package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: zxq  reason: default package */
/* loaded from: classes4.dex */
public final class zxq {
    public static void a(Context context, ImageView imageView, boolean z) {
        if (imageView == null || context == null) {
            return;
        }
        if (z) {
            imageView.clearColorFilter();
        } else {
            imageView.setColorFilter(new PorterDuffColorFilter(zhn.j(context, R.attr.ytOverlayButtonPrimary).orElse(context.getResources().getColor(R.color.yt_white1_opacity30)), PorterDuff.Mode.MULTIPLY));
        }
    }

    public static void b(Set set, Object obj) {
        if (obj == null) {
            zep.b("EffectsProvider.addListener: Attempt to add null listener");
            return;
        }
        synchronized (set) {
            set.add(obj);
        }
    }

    public static void c(Set set, Object obj) {
        HashSet<zdt> hashSet;
        if (set == null) {
            return;
        }
        synchronized (set) {
            hashSet = new HashSet(set);
        }
        for (zdt zdtVar : hashSet) {
            zdtVar.a(obj);
        }
    }

    public static String d(Throwable th) {
        if (th == null) {
            return "<null>";
        }
        String message = th.getMessage();
        for (int i = 0; th.getCause() != null && i < 10; i++) {
            th = th.getCause();
            String name = th.getClass() != null ? th.getClass().getName() : "<unknownClass>";
            String replaceAll = th.getMessage() != null ? th.getMessage().replaceAll("\\d+", "#") : "<unknownMessage>";
            String valueOf = String.valueOf(message);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(name).length() + String.valueOf(replaceAll).length());
            sb.append(valueOf);
            sb.append(" ::Caused by: ");
            sb.append(name);
            sb.append(": ");
            sb.append(replaceAll);
            message = sb.toString();
        }
        return message;
    }
}
