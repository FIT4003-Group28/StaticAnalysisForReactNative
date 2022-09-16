package defpackage;

import android.widget.RemoteViews;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ase  reason: default package */
/* loaded from: classes2.dex */
public final class ase {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(RemoteViews remoteViews, int i, CharSequence charSequence) {
        remoteViews.setContentDescription(R.id.action0, charSequence);
    }

    public static long b(String str) {
        long j = 0;
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                long charAt = j ^ str.charAt(i);
                j = charAt + charAt + charAt + (charAt << 4) + (charAt << 5) + (charAt << 7) + (charAt << 8) + (charAt << 40);
            }
        }
        return j;
    }
}
