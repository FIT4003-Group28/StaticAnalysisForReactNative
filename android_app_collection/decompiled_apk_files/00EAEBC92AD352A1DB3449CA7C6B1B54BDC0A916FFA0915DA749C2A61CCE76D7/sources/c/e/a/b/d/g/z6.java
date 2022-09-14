package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z6 implements i6 {

    /* renamed from: a  reason: collision with root package name */
    private final k6 f4558a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4559b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f4560c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4561d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z6(k6 k6Var, String str, Object[] objArr) {
        this.f4558a = k6Var;
        this.f4559b = str;
        this.f4560c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f4561d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.f4561d = i | (charAt2 << i2);
                return;
            }
            i |= (charAt2 & 8191) << i2;
            i2 += 13;
            i3 = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        return this.f4559b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] b() {
        return this.f4560c;
    }

    @Override // c.e.a.b.d.g.i6
    public final int f() {
        return (this.f4561d & 1) == 1 ? b5.f.i : b5.f.j;
    }

    @Override // c.e.a.b.d.g.i6
    public final boolean j() {
        return (this.f4561d & 2) == 2;
    }

    @Override // c.e.a.b.d.g.i6
    public final k6 l() {
        return this.f4558a;
    }
}
