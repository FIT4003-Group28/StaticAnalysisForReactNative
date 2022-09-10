package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: cyug  reason: default package */
/* loaded from: classes5.dex */
public final class cyug {
    public final String a;
    private final ConcurrentMap<String, Object> b = new ConcurrentHashMap();

    public cyug(Context context, cych cychVar) {
        boolean z = true;
        dbsk.b(cychVar.d != null, "accountData does not have a GaiaId.");
        cyxe.a();
        String str = null;
        if (dybx.b()) {
            File filesDir = context.getFilesDir();
            if (filesDir != null) {
                str = dbrz.e(File.separator).i(filesDir.getAbsolutePath(), "peopleCache", cychVar.a, cychVar.b);
            }
        } else {
            File cacheDir = context.getCacheDir();
            if (cacheDir != null) {
                String absolutePath = cacheDir.getAbsolutePath();
                String str2 = File.separator;
                String str3 = cychVar.d;
                StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
                sb.append(absolutePath);
                sb.append(str2);
                sb.append(str3);
                str = sb.toString();
            }
        }
        this.a = str;
        dbsk.m(str == null ? false : z, "Local Cache directory can not be found.");
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return;
        }
        throw new IOException("Cannot create a cache directory ");
    }

    public final byte[] a(String str) {
        FileInputStream fileInputStream;
        cyxe.a();
        synchronized (b(str)) {
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = new FileInputStream(new File(this.a, str));
                try {
                    byte[] bArr = new byte[fileInputStream.available()];
                    fileInputStream.read(bArr);
                    try {
                        fileInputStream.close();
                    } catch (Exception unused) {
                    }
                    return bArr;
                } catch (FileNotFoundException unused2) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception unused3) {
                        }
                    }
                    return null;
                } catch (IOException unused4) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception unused5) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (Exception unused6) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused7) {
                fileInputStream = null;
            } catch (IOException unused8) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final Object b(String str) {
        Object obj = new Object();
        Object putIfAbsent = this.b.putIfAbsent(str, obj);
        return putIfAbsent == null ? obj : putIfAbsent;
    }
}
