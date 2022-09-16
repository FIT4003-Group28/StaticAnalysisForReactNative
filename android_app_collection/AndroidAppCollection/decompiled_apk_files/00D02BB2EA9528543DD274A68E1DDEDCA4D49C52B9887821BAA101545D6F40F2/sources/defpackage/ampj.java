package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.Build;
import java.util.List;
/* compiled from: PG */
/* renamed from: ampj  reason: default package */
/* loaded from: classes2.dex */
public final class ampj implements ampc {
    private int a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ampj(byte[] bArr, int i, alyh alyhVar, amqi amqiVar, bnrz bnrzVar, @dzsi aktk aktkVar, alxo alxoVar, bnvk bnvkVar, @dzsi amqg amqgVar, byte b, @dzsi bnvo bnvoVar, boolean z, List<bnsa> list, bnsn bnsnVar) {
        boolean a;
        bntv bntvVar;
        bnvn c;
        if (bnru.a(bArr)) {
            bnru bnruVar = new bnru(bArr);
            bntvVar = new bntv(new bnrt(bnruVar), bnruVar.a, bnruVar.b, false);
            this.a = bArr.length;
            a = true;
        } else {
            try {
                float[] fArr = alxoVar.D;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPurgeable = true;
                options.inInputShareable = true;
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                if (bArr[0] == -1 && bArr[1] == -40) {
                    config = Bitmap.Config.RGB_565;
                }
                options.inPreferredConfig = config;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, i, bArr.length - i, options);
                Bitmap bitmap = null;
                if (decodeByteArray != null) {
                    if (Build.VERSION.SDK_INT >= 26 && decodeByteArray.getConfig() != config) {
                        decodeByteArray = decodeByteArray.copy(config, false);
                    }
                    if (fArr == null || fArr.length != 20) {
                        bitmap = decodeByteArray;
                    } else {
                        int width = decodeByteArray.getWidth();
                        int height = decodeByteArray.getHeight();
                        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                        if (createBitmap == null) {
                            StringBuilder sb = new StringBuilder(60);
                            sb.append("Bitmap creation failed. width ");
                            sb.append(width);
                            sb.append(" height ");
                            sb.append(height);
                            bvoo.j(new Exception(sb.toString()));
                        } else {
                            Paint paint = new Paint();
                            paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(fArr)));
                            new Canvas(createBitmap).drawBitmap(decodeByteArray, 0.0f, 0.0f, paint);
                            bitmap = createBitmap;
                        }
                    }
                }
                if (bitmap == null) {
                    String valueOf = String.valueOf(alyhVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 36);
                    sb2.append("Can't load GLRaster bitmap for tile ");
                    sb2.append(valueOf);
                    bvoo.j(new Exception(sb2.toString()));
                    return;
                }
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                a = bnta.a().a(false);
                bitmap = !a ? bntv.e(bitmap, bitmap.getConfig(), false) : bitmap;
                int width3 = bitmap.getWidth();
                int height3 = bitmap.getHeight();
                this.a = bitmap.getByteCount();
                bntvVar = new bntv(new bnrf(bitmap), width2, height2, width3, height3, false);
            } catch (OutOfMemoryError e) {
                String valueOf2 = String.valueOf(alyhVar);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 36);
                sb3.append("Can't load GLRaster bitmap for tile ");
                sb3.append(valueOf2);
                sb3.toString();
                bvoo.j(e);
                return;
            }
        }
        amye amyeVar = new amye(bnrzVar, alyhVar, amqiVar.a, bnvoVar, z);
        String valueOf3 = String.valueOf(alyhVar);
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 7);
        sb4.append("Raster ");
        sb4.append(valueOf3);
        amyeVar.s = sb4.toString();
        if (amqgVar != null) {
            if (a) {
                c = c(0.0f, 1.0f, 0.0f, 1.0f, b);
            } else {
                c = c(bntvVar.a(), bntvVar.c(), bntvVar.b(), bntvVar.d(), b);
            }
            c.a(true);
            amyeVar.r(c);
            amyeVar.t(amqgVar);
        } else {
            if (a) {
                bntb bntbVar = bnsnVar.m;
                if (bntbVar.k == null) {
                    bntbVar.k = new bnvn("unit_square_strip", new float[]{0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f}, 17, 5);
                }
                amyeVar.r(bntbVar.k);
            } else {
                float a2 = bntvVar.a();
                float c2 = bntvVar.c();
                float b2 = bntvVar.b();
                float d = bntvVar.d();
                amyeVar.r(new bnvn("raster", new float[]{0.0f, 1.0f, 0.0f, a2, b2, 0.0f, 0.0f, 0.0f, a2, d, 1.0f, 1.0f, 0.0f, c2, b2, 1.0f, 0.0f, 0.0f, c2, d}, 17, 5));
            }
            amyeVar.t(bnvkVar);
        }
        amyeVar.e(0, new bnvl("raster", bntvVar, 2, 1));
        amyeVar.s(1, 771);
        amyeVar.u = 519;
        list.add(amyeVar);
        amyeVar.n(false);
    }

    public static byte a(ampw ampwVar, alwy alwyVar, int i) {
        ampv ampvVar = new ampv(alwyVar, i);
        int i2 = ampw.i(ampvVar, ampwVar.f, 4);
        if (i2 == 1) {
            ampwVar.j.add(new amql());
        } else if (i2 == 3) {
            bvoo.h("Number of raster styles exceeds the maximum of 4", new Object[0]);
            return (byte) 0;
        }
        return ampw.b(ampwVar.f, ampvVar);
    }

    @dzsi
    public static ampj b(alyh alyhVar, amqi amqiVar, alyr alyrVar, bnsn bnsnVar, bnrz bnrzVar, bnvk bnvkVar, amqg amqgVar, ampw ampwVar, List<bnsa> list) {
        alxi alxiVar = (alxi) alyrVar.next();
        byte[] bArr = alxiVar.a;
        if (bArr == null) {
            return null;
        }
        alxo b = ampwVar.b.b(alxiVar);
        if (!b.i) {
            return new ampj(bArr, 0, alyhVar, amqiVar, bnrzVar, null, b, bnvkVar, amqgVar, a(ampwVar, alxiVar.p, alxiVar.q), amye.k(alxiVar, b), true, list, bnsnVar);
        }
        return null;
    }

    private static bnvn c(float f, float f2, float f3, float f4, float f5) {
        return new bnvn("raster", new float[]{0.0f, 1.0f, 0.0f, f, f3, f5, 0.0f, 0.0f, 0.0f, f, f4, f5, 1.0f, 1.0f, 0.0f, f2, f3, f5, 1.0f, 0.0f, 0.0f, f2, f4, f5}, 2065, 5);
    }

    @Override // defpackage.ampc
    public final int d() {
        return this.a;
    }

    @Override // defpackage.ampc
    public final int e() {
        return 96;
    }
}
