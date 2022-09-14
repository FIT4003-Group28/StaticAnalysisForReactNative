package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: eadw  reason: default package */
/* loaded from: classes6.dex */
public final class eadw {
    final List<String> a = new ArrayList(20);

    public final String a(String str) {
        int size = this.a.size();
        do {
            size -= 2;
            if (size < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(this.a.get(size)));
        return this.a.get(size + 1);
    }

    public final eadx b() {
        return new eadx(this);
    }

    public final void c(String str, String str2) {
        this.a.add(str);
        this.a.add(str2.trim());
    }

    public final void d(String str) {
        int i = 0;
        while (i < this.a.size()) {
            if (str.equalsIgnoreCase(this.a.get(i))) {
                this.a.remove(i);
                this.a.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public final void e(String str, String str2) {
        eadx.f(str);
        eadx.g(str2, str);
        d(str);
        c(str, str2);
    }

    public final void f(String str, String str2) {
        eadx.f(str);
        eadx.g(str2, str);
        c(str, str2);
    }
}
