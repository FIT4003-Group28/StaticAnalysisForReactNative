package defpackage;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: aida  reason: default package */
/* loaded from: classes2.dex */
public class aida {
    public final btnc<Integer, Bitmap> a;
    public final dbty<Bitmap> b;
    private final dbty<Bitmap> c;
    private final dbty<TextPaint> d = dbud.a(new dbty(this) { // from class: aicv
        private final aida a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            aida aidaVar = this.a;
            TextPaint textPaint = new TextPaint();
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(-1);
            textPaint.setTextSize(aidaVar.b.a().getHeight() * 0.2f);
            textPaint.setFlags(161);
            return textPaint;
        }
    });
    private final dbty<Paint> e = dbud.a(aicw.a);
    private final float f;
    private final aikp g;

    public aida(@dzsi btmv btmvVar, final Application application, aikp aikpVar) {
        this.a = new btnc<>(25, btmz.PERSONAL_LABEL_FACTORY, btmvVar);
        this.f = application.getResources().getDisplayMetrics().density;
        this.g = aikpVar;
        this.b = dbud.a(new dbty(application) { // from class: aict
            private final Application a;

            {
                this.a = application;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return BitmapFactory.decodeResource(this.a.getResources(), 2131232049);
            }
        });
        this.c = dbud.a(new dbty(application) { // from class: aicu
            private final Application a;

            {
                this.a = application;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return BitmapFactory.decodeResource(this.a.getResources(), 2131232031);
            }
        });
    }

    public final Bitmap a(final aicz aiczVar, final dbsz<PersonId> dbszVar) {
        aiko aikoVar;
        synchronized (this.a) {
            Bitmap a = this.a.a(Integer.valueOf(aiczVar.hashCode()));
            if (a != null) {
                return a;
            }
            aikp aikpVar = this.g;
            String d = aiczVar.d();
            ahvf c = aiczVar.c();
            if (c != ahvf.SUPER_FRESH && c != ahvf.FRESH && c != ahvf.STALE) {
                aikoVar = aiko.GRAYSCALE;
            } else {
                aikoVar = aiko.COLOR;
            }
            Bitmap a2 = aikpVar.a(d, aikoVar, new dbsz(this, aiczVar, dbszVar) { // from class: aicx
                private final aida a;
                private final aicz b;
                private final dbsz c;

                {
                    this.a = this;
                    this.b = aiczVar;
                    this.c = dbszVar;
                }

                @Override // defpackage.dbsz
                public final void NU(Object obj) {
                    aida aidaVar = this.a;
                    aicz aiczVar2 = this.b;
                    dbsz dbszVar2 = this.c;
                    Bitmap bitmap = (Bitmap) obj;
                    synchronized (aidaVar.a) {
                        aidaVar.a.o(Integer.valueOf(aiczVar2.hashCode()));
                    }
                    dbszVar2.NU(aiczVar2.a());
                }
            });
            Bitmap a3 = aiczVar.b() ? this.c.a() : this.b.a();
            Bitmap createBitmap = Bitmap.createBitmap(a3.getWidth(), a3.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawBitmap(a3, (Rect) null, new Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight()), (Paint) null);
            int i = true != aiczVar.b() ? 8 : 12;
            float f = this.f;
            int i2 = (int) (f + f);
            int i3 = (int) (6.0f * f);
            int i4 = (int) (i * f);
            Paint paint = new Paint(3);
            if (aiczVar.c() != ahvf.SUPER_FRESH && aiczVar.c() != ahvf.FRESH) {
                paint.setAlpha(R.styleable.AppCompatTheme_windowFixedWidthMinor);
            }
            int i5 = i4 + i2;
            int i6 = i3 + i2;
            canvas.drawBitmap(a2, (Rect) null, new Rect(i6, i5, createBitmap.getWidth() - i6, ((a3.getWidth() - (i2 + i2)) - (i3 + i3)) + i5), paint);
            if (aiczVar.e() != 1) {
                int e = aiczVar.e();
                String num = e <= 9 ? Integer.toString(e) : "9+";
                float f2 = true != aiczVar.b() ? 0.8f : 0.33f;
                float width = canvas.getWidth() * (true != aiczVar.b() ? 0.75f : 0.72f);
                float height = canvas.getHeight() * f2;
                float f3 = true != aiczVar.b() ? 0.2f : 0.21f;
                TextPaint a4 = this.d.a();
                a4.setTextSize(canvas.getHeight() * f3);
                Rect rect = new Rect();
                a4.getTextBounds(num, 0, num.length(), rect);
                float max = Math.max(rect.width(), rect.height());
                canvas.drawOval(new RectF(width - max, (height - max) - (rect.height() / 2), width + max, (max + height) - (rect.height() / 2)), this.e.a());
                canvas.drawText(num, width, height, a4);
            }
            this.a.Pz(Integer.valueOf(aiczVar.hashCode()), createBitmap);
            return createBitmap;
        }
    }
}
