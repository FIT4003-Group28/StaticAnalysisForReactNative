package android.support.v4.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.v4.a.a.a;
import android.support.v4.a.a.b;
import android.support.v4.g.b;
/* compiled from: TypefaceCompat.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final a f366a;

    /* renamed from: b  reason: collision with root package name */
    private static final android.support.v4.i.g<String, Typeface> f367b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypefaceCompat.java */
    /* loaded from: classes.dex */
    public interface a {
        Typeface a(Context context, Resources resources, int i, String str, int i2);

        Typeface a(Context context, CancellationSignal cancellationSignal, b.C0008b[] c0008bArr, int i);

        Typeface a(Context context, a.b bVar, Resources resources, int i);
    }

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            f366a = new f();
        } else if (Build.VERSION.SDK_INT >= 24 && e.a()) {
            f366a = new e();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f366a = new d();
        } else {
            f366a = new g();
        }
        f367b = new android.support.v4.i.g<>(16);
    }

    public static Typeface a(Resources resources, int i, int i2) {
        return f367b.get(b(resources, i, i2));
    }

    private static String b(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    public static Typeface a(Context context, a.InterfaceC0004a interfaceC0004a, Resources resources, int i, int i2, b.a aVar, Handler handler, boolean z) {
        Typeface a2;
        if (interfaceC0004a instanceof a.d) {
            a.d dVar = (a.d) interfaceC0004a;
            boolean z2 = false;
            if (!z ? aVar == null : dVar.b() == 0) {
                z2 = true;
            }
            a2 = android.support.v4.g.b.a(context, dVar.a(), aVar, handler, z2, z ? dVar.c() : -1, i2);
        } else {
            a2 = f366a.a(context, (a.b) interfaceC0004a, resources, i2);
            if (aVar != null) {
                if (a2 != null) {
                    aVar.a(a2, handler);
                } else {
                    aVar.a(-3, handler);
                }
            }
        }
        if (a2 != null) {
            f367b.put(b(resources, i, i2), a2);
        }
        return a2;
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a2 = f366a.a(context, resources, i, str, i2);
        if (a2 != null) {
            f367b.put(b(resources, i, i2), a2);
        }
        return a2;
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b.C0008b[] c0008bArr, int i) {
        return f366a.a(context, cancellationSignal, c0008bArr, i);
    }
}
