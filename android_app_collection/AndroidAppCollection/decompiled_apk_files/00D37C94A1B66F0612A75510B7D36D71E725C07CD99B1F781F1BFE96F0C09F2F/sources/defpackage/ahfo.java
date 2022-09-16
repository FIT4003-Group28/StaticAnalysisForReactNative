package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.backup.Backup;
/* compiled from: PG */
/* renamed from: ahfo  reason: default package */
/* loaded from: classes.dex */
public final class ahfo {
    @Backup
    public static final String QUICK_SEEK_PREFERENCE_STRING = "double_tap_skip_duration";

    private ahfo() {
    }

    public static void a(ahyp ahypVar) {
        ahypVar.nf();
    }

    public static void b(ahyp ahypVar, auad auadVar, boolean z) {
        arag aragVar = auadVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        ahypVar.nh(ajgl.b(aragVar).toString(), z);
    }

    public static int c(int i) {
        return i - 1;
    }

    public static int d(int i, String str) {
        return i == 0 ? !TextUtils.isEmpty(str) ? 0 : -1 : i;
    }
}
