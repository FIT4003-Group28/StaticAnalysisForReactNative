package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: vfq  reason: default package */
/* loaded from: classes4.dex */
public final class vfq {
    private static final String[] a = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};
    private static final String[] b;
    private static final String[] c;

    static {
        String[] strArr = new String[2];
        strArr[0] = "media";
        String str = "";
        strArr[1] = true != (Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu")) ? str : "androidx.test.services.storage.runfiles";
        b = strArr;
        String[] strArr2 = new String[3];
        strArr2[0] = Build.VERSION.SDK_INT <= 25 ? "com.google.android.inputmethod.latin.inputcontent" : str;
        if (Build.VERSION.SDK_INT <= 25) {
            str = "com.google.android.inputmethod.latin.dev.inputcontent";
        }
        strArr2[1] = str;
        strArr2[2] = "com.google.android.apps.docs.storage.legacy";
        c = strArr2;
    }

    public static AssetFileDescriptor a(Context context, Uri uri, String str, vfp vfpVar) {
        char c2;
        ContentResolver contentResolver = context.getContentResolver();
        Uri e = e(uri);
        String scheme = e.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(e, str);
        }
        if ("content".equals(scheme)) {
            int hashCode = str.hashCode();
            int i = 2;
            if (hashCode == 114) {
                if (str.equals("r")) {
                    c2 = 0;
                }
                c2 = 65535;
            } else if (hashCode == 119) {
                if (str.equals("w")) {
                    c2 = 1;
                }
                c2 = 65535;
            } else if (hashCode == 3653) {
                if (str.equals("rw")) {
                    c2 = 3;
                }
                c2 = 65535;
            } else if (hashCode != 3805) {
                if (hashCode == 113359 && str.equals("rwt")) {
                    c2 = 4;
                }
                c2 = 65535;
            } else {
                if (str.equals("wt")) {
                    c2 = 2;
                }
                c2 = 65535;
            }
            if (c2 == 0) {
                i = 1;
            } else if (c2 != 1 && c2 != 2 && c2 != 3 && c2 != 4) {
                throw new IllegalArgumentException();
            }
            if (!h(context, e, i, vfpVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(e, str);
            j(openAssetFileDescriptor);
            return openAssetFileDescriptor;
        } else if ("file".equals(scheme)) {
            AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(e, str);
            j(openAssetFileDescriptor2);
            try {
                g(context, openAssetFileDescriptor2.getParcelFileDescriptor(), e, vfpVar);
                return openAssetFileDescriptor2;
            } catch (FileNotFoundException e2) {
                c(openAssetFileDescriptor2);
                throw e2;
            } catch (IOException e3) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e3);
                c(openAssetFileDescriptor2);
                throw fileNotFoundException;
            }
        } else {
            throw new FileNotFoundException("Not implemented. Contact tiktok-users@");
        }
    }

    public static InputStream b(Context context, Uri uri) {
        vfp vfpVar = vfp.a;
        ContentResolver contentResolver = context.getContentResolver();
        Uri e = e(uri);
        String scheme = e.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(e);
        }
        if ("content".equals(scheme)) {
            if (!h(context, e, 1, vfpVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            InputStream openInputStream = contentResolver.openInputStream(e);
            j(openInputStream);
            return openInputStream;
        } else if ("file".equals(scheme)) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(e.getPath()).getCanonicalFile()), "r");
                try {
                    g(context, openFileDescriptor, e, vfpVar);
                    return new ParcelFileDescriptor.AutoCloseInputStream(openFileDescriptor);
                } catch (FileNotFoundException e2) {
                    k(openFileDescriptor);
                    throw e2;
                } catch (IOException e3) {
                    FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                    fileNotFoundException.initCause(e3);
                    k(openFileDescriptor);
                    throw fileNotFoundException;
                }
            } catch (IOException e4) {
                FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
                fileNotFoundException2.initCause(e4);
                throw fileNotFoundException2;
            }
        } else {
            throw new FileNotFoundException("Not implemented. Contact tiktok-users@");
        }
    }

    public static void c(AssetFileDescriptor assetFileDescriptor) {
        try {
            assetFileDescriptor.close();
        } catch (IOException unused) {
        }
    }

    public static AssetFileDescriptor d(Context context, Uri uri) {
        return a(context, uri, "r", vfp.a);
    }

    private static Uri e(Uri uri) {
        return Build.VERSION.SDK_INT < 30 ? Uri.parse(uri.toString()) : uri;
    }

    private static String f(File file) {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? String.valueOf(canonicalPath).concat("/") : canonicalPath;
    }

    private static void g(Context context, ParcelFileDescriptor parcelFileDescriptor, Uri uri, vfp vfpVar) {
        File[] i;
        File g;
        String canonicalPath = new File(uri.getPath()).getCanonicalPath();
        final FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
        StructStat structStat = (StructStat) zgd.R(new Callable() { // from class: vft
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Os.fstat(fileDescriptor);
            }
        });
        long j = structStat.st_dev;
        long j2 = structStat.st_ino;
        OsConstants.S_ISLNK(structStat.st_mode);
        StructStat structStat2 = (StructStat) zgd.R(new gvj(canonicalPath, 2));
        long j3 = structStat2.st_dev;
        long j4 = structStat2.st_ino;
        if (OsConstants.S_ISLNK(structStat2.st_mode)) {
            String valueOf = String.valueOf(canonicalPath);
            throw new FileNotFoundException(valueOf.length() != 0 ? "Can't open file: ".concat(valueOf) : new String("Can't open file: "));
        } else if (j != j3 || j2 != j4) {
            String valueOf2 = String.valueOf(canonicalPath);
            throw new FileNotFoundException(valueOf2.length() != 0 ? "Can't open file: ".concat(valueOf2) : new String("Can't open file: "));
        } else {
            if (!canonicalPath.startsWith("/proc/") && !canonicalPath.startsWith("/data/misc/")) {
                vfp vfpVar2 = vfp.a;
                boolean z = vfpVar.d;
                File g2 = ake.g(context);
                boolean z2 = false;
                if (g2 == null ? !canonicalPath.startsWith(f(Environment.getDataDirectory())) : !canonicalPath.startsWith(f(g2))) {
                    Context e = ake.e(context);
                    if (e == null || (g = ake.g(e)) == null || !canonicalPath.startsWith(f(g))) {
                        File[] i2 = i(new slg(context, 2));
                        int length = i2.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                File file = i2[i3];
                                if (file != null && canonicalPath.startsWith(f(file))) {
                                    break;
                                }
                                i3++;
                            } else {
                                for (File file2 : i(new slg(context, 3))) {
                                    if (file2 == null || !canonicalPath.startsWith(f(file2))) {
                                    }
                                }
                            }
                        }
                    }
                }
                z2 = true;
                if (z2 == vfpVar.c) {
                    return;
                }
            }
            String valueOf3 = String.valueOf(canonicalPath);
            throw new FileNotFoundException(valueOf3.length() != 0 ? "Can't open file: ".concat(valueOf3) : new String("Can't open file: "));
        }
    }

    private static boolean h(Context context, Uri uri, int i, vfp vfpVar) {
        int i2;
        String authority = uri.getAuthority();
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (resolveContentProvider == null) {
            int lastIndexOf = authority.lastIndexOf(64);
            if (lastIndexOf >= 0) {
                authority = authority.substring(lastIndexOf + 1);
                resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (resolveContentProvider == null) {
                vfp vfpVar2 = vfp.a;
                return !vfpVar.c;
            }
        }
        vfp vfpVar3 = vfp.a;
        amuk amukVar = vfpVar.e;
        int i3 = ((amxx) amukVar).c;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                i2 = 3;
                break;
            }
            int a2 = ((vfu) amukVar.get(i4)).a();
            int i5 = a2 - 1;
            if (a2 == 0) {
                throw null;
            }
            i4++;
            if (i5 != 0) {
                if (i5 == 1) {
                    i2 = 2;
                    break;
                }
            } else {
                i2 = 1;
                break;
            }
        }
        int i6 = i2 - 1;
        if (i6 != 0) {
            if (i6 == 1) {
                return false;
            }
            if (!context.getPackageName().equals(resolveContentProvider.packageName)) {
                if (vfpVar.c) {
                    return false;
                }
                if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), i) != 0 && resolveContentProvider.exported) {
                    String[] strArr = b;
                    int length = strArr.length;
                    for (int i7 = 0; i7 < 2; i7++) {
                        if (strArr[i7].equals(authority)) {
                            return true;
                        }
                    }
                    String[] strArr2 = c;
                    int length2 = strArr2.length;
                    for (int i8 = 0; i8 < 3; i8++) {
                        if (strArr2[i8].equals(authority)) {
                            return true;
                        }
                    }
                    String[] strArr3 = a;
                    for (int i9 = 0; i9 < 6; i9++) {
                        String str = strArr3[i9];
                        if (str.charAt(str.length() - 1) == '.') {
                            if (resolveContentProvider.packageName.startsWith(str)) {
                                return false;
                            }
                        } else if (resolveContentProvider.packageName.equals(str)) {
                            return false;
                        }
                    }
                }
                return true;
            }
            return vfpVar.c;
        }
        return true;
    }

    private static File[] i(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e) {
            if (Build.VERSION.SDK_INT >= 22) {
                throw e;
            }
            return new File[0];
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void j(Object obj) {
        if (obj != null) {
            return;
        }
        throw new FileNotFoundException("Content resolver returned null value.");
    }

    private static void k(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException unused) {
        }
    }
}
