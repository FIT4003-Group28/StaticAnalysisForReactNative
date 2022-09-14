package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: PG */
/* renamed from: cofj  reason: default package */
/* loaded from: classes5.dex */
final class cofj {
    public static File a(Context context) {
        File noBackupFilesDir = context.getNoBackupFilesDir();
        return (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) ? context.getFilesDir() : noBackupFilesDir;
    }
}
