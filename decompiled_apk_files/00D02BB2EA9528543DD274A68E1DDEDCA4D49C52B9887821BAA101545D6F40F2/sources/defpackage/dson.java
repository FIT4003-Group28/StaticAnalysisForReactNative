package defpackage;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dson  reason: default package */
/* loaded from: classes6.dex */
final class dson extends dsoo {
    private final byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;

    public dson(ByteBuffer byteBuffer) {
        this.a = byteBuffer.array();
        this.b = byteBuffer.arrayOffset() + byteBuffer.position();
        this.c = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    private final boolean V() {
        return this.b == this.c;
    }

    private final <T> T W(dstc<T> dstcVar, dsqa dsqaVar) {
        int Z = Z();
        ah(Z);
        int i = this.c;
        int i2 = this.b + Z;
        this.c = i2;
        try {
            T a = dstcVar.a();
            dstcVar.f(a, this, dsqaVar);
            dstcVar.j(a);
            if (this.b == i2) {
                return a;
            }
            throw dsrm.i();
        } finally {
            this.c = i;
        }
    }

    private final <T> T X(dstc<T> dstcVar, dsqa dsqaVar) {
        int i = this.e;
        this.e = dsut.c(dsut.b(this.d), 4);
        try {
            T a = dstcVar.a();
            dstcVar.f(a, this, dsqaVar);
            dstcVar.j(a);
            if (this.d == this.e) {
                return a;
            }
            throw dsrm.i();
        } finally {
            this.e = i;
        }
    }

    private final Object Y(dsur dsurVar, Class<?> cls, dsqa dsqaVar) {
        dsur dsurVar2 = dsur.DOUBLE;
        switch (dsurVar.ordinal()) {
            case 0:
                return Double.valueOf(d());
            case 1:
                return Float.valueOf(e());
            case 2:
                return Long.valueOf(g());
            case 3:
                return Long.valueOf(f());
            case 4:
                return Integer.valueOf(h());
            case 5:
                return Long.valueOf(i());
            case 6:
                return Integer.valueOf(j());
            case 7:
                return Boolean.valueOf(k());
            case 8:
                return m();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return o(cls, dsqaVar);
            case 11:
                return s();
            case 12:
                return Integer.valueOf(t());
            case 13:
                return Integer.valueOf(u());
            case 14:
                return Integer.valueOf(v());
            case 15:
                return Long.valueOf(w());
            case 16:
                return Integer.valueOf(x());
            case 17:
                return Long.valueOf(y());
        }
    }

    private final int Z() {
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
                return (int) aa();
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
                                                    throw dsrm.c();
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
        throw dsrm.a();
    }

    private final long aa() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte ab = ab();
            j |= (ab & Byte.MAX_VALUE) << i;
            if ((ab & 128) == 0) {
                return j;
            }
        }
        throw dsrm.c();
    }

    private final byte ab() {
        int i = this.b;
        if (i != this.c) {
            byte[] bArr = this.a;
            this.b = i + 1;
            return bArr[i];
        }
        throw dsrm.a();
    }

    private final int ac() {
        ah(4);
        return ae();
    }

    private final long ad() {
        ah(8);
        return af();
    }

    private final int ae() {
        int i = this.b;
        byte[] bArr = this.a;
        this.b = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long af() {
        int i = this.b;
        byte[] bArr = this.a;
        this.b = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    private final void ag(int i) {
        ah(i);
        this.b += i;
    }

    private final void ah(int i) {
        if (i < 0 || i > this.c - this.b) {
            throw dsrm.a();
        }
    }

    private final void ai(int i) {
        if (dsut.a(this.d) == i) {
            return;
        }
        throw dsrm.f();
    }

    private final void aj(int i) {
        ah(i);
        if ((i & 7) == 0) {
            return;
        }
        throw dsrm.i();
    }

    private final void ak(int i) {
        ah(i);
        if ((i & 3) == 0) {
            return;
        }
        throw dsrm.i();
    }

    private final void al(int i) {
        if (this.b == i) {
            return;
        }
        throw dsrm.a();
    }

    @Override // defpackage.dssw
    public final void A(List<Float> list) {
        int i;
        int i2;
        if (!(list instanceof dsqk)) {
            int a = dsut.a(this.d);
            if (a == 2) {
                int Z = Z();
                ak(Z);
                int i3 = this.b + Z;
                while (this.b < i3) {
                    list.add(Float.valueOf(Float.intBitsToFloat(ae())));
                }
                return;
            } else if (a == 5) {
                do {
                    list.add(Float.valueOf(e()));
                    if (V()) {
                        return;
                    }
                    i = this.b;
                } while (Z() == this.d);
                this.b = i;
                return;
            } else {
                throw dsrm.f();
            }
        }
        dsqk dsqkVar = (dsqk) list;
        int a2 = dsut.a(this.d);
        if (a2 == 2) {
            int Z2 = Z();
            ak(Z2);
            int i4 = this.b + Z2;
            while (this.b < i4) {
                dsqkVar.g(Float.intBitsToFloat(ae()));
            }
        } else if (a2 == 5) {
            do {
                dsqkVar.g(e());
                if (V()) {
                    return;
                }
                i2 = this.b;
            } while (Z() == this.d);
            this.b = i2;
        } else {
            throw dsrm.f();
        }
    }

    @Override // defpackage.dssw
    public final void B(List<Long> list) {
        int i;
        int i2;
        if (list instanceof dsrx) {
            dsrx dsrxVar = (dsrx) list;
            int a = dsut.a(this.d);
            if (a == 0) {
                do {
                    dsrxVar.d(f());
                    if (V()) {
                        return;
                    }
                    i2 = this.b;
                } while (Z() == this.d);
                this.b = i2;
                return;
            } else if (a == 2) {
                int Z = this.b + Z();
                while (this.b < Z) {
                    dsrxVar.d(U());
                }
                al(Z);
                return;
            } else {
                throw dsrm.f();
            }
        }
        int a2 = dsut.a(this.d);
        if (a2 == 0) {
            do {
                list.add(Long.valueOf(f()));
                if (V()) {
                    return;
                }
                i = this.b;
            } while (Z() == this.d);
            this.b = i;
        } else if (a2 == 2) {
            int Z2 = this.b + Z();
            while (this.b < Z2) {
                list.add(Long.valueOf(U()));
            }
            al(Z2);
        } else {
            throw dsrm.f();
        }
    }

    @Override // defpackage.dssw
    public final void C(List<Long> list) {
        int i;
        int i2;
        if (list instanceof dsrx) {
            dsrx dsrxVar = (dsrx) list;
            int a = dsut.a(this.d);
            if (a == 0) {
                do {
                    dsrxVar.d(g());
                    if (V()) {
                        return;
                    }
                    i2 = this.b;
                } while (Z() == this.d);
                this.b = i2;
                return;
            } else if (a == 2) {
                int Z = this.b + Z();
                while (this.b < Z) {
                    dsrxVar.d(U());
                }
                al(Z);
                return;
            } else {
                throw dsrm.f();
            }
        }
        int a2 = dsut.a(this.d);
        if (a2 == 0) {
            do {
                list.add(Long.valueOf(g()));
                if (V()) {
                    return;
                }
                i = this.b;
            } while (Z() == this.d);
            this.b = i;
        } else if (a2 == 2) {
            int Z2 = this.b + Z();
            while (this.b < Z2) {
                list.add(Long.valueOf(U()));
            }
            al(Z2);
        } else {
            throw dsrm.f();
        }
    }

    @Override // defpackage.dssw
    public final void D(List<Integer> list) {
        int i;
        int i2;
        if (list instanceof dsqz) {
            dsqz dsqzVar = (dsqz) list;
            int a = dsut.a(this.d);
            if (a == 0) {
                do {
                    dsqzVar.h(h());
                    if (V()) {
                        return;
                    }
                    i2 = this.b;
                } while (Z() == this.d);
                this.b = i2;
                return;
            } else if (a == 2) {
                int Z = this.b + Z();
                while (this.b < Z) {
                    dsqzVar.h(Z());
                }
                al(Z);
                return;
            } else {
                throw dsrm.f();
            }
        }
        int a2 = dsut.a(this.d);
        if (a2 == 0) {
            do {
                list.add(Integer.valueOf(h()));
                if (V()) {
                    return;
                }
                i = this.b;
            } while (Z() == this.d);
            this.b = i;
        } else if (a2 == 2) {
            int Z2 = this.b + Z();
            while (this.b < Z2) {
                list.add(Integer.valueOf(Z()));
            }
            al(Z2);
        } else {
            throw dsrm.f();
        }
    }

    @Override // defpackage.dssw
    public final void E(List<Long> list) {
        int i;
        int i2;
        if (list instanceof dsrx) {
            dsrx dsrxVar = (dsrx) list;
            int a = dsut.a(this.d);
            if (a == 1) {
                do {
                    dsrxVar.d(i());
                    if (V()) {
                        return;
                    }
                    i2 = this.b;
                } while (Z() == this.d);
                this.b = i2;
                return;
            } else if (a == 2) {
                int Z = Z();
                aj(Z);
                int i3 = this.b + Z;
                while (this.b < i3) {
                    dsrxVar.d(af());
                }
                return;
            } else {
                throw dsrm.f();
            }
        }
        int a2 = dsut.a(this.d);
        if (a2 == 1) {
            do {
                list.add(Long.valueOf(i()));
                if (V()) {
                    return;
                }
                i = this.b;
            } while (Z() == this.d);
            this.b = i;
        } else if (a2 == 2) {
            int Z2 = Z();
            aj(Z2);
            int i4 = this.b + Z2;
            while (this.b < i4) {
                list.add(Long.valueOf(af()));
            }
        } else {
            throw dsrm.f();
        }
    }

    @Override // defpackage.dssw
    public final void F(List<Integer> list) {
        int i;
        int i2;
        if (!(list instanceof dsqz)) {
            int a = dsut.a(this.d);
            if (a == 2) {
                int Z = Z();
                ak(Z);
                int i3 = this.b + Z;
                while (this.b < i3) {
                    list.add(Integer.valueOf(ae()));
                }
                return;
            } else if (a == 5) {
                do {
                    list.add(Integer.valueOf(j()));
                    if (V()) {
                        return;
                    }
                    i = this.b;
                } while (Z() == this.d);
                this.b = i;
                return;
            } else {
                throw dsrm.f();
            }
        }
        dsqz dsqzVar = (dsqz) list;
        int a2 = dsut.a(this.d);
        if (a2 == 2) {
            int Z2 = Z();
            ak(Z2);
            int i4 = this.b + Z2;
            while (this.b < i4) {
                dsqzVar.h(ae());
            }
        } else if (a2 == 5) {
            do {
                dsqzVar.h(j());
                if (V()) {
                    return;
                }
                i2 = this.b;
            } while (Z() == this.d);
            this.b = i2;
        } else {
            throw dsrm.f();
        }
    }

    @Override // defpackage.dssw
    public final void G(List<Boolean> list) {
        int i;
        int i2;
        if (list instanceof dsoq) {
            dsoq dsoqVar = (dsoq) list;
            int a = dsut.a(this.d);
            if (a != 0) {
                if (a == 2) {
                    int Z = this.b + Z();
                    while (this.b < Z) {
                        dsoqVar.d(Z() != 0);
                    }
                    al(Z);
                    return;
                }
                throw dsrm.f();
            }
            do {
                dsoqVar.d(k());
                if (V()) {
                    return;
                }
                i2 = this.b;
            } while (Z() == this.d);
            this.b = i2;
            return;
        }
        int a2 = dsut.a(this.d);
        if (a2 != 0) {
            if (a2 == 2) {
                int Z2 = this.b + Z();
                while (this.b < Z2) {
                    list.add(Boolean.valueOf(Z() != 0));
                }
                al(Z2);
                return;
            }
            throw dsrm.f();
        }
        do {
            list.add(Boolean.valueOf(k()));
            if (V()) {
                return;
            }
            i = this.b;
        } while (Z() == this.d);
        this.b = i;
    }

    @Override // defpackage.dssw
    public final void H(List<String> list) {
        J(list, false);
    }

    @Override // defpackage.dssw
    public final void I(List<String> list) {
        J(list, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dssw
    public final <T> void K(List<T> list, dstc<T> dstcVar, dsqa dsqaVar) {
        int i;
        if (dsut.a(this.d) == 2) {
            int i2 = this.d;
            do {
                list.add(W(dstcVar, dsqaVar));
                if (V()) {
                    return;
                }
                i = this.b;
            } while (Z() == i2);
            this.b = i;
            return;
        }
        throw dsrm.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dssw
    public final <T> void L(List<T> list, dstc<T> dstcVar, dsqa dsqaVar) {
        int i;
        if (dsut.a(this.d) == 3) {
            int i2 = this.d;
            do {
                list.add(X(dstcVar, dsqaVar));
                if (V()) {
                    return;
                }
                i = this.b;
            } while (Z() == i2);
            this.b = i;
            return;
        }
        throw dsrm.f();
    }

    @Override // defpackage.dssw
    public final void M(List<dspd> list) {
        int i;
        if (dsut.a(this.d) == 2) {
            do {
                list.add(s());
                if (V()) {
                    return;
                }
                i = this.b;
            } while (Z() == this.d);
            this.b = i;
            return;
        }
        throw dsrm.f();
    }

    @Override // defpackage.dssw
    public final void N(List<Integer> list) {
        int i;
        int i2;
        if (list instanceof dsqz) {
            dsqz dsqzVar = (dsqz) list;
            int a = dsut.a(this.d);
            if (a != 0) {
                if (a == 2) {
                    int Z = this.b + Z();
                    while (this.b < Z) {
                        dsqzVar.h(Z());
                    }
                    return;
                }
                throw dsrm.f();
            }
            do {
                dsqzVar.h(t());
                if (V()) {
                    return;
                }
                i2 = this.b;
            } while (Z() == this.d);
            this.b = i2;
            return;
        }
        int a2 = dsut.a(this.d);
        if (a2 != 0) {
            if (a2 == 2) {
                int Z2 = this.b + Z();
                while (this.b < Z2) {
                    list.add(Integer.valueOf(Z()));
                }
                return;
            }
            throw dsrm.f();
        }
        do {
            list.add(Integer.valueOf(t()));
            if (V()) {
                return;
            }
            i = this.b;
        } while (Z() == this.d);
        this.b = i;
    }

    @Override // defpackage.dssw
    public final void O(List<Integer> list) {
        int i;
        int i2;
        if (list instanceof dsqz) {
            dsqz dsqzVar = (dsqz) list;
            int a = dsut.a(this.d);
            if (a != 0) {
                if (a == 2) {
                    int Z = this.b + Z();
                    while (this.b < Z) {
                        dsqzVar.h(Z());
                    }
                    return;
                }
                throw dsrm.f();
            }
            do {
                dsqzVar.h(u());
                if (V()) {
                    return;
                }
                i2 = this.b;
            } while (Z() == this.d);
            this.b = i2;
            return;
        }
        int a2 = dsut.a(this.d);
        if (a2 != 0) {
            if (a2 == 2) {
                int Z2 = this.b + Z();
                while (this.b < Z2) {
                    list.add(Integer.valueOf(Z()));
                }
                return;
            }
            throw dsrm.f();
        }
        do {
            list.add(Integer.valueOf(u()));
            if (V()) {
                return;
            }
            i = this.b;
        } while (Z() == this.d);
        this.b = i;
    }

    @Override // defpackage.dssw
    public final void P(List<Integer> list) {
        int i;
        int i2;
        if (!(list instanceof dsqz)) {
            int a = dsut.a(this.d);
            if (a == 2) {
                int Z = Z();
                ak(Z);
                int i3 = this.b + Z;
                while (this.b < i3) {
                    list.add(Integer.valueOf(ae()));
                }
                return;
            } else if (a == 5) {
                do {
                    list.add(Integer.valueOf(v()));
                    if (V()) {
                        return;
                    }
                    i = this.b;
                } while (Z() == this.d);
                this.b = i;
                return;
            } else {
                throw dsrm.f();
            }
        }
        dsqz dsqzVar = (dsqz) list;
        int a2 = dsut.a(this.d);
        if (a2 == 2) {
            int Z2 = Z();
            ak(Z2);
            int i4 = this.b + Z2;
            while (this.b < i4) {
                dsqzVar.h(ae());
            }
        } else if (a2 == 5) {
            do {
                dsqzVar.h(v());
                if (V()) {
                    return;
                }
                i2 = this.b;
            } while (Z() == this.d);
            this.b = i2;
        } else {
            throw dsrm.f();
        }
    }

    @Override // defpackage.dssw
    public final void Q(List<Long> list) {
        int i;
        int i2;
        if (list instanceof dsrx) {
            dsrx dsrxVar = (dsrx) list;
            int a = dsut.a(this.d);
            if (a == 1) {
                do {
                    dsrxVar.d(w());
                    if (V()) {
                        return;
                    }
                    i2 = this.b;
                } while (Z() == this.d);
                this.b = i2;
                return;
            } else if (a == 2) {
                int Z = Z();
                aj(Z);
                int i3 = this.b + Z;
                while (this.b < i3) {
                    dsrxVar.d(af());
                }
                return;
            } else {
                throw dsrm.f();
            }
        }
        int a2 = dsut.a(this.d);
        if (a2 == 1) {
            do {
                list.add(Long.valueOf(w()));
                if (V()) {
                    return;
                }
                i = this.b;
            } while (Z() == this.d);
            this.b = i;
        } else if (a2 == 2) {
            int Z2 = Z();
            aj(Z2);
            int i4 = this.b + Z2;
            while (this.b < i4) {
                list.add(Long.valueOf(af()));
            }
        } else {
            throw dsrm.f();
        }
    }

    @Override // defpackage.dssw
    public final void R(List<Integer> list) {
        int i;
        int i2;
        if (list instanceof dsqz) {
            dsqz dsqzVar = (dsqz) list;
            int a = dsut.a(this.d);
            if (a != 0) {
                if (a == 2) {
                    int Z = this.b + Z();
                    while (this.b < Z) {
                        dsqzVar.h(dspj.L(Z()));
                    }
                    return;
                }
                throw dsrm.f();
            }
            do {
                dsqzVar.h(x());
                if (V()) {
                    return;
                }
                i2 = this.b;
            } while (Z() == this.d);
            this.b = i2;
            return;
        }
        int a2 = dsut.a(this.d);
        if (a2 != 0) {
            if (a2 == 2) {
                int Z2 = this.b + Z();
                while (this.b < Z2) {
                    list.add(Integer.valueOf(dspj.L(Z())));
                }
                return;
            }
            throw dsrm.f();
        }
        do {
            list.add(Integer.valueOf(x()));
            if (V()) {
                return;
            }
            i = this.b;
        } while (Z() == this.d);
        this.b = i;
    }

    @Override // defpackage.dssw
    public final void S(List<Long> list) {
        int i;
        int i2;
        if (list instanceof dsrx) {
            dsrx dsrxVar = (dsrx) list;
            int a = dsut.a(this.d);
            if (a != 0) {
                if (a == 2) {
                    int Z = this.b + Z();
                    while (this.b < Z) {
                        dsrxVar.d(dspj.M(U()));
                    }
                    return;
                }
                throw dsrm.f();
            }
            do {
                dsrxVar.d(y());
                if (V()) {
                    return;
                }
                i2 = this.b;
            } while (Z() == this.d);
            this.b = i2;
            return;
        }
        int a2 = dsut.a(this.d);
        if (a2 != 0) {
            if (a2 == 2) {
                int Z2 = this.b + Z();
                while (this.b < Z2) {
                    list.add(Long.valueOf(dspj.M(U())));
                }
                return;
            }
            throw dsrm.f();
        }
        do {
            list.add(Long.valueOf(y()));
            if (V()) {
                return;
            }
            i = this.b;
        } while (Z() == this.d);
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dssw
    public final <K, V> void T(Map<K, V> map, dssb<K, V> dssbVar, dsqa dsqaVar) {
        ai(2);
        int Z = Z();
        ah(Z);
        int i = this.c;
        this.c = this.b + Z;
        try {
            Object obj = dssbVar.b;
            Object obj2 = dssbVar.d;
            while (true) {
                int a = a();
                if (a == Integer.MAX_VALUE) {
                    map.put(obj, obj2);
                    return;
                } else if (a == 1) {
                    obj = Y(dssbVar.a, null, null);
                } else if (a == 2) {
                    obj2 = Y(dssbVar.c, dssbVar.d.getClass(), dsqaVar);
                } else {
                    try {
                        if (!c()) {
                            throw new dsrm("Unable to parse map entry.");
                            break;
                        }
                    } catch (dsrl unused) {
                        if (!c()) {
                            throw new dsrm("Unable to parse map entry.");
                        }
                    }
                }
            }
        } finally {
            this.c = i;
        }
    }

    public final long U() {
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
                return aa();
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
                                                throw dsrm.c();
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
        throw dsrm.a();
    }

    @Override // defpackage.dssw
    public final int a() {
        if (V()) {
            return Integer.MAX_VALUE;
        }
        int Z = Z();
        this.d = Z;
        if (Z != this.e) {
            return dsut.b(Z);
        }
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.dssw
    public final int b() {
        return this.d;
    }

    @Override // defpackage.dssw
    public final double d() {
        ai(1);
        return Double.longBitsToDouble(ad());
    }

    @Override // defpackage.dssw
    public final float e() {
        ai(5);
        return Float.intBitsToFloat(ac());
    }

    @Override // defpackage.dssw
    public final long f() {
        ai(0);
        return U();
    }

    @Override // defpackage.dssw
    public final long g() {
        ai(0);
        return U();
    }

    @Override // defpackage.dssw
    public final int h() {
        ai(0);
        return Z();
    }

    @Override // defpackage.dssw
    public final long i() {
        ai(1);
        return ad();
    }

    @Override // defpackage.dssw
    public final int j() {
        ai(5);
        return ac();
    }

    @Override // defpackage.dssw
    public final boolean k() {
        ai(0);
        return Z() != 0;
    }

    @Override // defpackage.dssw
    public final String l() {
        return n(false);
    }

    @Override // defpackage.dssw
    public final String m() {
        return n(true);
    }

    public final String n(boolean z) {
        ai(2);
        int Z = Z();
        if (Z == 0) {
            return "";
        }
        ah(Z);
        if (z) {
            byte[] bArr = this.a;
            int i = this.b;
            if (!dsuo.a(bArr, i, i + Z)) {
                throw dsrm.j();
            }
        }
        String str = new String(this.a, this.b, Z, dsrk.a);
        this.b += Z;
        return str;
    }

    @Override // defpackage.dssw
    public final <T> T o(Class<T> cls, dsqa dsqaVar) {
        ai(2);
        return (T) W(dsst.a.a(cls), dsqaVar);
    }

    @Override // defpackage.dssw
    public final <T> T p(dstc<T> dstcVar, dsqa dsqaVar) {
        ai(2);
        return (T) W(dstcVar, dsqaVar);
    }

    @Override // defpackage.dssw
    public final <T> T q(Class<T> cls, dsqa dsqaVar) {
        ai(3);
        return (T) X(dsst.a.a(cls), dsqaVar);
    }

    @Override // defpackage.dssw
    public final <T> T r(dstc<T> dstcVar, dsqa dsqaVar) {
        ai(3);
        return (T) X(dstcVar, dsqaVar);
    }

    @Override // defpackage.dssw
    public final dspd s() {
        ai(2);
        int Z = Z();
        if (Z == 0) {
            return dspd.b;
        }
        ah(Z);
        dspd z = dspd.z(this.a, this.b, Z);
        this.b += Z;
        return z;
    }

    @Override // defpackage.dssw
    public final int t() {
        ai(0);
        return Z();
    }

    @Override // defpackage.dssw
    public final int u() {
        ai(0);
        return Z();
    }

    @Override // defpackage.dssw
    public final int v() {
        ai(5);
        return ac();
    }

    @Override // defpackage.dssw
    public final long w() {
        ai(1);
        return ad();
    }

    @Override // defpackage.dssw
    public final int x() {
        ai(0);
        return dspj.L(Z());
    }

    @Override // defpackage.dssw
    public final long y() {
        ai(0);
        return dspj.M(U());
    }

    @Override // defpackage.dssw
    public final void z(List<Double> list) {
        int i;
        int i2;
        if (list instanceof dspr) {
            dspr dsprVar = (dspr) list;
            int a = dsut.a(this.d);
            if (a == 1) {
                do {
                    dsprVar.f(d());
                    if (V()) {
                        return;
                    }
                    i2 = this.b;
                } while (Z() == this.d);
                this.b = i2;
                return;
            } else if (a == 2) {
                int Z = Z();
                aj(Z);
                int i3 = this.b + Z;
                while (this.b < i3) {
                    dsprVar.f(Double.longBitsToDouble(af()));
                }
                return;
            } else {
                throw dsrm.f();
            }
        }
        int a2 = dsut.a(this.d);
        if (a2 == 1) {
            do {
                list.add(Double.valueOf(d()));
                if (V()) {
                    return;
                }
                i = this.b;
            } while (Z() == this.d);
            this.b = i;
        } else if (a2 == 2) {
            int Z2 = Z();
            aj(Z2);
            int i4 = this.b + Z2;
            while (this.b < i4) {
                list.add(Double.valueOf(Double.longBitsToDouble(af())));
            }
        } else {
            throw dsrm.f();
        }
    }

    public final void J(List<String> list, boolean z) {
        int i;
        int i2;
        if (dsut.a(this.d) != 2) {
            throw dsrm.f();
        }
        if (!(list instanceof dsrt) || z) {
            do {
                list.add(n(z));
                if (V()) {
                    return;
                }
                i = this.b;
            } while (Z() == this.d);
            this.b = i;
            return;
        }
        dsrt dsrtVar = (dsrt) list;
        do {
            dsrtVar.f(s());
            if (V()) {
                return;
            }
            i2 = this.b;
        } while (Z() == this.d);
        this.b = i2;
    }

    @Override // defpackage.dssw
    public final boolean c() {
        int i;
        if (V() || (i = this.d) == this.e) {
            return false;
        }
        int a = dsut.a(i);
        if (a == 0) {
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
                if (ab() >= 0) {
                    return true;
                }
            }
            throw dsrm.c();
        } else if (a == 1) {
            ag(8);
            return true;
        } else if (a == 2) {
            ag(Z());
            return true;
        } else if (a == 3) {
            int i7 = this.e;
            this.e = dsut.c(dsut.b(this.d), 4);
            while (a() != Integer.MAX_VALUE && c()) {
            }
            if (this.d != this.e) {
                throw dsrm.i();
            }
            this.e = i7;
            return true;
        } else {
            if (a == 5) {
                ag(4);
                return true;
            }
            throw dsrm.f();
        }
    }
}
