package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.GeneratedAppGlideModule;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: brc  reason: default package */
/* loaded from: classes.dex */
public final class brc implements ComponentCallbacks2 {
    private static volatile brc h;
    private static volatile boolean i;
    public final bxn a;
    public final brk b;
    public final bru c;
    public final bxl d;
    public final cgu e;
    public final List<bsa> f = new ArrayList();
    public final cge g;
    private final byn j;

    public brc(Context context, bwl bwlVar, byn bynVar, bxn bxnVar, bxl bxlVar, cgu cguVar, cge cgeVar, brb brbVar, Map map, List list, brn brnVar) {
        buc ccsVar;
        buc cecVar;
        this.a = bxnVar;
        this.d = bxlVar;
        this.j = bynVar;
        this.e = cguVar;
        this.g = cgeVar;
        Resources resources = context.getResources();
        if (((brh) brnVar.a.get(brh.class)) != null) {
            cdr.c = 0;
        }
        bru bruVar = new bru();
        this.c = bruVar;
        bruVar.h(new cdc());
        if (Build.VERSION.SDK_INT >= 27) {
            bruVar.h(new cdp());
        }
        List<btn> b = bruVar.b();
        cfd cfdVar = new cfd(context, b, bxnVar, bxlVar);
        cep cepVar = new cep(bxnVar, new ceo());
        cdl cdlVar = new cdl(bruVar.b(), resources.getDisplayMetrics(), bxnVar, bxlVar);
        if (!brnVar.a(brf.class) || Build.VERSION.SDK_INT < 28) {
            ccsVar = new ccs(cdlVar);
            cecVar = new cec(cdlVar, bxlVar);
        } else {
            cecVar = new cdv();
            ccsVar = new cct();
        }
        cex cexVar = new cex(context);
        cbc cbcVar = new cbc(resources);
        cbd cbdVar = new cbd(resources);
        cbb cbbVar = new cbb(resources);
        cba cbaVar = new cba(resources);
        cco ccoVar = new cco(bxlVar);
        cfr cfrVar = new cfr();
        cfu cfuVar = new cfu();
        ContentResolver contentResolver = context.getContentResolver();
        bruVar.c(ByteBuffer.class, new bzm());
        bruVar.c(InputStream.class, new cbf(bxlVar));
        bruVar.g("Bitmap", ByteBuffer.class, Bitmap.class, ccsVar);
        bruVar.g("Bitmap", InputStream.class, Bitmap.class, cecVar);
        bruVar.g("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new cdx(cdlVar));
        bruVar.g("Bitmap", ParcelFileDescriptor.class, Bitmap.class, cepVar);
        bruVar.g("Bitmap", AssetFileDescriptor.class, Bitmap.class, new cep(bxnVar, new cej()));
        bruVar.f(Bitmap.class, Bitmap.class, cbk.a);
        bruVar.g("Bitmap", Bitmap.class, Bitmap.class, new ceg());
        bruVar.d(Bitmap.class, ccoVar);
        bruVar.g("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new ccm(resources, ccsVar));
        bruVar.g("BitmapDrawable", InputStream.class, BitmapDrawable.class, new ccm(resources, cecVar));
        bruVar.g("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new ccm(resources, cepVar));
        bruVar.d(BitmapDrawable.class, new ccn(bxnVar, ccoVar));
        bruVar.g("Gif", InputStream.class, cfg.class, new cfq(b, cfdVar, bxlVar));
        bruVar.g("Gif", ByteBuffer.class, cfg.class, cfdVar);
        bruVar.d(cfg.class, new cfh());
        bruVar.f(bsl.class, bsl.class, cbk.a);
        bruVar.g("Bitmap", bsl.class, Bitmap.class, new cfo(bxnVar));
        bruVar.e(Uri.class, Drawable.class, cexVar);
        bruVar.e(Uri.class, Bitmap.class, new cea(cexVar, bxnVar));
        bruVar.i(new ceq());
        bruVar.f(File.class, ByteBuffer.class, new bzo());
        bruVar.f(File.class, InputStream.class, new caa());
        bruVar.e(File.class, File.class, new cez());
        bruVar.f(File.class, ParcelFileDescriptor.class, new bzw());
        bruVar.f(File.class, File.class, cbk.a);
        bruVar.i(new buu(bxlVar));
        bruVar.i(new bux());
        bruVar.f(Integer.TYPE, InputStream.class, cbcVar);
        bruVar.f(Integer.TYPE, ParcelFileDescriptor.class, cbbVar);
        bruVar.f(Integer.class, InputStream.class, cbcVar);
        bruVar.f(Integer.class, ParcelFileDescriptor.class, cbbVar);
        bruVar.f(Integer.class, Uri.class, cbdVar);
        bruVar.f(Integer.TYPE, AssetFileDescriptor.class, cbaVar);
        bruVar.f(Integer.class, AssetFileDescriptor.class, cbaVar);
        bruVar.f(Integer.TYPE, Uri.class, cbdVar);
        bruVar.f(String.class, InputStream.class, new bzs());
        bruVar.f(Uri.class, InputStream.class, new bzs());
        bruVar.f(String.class, InputStream.class, new cbi());
        bruVar.f(String.class, ParcelFileDescriptor.class, new cbh());
        bruVar.f(String.class, AssetFileDescriptor.class, new cbg());
        bruVar.f(Uri.class, InputStream.class, new bzd(context.getAssets()));
        bruVar.f(Uri.class, ParcelFileDescriptor.class, new bzc(context.getAssets()));
        bruVar.f(Uri.class, InputStream.class, new cbw(context));
        bruVar.f(Uri.class, InputStream.class, new cby(context));
        if (Build.VERSION.SDK_INT >= 29) {
            bruVar.f(Uri.class, InputStream.class, new ccc(context));
            bruVar.f(Uri.class, ParcelFileDescriptor.class, new ccb(context));
        }
        bruVar.f(Uri.class, InputStream.class, new cbq(contentResolver));
        bruVar.f(Uri.class, ParcelFileDescriptor.class, new cbo(contentResolver));
        bruVar.f(Uri.class, AssetFileDescriptor.class, new cbn(contentResolver));
        bruVar.f(Uri.class, InputStream.class, new cbs());
        bruVar.f(URL.class, InputStream.class, new ccf());
        bruVar.f(Uri.class, File.class, new cah(context));
        bruVar.f(cac.class, InputStream.class, new cbu());
        bruVar.f(byte[].class, ByteBuffer.class, new bzg());
        bruVar.f(byte[].class, InputStream.class, new bzk());
        bruVar.f(Uri.class, Uri.class, cbk.a);
        bruVar.f(Drawable.class, Drawable.class, cbk.a);
        bruVar.e(Drawable.class, Drawable.class, new cey());
        bruVar.j(Bitmap.class, BitmapDrawable.class, new cfs(resources));
        bruVar.j(Bitmap.class, byte[].class, cfrVar);
        bruVar.j(Drawable.class, byte[].class, new cft(bxnVar, cfrVar, cfuVar));
        bruVar.j(cfg.class, byte[].class, cfuVar);
        if (Build.VERSION.SDK_INT >= 23) {
            cep cepVar2 = new cep(bxnVar, new cel());
            bruVar.e(ByteBuffer.class, Bitmap.class, cepVar2);
            bruVar.e(ByteBuffer.class, BitmapDrawable.class, new ccm(resources, cepVar2));
        }
        this.b = new brk(context, bxlVar, bruVar, brbVar, map, list, bwlVar, brnVar);
    }

    public static brc a(Context context) {
        if (h == null) {
            GeneratedAppGlideModule g = g(context.getApplicationContext());
            synchronized (brc.class) {
                if (h == null) {
                    if (!i) {
                        i = true;
                        f(context, new brj(), g);
                        i = false;
                    } else {
                        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
                    }
                }
            }
        }
        return h;
    }

    public static bsa d(Context context) {
        return i(context).a(context);
    }

    public static bsa e(Activity activity) {
        return i(activity).c(activity);
    }

    private static void f(Context context, brj brjVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        Collections.emptyList();
        ArrayList<chc> arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(che.a(str));
                    }
                }
            }
            if (generatedAppGlideModule != null && !generatedAppGlideModule.a().isEmpty()) {
                Set<Class<?>> a = generatedAppGlideModule.a();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (a.contains(((chc) it.next()).getClass())) {
                        it.remove();
                    }
                }
            }
            for (chc chcVar : arrayList) {
                chcVar.b(applicationContext, brjVar);
            }
            if (brjVar.f == null) {
                brjVar.f = bza.a().a();
            }
            if (brjVar.g == null) {
                byv byvVar = new byv(true);
                byvVar.b(1);
                byvVar.b = "disk-cache";
                brjVar.g = byvVar.a();
            }
            if (brjVar.k == null) {
                int i2 = bza.b() >= 4 ? 2 : 1;
                byv byvVar2 = new byv(true);
                byvVar2.b(i2);
                byvVar2.b = "animation";
                brjVar.k = byvVar2.a();
            }
            if (brjVar.i == null) {
                brjVar.i = new byp(applicationContext).a();
            }
            if (brjVar.n == null) {
                brjVar.n = new cge();
            }
            if (brjVar.d == null) {
                int i3 = brjVar.i.a;
                if (i3 > 0) {
                    brjVar.d = new bxw(i3);
                } else {
                    brjVar.d = new bxo();
                }
            }
            if (brjVar.e == null) {
                brjVar.e = new bxv(brjVar.i.c);
            }
            if (brjVar.m == null) {
                brjVar.m = new byn(brjVar.i.b);
            }
            if (brjVar.h == null) {
                brjVar.h = new bym(applicationContext);
            }
            if (brjVar.c == null) {
                brjVar.c = new bwl(brjVar.m, brjVar.h, brjVar.g, brjVar.f, new bza(new ThreadPoolExecutor(0, Integer.MAX_VALUE, bza.a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new byx("source-unlimited", false))), brjVar.k);
            }
            List<chv<Object>> list = brjVar.l;
            if (list == null) {
                brjVar.l = Collections.emptyList();
            } else {
                brjVar.l = Collections.unmodifiableList(list);
            }
            brn brnVar = new brn(brjVar.b);
            brc brcVar = new brc(applicationContext, brjVar.c, brjVar.m, brjVar.d, brjVar.e, new cgu(brnVar), brjVar.n, brjVar.j, brjVar.a, brjVar.l, brnVar);
            for (chc chcVar2 : arrayList) {
                try {
                    chcVar2.c(brcVar.c);
                } catch (AbstractMethodError e) {
                    String valueOf = String.valueOf(chcVar2.getClass().getName());
                    throw new IllegalStateException(valueOf.length() != 0 ? "Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(valueOf) : new String("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: "), e);
                }
            }
            applicationContext.registerComponentCallbacks(brcVar);
            h = brcVar;
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e2);
        }
    }

    private static GeneratedAppGlideModule g(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
            }
            return null;
        } catch (IllegalAccessException e) {
            h(e);
            return null;
        } catch (InstantiationException e2) {
            h(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            h(e3);
            return null;
        } catch (InvocationTargetException e4) {
            h(e4);
            return null;
        }
    }

    private static void h(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    private static cgu i(Context context) {
        cjn.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).e;
    }

    public final Context b() {
        return this.b.getBaseContext();
    }

    public final void c() {
        cjp.e();
        this.j.i();
        this.a.d();
        this.d.c();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        c();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        cjp.e();
        synchronized (this.f) {
            for (bsa bsaVar : this.f) {
            }
        }
        byn bynVar = this.j;
        if (i2 >= 40) {
            bynVar.i();
        } else if (i2 >= 20 || i2 == 15) {
            bynVar.j(bynVar.e() / 2);
        }
        this.a.e(i2);
        this.d.d(i2);
    }
}
