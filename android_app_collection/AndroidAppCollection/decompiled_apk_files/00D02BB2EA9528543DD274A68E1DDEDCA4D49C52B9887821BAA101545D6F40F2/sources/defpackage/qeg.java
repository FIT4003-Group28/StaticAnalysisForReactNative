package defpackage;
/* compiled from: PG */
/* renamed from: qeg  reason: default package */
/* loaded from: classes7.dex */
public class qeg {
    private final btvo a;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;

    public qeg(btvo btvoVar) {
        this.a = btvoVar;
    }

    private final void e() {
        this.e = true;
        if (this.a.getEnableFeatureParameters().ao) {
            this.b = true;
            dwop twoWheelerParameters = this.a.getTwoWheelerParameters();
            boolean z = twoWheelerParameters.a;
            this.c = z;
            if (!twoWheelerParameters.b || !z) {
                return;
            }
            this.d = true;
        }
    }

    public final synchronized boolean a() {
        if (!this.e) {
            e();
        }
        return this.b;
    }

    public final synchronized boolean b() {
        boolean z;
        if (!this.e) {
            e();
        }
        if (this.b) {
            if (this.c) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public final synchronized boolean c() {
        if (!this.e) {
            e();
        }
        return this.d;
    }

    public final int d() {
        int a = dwoo.a(this.a.getTwoWheelerParameters().d);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
