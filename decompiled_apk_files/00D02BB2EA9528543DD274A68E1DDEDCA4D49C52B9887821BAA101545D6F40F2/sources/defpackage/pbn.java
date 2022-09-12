package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: pbn  reason: default package */
/* loaded from: classes7.dex */
public final class pbn {
    static final String a = "pbn";
    public final Context b;
    public final gdo c;
    public final ckcw d;
    public final Executor e;
    private final amfi f;

    public pbn(Context context, amfi amfiVar, gdo gdoVar, ckcw ckcwVar, Executor executor) {
        this.b = context;
        this.f = amfiVar;
        this.c = gdoVar;
        this.d = ckcwVar;
        this.e = executor;
    }

    public final Future<Bitmap> a(String str, final int i, final int i2) {
        final deig d = deig.d();
        amfq amfqVar = new amfq(this, d, i, i2) { // from class: pbl
            private final pbn a;
            private final deig b;
            private final int c;
            private final int d;

            {
                this.a = this;
                this.b = d;
                this.c = i;
                this.d = i2;
            }

            @Override // defpackage.amfq
            public final void a(final amfu amfuVar) {
                final pbn pbnVar = this.a;
                final deig deigVar = this.b;
                final int i3 = this.c;
                final int i4 = this.d;
                pbnVar.e.execute(new Runnable(pbnVar, deigVar, amfuVar, i3, i4) { // from class: pbm
                    private final pbn a;
                    private final deig b;
                    private final amfu c;
                    private final int d;
                    private final int e;

                    {
                        this.a = pbnVar;
                        this.b = deigVar;
                        this.c = amfuVar;
                        this.d = i3;
                        this.e = i4;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        gdo gdoVar;
                        Drawable k;
                        pbn pbnVar2 = this.a;
                        deig deigVar2 = this.b;
                        amfu amfuVar2 = this.c;
                        int i5 = this.d;
                        int i6 = this.e;
                        pbnVar2.d.f(ckhc.NOTIFICATION_ICON_LOADER);
                        pbnVar2.c.b();
                        try {
                            int b = amfuVar2.b();
                            Bitmap bitmap = null;
                            if (b == 3) {
                                bitmap = amfuVar2.h();
                                if (bitmap != null) {
                                    bitmap = Bitmap.createScaledBitmap(bitmap, i5, i6, true);
                                }
                            } else if (b == 6 && (k = amfuVar2.k(pbnVar2.b)) != null) {
                                bitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(bitmap);
                                k.setBounds(0, 0, i5, i6);
                                k.draw(canvas);
                            }
                            deigVar2.j(bitmap);
                            gdoVar = pbnVar2.c;
                        } catch (Throwable th) {
                            try {
                                deigVar2.k(th);
                                gdoVar = pbnVar2.c;
                            } catch (Throwable th2) {
                                pbnVar2.c.e();
                                pbnVar2.d.g(ckhc.NOTIFICATION_ICON_LOADER);
                                throw th2;
                            }
                        }
                        gdoVar.e();
                        pbnVar2.d.g(ckhc.NOTIFICATION_ICON_LOADER);
                    }
                });
            }
        };
        amfu h = this.f.h(str, a, amfqVar);
        if (h.a()) {
            amfqVar.a(h);
        }
        return d;
    }
}
