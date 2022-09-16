package defpackage;

import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: oyz  reason: default package */
/* loaded from: classes4.dex */
final class oyz implements oyw {
    private final pct a;
    private final int b;
    private final int c;
    private int d;
    private int e;

    public oyz(oyt oytVar) {
        pct pctVar = oytVar.a;
        this.a = pctVar;
        pctVar.z(12);
        this.c = pctVar.j() & PrivateKeyType.INVALID;
        this.b = pctVar.j();
    }

    @Override // defpackage.oyw
    public final int a() {
        return this.b;
    }

    @Override // defpackage.oyw
    public final int b() {
        int i = this.c;
        if (i == 8) {
            return this.a.h();
        }
        if (i == 16) {
            return this.a.k();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int h = this.a.h();
        this.e = h;
        return (h & 240) >> 4;
    }

    @Override // defpackage.oyw
    public final boolean c() {
        return false;
    }
}
