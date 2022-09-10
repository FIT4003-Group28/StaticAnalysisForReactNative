package defpackage;

import android.net.Uri;
import android.system.Os;
import android.system.StructStat;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: czmo  reason: default package */
/* loaded from: classes5.dex */
public final class czmo {
    public static IOException a(czif czifVar, Uri uri, IOException iOException) {
        try {
            czji b = czji.b();
            b.c();
            File file = (File) czifVar.d(uri, b, new czio[0]);
            if (!file.exists()) {
                return new IOException(iOException);
            }
            if (!file.isFile()) {
                return new IOException(iOException);
            }
            if (!file.canRead()) {
                return new IOException(iOException);
            }
            return c(file, iOException);
        } catch (IOException unused) {
            return iOException;
        }
    }

    public static IOException b(czif czifVar, Uri uri, IOException iOException) {
        try {
            czji b = czji.b();
            b.c();
            File file = (File) czifVar.d(uri, b, new czio[0]);
            if (!file.exists() || file.isFile()) {
                if (!file.exists() || file.canWrite()) {
                    return c(file, iOException);
                }
                return new IOException(iOException);
            }
            return new IOException(iOException);
        } catch (IOException unused) {
            return iOException;
        }
    }

    private static IOException c(File file, IOException iOException) {
        try {
            String valueOf = String.valueOf(String.format(Locale.US, " canonical[%s] freeSpace[%d] exists[%b] isFile[%b] canRead[%b] canWrite[%b]", file.getCanonicalPath(), Long.valueOf(file.getFreeSpace()), Boolean.valueOf(file.exists()), Boolean.valueOf(file.isFile()), Boolean.valueOf(file.canRead()), Boolean.valueOf(file.canWrite())));
            String concat = valueOf.length() != 0 ? "Inoperable file:".concat(valueOf) : new String("Inoperable file:");
            try {
                StructStat stat = Os.stat(file.getCanonicalPath());
                String valueOf2 = String.valueOf(concat);
                String valueOf3 = String.valueOf(String.format(Locale.US, " mode[%d]", Integer.valueOf(stat.st_mode)));
                concat = valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
            } catch (Exception unused) {
            }
            return new IOException(concat, iOException);
        } catch (IOException unused2) {
            return iOException;
        }
    }
}
