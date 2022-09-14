package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
/* compiled from: PG */
/* renamed from: cxbu  reason: default package */
/* loaded from: classes5.dex */
final class cxbu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(File file) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Files.isSymbolicLink(file.toPath());
        }
        try {
            File file2 = new File(file.getParentFile().getCanonicalFile(), file.getName());
            return !file2.getCanonicalFile().equals(file2.getAbsoluteFile());
        } catch (IOException unused) {
            return true;
        }
    }
}
