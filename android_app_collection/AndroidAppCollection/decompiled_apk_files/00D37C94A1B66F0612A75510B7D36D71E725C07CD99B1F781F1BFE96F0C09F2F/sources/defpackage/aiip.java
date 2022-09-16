package defpackage;

import java.util.Arrays;
/* compiled from: PG */
@Deprecated
/* renamed from: aiip  reason: default package */
/* loaded from: classes.dex */
public class aiip {
    private final int a = 15;
    private final int b;
    private final String c;

    public aiip(int i, int i2, String str) {
        this.b = i2;
        this.c = str;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof aiip) {
            aiip aiipVar = (aiip) obj;
            return this.a == aiipVar.a && this.b == aiipVar.b && akzj.f(this.c, aiipVar.c);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c});
    }
}
