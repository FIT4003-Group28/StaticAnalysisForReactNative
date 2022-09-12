package defpackage;

import java.io.Closeable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bpj  reason: default package */
/* loaded from: classes3.dex */
public abstract class bpj implements Closeable {
    public static final String[] a = new String[128];
    int b;
    int[] c = new int[32];
    String[] d = new String[32];
    int[] e = new int[32];

    static {
        for (int i = 0; i <= 31; i++) {
            a[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static bpj a(eajb eajbVar) {
        return new bpk(eajbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        int i2 = this.b;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i2 == length) {
            if (i2 == 256) {
                String valueOf = String.valueOf(q());
                throw new bpf(valueOf.length() != 0 ? "Nesting too deep at ".concat(valueOf) : new String("Nesting too deep at "));
            }
            this.c = Arrays.copyOf(iArr, length + length);
            String[] strArr = this.d;
            int length2 = strArr.length;
            this.d = (String[]) Arrays.copyOf(strArr, length2 + length2);
            int[] iArr2 = this.e;
            int length3 = iArr2.length;
            this.e = Arrays.copyOf(iArr2, length3 + length3);
        }
        int[] iArr3 = this.c;
        int i3 = this.b;
        this.b = i3 + 1;
        iArr3[i3] = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bpg c(String str) {
        String q = q();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 9 + String.valueOf(q).length());
        sb.append(str);
        sb.append(" at path ");
        sb.append(q);
        throw new bpg(sb.toString());
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract boolean h();

    public abstract String i();

    public abstract int j(bph bphVar);

    public abstract void k();

    public abstract String l();

    public abstract boolean m();

    public abstract double n();

    public abstract int o();

    public abstract void p();

    public final String q() {
        int i = this.b;
        int[] iArr = this.c;
        String[] strArr = this.d;
        int[] iArr2 = this.e;
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract int r();
}
