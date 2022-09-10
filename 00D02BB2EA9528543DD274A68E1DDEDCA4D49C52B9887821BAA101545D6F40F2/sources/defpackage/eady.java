package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: eady  reason: default package */
/* loaded from: classes6.dex */
public final class eady {
    @dzsi
    String a;
    @dzsi
    String d;
    final List<String> f;
    @dzsi
    List<String> g;
    @dzsi
    String h;
    String b = "";
    String c = "";
    int e = -1;

    public eady() {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.add("");
    }

    public static String c(String str, int i, int i2) {
        return eafa.s(eadz.n(str, i, i2, false));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        int i = this.e;
        return i != -1 ? i : eadz.f(this.a);
    }

    public final eadz b() {
        if (this.a != null) {
            if (this.d == null) {
                throw new IllegalStateException("host == null");
            }
            return new eadz(this);
        }
        throw new IllegalStateException("scheme == null");
    }

    public final void d(@dzsi String str) {
        this.g = str != null ? eadz.k(eadz.p(str, " \"'<>#", true, false, true, true)) : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fe, code lost:
        if (r1 <= 65535) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x030e A[LOOP:2: B:127:0x026a->B:156:0x030e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(@defpackage.dzsi defpackage.eadz r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eady.e(eadz, java.lang.String):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (!this.b.isEmpty() || !this.c.isEmpty()) {
            sb.append(this.b);
            if (!this.c.isEmpty()) {
                sb.append(':');
                sb.append(this.c);
            }
            sb.append('@');
        }
        String str2 = this.d;
        if (str2 != null) {
            if (str2.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
        }
        if (this.e != -1 || this.a != null) {
            int a = a();
            String str3 = this.a;
            if (str3 == null || a != eadz.f(str3)) {
                sb.append(':');
                sb.append(a);
            }
        }
        List<String> list = this.f;
        int i = eadz.f;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append(list.get(i2));
        }
        if (this.g != null) {
            sb.append('?');
            eadz.j(sb, this.g);
        }
        if (this.h != null) {
            sb.append('#');
            sb.append(this.h);
        }
        return sb.toString();
    }
}
