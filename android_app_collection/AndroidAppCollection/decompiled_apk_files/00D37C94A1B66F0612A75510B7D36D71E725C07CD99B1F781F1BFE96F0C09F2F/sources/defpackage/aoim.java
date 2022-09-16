package defpackage;

import java.nio.FloatBuffer;
/* compiled from: PG */
/* renamed from: aoim  reason: default package */
/* loaded from: classes.dex */
public final class aoim {
    public static final FloatBuffer a = aoio.b(0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    public static final FloatBuffer b;
    public static final FloatBuffer c;
    public static final FloatBuffer d;
    public static final FloatBuffer e;
    private static final aoil k;
    private static final aoil l;
    private static final aoil m;
    private static final aoil n;
    private static final aoil[] o;
    public int g;
    public int h;
    public int f = 0;
    public final float[] i = new float[16];
    public int j = 0;

    static {
        aoio.b(0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        aoil aoilVar = new aoil(-1.0f, -1.0f);
        k = aoilVar;
        aoil aoilVar2 = new aoil(1.0f, -1.0f);
        l = aoilVar2;
        aoil aoilVar3 = new aoil(-1.0f, 1.0f);
        m = aoilVar3;
        aoil aoilVar4 = new aoil(1.0f, 1.0f);
        n = aoilVar4;
        aoil[] aoilVarArr = {aoilVar, aoilVar2, aoilVar3, aoilVar4};
        o = aoilVarArr;
        b = a(aoilVarArr, 0, 1, 2, 3);
        c = a(aoilVarArr, 2, 0, 3, 1);
        d = a(aoilVarArr, 3, 2, 1, 0);
        e = a(aoilVarArr, 1, 3, 0, 2);
    }

    private static FloatBuffer a(aoil[] aoilVarArr, int i, int i2, int i3, int i4) {
        aoil aoilVar = aoilVarArr[i];
        aoil aoilVar2 = aoilVarArr[i2];
        aoil aoilVar3 = aoilVarArr[i3];
        aoil aoilVar4 = aoilVarArr[i4];
        return aoio.b(aoilVar.a, aoilVar.b, aoilVar2.a, aoilVar2.b, aoilVar3.a, aoilVar3.b, aoilVar4.a, aoilVar4.b);
    }
}
