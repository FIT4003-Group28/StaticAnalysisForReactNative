package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akel  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akel {
    public static boolean A(avhn avhnVar) {
        return avhnVar != null && avhnVar.c.size() > 0;
    }

    public static boolean B(avhn avhnVar) {
        return A(avhnVar) && ((avhm) avhnVar.c.get(0)).e == ((avhm) avhnVar.c.get(0)).d;
    }

    public static Bitmap C(ContentResolver contentResolver, Uri uri, Rect rect, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        int width = rect.width() / 2;
        int height = rect.height() / 2;
        while (i > 0 && width / options.inSampleSize > i && i2 > 0 && height / options.inSampleSize > i2) {
            int i3 = options.inSampleSize;
            options.inSampleSize = i3 + i3;
        }
        int aK = aK(contentResolver, uri);
        if (aK != 0) {
            Pair E = E(contentResolver, uri);
            Matrix matrix = new Matrix();
            matrix.postTranslate((-((Integer) E.first).intValue()) / 2, (-((Integer) E.second).intValue()) / 2);
            matrix.postRotate(-aK);
            if (aL(aK)) {
                matrix.postTranslate(((Integer) E.second).intValue() / 2, ((Integer) E.first).intValue() / 2);
            } else {
                matrix.postTranslate(((Integer) E.first).intValue() / 2, ((Integer) E.second).intValue() / 2);
            }
            RectF rectF = new RectF(rect);
            matrix.mapRect(rectF);
            rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(contentResolver.openInputStream(uri), false);
        try {
            try {
                Bitmap decodeRegion = newInstance.decodeRegion(rect, options);
                if (aK == 0) {
                    return decodeRegion;
                }
                Matrix matrix2 = new Matrix();
                matrix2.postRotate(aK);
                try {
                    return Bitmap.createBitmap(decodeRegion, 0, 0, decodeRegion.getWidth(), decodeRegion.getHeight(), matrix2, false);
                } finally {
                    decodeRegion.recycle();
                }
            } finally {
                newInstance.recycle();
            }
        } catch (IllegalArgumentException e) {
            Pair E2 = E(contentResolver, uri);
            String valueOf = String.valueOf(uri);
            String valueOf2 = String.valueOf(E2.first);
            String valueOf3 = String.valueOf(E2.second);
            String valueOf4 = String.valueOf(rect);
            int i4 = options.inSampleSize;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 113 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
            sb.append("Unexpected exception while cropping an image: ");
            sb.append(valueOf);
            sb.append(", size: ");
            sb.append(valueOf2);
            sb.append("x");
            sb.append(valueOf3);
            sb.append(", crop bounds: ");
            sb.append(valueOf4);
            sb.append(", scale: x");
            sb.append(i4);
            sb.append(", degrees: ");
            sb.append(aK);
            zep.d(sb.toString(), e);
            throw e;
        }
    }

    public static Bitmap D(Bitmap bitmap, ContentResolver contentResolver, Uri uri) {
        int aK = aK(contentResolver, uri);
        if (aK != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(aK);
            try {
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
            } finally {
                bitmap.recycle();
            }
        }
        return bitmap;
    }

    public static Pair E(ContentResolver contentResolver, Uri uri) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options);
        if (aL(aK(contentResolver, uri))) {
            return Pair.create(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        }
        return Pair.create(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    public static Bitmap F(ContentResolver contentResolver, Uri uri) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options);
        options.inSampleSize = 1;
        int i = options.outWidth / 2;
        int i2 = options.outHeight / 2;
        while (i / options.inSampleSize > 1024 && i2 / options.inSampleSize > 1024) {
            int i3 = options.inSampleSize;
            options.inSampleSize = i3 + i3;
        }
        options.inJustDecodeBounds = false;
        return D(BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options), contentResolver, uri);
    }

    public static int G(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int H(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static int I(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int J(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int K(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int L(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int M(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int N(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int O(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int P(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int Q(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static int R(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int S(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            default:
                return 0;
        }
    }

    public static int T(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int U(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int V(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int W(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int X(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int Y(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            default:
                return 0;
        }
    }

    public static int Z(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static View.OnLayoutChangeListener a(final TextView textView, final int i) {
        return new View.OnLayoutChangeListener() { // from class: akbo
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                TextView textView2 = textView;
                int i10 = i;
                Drawable drawable = textView2.getCompoundDrawablesRelative()[0];
                if (drawable != null) {
                    drawable.setBounds(0, 0, i10, i10);
                    textView2.setCompoundDrawablesRelative(drawable, null, null, null);
                    zgd.t(textView2, zgd.h(i10 + textView2.getPaddingTop() + textView2.getPaddingBottom()), ViewGroup.LayoutParams.class);
                }
            }
        };
    }

    public static int aA(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int aB(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int aC(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                return 0;
        }
    }

    public static int aD(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int aE(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static int aF(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int aG(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int aH(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
            default:
                return 0;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
        }
    }

    public static int aI(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    private static void aJ(ajru ajruVar, View view, ajsa ajsaVar) {
        ajrs f = f(view);
        if (f != null) {
            f.h();
        }
        ajsaVar.getClass();
        ajruVar.qZ(ajsaVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
        if (r3 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
        if (r3 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int aK(android.content.ContentResolver r10, android.net.Uri r11) {
        /*
            java.lang.String r0 = "orientation"
            r1 = 0
            aow r2 = new aow     // Catch: java.io.IOException -> L57
            java.io.InputStream r3 = r10.openInputStream(r11)     // Catch: java.io.IOException -> L57
            r2.<init>(r3)     // Catch: java.io.IOException -> L57
            int r2 = r2.b()     // Catch: java.io.IOException -> L57
            switch(r2) {
                case 1: goto L21;
                case 2: goto L13;
                case 3: goto L1e;
                case 4: goto L1e;
                case 5: goto L1b;
                case 6: goto L1b;
                case 7: goto L18;
                case 8: goto L18;
                default: goto L13;
            }
        L13:
            r2 = 1
            r3 = 0
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L46
            goto L22
        L18:
            r10 = -90
            return r10
        L1b:
            r10 = 90
            return r10
        L1e:
            r10 = 180(0xb4, float:2.52E-43)
            return r10
        L21:
            return r1
        L22:
            r6[r1] = r0     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L46
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r10
            r5 = r11
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L46
            if (r3 == 0) goto L48
            boolean r10 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L46
            if (r10 == 0) goto L48
            int r10 = r3.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L46
            r11 = -1
            if (r10 == r11) goto L48
            int r10 = r3.getInt(r10)     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L46
            r3.close()     // Catch: java.io.IOException -> L57
            return r10
        L44:
            r10 = move-exception
            goto L4e
        L46:
            goto L54
        L48:
            if (r3 == 0) goto L57
        L4a:
            r3.close()     // Catch: java.io.IOException -> L57
            goto L57
        L4e:
            if (r3 == 0) goto L53
            r3.close()     // Catch: java.io.IOException -> L57
        L53:
            throw r10     // Catch: java.io.IOException -> L57
        L54:
            if (r3 == 0) goto L57
            goto L4a
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akel.aK(android.content.ContentResolver, android.net.Uri):int");
    }

    private static boolean aL(int i) {
        return Math.abs(i % 180) == 90;
    }

    public static int aa(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int ab(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int ac(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static /* synthetic */ String ad(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "HANDOFF_ACTION_STATE_CANCELED" : "HANDOFF_ACTION_STATE_ACCEPTED" : "HANDOFF_ACTION_STATE_FINISHED" : "HANDOFF_ACTION_STATE_PENDING" : "HANDOFF_ACTION_STATE_UNKNOWN";
    }

    public static int ae(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int af(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int ag(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            default:
                return 0;
        }
    }

    public static String ah(int i) {
        return Integer.toString(i - 1);
    }

    public static int ai(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                return 0;
        }
    }

    public static int aj(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
            default:
                return 0;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
        }
    }

    public static int ak(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static int al(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int am(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int an(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                return 0;
        }
    }

    public static int ao(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int ap(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static int aq(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int ar(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int as(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int at(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            default:
                return 0;
        }
    }

    public static int au(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static int av(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int aw(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int ax(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int ay(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int az(int i) {
        if (i != 90) {
            switch (i) {
                case 0:
                    return 1;
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 5;
                case 5:
                    return 6;
                case 6:
                    return 7;
                case 7:
                    return 8;
                case 8:
                    return 9;
                case 9:
                    return 10;
                default:
                    return 0;
            }
        }
        return 91;
    }

    static int b(Context context) {
        try {
            int m = zhn.m(context);
            if (m == 0) {
                return 1;
            }
            if (m != 1) {
                throw new akes(m);
            }
            return 2;
        } catch (Resources.NotFoundException e) {
            throw new aker(e);
        }
    }

    public static akep c(Context context) {
        context.getClass();
        return b(context) + (-1) != 0 ? akeo.a : akeo.b;
    }

    public static int d(View view) {
        view.getClass();
        Object tag = view.getTag(R.id.presenter_adapter_viewtype_tag);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public static ajrs e(View view) {
        ajrs f = f(view);
        if (f == null) {
            f = new ajrs();
            l(view, f);
        }
        f.h();
        return f;
    }

    public static ajrs f(View view) {
        view.getClass();
        Object tag = view.getTag(R.id.presenter_adapter_context_tag);
        if (tag instanceof ajrs) {
            return (ajrs) tag;
        }
        return null;
    }

    public static ajru g(View view) {
        view.getClass();
        Object tag = view.getTag(R.id.presenter_adapter_tag);
        if (tag instanceof ajru) {
            return (ajru) tag;
        }
        return null;
    }

    public static ajru h(ajsa ajsaVar, Object obj, ViewGroup viewGroup) {
        ajsaVar.getClass();
        obj.getClass();
        int c = ajsaVar.c(obj);
        if (c == -1) {
            return null;
        }
        return ajsaVar.e(c, viewGroup);
    }

    public static ampq i(ajsa ajsaVar, Object obj, ViewGroup viewGroup) {
        ajru h = h(ajsaVar, obj, viewGroup);
        if (h == null) {
            return amon.a;
        }
        n(h.a(), h, ajsaVar.c(obj));
        return ampq.j(h);
    }

    public static void j(View view, ajsa ajsaVar) {
        view.getClass();
        ajru g = g(view);
        if (g != null) {
            aJ(g, view, ajsaVar);
        }
    }

    public static void k(ajru ajruVar, ajsa ajsaVar) {
        ajruVar.getClass();
        aJ(ajruVar, ajruVar.a(), ajsaVar);
    }

    public static void l(View view, ajrs ajrsVar) {
        view.getClass();
        view.setTag(R.id.presenter_adapter_context_tag, ajrsVar);
    }

    public static void m(View view, ajru ajruVar) {
        view.getClass();
        view.setTag(R.id.presenter_adapter_tag, ajruVar);
    }

    public static void n(View view, ajru ajruVar, int i) {
        view.getClass();
        view.setTag(R.id.presenter_adapter_tag, ajruVar);
        view.setTag(R.id.presenter_adapter_viewtype_tag, Integer.valueOf(i));
    }

    public static final ajnj o(yys yysVar, ImageView imageView) {
        yysVar.getClass();
        imageView.getClass();
        return new ajnj(yysVar, imageView);
    }

    public static float p(avhn avhnVar) {
        float f = -1.0f;
        if (A(avhnVar)) {
            for (avhm avhmVar : avhnVar.c) {
                int i = avhmVar.e;
                if (i != 0) {
                    float f2 = avhmVar.d / i;
                    if (f2 > f) {
                        f = f2;
                    }
                }
            }
        }
        return f;
    }

    public static Uri q(avhn avhnVar) {
        avhm u = u(avhnVar);
        if (u == null) {
            return null;
        }
        return zgt.j(u.c);
    }

    public static Uri r(avhn avhnVar, int i, int i2) {
        avhm w = w(avhnVar, i, i2);
        if (w == null || (w.b & 1) == 0) {
            return null;
        }
        return zgt.j(w.c);
    }

    public static Uri s(avhn avhnVar, int i) {
        avhm x = x(avhnVar, i);
        if (x == null) {
            return null;
        }
        return zgt.j(x.c);
    }

    public static Uri t(avhn avhnVar) {
        avhm y = y(avhnVar);
        if (y != null) {
            return zgt.j(y.c);
        }
        return null;
    }

    public static avhm u(avhn avhnVar) {
        if (!A(avhnVar)) {
            return null;
        }
        return (avhm) avhnVar.c.get(avhnVar.c.size() - 1);
    }

    public static avhm v(avhn avhnVar, int i, int i2) {
        boolean z = true;
        int i3 = 0;
        aqxo.p(i > 0);
        if (i2 <= 0) {
            z = false;
        }
        aqxo.p(z);
        avhm avhmVar = null;
        if (A(avhnVar)) {
            for (avhm avhmVar2 : avhnVar.c) {
                int i4 = avhmVar2.d;
                int i5 = avhmVar2.e;
                double d = i4;
                double d2 = i5;
                double d3 = i;
                double d4 = i2;
                Double.isNaN(d3);
                Double.isNaN(d4);
                double d5 = d3 / d4;
                Double.isNaN(d);
                Double.isNaN(d2);
                if (d / d2 > d5) {
                    Double.isNaN(d2);
                    i4 = (int) Math.round(d2 * d5);
                } else {
                    Double.isNaN(d);
                    i5 = (int) Math.round(d / d5);
                }
                int i6 = i - i4;
                int i7 = i2 - i5;
                int i8 = (i6 * i6) + (i7 * i7);
                if (avhmVar == null || i8 < i3) {
                    avhmVar = avhmVar2;
                    i3 = i8;
                }
            }
        }
        return avhmVar;
    }

    public static avhm w(avhn avhnVar, int i, int i2) {
        boolean z = true;
        int i3 = 0;
        aqxo.p(i >= 0);
        if (i2 < 0) {
            z = false;
        }
        aqxo.p(z);
        avhm avhmVar = null;
        if (A(avhnVar)) {
            for (avhm avhmVar2 : avhnVar.c) {
                int i4 = i - avhmVar2.d;
                int i5 = i2 - avhmVar2.e;
                int i6 = (i4 * i4) + (i5 * i5);
                if (avhmVar == null || i6 < i3) {
                    avhmVar = avhmVar2;
                    i3 = i6;
                }
            }
        }
        return avhmVar;
    }

    public static avhm x(avhn avhnVar, int i) {
        if (!A(avhnVar)) {
            return null;
        }
        if (i <= 0) {
            return (avhm) avhnVar.c.get(0);
        }
        for (avhm avhmVar : avhnVar.c) {
            if (avhmVar.d >= i) {
                return avhmVar;
            }
        }
        return (avhm) avhnVar.c.get(avhnVar.c.size() - 1);
    }

    public static avhm y(avhn avhnVar) {
        if (!A(avhnVar)) {
            return null;
        }
        return (avhm) avhnVar.c.get(0);
    }

    public static avhn z(Uri uri) {
        if (uri == null) {
            return null;
        }
        aopc aopcVar = (aopc) avhn.a.createBuilder();
        aopa createBuilder = avhm.a.createBuilder();
        String uri2 = uri.toString();
        createBuilder.copyOnWrite();
        avhm avhmVar = (avhm) createBuilder.instance;
        uri2.getClass();
        avhmVar.b |= 1;
        avhmVar.c = uri2;
        aopcVar.cw(createBuilder);
        return (avhn) aopcVar.mo39build();
    }
}
