package com.facebook.g.a;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
/* compiled from: StaticLayoutHelper.java */
/* loaded from: classes.dex */
class b {
    private static StaticLayout b(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, android.support.v4.h.b bVar) {
        try {
            return com.facebook.g.a.b.a.a(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, bVar);
        } catch (LinkageError unused) {
            return a(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4);
        }
    }

    private static StaticLayout a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4) {
        return new StaticLayout(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4);
    }

    public static StaticLayout a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, android.support.v4.h.b bVar) {
        int lineStart;
        int i6;
        CharSequence charSequence2 = charSequence;
        StaticLayout b2 = b(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, bVar);
        if (i5 > 0) {
            int i7 = i2;
            while (b2.getLineCount() > i5 && (lineStart = b2.getLineStart(i5)) < i7) {
                int i8 = lineStart;
                while (i8 > i && Character.isSpace(charSequence2.charAt(i8 - 1))) {
                    i8--;
                }
                int i9 = i8;
                b2 = b(charSequence2, i, i8, textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, bVar);
                if (b2.getLineCount() < i5 || b2.getEllipsisCount(i5 - 1) != 0) {
                    i6 = i9;
                    charSequence2 = charSequence;
                } else {
                    StringBuilder sb = new StringBuilder();
                    charSequence2 = charSequence;
                    sb.append((Object) charSequence2.subSequence(i, i9));
                    sb.append(" …");
                    String sb2 = sb.toString();
                    i6 = i9;
                    b2 = b(sb2, 0, sb2.length(), textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, bVar);
                }
                i7 = i6;
            }
        }
        do {
        } while (!a(b2));
        return b2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        r2 = android.text.StaticLayout.class.getDeclaredField("mLines");
        r2.setAccessible(true);
        r3 = android.text.StaticLayout.class.getDeclaredField("mColumns");
        r3.setAccessible(true);
        r2 = (int[]) r2.get(r7);
        r7 = r3.getInt(r7);
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r3 >= r7) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
        r5 = (r7 * r1) + r3;
        a(r2, r5, r5 + r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.text.StaticLayout r7) {
        /*
            r0 = 0
            int r1 = r7.getLineStart(r0)
            int r2 = r7.getLineCount()
            r3 = r1
            r1 = 0
        Lb:
            r4 = 1
            if (r1 >= r2) goto L47
            int r5 = r7.getLineEnd(r1)
            if (r5 >= r3) goto L43
            java.lang.Class<android.text.StaticLayout> r2 = android.text.StaticLayout.class
            java.lang.String r3 = "mLines"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Exception -> L47
            r2.setAccessible(r4)     // Catch: java.lang.Exception -> L47
            java.lang.Class<android.text.StaticLayout> r3 = android.text.StaticLayout.class
            java.lang.String r5 = "mColumns"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r5)     // Catch: java.lang.Exception -> L47
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L47
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Exception -> L47
            int[] r2 = (int[]) r2     // Catch: java.lang.Exception -> L47
            int r7 = r3.getInt(r7)     // Catch: java.lang.Exception -> L47
            r3 = 0
        L35:
            if (r3 >= r7) goto L42
            int r5 = r7 * r1
            int r5 = r5 + r3
            int r6 = r5 + r7
            a(r2, r5, r6)     // Catch: java.lang.Exception -> L47
            int r3 = r3 + 1
            goto L35
        L42:
            return r0
        L43:
            int r1 = r1 + 1
            r3 = r5
            goto Lb
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.g.a.b.a(android.text.StaticLayout):boolean");
    }

    private static void a(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }
}
