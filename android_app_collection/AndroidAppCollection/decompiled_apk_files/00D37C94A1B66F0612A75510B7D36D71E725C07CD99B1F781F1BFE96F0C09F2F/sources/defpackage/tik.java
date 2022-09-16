package defpackage;

import android.graphics.Bitmap;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;
import java.util.LinkedList;
/* compiled from: PG */
/* renamed from: tik  reason: default package */
/* loaded from: classes4.dex */
public final class tik implements FrameSequenceDrawable.BitmapProvider, cku {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private final FrameSequence b;
    private final cld c;
    private final LinkedList d = new LinkedList();

    public tik(FrameSequence frameSequence, cld cldVar) {
        this.b = frameSequence;
        this.c = cldVar;
    }

    @Override // defpackage.cku
    public final int a() {
        double width = this.b.getWidth() * this.b.getHeight();
        double frameCount = this.b.getFrameCount();
        Double.isNaN(frameCount);
        Double.isNaN(width);
        return (int) (width * ((frameCount * 0.06d) + 16.0d));
    }

    @Override // android.support.rastermill.FrameSequenceDrawable.BitmapProvider
    public final Bitmap acquireBitmap(int i, int i2) {
        return this.c.a(i, i2, a);
    }

    @Override // defpackage.cku
    public final Class b() {
        return FrameSequenceDrawable.class;
    }

    @Override // defpackage.cku
    public final /* bridge */ /* synthetic */ Object c() {
        FrameSequenceDrawable frameSequenceDrawable = new FrameSequenceDrawable(this.b, this);
        this.d.add(frameSequenceDrawable);
        return frameSequenceDrawable;
    }

    @Override // defpackage.cku
    public final void e() {
        while (!this.d.isEmpty()) {
            FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) this.d.poll();
            if (!frameSequenceDrawable.isDestroyed()) {
                frameSequenceDrawable.destroy();
            }
        }
    }

    @Override // android.support.rastermill.FrameSequenceDrawable.BitmapProvider
    public final void releaseBitmap(Bitmap bitmap) {
        this.c.d(bitmap);
    }
}
