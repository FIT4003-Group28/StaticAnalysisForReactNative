package androidx.appcompat.widget;

import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
class o0 {

    /* renamed from: a  reason: collision with root package name */
    private int f1325a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f1326b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f1327c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d  reason: collision with root package name */
    private int f1328d = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: e  reason: collision with root package name */
    private int f1329e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f1330f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1331g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1332h = false;

    public int a() {
        return this.f1331g ? this.f1325a : this.f1326b;
    }

    public void a(int i, int i2) {
        this.f1332h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1329e = i;
            this.f1325a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1330f = i2;
            this.f1326b = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f1331g
            if (r2 != r0) goto L5
            return
        L5:
            r1.f1331g = r2
            boolean r0 = r1.f1332h
            if (r0 == 0) goto L2b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1d
            int r2 = r1.f1328d
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.f1329e
        L16:
            r1.f1325a = r2
            int r2 = r1.f1327c
            if (r2 == r0) goto L2f
            goto L31
        L1d:
            int r2 = r1.f1327c
            if (r2 == r0) goto L22
            goto L24
        L22:
            int r2 = r1.f1329e
        L24:
            r1.f1325a = r2
            int r2 = r1.f1328d
            if (r2 == r0) goto L2f
            goto L31
        L2b:
            int r2 = r1.f1329e
            r1.f1325a = r2
        L2f:
            int r2 = r1.f1330f
        L31:
            r1.f1326b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0.a(boolean):void");
    }

    public int b() {
        return this.f1325a;
    }

    public void b(int i, int i2) {
        this.f1327c = i;
        this.f1328d = i2;
        this.f1332h = true;
        if (this.f1331g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1325a = i2;
            }
            if (i == Integer.MIN_VALUE) {
                return;
            }
            this.f1326b = i;
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1325a = i;
        }
        if (i2 == Integer.MIN_VALUE) {
            return;
        }
        this.f1326b = i2;
    }

    public int c() {
        return this.f1326b;
    }

    public int d() {
        return this.f1331g ? this.f1326b : this.f1325a;
    }
}
