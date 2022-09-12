package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import java.io.File;
/* compiled from: PG */
/* renamed from: kge  reason: default package */
/* loaded from: classes7.dex */
public final class kge {
    public static boolean a(Context context) {
        return b(context).canRead();
    }

    public static File b(Context context) {
        File file = new File(context.getExternalFilesDir(null), "demomode.ini");
        if (!file.exists() && Build.VERSION.SDK_INT < 29) {
            file = new File(Environment.getExternalStorageDirectory(), "demomode.ini");
        }
        file.getPath();
        file.exists();
        return file;
    }
}
