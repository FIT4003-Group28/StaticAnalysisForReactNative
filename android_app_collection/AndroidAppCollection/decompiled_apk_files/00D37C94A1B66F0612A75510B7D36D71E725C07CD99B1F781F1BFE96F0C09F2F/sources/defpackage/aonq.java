package defpackage;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aonq  reason: default package */
/* loaded from: classes.dex */
final class aonq implements aorh {
    private final byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;

    public aonq(ByteBuffer byteBuffer) {
        this.a = byteBuffer.array();
        this.b = byteBuffer.arrayOffset() + byteBuffer.position();
        this.c = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    private final byte V() {
        int i = this.b;
        if (i != this.c) {
            byte[] bArr = this.a;
            this.b = i + 1;
            return bArr[i];
        }
        throw aopx.j();
    }

    private final int W() {
        af(4);
        return X();
    }

    private final int X() {
        int i = this.b;
        byte[] bArr = this.a;
        this.b = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final int Y() {
        int i;
        int i2 = this.b;
        int i3 = this.c;
        if (i3 != i2) {
            byte[] bArr = this.a;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.b = i4;
                return b;
            } else if (i3 - i4 < 9) {
                return (int) ab();
            } else {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            byte b2 = bArr[i5];
                            i = (i9 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i5 = i7 + 1;
                                if (bArr[i7] < 0) {
                                    i7 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i7 + 1;
                                        if (bArr[i7] < 0) {
                                            i7 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i7 + 1;
                                                if (bArr[i7] < 0) {
                                                    throw aopx.e();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i5 = i7;
                }
                this.b = i5;
                return i;
            }
        }
        throw aopx.j();
    }

    private final long Z() {
        af(8);
        return aa();
    }

    private final long aa() {
        int i = this.b;
        byte[] bArr = this.a;
        this.b = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    private final long ab() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte V = V();
            j |= (V & Byte.MAX_VALUE) << i;
            if ((V & 128) == 0) {
                return j;
            }
        }
        throw aopx.e();
    }

    private final Object ac(aosj aosjVar, Class cls, aoos aoosVar) {
        aosj aosjVar2 = aosj.DOUBLE;
        switch (aosjVar.ordinal()) {
            case 0:
                return Double.valueOf(a());
            case 1:
                return Float.valueOf(b());
            case 2:
                return Long.valueOf(l());
            case 3:
                return Long.valueOf(o());
            case 4:
                return Integer.valueOf(g());
            case 5:
                return Long.valueOf(k());
            case 6:
                return Integer.valueOf(f());
            case 7:
                return Boolean.valueOf(T());
            case 8:
                return x();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return t(cls, aoosVar);
            case 11:
                return q();
            case 12:
                return Integer.valueOf(j());
            case 13:
                return Integer.valueOf(e());
            case 14:
                return Integer.valueOf(h());
            case 15:
                return Long.valueOf(m());
            case 16:
                return Integer.valueOf(i());
            case 17:
                return Long.valueOf(n());
        }
    }

    private final Object ad(aorm aormVar, aoos aoosVar) {
        int i = this.e;
        this.e = aosl.c(aosl.a(this.d), 4);
        try {
            Object e = aormVar.e();
            aormVar.h(e, this, aoosVar);
            aormVar.f(e);
            if (this.d == this.e) {
                return e;
            }
            throw aopx.g();
        } finally {
            this.e = i;
        }
    }

    private final Object ae(aorm aormVar, aoos aoosVar) {
        int Y = Y();
        af(Y);
        int i = this.c;
        int i2 = this.b + Y;
        this.c = i2;
        try {
            Object e = aormVar.e();
            aormVar.h(e, this, aoosVar);
            aormVar.f(e);
            if (this.b == i2) {
                return e;
            }
            throw aopx.g();
        } finally {
            this.c = i;
        }
    }

    private final void af(int i) {
        if (i < 0 || i > this.c - this.b) {
            throw aopx.j();
        }
    }

    private final void ag(int i) {
        if (this.b == i) {
            return;
        }
        throw aopx.j();
    }

    private final void ah(int i) {
        if (aosl.b(this.d) == i) {
            return;
        }
        throw aopx.a();
    }

    private final void ai(int i) {
        af(i);
        this.b += i;
    }

    private final void aj(int i) {
        af(i);
        if ((i & 3) == 0) {
            return;
        }
        throw aopx.g();
    }

    private final void ak(int i) {
        af(i);
        if ((i & 7) == 0) {
            return;
        }
        throw aopx.g();
    }

    private final boolean al() {
        return this.b == this.c;
    }

    @Override // defpackage.aorh
    public final void A(List list) {
        int i;
        int i2;
        if (list instanceof aoon) {
            aoon aoonVar = (aoon) list;
            int b = aosl.b(this.d);
            if (b == 1) {
                do {
                    aoonVar.f(a());
                    if (al()) {
                        return;
                    }
                    i2 = this.b;
                } while (Y() == this.d);
                this.b = i2;
                return;
            } else if (b == 2) {
                int Y = Y();
                ak(Y);
                int i3 = this.b + Y;
                while (this.b < i3) {
                    aoonVar.f(Double.longBitsToDouble(aa()));
                }
                return;
            } else {
                throw aopx.a();
            }
        }
        int b2 = aosl.b(this.d);
        if (b2 == 1) {
            do {
                list.add(Double.valueOf(a()));
                if (al()) {
                    return;
                }
                i = this.b;
            } while (Y() == this.d);
            this.b = i;
        } else if (b2 == 2) {
            int Y2 = Y();
            ak(Y2);
            int i4 = this.b + Y2;
            while (this.b < i4) {
                list.add(Double.valueOf(Double.longBitsToDouble(aa())));
            }
        } else {
            throw aopx.a();
        }
    }

    @Override // defpackage.aorh
    public final void B(List list) {
        int i;
        int i2;
        if (list instanceof aopj) {
            aopj aopjVar = (aopj) list;
            int b = aosl.b(this.d);
            if (b != 0) {
                if (b == 2) {
                    int Y = this.b + Y();
                    while (this.b < Y) {
                        aopjVar.g(Y());
                    }
                    return;
                }
                throw aopx.a();
            }
            do {
                aopjVar.g(e());
                if (al()) {
                    return;
                }
                i2 = this.b;
            } while (Y() == this.d);
            this.b = i2;
            return;
        }
        int b2 = aosl.b(this.d);
        if (b2 != 0) {
            if (b2 == 2) {
                int Y2 = this.b + Y();
                while (this.b < Y2) {
                    list.add(Integer.valueOf(Y()));
                }
                return;
            }
            throw aopx.a();
        }
        do {
            list.add(Integer.valueOf(e()));
            if (al()) {
                return;
            }
            i = this.b;
        } while (Y() == this.d);
        this.b = i;
    }

    @Override // defpackage.aorh
    public final void C(List list) {
        int i;
        int i2;
        if (!(list instanceof aopj)) {
            int b = aosl.b(this.d);
            if (b == 2) {
                int Y = Y();
                aj(Y);
                int i3 = this.b + Y;
                while (this.b < i3) {
                    list.add(Integer.valueOf(X()));
                }
                return;
            } else if (b == 5) {
                do {
                    list.add(Integer.valueOf(f()));
                    if (al()) {
                        return;
                    }
                    i = this.b;
                } while (Y() == this.d);
                this.b = i;
                return;
            } else {
                throw aopx.a();
            }
        }
        aopj aopjVar = (aopj) list;
        int b2 = aosl.b(this.d);
        if (b2 == 2) {
            int Y2 = Y();
            aj(Y2);
            int i4 = this.b + Y2;
            while (this.b < i4) {
                aopjVar.g(X());
            }
        } else if (b2 == 5) {
            do {
                aopjVar.g(f());
                if (al()) {
                    return;
                }
                i2 = this.b;
            } while (Y() == this.d);
            this.b = i2;
        } else {
            throw aopx.a();
        }
    }

    @Override // defpackage.aorh
    public final void D(List list) {
        int i;
        int i2;
        if (list instanceof aoqj) {
            aoqj aoqjVar = (aoqj) list;
            int b = aosl.b(this.d);
            if (b == 1) {
                do {
                    aoqjVar.f(k());
                    if (al()) {
                        return;
                    }
                    i2 = this.b;
                } while (Y() == this.d);
                this.b = i2;
                return;
            } else if (b == 2) {
                int Y = Y();
                ak(Y);
                int i3 = this.b + Y;
                while (this.b < i3) {
                    aoqjVar.f(aa());
                }
                return;
            } else {
                throw aopx.a();
            }
        }
        int b2 = aosl.b(this.d);
        if (b2 == 1) {
            do {
                list.add(Long.valueOf(k()));
                if (al()) {
                    return;
                }
                i = this.b;
            } while (Y() == this.d);
            this.b = i;
        } else if (b2 == 2) {
            int Y2 = Y();
            ak(Y2);
            int i4 = this.b + Y2;
            while (this.b < i4) {
                list.add(Long.valueOf(aa()));
            }
        } else {
            throw aopx.a();
        }
    }

    @Override // defpackage.aorh
    public final void E(List list) {
        int i;
        int i2;
        if (!(list instanceof aooy)) {
            int b = aosl.b(this.d);
            if (b == 2) {
                int Y = Y();
                aj(Y);
                int i3 = this.b + Y;
                while (this.b < i3) {
                    list.add(Float.valueOf(Float.intBitsToFloat(X())));
                }
                return;
            } else if (b == 5) {
                do {
                    list.add(Float.valueOf(b()));
                    if (al()) {
                        return;
                    }
                    i = this.b;
                } while (Y() == this.d);
                this.b = i;
                return;
            } else {
                throw aopx.a();
            }
        }
        aooy aooyVar = (aooy) list;
        int b2 = aosl.b(this.d);
        if (b2 == 2) {
            int Y2 = Y();
            aj(Y2);
            int i4 = this.b + Y2;
            while (this.b < i4) {
                aooyVar.h(Float.intBitsToFloat(X()));
            }
        } else if (b2 == 5) {
            do {
                aooyVar.h(b());
                if (al()) {
                    return;
                }
                i2 = this.b;
            } while (Y() == this.d);
            this.b = i2;
        } else {
            throw aopx.a();
        }
    }

    @Override // defpackage.aorh
    public final void F(List list, aorm aormVar, aoos aoosVar) {
        int i;
        if (aosl.b(this.d) == 3) {
            int i2 = this.d;
            do {
                list.add(ad(aormVar, aoosVar));
                if (al()) {
                    return;
                }
                i = this.b;
            } while (Y() == i2);
            this.b = i;
            return;
        }
        throw aopx.a();
    }

    @Override // defpackage.aorh
    public final void G(List list) {
        int i;
        int i2;
        if (list instanceof aopj) {
            aopj aopjVar = (aopj) list;
            int b = aosl.b(this.d);
            if (b == 0) {
                do {
                    aopjVar.g(g());
                    if (al()) {
                        return;
                    }
                    i2 = this.b;
                } while (Y() == this.d);
                this.b = i2;
                return;
            } else if (b == 2) {
                int Y = this.b + Y();
                while (this.b < Y) {
                    aopjVar.g(Y());
                }
                ag(Y);
                return;
            } else {
                throw aopx.a();
            }
        }
        int b2 = aosl.b(this.d);
        if (b2 == 0) {
            do {
                list.add(Integer.valueOf(g()));
                if (al()) {
                    return;
                }
                i = this.b;
            } while (Y() == this.d);
            this.b = i;
        } else if (b2 == 2) {
            int Y2 = this.b + Y();
            while (this.b < Y2) {
                list.add(Integer.valueOf(Y()));
            }
            ag(Y2);
        } else {
            throw aopx.a();
        }
    }

    @Override // defpackage.aorh
    public final void H(List list) {
        int i;
        int i2;
        if (list instanceof aoqj) {
            aoqj aoqjVar = (aoqj) list;
            int b = aosl.b(this.d);
            if (b == 0) {
                do {
                    aoqjVar.f(l());
                    if (al()) {
                        return;
                    }
                    i2 = this.b;
                } while (Y() == this.d);
                this.b = i2;
                return;
            } else if (b == 2) {
                int Y = this.b + Y();
                while (this.b < Y) {
                    aoqjVar.f(p());
                }
                ag(Y);
                return;
            } else {
                throw aopx.a();
            }
        }
        int b2 = aosl.b(this.d);
        if (b2 == 0) {
            do {
                list.add(Long.valueOf(l()));
                if (al()) {
                    return;
                }
                i = this.b;
            } while (Y() == this.d);
            this.b = i;
        } else if (b2 == 2) {
            int Y2 = this.b + Y();
            while (this.b < Y2) {
                list.add(Long.valueOf(p()));
            }
            ag(Y2);
        } else {
            throw aopx.a();
        }
    }

    @Override // defpackage.aorh
    public final void I(Map map, aoqn aoqnVar, aoos aoosVar) {
        ah(2);
        int Y = Y();
        af(Y);
        int i = this.c;
        this.c = this.b + Y;
        try {
            Object obj = aoqnVar.b;
            Object obj2 = aoqnVar.d;
            while (true) {
                int c = c();
                if (c == Integer.MAX_VALUE) {
                    map.put(obj, obj2);
                    return;
                } else if (c == 1) {
                    obj = ac(aoqnVar.a, null, null);
                } else if (c == 2) {
                    obj2 = ac(aoqnVar.c, aoqnVar.d.getClass(), aoosVar);
                } else {
                    try {
                        if (!U()) {
                            throw new aopx("Unable to parse map entry.");
                            break;
                        }
                    } catch (aopw unused) {
                        if (!U()) {
                            throw new aopx("Unable to parse map entry.");
                        }
                    }
                }
            }
        } finally {
            this.c = i;
        }
    }

    @Override // defpackage.aorh
    public final void J(List list, aorm aormVar, aoos aoosVar) {
        int i;
        if (aosl.b(this.d) == 2) {
            int i2 = this.d;
            do {
                list.add(ae(aormVar, aoosVar));
                if (al()) {
                    return;
                }
                i = this.b;
            } while (Y() == i2);
            this.b = i;
            return;
        }
        throw aopx.a();
    }

    @Override // defpackage.aorh
    public final void K(List list) {
        int i;
        int i2;
        if (!(list instanceof aopj)) {
            int b = aosl.b(this.d);
            if (b == 2) {
                int Y = Y();
                aj(Y);
                int i3 = this.b + Y;
                while (this.b < i3) {
                    list.add(Integer.valueOf(X()));
                }
                return;
            } else if (b == 5) {
                do {
                    list.add(Integer.valueOf(h()));
                    if (al()) {
                        return;
                    }
                    i = this.b;
                } while (Y() == this.d);
                this.b = i;
                return;
            } else {
                throw aopx.a();
            }
        }
        aopj aopjVar = (aopj) list;
        int b2 = aosl.b(this.d);
        if (b2 == 2) {
            int Y2 = Y();
            aj(Y2);
            int i4 = this.b + Y2;
            while (this.b < i4) {
                aopjVar.g(X());
            }
        } else if (b2 == 5) {
            do {
                aopjVar.g(h());
                if (al()) {
                    return;
                }
                i2 = this.b;
            } while (Y() == this.d);
            this.b = i2;
        } else {
            throw aopx.a();
        }
    }

    @Override // defpackage.aorh
    public final void L(List list) {
        int i;
        int i2;
        if (list instanceof aoqj) {
            aoqj aoqjVar = (aoqj) list;
            int b = aosl.b(this.d);
            if (b == 1) {
                do {
                    aoqjVar.f(m());
                    if (al()) {
                        return;
                    }
                    i2 = this.b;
                } while (Y() == this.d);
                this.b = i2;
                return;
            } else if (b == 2) {
                int Y = Y();
                ak(Y);
                int i3 = this.b + Y;
                while (this.b < i3) {
                    aoqjVar.f(aa());
                }
                return;
            } else {
                throw aopx.a();
            }
        }
        int b2 = aosl.b(this.d);
        if (b2 == 1) {
            do {
                list.add(Long.valueOf(m()));
                if (al()) {
                    return;
                }
                i = this.b;
            } while (Y() == this.d);
            this.b = i;
        } else if (b2 == 2) {
            int Y2 = Y();
            ak(Y2);
            int i4 = this.b + Y2;
            while (this.b < i4) {
                list.add(Long.valueOf(aa()));
            }
        } else {
            throw aopx.a();
        }
    }

    @Override // defpackage.aorh
    public final void M(List list) {
        int i;
        int i2;
        if (list instanceof aopj) {
            aopj aopjVar = (aopj) list;
            int b = aosl.b(this.d);
            if (b != 0) {
                if (b == 2) {
                    int Y = this.b + Y();
                    while (this.b < Y) {
                        aopjVar.g(aoog.J(Y()));
                    }
                    return;
                }
                throw aopx.a();
            }
            do {
                aopjVar.g(i());
                if (al()) {
                    return;
                }
                i2 = this.b;
            } while (Y() == this.d);
            this.b = i2;
            return;
        }
        int b2 = aosl.b(this.d);
        if (b2 != 0) {
            if (b2 == 2) {
                int Y2 = this.b + Y();
                while (this.b < Y2) {
                    list.add(Integer.valueOf(aoog.J(Y())));
                }
                return;
            }
            throw aopx.a();
        }
        do {
            list.add(Integer.valueOf(i()));
            if (al()) {
                return;
            }
            i = this.b;
        } while (Y() == this.d);
        this.b = i;
    }

    @Override // defpackage.aorh
    public final void N(List list) {
        int i;
        int i2;
        if (list instanceof aoqj) {
            aoqj aoqjVar = (aoqj) list;
            int b = aosl.b(this.d);
            if (b != 0) {
                if (b == 2) {
                    int Y = this.b + Y();
                    while (this.b < Y) {
                        aoqjVar.f(aoog.L(p()));
                    }
                    return;
                }
                throw aopx.a();
            }
            do {
                aoqjVar.f(n());
                if (al()) {
                    return;
                }
                i2 = this.b;
            } while (Y() == this.d);
            this.b = i2;
            return;
        }
        int b2 = aosl.b(this.d);
        if (b2 != 0) {
            if (b2 == 2) {
                int Y2 = this.b + Y();
                while (this.b < Y2) {
                    list.add(Long.valueOf(aoog.L(p())));
                }
                return;
            }
            throw aopx.a();
        }
        do {
            list.add(Long.valueOf(n()));
            if (al()) {
                return;
            }
            i = this.b;
        } while (Y() == this.d);
        this.b = i;
    }

    @Override // defpackage.aorh
    public final void O(List list) {
        P(list, false);
    }

    @Override // defpackage.aorh
    public final void Q(List list) {
        P(list, true);
    }

    @Override // defpackage.aorh
    public final void R(List list) {
        int i;
        int i2;
        if (list instanceof aopj) {
            aopj aopjVar = (aopj) list;
            int b = aosl.b(this.d);
            if (b != 0) {
                if (b == 2) {
                    int Y = this.b + Y();
                    while (this.b < Y) {
                        aopjVar.g(Y());
                    }
                    return;
                }
                throw aopx.a();
            }
            do {
                aopjVar.g(j());
                if (al()) {
                    return;
                }
                i2 = this.b;
            } while (Y() == this.d);
            this.b = i2;
            return;
        }
        int b2 = aosl.b(this.d);
        if (b2 != 0) {
            if (b2 == 2) {
                int Y2 = this.b + Y();
                while (this.b < Y2) {
                    list.add(Integer.valueOf(Y()));
                }
                return;
            }
            throw aopx.a();
        }
        do {
            list.add(Integer.valueOf(j()));
            if (al()) {
                return;
            }
            i = this.b;
        } while (Y() == this.d);
        this.b = i;
    }

    @Override // defpackage.aorh
    public final void S(List list) {
        int i;
        int i2;
        if (list instanceof aoqj) {
            aoqj aoqjVar = (aoqj) list;
            int b = aosl.b(this.d);
            if (b == 0) {
                do {
                    aoqjVar.f(o());
                    if (al()) {
                        return;
                    }
                    i2 = this.b;
                } while (Y() == this.d);
                this.b = i2;
                return;
            } else if (b == 2) {
                int Y = this.b + Y();
                while (this.b < Y) {
                    aoqjVar.f(p());
                }
                ag(Y);
                return;
            } else {
                throw aopx.a();
            }
        }
        int b2 = aosl.b(this.d);
        if (b2 == 0) {
            do {
                list.add(Long.valueOf(o()));
                if (al()) {
                    return;
                }
                i = this.b;
            } while (Y() == this.d);
            this.b = i;
        } else if (b2 == 2) {
            int Y2 = this.b + Y();
            while (this.b < Y2) {
                list.add(Long.valueOf(p()));
            }
            ag(Y2);
        } else {
            throw aopx.a();
        }
    }

    @Override // defpackage.aorh
    public final boolean T() {
        ah(0);
        return Y() != 0;
    }

    @Override // defpackage.aorh
    public final double a() {
        ah(1);
        return Double.longBitsToDouble(Z());
    }

    @Override // defpackage.aorh
    public final float b() {
        ah(5);
        return Float.intBitsToFloat(W());
    }

    @Override // defpackage.aorh
    public final int c() {
        if (al()) {
            return Integer.MAX_VALUE;
        }
        int Y = Y();
        this.d = Y;
        if (Y != this.e) {
            return aosl.a(Y);
        }
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.aorh
    public final int d() {
        return this.d;
    }

    @Override // defpackage.aorh
    public final int e() {
        ah(0);
        return Y();
    }

    @Override // defpackage.aorh
    public final int f() {
        ah(5);
        return W();
    }

    @Override // defpackage.aorh
    public final int g() {
        ah(0);
        return Y();
    }

    @Override // defpackage.aorh
    public final int h() {
        ah(5);
        return W();
    }

    @Override // defpackage.aorh
    public final int i() {
        ah(0);
        return aoog.J(Y());
    }

    @Override // defpackage.aorh
    public final int j() {
        ah(0);
        return Y();
    }

    @Override // defpackage.aorh
    public final long k() {
        ah(1);
        return Z();
    }

    @Override // defpackage.aorh
    public final long l() {
        ah(0);
        return p();
    }

    @Override // defpackage.aorh
    public final long m() {
        ah(1);
        return Z();
    }

    @Override // defpackage.aorh
    public final long n() {
        ah(0);
        return aoog.L(p());
    }

    @Override // defpackage.aorh
    public final long o() {
        ah(0);
        return p();
    }

    public final long p() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.b;
        int i3 = this.c;
        if (i3 != i2) {
            byte[] bArr = this.a;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.b = i4;
                return b;
            } else if (i3 - i4 < 9) {
                return ab();
            } else {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        j = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            long j5 = (bArr[i5] << 28) ^ i9;
                            if (j5 < 0) {
                                int i10 = i7 + 1;
                                long j6 = j5 ^ (bArr[i7] << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i7 = i10 + 1;
                                    j5 = j6 ^ (bArr[i10] << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i10 = i7 + 1;
                                        j6 = j5 ^ (bArr[i7] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i7 = i10 + 1;
                                            j = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                i10 = i7 + 1;
                                                if (bArr[i7] >= 0) {
                                                    j2 = j;
                                                    i5 = i10;
                                                    this.b = i5;
                                                    return j2;
                                                }
                                                throw aopx.e();
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                                this.b = i5;
                                return j2;
                            }
                            j4 = 266354560;
                            j = j5 ^ j4;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.b = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.b = i5;
                return j2;
            }
        }
        throw aopx.j();
    }

    @Override // defpackage.aorh
    public final aoob q() {
        ah(2);
        int Y = Y();
        if (Y == 0) {
            return aoob.b;
        }
        af(Y);
        aoob C = aoob.C(this.a, this.b, Y);
        this.b += Y;
        return C;
    }

    @Override // defpackage.aorh
    public final Object r(Class cls, aoos aoosVar) {
        ah(3);
        return ad(aore.a.a(cls), aoosVar);
    }

    @Override // defpackage.aorh
    public final Object s(aorm aormVar, aoos aoosVar) {
        ah(3);
        return ad(aormVar, aoosVar);
    }

    @Override // defpackage.aorh
    public final Object t(Class cls, aoos aoosVar) {
        ah(2);
        return ae(aore.a.a(cls), aoosVar);
    }

    @Override // defpackage.aorh
    public final Object u(aorm aormVar, aoos aoosVar) {
        ah(2);
        return ae(aormVar, aoosVar);
    }

    @Override // defpackage.aorh
    public final String v() {
        return w(false);
    }

    public final String w(boolean z) {
        ah(2);
        int Y = Y();
        if (Y == 0) {
            return "";
        }
        af(Y);
        if (z) {
            byte[] bArr = this.a;
            int i = this.b;
            if (!aosi.h(bArr, i, i + Y)) {
                throw aopx.d();
            }
        }
        String str = new String(this.a, this.b, Y, aopv.a);
        this.b += Y;
        return str;
    }

    @Override // defpackage.aorh
    public final String x() {
        return w(true);
    }

    @Override // defpackage.aorh
    public final void y(List list) {
        int i;
        int i2;
        if (list instanceof aons) {
            aons aonsVar = (aons) list;
            int b = aosl.b(this.d);
            if (b != 0) {
                if (b == 2) {
                    int Y = this.b + Y();
                    while (this.b < Y) {
                        aonsVar.f(Y() != 0);
                    }
                    ag(Y);
                    return;
                }
                throw aopx.a();
            }
            do {
                aonsVar.f(T());
                if (al()) {
                    return;
                }
                i2 = this.b;
            } while (Y() == this.d);
            this.b = i2;
            return;
        }
        int b2 = aosl.b(this.d);
        if (b2 != 0) {
            if (b2 == 2) {
                int Y2 = this.b + Y();
                while (this.b < Y2) {
                    list.add(Boolean.valueOf(Y() != 0));
                }
                ag(Y2);
                return;
            }
            throw aopx.a();
        }
        do {
            list.add(Boolean.valueOf(T()));
            if (al()) {
                return;
            }
            i = this.b;
        } while (Y() == this.d);
        this.b = i;
    }

    @Override // defpackage.aorh
    public final void z(List list) {
        int i;
        if (aosl.b(this.d) == 2) {
            do {
                list.add(q());
                if (al()) {
                    return;
                }
                i = this.b;
            } while (Y() == this.d);
            this.b = i;
            return;
        }
        throw aopx.a();
    }

    public final void P(List list, boolean z) {
        int i;
        int i2;
        if (aosl.b(this.d) != 2) {
            throw aopx.a();
        }
        if (!(list instanceof aoqf) || z) {
            do {
                list.add(w(z));
                if (al()) {
                    return;
                }
                i = this.b;
            } while (Y() == this.d);
            this.b = i;
            return;
        }
        aoqf aoqfVar = (aoqf) list;
        do {
            aoqfVar.i(q());
            if (al()) {
                return;
            }
            i2 = this.b;
        } while (Y() == this.d);
        this.b = i2;
    }

    public aonq() {
    }

    @Override // defpackage.aorh
    public final boolean U() {
        int i;
        if (al() || (i = this.d) == this.e) {
            return false;
        }
        int b = aosl.b(i);
        if (b == 0) {
            int i2 = this.c;
            int i3 = this.b;
            if (i2 - i3 >= 10) {
                byte[] bArr = this.a;
                int i4 = 0;
                while (i4 < 10) {
                    int i5 = i3 + 1;
                    if (bArr[i3] >= 0) {
                        this.b = i5;
                        break;
                    }
                    i4++;
                    i3 = i5;
                }
            }
            for (int i6 = 0; i6 < 10; i6++) {
                if (V() >= 0) {
                    return true;
                }
            }
            throw aopx.e();
        } else if (b == 1) {
            ai(8);
            return true;
        } else if (b == 2) {
            ai(Y());
            return true;
        } else if (b == 3) {
            int i7 = this.e;
            this.e = aosl.c(aosl.a(this.d), 4);
            while (c() != Integer.MAX_VALUE && U()) {
            }
            if (this.d != this.e) {
                throw aopx.g();
            }
            this.e = i7;
            return true;
        } else {
            if (b == 5) {
                ai(4);
                return true;
            }
            throw aopx.a();
        }
    }
}
