package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bin  reason: default package */
/* loaded from: classes2.dex */
public final class bin {
    public int a;
    private final Bitmap b;
    private final List c;
    private final List d;
    private Rect e;

    public bin(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = 16;
        ArrayList arrayList2 = new ArrayList();
        this.d = arrayList2;
        if (bitmap == null || bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        arrayList2.add(biq.f);
        this.b = bitmap;
        arrayList.add(bir.a);
        arrayList.add(bir.b);
        arrayList.add(bir.c);
        arrayList.add(bir.d);
        arrayList.add(bir.e);
        arrayList.add(bir.f);
    }

    @Deprecated
    public final AsyncTask a(bio bioVar) {
        hz.g(bioVar);
        return new bim(this, bioVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.b);
    }

    public final biq b() {
        double d;
        bjj[] bjjVarArr;
        Bitmap bitmap = this.b;
        int width = bitmap.getWidth() * bitmap.getHeight();
        if (width > 12544) {
            double d2 = width;
            Double.isNaN(d2);
            d = Math.sqrt(12544.0d / d2);
        } else {
            d = -1.0d;
        }
        char c = 0;
        if (d > 0.0d) {
            double width2 = bitmap.getWidth();
            Double.isNaN(width2);
            double height = bitmap.getHeight();
            Double.isNaN(height);
            bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(width2 * d), (int) Math.ceil(height * d), false);
        }
        Rect rect = this.e;
        if (bitmap != this.b && rect != null) {
            double width3 = bitmap.getWidth();
            double width4 = this.b.getWidth();
            Double.isNaN(width3);
            Double.isNaN(width4);
            double d3 = width3 / width4;
            double d4 = rect.left;
            Double.isNaN(d4);
            rect.left = (int) Math.floor(d4 * d3);
            double d5 = rect.top;
            Double.isNaN(d5);
            rect.top = (int) Math.floor(d5 * d3);
            double d6 = rect.right;
            Double.isNaN(d6);
            rect.right = Math.min((int) Math.ceil(d6 * d3), bitmap.getWidth());
            double d7 = rect.bottom;
            Double.isNaN(d7);
            rect.bottom = Math.min((int) Math.ceil(d7 * d3), bitmap.getHeight());
        }
        int width5 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        int[] iArr = new int[width5 * height2];
        bitmap.getPixels(iArr, 0, width5, 0, 0, width5, height2);
        Rect rect2 = this.e;
        if (rect2 != null) {
            int width6 = rect2.width();
            int height3 = this.e.height();
            int[] iArr2 = new int[width6 * height3];
            for (int i = 0; i < height3; i++) {
                System.arraycopy(iArr, ((this.e.top + i) * width5) + this.e.left, iArr2, i * width6, width6);
            }
            iArr = iArr2;
        }
        int i2 = this.a;
        bip bipVar = null;
        if (this.d.isEmpty()) {
            bjjVarArr = null;
        } else {
            List list = this.d;
            bjjVarArr = (bjj[]) list.toArray(new bjj[list.size()]);
        }
        bil bilVar = new bil(iArr, i2, bjjVarArr, null);
        if (bitmap != this.b) {
            bitmap.recycle();
        }
        biq biqVar = new biq(bilVar.c, this.c);
        int size = biqVar.b.size();
        int i3 = 0;
        while (i3 < size) {
            bir birVar = (bir) biqVar.b.get(i3);
            float[] fArr = birVar.i;
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < 3; i4++) {
                float f3 = birVar.i[i4];
                if (f3 > 0.0f) {
                    f2 += f3;
                }
            }
            if (f2 != 0.0f) {
                float[] fArr2 = birVar.i;
                for (int i5 = 0; i5 < 3; i5++) {
                    float[] fArr3 = birVar.i;
                    float f4 = fArr3[i5];
                    if (f4 > 0.0f) {
                        fArr3[i5] = f4 / f2;
                    }
                }
            }
            agd agdVar = biqVar.c;
            int size2 = biqVar.a.size();
            bip bipVar2 = bipVar;
            int i6 = 0;
            float f5 = 0.0f;
            while (i6 < size2) {
                bip bipVar3 = (bip) biqVar.a.get(i6);
                float[] c2 = bipVar3.c();
                float f6 = c2[1];
                float[] fArr4 = birVar.g;
                if (f6 >= fArr4[c] && f6 <= fArr4[2]) {
                    float f7 = c2[2];
                    float[] fArr5 = birVar.h;
                    if (f7 >= fArr5[c] && f7 <= fArr5[2] && !biqVar.d.get(bipVar3.a)) {
                        float[] c3 = bipVar3.c();
                        bip bipVar4 = biqVar.e;
                        float c4 = (birVar.c() > f ? birVar.c() * (1.0f - Math.abs(c3[1] - birVar.g[1])) : 0.0f) + (birVar.a() > f ? birVar.a() * (1.0f - Math.abs(c3[2] - birVar.h[1])) : 0.0f) + (birVar.b() > 0.0f ? birVar.b() * (bipVar3.b / (bipVar4 != null ? bipVar4.b : 1)) : 0.0f);
                        if (bipVar2 == null || c4 > f5) {
                            bipVar2 = bipVar3;
                            f5 = c4;
                        }
                        i6++;
                        f = 0.0f;
                        c = 0;
                    }
                }
                i6++;
                f = 0.0f;
                c = 0;
            }
            if (bipVar2 != null) {
                boolean z = birVar.j;
                biqVar.d.append(bipVar2.a, true);
            }
            agdVar.put(birVar, bipVar2);
            i3++;
            c = 0;
            bipVar = null;
        }
        biqVar.d.clear();
        return biqVar;
    }

    public final void c(int i, int i2, int i3) {
        if (this.e == null) {
            this.e = new Rect();
        }
        this.e.set(0, 0, this.b.getWidth(), this.b.getHeight());
        if (this.e.intersect(0, i, i2, i3)) {
            return;
        }
        throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
    }
}
