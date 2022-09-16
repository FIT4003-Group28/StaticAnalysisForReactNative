package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
/* renamed from: bja  reason: default package */
/* loaded from: classes3.dex */
public final class bja {
    public static final Map<String, bjz<bis>> a = new HashMap();

    public static bjz<bis> b(Context context, String str) {
        return k(str, new biw(context.getApplicationContext(), str));
    }

    public static bjz<bis> d(Context context, int i) {
        return k(i(context, i), new bix(new WeakReference(context), context.getApplicationContext(), i));
    }

    public static bjw<bis> e(Context context, int i) {
        try {
            return g(context.getResources().openRawResource(i), i(context, i));
        } catch (Resources.NotFoundException e) {
            return new bjw<>(e);
        }
    }

    public static bjz<bis> f(InputStream inputStream, String str) {
        return k(str, new biy(inputStream, str));
    }

    public static bjw<bis> g(InputStream inputStream, String str) {
        try {
            return j(bpj.a(eajl.a(eajl.e(inputStream))), str, true);
        } finally {
            bps.b(inputStream);
        }
    }

    public static bjw<bis> h(ZipInputStream zipInputStream, String str) {
        bjw<bis> bjwVar;
        bjs bjsVar;
        String[] split;
        try {
            HashMap hashMap = new HashMap();
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                bis bisVar = null;
                while (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (name.contains("__MACOSX")) {
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().contains(".json")) {
                        bisVar = j(bpj.a(eajl.a(eajl.e(zipInputStream))), null, false).a;
                    } else {
                        if (!name.contains(".png") && !name.contains(".webp")) {
                            zipInputStream.closeEntry();
                        }
                        hashMap.put(name.split("/")[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                if (bisVar == null) {
                    bjwVar = new bjw<>(new IllegalArgumentException("Unable to parse composition"));
                } else {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str2 = (String) entry.getKey();
                        Iterator<bjs> it = bisVar.c.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                bjsVar = null;
                                break;
                            }
                            bjsVar = it.next();
                            if (bjsVar.d.equals(str2)) {
                                break;
                            }
                        }
                        if (bjsVar != null) {
                            bjsVar.e = bps.i((Bitmap) entry.getValue(), bjsVar.a, bjsVar.b);
                        }
                    }
                    Iterator<Map.Entry<String, bjs>> it2 = bisVar.c.entrySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Map.Entry<String, bjs> next = it2.next();
                            if (next.getValue().e == null) {
                                String str3 = next.getValue().d;
                                bjwVar = new bjw<>(new IllegalStateException(str3.length() != 0 ? "There is no image for ".concat(str3) : new String("There is no image for ")));
                            }
                        } else {
                            if (str != null) {
                                bma.a.a(str, bisVar);
                            }
                            bjwVar = new bjw<>(bisVar);
                        }
                    }
                }
            } catch (IOException e) {
                bjwVar = new bjw<>(e);
            }
            return bjwVar;
        } finally {
            bps.b(zipInputStream);
        }
    }

    private static String i(Context context, int i) {
        String str = (context.getResources().getConfiguration().uiMode & 48) != 32 ? "_day_" : "_night_";
        StringBuilder sb = new StringBuilder(str.length() + 17);
        sb.append("rawRes");
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    private static bjw<bis> j(bpj bpjVar, String str, boolean z) {
        try {
            try {
                bis a2 = boq.a(bpjVar);
                if (str != null) {
                    bma.a.a(str, a2);
                }
                bjw<bis> bjwVar = new bjw<>(a2);
                if (z) {
                    bps.b(bpjVar);
                }
                return bjwVar;
            } catch (Exception e) {
                bjw<bis> bjwVar2 = new bjw<>(e);
                if (z) {
                    bps.b(bpjVar);
                }
                return bjwVar2;
            }
        } catch (Throwable th) {
            if (z) {
                bps.b(bpjVar);
            }
            throw th;
        }
    }

    private static bjz<bis> k(String str, Callable<bjw<bis>> callable) {
        bis b = str == null ? null : bma.a.b.b(str);
        if (b != null) {
            return new bjz<>(new biz(b));
        }
        if (str != null) {
            Map<String, bjz<bis>> map = a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        bjz<bis> bjzVar = new bjz<>(callable);
        bjzVar.e(new bit(str));
        bjzVar.d(new biu(str));
        a.put(str, bjzVar);
        return bjzVar;
    }

    public static bjz<bis> a(Context context, String str) {
        String valueOf = String.valueOf(str);
        return k(valueOf.length() != 0 ? "url_".concat(valueOf) : new String("url_"), new biv(context, str));
    }

    public static bjw<bis> c(Context context, String str) {
        try {
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "asset_".concat(valueOf) : new String("asset_");
            if (str.endsWith(".zip")) {
                return h(new ZipInputStream(context.getAssets().open(str)), concat);
            }
            return g(context.getAssets().open(str), concat);
        } catch (IOException e) {
            return new bjw<>(e);
        }
    }
}
