package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dbsb  reason: default package */
/* loaded from: classes.dex */
public final class dbsb {
    private final String a;
    private final dbsa b;
    private dbsa c;
    private boolean d;

    public dbsb(String str) {
        dbsa dbsaVar = new dbsa();
        this.b = dbsaVar;
        this.c = dbsaVar;
        this.d = false;
        dbsk.s(str);
        this.a = str;
    }

    private final dbsa i() {
        dbsa dbsaVar = new dbsa();
        this.c.c = dbsaVar;
        this.c = dbsaVar;
        return dbsaVar;
    }

    public final void a(Object obj) {
        i().b = obj;
    }

    public final void b(String str, Object obj) {
        dbsa i = i();
        i.b = obj;
        dbsk.s(str);
        i.a = str;
    }

    public final void c() {
        this.d = true;
    }

    public final void d(String str, double d) {
        b(str, String.valueOf(d));
    }

    public final void e(String str, float f) {
        b(str, String.valueOf(f));
    }

    public final void f(String str, int i) {
        b(str, String.valueOf(i));
    }

    public final void g(String str, long j) {
        b(str, String.valueOf(j));
    }

    public final void h(String str, boolean z) {
        b(str, String.valueOf(z));
    }

    public final String toString() {
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        String str = "";
        for (dbsa dbsaVar = this.b.c; dbsaVar != null; dbsaVar = dbsaVar.c) {
            Object obj = dbsaVar.b;
            if (!z || obj != null) {
                sb.append(str);
                String str2 = dbsaVar.a;
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
