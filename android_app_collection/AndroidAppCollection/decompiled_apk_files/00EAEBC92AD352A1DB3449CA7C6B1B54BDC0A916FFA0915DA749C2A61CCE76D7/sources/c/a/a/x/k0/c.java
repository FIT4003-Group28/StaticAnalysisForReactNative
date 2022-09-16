package c.a.a.x.k0;

import h.f;
import h.m;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class c implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f2644h = new String[128];

    /* renamed from: b  reason: collision with root package name */
    int f2645b;

    /* renamed from: c  reason: collision with root package name */
    int[] f2646c = new int[32];

    /* renamed from: d  reason: collision with root package name */
    String[] f2647d = new String[32];

    /* renamed from: e  reason: collision with root package name */
    int[] f2648e = new int[32];

    /* renamed from: f  reason: collision with root package name */
    boolean f2649f;

    /* renamed from: g  reason: collision with root package name */
    boolean f2650g;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final String[] f2651a;

        /* renamed from: b  reason: collision with root package name */
        final m f2652b;

        private a(String[] strArr, m mVar) {
            this.f2651a = strArr;
            this.f2652b = mVar;
        }

        public static a a(String... strArr) {
            try {
                f[] fVarArr = new f[strArr.length];
                h.c cVar = new h.c();
                for (int i = 0; i < strArr.length; i++) {
                    c.b(cVar, strArr[i]);
                    cVar.readByte();
                    fVarArr[i] = cVar.c();
                }
                return new a((String[]) strArr.clone(), m.a(fVarArr));
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f2644h[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f2644h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static c a(h.e eVar) {
        return new e(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(h.d r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = c.a.a.x.k0.c.f2644h
            r1 = 34
            r7.mo339writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = 0
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.mo332a(r8, r4, r3)
        L2e:
            r7.mo331a(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.mo332a(r8, r4, r2)
        L3b:
            r7.mo339writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.x.k0.c.b(h.d, java.lang.String):void");
    }

    public abstract b A();

    public abstract void B();

    public abstract void C();

    public abstract int a(a aVar);

    public abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final c.a.a.x.k0.b b(String str) {
        throw new c.a.a.x.k0.b(str + " at path " + e());
    }

    public abstract void b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        int i2 = this.f2645b;
        int[] iArr = this.f2646c;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new c.a.a.x.k0.a("Nesting too deep at " + e());
            }
            this.f2646c = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f2647d;
            this.f2647d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f2648e;
            this.f2648e = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f2646c;
        int i3 = this.f2645b;
        this.f2645b = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract void c();

    public abstract void d();

    public final String e() {
        return d.a(this.f2645b, this.f2646c, this.f2647d, this.f2648e);
    }

    public abstract boolean f();

    public abstract boolean g();

    public abstract double h();

    public abstract int i();

    public abstract String w();

    public abstract String z();
}
