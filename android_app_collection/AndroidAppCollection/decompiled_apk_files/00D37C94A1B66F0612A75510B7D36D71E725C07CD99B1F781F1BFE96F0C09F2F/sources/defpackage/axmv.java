package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: axmv  reason: default package */
/* loaded from: classes2.dex */
public final class axmv extends aodt {
    public final int aG() {
        int b = b(10);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final ByteBuffer aH() {
        return i(14);
    }

    public final ByteBuffer aI() {
        return i(10);
    }

    public final boolean aJ() {
        int b = b(16);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final aodt aK() {
        aodt aodtVar = new aodt();
        int b = b(12);
        if (b != 0) {
            aodtVar.f(a(b + this.a), this.b);
            return aodtVar;
        }
        return null;
    }

    public final aodt aL() {
        aodt aodtVar = new aodt();
        int b = b(8);
        if (b != 0) {
            aodtVar.f(a(b + this.a), this.b);
            return aodtVar;
        }
        return null;
    }
}
