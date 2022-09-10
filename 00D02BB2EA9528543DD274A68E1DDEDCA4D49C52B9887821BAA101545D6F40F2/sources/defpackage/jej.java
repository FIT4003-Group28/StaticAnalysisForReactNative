package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: jej  reason: default package */
/* loaded from: classes7.dex */
public class jej {
    public final int a;
    public final int b;
    public final int c;

    public jej() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public jej(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static <T extends cqkp> cqnf<T> a(cqlc<T, jej> cqlcVar) {
        return cqjv.f(iug.DATE, cqlcVar);
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jej) {
            jej jejVar = (jej) obj;
            if (this.a == jejVar.a && this.b == jejVar.b && this.c == jejVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }
}
