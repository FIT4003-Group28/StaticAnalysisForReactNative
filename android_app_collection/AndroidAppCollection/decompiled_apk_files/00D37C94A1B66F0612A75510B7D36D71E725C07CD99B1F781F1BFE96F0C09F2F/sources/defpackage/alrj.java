package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: PG */
/* renamed from: alrj  reason: default package */
/* loaded from: classes.dex */
public final class alrj {
    public final Context a;

    public alrj(Context context) {
        this.a = context;
    }

    public static long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j += a(file2);
            }
        }
        return j;
    }
}
