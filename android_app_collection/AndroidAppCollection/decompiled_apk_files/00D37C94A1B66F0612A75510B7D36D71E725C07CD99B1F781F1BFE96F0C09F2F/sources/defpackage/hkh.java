package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: hkh  reason: default package */
/* loaded from: classes3.dex */
public final class hkh {
    public final hhl a;

    public hkh(hhl hhlVar) {
        this.a = hhlVar;
    }

    public static boolean a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                a(file2);
            }
        }
        return file.delete();
    }
}
