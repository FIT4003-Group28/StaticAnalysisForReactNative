package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bvoj  reason: default package */
/* loaded from: classes4.dex */
public class bvoj {
    public static void a(Context context) {
        bvrj.UI_THREAD.c();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                context.getResources().getFont(R.font.google_sans);
                context.getResources().getFont(R.font.google_sans_medium);
            } catch (Exception e) {
                bvoo.j(e);
            }
        }
    }
}
