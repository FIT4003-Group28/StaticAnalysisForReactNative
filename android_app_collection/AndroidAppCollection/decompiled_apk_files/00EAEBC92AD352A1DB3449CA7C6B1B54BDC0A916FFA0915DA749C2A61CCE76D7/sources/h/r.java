package h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    final byte[] f10190a;

    /* renamed from: b  reason: collision with root package name */
    int f10191b;

    /* renamed from: c  reason: collision with root package name */
    int f10192c;

    /* renamed from: d  reason: collision with root package name */
    boolean f10193d;

    /* renamed from: e  reason: collision with root package name */
    boolean f10194e;

    /* renamed from: f  reason: collision with root package name */
    r f10195f;

    /* renamed from: g  reason: collision with root package name */
    r f10196g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r() {
        this.f10190a = new byte[8192];
        this.f10194e = true;
        this.f10193d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f10190a = bArr;
        this.f10191b = i;
        this.f10192c = i2;
        this.f10193d = z;
        this.f10194e = z2;
    }

    public final r a(int i) {
        r a2;
        if (i <= 0 || i > this.f10192c - this.f10191b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            a2 = c();
        } else {
            a2 = s.a();
            System.arraycopy(this.f10190a, this.f10191b, a2.f10190a, 0, i);
        }
        a2.f10192c = a2.f10191b + i;
        this.f10191b += i;
        this.f10196g.a(a2);
        return a2;
    }

    public final r a(r rVar) {
        rVar.f10196g = this;
        rVar.f10195f = this.f10195f;
        this.f10195f.f10196g = rVar;
        this.f10195f = rVar;
        return rVar;
    }

    public final void a() {
        r rVar = this.f10196g;
        if (rVar != this) {
            if (!rVar.f10194e) {
                return;
            }
            int i = this.f10192c - this.f10191b;
            if (i > (8192 - rVar.f10192c) + (rVar.f10193d ? 0 : rVar.f10191b)) {
                return;
            }
            a(this.f10196g, i);
            b();
            s.a(this);
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(r rVar, int i) {
        if (rVar.f10194e) {
            int i2 = rVar.f10192c;
            if (i2 + i > 8192) {
                if (rVar.f10193d) {
                    throw new IllegalArgumentException();
                }
                int i3 = rVar.f10191b;
                if ((i2 + i) - i3 > 8192) {
                    throw new IllegalArgumentException();
                }
                byte[] bArr = rVar.f10190a;
                System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                rVar.f10192c -= rVar.f10191b;
                rVar.f10191b = 0;
            }
            System.arraycopy(this.f10190a, this.f10191b, rVar.f10190a, rVar.f10192c, i);
            rVar.f10192c += i;
            this.f10191b += i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final r b() {
        r rVar = this.f10195f;
        if (rVar == this) {
            rVar = null;
        }
        r rVar2 = this.f10196g;
        rVar2.f10195f = this.f10195f;
        this.f10195f.f10196g = rVar2;
        this.f10195f = null;
        this.f10196g = null;
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r c() {
        this.f10193d = true;
        return new r(this.f10190a, this.f10191b, this.f10192c, true, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r d() {
        return new r((byte[]) this.f10190a.clone(), this.f10191b, this.f10192c, false, true);
    }
}
