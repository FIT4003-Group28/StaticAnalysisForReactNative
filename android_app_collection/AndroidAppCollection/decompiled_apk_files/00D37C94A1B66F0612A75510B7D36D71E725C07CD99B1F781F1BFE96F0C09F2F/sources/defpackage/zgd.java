package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: zgd  reason: default package */
/* loaded from: classes4.dex */
public final class zgd {
    public static volatile boolean a;

    static void A(zds zdsVar, String str, Throwable th) {
        if (zdsVar != null) {
            zdsVar.a(str, th);
        }
    }

    public static boolean B(File file) {
        try {
            return file.exists();
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean C(File file, File file2, zds zdsVar) {
        try {
            if (file.renameTo(file2) || !file.exists()) {
                return true;
            }
            if (file2.exists() && file2.delete() && file.renameTo(file2)) {
                return true;
            }
            String ab = ab(file);
            String ab2 = ab(file2);
            StringBuilder sb = new StringBuilder(String.valueOf(ab).length() + 26 + String.valueOf(ab2).length());
            sb.append("!renameQuietly, src=");
            sb.append(ab);
            sb.append(", dst=");
            sb.append(ab2);
            A(zdsVar, sb.toString(), null);
            return false;
        } catch (SecurityException e) {
            A(zdsVar, "!renameQuietly", e);
            return false;
        }
    }

    public static void D(File file) {
        try {
            if (!file.exists() || !file.isDirectory()) {
                return;
            }
            ac(file);
        } catch (SecurityException unused) {
        }
    }

    public static void E(File file) {
        G(file, null);
    }

    public static OutputStream F(File file) {
        try {
            return new FileOutputStream(file, false);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return new FileOutputStream(file);
        }
    }

    public static void G(File file, zds zdsVar) {
        try {
            if (file.delete() || !file.exists()) {
                return;
            }
            String valueOf = String.valueOf(ab(file));
            A(zdsVar, valueOf.length() != 0 ? "!deleteQuietly, ".concat(valueOf) : new String("!deleteQuietly, "), null);
        } catch (SecurityException e) {
            A(zdsVar, "!deleteQuietly", e);
        }
    }

    public static aoob H(aoob aoobVar, int i) {
        aqxo.q(true, "fieldNumber must be > 0");
        aoog l = aoobVar.l();
        while (!l.E()) {
            try {
                int n = l.n();
                int a2 = aosl.a(n);
                int b = aosl.b(n);
                if (i != a2 || b != 2) {
                    l.G(n);
                } else {
                    aoobVar = l.x();
                    return aoobVar;
                }
            } catch (IOException unused) {
                String valueOf = String.valueOf(aoobVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                sb.append("Error while getting field ");
                sb.append(i);
                sb.append(" from ");
                sb.append(valueOf);
                zep.l(sb.toString());
                return null;
            }
        }
        return null;
    }

    public static aoob I(byte[] bArr, int i) {
        bArr.getClass();
        aoog O = aoog.O(bArr);
        while (true) {
            try {
                if (O.E()) {
                    break;
                }
                int n = O.n();
                if (i != aosl.a(n)) {
                    O.G(n);
                } else if (aosl.b(n) == 2) {
                    return O.x();
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                sb.append("Error while getting field ");
                sb.append(i);
                sb.append(": ");
                sb.append(valueOf);
                zep.l(sb.toString());
                return null;
            }
        }
        aqxo.q(true, "fieldNumber must be > 0");
        return null;
    }

    public static aopi J(Parcel parcel, aopi aopiVar) {
        Object n;
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            n = null;
        } else {
            try {
                n = aopiVar.getParserForType().n(createByteArray, aoos.b());
            } catch (aopx e) {
                throw new IllegalArgumentException(e);
            }
        }
        return n != null ? (aopi) n : aopiVar;
    }

    public static void K(aoqu aoquVar, Parcel parcel) {
        parcel.writeByteArray(aoquVar.toByteArray());
    }

    public static boolean L(Parcel parcel) {
        return parcel.readInt() > 0;
    }

    public static int M() {
        return Build.VERSION.SDK_INT >= 23 ? 67108864 : 0;
    }

    public static float N(float f, float f2, float f3) {
        return (Float.isNaN(f) || f <= f2) ? f2 : Math.min(f, f3);
    }

    public static long O(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    public static boolean P(int i, int i2, int i3) {
        return i2 <= i && i < i3;
    }

    public static boolean Q(int i, int i2) {
        return i2 <= i && i <= 20;
    }

    public static Object R(Callable callable) {
        try {
            return callable.call();
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    public static void S(Map map) {
        for (Map.Entry entry : ((amup) map).entrySet()) {
            amlp l = amna.l((String) entry.getKey());
            try {
                ((ver) ((azqb) entry.getValue()).get()).a();
                l.close();
            } catch (Throwable th) {
                try {
                    l.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
    }

    public static String T(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        return simpleName.endsWith("Exception") ? simpleName.contains("$") ? simpleName.substring(simpleName.lastIndexOf(36) + 1) : simpleName : th instanceof qsp ? "ApiException" : "ObfuscatedException";
    }

    public static Throwable U(Throwable th, Class cls) {
        if (th == null) {
            return null;
        }
        return th.getClass().equals(cls) ? th : U(th.getCause(), cls);
    }

    public static final /* bridge */ /* synthetic */ ujs Z(Object obj) {
        ulx ulxVar = (ulx) obj;
        ujq ujqVar = new ujq();
        ujqVar.a(false);
        ujqVar.b(1);
        ujqVar.a(ulxVar.f);
        ujqVar.b(ulxVar.h);
        Boolean bool = ujqVar.a;
        if (bool == null || ujqVar.b == 0) {
            StringBuilder sb = new StringBuilder();
            if (ujqVar.a == null) {
                sb.append(" isG1User");
            }
            if (ujqVar.b == 0) {
                sb.append(" isUnicornUser");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ujs(bool.booleanValue(), ujqVar.b);
    }

    public static void a(Context context, String str) {
        String c = zfm.c(context);
        HashSet hashSet = new HashSet();
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (dnt.d(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        czu.I("Beginning load of %s...", str);
        czu.J(context, str, c, hashSet);
    }

    private static String ab(File file) {
        try {
            return file.exists() ? file.isDirectory() ? "dir" : "file" : "!exist";
        } catch (SecurityException e) {
            return e.getMessage();
        }
    }

    private static boolean ac(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File file2 : listFiles) {
                if (!file2.isDirectory() ? file2.delete() : ac(file2)) {
                    if (z) {
                        z = true;
                    }
                }
                z = false;
            }
        } else {
            z = true;
        }
        return file.delete() && z;
    }

    public static zfx b(zfx... zfxVarArr) {
        return new zft(Arrays.asList(zfxVarArr));
    }

    public static zfx c(int i) {
        return new zga(i, -1);
    }

    public static zfx d(int i, int i2) {
        return new zga(i, i2);
    }

    public static zfx e(int i) {
        return new zfv(i, 1);
    }

    public static zfx f(ajc ajcVar) {
        return new zfu(ajcVar);
    }

    public static zfx g(int i) {
        return new zfv(i);
    }

    public static zfx h(int i) {
        return new zgc(i, 1);
    }

    public static zfx i(int i) {
        return new zfv(i, 2);
    }

    public static zfx j(int i) {
        return new zfv(i, 3, null);
    }

    public static zfx k(int i) {
        return new zfv(i, 4);
    }

    public static zfx l(int i) {
        return new zfv(i, 5);
    }

    public static zfx m(int i, int i2, int i3, int i4) {
        return new zfz(i, i2, i3, i4);
    }

    public static zfx n(int i) {
        return new zga(i, 0);
    }

    public static zfx o(int i) {
        return new zfv(i, 6);
    }

    public static zfx p(int i) {
        return new zfv(i, 7);
    }

    public static zfx q(float f) {
        return new zfy(f);
    }

    public static zfx r(int i) {
        return new zgc(i);
    }

    public static zfx s(int i, int i2) {
        return b(r(i), h(i2));
    }

    public static void t(final View view, zfx zfxVar, final Class cls) {
        if (view.getLayoutParams() == null) {
            return;
        }
        u(view, new azqb() { // from class: zfs
            @Override // defpackage.azqb
            public final Object get() {
                Class cls2 = cls;
                View view2 = view;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                view2.getContext();
                return zgd.x(cls2, layoutParams);
            }
        }, zfxVar, cls);
    }

    public static void u(View view, azqb azqbVar, zfx zfxVar, Class cls) {
        view.getClass();
        azqbVar.getClass();
        zfxVar.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ViewGroup.LayoutParams layoutParams2 = (ViewGroup.LayoutParams) azqbVar.get();
            layoutParams2.getClass();
            view.getContext();
            w(x(cls, layoutParams2), zfxVar);
            view.setLayoutParams(layoutParams2);
            return;
        }
        view.getContext();
        if (!w(x(cls, layoutParams), zfxVar) && !a) {
            return;
        }
        view.setLayoutParams(layoutParams);
    }

    public static void v(View view, int i, int i2) {
        u(view, new zfr(i, i2), s(i, i2), ViewGroup.LayoutParams.class);
    }

    public static boolean w(ViewGroup.LayoutParams layoutParams, zfx zfxVar) {
        if (layoutParams == null) {
            return false;
        }
        return zfxVar.a(layoutParams);
    }

    public static ViewGroup.LayoutParams x(Class cls, ViewGroup.LayoutParams layoutParams) {
        try {
            return (ViewGroup.LayoutParams) cls.cast(layoutParams);
        } catch (ClassCastException e) {
            zep.f("SafeLayoutParams", String.format("Error casting %s", layoutParams), e);
            return null;
        }
    }

    public static final zfx y(ArrayDeque arrayDeque) {
        return new zft(arrayDeque);
    }

    public static int z() {
        return Runtime.getRuntime().availableProcessors();
    }
}
