package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ampp  reason: default package */
/* loaded from: classes.dex */
public final class ampp {
    public boolean a;
    private final String b;
    private final ampo c;
    private ampo d;

    public ampp(String str) {
        ampo ampoVar = new ampo();
        this.c = ampoVar;
        this.d = ampoVar;
        this.a = false;
        str.getClass();
        this.b = str;
    }

    private final ampo h() {
        ampo ampoVar = new ampo();
        this.d.c = ampoVar;
        this.d = ampoVar;
        return ampoVar;
    }

    public final void a(Object obj) {
        h().b = obj;
    }

    public final void b(String str, Object obj) {
        ampo h = h();
        h.b = obj;
        h.a = str;
    }

    public final void c(String str, Object obj) {
        ampn ampnVar = new ampn();
        this.d.c = ampnVar;
        this.d = ampnVar;
        ampnVar.b = obj;
        ampnVar.a = str;
    }

    public final void d(String str, float f) {
        c(str, String.valueOf(f));
    }

    public final void e(String str, int i) {
        c(str, String.valueOf(i));
    }

    public final void f(String str, long j) {
        c(str, String.valueOf(j));
    }

    public final void g(String str, boolean z) {
        c(str, String.valueOf(z));
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.b);
        sb.append('{');
        String str = "";
        for (ampo ampoVar = this.c.c; ampoVar != null; ampoVar = ampoVar.c) {
            Object obj = ampoVar.b;
            if ((ampoVar instanceof ampn) || obj != null || !z) {
                sb.append(str);
                String str2 = ampoVar.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
