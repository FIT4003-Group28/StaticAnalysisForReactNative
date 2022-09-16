package com.horcrux.svg;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class TextLayoutAlgorithm {

    /* loaded from: classes.dex */
    class d {

        /* renamed from: a  reason: collision with root package name */
        aj f4800a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        int f4796a;

        /* renamed from: d  reason: collision with root package name */
        double f4799d;
        char e;

        /* renamed from: b  reason: collision with root package name */
        double f4797b = 0.0d;

        /* renamed from: c  reason: collision with root package name */
        double f4798c = 0.0d;
        double f = 0.0d;
        boolean g = false;
        boolean h = false;
        boolean i = false;
        boolean j = false;
        boolean k = false;
        boolean l = true;
        boolean m = false;
        boolean n = false;
        boolean o = false;

        c(int i, char c2) {
            this.f4796a = i;
            this.e = c2;
        }
    }

    private void getSubTreeTypographicCharacterPositions(ArrayList<ag> arrayList, ArrayList<aj> arrayList2, StringBuilder sb, com.facebook.react.uimanager.w wVar, ag agVar) {
        int i = 0;
        if (wVar instanceof aa) {
            aa aaVar = (aa) wVar;
            String str = aaVar.f4805b;
            if (str == null) {
                while (i < wVar.getChildCount()) {
                    getSubTreeTypographicCharacterPositions(arrayList, arrayList2, sb, wVar.getChildAt(i), agVar);
                    i++;
                }
                return;
            }
            while (i < str.length()) {
                arrayList2.add(aaVar);
                arrayList.add(agVar);
                i++;
            }
            sb.append(str);
            return;
        }
        if (wVar instanceof ag) {
            agVar = (ag) wVar;
        }
        while (i < wVar.getChildCount()) {
            getSubTreeTypographicCharacterPositions(arrayList, arrayList2, sb, wVar.getChildAt(i), agVar);
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x019c, code lost:
        if (r18 == Double.POSITIVE_INFINITY) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    com.horcrux.svg.TextLayoutAlgorithm.c[] layoutText(com.horcrux.svg.TextLayoutAlgorithm.d r33) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.TextLayoutAlgorithm.layoutText(com.horcrux.svg.TextLayoutAlgorithm$d):com.horcrux.svg.TextLayoutAlgorithm$c[]");
    }

    /* loaded from: classes.dex */
    class a {

        /* renamed from: b  reason: collision with root package name */
        private int f4790b = 0;

        /* renamed from: c  reason: collision with root package name */
        private boolean f4791c = true;

        /* renamed from: d  reason: collision with root package name */
        private boolean f4792d = false;
        private c[] e;
        private String[] f;
        private String[] g;
        private String[] h;
        private String[] i;

        a(c[] cVarArr, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
            this.e = cVarArr;
            this.f = strArr;
            this.g = strArr2;
            this.h = strArr3;
            this.i = strArr4;
        }
    }

    /* loaded from: classes.dex */
    class b {

        /* renamed from: a  reason: collision with root package name */
        int f4793a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c[] f4794b;

        b(c[] cVarArr) {
            this.f4794b = cVarArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(aj ajVar) {
            int i;
            int i2;
            Class<?> cls = ajVar.getClass();
            boolean z = ajVar.f4834c != null;
            if (cls != aa.class || !z) {
                return;
            }
            aa aaVar = (aa) ajVar;
            String str = aaVar.f4805b;
            int i3 = this.f4793a;
            int length = (str == null ? 0 : str.length()) + i3;
            double d2 = Double.NEGATIVE_INFINITY;
            int i4 = i3;
            double d3 = Double.POSITIVE_INFINITY;
            while (i4 <= length) {
                if (!this.f4794b[i3].l) {
                    i = length;
                    i2 = i3;
                } else {
                    char c2 = this.f4794b[i3].e;
                    if (c2 == '\n' || c2 == '\r') {
                        return;
                    }
                    double d4 = this.f4794b[i4].f4797b;
                    double d5 = this.f4794b[i4].f4799d + d4;
                    i = length;
                    i2 = i3;
                    double min = Math.min(d3, Math.min(d4, d5));
                    d2 = Math.max(d2, Math.max(d4, d5));
                    d3 = min;
                }
                i4++;
                i3 = i2;
                length = i;
            }
            int i5 = length;
            int i6 = i3;
            if (d3 == Double.POSITIVE_INFINITY) {
                return;
            }
            double parseDouble = Double.parseDouble(ajVar.f4834c) - (d2 - d3);
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < ajVar.getChildCount(); i9++) {
                if (((ag) ajVar.getChildAt(i9)).f4834c == null) {
                    String str2 = aaVar.f4805b;
                    i7 += str2 == null ? 0 : str2.length();
                } else {
                    this.f4794b[i7].o = true;
                    i8++;
                }
            }
            double d6 = parseDouble / (i7 + (i8 - 1));
            double d7 = 0.0d;
            for (int i10 = i6; i10 <= i5; i10++) {
                this.f4794b[i10].f4797b += d7;
                if (!this.f4794b[i10].h && (!this.f4794b[i10].i || this.f4794b[i10].o)) {
                    d7 += d6;
                }
            }
        }
    }
}
