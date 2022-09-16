package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: afgx  reason: default package */
/* loaded from: classes.dex */
public final class afgx {
    private final int d;
    private final List c = new ArrayList();
    public String b = "";
    public Throwable a = null;

    public afgx(int i) {
        this.d = i;
    }

    public final afgy a() {
        return new afgy(this.d, this.b, this.a, this.c);
    }

    public final void b(String str, String str2) {
        List list = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        list.add(sb.toString());
    }

    public final void c(int i) {
        b("itag", String.valueOf(i));
    }
}
