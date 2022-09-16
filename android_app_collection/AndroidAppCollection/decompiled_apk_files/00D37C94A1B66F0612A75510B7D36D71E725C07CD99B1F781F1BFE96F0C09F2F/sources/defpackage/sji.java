package defpackage;

import android.util.Size;
import android.view.SurfaceHolder;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sji  reason: default package */
/* loaded from: classes4.dex */
public final class sji implements SurfaceHolder.Callback {
    final /* synthetic */ sjk a;

    public sji(sjk sjkVar) {
        this.a = sjkVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        sjj sjjVar = this.a.e;
        Size size = new Size(i2, i3);
        final siq siqVar = (siq) sjjVar;
        final int rotation = siqVar.a.getDisplay().getRotation();
        if (rotation == 1) {
            rotation = 3;
        } else if (rotation == 3) {
            rotation = 1;
        }
        sir sirVar = siqVar.c;
        Size a = sir.a(size, rotation);
        float width = a.getWidth() / a.getHeight();
        amuk amukVar = sirVar.a;
        int size2 = amukVar.size();
        Size size3 = null;
        float f = 1.0f;
        for (int i4 = 0; i4 < size2; i4++) {
            Size size4 = (Size) amukVar.get(i4);
            float width2 = size4.getWidth() / size4.getHeight();
            float abs = Math.abs(width2 - width);
            if (size4.getWidth() >= sirVar.b.getWidth() && size4.getHeight() >= sirVar.b.getHeight() && width2 < 1.8f && (size3 == null || (abs <= f && size4.getWidth() <= size3.getWidth() && size4.getHeight() <= size3.getHeight()))) {
                size3 = size4;
                f = abs;
            }
        }
        if (size3 == null) {
            size3 = sirVar.b;
        }
        final Size a2 = sir.a(size3, rotation);
        siqVar.b(new Runnable() { // from class: sim
            @Override // java.lang.Runnable
            public final void run() {
                siq siqVar2 = siq.this;
                Size size5 = a2;
                int i5 = rotation;
                siqVar2.k = size5;
                siqVar2.m = i5;
            }
        });
        aoib aoibVar = this.a.c;
        int width3 = a2.getWidth();
        int height = a2.getHeight();
        aoibVar.a = width3;
        aoibVar.b = height;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
