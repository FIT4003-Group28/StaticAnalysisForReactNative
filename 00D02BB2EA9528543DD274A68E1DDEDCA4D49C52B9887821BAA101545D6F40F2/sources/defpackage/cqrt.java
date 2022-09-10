package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cqrt  reason: default package */
/* loaded from: classes.dex */
public class cqrt {
    private static final SparseArray<cqru> c = new SparseArray<>();
    private static final SparseArray<cqss> d = new SparseArray<>();
    private static final SparseArray<cqtb> e = new SparseArray<>();
    private static final SparseArray<cqtd> f = new SparseArray<>();
    private static final SparseArray<cqvf> g = new SparseArray<>();
    private static final SparseArray<cqvg> h = new SparseArray<>();
    public final int a;
    public final Object[] b;

    /* JADX INFO: Access modifiers changed from: protected */
    public cqrt(int i) {
        a(i);
        this.a = i;
        this.b = new Object[0];
    }

    private static void a(int i) {
        dbsk.b(i != 0, "Attempted to create AndroidResource with id == 0, which is an invalid ID. If it happened to you, it means that you should fix the code which caused that. Try falling back to null, transparent color, empty drawable, empty string, or anything which is appropriate in your context.");
    }

    public static synchronized cqss c(int i) {
        synchronized (cqrt.class) {
            SparseArray<cqss> sparseArray = d;
            cqss cqssVar = sparseArray.get(i);
            if (cqssVar == null) {
                cqrt cqrtVar = new cqrt(i);
                cqrr cqrrVar = new cqrr(new Object[]{cqrtVar}, cqrtVar);
                sparseArray.put(i, cqrrVar);
                return cqrrVar;
            }
            return cqssVar;
        }
    }

    public static synchronized cqtb d(int i) {
        synchronized (cqrt.class) {
            SparseArray<cqtb> sparseArray = e;
            cqtb cqtbVar = sparseArray.get(i);
            if (cqtbVar == null) {
                cqtb cqtbVar2 = new cqtb(i);
                sparseArray.put(i, cqtbVar2);
                return cqtbVar2;
            }
            return cqtbVar;
        }
    }

    public static synchronized cqtd f(int i) {
        synchronized (cqrt.class) {
            SparseArray<cqtd> sparseArray = f;
            cqtd cqtdVar = sparseArray.get(i);
            if (cqtdVar == null) {
                cqrt cqrtVar = new cqrt(i);
                cqrs cqrsVar = new cqrs(new Object[]{cqrtVar}, cqrtVar);
                sparseArray.put(i, cqrsVar);
                return cqrsVar;
            }
            return cqtdVar;
        }
    }

    public static cqtd g(int i, cqss cqssVar) {
        return i(f(i), cqssVar);
    }

    public static cqtd h(int i, cqss cqssVar) {
        return j(f(i), cqssVar);
    }

    public static cqtd i(cqtd cqtdVar, cqss cqssVar) {
        return k(cqtdVar, cqssVar, PorterDuff.Mode.SRC_ATOP);
    }

    public static cqtd j(cqtd cqtdVar, cqss cqssVar) {
        return k(cqtdVar, cqssVar, PorterDuff.Mode.SRC_IN);
    }

    public static cqtd k(final cqtd cqtdVar, final cqss cqssVar, final PorterDuff.Mode mode) {
        if (cqny.b(cqtdVar) || cqny.b(cqssVar) || cqny.b(mode)) {
            cqta f2 = cqta.f();
            cqny.e(f2, new cqjb(cqtdVar, cqssVar, mode) { // from class: cqrq
                private final cqtd a;
                private final cqss b;
                private final PorterDuff.Mode c;

                {
                    this.a = cqtdVar;
                    this.b = cqssVar;
                    this.c = mode;
                }

                @Override // defpackage.cqjb
                public final Object a(cqkp cqkpVar, Context context) {
                    return new cqso((cqtd) cqjv.a(this.a, cqkpVar, context), (cqss) cqjv.a(this.b, cqkpVar, context), (PorterDuff.Mode) cqjv.a(this.c, cqkpVar, context));
                }
            });
            return f2;
        }
        return new cqso(cqtdVar, cqssVar, mode);
    }

    public static synchronized cqvf l(int i) {
        synchronized (cqrt.class) {
            SparseArray<cqvf> sparseArray = g;
            cqvf cqvfVar = sparseArray.get(i);
            if (cqvfVar == null) {
                cqvf cqvfVar2 = new cqvf(i);
                sparseArray.put(i, cqvfVar2);
                return cqvfVar2;
            }
            return cqvfVar;
        }
    }

    public static cqvf m(int i, Object... objArr) {
        return new cqvf(i, objArr);
    }

    public static synchronized cquu n(int i, int i2) {
        cquu cquuVar;
        synchronized (cqrt.class) {
            cquuVar = new cquu(i, i2);
        }
        return cquuVar;
    }

    public static cquu o(int i, int i2, Object... objArr) {
        return new cquu(i, i2, objArr);
    }

    public static synchronized cqvg p(int i, Typeface typeface) {
        synchronized (cqrt.class) {
            SparseArray<cqvg> sparseArray = h;
            cqvg cqvgVar = sparseArray.get(i);
            if (cqvgVar == null) {
                cqvg cqvgVar2 = new cqvg(i, typeface);
                sparseArray.put(i, cqvgVar2);
                return cqvgVar2;
            }
            return cqvgVar;
        }
    }

    public static synchronized void q() {
        synchronized (cqrt.class) {
            c.clear();
            d.clear();
            e.clear();
            f.clear();
            g.clear();
            h.clear();
        }
    }

    public boolean equals(@dzsi Object obj) {
        if (obj == null || !(obj instanceof cqrt)) {
            return false;
        }
        cqrt cqrtVar = (cqrt) obj;
        return cqrtVar.a == this.a && Arrays.equals(cqrtVar.b, this.b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.b))});
    }

    public final String toString() {
        return String.format(Locale.US, "%s(id=%d)", getClass().getSimpleName(), Integer.valueOf(this.a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cqrt(int i, Object... objArr) {
        a(i);
        this.a = i;
        this.b = objArr;
    }
}
