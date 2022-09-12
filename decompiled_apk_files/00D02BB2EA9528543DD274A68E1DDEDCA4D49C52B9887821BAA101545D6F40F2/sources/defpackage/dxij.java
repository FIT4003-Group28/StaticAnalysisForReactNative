package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dxij  reason: default package */
/* loaded from: classes6.dex */
public final class dxij {
    public String a;
    public String d;
    final List<String> f;
    final String b = "";
    final String c = "";
    public int e = -1;

    public dxij() {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.add("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        int i = this.e;
        return i != -1 ? i : dxik.a(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("://");
        if (!this.b.isEmpty() || !this.c.isEmpty()) {
            sb.append(this.b);
            if (!this.c.isEmpty()) {
                sb.append(':');
                sb.append(this.c);
            }
            sb.append('@');
        }
        if (this.d.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.d);
            sb.append(']');
        } else {
            sb.append(this.d);
        }
        int a = a();
        if (a != dxik.a(this.a)) {
            sb.append(':');
            sb.append(a);
        }
        List<String> list = this.f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c1, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.InetAddress b(java.lang.String r16, int r17) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxij.b(java.lang.String, int):java.net.InetAddress");
    }
}
