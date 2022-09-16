package defpackage;

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
/* renamed from: cfk  reason: default package */
/* loaded from: classes2.dex */
public final class cfk implements ComponentCallbacks2 {
    private static volatile cfk h;
    private static volatile boolean i;
    public final cld a;
    public final cfs b;
    public final cgb c;
    public final clb d;
    public final csk e;
    public final List f = new ArrayList();
    public final hy g;
    private final cmc j;

    public cfk(Context context, cki ckiVar, cmc cmcVar, cld cldVar, clb clbVar, csk cskVar, hy hyVar, cfj cfjVar, Map map, List list, cfu cfuVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        cie cpxVar;
        cie cqcVar;
        this.a = cldVar;
        this.d = clbVar;
        this.j = cmcVar;
        this.e = cskVar;
        this.g = hyVar;
        Resources resources = context.getResources();
        if (((cfp) ((cft) cfuVar.a.get(cfp.class))) != null) {
            cpq.c = 0;
        }
        cgb cgbVar = new cgb();
        this.c = cgbVar;
        cgbVar.k(new cpd());
        if (Build.VERSION.SDK_INT >= 27) {
            cgbVar.k(new cpp());
        }
        List b = cgbVar.b();
        cqv cqvVar = new cqv(context, b, cldVar, clbVar);
        cql cqlVar = new cql(cldVar, new cqi(2));
        cpl cplVar = new cpl(cgbVar.b(), resources.getDisplayMetrics(), cldVar, clbVar);
        if (!cfuVar.a(cfn.class) || Build.VERSION.SDK_INT < 28) {
            cpxVar = new cpx(cplVar, 1);
            cqcVar = new cqc(cplVar, clbVar);
        } else {
            cqcVar = new cpv();
            cpxVar = new cpv(1);
        }
        cqs cqsVar = new cqs(context);
        cnz cnzVar = new cnz(resources, 2);
        cnz cnzVar2 = new cnz(resources, 3);
        cnz cnzVar3 = new cnz(resources);
        cnz cnzVar4 = new cnz(resources, 1);
        cox coxVar = new cox(clbVar);
        crj crjVar = new crj();
        cro croVar = new cro(1);
        ContentResolver contentResolver = context.getContentResolver();
        cgbVar.d(ByteBuffer.class, new cmv());
        cgbVar.d(InputStream.class, new cob(clbVar));
        cgbVar.h("Bitmap", ByteBuffer.class, Bitmap.class, cpxVar);
        cgbVar.h("Bitmap", InputStream.class, Bitmap.class, cqcVar);
        cgbVar.h("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new cpx(cplVar));
        cgbVar.h("Bitmap", ParcelFileDescriptor.class, Bitmap.class, cqlVar);
        cgbVar.h("Bitmap", AssetFileDescriptor.class, Bitmap.class, new cql(cldVar, new cqi(1)));
        cgbVar.g(Bitmap.class, Bitmap.class, cog.a);
        cgbVar.h("Bitmap", Bitmap.class, Bitmap.class, new cqt(1));
        cgbVar.e(Bitmap.class, coxVar);
        cgbVar.h("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new cov(resources, cpxVar));
        cgbVar.h("BitmapDrawable", InputStream.class, BitmapDrawable.class, new cov(resources, cqcVar));
        cgbVar.h("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new cov(resources, cqlVar));
        cgbVar.e(BitmapDrawable.class, new cow(cldVar, coxVar));
        cgbVar.h("Gif", InputStream.class, cqy.class, new cri(b, cqvVar, clbVar));
        cgbVar.h("Gif", ByteBuffer.class, cqy.class, cqvVar);
        cgbVar.e(cqy.class, new cqz());
        cgbVar.g(cgr.class, cgr.class, cog.a);
        cgbVar.h("Bitmap", cgr.class, Bitmap.class, new crg(cldVar));
        cgbVar.f(Uri.class, Drawable.class, cqsVar);
        cgbVar.f(Uri.class, Bitmap.class, new cqa(cqsVar, cldVar));
        cgbVar.l(new cqm());
        cgbVar.g(File.class, ByteBuffer.class, new cmt(2));
        cgbVar.g(File.class, InputStream.class, new cna(new cnd()));
        cgbVar.f(File.class, File.class, new cqt(2));
        cgbVar.g(File.class, ParcelFileDescriptor.class, new cna(new cnd(1)));
        cgbVar.g(File.class, File.class, cog.a);
        cgbVar.l(new civ(clbVar));
        cgbVar.l(new ciy());
        cgbVar.g(Integer.TYPE, InputStream.class, cnzVar);
        cgbVar.g(Integer.TYPE, ParcelFileDescriptor.class, cnzVar3);
        cgbVar.g(Integer.class, InputStream.class, cnzVar);
        cgbVar.g(Integer.class, ParcelFileDescriptor.class, cnzVar3);
        cgbVar.g(Integer.class, Uri.class, cnzVar2);
        cgbVar.g(Integer.TYPE, AssetFileDescriptor.class, cnzVar4);
        cgbVar.g(Integer.class, AssetFileDescriptor.class, cnzVar4);
        cgbVar.g(Integer.TYPE, Uri.class, cnzVar2);
        cgbVar.g(String.class, InputStream.class, new cmz());
        cgbVar.g(Uri.class, InputStream.class, new cmz());
        cgbVar.g(String.class, InputStream.class, new cmt(5));
        cgbVar.g(String.class, ParcelFileDescriptor.class, new cmt(4));
        cgbVar.g(String.class, AssetFileDescriptor.class, new cmt(3));
        cgbVar.g(Uri.class, InputStream.class, new cmo(context.getAssets()));
        cgbVar.g(Uri.class, ParcelFileDescriptor.class, new cmo(context.getAssets(), 1));
        cgbVar.g(Uri.class, InputStream.class, new cok(context));
        cgbVar.g(Uri.class, InputStream.class, new cok(context, 2));
        if (Build.VERSION.SDK_INT >= 29) {
            cgbVar.g(Uri.class, InputStream.class, new com(context, InputStream.class));
            cgbVar.g(Uri.class, ParcelFileDescriptor.class, new com(context, ParcelFileDescriptor.class));
        }
        cgbVar.g(Uri.class, InputStream.class, new cod(contentResolver, 2));
        cgbVar.g(Uri.class, ParcelFileDescriptor.class, new cod(contentResolver));
        cgbVar.g(Uri.class, AssetFileDescriptor.class, new cod(contentResolver, 1));
        cgbVar.g(Uri.class, InputStream.class, new cog());
        cgbVar.g(URL.class, InputStream.class, new cog(2, (byte[]) null));
        cgbVar.g(Uri.class, File.class, new cok(context, 1));
        cgbVar.g(cnf.class, InputStream.class, new coi());
        cgbVar.g(byte[].class, ByteBuffer.class, new cmt(1));
        cgbVar.g(byte[].class, InputStream.class, new cmt());
        cgbVar.g(Uri.class, Uri.class, cog.a);
        cgbVar.g(Drawable.class, Drawable.class, cog.a);
        cgbVar.f(Drawable.class, Drawable.class, new cqt());
        cgbVar.m(Bitmap.class, BitmapDrawable.class, new crk(resources));
        cgbVar.m(Bitmap.class, byte[].class, crjVar);
        cgbVar.m(Drawable.class, byte[].class, new crl(cldVar, crjVar, croVar));
        cgbVar.m(cqy.class, byte[].class, croVar);
        if (Build.VERSION.SDK_INT >= 23) {
            cql cqlVar2 = new cql(cldVar, new cqi());
            cgbVar.f(ByteBuffer.class, Bitmap.class, cqlVar2);
            cgbVar.f(ByteBuffer.class, BitmapDrawable.class, new cov(resources, cqlVar2));
        }
        this.b = new cfs(context, clbVar, cgbVar, cfjVar, map, list, ckiVar, cfuVar);
    }

    public static cfk b(Context context) {
        if (h == null) {
            GeneratedAppGlideModule e = e(context.getApplicationContext());
            synchronized (cfk.class) {
                if (h == null) {
                    if (!i) {
                        i = true;
                        f(context, new cfr(), e);
                        i = false;
                    } else {
                        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
                    }
                }
            }
        }
        return h;
    }

    public static cgg c(Context context) {
        hy.R(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).e.a(context);
    }

    private static GeneratedAppGlideModule e(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e) {
            g(e);
            return null;
        } catch (InstantiationException e2) {
            g(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            g(e3);
            return null;
        } catch (InvocationTargetException e4) {
            g(e4);
            return null;
        }
    }

    private static void f(Context context, cfr cfrVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.e()) {
            emptyList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            emptyList.add(dpc.b(str));
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
            }
        }
        List<css> list = emptyList;
        if (generatedAppGlideModule != null && !generatedAppGlideModule.b().isEmpty()) {
            Set b = generatedAppGlideModule.b();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (b.contains(((css) it.next()).getClass())) {
                    it.remove();
                }
            }
        }
        cfrVar.j = generatedAppGlideModule != null ? generatedAppGlideModule.a() : null;
        for (css cssVar : list) {
            cssVar.c(applicationContext, cfrVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.c(applicationContext, cfrVar);
        }
        if (cfrVar.e == null) {
            cfrVar.e = cmm.b().a();
        }
        if (cfrVar.f == null) {
            cmj cmjVar = new cmj(true);
            cmjVar.b(1);
            cmjVar.a = "disk-cache";
            cfrVar.f = cmjVar.a();
        }
        if (cfrVar.k == null) {
            int i2 = cmm.a() >= 4 ? 2 : 1;
            cmj cmjVar2 = new cmj(true);
            cmjVar2.b(i2);
            cmjVar2.a = "animation";
            cfrVar.k = cmjVar2.a();
        }
        if (cfrVar.h == null) {
            cfrVar.h = new cmd(applicationContext).a();
        }
        if (cfrVar.p == null) {
            cfrVar.p = new hy();
        }
        if (cfrVar.c == null) {
            int i3 = cfrVar.h.a;
            if (i3 > 0) {
                cfrVar.c = new cll(i3);
            } else {
                cfrVar.c = new cle();
            }
        }
        if (cfrVar.d == null) {
            cfrVar.d = new clk(cfrVar.h.c);
        }
        if (cfrVar.n == null) {
            cfrVar.n = new cmc(cfrVar.h.b);
        }
        if (cfrVar.g == null) {
            cfrVar.g = new clz(applicationContext, 262144000L);
        }
        if (cfrVar.b == null) {
            cmc cmcVar = cfrVar.n;
            cls clsVar = cfrVar.g;
            cmm cmmVar = cfrVar.f;
            cmm cmmVar2 = cfrVar.e;
            new cmm(new ThreadPoolExecutor(0, Integer.MAX_VALUE, cmm.a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new cml("source-unlimited", false)));
            cfrVar.b = new cki(cmcVar, clsVar, cmmVar, cmmVar2, cfrVar.k, cfrVar.l);
        }
        List list2 = cfrVar.m;
        if (list2 == null) {
            cfrVar.m = Collections.emptyList();
        } else {
            cfrVar.m = Collections.unmodifiableList(list2);
        }
        cfu cfuVar = new cfu(cfrVar.o, null);
        cfk cfkVar = new cfk(applicationContext, cfrVar.b, cfrVar.n, cfrVar.c, cfrVar.d, new csk(cfrVar.j, cfuVar), cfrVar.p, cfrVar.i, cfrVar.a, cfrVar.m, cfuVar, null, null, null);
        for (css cssVar2 : list) {
            try {
                cssVar2.d(applicationContext, cfkVar, cfkVar.c);
            } catch (AbstractMethodError e2) {
                String valueOf = String.valueOf(cssVar2.getClass().getName());
                throw new IllegalStateException(valueOf.length() != 0 ? "Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(valueOf) : new String("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: "), e2);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.d(applicationContext, cfkVar, cfkVar.c);
        }
        applicationContext.registerComponentCallbacks(cfkVar);
        h = cfkVar;
    }

    private static void g(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public final Context a() {
        return this.b.getBaseContext();
    }

    public final void d() {
        cvd.i();
        this.j.i();
        this.a.c();
        this.d.b();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        d();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        cvd.i();
        synchronized (this.f) {
            for (cgg cggVar : this.f) {
            }
        }
        cmc cmcVar = this.j;
        if (i2 >= 40) {
            cmcVar.i();
        } else {
            if (i2 < 20) {
                if (i2 == 15) {
                    i2 = 15;
                }
            }
            cmcVar.j(cmcVar.e() / 2);
        }
        this.a.e(i2);
        this.d.d(i2);
    }
}
