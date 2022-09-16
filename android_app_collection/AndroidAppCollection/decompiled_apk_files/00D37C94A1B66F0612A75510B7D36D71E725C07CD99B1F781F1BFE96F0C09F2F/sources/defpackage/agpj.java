package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: agpj  reason: default package */
/* loaded from: classes.dex */
public final class agpj implements agpk {
    public final Context a;
    public final String b;
    public final aiwj c;
    public final ywa d;
    public final agvq e;
    public agpi f;
    public final aacz g;
    private final zey h;
    private final ajmy i;
    private final azqb j;
    private final akvm k;
    private final axwu l;
    private final File m;
    private File n;
    private File o;
    private File p;

    public agpj(Context context, String str, zey zeyVar, ajmy ajmyVar, aiwj aiwjVar, ywa ywaVar, aacz aaczVar, agvq agvqVar, azqb azqbVar, akvm akvmVar, axwu axwuVar) {
        File file = new File(z(context, str), "data");
        this.a = context;
        this.b = str;
        this.h = zeyVar;
        this.i = ajmyVar;
        this.c = aiwjVar;
        this.d = ywaVar;
        this.g = aaczVar;
        this.e = agvqVar;
        this.j = azqbVar;
        this.k = akvmVar;
        this.l = axwuVar;
        this.m = file;
    }

    private static File A(Context context, String str, agvq agvqVar) {
        zgh.m(str);
        try {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                return null;
            }
            String str2 = File.separator;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(str).length());
            sb.append("offline");
            sb.append(str2);
            sb.append(str);
            File file = new File(externalFilesDir, sb.toString());
            if (file.exists()) {
                return file;
            }
            String str3 = File.separator;
            String x = agvqVar.x(str);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 7 + String.valueOf(x).length());
            sb2.append("offline");
            sb2.append(str3);
            sb2.append(x);
            return new File(externalFilesDir, sb2.toString());
        } catch (ArrayIndexOutOfBoundsException unused) {
            return null;
        }
    }

    private static File B(ywa ywaVar, String str, String str2, agvq agvqVar) {
        ywaVar.getClass();
        zgh.m(str2);
        if (!ywaVar.k(str)) {
            return null;
        }
        File b = ywaVar.b(str);
        String str3 = File.separator;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 7 + String.valueOf(str2).length());
        sb.append("offline");
        sb.append(str3);
        sb.append(str2);
        File file = new File(b, sb.toString());
        if (file.exists()) {
            return file;
        }
        File b2 = ywaVar.b(str);
        String str4 = File.separator;
        String x = agvqVar.x(str2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 7 + String.valueOf(x).length());
        sb2.append("offline");
        sb2.append(str4);
        sb2.append(x);
        return new File(b2, sb2.toString());
    }

    private static void D(File file) {
        if (file == null || !file.exists() || !file.isDirectory()) {
            return;
        }
        try {
            E(file);
            file.delete();
        } catch (IOException e) {
            String valueOf = String.valueOf(file.getAbsolutePath());
            zep.n(valueOf.length() != 0 ? "[Offline] Failed to delete directory ".concat(valueOf) : new String("[Offline] Failed to delete directory "), e);
        }
    }

    @Deprecated
    private static void E(File file) {
        if (!file.isDirectory()) {
            zep.l("[Offline] Failed to delete directory since the directory file is null or it is not a directory ");
        } else if (file.getCanonicalPath().equals(file.getAbsolutePath())) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    file2.getClass();
                    if (file2.isDirectory()) {
                        E(file2);
                    }
                    if (!file2.delete()) {
                        String valueOf = String.valueOf(file2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                        sb.append("Failed to delete ");
                        sb.append(valueOf);
                        throw new IOException(sb.toString());
                    }
                }
                return;
            }
            String valueOf2 = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
            sb2.append("Error listing files for ");
            sb2.append(valueOf2);
            throw new IOException(sb2.toString());
        }
    }

    private static final File F(File file, Uri uri) {
        String sb;
        uri.getClass();
        String uri2 = uri.toString();
        uri2.getClass();
        int lastIndexOf = uri2.lastIndexOf(File.separator);
        if (!uri2.startsWith("file") || lastIndexOf < 0 || lastIndexOf >= uri2.length() - 1) {
            int lastIndexOf2 = uri2.lastIndexOf(46);
            String substring = (lastIndexOf2 <= 0 || lastIndexOf2 <= lastIndexOf || lastIndexOf2 == uri2.length() + (-1)) ? "" : uri2.substring(lastIndexOf2);
            int hashCode = uri2.hashCode();
            StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + 11);
            sb2.append(hashCode);
            sb2.append(substring);
            sb = sb2.toString();
        } else {
            sb = uri2.substring(lastIndexOf + 1);
        }
        return new File(file, sb);
    }

    public static void u(Context context, ywa ywaVar, String str, agvq agvqVar) {
        D(z(context, str));
        D(A(context, str, agvqVar));
        for (Map.Entry entry : ywaVar.h().entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                D(B(ywaVar, (String) entry.getKey(), str, agvqVar));
            }
        }
    }

    public static final void w(File file) {
        if (!file.exists() || !file.isDirectory()) {
            return;
        }
        try {
            E(file);
            file.delete();
        } catch (IOException e) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("[Offline] Failed to delete directory ");
            sb.append(valueOf);
            zep.n(sb.toString(), e);
        }
    }

    public static final avhn x(atrp atrpVar) {
        if ((atrpVar.b & 2) != 0) {
            avhn avhnVar = atrpVar.d;
            return avhnVar == null ? avhn.a : avhnVar;
        }
        return null;
    }

    private final File y(String str) {
        return new File(e(str), "thumbnails");
    }

    private static File z(Context context, String str) {
        zgh.m(str);
        File filesDir = context.getFilesDir();
        String str2 = File.separator;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(str).length());
        sb.append("offline");
        sb.append(str2);
        sb.append(str);
        return new File(filesDir, sb.toString());
    }

    public final aalc a(String str, aalc aalcVar) {
        ArrayList arrayList = new ArrayList();
        for (aalb aalbVar : aalcVar.a) {
            File f = f(str, aalbVar.a());
            if (f.exists()) {
                arrayList.add(new aalb(Uri.fromFile(f), aalbVar.a, aalbVar.b));
            }
        }
        return new aalc(arrayList);
    }

    public final aalc b(String str, aalc aalcVar) {
        ArrayList arrayList = new ArrayList();
        for (aalb aalbVar : aalcVar.a) {
            File m = m(str, aalbVar.a());
            if (m.exists()) {
                arrayList.add(new aalb(Uri.fromFile(m), aalbVar.a, aalbVar.b));
            }
        }
        return new aalc(arrayList);
    }

    public final aalc c(String str, aalc aalcVar) {
        ArrayList arrayList = new ArrayList();
        for (aalb aalbVar : aalcVar.a) {
            File i = i(str, aalbVar.a());
            if (i.exists()) {
                arrayList.add(new aalb(Uri.fromFile(i), aalbVar.a, aalbVar.b));
            }
        }
        aalc aalcVar2 = new aalc(arrayList);
        return aalcVar2.a.isEmpty() ? aalcVar : aalcVar2;
    }

    public final aalc d(String str, aalc aalcVar) {
        aalc b = b(str, aalcVar);
        return b.a.isEmpty() ? aalcVar : b;
    }

    public final File e(String str) {
        if (this.n == null) {
            this.n = new File(this.m, "channels");
        }
        return new File(this.n, str);
    }

    public final File f(String str, Uri uri) {
        return F(y(str), uri);
    }

    public final File g(String str) {
        if (this.p == null) {
            this.p = new File(this.m, "playlists");
        }
        return new File(this.p, str);
    }

    public final File h(String str) {
        zgh.m(str);
        return new File(g(str), "thumbnails");
    }

    public final File i(String str, Uri uri) {
        return F(h(str), uri);
    }

    public final File j(String str, Uri uri) {
        return F(n(str), uri);
    }

    public final File k(String str) {
        zgh.m(str);
        if (this.o == null) {
            this.o = new File(this.m, "videos");
        }
        return new File(this.o, str);
    }

    public final File l(String str) {
        return new File(k(str), "thumbnails");
    }

    public final File m(String str, Uri uri) {
        return F(l(str), uri);
    }

    public final File n(String str) {
        return new File(k(str), "tmpthumbnails");
    }

    public final File o(boolean z, String str) {
        File b;
        atqk n = ahdf.n(this.g);
        if (n != null && n.h) {
            try {
                if (z) {
                    b = this.a.getExternalFilesDir(null);
                } else {
                    b = this.d.b(str);
                }
                if (b == null) {
                    q(z, "MIGRATION_ERROR_OUT");
                    return null;
                }
                String str2 = File.separator;
                String str3 = this.b;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(str3).length());
                sb.append("offline");
                sb.append(str2);
                sb.append(str3);
                File file = new File(b, sb.toString());
                String x = this.e.x(this.b);
                boolean z2 = !x.equals(this.b);
                if (!file.exists()) {
                    if (z2 || this.e.M(this.b, this.h.a())) {
                        return C(z, str);
                    }
                    q(z, "MIGRATION_ERROR_OUT");
                    return null;
                }
                q(z, "MIGRATION_INITIALIZED");
                if (!z2) {
                    x = this.h.a();
                    if (!this.e.M(this.b, x)) {
                        q(z, "MIGRATION_IDENTITY_NONCE_MAPPING_FAILED");
                        return C(z, str);
                    }
                }
                String str4 = File.separator;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 7 + String.valueOf(x).length());
                sb2.append("offline");
                sb2.append(str4);
                sb2.append(x);
                try {
                    if (file.renameTo(new File(b, sb2.toString()))) {
                        q(z, "MIGRATION_RENAME_SUCCESS");
                    } else {
                        q(z, "MIGRATION_RENAME_FAILED");
                    }
                } catch (NullPointerException unused) {
                    q(z, "MIGRATION_RENAME_NULL_POINTER_EXCEPTION");
                } catch (SecurityException unused2) {
                    q(z, "MIGRATION_RENAME_SECURITY_EXCEPTION");
                }
                return C(z, str);
            } catch (ArrayIndexOutOfBoundsException | NullPointerException unused3) {
                return null;
            }
        }
        return C(z, str);
    }

    public final void p(Uri uri, File file) {
        Boolean bool;
        aqxe aqxeVar = this.l.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        if (aqxeVar.a(45356751L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45356751L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45356751L);
            bool = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (!bool.booleanValue() || !"file".equals(uri.getScheme())) {
            anhe.f(file);
            yix c = yix.c();
            ((afyf) this.j.get()).a(uri, c);
            long longValue = ((Long) c.get()).longValue();
            File parentFile = file.getParentFile();
            if (parentFile == null || zgt.B(this.g.b(), parentFile) < longValue) {
                throw new agxh(file.length());
            }
            yix c2 = yix.c();
            this.i.m(uri, c2);
            try {
                byte[] bArr = (byte[]) c2.get(30L, TimeUnit.SECONDS);
                FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                try {
                    fileOutputStream.write(bArr);
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (TimeoutException e) {
                throw new aegp(e);
            }
        }
    }

    protected final void q(boolean z, String str) {
        akvm akvmVar = this.k;
        if (akvmVar != null) {
            ((vpg) akvmVar.i.get()).b(true != z ? "MIGRATION_LOCATION_SDCARD" : "MIGRATION_LOCATION_PRIMARY", str);
        }
    }

    public final void r(agqf agqfVar) {
        avhn x;
        ylr.b();
        atrp atrpVar = agqfVar.l;
        if (atrpVar == null || (x = x(atrpVar)) == null) {
            return;
        }
        for (aalb aalbVar : new aalc(ahdq.e(x, Collections.singletonList(480))).a) {
            p(aalbVar.a(), i(agqfVar.a, aalbVar.a()));
        }
    }

    public final void s(String str, avhn avhnVar) {
        ylr.b();
        ArrayList arrayList = new ArrayList();
        apyy b = this.g.b();
        if ((b.b & 65536) != 0) {
            atqk atqkVar = b.m;
            if (atqkVar == null) {
                atqkVar = atqk.a;
            }
            arrayList.addAll(atqkVar.c);
        }
        if (arrayList.isEmpty()) {
            arrayList.add(240);
            arrayList.add(480);
        }
        for (aalb aalbVar : new aalc(ahdq.e(avhnVar, arrayList)).a) {
            p(aalbVar.a(), m(str, aalbVar.a()));
        }
    }

    @Override // defpackage.agpk
    public final void t(agqa agqaVar) {
        ylr.b();
        String str = agqaVar.a;
        atqe atqeVar = agqaVar.d.c;
        if (atqeVar == null) {
            atqeVar = atqe.a;
        }
        avhn avhnVar = atqeVar.d;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        if (a(str, new aalc(avhnVar)).a.isEmpty()) {
            String str2 = agqaVar.a;
            zgh.m(str2);
            w(y(str2));
            ylr.b();
            atqe atqeVar2 = agqaVar.d.c;
            if (atqeVar2 == null) {
                atqeVar2 = atqe.a;
            }
            avhn avhnVar2 = atqeVar2.d;
            if (avhnVar2 == null) {
                avhnVar2 = avhn.a;
            }
            for (aalb aalbVar : new aalc(ahdq.e(avhnVar2, Collections.singletonList(240))).a) {
                p(aalbVar.a(), f(agqaVar.a, aalbVar.a()));
            }
        }
    }

    public final boolean v() {
        if (!this.e.P()) {
            return false;
        }
        return this.d.k(this.e.y(this.d));
    }

    private final File C(boolean z, String str) {
        if (!z) {
            File B = B(this.d, str, this.b, this.e);
            if (B == null) {
                return null;
            }
            return new File(B, "streams");
        }
        File A = A(this.a, this.b, this.e);
        if (A == null) {
            return null;
        }
        return new File(A, "streams");
    }
}
