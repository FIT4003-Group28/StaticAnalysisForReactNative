package defpackage;

import android.content.SharedPreferences;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: akwk  reason: default package */
/* loaded from: classes.dex */
public final class akwk implements akwl {
    private final File a;
    private boolean b = false;

    public akwk(SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        String string = sharedPreferences.getString("system_health_metric_disk_output_dir", null);
        if (string == null) {
            this.a = null;
            return;
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        String valueOf = String.valueOf(File.separator);
        this.a = new File(externalStorageDirectory, string.length() != 0 ? valueOf.concat(string) : new String(valueOf));
    }

    @Override // defpackage.akwl
    public final void a(avff avffVar) {
        File file = this.a;
        if (file == null) {
            return;
        }
        if (!file.exists()) {
            this.a.mkdirs();
        }
        this.b = true;
    }

    @Override // defpackage.akwl
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.akwl
    public final void c(aven avenVar) {
        e(avenVar);
    }

    @Override // defpackage.akwl
    public final void d(aven avenVar) {
        e(avenVar);
    }

    final void e(aven avenVar) {
        String str;
        int i;
        if (!this.b || avenVar == null) {
            return;
        }
        try {
            Locale locale = Locale.ENGLISH;
            Object[] objArr = new Object[2];
            objArr[0] = Long.valueOf(System.currentTimeMillis());
            try {
                i = ((baax) aopi.parseFrom(baax.a, avenVar.f.I(), aoos.b())).b;
            } catch (aopx e) {
                e.printStackTrace();
            }
            if ((i & 64) != 0) {
                str = "crash";
            } else if ((i & 256) != 0) {
                str = "disk";
            } else if ((i & 1) != 0) {
                str = "memory";
            } else if ((i & 32) != 0) {
                str = "network";
            } else {
                if ((i & 128) != 0) {
                    str = "stats";
                }
                str = "unknown";
            }
            objArr[1] = str;
            anhe.g(avenVar.toByteArray(), File.createTempFile(String.format(locale, "%d-%s-", objArr), ".capture", this.a));
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
