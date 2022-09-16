package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: pvd  reason: default package */
/* loaded from: classes4.dex */
public final class pvd extends pvi {
    private final AtomicReference f;
    private static final int[] e = new int[0];
    public static final amxr a = amxr.b(fay.k);
    public static final amxr b = amxr.b(fay.l);

    @Deprecated
    public pvd() {
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = DefaultTrackSelector$Parameters.a;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int c(Format format, String str, boolean z) {
        if (TextUtils.isEmpty(str) || !str.equals(format.c)) {
            String d = d(str);
            String d2 = d(format.c);
            if (d2 == null || d == null) {
                return (!z || d2 != null) ? 0 : 1;
            } else if (d2.startsWith(d) || d.startsWith(d2)) {
                return 3;
            } else {
                return pxi.aa(d2, "-")[0].equals(pxi.aa(d, "-")[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String d(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean e(int i, boolean z) {
        int c = pku.c(i);
        return c == 4 || (z && c == 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List g(com.google.android.exoplayer2.source.TrackGroup r12, int r13, int r14, boolean r15) {
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
            int r6 = defpackage.pxi.b(r11, r6)
            r7.<init>(r9, r6)
            goto L5e
        L54:
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = defpackage.pxi.b(r10, r7)
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
            int r15 = r15.a()
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvd.g(com.google.android.exoplayer2.source.TrackGroup, int, int, boolean):java.util.List");
    }

    private static boolean h(Format format, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if ((format.e & 16384) == 0 && e(i, false) && (i & i2) != 0 && ((str == null || pxi.M(format.l, str)) && (((i11 = format.q) == -1 || (i7 <= i11 && i11 <= i3)) && ((i12 = format.r) == -1 || (i8 <= i12 && i12 <= i4))))) {
            float f = format.s;
            if ((f == -1.0f || (i9 <= f && f <= i5)) && (i13 = format.h) != -1 && i10 <= i13 && i13 <= i6) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0159 A[LOOP:1: B:23:0x0044->B:64:0x0159, LOOP_END] */
    @Override // defpackage.pvi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final android.util.Pair f(defpackage.pvh r42, int[][][] r43, int[] r44) {
        /*
            Method dump skipped, instructions count: 1871
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvd.f(pvh, int[][][], int[]):android.util.Pair");
    }

    public pvd(Context context) {
        this.f = new AtomicReference(DefaultTrackSelector$Parameters.a(context));
    }
}
