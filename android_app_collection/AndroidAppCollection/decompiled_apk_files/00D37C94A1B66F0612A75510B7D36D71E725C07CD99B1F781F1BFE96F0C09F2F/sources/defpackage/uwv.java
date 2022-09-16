package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.WindowManager;
import java.io.File;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: uwv  reason: default package */
/* loaded from: classes4.dex */
public final class uwv {
    public static volatile int a;
    private static volatile int b;

    private uwv() {
    }

    public static int a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return 0;
        }
        if (b == 0) {
            synchronized (uwv.class) {
                if (b == 0) {
                    b = Math.round(((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate());
                }
            }
        }
        return b;
    }

    public static int b(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final File c(Uri uri, Context context) {
        char c;
        File filesDir;
        if (!uri.getScheme().equals("android")) {
            throw new vjt("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new vjt(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (TextUtils.isEmpty(uri.getQuery())) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            String str = (String) arrayList.get(0);
            switch (str.hashCode()) {
                case -1820761141:
                    if (str.equals("external")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 94416770:
                    if (str.equals("cache")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 97434231:
                    if (str.equals("files")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 835260319:
                    if (str.equals("managed")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 988548496:
                    if (str.equals("directboot-cache")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 991565957:
                    if (str.equals("directboot-files")) {
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
                        filesDir = e(context);
                    } else if (c == 3) {
                        filesDir = context.getCacheDir();
                    } else if (c == 4) {
                        File file = new File(e(context), "managed");
                        if (arrayList.size() >= 3) {
                            try {
                                if (!vjc.c(vjc.a((String) arrayList.get(2)))) {
                                    throw new vjt("AccountManager cannot be null");
                                }
                            } catch (IllegalArgumentException e) {
                                throw new vjt(e);
                            }
                        }
                        filesDir = file;
                    } else if (c == 5) {
                        filesDir = context.getExternalFilesDir(null);
                    } else {
                        throw new vjt(String.format("Path must start with a valid logical location: %s", uri));
                    }
                } else if (Build.VERSION.SDK_INT < 24) {
                    throw new vjt(String.format("Direct boot only exists on N or greater: current SDK %s", Integer.valueOf(Build.VERSION.SDK_INT)));
                } else {
                    filesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                }
            } else if (Build.VERSION.SDK_INT < 24) {
                throw new vjt(String.format("Direct boot only exists on N or greater: current SDK %s", Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                filesDir = context.createDeviceProtectedStorageContext().getFilesDir();
            }
            return new File(filesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
        }
        throw new vjt("Did not expect uri to have query");
    }

    public static File d(Context context) {
        return e(context.createDeviceProtectedStorageContext()).getParentFile();
    }

    public static File e(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            SystemClock.sleep(100L);
            filesDir = context.getFilesDir();
            if (filesDir == null) {
                throw new IllegalStateException("getFilesDir returned null twice.");
            }
        }
        return filesDir;
    }
}
