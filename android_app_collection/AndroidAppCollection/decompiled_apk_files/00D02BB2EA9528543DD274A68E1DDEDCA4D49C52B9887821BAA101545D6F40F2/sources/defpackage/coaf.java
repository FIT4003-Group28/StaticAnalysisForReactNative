package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: coaf  reason: default package */
/* loaded from: classes5.dex */
public final class coaf {
    public static boolean a(File file) {
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    a(file2);
                }
            }
            return file.delete();
        }
        return true;
    }
}
