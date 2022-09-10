package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: cvow  reason: default package */
/* loaded from: classes5.dex */
public final class cvow {
    static final long[] a = {0};
    public final Context b;
    public final cvoy c;
    public final cvor d;
    public final cvjt e;
    private final cvly f;
    private final dxio<cvma> g;
    private final cvlr h;

    public cvow(Context context, cvjs cvjsVar, cvly cvlyVar, cvoy cvoyVar, dxio dxioVar, cvor cvorVar, cvlr cvlrVar) {
        this.b = context;
        this.f = cvlyVar;
        this.c = cvoyVar;
        this.g = dxioVar;
        this.d = cvorVar;
        this.h = cvlrVar;
        this.e = cvjsVar.e();
    }

    public static final CharSequence e(String str) {
        return alq.a(str, 63);
    }

    private final List<Future<Bitmap>> f(@dzsi cvkc cvkcVar, List<dscx> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (dscx dscxVar : list) {
            if (!dscxVar.a.isEmpty() || !dscxVar.b.isEmpty()) {
                String str = dscxVar.a;
                String str2 = dscxVar.b;
                arrayList.add(this.g.a().a(str, i, i2));
                if (arrayList.size() >= 4) {
                    break;
                }
            }
        }
        return arrayList;
    }

    private final Bitmap g(dsch dschVar, List<Bitmap> list) {
        if (!list.isEmpty()) {
            int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.notifications_icon_size);
            int a2 = dscc.a(dschVar.r);
            if (a2 == 0) {
                a2 = 1;
            }
            if (a2 - 1 != 2) {
                return this.f.a(dimensionPixelSize, list);
            }
            return this.f.b(dimensionPixelSize, list);
        }
        return null;
    }

    private static List<Bitmap> h(List<Future<Bitmap>> list, cvix cvixVar) {
        ArrayList arrayList = new ArrayList();
        if (cvixVar.f()) {
            for (Future<Bitmap> future : list) {
                try {
                    Bitmap bitmap = future.get();
                    if (bitmap != null) {
                        arrayList.add(bitmap);
                    }
                } catch (InterruptedException unused) {
                    cvlw.e("NotificationBuilderHelper", "Failed to download image", new Object[0]);
                    Thread.currentThread().interrupt();
                } catch (CancellationException | ExecutionException unused2) {
                    cvlw.e("NotificationBuilderHelper", "Failed to download image.", new Object[0]);
                }
            }
        } else {
            for (Future<Bitmap> future2 : list) {
                try {
                    Bitmap bitmap2 = future2.get(cvixVar.g(), TimeUnit.MILLISECONDS);
                    if (bitmap2 != null) {
                        arrayList.add(bitmap2);
                    }
                } catch (InterruptedException unused3) {
                    cvlw.e("NotificationBuilderHelper", "Failed to download image, remaining time: %d ms.", Long.valueOf(cvixVar.g()));
                    Thread.currentThread().interrupt();
                } catch (CancellationException | ExecutionException | TimeoutException unused4) {
                    cvlw.e("NotificationBuilderHelper", "Failed to download image, remaining time: %d ms.", Long.valueOf(cvixVar.g()));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ib a(java.lang.String r21, @defpackage.dzsi defpackage.cvkc r22, defpackage.cvkj r23, boolean r24, defpackage.cvix r25, @defpackage.dzsi defpackage.cvte r26) {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvow.a(java.lang.String, cvkc, cvkj, boolean, cvix, cvte):ib");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.ib r3, defpackage.dsch r4, boolean r5) {
        /*
            r2 = this;
            if (r5 != 0) goto L16
            cvjt r0 = r2.e
            boolean r0 = r0.f()
            if (r0 == 0) goto L16
            dsce r0 = r4.j
            if (r0 != 0) goto L10
            dsce r0 = defpackage.dsce.f
        L10:
            boolean r0 = r0.b
            if (r0 != 0) goto L16
            r0 = 2
            goto L1c
        L16:
            long[] r0 = defpackage.cvow.a
            r3.y(r0)
            r0 = 0
        L1c:
            if (r5 != 0) goto L44
            cvjt r1 = r2.e
            boolean r1 = r1.d()
            if (r1 == 0) goto L44
            dsce r1 = r4.j
            if (r1 != 0) goto L2c
            dsce r1 = defpackage.dsce.f
        L2c:
            boolean r1 = r1.c
            if (r1 != 0) goto L44
            cvjt r1 = r2.e
            android.net.Uri r1 = r1.e()
            if (r1 == 0) goto L42
            cvjt r1 = r2.e
            android.net.Uri r1 = r1.e()
            r3.u(r1)
            goto L44
        L42:
            r0 = r0 | 1
        L44:
            if (r5 != 0) goto L74
            cvjt r5 = r2.e
            boolean r5 = r5.g()
            if (r5 == 0) goto L74
            dsce r4 = r4.j
            if (r4 != 0) goto L54
            dsce r4 = defpackage.dsce.f
        L54:
            boolean r4 = r4.d
            if (r4 != 0) goto L74
            cvjt r4 = r2.e
            java.lang.Integer r4 = r4.h()
            if (r4 == 0) goto L72
            cvjt r4 = r2.e
            java.lang.Integer r4 = r4.h()
            int r4 = r4.intValue()
            r5 = 1000(0x3e8, float:1.401E-42)
            r1 = 9000(0x2328, float:1.2612E-41)
            r3.p(r4, r5, r1)
            goto L74
        L72:
            r0 = r0 | 4
        L74:
            r3.m(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvow.b(ib, dsch, boolean):void");
    }

    public final void c(ib ibVar, @dzsi cvkc cvkcVar, int i) {
        String string = this.b.getString(this.e.b().intValue());
        String quantityString = this.b.getResources().getQuantityString(R.plurals.public_notification_text, i, Integer.valueOf(i));
        ib ibVar2 = new ib(this.b);
        ibVar2.l(string);
        ibVar2.k(quantityString);
        ibVar2.t(this.e.a().intValue());
        if (cvkcVar != null) {
            ibVar2.w(cvkcVar.b());
        }
        if (this.e.c() != null) {
            ibVar2.B = this.b.getResources().getColor(this.e.c().intValue());
        }
        ibVar.D = ibVar2.b();
    }

    @dzsi
    public final String d(cvkc cvkcVar, List<cvkj> list) {
        HashSet hashSet = new HashSet();
        int i = 0;
        for (cvkj cvkjVar : list) {
            dsch d = cvkjVar.d();
            if ((d.a & 131072) != 0) {
                hashSet.add(d.t);
            } else {
                i++;
            }
        }
        if (hashSet.size() != 1 || i != 0) {
            if (cvkcVar != null && this.e.i()) {
                return cvkcVar.b();
            }
            return null;
        }
        return (String) hashSet.iterator().next();
    }
}
