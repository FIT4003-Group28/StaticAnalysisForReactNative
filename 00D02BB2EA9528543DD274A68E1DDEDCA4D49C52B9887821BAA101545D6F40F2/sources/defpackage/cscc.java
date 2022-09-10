package defpackage;
/* compiled from: PG */
/* renamed from: cscc  reason: default package */
/* loaded from: classes5.dex */
public final class cscc {
    public static final int d(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 9:
            case 15:
            case 16:
                return 0;
            case 4:
            case 5:
                return 1;
            case 6:
                return 2;
            case 7:
                return 3;
            case 8:
                return 4;
            case 10:
            case 11:
            case 14:
                return 5;
            case 12:
                return 6;
            case 13:
                return 7;
            default:
                StringBuilder sb = new StringBuilder(21);
                sb.append("bad state ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public static final csbz a(int i) {
        switch (i) {
            case 0:
            case 5:
                return csbz.o;
            case 1:
            case 8:
                return csbz.b;
            case 2:
                return csbz.p;
            case 3:
                return csbz.s;
            case 4:
                return csbz.c;
            case 6:
                return csbz.A;
            case 7:
                return csbz.u;
            default:
                StringBuilder sb = new StringBuilder(28);
                sb.append("bad state group: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public static final csbz b(int i) {
        switch (i) {
            case 0:
            case 8:
                return csbz.b;
            case 1:
                return csbz.n;
            case 2:
                return csbz.r;
            case 3:
            case 7:
                return csbz.t;
            case 4:
                return csbz.e;
            case 5:
                return csbz.x;
            case 6:
                return csbz.C;
            default:
                StringBuilder sb = new StringBuilder(28);
                sb.append("bad state group: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public static final csbz c(int i) {
        switch (i) {
            case 0:
                return csbz.b;
            case 1:
                return csbz.f;
            case 2:
                return csbz.g;
            case 3:
                return csbz.i;
            case 4:
                return csbz.l;
            case 5:
                return csbz.m;
            case 6:
                return csbz.q;
            case 7:
            case 13:
                return csbz.v;
            case 8:
                return csbz.d;
            case 9:
                return csbz.k;
            case 10:
                return csbz.w;
            case 11:
                return csbz.y;
            case 12:
                return csbz.B;
            case 14:
                return csbz.z;
            case 15:
                return csbz.h;
            case 16:
                return csbz.j;
            default:
                StringBuilder sb = new StringBuilder(21);
                sb.append("bad state ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
