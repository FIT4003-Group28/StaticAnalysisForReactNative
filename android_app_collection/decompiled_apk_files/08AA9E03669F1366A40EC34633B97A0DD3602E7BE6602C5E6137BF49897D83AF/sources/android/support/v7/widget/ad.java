package android.support.v7.widget;

import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* compiled from: RtlSpacingHelper.java */
/* loaded from: classes.dex */
class ad {

    /* renamed from: a  reason: collision with root package name */
    private int f884a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f885b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f886c = PKIFailureInfo.systemUnavail;

    /* renamed from: d  reason: collision with root package name */
    private int f887d = PKIFailureInfo.systemUnavail;
    private int e = 0;
    private int f = 0;
    private boolean g = false;
    private boolean h = false;

    public int a() {
        return this.f884a;
    }

    public int b() {
        return this.f885b;
    }

    public int c() {
        return this.g ? this.f885b : this.f884a;
    }

    public int d() {
        return this.g ? this.f884a : this.f885b;
    }

    public void a(int i, int i2) {
        this.f886c = i;
        this.f887d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f884a = i2;
            }
            if (i == Integer.MIN_VALUE) {
                return;
            }
            this.f885b = i;
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f884a = i;
        }
        if (i2 == Integer.MIN_VALUE) {
            return;
        }
        this.f885b = i2;
    }

    public void b(int i, int i2) {
        this.h = false;
        if (i != Integer.MIN_VALUE) {
            this.e = i;
            this.f884a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f = i2;
            this.f885b = i2;
        }
    }

    public void a(boolean z) {
        if (z == this.g) {
            return;
        }
        this.g = z;
        if (!this.h) {
            this.f884a = this.e;
            this.f885b = this.f;
        } else if (z) {
            this.f884a = this.f887d != Integer.MIN_VALUE ? this.f887d : this.e;
            this.f885b = this.f886c != Integer.MIN_VALUE ? this.f886c : this.f;
        } else {
            this.f884a = this.f886c != Integer.MIN_VALUE ? this.f886c : this.e;
            this.f885b = this.f887d != Integer.MIN_VALUE ? this.f887d : this.f;
        }
    }
}
