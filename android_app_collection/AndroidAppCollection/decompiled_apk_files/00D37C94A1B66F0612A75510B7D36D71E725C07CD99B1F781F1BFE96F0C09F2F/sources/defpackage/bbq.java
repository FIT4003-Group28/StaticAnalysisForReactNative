package defpackage;

import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: bbq  reason: default package */
/* loaded from: classes2.dex */
final class bbq implements bbn {
    private final pwu a;
    private final int b;
    private final int c;
    private int d;
    private int e;

    public bbq(bbk bbkVar) {
        pwu pwuVar = bbkVar.a;
        this.a = pwuVar;
        pwuVar.G(12);
        this.c = pwuVar.l() & PrivateKeyType.INVALID;
        this.b = pwuVar.l();
    }

    @Override // defpackage.bbn
    public final int a() {
        return -1;
    }

    @Override // defpackage.bbn
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bbn
    public final int c() {
        int i = this.c;
        if (i == 8) {
            return this.a.i();
        }
        if (i == 16) {
            return this.a.m();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int i3 = this.a.i();
        this.e = i3;
        return (i3 & 240) >> 4;
    }
}
