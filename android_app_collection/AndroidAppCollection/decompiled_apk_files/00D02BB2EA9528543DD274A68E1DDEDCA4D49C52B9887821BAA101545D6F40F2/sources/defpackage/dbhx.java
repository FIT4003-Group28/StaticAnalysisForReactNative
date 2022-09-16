package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* compiled from: PG */
/* renamed from: dbhx  reason: default package */
/* loaded from: classes5.dex */
public class dbhx {
    public static dbhw b = new dbhv();
    public final dbji c;
    public final dbjh d;
    public final FloatBuffer e;

    /* JADX INFO: Access modifiers changed from: protected */
    public dbhx(dbhx dbhxVar) {
        this(dbhxVar.c, dbhxVar.d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static FloatBuffer g(int i) {
        return ByteBuffer.allocateDirect(i * 64).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static void h(float[] fArr, dbje dbjeVar) {
        dbjk dbjkVar = new dbjk();
        dbjkVar.d(dbjeVar.a, dbjeVar.b);
        i(fArr, 0, dbjkVar);
        dbjkVar.d(dbjeVar.a + 16, dbjeVar.b);
        i(fArr, 1, dbjkVar);
        dbjkVar.d(dbjeVar.a + 32, dbjeVar.b);
        i(fArr, 2, dbjkVar);
        fArr[15] = 1.0f;
    }

    protected static void i(float[] fArr, int i, dbjk dbjkVar) {
        fArr[i] = dbjkVar.b.getFloat(dbjkVar.a);
        fArr[i + 4] = dbjkVar.b.getFloat(dbjkVar.a + 4);
        fArr[i + 8] = dbjkVar.b.getFloat(dbjkVar.a + 8);
        fArr[i + 12] = dbjkVar.b.getFloat(dbjkVar.a + 12);
    }

    public void a(int i, dbdz dbdzVar) {
        h(dbdzVar.b, this.c.a(i));
        dbdz.j(dbdzVar, dbdzVar);
    }

    public boolean b(dbgt dbgtVar) {
        return false;
    }

    public void c() {
    }

    public dbhx d() {
        return new dbhx(this);
    }

    public final int e() {
        dbji dbjiVar = this.c;
        int g = dbjiVar.g(4);
        if (g != 0) {
            return dbjiVar.j(g);
        }
        return 0;
    }

    public final int f() {
        return this.d.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dbhx(dbji dbjiVar, dbjh dbjhVar) {
        this.c = dbjiVar;
        this.d = dbjhVar;
        FloatBuffer g = g(f());
        this.e = g;
        g.rewind();
        while (g.hasRemaining()) {
            g.put(dbdz.a);
        }
        g.rewind();
    }
}
