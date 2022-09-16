package defpackage;

import java.io.File;
import java.io.FileFilter;
/* compiled from: PG */
/* renamed from: zec  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zec implements FileFilter {
    private final /* synthetic */ int d;
    public static final /* synthetic */ zec c = new zec(3);
    public static final /* synthetic */ zec b = new zec(2);
    public static final /* synthetic */ zec a = new zec();

    private /* synthetic */ zec() {
    }

    public zec(int i) {
        this.d = i;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return file.getName().startsWith("BLOB_STORAGE");
                }
                long j = alum.a;
                return file.getName().endsWith(".apk");
            }
            String name = file.getName();
            if (name.startsWith("cpu")) {
                for (int i2 = 3; i2 < name.length(); i2++) {
                    if (Character.isDigit(name.charAt(i2))) {
                    }
                }
                return true;
            }
            return false;
        }
        return file.getAbsolutePath().contains("_cleanup_mv");
    }
}
