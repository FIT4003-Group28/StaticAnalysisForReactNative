package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: cmjh  reason: default package */
/* loaded from: classes5.dex */
public final class cmjh extends cmjk {
    private final AtomicReference<DefaultTrackSelector$Parameters> e;
    private static final int[] d = new int[0];
    public static final dclu<Integer> a = dclu.d(cmiy.a);
    public static final dclu<Integer> b = dclu.d(cmiz.a);

    @Deprecated
    public cmjh() {
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = DefaultTrackSelector$Parameters.a;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean a(int i, boolean z) {
        int a2 = clom.a(i);
        return a2 == 4 || (z && a2 == 3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String b(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int c(Format format, String str, boolean z) {
        if (TextUtils.isEmpty(str) || !str.equals(format.c)) {
            String b2 = b(str);
            String b3 = b(format.c);
            if (b3 == null || b2 == null) {
                return (!z || b3 != null) ? 0 : 1;
            } else if (b3.startsWith(b2) || b2.startsWith(b3)) {
                return 3;
            } else {
                return cmny.v(b3, "-")[0].equals(cmny.v(b2, "-")[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    private static boolean e(Format format, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if ((format.e & 16384) == 0 && a(i, false) && (i & i2) != 0) {
            if (str != null && !cmny.b(format.l, str)) {
                return false;
            }
            int i11 = format.q;
            if (i11 != -1 && (i7 > i11 || i11 > i3)) {
                return false;
            }
            int i12 = format.r;
            if (i12 != -1 && (i8 > i12 || i12 > i4)) {
                return false;
            }
            float f = format.s;
            if (f != -1.0f && (i9 > f || f > i5)) {
                return false;
            }
            int i13 = format.h;
            if (i13 == -1) {
                return true;
            }
            return i10 <= i13 && i13 <= i6;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<java.lang.Integer> f(com.google.android.exoplayer2.source.TrackGroup r12, int r13, int r14, boolean r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.a
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L9:
            int r3 = r12.a
            if (r2 >= r3) goto L17
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L9
        L17:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto La5
            if (r14 == r2) goto La5
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L22:
            int r5 = r12.a
            if (r3 >= r5) goto L7f
            com.google.android.exoplayer2.Format r5 = r12.a(r3)
            int r6 = r5.q
            if (r6 <= 0) goto L7c
            int r7 = r5.r
            if (r7 <= 0) goto L7c
            if (r15 == 0) goto L42
            r8 = 1
            if (r6 > r7) goto L39
            r9 = 0
            goto L3a
        L39:
            r9 = 1
        L3a:
            if (r13 > r14) goto L3d
            r8 = 0
        L3d:
            if (r9 == r8) goto L42
            r8 = r13
            r9 = r14
            goto L44
        L42:
            r9 = r13
            r8 = r14
        L44:
            int r10 = r6 * r8
            int r11 = r7 * r9
            if (r10 < r11) goto L54
            android.graphics.Point r7 = new android.graphics.Point
            int r6 = defpackage.cmny.A(r11, r6)
            r7.<init>(r9, r6)
            goto L5e
        L54:
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = defpackage.cmny.A(r10, r7)
            r6.<init>(r7, r8)
            r7 = r6
        L5e:
            int r6 = r5.q
            int r8 = r5.r
            int r8 = r8 * r6
            int r9 = r7.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r6 < r9) goto L7c
            int r5 = r5.r
            int r6 = r7.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L7c
            if (r8 >= r4) goto L7c
            r4 = r8
        L7c:
            int r3 = r3 + 1
            goto L22
        L7f:
            if (r4 == r2) goto La5
            int r13 = r0.size()
            r14 = -1
            int r13 = r13 + r14
        L87:
            if (r13 < 0) goto La5
            java.lang.Object r15 = r0.get(r13)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            com.google.android.exoplayer2.Format r15 = r12.a(r15)
            int r15 = r15.c()
            if (r15 == r14) goto L9f
            if (r15 <= r4) goto La2
        L9f:
            r0.remove(r13)
        La2:
            int r13 = r13 + (-1)
            goto L87
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmjh.f(com.google.android.exoplayer2.source.TrackGroup, int, int, boolean):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0159 A[LOOP:1: B:23:0x0044->B:64:0x0159, LOOP_END] */
    @Override // defpackage.cmjk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<defpackage.cloo[], defpackage.cmjm[]> d(defpackage.cmjj r42, int[][][] r43, int[] r44) {
        /*
            Method dump skipped, instructions count: 1904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmjh.d(cmjj, int[][][], int[]):android.util.Pair");
    }

    public cmjh(Context context) {
        this.e = new AtomicReference<>(DefaultTrackSelector$Parameters.a(context));
    }
}
