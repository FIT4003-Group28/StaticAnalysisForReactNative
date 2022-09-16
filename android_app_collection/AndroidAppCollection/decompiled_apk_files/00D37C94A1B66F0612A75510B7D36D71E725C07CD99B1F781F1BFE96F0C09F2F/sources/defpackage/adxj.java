package defpackage;

import java.io.File;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: adxj  reason: default package */
/* loaded from: classes.dex */
public final class adxj {
    public static final adxi a = new adxi();

    public static File a(aken akenVar, File file) {
        if (true != akenVar.a) {
            file = null;
        }
        if (file != null) {
            try {
                file.mkdirs();
                File.createTempFile("cache", "probe", file).delete();
            } catch (IOException unused) {
                afus.e(1, 6, "Cannot write to the cache dir.", 0.1d);
                return null;
            }
        }
        return file;
    }
}
