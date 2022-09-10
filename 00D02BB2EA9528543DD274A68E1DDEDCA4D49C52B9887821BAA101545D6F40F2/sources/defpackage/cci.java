package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Size;
/* compiled from: PG */
/* renamed from: cci  reason: default package */
/* loaded from: classes4.dex */
final class cci implements ImageDecoder.OnHeaderDecodedListener {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ btk d;
    final /* synthetic */ cdi e;
    final /* synthetic */ bub f;
    final /* synthetic */ ccj g;

    public cci(ccj ccjVar, int i, int i2, boolean z, btk btkVar, cdi cdiVar, bub bubVar) {
        this.g = ccjVar;
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = btkVar;
        this.e = cdiVar;
        this.f = bubVar;
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.g.a.d(this.a, this.b, this.c, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == btk.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new cch());
        Size size = imageInfo.getSize();
        int i = this.a;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i2 = this.b;
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float a = this.e.a(size.getWidth(), size.getHeight(), i, i2);
        imageDecoder.setTargetSize(Math.round(size.getWidth() * a), Math.round(a * size.getHeight()));
        if (Build.VERSION.SDK_INT < 28) {
            if (Build.VERSION.SDK_INT < 26) {
                return;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            return;
        }
        imageDecoder.setTargetColorSpace(ColorSpace.get((this.f != bub.DISPLAY_P3 || imageInfo.getColorSpace() == null || !imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.SRGB : ColorSpace.Named.DISPLAY_P3));
    }
}
