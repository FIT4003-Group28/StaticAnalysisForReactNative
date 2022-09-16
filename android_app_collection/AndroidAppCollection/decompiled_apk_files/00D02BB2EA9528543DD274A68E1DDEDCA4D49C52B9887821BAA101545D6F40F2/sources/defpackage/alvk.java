package defpackage;
/* compiled from: PG */
/* renamed from: alvk  reason: default package */
/* loaded from: classes.dex */
public final class alvk {
    public static final alvk b;
    private static final alvk[] c = new alvk[16];
    public final int a;

    static {
        int i = 0;
        while (true) {
            alvk[] alvkVarArr = c;
            int length = alvkVarArr.length;
            if (i < 16) {
                alvkVarArr[i] = new alvk(i);
                i++;
            } else {
                b = alvkVarArr[5];
                return;
            }
        }
    }

    private alvk(int i) {
        this.a = i;
    }

    public static alvk a(dmpm dmpmVar) {
        dmlo dmloVar = dmlo.CENTER;
        dmpm dmpmVar2 = dmpm.BOTTOM_RIGHT_TO_TOP_LEFT;
        char c2 = '\t';
        switch (dmpmVar.ordinal()) {
            case 0:
                c2 = '\n';
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
                c2 = 11;
                break;
            case 5:
            case 6:
            case 7:
                c2 = 6;
                break;
            case 8:
            case 9:
            case 10:
                c2 = 7;
                break;
            case 11:
                c2 = 14;
                break;
            case 12:
            case 13:
            case 14:
            default:
                c2 = '\r';
                break;
            case 15:
                c2 = 15;
                break;
        }
        return c[c2];
    }

    public static alvk b(dmlo dmloVar) {
        char c2;
        dmlo dmloVar2 = dmlo.CENTER;
        dmpm dmpmVar = dmpm.BOTTOM_RIGHT_TO_TOP_LEFT;
        switch (dmloVar.ordinal()) {
            case 1:
                c2 = 6;
                break;
            case 2:
                c2 = 7;
                break;
            case 3:
                c2 = '\t';
                break;
            case 4:
                c2 = '\n';
                break;
            case 5:
                c2 = 11;
                break;
            case 6:
                c2 = '\r';
                break;
            case 7:
                c2 = 14;
                break;
            case 8:
                c2 = 15;
                break;
            default:
                c2 = 5;
                break;
        }
        return c[c2];
    }

    private final int e() {
        return this.a & 3;
    }

    private final int f() {
        return (this.a >> 2) & 3;
    }

    public final float c() {
        int e = e();
        if (e != 2) {
            return e != 3 ? 0.0f : 1.0f;
        }
        return -1.0f;
    }

    public final float d() {
        int f = f();
        if (f != 2) {
            return f != 3 ? 0.0f : 1.0f;
        }
        return -1.0f;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((alvk) obj).a;
    }

    public final int hashCode() {
        return this.a + 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        int f = f();
        if (f == 1) {
            sb.append("center");
        } else if (f == 2) {
            sb.append("top");
        } else if (f == 3) {
            sb.append("bottom");
        } else {
            sb.append("V-invalid=");
            sb.append(f());
        }
        int e = e();
        if (e != 1) {
            if (e == 2) {
                sb.append(" left");
            } else if (e == 3) {
                sb.append(" right");
            } else {
                sb.append(" H-invalid=");
                sb.append(e());
            }
        } else if (f() != 1) {
            sb.append(" center");
        }
        sb.append("}");
        return sb.toString();
    }
}
