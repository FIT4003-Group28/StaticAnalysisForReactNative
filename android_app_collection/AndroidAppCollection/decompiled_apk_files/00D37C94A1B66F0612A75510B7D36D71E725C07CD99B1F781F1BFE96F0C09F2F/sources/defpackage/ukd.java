package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ukd  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ukd implements Runnable {
    public final /* synthetic */ ukh a;
    private final /* synthetic */ int b;

    public /* synthetic */ ukd(ukh ukhVar) {
        this.a = ukhVar;
    }

    public /* synthetic */ ukd(ukh ukhVar, int i) {
        this.b = i;
        this.a = ukhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int width;
        String str;
        String str2;
        String sb;
        int i;
        if (this.b == 0) {
            this.a.b();
            return;
        }
        final ukh ukhVar = this.a;
        Map map = uki.a;
        ImageView imageView = (ImageView) ukhVar.a.get();
        if (ukhVar.d || imageView == null) {
            return;
        }
        if (ukhVar.b == null) {
            Context context = imageView.getContext();
            if (vgu.a == null) {
                vgu.a = po.b(context, R.drawable.quantum_gm_ic_account_circle_vd_theme_24);
            }
            Drawable drawable = vgu.a;
            if (!umn.d(context)) {
                context = new ContextThemeWrapper(context, 2132083782);
            }
            ukhVar.d(udy.a(drawable, smc.c(context, R.attr.colorPrimaryGoogle)), true);
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null || layoutParams.width <= 0) {
            width = imageView.getWidth();
        } else {
            width = layoutParams.width;
        }
        int paddingLeft = width - (imageView.getPaddingLeft() + imageView.getPaddingRight());
        int i2 = 0;
        int i3 = paddingLeft < 0 ? 0 : paddingLeft;
        Object obj = ukhVar.b;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[2];
        if (obj == null) {
            sb = "null";
        } else {
            str = ((ulx) obj).c;
            StringBuilder sb2 = new StringBuilder(str);
            str2 = ((ulx) obj).g;
            if (str2 != null) {
                sb2.append(" ");
                sb2.append(str2);
            }
            sb = sb2.toString();
        }
        objArr[0] = sb;
        objArr[1] = Integer.valueOf(i3);
        final String format = String.format(locale, "%s %s", objArr);
        Drawable drawable2 = (Drawable) uki.a.get(format);
        if (drawable2 != null) {
            ukhVar.d(drawable2, true);
            return;
        }
        uop uopVar = ukhVar.c;
        uor uorVar = uopVar.a;
        final uor uorVar2 = uopVar.b;
        final Drawable drawable3 = (Drawable) uki.b.get(format);
        if (drawable3 != null) {
            ukhVar.d(drawable3, false);
        }
        Object obj2 = ukhVar.b;
        final int i4 = i3;
        uoq uoqVar = new uoq() { // from class: ukb
            @Override // defpackage.uoq
            public final void a(final Bitmap bitmap) {
                final ukh ukhVar2 = ukh.this;
                final String str3 = format;
                Drawable drawable4 = drawable3;
                final uor uorVar3 = uorVar2;
                final int i5 = i4;
                if (ukhVar2.d) {
                    return;
                }
                if (bitmap != null) {
                    ukhVar2.c(new Runnable() { // from class: uke
                        @Override // java.lang.Runnable
                        public final void run() {
                            ukh ukhVar3 = ukh.this;
                            Bitmap bitmap2 = bitmap;
                            String str4 = str3;
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(ukhVar3.a(bitmap2));
                            uki.a.put(str4, bitmapDrawable);
                            uki.b.remove(str4);
                            ukhVar3.d(bitmapDrawable, true);
                        }
                    });
                } else if (drawable4 != null) {
                    ukhVar2.d(drawable4, true);
                } else if (uot.a(uou.a(ukhVar2.b))) {
                    ukhVar2.c(new Runnable() { // from class: ukf
                        @Override // java.lang.Runnable
                        public final void run() {
                            ukh ukhVar3 = ukh.this;
                            uor uorVar4 = uorVar3;
                            int i6 = i5;
                            String str4 = str3;
                            Object obj3 = ukhVar3.b;
                            uka ukaVar = new uka(ukhVar3, str4);
                            ujy ujyVar = (ujy) uorVar4;
                            uot uotVar = ujyVar.a;
                            zgd zgdVar = ujyVar.b;
                            uou a = uou.a(obj3);
                            aqxo.q(true, "Size must be bigger or equal to 0");
                            aqxo.q(uot.a(a), "handles(key) must be true");
                            if (i6 == 0) {
                                i6 = 120;
                            }
                            ArrayList arrayList = new ArrayList();
                            String str5 = a.b;
                            if (str5 != null) {
                                arrayList.add(str5);
                            }
                            arrayList.add(a.a);
                            String[] strArr = new String[arrayList.size()];
                            arrayList.toArray(strArr);
                            vpt vptVar = new vpt(new vpz(uotVar.a.getApplicationContext(), new anla()));
                            int[] iArr = vpu.a;
                            vps vpsVar = new vps(new vpv(vptVar));
                            Bitmap createBitmap = Bitmap.createBitmap(i6, i6, Bitmap.Config.ARGB_8888);
                            vpsVar.d = vpv.b(a.a);
                            vpsVar.c = vpsVar.e.a(new uos(strArr));
                            Canvas canvas = new Canvas(createBitmap);
                            int height = createBitmap.getHeight();
                            int width2 = createBitmap.getWidth();
                            float min = Math.min(height, width2);
                            Paint paint = (Paint) vps.a.a();
                            synchronized (vps.a) {
                                paint.setColor(vpsVar.d);
                                float f = width2 / 2;
                                float f2 = height / 2;
                                canvas.drawCircle(f, f2, min / 2.0f, paint);
                                if (vpsVar.c != null) {
                                    paint.setColor(-1);
                                    paint.setTextSize(min * 0.47f);
                                    paint.getTextBounds(vpsVar.c.toString(), 0, vpsVar.c.length(), vps.b);
                                    CharSequence charSequence = vpsVar.c;
                                    canvas.drawText(charSequence, 0, charSequence.length(), f, f2 - vps.b.exactCenterY(), paint);
                                }
                            }
                            ukh ukhVar4 = ukaVar.a;
                            String str6 = ukaVar.b;
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(ukhVar4.a(createBitmap));
                            uki.b.put(str6, bitmapDrawable);
                            ukhVar4.d(bitmapDrawable, true);
                        }
                    });
                } else {
                    umr.b(new ukd(ukhVar2));
                }
            }
        };
        ulx ulxVar = (ulx) obj2;
        uma umaVar = (uma) uorVar;
        Context context2 = umaVar.a;
        if (i3 <= 0) {
            i = 64;
        } else {
            float f = i3 / context2.getResources().getDisplayMetrics().density;
            int[] iArr = {32, 48, 64, 120};
            while (true) {
                if (i2 >= 4) {
                    i = 120;
                    break;
                }
                int i5 = iArr[i2];
                if (i5 == 0) {
                    throw null;
                }
                if (f <= i5) {
                    i = i5;
                    break;
                }
                i2++;
            }
        }
        anlz.A(umaVar.b.f(ulxVar.c, i), new ulz(uoqVar), anjk.a);
    }
}
