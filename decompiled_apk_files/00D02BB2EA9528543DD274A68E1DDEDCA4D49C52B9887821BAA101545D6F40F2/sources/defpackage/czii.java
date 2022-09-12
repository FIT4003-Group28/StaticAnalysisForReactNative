package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: czii  reason: default package */
/* loaded from: classes5.dex */
public final class czii extends czjm {
    private final Context a;
    private final czjl b;
    @dzsi
    private final czjl c;
    private final Object d = new Object();
    @dzsi
    private String e;

    public czii(czih czihVar) {
        this.b = new czin(czihVar.c);
        this.a = czihVar.a;
        this.c = czihVar.b;
    }

    public static czih i(Context context) {
        return new czih(context);
    }

    private final boolean l(Uri uri) {
        return !TextUtils.isEmpty(uri.getAuthority()) && !this.a.getPackageName().equals(uri.getAuthority());
    }

    private final void m() {
        if (this.c != null) {
            return;
        }
        throw new czir("Android backend cannot perform remote operations without a remote backend");
    }

    @Override // defpackage.czjl
    public final String a() {
        return "android";
    }

    @Override // defpackage.czjm, defpackage.czjl
    public final boolean b(Uri uri) {
        if (!l(uri)) {
            return this.b.b(k(uri));
        }
        m();
        return this.c.b(uri);
    }

    @Override // defpackage.czjm, defpackage.czjl
    public final InputStream c(Uri uri) {
        if (!l(uri)) {
            return this.b.c(k(uri));
        }
        m();
        return this.c.c(uri);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.czjm, defpackage.czjl
    public final File h(Uri uri) {
        char c;
        File filesDir;
        String str;
        if (!l(uri)) {
            Context context = this.a;
            if (!uri.getScheme().equals("android")) {
                throw new cziw("Scheme must be 'android'");
            }
            if (uri.getPathSegments().isEmpty()) {
                throw new cziw(String.format("Path must start with a valid logical location: %s", uri));
            }
            if (TextUtils.isEmpty(uri.getQuery())) {
                ArrayList arrayList = new ArrayList(uri.getPathSegments());
                String str2 = (String) arrayList.get(0);
                switch (str2.hashCode()) {
                    case -1820761141:
                        if (str2.equals("external")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 94416770:
                        if (str2.equals("cache")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 97434231:
                        if (str2.equals("files")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 835260319:
                        if (str2.equals("managed")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 988548496:
                        if (str2.equals("directboot-cache")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 991565957:
                        if (str2.equals("directboot-files")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c != 0) {
                    if (c != 1) {
                        if (c == 2) {
                            filesDir = czij.a(context);
                        } else if (c == 3) {
                            filesDir = context.getCacheDir();
                        } else if (c == 4) {
                            File file = new File(czij.a(context), "managed");
                            if (arrayList.size() >= 3) {
                                try {
                                    if (!czig.c(czig.b((String) arrayList.get(2)))) {
                                        throw new cziw("AccountManager cannot be null");
                                    }
                                } catch (IllegalArgumentException e) {
                                    throw new cziw(e);
                                }
                            }
                            filesDir = file;
                        } else if (c == 5) {
                            filesDir = context.getExternalFilesDir(null);
                        } else {
                            throw new cziw(String.format("Path must start with a valid logical location: %s", uri));
                        }
                    } else if (Build.VERSION.SDK_INT >= 24) {
                        filesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                    } else {
                        throw new cziw(String.format("Direct boot only exists on N or greater: current SDK %s", Integer.valueOf(Build.VERSION.SDK_INT)));
                    }
                } else if (Build.VERSION.SDK_INT >= 24) {
                    filesDir = context.createDeviceProtectedStorageContext().getFilesDir();
                } else {
                    throw new cziw(String.format("Direct boot only exists on N or greater: current SDK %s", Integer.valueOf(Build.VERSION.SDK_INT)));
                }
                File file2 = new File(filesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                if (!cqvm.c(this.a)) {
                    synchronized (this.d) {
                        if (this.e == null) {
                            this.e = czij.a(this.a.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                        }
                        str = this.e;
                    }
                    if (!file2.getAbsolutePath().startsWith(str)) {
                        throw new czir("Cannot access credential-protected data from direct boot");
                    }
                }
                return file2;
            }
            throw new cziw("Did not expect uri to have query");
        }
        throw new IOException("operation is not permitted in other authorities.");
    }

    @Override // defpackage.czjm
    protected final czjl j() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czjm
    public final Uri k(Uri uri) {
        if (l(uri)) {
            throw new cziw("Operation across authorities is not allowed.");
        }
        File h = h(uri);
        Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
        dccx F = dcdc.F();
        path.path(h.getAbsolutePath());
        return path.encodedFragment(czje.b(F.f())).build();
    }
}
