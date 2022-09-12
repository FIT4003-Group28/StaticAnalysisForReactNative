package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cptn  reason: default package */
/* loaded from: classes5.dex */
public final class cptn implements cptu {
    private final List<cptk> a;
    private final cptm b;
    private final cptl c;

    public cptn(View view, View view2) {
        cptk cptkVar = cptk.RIGHT;
        cptk cptkVar2 = cptk.LEFT;
        cptk cptkVar3 = cptk.TOP;
        cptk cptkVar4 = cptk.BOTTOM;
        ArrayList b = cpwi.b(4);
        b.add(cptkVar);
        b.add(cptkVar2);
        b.add(cptkVar3);
        b.add(cptkVar4);
        this.a = b;
        this.c = new cptl();
        this.b = new cptm(view, view2);
    }

    private final cptl b(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i2 / 2;
        int i8 = i - i7;
        if (i8 >= i3) {
            i3 = i + i7 > i4 ? i4 - i2 : i8;
        }
        this.c.b = cpqk.d(i - (i7 + i3), i5, i6);
        cptl cptlVar = this.c;
        cptlVar.a = i3;
        return cptlVar;
    }

    private static cptx c(cptk cptkVar) {
        cptk cptkVar2 = cptk.TOP;
        cptx cptxVar = cptx.TOP;
        int ordinal = cptkVar.ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? cptx.BOTTOM : cptx.LEFT : cptx.RIGHT : cptx.TOP;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
        if (r12.right >= r11) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
        r11 = r17.b();
        r12 = r16.b.a();
        r13 = r6.ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
        if (r13 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
        if (r13 == 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
        if (r13 == 2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
        if (r13 == 3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b8, code lost:
        r13 = r12.height();
        r14 = r11.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
        if (r13 >= r14) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
        r13 = r17.e(r6);
        r11 = ((r11.b / 2) + r1) + r17.d(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d5, code lost:
        if (r12.top > ((r1 - (r14 / 2)) + r13)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d9, code lost:
        if (r12.bottom < r11) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
        if (r12.top > (r1 - r11.b)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
        if (r12.bottom < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00eb, code lost:
        if (r12.top > r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f2, code lost:
        if (r12.bottom < (r11.b + r1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f4, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f5, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f9 A[EDGE_INSN: B:66:0x00f9->B:55:0x00f9 ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.cptu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.cpts r17, float r18, float r19) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cptn.a(cpts, float, float):void");
    }
}
