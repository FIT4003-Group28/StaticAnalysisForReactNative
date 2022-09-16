package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: aodt  reason: default package */
/* loaded from: classes.dex */
public class aodt {
    public int a;
    public ByteBuffer b;
    aodu c = aodu.d();
    private int d;
    private int e;

    static {
        new aods();
    }

    public static int L(aodq aodqVar, int i, int i2, int i3, int i4) {
        aodqVar.p(4);
        aodqVar.u(3, i4);
        aodqVar.u(2, i3);
        aodqVar.u(1, i2);
        aodqVar.u(0, i);
        return aodqVar.c();
    }

    public static int R(aodq aodqVar, int i, int i2, int i3) {
        aodqVar.p(3);
        aodqVar.t(2, i3);
        aodqVar.u(1, i2);
        aodqVar.t(0, i);
        return aodqVar.c();
    }

    public static aodt aB(ByteBuffer byteBuffer) {
        aodt aodtVar = new aodt();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        aodtVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return aodtVar;
    }

    public static void aF(ByteBuffer byteBuffer, aodt aodtVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        aodtVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static aodt au(ByteBuffer byteBuffer) {
        aodt aodtVar = new aodt();
        aF(byteBuffer, aodtVar);
        return aodtVar;
    }

    public static aodt ay(ByteBuffer byteBuffer) {
        aodt aodtVar = new aodt();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        aodtVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return aodtVar;
    }

    public static int o(aodq aodqVar, long j, long j2, int i, int i2) {
        aodqVar.p(4);
        aodqVar.t(3, i2);
        aodqVar.u(2, i);
        aodqVar.t(1, (int) j2);
        aodqVar.t(0, (int) j);
        return aodqVar.c();
    }

    public final aodr A() {
        return B(new aodr());
    }

    public final aodr B(aodr aodrVar) {
        int b = b(6);
        if (b != 0) {
            aodrVar.a(b + this.a, this.b);
            return aodrVar;
        }
        return null;
    }

    public final aodr C() {
        return D(new aodr());
    }

    public final aodr D(aodr aodrVar) {
        int b = b(10);
        if (b != 0) {
            aodrVar.a(b + this.a, this.b);
            return aodrVar;
        }
        return null;
    }

    public final aodr E() {
        return F(new aodr());
    }

    public final aodr F(aodr aodrVar) {
        int b = b(12);
        if (b != 0) {
            aodrVar.a(b + this.a, this.b);
            return aodrVar;
        }
        return null;
    }

    public final aodr G() {
        return H(new aodr());
    }

    public final aodr H(aodr aodrVar) {
        int b = b(4);
        if (b != 0) {
            aodrVar.a(b + this.a, this.b);
            return aodrVar;
        }
        return null;
    }

    public final aodr I() {
        return J(new aodr());
    }

    public final aodr J(aodr aodrVar) {
        int b = b(18);
        if (b != 0) {
            aodrVar.a(b + this.a, this.b);
            return aodrVar;
        }
        return null;
    }

    public final int K() {
        int b = b(8);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final String M() {
        int b = b(10);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }

    public final String N() {
        int b = b(6);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }

    public final String O() {
        int b = b(4);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }

    public final int P() {
        int b = b(4);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public int Q() {
        int b = b(6);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int S() {
        int b = b(6);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final int T() {
        int b = b(4);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int U() {
        int b = b(8);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final ByteBuffer V() {
        return i(6);
    }

    public final int W() {
        int b = b(4);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public String X() {
        int b = b(4);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }

    public final int Y() {
        int b = b(6);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int Z() {
        int b = b(12);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int a(int i) {
        return i + this.b.getInt(i);
    }

    public final aodt aA(aodt aodtVar, int i) {
        int b = b(4);
        if (b != 0) {
            aodtVar.f(a(c(b) + (i * 4)), this.b);
            return aodtVar;
        }
        return null;
    }

    public final aodt aC() {
        aodt aodtVar = new aodt();
        int b = b(8);
        if (b != 0) {
            aodtVar.f(a(b + this.a), this.b);
            return aodtVar;
        }
        return null;
    }

    public final aodr aD() {
        aodr aodrVar = new aodr();
        int b = b(6);
        if (b != 0) {
            aodrVar.a(b + this.a, this.b);
            return aodrVar;
        }
        return null;
    }

    public final aodr aE() {
        aodr aodrVar = new aodr();
        int b = b(4);
        if (b != 0) {
            aodrVar.a(b + this.a, this.b);
            return aodrVar;
        }
        return null;
    }

    public final int aa() {
        int b = b(4);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final axnb ab(int i) {
        return ac(new axnb(), i);
    }

    public final axnb ac(axnb axnbVar, int i) {
        int b = b(4);
        if (b != 0) {
            axnbVar.f(a(c(b) + (i * 4)), this.b);
            return axnbVar;
        }
        return null;
    }

    public final boolean ad() {
        int b = b(10);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final int ae() {
        int b = b(4);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final int af() {
        int b = b(6);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final boolean ag() {
        int b = b(18);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final boolean ah() {
        int b = b(8);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final boolean ai() {
        int b = b(10);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final boolean aj() {
        int b = b(16);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final boolean ak() {
        int b = b(14);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final boolean al() {
        int b = b(4);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final boolean am() {
        int b = b(6);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final boolean an() {
        int b = b(12);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final float ao() {
        int b = b(4);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }

    public final float ap(int i) {
        int b = b(8);
        if (b != 0) {
            return this.b.getFloat(c(b) + (i * 4));
        }
        return 0.0f;
    }

    public final int aq() {
        int b = b(8);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final aodt ar() {
        aodt aodtVar = new aodt();
        int b = b(8);
        if (b != 0) {
            aodtVar.f(a(b + this.a), this.b);
            return aodtVar;
        }
        return null;
    }

    public final aodt as() {
        aodt aodtVar = new aodt();
        int b = b(4);
        if (b != 0) {
            aodtVar.f(a(b + this.a), this.b);
            return aodtVar;
        }
        return null;
    }

    public final aodt at(int i) {
        aodt aodtVar = new aodt();
        int b = b(8);
        if (b != 0) {
            aodtVar.f(a(c(b) + (i * 4)), this.b);
            return aodtVar;
        }
        return null;
    }

    public final aodt av() {
        return aw(new aodt());
    }

    public final aodt aw(aodt aodtVar) {
        int b = b(4);
        if (b != 0) {
            aodtVar.f(a(b + this.a), this.b);
            return aodtVar;
        }
        return null;
    }

    public final aodt ax() {
        aodt aodtVar = new aodt();
        int b = b(6);
        if (b != 0) {
            aodtVar.f(a(b + this.a), this.b);
            return aodtVar;
        }
        return null;
    }

    public final aodt az(int i) {
        return aA(new aodt(), i);
    }

    public final int b(int i) {
        if (i < this.e) {
            return this.b.getShort(this.d + i);
        }
        return 0;
    }

    public final int c(int i) {
        int i2 = i + this.a;
        return i2 + this.b.getInt(i2) + 4;
    }

    public final int d(int i) {
        int i2 = i + this.a;
        return this.b.getInt(i2 + this.b.getInt(i2));
    }

    public final String e(int i) {
        ByteBuffer byteBuffer = this.b;
        aodu aoduVar = this.c;
        int i2 = i + byteBuffer.getInt(i);
        return aoduVar.b(byteBuffer, i2 + 4, byteBuffer.getInt(i2));
    }

    public final void f(int i, ByteBuffer byteBuffer) {
        short s;
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.d = i2;
            s = this.b.getShort(i2);
        } else {
            s = 0;
            this.a = 0;
            this.d = 0;
        }
        this.e = s;
    }

    public final int g() {
        int b = b(6);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int h() {
        int b = b(4);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final ByteBuffer i(int i) {
        int b = b(i);
        if (b == 0) {
            return null;
        }
        ByteBuffer order = this.b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int c = c(b);
        order.position(c);
        order.limit(c + d(b));
        return order;
    }

    public final float j() {
        int b = b(6);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }

    public final float k() {
        int b = b(4);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }

    public final String l() {
        int b = b(4);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }

    public String m() {
        int b = b(6);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }

    public int n() {
        int b = b(10);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public long p() {
        int b = b(6);
        if (b != 0) {
            return this.b.getInt(b + this.a) & 4294967295L;
        }
        return 0L;
    }

    public long q() {
        int b = b(4);
        if (b != 0) {
            return this.b.getInt(b + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final long r() {
        int b = b(8);
        if (b != 0) {
            return this.b.getInt(b + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final aodr s() {
        return t(new aodr());
    }

    public final aodr t(aodr aodrVar) {
        int b = b(20);
        if (b != 0) {
            aodrVar.a(b + this.a, this.b);
            return aodrVar;
        }
        return null;
    }

    public final aodr u() {
        return v(new aodr());
    }

    public final aodr v(aodr aodrVar) {
        int b = b(8);
        if (b != 0) {
            aodrVar.a(b + this.a, this.b);
            return aodrVar;
        }
        return null;
    }

    public final aodr w() {
        return x(new aodr());
    }

    public final aodr x(aodr aodrVar) {
        int b = b(14);
        if (b != 0) {
            aodrVar.a(b + this.a, this.b);
            return aodrVar;
        }
        return null;
    }

    public final aodr y() {
        return z(new aodr());
    }

    public final aodr z(aodr aodrVar) {
        int b = b(16);
        if (b != 0) {
            aodrVar.a(b + this.a, this.b);
            return aodrVar;
        }
        return null;
    }
}
