package defpackage;

import java.io.File;
import java.util.Random;
/* compiled from: PG */
/* renamed from: affb  reason: default package */
/* loaded from: classes.dex */
public final class affb {
    static {
        new Random();
    }

    @dzsi
    public static File a(File file) {
        file.mkdirs();
        if (file.exists()) {
            if (((!file.canRead()) || file.setReadable(true)) && (((!file.canWrite()) || file.setWritable(true)) && !(!file.canExecute()))) {
                file.setExecutable(true);
            }
            return file;
        }
        return null;
    }
}
