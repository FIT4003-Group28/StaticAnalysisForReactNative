package com.baidu.mapapi.map;

import android.graphics.Point;
import android.view.ViewGroup;
import com.baidu.mapapi.model.LatLng;
/* loaded from: classes.dex */
public final class MapViewLayoutParams extends ViewGroup.LayoutParams {
    public static final int ALIGN_BOTTOM = 16;
    public static final int ALIGN_CENTER_HORIZONTAL = 4;
    public static final int ALIGN_CENTER_VERTICAL = 32;
    public static final int ALIGN_LEFT = 1;
    public static final int ALIGN_RIGHT = 2;
    public static final int ALIGN_TOP = 8;

    /* renamed from: a  reason: collision with root package name */
    LatLng f1633a;

    /* renamed from: b  reason: collision with root package name */
    Point f1634b;

    /* renamed from: c  reason: collision with root package name */
    ELayoutMode f1635c;

    /* renamed from: d  reason: collision with root package name */
    float f1636d;
    float e;
    int f;

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private int f1637a;

        /* renamed from: b  reason: collision with root package name */
        private int f1638b;

        /* renamed from: c  reason: collision with root package name */
        private LatLng f1639c;

        /* renamed from: d  reason: collision with root package name */
        private Point f1640d;
        private ELayoutMode e = ELayoutMode.absoluteMode;
        private int f = 4;
        private int g = 16;
        private int h;

        public Builder align(int i, int i2) {
            if (i == 1 || i == 2 || i == 4) {
                this.f = i;
            }
            if (i2 == 8 || i2 == 16 || i2 == 32) {
                this.g = i2;
            }
            return this;
        }

        public MapViewLayoutParams build() {
            boolean z = true;
            if (this.e != ELayoutMode.mapMode ? this.e != ELayoutMode.absoluteMode || this.f1640d != null : this.f1639c != null) {
                z = false;
            }
            if (z) {
                throw new IllegalStateException("if it is map mode, you must supply position info; else if it is absolute mode, you must supply the point info");
            }
            return new MapViewLayoutParams(this.f1637a, this.f1638b, this.f1639c, this.f1640d, this.e, this.f, this.g, this.h);
        }

        public Builder height(int i) {
            this.f1638b = i;
            return this;
        }

        public Builder layoutMode(ELayoutMode eLayoutMode) {
            this.e = eLayoutMode;
            return this;
        }

        public Builder point(Point point) {
            this.f1640d = point;
            return this;
        }

        public Builder position(LatLng latLng) {
            this.f1639c = latLng;
            return this;
        }

        public Builder width(int i) {
            this.f1637a = i;
            return this;
        }

        public Builder yOffset(int i) {
            this.h = i;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum ELayoutMode {
        mapMode,
        absoluteMode
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    MapViewLayoutParams(int r1, int r2, com.baidu.mapapi.model.LatLng r3, android.graphics.Point r4, com.baidu.mapapi.map.MapViewLayoutParams.ELayoutMode r5, int r6, int r7, int r8) {
        /*
            r0 = this;
            r0.<init>(r1, r2)
            r0.f1633a = r3
            r0.f1634b = r4
            r0.f1635c = r5
            r1 = 4
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 1056964608(0x3f000000, float:0.5)
            if (r6 == r1) goto L14
            switch(r6) {
                case 1: goto L1a;
                case 2: goto L17;
                default: goto L14;
            }
        L14:
            r0.f1636d = r4
            goto L1c
        L17:
            r0.f1636d = r3
            goto L1c
        L1a:
            r0.f1636d = r2
        L1c:
            r1 = 8
            if (r7 == r1) goto L2e
            r1 = 16
            if (r7 == r1) goto L28
            r1 = 32
            if (r7 == r1) goto L2b
        L28:
            r0.e = r3
            goto L30
        L2b:
            r0.e = r4
            goto L30
        L2e:
            r0.e = r2
        L30:
            r0.f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mapapi.map.MapViewLayoutParams.<init>(int, int, com.baidu.mapapi.model.LatLng, android.graphics.Point, com.baidu.mapapi.map.MapViewLayoutParams$ELayoutMode, int, int, int):void");
    }
}
