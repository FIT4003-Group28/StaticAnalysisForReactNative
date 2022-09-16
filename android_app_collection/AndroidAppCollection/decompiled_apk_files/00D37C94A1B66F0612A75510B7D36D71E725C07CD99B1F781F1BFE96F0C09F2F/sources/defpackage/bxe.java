package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* compiled from: PG */
/* renamed from: bxe  reason: default package */
/* loaded from: classes2.dex */
public final class bxe {
    public static final Map a = new HashMap();
    private static final byte[] b = {80, 75, 3, 4};

    public static bxt a(Context context, String str) {
        String valueOf = String.valueOf(str);
        return b(context, str, valueOf.length() != 0 ? "asset_".concat(valueOf) : new String("asset_"));
    }

    public static bxt b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return c(context.getAssets().open(str), str2);
            }
            return g(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new bxt((Throwable) e);
        }
    }

    public static bxt c(InputStream inputStream, String str) {
        try {
            return d(ccw.e(babd.a(babd.b(inputStream))), str);
        } finally {
            cdh.i(inputStream);
        }
    }

    public static bxt d(ccw ccwVar, String str) {
        return o(ccwVar, str, true);
    }

    public static bxt e(String str, String str2) {
        return d(ccw.e(babd.a(babd.b(new ByteArrayInputStream(str.getBytes())))), str2);
    }

    public static bxt f(Context context, int i, String str) {
        Boolean bool;
        try {
            baba a2 = babd.a(babd.b(context.getResources().openRawResource(i)));
            try {
                baba a3 = babd.a(new babf(a2));
                byte[] bArr = b;
                int length = bArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < 4) {
                        byte b2 = bArr[i2];
                        if (!((babh) a3).n(1L)) {
                            throw new EOFException();
                        }
                        if (((babh) a3).a.b() != b2) {
                            bool = false;
                            break;
                        }
                        i2++;
                    } else {
                        a3.close();
                        bool = true;
                        break;
                    }
                }
            } catch (Exception unused) {
                int i3 = cda.a;
                bool = false;
            }
            if (bool.booleanValue()) {
                return g(new ZipInputStream(a2.f()), str);
            }
            return c(a2.f(), str);
        } catch (Resources.NotFoundException e) {
            return new bxt((Throwable) e);
        }
    }

    public static bxt g(ZipInputStream zipInputStream, String str) {
        bxt bxtVar;
        bxo bxoVar;
        String[] split;
        try {
            HashMap hashMap = new HashMap();
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                Object obj = null;
                while (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (name.contains("__MACOSX")) {
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().contains(".json")) {
                        obj = o(ccw.e(babd.a(babd.b(zipInputStream))), null, false).a;
                    } else {
                        if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                            zipInputStream.closeEntry();
                        }
                        hashMap.put(name.split("/")[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                if (obj == null) {
                    bxtVar = new bxt((Throwable) new IllegalArgumentException("Unable to parse composition"));
                } else {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str2 = (String) entry.getKey();
                        Iterator it = ((bwx) obj).b.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                bxoVar = null;
                                break;
                            }
                            bxoVar = (bxo) it.next();
                            if (bxoVar.d.equals(str2)) {
                                break;
                            }
                        }
                        if (bxoVar != null) {
                            bxoVar.e = cdh.e((Bitmap) entry.getValue(), bxoVar.a, bxoVar.b);
                        }
                    }
                    Iterator it2 = ((bwx) obj).b.entrySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it2.next();
                            if (((bxo) entry2.getValue()).e == null) {
                                String str3 = ((bxo) entry2.getValue()).d;
                                bxtVar = new bxt((Throwable) new IllegalStateException(str3.length() != 0 ? "There is no image for ".concat(str3) : new String("There is no image for ")));
                            }
                        } else {
                            if (str != null) {
                                bzw.a.a(str, (bwx) obj);
                            }
                            bxtVar = new bxt(obj);
                        }
                    }
                }
            } catch (IOException e) {
                bxtVar = new bxt((Throwable) e);
            }
            return bxtVar;
        } finally {
            cdh.i(zipInputStream);
        }
    }

    public static bxw h(Context context, String str) {
        String valueOf = String.valueOf(str);
        return i(context, str, valueOf.length() != 0 ? "asset_".concat(valueOf) : new String("asset_"));
    }

    public static bxw i(Context context, String str, String str2) {
        return p(str2, new bxa(context.getApplicationContext(), str, str2));
    }

    public static bxw j(InputStream inputStream, String str) {
        return p(str, new bxc(inputStream, str));
    }

    public static bxw k(Context context, int i, String str) {
        return p(str, new bxb(new WeakReference(context), context.getApplicationContext(), i, str));
    }

    public static bxw l(Context context, String str) {
        String valueOf = String.valueOf(str);
        return m(context, str, valueOf.length() != 0 ? "url_".concat(valueOf) : new String("url_"));
    }

    public static bxw m(Context context, String str, String str2) {
        return p(str2, new bwz(context, str, str2));
    }

    public static String n(Context context, int i) {
        String str = (context.getResources().getConfiguration().uiMode & 48) != 32 ? "_day_" : "_night_";
        StringBuilder sb = new StringBuilder(str.length() + 17);
        sb.append("rawRes");
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    private static bxt o(ccw ccwVar, String str, boolean z) {
        try {
            try {
                bwx a2 = cch.a(ccwVar);
                if (str != null) {
                    bzw.a.a(str, a2);
                }
                bxt bxtVar = new bxt(a2);
                if (z) {
                    cdh.i(ccwVar);
                }
                return bxtVar;
            } catch (Exception e) {
                bxt bxtVar2 = new bxt((Throwable) e);
                if (z) {
                    cdh.i(ccwVar);
                }
                return bxtVar2;
            }
        } catch (Throwable th) {
            if (z) {
                cdh.i(ccwVar);
            }
            throw th;
        }
    }

    private static bxw p(String str, Callable callable) {
        bwx bwxVar = str == null ? null : (bwx) bzw.a.b.c(str);
        if (bwxVar != null) {
            return new bxw(new bxd(bwxVar));
        }
        if (str != null) {
            Map map = a;
            if (map.containsKey(str)) {
                return (bxw) map.get(str);
            }
        }
        bxw bxwVar = new bxw(callable);
        if (str != null) {
            bxwVar.e(new bwy(str, 1));
            bxwVar.d(new bwy(str));
            a.put(str, bxwVar);
        }
        return bxwVar;
    }
}
