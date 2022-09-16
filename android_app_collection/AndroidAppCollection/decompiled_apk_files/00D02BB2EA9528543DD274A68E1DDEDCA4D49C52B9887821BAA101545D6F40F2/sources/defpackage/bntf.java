package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bntf  reason: default package */
/* loaded from: classes.dex */
public final class bntf {
    private final ArrayList<bnte> a = new ArrayList<>();
    private final Runnable b;
    private boolean c;

    public bntf(Runnable runnable) {
        this.b = runnable;
    }

    public final synchronized void a(boolean z) {
        this.c = z;
        if (z) {
            ArrayList<bnte> arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i).f(null);
            }
            this.a.clear();
        }
    }

    public final synchronized void b(bnte bnteVar) {
        if (this.c) {
            bnteVar.f(null);
            return;
        }
        this.a.add(bnteVar);
        this.b.run();
    }

    public final synchronized void c(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        synchronized (this) {
            ArrayList<bnte> arrayList = this.a;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                bnte bnteVar = arrayList.get(i5);
                Bitmap g = bnteVar.g(i3, i4);
                if (g == null) {
                    g = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                }
                if (g.getWidth() != i3 || g.getHeight() != i4) {
                    g = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                }
                int i6 = i3 * i4 * 4;
                ByteBuffer c = bnteVar.c(i6);
                if (c == null) {
                    c = ByteBuffer.allocateDirect(i6);
                }
                if (c.capacity() < i6 || !c.isDirect()) {
                    c = ByteBuffer.allocateDirect(i6);
                }
                int width = g.getWidth();
                int height = g.getHeight();
                c.clear();
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, c);
                if (GLES20.glGetError() != 0) {
                    bnteVar.f(null);
                } else {
                    c.rewind();
                    IntBuffer asIntBuffer = c.asIntBuffer();
                    for (int i7 = 0; i7 < height / 2; i7++) {
                        int i8 = (height - i7) - 1;
                        for (int i9 = 0; i9 < width; i9++) {
                            int i10 = (i7 * width) + i9;
                            int i11 = asIntBuffer.get(i10);
                            int i12 = i9 + (i8 * width);
                            asIntBuffer.put(i10, asIntBuffer.get(i12));
                            asIntBuffer.put(i12, i11);
                        }
                    }
                    g.copyPixelsFromBuffer(c);
                    bnteVar.f(g);
                }
                i5++;
                i3 = i;
                i4 = i2;
            }
            this.a.clear();
        }
    }
}
