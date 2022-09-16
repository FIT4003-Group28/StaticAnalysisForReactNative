package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ahia  reason: default package */
/* loaded from: classes.dex */
public class ahia {
    private final int a;
    private final String b;

    public ahia(int i) {
        this(i, null);
    }

    public static boolean d(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            default:
                return false;
        }
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean c() {
        int i = this.a;
        return i == 5 || i == 6;
    }

    public boolean e() {
        int i = this.a;
        return i == 3 || i == 6 || i == 10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ahia) && this.a == ((ahia) obj).a;
    }

    public boolean f() {
        int i = this.a;
        return i == 2 || i == 5 || i == 9;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    public ahia(int i, String str) {
        aqxo.p(d(i));
        this.a = i;
        this.b = str;
    }
}
