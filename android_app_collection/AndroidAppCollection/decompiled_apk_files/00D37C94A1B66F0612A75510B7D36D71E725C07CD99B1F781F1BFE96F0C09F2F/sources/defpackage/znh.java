package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: znh  reason: default package */
/* loaded from: classes4.dex */
public final class znh {
    public File a;
    private final long b;
    private final snc c;

    public znh(Context context, int i, String str, long j, snc sncVar) {
        File filesDir;
        File file = null;
        if (i != 1) {
            filesDir = context.getExternalFilesDir(null);
        } else {
            filesDir = context.getFilesDir();
        }
        if (filesDir != null) {
            File file2 = new File(filesDir, str);
            try {
                this.a = (file2.exists() || file2.mkdirs()) ? file2 : file;
            } catch (SecurityException e) {
                zep.d("Error creating cache dir", e);
            }
        }
        this.b = TimeUnit.SECONDS.toMillis(j);
        this.c = sncVar;
    }

    public static void c(File file, List list) {
        if (file == null) {
            return;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    c(file2, list);
                } else {
                    list.add(file2);
                }
            }
        } catch (SecurityException e) {
            zep.d("Exception in listing directory files", e);
        }
    }

    public final void a(Set set) {
        ylr.b();
        if (this.a == null) {
            return;
        }
        long c = this.c.c();
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                File file = new File(this.a, (String) it.next());
                try {
                    if (file.exists() && !file.setLastModified(c)) {
                        String valueOf = String.valueOf(file.getPath());
                        zep.b(valueOf.length() != 0 ? "Unable to update timestamp for ".concat(valueOf) : new String("Unable to update timestamp for "));
                    }
                } catch (SecurityException e) {
                    zep.d("Exception in modifying file's last modified timestamp", e);
                }
            }
        }
        File file2 = this.a;
        ArrayList<File> arrayList = new ArrayList();
        c(file2, arrayList);
        for (File file3 : arrayList) {
            try {
                if (c - file3.lastModified() > this.b) {
                    file3.delete();
                }
            } catch (SecurityException e2) {
                zep.d("Exception in examining/deleting existing file", e2);
            }
        }
    }

    public final boolean b(String str, byte[] bArr) {
        ylr.b();
        File file = this.a;
        if (file == null) {
            return false;
        }
        try {
            File file2 = new File(file, str);
            File parentFile = file2.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            if (file2.exists()) {
                file2.delete();
            }
            if (!file2.createNewFile()) {
                return false;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return true;
        } catch (IOException | SecurityException e) {
            zep.d("Error saving file", e);
            return false;
        }
    }
}
