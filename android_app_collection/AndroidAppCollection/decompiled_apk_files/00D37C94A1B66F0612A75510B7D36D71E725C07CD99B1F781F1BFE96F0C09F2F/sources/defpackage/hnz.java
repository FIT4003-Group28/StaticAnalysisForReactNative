package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelEditModel;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelItemEditModel;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: hnz  reason: default package */
/* loaded from: classes3.dex */
public final class hnz extends hkx {
    public final hqk e;

    public hnz(Context context, hqk hqkVar) {
        super(context);
        this.e = hqkVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hkx
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return ((ReelEditModel) obj).d().size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hkx
    public final /* bridge */ /* synthetic */ hld b(Object obj, int i) {
        Boolean bool;
        ReelEditModel reelEditModel = (ReelEditModel) obj;
        final ReelItemEditModel reelItemEditModel = (ReelItemEditModel) reelEditModel.d().get(i);
        vqr h = reelItemEditModel.h();
        long k = h.K() ? h.k() - h.m() : TimeUnit.MICROSECONDS.toMillis(reelItemEditModel.c().g);
        hlc hlcVar = new hlc(null);
        hlcVar.a = reelItemEditModel.d().f ? amon.a : ampq.j(Long.valueOf(k));
        hlcVar.c = Boolean.valueOf(i == reelEditModel.a());
        hlcVar.b = new azqb() { // from class: hny
            @Override // defpackage.azqb
            public final Object get() {
                ampq ampqVar;
                Integer num;
                hnz hnzVar = hnz.this;
                ReelItemEditModel reelItemEditModel2 = reelItemEditModel;
                if (reelItemEditModel2.d().f) {
                    hqk hqkVar = hnzVar.e;
                    Uri uri = reelItemEditModel2.c().a;
                    uri.getClass();
                    if (Build.VERSION.SDK_INT >= 29) {
                        ampqVar = hqkVar.a(uri);
                    } else {
                        try {
                            ampqVar = ampq.i(MediaStore.Images.Media.getBitmap(hqkVar.a.getContentResolver(), uri));
                        } catch (IOException e) {
                            afus.c(1, 24, "Failed loading thumbnail", e);
                            ampqVar = amon.a;
                        }
                    }
                } else {
                    hqk hqkVar2 = hnzVar.e;
                    Uri uri2 = reelItemEditModel2.c().a;
                    long n = reelItemEditModel2.h().n();
                    boolean z = !reelItemEditModel2.d().e;
                    uri2.getClass();
                    if (Build.VERSION.SDK_INT < 29 || n > 0 || !z) {
                        hqkVar2.b.setDataSource(hqkVar2.a, uri2);
                        try {
                            ampqVar = ampq.i(hqkVar2.b.getFrameAtTime(n, 0));
                        } catch (SecurityException e2) {
                            afus.c(1, 24, "Failed loading thumbnail", e2);
                            ampqVar = amon.a;
                        }
                    } else {
                        ampqVar = hqkVar2.a(uri2);
                    }
                }
                if (ampqVar.h()) {
                    hpz hpzVar = new hpz();
                    hpzVar.a = (Bitmap) ampqVar.c();
                    hpzVar.f = Integer.valueOf(hnzVar.d);
                    hpzVar.d = Integer.valueOf(hnzVar.c);
                    hpzVar.e = 0;
                    hpzVar.b = Integer.valueOf(hnzVar.a);
                    hpzVar.c = Integer.valueOf(hnzVar.b);
                    Bitmap bitmap = hpzVar.a;
                    if (bitmap == null || (num = hpzVar.b) == null || hpzVar.c == null || hpzVar.d == null || hpzVar.e == null || hpzVar.f == null) {
                        StringBuilder sb = new StringBuilder();
                        if (hpzVar.a == null) {
                            sb.append(" bitmap");
                        }
                        if (hpzVar.b == null) {
                            sb.append(" targetWidth");
                        }
                        if (hpzVar.c == null) {
                            sb.append(" targetHeight");
                        }
                        if (hpzVar.d == null) {
                            sb.append(" cornerRadius");
                        }
                        if (hpzVar.e == null) {
                            sb.append(" borderWidth");
                        }
                        if (hpzVar.f == null) {
                            sb.append(" borderColor");
                        }
                        String valueOf = String.valueOf(sb);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                        sb2.append("Missing required properties:");
                        sb2.append(valueOf);
                        throw new IllegalStateException(sb2.toString());
                    }
                    hqa hqaVar = new hqa(bitmap, num.intValue(), hpzVar.c.intValue(), hpzVar.d.intValue(), hpzVar.e.intValue(), hpzVar.f.intValue());
                    Bitmap bitmap2 = hqaVar.a;
                    if (bitmap2 == null || bitmap2.isRecycled()) {
                        return amon.a;
                    }
                    Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(hqaVar.a, hqaVar.b, hqaVar.c, 0);
                    int width = extractThumbnail.getWidth() + hqaVar.e;
                    int height = extractThumbnail.getHeight() + hqaVar.e;
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    BitmapShader bitmapShader = new BitmapShader(extractThumbnail, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    if (hqaVar.e > 0) {
                        paint.setShader(null);
                        paint.setColor(hqaVar.f);
                        RectF rectF = new RectF(0.0f, 0.0f, width, height);
                        float f = hqaVar.d;
                        canvas.drawRoundRect(rectF, f, f, paint);
                    }
                    int i2 = hqaVar.e / 2;
                    paint.setShader(bitmapShader);
                    float f2 = i2;
                    RectF rectF2 = new RectF(f2, f2, width - i2, height - i2);
                    float f3 = hqaVar.d;
                    canvas.drawRoundRect(rectF2, f3, f3, paint);
                    return ampq.j(createBitmap);
                }
                return ampqVar;
            }
        };
        azqb azqbVar = hlcVar.b;
        if (azqbVar == null || (bool = hlcVar.c) == null) {
            StringBuilder sb = new StringBuilder();
            if (hlcVar.b == null) {
                sb.append(" thumbnailBitmapProvider");
            }
            if (hlcVar.c == null) {
                sb.append(" isSelected");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new hld(hlcVar.a, azqbVar, bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hkx
    public final /* bridge */ /* synthetic */ ampq c(Object obj) {
        return ampq.j(Integer.valueOf(((ReelEditModel) obj).a()));
    }
}
