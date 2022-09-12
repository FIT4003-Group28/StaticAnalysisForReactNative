package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: amsz  reason: default package */
/* loaded from: classes2.dex */
public final class amsz implements Serializable {
    @dzsi
    public final amte a;
    public final int b;
    public final int c;
    public final amvi d;
    public final amvh[] e;
    public final dqvj f;
    @dzsi
    public final bvrt<dwao> g;

    public amsz(@dzsi amte amteVar, int i, int i2, amvi amviVar, amvh[] amvhVarArr, dqvj dqvjVar, @dzsi dwao dwaoVar) {
        this.a = amteVar;
        this.b = i;
        this.c = i2;
        this.e = amvhVarArr;
        this.f = dqvjVar;
        this.g = bvrt.a(dwaoVar);
        this.d = amviVar;
    }

    public static amsz a(amte amteVar, int i, int i2) {
        boolean z = true;
        dbsk.b(i >= 0 && i < amteVar.a.n(), "Active trip index is out of bounds");
        if (i2 < 0 || i2 > amteVar.c.length) {
            z = false;
        }
        dbsk.b(z, "Search target waypoint insertion index is out of bounds");
        dqvj c = amteVar.c(i);
        amvi amviVar = amvi.INSERT;
        amvh[] amvhVarArr = amteVar.c;
        if (c == null) {
            c = amteVar.b;
        }
        return new amsz(amteVar, i, i2, amviVar, amvhVarArr, c, amteVar.i());
    }

    public static amsz b(@dzsi amvh amvhVar, int i, dqvj dqvjVar, @dzsi dwao dwaoVar) {
        int i2;
        boolean z;
        if (i == 0) {
            i2 = i;
            z = true;
        } else if (i == 1) {
            z = amvhVar != null;
            i2 = 1;
        } else {
            i2 = i;
            z = false;
        }
        dbsk.b(z, "Search target waypoint index is out of bounds");
        return new amsz(null, -1, i2, amvi.INSERT, amvhVar == null ? new amvh[0] : new amvh[]{amvhVar}, dqvjVar, dwaoVar);
    }

    public final boolean c() {
        int i = this.c;
        return i > 0 && i < this.e.length;
    }

    @dzsi
    public final amvh d() {
        amvh[] amvhVarArr;
        int length;
        if (c() || (length = (amvhVarArr = this.e).length) == 0) {
            return null;
        }
        return this.c == 0 ? amvhVarArr[0] : amvhVarArr[length - 1];
    }
}
