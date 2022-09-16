package com.swmansion.reanimated.nodes;

import android.graphics.PointF;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class b extends m {

    /* renamed from: a  reason: collision with root package name */
    private final int f9987a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9988b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        protected PointF f9989a;

        /* renamed from: b  reason: collision with root package name */
        protected PointF f9990b;

        /* renamed from: c  reason: collision with root package name */
        protected PointF f9991c;

        /* renamed from: d  reason: collision with root package name */
        protected PointF f9992d;

        /* renamed from: e  reason: collision with root package name */
        protected PointF f9993e;

        public a(float f2, float f3, float f4, float f5) {
            this(new PointF(f2, f3), new PointF(f4, f5));
        }

        public a(PointF pointF, PointF pointF2) {
            this.f9991c = new PointF();
            this.f9992d = new PointF();
            this.f9993e = new PointF();
            this.f9989a = pointF;
            this.f9990b = pointF2;
        }

        private float d(float f2) {
            PointF pointF = this.f9993e;
            PointF pointF2 = this.f9989a;
            pointF.x = pointF2.x * 3.0f;
            PointF pointF3 = this.f9992d;
            pointF3.x = ((this.f9990b.x - pointF2.x) * 3.0f) - pointF.x;
            PointF pointF4 = this.f9991c;
            pointF4.x = (1.0f - pointF.x) - pointF3.x;
            return f2 * (pointF.x + ((pointF3.x + (pointF4.x * f2)) * f2));
        }

        private float e(float f2) {
            return this.f9993e.x + (f2 * ((this.f9992d.x * 2.0f) + (this.f9991c.x * 3.0f * f2)));
        }

        protected float a(float f2) {
            PointF pointF = this.f9993e;
            PointF pointF2 = this.f9989a;
            pointF.y = pointF2.y * 3.0f;
            PointF pointF3 = this.f9992d;
            pointF3.y = ((this.f9990b.y - pointF2.y) * 3.0f) - pointF.y;
            PointF pointF4 = this.f9991c;
            pointF4.y = (1.0f - pointF.y) - pointF3.y;
            return f2 * (pointF.y + ((pointF3.y + (pointF4.y * f2)) * f2));
        }

        public float b(float f2) {
            return a(c(f2));
        }

        protected float c(float f2) {
            float f3 = f2;
            for (int i = 1; i < 14; i++) {
                float d2 = d(f3) - f2;
                if (Math.abs(d2) < 0.001d) {
                    break;
                }
                f3 -= d2 / e(f3);
            }
            return f3;
        }
    }

    public b(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i, readableMap, bVar);
        this.f9987a = com.swmansion.reanimated.a.a(readableMap, "input", "Reanimated: Argument passed to bezier node is either of wrong type or is missing.");
        this.f9988b = new a((float) readableMap.getDouble("mX1"), (float) readableMap.getDouble("mY1"), (float) readableMap.getDouble("mX2"), (float) readableMap.getDouble("mY2"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.reanimated.nodes.m
    /* renamed from: evaluate */
    public Double mo321evaluate() {
        return Double.valueOf(this.f9988b.b(((Double) this.mNodesManager.b(this.f9987a)).floatValue()));
    }
}
