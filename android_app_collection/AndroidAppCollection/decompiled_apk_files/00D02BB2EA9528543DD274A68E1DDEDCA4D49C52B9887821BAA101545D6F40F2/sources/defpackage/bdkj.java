package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import java.io.File;
/* compiled from: PG */
/* renamed from: bdkj  reason: default package */
/* loaded from: classes3.dex */
public final class bdkj {
    private final Context a;

    public bdkj(Application application) {
        this.a = application;
    }

    @dzsi
    private final File c(String str, String str2) {
        File[] externalMediaDirs;
        File file;
        dccx F = dcdc.F();
        dccx F2 = dcdc.F();
        for (File file2 : this.a.getExternalMediaDirs()) {
            if (file2 != null && "mounted".equals(Environment.getExternalStorageState(file2))) {
                F2.g(file2);
            }
        }
        F.i(F2.f());
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(str2);
        if (true != "mounted".equals(Environment.getExternalStorageState())) {
            externalStoragePublicDirectory = null;
        }
        if (externalStoragePublicDirectory != null) {
            F.g(externalStoragePublicDirectory);
        }
        for (File file3 : F.f()) {
            bvrj.UI_THREAD.d();
            File file4 = new File(file3, "Google Maps");
            file4.mkdirs();
            if (!file4.exists() || !file4.isDirectory() || !file4.canWrite()) {
                file4 = null;
            }
            if (file4 == null) {
                file = null;
                continue;
            } else {
                file = new File(file4, str);
                continue;
            }
            if (file != null) {
                return file;
            }
        }
        return null;
    }

    @dzsi
    public final File a(String str) {
        return c(str, Environment.DIRECTORY_PICTURES);
    }

    @dzsi
    public final File b(String str) {
        return c(str, Environment.DIRECTORY_MOVIES);
    }
}
