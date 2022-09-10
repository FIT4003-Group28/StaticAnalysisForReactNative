package defpackage;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bypg  reason: default package */
/* loaded from: classes4.dex */
public final class bypg implements byqg {
    private static final String g = "bypg";
    public final dxio<pda> a;
    public final byol b;
    public final Object c = new Object();
    public final btvo d;
    public final cqat e;
    @dzsi
    public pef f;
    private final btzp<dmxh, dmxv> h;
    private final amfi i;
    private final Application j;
    private final Executor k;
    private final byol l;
    private final dxio<ckcw> m;

    public bypg(btzp<dmxh, dmxv> btzpVar, dxio<pda> dxioVar, amfi amfiVar, Application application, Executor executor, byol byolVar, byol byolVar2, dxio<ckcw> dxioVar2, btvo btvoVar, cqat cqatVar) {
        this.h = btzpVar;
        this.a = dxioVar;
        this.i = amfiVar;
        this.j = application;
        this.k = executor;
        this.b = byolVar;
        this.l = byolVar2;
        this.m = dxioVar2;
        this.d = btvoVar;
        this.e = cqatVar;
    }

    private final void e(Canvas canvas, Bitmap bitmap, RectF rectF) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        float f = this.d.getTripAssistanceNotificationsParameters().j;
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    @dzsi
    private static Long f(dlfv dlfvVar) {
        dljr dljrVar;
        dlgn dlgnVar = dlfvVar.g;
        if (dlgnVar == null) {
            dlgnVar = dlgn.G;
        }
        if (dlgnVar.c == 19) {
            dljrVar = (dljr) dlgnVar.d;
        } else {
            dljrVar = dljr.k;
        }
        dljm dljmVar = dljrVar.h;
        if (dljmVar == null) {
            dljmVar = dljm.d;
        }
        if ((dljmVar.a & 2) != 0) {
            return Long.valueOf(dljmVar.c);
        }
        return null;
    }

    @dzsi
    private final byqj g(long j) {
        ckgz ckgzVar;
        int a;
        dbsg dbsgVar;
        int i = 1;
        try {
            try {
                dbsgVar = (dbsg) this.b.a(String.valueOf(j), (dssr) byqj.f.cu(7)).get();
            } catch (Throwable th) {
                th = th;
                d(ckht.ay, ckhl.a(i));
                throw th;
            }
        } catch (InterruptedException e) {
            e = e;
            e.getStackTrace();
            ckgzVar = ckht.ay;
            a = ckhl.a(3);
            d(ckgzVar, a);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            e.getStackTrace();
            ckgzVar = ckht.ay;
            a = ckhl.a(3);
            d(ckgzVar, a);
            return null;
        } catch (Throwable th2) {
            th = th2;
            i = 2;
            d(ckht.ay, ckhl.a(i));
            throw th;
        }
        if (!dbsgVar.a()) {
            ckgzVar = ckht.ay;
            a = ckhl.a(2);
            d(ckgzVar, a);
            return null;
        }
        try {
            byqj byqjVar = (byqj) dbsgVar.b();
            d(ckht.ay, ckhl.a(1));
            return byqjVar;
        } catch (InterruptedException e3) {
            e = e3;
            e.getStackTrace();
            ckgzVar = ckht.ay;
            a = ckhl.a(3);
            d(ckgzVar, a);
            return null;
        } catch (ExecutionException e4) {
            e = e4;
            e.getStackTrace();
            ckgzVar = ckht.ay;
            a = ckhl.a(3);
            d(ckgzVar, a);
            return null;
        }
    }

    private final boolean h(byqj byqjVar) {
        if (this.d.getTripAssistanceNotificationsParameters().g) {
            return new eapd(byqjVar.e).x(new eapd(this.e.b()).f(eaow.e(this.d.getTripAssistanceNotificationsParameters().h)));
        }
        return false;
    }

    private static Bitmap i(byte[] bArr) {
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    @Override // defpackage.byqg
    public final void a(Bitmap bitmap, long j, String str) {
        int i;
        ckgz ckgzVar;
        int a;
        int i2 = 0;
        loop0: while (true) {
            i = -1;
            if (i2 >= bitmap.getHeight()) {
                i2 = -1;
                break;
            }
            for (int i3 = 0; i3 < bitmap.getWidth(); i3++) {
                int pixel = bitmap.getPixel(i3, i2);
                if (Color.red(pixel) > 0 || Color.green(pixel) > 0 || Color.blue(pixel) > 0) {
                    break loop0;
                }
            }
            i2++;
        }
        int i4 = 0;
        loop2: while (true) {
            if (i4 >= bitmap.getHeight() - 1) {
                i4 = -1;
                break;
            }
            for (int i5 = 0; i5 < bitmap.getWidth(); i5++) {
                int pixel2 = bitmap.getPixel(i5, (bitmap.getHeight() - 1) - i4);
                if (Color.red(pixel2) > 0 || Color.green(pixel2) > 0 || Color.blue(pixel2) > 0) {
                    break loop2;
                }
            }
            i4++;
        }
        int i6 = 0;
        loop4: while (true) {
            if (i6 >= bitmap.getWidth()) {
                i6 = -1;
                break;
            }
            for (int i7 = 0; i7 < bitmap.getHeight(); i7++) {
                int pixel3 = bitmap.getPixel(i6, i7);
                if (Color.red(pixel3) > 0 || Color.green(pixel3) > 0 || Color.blue(pixel3) > 0) {
                    break loop4;
                }
            }
            i6++;
        }
        loop6: for (int i8 = 0; i8 < bitmap.getWidth() - 1; i8++) {
            for (int i9 = 0; i9 < bitmap.getHeight(); i9++) {
                int pixel4 = bitmap.getPixel((bitmap.getWidth() - 1) - i8, i9);
                if (Color.red(pixel4) > 0 || Color.green(pixel4) > 0 || Color.blue(pixel4) > 0) {
                    i = i8;
                    break loop6;
                }
            }
        }
        d(ckht.aG, i2);
        d(ckht.aH, i4);
        d(ckht.aI, i6);
        d(ckht.aJ, i);
        String a2 = bype.a(j, str);
        byqk bZ = byql.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        byql byqlVar = (byql) bZ.b;
        int i10 = 1;
        byqlVar.a |= 1;
        byqlVar.b = j;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        dspd x = dspd.x(byteArrayOutputStream.toByteArray());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        byql byqlVar2 = (byql) bZ.b;
        x.getClass();
        int i11 = byqlVar2.a | 2;
        byqlVar2.a = i11;
        byqlVar2.c = x;
        str.getClass();
        byqlVar2.a = i11 | 4;
        byqlVar2.d = str;
        try {
            if (true != this.l.b(a2, bZ.bK()).get().booleanValue()) {
                i10 = 2;
            }
            ckgzVar = ckht.aB;
            a = ckhm.a(i10);
        } catch (Exception unused) {
            ckgzVar = ckht.aB;
            a = ckhm.a(2);
        } catch (Throwable th) {
            d(ckht.aB, ckhm.a(2));
            throw th;
        }
        d(ckgzVar, a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
        if (r13.c.size() == 0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    @Override // defpackage.byqg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.pau r11, defpackage.pas r12, defpackage.dlfv r13) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bypg.b(pau, pas, dlfv):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019d  */
    @Override // defpackage.byqg
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.byqa c(@defpackage.dzsi java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bypg.c(java.lang.String):byqa");
    }

    public final void d(ckgz ckgzVar, int i) {
        ((ckco) this.m.a().a(ckgzVar)).a(i);
    }
}
