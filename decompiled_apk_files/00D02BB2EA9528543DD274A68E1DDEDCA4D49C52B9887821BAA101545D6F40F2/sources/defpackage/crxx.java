package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: crxx  reason: default package */
/* loaded from: classes5.dex */
public final class crxx {
    public final Set<String> a = new HashSet();
    public final Set<String> b = new HashSet();
    public final Set<String> c = new HashSet();

    public final int a() {
        return this.a.size() + this.c.size();
    }

    public final int b() {
        return this.c.size();
    }

    public final void c(String str) {
        this.a.remove(str);
        this.c.remove(str);
    }

    public final void d(String str, int i) {
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                this.a.add(str);
                return;
            } else if (i2 != 2) {
                return;
            } else {
                this.c.add(str);
                return;
            }
        }
        throw null;
    }
}
