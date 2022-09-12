package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: eadb  reason: default package */
/* loaded from: classes6.dex */
public final class eadb {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final boolean i;
    @dzsi
    String j;
    private final int k;
    private final boolean l;
    private final boolean m;

    static {
        eada eadaVar = new eada();
        eadaVar.a = true;
        eadaVar.a();
        eada eadaVar2 = new eada();
        eadaVar2.c = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        eadaVar2.b = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
        eadaVar2.a();
    }

    public eadb(eada eadaVar) {
        this.a = eadaVar.a;
        this.b = false;
        this.c = -1;
        this.k = -1;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = eadaVar.b;
        this.h = -1;
        this.i = eadaVar.c;
        this.l = false;
        this.m = false;
    }

    private eadb(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, @dzsi String str) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.k = i2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = i3;
        this.h = i4;
        this.i = z6;
        this.l = z7;
        this.m = z8;
        this.j = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.eadb a(defpackage.eadx r23) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eadb.a(eadx):eadb");
    }

    public final String toString() {
        String str = this.j;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a) {
                sb.append("no-cache, ");
            }
            if (this.b) {
                sb.append("no-store, ");
            }
            if (this.c != -1) {
                sb.append("max-age=");
                sb.append(this.c);
                sb.append(", ");
            }
            if (this.k != -1) {
                sb.append("s-maxage=");
                sb.append(this.k);
                sb.append(", ");
            }
            if (this.d) {
                sb.append("private, ");
            }
            if (this.e) {
                sb.append("public, ");
            }
            if (this.f) {
                sb.append("must-revalidate, ");
            }
            if (this.g != -1) {
                sb.append("max-stale=");
                sb.append(this.g);
                sb.append(", ");
            }
            if (this.h != -1) {
                sb.append("min-fresh=");
                sb.append(this.h);
                sb.append(", ");
            }
            if (this.i) {
                sb.append("only-if-cached, ");
            }
            if (this.l) {
                sb.append("no-transform, ");
            }
            if (this.m) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.j = str;
        }
        return str;
    }
}
