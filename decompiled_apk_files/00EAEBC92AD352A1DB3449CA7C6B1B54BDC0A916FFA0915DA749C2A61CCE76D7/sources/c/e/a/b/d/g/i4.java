package c.e.a.b.d.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i4 extends h4 {

    /* renamed from: a  reason: collision with root package name */
    private int f4213a;

    /* renamed from: b  reason: collision with root package name */
    private int f4214b;

    /* renamed from: c  reason: collision with root package name */
    private int f4215c;

    /* renamed from: d  reason: collision with root package name */
    private int f4216d;

    /* renamed from: e  reason: collision with root package name */
    private int f4217e;

    private i4(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f4217e = Integer.MAX_VALUE;
        this.f4213a = i2 + i;
        this.f4215c = i;
        this.f4216d = this.f4215c;
    }

    private final void b() {
        this.f4213a += this.f4214b;
        int i = this.f4213a;
        int i2 = i - this.f4216d;
        int i3 = this.f4217e;
        if (i2 <= i3) {
            this.f4214b = 0;
            return;
        }
        this.f4214b = i2 - i3;
        this.f4213a = i - this.f4214b;
    }

    public final int a() {
        return this.f4215c - this.f4216d;
    }

    public final int b(int i) {
        if (i >= 0) {
            int a2 = i + a();
            int i2 = this.f4217e;
            if (a2 > i2) {
                throw j5.a();
            }
            this.f4217e = a2;
            b();
            return i2;
        }
        throw j5.b();
    }
}
