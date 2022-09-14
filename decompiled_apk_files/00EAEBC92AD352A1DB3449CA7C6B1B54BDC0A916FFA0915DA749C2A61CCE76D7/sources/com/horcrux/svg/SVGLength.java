package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
/* loaded from: classes.dex */
class SVGLength {

    /* renamed from: a  reason: collision with root package name */
    final double f9525a;

    /* renamed from: b  reason: collision with root package name */
    final UnitType f9526b;

    /* loaded from: classes.dex */
    public enum UnitType {
        UNKNOWN,
        NUMBER,
        PERCENTAGE,
        EMS,
        EXS,
        PX,
        CM,
        MM,
        IN,
        PT,
        PC
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9527a = new int[ReadableType.values().length];

        static {
            try {
                f9527a[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9527a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9527a[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private SVGLength() {
        this.f9525a = 0.0d;
        this.f9526b = UnitType.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SVGLength(double d2) {
        this.f9525a = d2;
        this.f9526b = UnitType.NUMBER;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private SVGLength(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.SVGLength.<init>(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ArrayList<SVGLength> a(Dynamic dynamic) {
        ArrayList<SVGLength> arrayList;
        SVGLength sVGLength;
        int i = a.f9527a[dynamic.getType().ordinal()];
        if (i == 1) {
            arrayList = new ArrayList<>(1);
            sVGLength = new SVGLength(dynamic.asDouble());
        } else if (i != 2) {
            if (i != 3) {
                return null;
            }
            ReadableArray asArray = dynamic.asArray();
            int size = asArray.size();
            ArrayList<SVGLength> arrayList2 = new ArrayList<>(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(b(asArray.getDynamic(i2)));
            }
            return arrayList2;
        } else {
            arrayList = new ArrayList<>(1);
            sVGLength = new SVGLength(dynamic.asString());
        }
        arrayList.add(sVGLength);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SVGLength b(Dynamic dynamic) {
        int i = a.f9527a[dynamic.getType().ordinal()];
        return i != 1 ? i != 2 ? new SVGLength() : new SVGLength(dynamic.asString()) : new SVGLength(dynamic.asDouble());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(Dynamic dynamic) {
        int i = a.f9527a[dynamic.getType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return dynamic.asString();
            }
            return null;
        }
        return String.valueOf(dynamic.asDouble());
    }
}
