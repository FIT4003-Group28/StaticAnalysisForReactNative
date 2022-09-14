package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: dxej  reason: default package */
/* loaded from: classes6.dex */
final class dxej {
    String a;
    String b;
    boolean c;
    float d;
    float e;
    float f;
    float g;
    float h;
    float i;
    float j;
    ArrayList<Float> k = new ArrayList<>();
    ArrayList<Integer> l = new ArrayList<>();
    Matrix m = null;

    public final dxej a(dxej dxejVar) {
        dxej dxejVar2 = new dxej();
        dxejVar2.a = dxejVar.a;
        dxejVar2.b = this.a;
        dxejVar2.c = dxejVar.c;
        dxejVar2.d = dxejVar.d;
        dxejVar2.f = dxejVar.f;
        dxejVar2.e = dxejVar.e;
        dxejVar2.g = dxejVar.g;
        dxejVar2.h = dxejVar.h;
        dxejVar2.i = dxejVar.i;
        dxejVar2.j = dxejVar.j;
        dxejVar2.k = this.k;
        dxejVar2.l = this.l;
        dxejVar2.m = this.m;
        Matrix matrix = dxejVar.m;
        if (matrix != null) {
            Matrix matrix2 = this.m;
            if (matrix2 == null) {
                dxejVar2.m = matrix;
            } else {
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.preConcat(dxejVar.m);
                dxejVar2.m = matrix3;
            }
        }
        return dxejVar2;
    }
}
