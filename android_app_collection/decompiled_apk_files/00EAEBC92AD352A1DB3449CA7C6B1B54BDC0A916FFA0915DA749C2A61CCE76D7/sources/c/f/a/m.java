package c.f.a;
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private long f4912a;

    /* renamed from: b  reason: collision with root package name */
    private long f4913b;

    /* renamed from: c  reason: collision with root package name */
    private double f4914c;

    /* renamed from: d  reason: collision with root package name */
    private double f4915d;

    /* renamed from: e  reason: collision with root package name */
    private float f4916e;

    /* renamed from: f  reason: collision with root package name */
    private float f4917f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f4918g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f4919h = new int[2];
    private a i;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(m mVar);

        void b(m mVar);

        boolean c(m mVar);
    }

    public m(a aVar) {
        this.i = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(android.view.MotionEvent r7) {
        /*
            r6 = this;
            long r0 = r6.f4912a
            r6.f4913b = r0
            long r0 = r7.getEventTime()
            r6.f4912a = r0
            int[] r0 = r6.f4919h
            r1 = 0
            r0 = r0[r1]
            int r0 = r7.findPointerIndex(r0)
            int[] r1 = r6.f4919h
            r2 = 1
            r1 = r1[r2]
            int r1 = r7.findPointerIndex(r1)
            float r2 = r7.getX(r0)
            float r0 = r7.getY(r0)
            float r3 = r7.getX(r1)
            float r7 = r7.getY(r1)
            float r1 = r3 - r2
            float r4 = r7 - r0
            float r2 = r2 + r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            r6.f4916e = r2
            float r0 = r0 + r7
            float r0 = r0 * r3
            r6.f4917f = r0
            double r2 = (double) r4
            double r0 = (double) r1
            double r0 = java.lang.Math.atan2(r2, r0)
            double r0 = -r0
            double r2 = r6.f4914c
            boolean r7 = java.lang.Double.isNaN(r2)
            if (r7 == 0) goto L4e
            r2 = 0
            goto L51
        L4e:
            double r2 = r6.f4914c
            double r2 = r2 - r0
        L51:
            r6.f4915d = r2
            r6.f4914c = r0
            double r0 = r6.f4915d
            r2 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L64
            double r0 = r0 - r2
        L61:
            r6.f4915d = r0
            goto L6f
        L64:
            r4 = -4609115380302729960(0xc00921fb54442d18, double:-3.141592653589793)
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 >= 0) goto L6f
            double r0 = r0 + r2
            goto L61
        L6f:
            double r0 = r6.f4915d
            r4 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 <= 0) goto L7e
            double r0 = r0 - r2
        L7b:
            r6.f4915d = r0
            goto L89
        L7e:
            r4 = -4613618979930100456(0xbff921fb54442d18, double:-1.5707963267948966)
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 >= 0) goto L89
            double r0 = r0 + r2
            goto L7b
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.m.b(android.view.MotionEvent):void");
    }

    private void e() {
        if (this.f4918g) {
            this.f4918g = false;
            a aVar = this.i;
            if (aVar == null) {
                return;
            }
            aVar.b(this);
        }
    }

    public float a() {
        return this.f4916e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
        if (r5 != r0[1]) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L65
            if (r0 == r2) goto L61
            r3 = 2
            if (r0 == r3) goto L52
            r3 = 5
            if (r0 == r3) goto L2b
            r3 = 6
            if (r0 == r3) goto L14
            goto L78
        L14:
            boolean r0 = r4.f4918g
            if (r0 == 0) goto L78
            int r0 = r5.getActionIndex()
            int r5 = r5.getPointerId(r0)
            int[] r0 = r4.f4919h
            r1 = r0[r1]
            if (r5 == r1) goto L61
            r0 = r0[r2]
            if (r5 != r0) goto L78
            goto L61
        L2b:
            boolean r0 = r4.f4918g
            if (r0 != 0) goto L78
            int[] r0 = r4.f4919h
            int r1 = r5.getActionIndex()
            int r1 = r5.getPointerId(r1)
            r0[r2] = r1
            r4.f4918g = r2
            long r0 = r5.getEventTime()
            r4.f4913b = r0
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r4.f4914c = r0
            r4.b(r5)
            c.f.a.m$a r5 = r4.i
            if (r5 == 0) goto L78
            r5.c(r4)
            goto L78
        L52:
            boolean r0 = r4.f4918g
            if (r0 == 0) goto L78
            r4.b(r5)
            c.f.a.m$a r5 = r4.i
            if (r5 == 0) goto L78
            r5.a(r4)
            goto L78
        L61:
            r4.e()
            goto L78
        L65:
            r4.f4918g = r1
            int[] r0 = r4.f4919h
            int r3 = r5.getActionIndex()
            int r5 = r5.getPointerId(r3)
            r0[r1] = r5
            int[] r5 = r4.f4919h
            r0 = -1
            r5[r2] = r0
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.m.a(android.view.MotionEvent):boolean");
    }

    public float b() {
        return this.f4917f;
    }

    public double c() {
        return this.f4915d;
    }

    public long d() {
        return this.f4912a - this.f4913b;
    }
}
