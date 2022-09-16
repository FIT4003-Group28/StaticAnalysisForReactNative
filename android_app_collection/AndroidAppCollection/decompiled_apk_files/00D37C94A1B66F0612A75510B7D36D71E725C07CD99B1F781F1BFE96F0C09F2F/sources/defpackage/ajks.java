package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.rastermill.FrameSequenceDrawable;
import android.widget.ImageView;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: ajks  reason: default package */
/* loaded from: classes.dex */
public final class ajks implements yiw {
    public final Context a;
    public final ImageView b;
    public final aodt c;
    private final tfl d;
    private final afts e;
    private final ajmm f;
    private final snc g;
    private final teb h;
    private final AtomicBoolean i = new AtomicBoolean(false);
    private final yiw j;

    public ajks(aodt aodtVar, Context context, ImageView imageView, tfl tflVar, afts aftsVar, ajmm ajmmVar, snc sncVar, yiw yiwVar, teb tebVar) {
        this.c = aodtVar;
        this.a = context;
        this.b = imageView;
        this.d = tflVar;
        this.e = aftsVar;
        this.f = ajmmVar;
        this.g = sncVar;
        this.j = yiwVar;
        this.h = tebVar;
    }

    public static Uri c(Uri uri) {
        return uri.buildUpon().appendQueryParameter("bitmap", "true").build();
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        if (this.c != null) {
            if (this.i.get()) {
                return;
            }
            final aodt aodtVar = this.c;
            this.b.post(new Runnable() { // from class: ajkr
                @Override // java.lang.Runnable
                public final void run() {
                    ajks ajksVar = ajks.this;
                    aolu.t(aodtVar, ajksVar.b, ajksVar.a);
                }
            });
        }
        yiw yiwVar = this.j;
        if (yiwVar != null) {
            yiwVar.a(uri, exc);
        }
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        byte[] bArr = (byte[]) obj2;
        yiw yiwVar = this.j;
        if (yiwVar != null) {
            yiwVar.b(uri, bArr);
        }
        Uri c = c(uri);
        try {
            Drawable drawable = (Drawable) this.e.b(bArr);
            if (!(drawable instanceof BitmapDrawable)) {
                if (drawable instanceof FrameSequenceDrawable) {
                    final FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) drawable;
                    final tfl tflVar = this.d;
                    if (this.i.get()) {
                        return;
                    }
                    this.b.post(new Runnable() { // from class: ajkq
                        @Override // java.lang.Runnable
                        public final void run() {
                            ajks ajksVar = ajks.this;
                            FrameSequenceDrawable frameSequenceDrawable2 = frameSequenceDrawable;
                            tfl tflVar2 = tflVar;
                            ajksVar.b.setImageDrawable(frameSequenceDrawable2);
                            tflVar2.b(frameSequenceDrawable2);
                            tflVar2.c();
                        }
                    });
                    return;
                }
                aodt aodtVar = this.c;
                if (aodtVar != null) {
                    aolu.t(aodtVar, this.b, this.a);
                }
                teb tebVar = this.h;
                String valueOf = String.valueOf(drawable == null ? "null" : drawable.getClass().getName());
                tebVar.b(28, valueOf.length() != 0 ? "Failed to decode Animated Drawable in ByteImageLoadListener. Expected FrameSequenceDrawable or BitmapDrawable, but got ".concat(valueOf) : new String("Failed to decode Animated Drawable in ByteImageLoadListener. Expected FrameSequenceDrawable or BitmapDrawable, but got "));
                return;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            this.f.b().d(c, new afsk(bitmapDrawable.getBitmap(), this.g.c()));
            d(bitmapDrawable.getBitmap());
        } catch (IOException | zhy unused) {
            aodt aodtVar2 = this.c;
            if (aodtVar2 == null) {
                return;
            }
            aolu.t(aodtVar2, this.b, this.a);
        }
    }

    public final void d(final Bitmap bitmap) {
        if (this.i.get()) {
            return;
        }
        this.b.post(new Runnable() { // from class: ajkp
            @Override // java.lang.Runnable
            public final void run() {
                ajks ajksVar = ajks.this;
                Bitmap bitmap2 = bitmap;
                if (bitmap2 != null) {
                    ajksVar.b.setImageBitmap(bitmap2);
                    return;
                }
                aodt aodtVar = ajksVar.c;
                if (aodtVar == null) {
                    return;
                }
                aolu.t(aodtVar, ajksVar.b, ajksVar.a);
            }
        });
    }

    public final void e() {
        this.i.set(true);
    }
}
