package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
class i extends s {
    private static final Pattern t = Pattern.compile("[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?");
    private final double[] i;
    private final double[] j;
    private String k;
    private double[][] l;
    private final boolean m;
    private final Matcher n;
    private final String o;
    private final String p;
    private s q;
    private boolean r;
    private int s;

    public i(ReadableMap readableMap) {
        this.i = a(readableMap.getArray("inputRange"));
        ReadableArray array = readableMap.getArray("outputRange");
        this.m = array.getType(0) == ReadableType.String;
        if (this.m) {
            int size = array.size();
            this.j = new double[size];
            this.k = array.getString(0);
            this.r = this.k.startsWith("rgb");
            this.n = t.matcher(this.k);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                Matcher matcher = t.matcher(array.getString(i));
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(arrayList2);
                while (matcher.find()) {
                    arrayList2.add(Double.valueOf(Double.parseDouble(matcher.group())));
                }
                this.j[i] = ((Double) arrayList2.get(0)).doubleValue();
            }
            this.s = ((ArrayList) arrayList.get(0)).size();
            this.l = new double[this.s];
            for (int i2 = 0; i2 < this.s; i2++) {
                double[] dArr = new double[size];
                this.l[i2] = dArr;
                for (int i3 = 0; i3 < size; i3++) {
                    dArr[i3] = ((Double) ((ArrayList) arrayList.get(i3)).get(i2)).doubleValue();
                }
            }
        } else {
            this.j = a(array);
            this.n = null;
        }
        this.o = readableMap.getString("extrapolateLeft");
        this.p = readableMap.getString("extrapolateRight");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static double a(double r16, double r18, double r20, double r22, double r24, java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.i.a(double, double, double, double, double, java.lang.String, java.lang.String):double");
    }

    static double a(double d2, double[] dArr, double[] dArr2, String str, String str2) {
        int a2 = a(d2, dArr);
        int i = a2 + 1;
        return a(d2, dArr[a2], dArr[i], dArr2[a2], dArr2[i], str, str2);
    }

    private static int a(double d2, double[] dArr) {
        int i = 1;
        while (i < dArr.length - 1 && dArr[i] < d2) {
            i++;
        }
        return i - 1;
    }

    private static double[] a(ReadableArray readableArray) {
        double[] dArr = new double[readableArray.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = readableArray.getDouble(i);
        }
        return dArr;
    }

    @Override // com.facebook.react.animated.b
    public void a() {
        String replaceFirst;
        String num;
        s sVar = this.q;
        if (sVar == null) {
            return;
        }
        double e2 = sVar.e();
        this.f5405f = a(e2, this.i, this.j, this.o, this.p);
        if (!this.m) {
            return;
        }
        if (this.s > 1) {
            StringBuffer stringBuffer = new StringBuffer(this.k.length());
            this.n.reset();
            int i = 0;
            while (this.n.find()) {
                int i2 = i + 1;
                double a2 = a(e2, this.i, this.l[i], this.o, this.p);
                if (this.r) {
                    boolean z = i2 == 4;
                    if (z) {
                        a2 *= 1000.0d;
                    }
                    int round = (int) Math.round(a2);
                    if (z) {
                        a2 = round / 1000.0d;
                        num = Double.toString(a2);
                        this.n.appendReplacement(stringBuffer, num);
                        i = i2;
                    } else {
                        num = Integer.toString(round);
                        this.n.appendReplacement(stringBuffer, num);
                        i = i2;
                    }
                } else {
                    int i3 = (int) a2;
                    if (i3 == a2) {
                        num = Integer.toString(i3);
                        this.n.appendReplacement(stringBuffer, num);
                        i = i2;
                    }
                    num = Double.toString(a2);
                    this.n.appendReplacement(stringBuffer, num);
                    i = i2;
                }
            }
            this.n.appendTail(stringBuffer);
            replaceFirst = stringBuffer.toString();
        } else {
            replaceFirst = this.n.replaceFirst(String.valueOf(this.f5405f));
        }
        this.f5404e = replaceFirst;
    }

    @Override // com.facebook.react.animated.b
    public void b(b bVar) {
        if (this.q == null) {
            if (!(bVar instanceof s)) {
                throw new IllegalArgumentException("Parent is of an invalid type");
            }
            this.q = (s) bVar;
            return;
        }
        throw new IllegalStateException("Parent already attached");
    }

    @Override // com.facebook.react.animated.b
    public void c(b bVar) {
        if (bVar == this.q) {
            this.q = null;
            return;
        }
        throw new IllegalArgumentException("Invalid parent node provided");
    }
}
