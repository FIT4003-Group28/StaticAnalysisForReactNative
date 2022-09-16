package com.google.android.apps.gmm.map.internal.vector.gl;
/* compiled from: PG */
/* loaded from: classes.dex */
public class GeometryUtil {
    private static final dcqe b = dcqe.c("com.google.android.apps.gmm.map.internal.vector.gl.GeometryUtil");
    public static final float a = ((float) Math.sqrt(2.0d)) * 255.0f;
    private static amfy c = new amfx();

    public static amfy getGeometryUtilFactory() {
        return c;
    }

    public static int getMaxGeneratedVerticesForLine(int i, int i2, int i3) {
        return ((i - 1) * (i2 != 0 ? i2 != 1 ? 24 : 8 : 6)) + 6 + i3 + i3;
    }

    public static int getMaxGeneratedVerticesForPointSpriteLine(float f, float f2, float f3) {
        if (f3 > 0.0f) {
            return (((int) Math.ceil((f * 1.1f) / (f2 * f3))) + 1) * 6;
        }
        return 25;
    }

    public static int getMaxVerticesForExtrudedPolyline(akrk akrkVar) {
        return (akrkVar.l() * 8) + 6;
    }

    public static void setGeometryUtilFactoryForTest(amfy amfyVar) {
        c = amfyVar;
    }

    public void addExtrudedMultiSegmentRoadsWithNormals(float[] fArr, int[] iArr, float f, float f2, float[] fArr2, amgr amgrVar, int i, int i2, int i3, float f3, int[] iArr2, boolean z, float[] fArr3, float[] fArr4, float[] fArr5, float f4, int i4, float f5) {
        if (z) {
            amgi.h(fArr, f, f2, iArr, fArr3, fArr4, fArr5, f4, f5, amgrVar);
        } else {
            amgi.c(fArr, iArr, f, f2, fArr2, i, i2, i3, (int) (4.0f * f3), iArr2, i4, f5, amgrVar);
        }
    }

    public void addExtrudedPolyline(akrk akrkVar, float f, akra akraVar, float f2, float f3, boolean z, amgr amgrVar) {
        if (akrkVar.l() - 1 <= 0) {
            return;
        }
        amgi.j(akrkVar.b, akrkVar.l(), f, akraVar.a, akraVar.b, f2, f3, z, amgrVar);
    }

    public int addExtrudedRoadsWithNormals(int[] iArr, int[] iArr2, akra akraVar, float f, amgr amgrVar, int i, int i2, int i3, float f2, int i4, boolean z, float f3, float f4, float f5, float f6, int i5, float f7) {
        int i6;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        int[] iArr3;
        int[] iArr4;
        float[] fArr4;
        int i7;
        int length = iArr.length >> 1;
        int length2 = iArr2 != null ? iArr2.length : 0;
        float[] fArr5 = {f};
        int[] iArr5 = new int[1];
        int[] iArr6 = {i4};
        float[] fArr6 = {f3};
        float[] fArr7 = {f4};
        float[] fArr8 = {f5};
        int i8 = 0;
        int i9 = 0;
        while (i9 <= length2) {
            int i10 = i9 < length2 ? iArr2[i9] : length;
            int i11 = i10 - i8;
            iArr5[0] = i11;
            if (z) {
                i6 = i9;
                fArr = fArr8;
                fArr2 = fArr7;
                fArr3 = fArr6;
                iArr3 = iArr6;
                iArr4 = iArr5;
                amgi.g(iArr, akraVar.a, akraVar.b, iArr2, fArr6, fArr7, fArr, f6, f7, amgrVar);
                fArr4 = fArr5;
                i7 = length2;
            } else {
                i6 = i9;
                fArr = fArr8;
                fArr2 = fArr7;
                fArr3 = fArr6;
                iArr3 = iArr6;
                iArr4 = iArr5;
                fArr4 = fArr5;
                i7 = length2;
                amgi.d(i11 + i11, iArr, i8 + i8, akraVar.a, akraVar.b, fArr4, i, i2, i3, (int) (4.0f * f2), iArr3, i5, null, iArr4, false, f7, null, null, amgrVar);
            }
            i9 = i6 + 1;
            length2 = i7;
            fArr5 = fArr4;
            i8 = i10;
            fArr8 = fArr;
            fArr7 = fArr2;
            fArr6 = fArr3;
            iArr6 = iArr3;
            iArr5 = iArr4;
        }
        return length2 + 1;
    }

    public int addExtrudedRoadsWithNormalsAndWidths(int[] iArr, int[] iArr2, akra akraVar, float f, amgr amgrVar, int i, int i2, int i3, float f2, int i4, int i5, float[] fArr) {
        if (bnta.a().b()) {
            bvoo.h("addExtrudedRoadsWithNormalsAndWidths called with vertex shader texture fetching enabled", new Object[0]);
        }
        int length = iArr.length >> 1;
        int length2 = iArr2 != null ? iArr2.length : 0;
        float[] fArr2 = {f};
        int[] iArr3 = new int[1];
        int[] iArr4 = {i4};
        int i6 = 0;
        int i7 = 0;
        while (i6 <= length2) {
            int i8 = i6 < length2 ? iArr2[i6] : length;
            int i9 = i8 - i7;
            iArr3[0] = i9;
            int[] iArr5 = iArr4;
            int[] iArr6 = iArr3;
            amgi.d(i9 + i9, iArr, i7 + i7, akraVar.a, akraVar.b, fArr2, i, i2, i3, (int) (4.0f * f2), iArr5, i5, fArr, iArr6, false, 0.0f, null, null, amgrVar);
            i6++;
            i7 = i8;
            iArr4 = iArr5;
            iArr3 = iArr6;
            fArr2 = fArr2;
            length2 = length2;
        }
        return length2 + 1;
    }

    public void copyExtrudedRoadsWithNormals(amgr amgrVar, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            amgi.i(i + i4, i3, amgrVar);
        }
    }

    public void copyExtrudedRoadsWithNormalsAndWidths(amgr amgrVar, int i, int i2, int i3, float[] fArr) {
        for (int i4 = 0; i4 < i2; i4++) {
            amgf k = amgi.k(fArr);
            int i5 = k.a;
            int i6 = k.b;
            byte[] g = amgrVar.g(i + i4);
            amgrVar.h(i3, g);
            byte[] bArr = amgrVar.d;
            bArr[0] = (byte) i5;
            bArr[1] = (byte) (i5 >>> 8);
            bArr[2] = (byte) (i5 >>> 16);
            bArr[3] = (byte) (i5 >> 24);
            bArr[4] = (byte) i6;
            bArr[5] = (byte) (i6 >>> 8);
            bArr[6] = (byte) (i6 >>> 16);
            bArr[7] = (byte) (i6 >> 24);
            int i7 = amgrVar.e;
            while (i7 < g.length) {
                byte[] bArr2 = amgrVar.d;
                g[i7] = bArr2[0];
                g[i7 + 1] = bArr2[1];
                g[i7 + 2] = bArr2[2];
                g[i7 + 3] = bArr2[3];
                g[i7 + 4] = bArr2[4];
                g[i7 + 5] = bArr2[5];
                g[i7 + 6] = bArr2[6];
                g[i7 + 7] = bArr2[7];
                i7 += amgrVar.c;
            }
            amgrVar.i(g);
        }
    }

    public amgr getBuilder(String str, int i, boolean z, int i2, int i3) {
        return amgr.a(str, i3, i, z, i2, false);
    }

    public amgr getBuilderWithNormalizedDistance(String str, int i, boolean z, int i2, int i3) {
        return amgr.a(str, i3, i, z, i2, true);
    }

    public boolean supportsVertexTextureFetching() {
        return bnta.a().b();
    }

    public void addExtrudedMultiSegmentRoadsWithNormals(int[] iArr, int[] iArr2, akra akraVar, float[] fArr, amgr amgrVar, int i, int i2, int i3, float f, int[] iArr3, boolean z, float[] fArr2, float[] fArr3, float[] fArr4, boolean z2, float f2, float f3, @dzsi int[] iArr4, @dzsi int[] iArr5) {
        if (z) {
            amgi.g(iArr, akraVar.a, akraVar.b, iArr2, fArr2, fArr3, fArr4, f2, f3, amgrVar);
        } else {
            amgi.d(iArr.length, iArr, 0, akraVar.a, akraVar.b, fArr, i, i2, i3, (int) (4.0f * f), iArr3, 0, null, iArr2, z2, f3, iArr4, iArr5, amgrVar);
        }
    }
}
