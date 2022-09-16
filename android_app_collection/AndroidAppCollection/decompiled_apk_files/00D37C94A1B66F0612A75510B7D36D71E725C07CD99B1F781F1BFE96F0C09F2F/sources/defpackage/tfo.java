package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.facebook.yoga.YogaEdge;
import com.google.android.gms.cast.ApplicationMetadata;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: tfo  reason: default package */
/* loaded from: classes4.dex */
public class tfo {
    private static void A(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long y = y(bArr, i);
        long y2 = y(bArr, i + 8);
        long y3 = y(bArr, i + 16);
        long y4 = y(bArr, i + 24);
        long j3 = j + y;
        long rotateRight = Long.rotateRight(j2 + j3 + y4, 21);
        long j4 = y2 + j3 + y3;
        long rotateRight2 = Long.rotateRight(j4, 44);
        jArr[0] = j4 + y4;
        jArr[1] = rotateRight + rotateRight2 + j3;
    }

    public static float g(float f, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, f, displayMetrics);
    }

    public static int h(float f, DisplayMetrics displayMetrics) {
        return czu.f(TypedValue.applyDimension(1, f, displayMetrics));
    }

    public static int i(Resources resources, aodr aodrVar) {
        if (aodrVar == null || aodrVar.c() != 1 || aodrVar.b() <= 0.0f) {
            return -1;
        }
        return h(aodrVar.b(), resources.getDisplayMetrics());
    }

    public static void j(aodt aodtVar, tfn tfnVar) {
        aodr aodrVar = new aodr();
        boolean z = true;
        v(aodtVar.t(aodrVar) != null, YogaEdge.ALL, aodrVar, tfnVar);
        v(aodtVar.z(aodrVar) != null, YogaEdge.HORIZONTAL, aodrVar, tfnVar);
        v(aodtVar.J(aodrVar) != null, YogaEdge.VERTICAL, aodrVar, tfnVar);
        v(aodtVar.F(aodrVar) != null, YogaEdge.START, aodrVar, tfnVar);
        v(aodtVar.x(aodrVar) != null, YogaEdge.END, aodrVar, tfnVar);
        v(aodtVar.H(aodrVar) != null, YogaEdge.TOP, aodrVar, tfnVar);
        v(aodtVar.D(aodrVar) != null, YogaEdge.RIGHT, aodrVar, tfnVar);
        v(aodtVar.v(aodrVar) != null, YogaEdge.BOTTOM, aodrVar, tfnVar);
        if (aodtVar.B(aodrVar) == null) {
            z = false;
        }
        v(z, YogaEdge.LEFT, aodrVar, tfnVar);
    }

    public static void k(tdp tdpVar, View view) {
        tdpVar.d(view);
    }

    public static Uri l(String str) {
        Uri parse = Uri.parse(str);
        return amps.e(parse.getScheme()) ? parse.buildUpon().scheme("https").build() : parse;
    }

    public static ImageView.ScaleType m(int i) {
        return i != 2 ? i != 3 ? i != 4 ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.CENTER_INSIDE;
    }

    public static boolean n(Context context) {
        Context baseContext;
        if (context instanceof Activity) {
            return ((Activity) context).isDestroyed();
        }
        return (context instanceof ContextWrapper) && (baseContext = ((ContextWrapper) context).getBaseContext()) != null && n(baseContext);
    }

    public static cgd o(Context context, aodt aodtVar, aodt aodtVar2, aodt aodtVar3, int i, int i2) {
        cpi cpiVar;
        if (!n(context)) {
            cgd d = (aodtVar.aa() != 0 || aodtVar.aC() == null) ? null : cfk.c(context).d(new BitmapDrawable(context.getResources(), Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8)));
            if (d == null) {
                axnb j = tgo.j(aodtVar, i, i2);
                d = (j == null || TextUtils.isEmpty(j.m())) ? null : cfk.c(context).c().f(l(j.m()));
            }
            if (d == null) {
                int c = tbz.c(context, aodtVar);
                d = c == 0 ? null : cfk.c(context).e(Integer.valueOf(c));
            }
            if (d == null) {
                ampq c2 = tck.c(aodtVar);
                d = c2.h() ? cfk.c(context).g((byte[]) c2.c()) : null;
            }
            if (d == null) {
                if (aodtVar3 == null) {
                    return null;
                }
                d = cfk.c(context).f(null);
            }
            if (aodtVar.Y() == 4) {
                ((cgd) d.s(ckb.b)).y(CellularSignalStrengthError.ERROR_NOT_SUPPORTED, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            } else {
                if (aodtVar.Y() == 2) {
                    cpiVar = cpi.b;
                } else {
                    cpiVar = cpi.c;
                }
                d.u(cpiVar);
            }
            if (aodtVar2 != null) {
                int c3 = tbz.c(context, aodtVar2);
                if (c3 != 0) {
                    d.z(c3);
                } else {
                    ampq c4 = tck.c(aodtVar2);
                    if (c4.h()) {
                        d.A(tck.a(context, (byte[]) c4.c()));
                    }
                }
            }
            if (aodtVar3 != null) {
                int c5 = tbz.c(context, aodtVar3);
                if (c5 != 0) {
                    d.v(c5);
                } else {
                    ampq c6 = tck.c(aodtVar3);
                    if (c6.h()) {
                        d.w(tck.a(context, (byte[]) c6.c()));
                    }
                }
            }
            return d;
        }
        return null;
    }

    public static void p(Drawable drawable, aodt aodtVar) {
        if (aodtVar.aa() != 0) {
            int i = 0;
            if (aodtVar.ab(0).aI() == null || aodtVar.ab(0).aI().r() == 0) {
                return;
            }
            if (aodtVar.ab(0).aI() != null) {
                i = (int) aodtVar.ab(0).aI().r();
            }
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
    }

    public static Map q(tcm tcmVar, aflw aflwVar) {
        tdt tdtVar;
        HashMap hashMap = null;
        if (tcmVar.b() && (tdtVar = (tdt) aflwVar.f(tdt.class)) != null) {
            hashMap = new HashMap();
            String str = tdtVar.a;
            if (str != null) {
                hashMap.put("CellLogId", str);
            }
            String str2 = tdtVar.c;
            if (str2 != null) {
                hashMap.put("CELL_NODE_ID", str2);
            }
        }
        return hashMap;
    }

    public static boolean r(int[] iArr) {
        return iArr == null || iArr.length == 0;
    }

    public static long s(byte[] bArr) {
        int length = bArr.length;
        int i = 37;
        char c = 0;
        if (length <= 32) {
            if (length > 16) {
                long j = (length + length) - 7286425919675154353L;
                long y = y(bArr, 0) * (-5435081209227447693L);
                long y2 = y(bArr, 8);
                long y3 = y(bArr, length - 8) * j;
                return x(Long.rotateRight(y + y2, 43) + Long.rotateRight(y3, 30) + (y(bArr, length - 16) * (-7286425919675154353L)), y + Long.rotateRight(y2 - 7286425919675154353L, 18) + y3, j);
            } else if (length >= 8) {
                long j2 = (length + length) - 7286425919675154353L;
                long y4 = y(bArr, 0) - 7286425919675154353L;
                long y5 = y(bArr, length - 8);
                return x((Long.rotateRight(y5, 37) * j2) + y4, (Long.rotateRight(y4, 25) + y5) * j2, j2);
            } else if (length >= 4) {
                return x(length + ((w(bArr, 0) & 4294967295L) << 3), w(bArr, length - 4) & 4294967295L, (length + length) - 7286425919675154353L);
            } else {
                if (length <= 0) {
                    return -7286425919675154353L;
                }
                return (-7286425919675154353L) * z((((bArr[0] & 255) + ((bArr[length >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((length + ((bArr[length - 1] & 255) << 2)) * (-4348849565147123417L)));
            }
        } else if (length <= 64) {
            long j3 = (length + length) - 7286425919675154353L;
            long y6 = y(bArr, 0) * (-7286425919675154353L);
            long y7 = y(bArr, 8);
            long y8 = y(bArr, length - 8) * j3;
            long rotateRight = Long.rotateRight(y6 + y7, 43) + Long.rotateRight(y8, 30) + (y(bArr, length - 16) * (-7286425919675154353L));
            long rotateRight2 = Long.rotateRight(y7 - 7286425919675154353L, 18);
            long y9 = y(bArr, 16) * j3;
            long y10 = y(bArr, 24);
            long y11 = (rotateRight + y(bArr, length - 32)) * j3;
            return x(Long.rotateRight(y9 + y10, 43) + Long.rotateRight(y11, 30) + ((x(rotateRight, rotateRight2 + y6 + y8, j3) + y(bArr, length - 24)) * j3), y9 + Long.rotateRight(y10 + y6, 18) + y11, j3);
        } else {
            long z = z(-7956866745689871395L) * (-7286425919675154353L);
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            long y12 = y(bArr, 0) + 95310865018149119L;
            int i2 = length - 1;
            int i3 = (i2 >> 6) * 64;
            int i4 = i2 & 63;
            int i5 = (i3 + i4) - 63;
            long j4 = 2480279821605975764L;
            int i6 = 0;
            while (true) {
                long rotateRight3 = Long.rotateRight(y12 + j4 + jArr[c] + y(bArr, i6 + 8), i);
                long rotateRight4 = Long.rotateRight(j4 + jArr[1] + y(bArr, i6 + 48), 42);
                long j5 = (rotateRight3 * (-5435081209227447693L)) ^ jArr2[1];
                long y13 = (rotateRight4 * (-5435081209227447693L)) + jArr[c] + y(bArr, i6 + 40);
                long rotateRight5 = Long.rotateRight(z + jArr2[c], 33) * (-5435081209227447693L);
                int i7 = i4;
                int i8 = i3;
                A(bArr, i6, jArr[1] * (-5435081209227447693L), j5 + jArr2[c], jArr);
                A(bArr, i6 + 32, rotateRight5 + jArr2[1], y(bArr, i6 + 16) + y13, jArr2);
                int i9 = i6 + 64;
                if (i9 == i8) {
                    long j6 = j5 & 255;
                    long j7 = (-5435081209227447693L) + j6 + j6;
                    long j8 = jArr2[0] + i7;
                    long j9 = jArr[0] + j8;
                    jArr[0] = j9;
                    jArr2[0] = j8 + j9;
                    long rotateRight6 = Long.rotateRight(rotateRight5 + y13 + j9 + y(bArr, i5 + 8), 37);
                    long rotateRight7 = Long.rotateRight(y13 + jArr[1] + y(bArr, i5 + 48), 42);
                    long j10 = (rotateRight6 * j7) ^ (jArr2[1] * 9);
                    long y14 = (rotateRight7 * j7) + (jArr[0] * 9) + y(bArr, i5 + 40);
                    long rotateRight8 = Long.rotateRight(j5 + jArr2[0], 33) * j7;
                    A(bArr, i5, jArr[1] * j7, jArr2[0] + j10, jArr);
                    A(bArr, i5 + 32, rotateRight8 + jArr2[1], y(bArr, i5 + 16) + y14, jArr2);
                    return x(x(jArr[0], jArr2[0], j7) + (z(y14) * (-4348849565147123417L)) + j10, x(jArr[1], jArr2[1], j7) + rotateRight8, j7);
                }
                i6 = i9;
                i3 = i8;
                z = j5;
                y12 = rotateRight5;
                i4 = i7;
                c = 0;
                j4 = y13;
                i = 37;
            }
        }
    }

    public static String u(String str, Collection collection) {
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String upperCase = str.toUpperCase();
        if (!upperCase.matches("[A-F0-9]+")) {
            throw new IllegalArgumentException(str.length() != 0 ? "Invalid application ID: ".concat(str) : new String("Invalid application ID: "));
        }
        sb.append("/");
        sb.append(upperCase);
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            sb.append("/");
            Iterator it = collection.iterator();
            boolean z = true;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                qpl.i(str2);
                if (!z) {
                    sb.append(",");
                }
                if (!qpl.a.matcher(str2).matches()) {
                    StringBuilder sb2 = new StringBuilder(str2.length());
                    for (int i = 0; i < str2.length(); i++) {
                        char charAt = str2.charAt(i);
                        if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                            sb2.append(String.format("%%%04x", Integer.valueOf(charAt)));
                        } else {
                            sb2.append(charAt);
                        }
                    }
                    str2 = sb2.toString();
                }
                sb.append(str2);
                z = false;
            }
        }
        if (collection == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }

    private static void v(boolean z, YogaEdge yogaEdge, aodr aodrVar, tfn tfnVar) {
        if (z) {
            tfnVar.a(yogaEdge, aodrVar);
        }
    }

    private static int w(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static long x(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static long y(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    private static long z(long j) {
        return j ^ (j >>> 47);
    }

    public void a(int i) {
    }

    public void b(int i) {
    }

    public void c(ApplicationMetadata applicationMetadata) {
    }

    public void d() {
    }

    public void e(int i) {
    }

    public void f() {
    }

    public static String t(String str) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        return u(str, null);
    }
}
