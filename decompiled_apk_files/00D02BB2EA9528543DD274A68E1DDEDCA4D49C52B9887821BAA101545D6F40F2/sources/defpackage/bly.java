package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: bly  reason: default package */
/* loaded from: classes3.dex */
public final class bly {
    public static final bly a = new bly("COMPOSITION");
    public blz b;
    private final List<String> c;

    private bly(bly blyVar) {
        this.c = new ArrayList(blyVar.c);
        this.b = blyVar.b;
    }

    private final boolean g() {
        List<String> list = this.c;
        return list.get(list.size() - 1).equals("**");
    }

    private static final boolean h(String str) {
        return "__container".equals(str);
    }

    public final bly a(String str) {
        bly blyVar = new bly(this);
        blyVar.c.add(str);
        return blyVar;
    }

    public final bly b(blz blzVar) {
        bly blyVar = new bly(this);
        blyVar.b = blzVar;
        return blyVar;
    }

    public final boolean c(String str, int i) {
        if (h(str)) {
            return true;
        }
        if (i >= this.c.size()) {
            return false;
        }
        return this.c.get(i).equals(str) || this.c.get(i).equals("**") || this.c.get(i).equals("*");
    }

    public final int d(String str, int i) {
        if (h(str)) {
            return 0;
        }
        if (!this.c.get(i).equals("**")) {
            return 1;
        }
        return (i != this.c.size() + (-1) && this.c.get(i + 1).equals(str)) ? 2 : 0;
    }

    public final boolean e(String str, int i) {
        if (i >= this.c.size()) {
            return false;
        }
        int size = this.c.size() - 1;
        String str2 = this.c.get(i);
        if (!str2.equals("**")) {
            return (i == size || (i == this.c.size() + (-2) && g())) && (str2.equals(str) || str2.equals("*"));
        } else if (i == size) {
            return true;
        } else {
            int i2 = i + 1;
            if (this.c.get(i2).equals(str)) {
                return i == this.c.size() + (-2) || (i == this.c.size() + (-3) && g());
            } else if (i2 >= this.c.size() - 1) {
                return this.c.get(i2).equals(str);
            } else {
                return false;
            }
        }
    }

    public final boolean f(String str, int i) {
        return "__container".equals(str) || i < this.c.size() + (-1) || this.c.get(i).equals("**");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        boolean z = this.b != null;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("KeyPath{keys=");
        sb.append(valueOf);
        sb.append(",resolved=");
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }

    public bly(String... strArr) {
        this.c = Arrays.asList(strArr);
    }
}
