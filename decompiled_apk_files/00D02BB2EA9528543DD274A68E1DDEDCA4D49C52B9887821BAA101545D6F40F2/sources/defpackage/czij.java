package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
/* compiled from: PG */
/* renamed from: czij  reason: default package */
/* loaded from: classes5.dex */
public final class czij {
    public static File a(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            SystemClock.sleep(100L);
            filesDir = context.getFilesDir();
            if (filesDir == null) {
                throw new IllegalStateException("getFilesDir returned null twice.");
            }
        }
        return filesDir;
    }
}
