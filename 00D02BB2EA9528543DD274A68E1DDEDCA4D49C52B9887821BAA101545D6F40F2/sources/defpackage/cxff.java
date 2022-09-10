package defpackage;

import java.util.Random;
/* compiled from: PG */
/* renamed from: cxff  reason: default package */
/* loaded from: classes5.dex */
final class cxff extends cxfg {
    private final Random b;

    public cxff(eaby eabyVar, Random random) {
        super(eabyVar);
        this.b = random;
    }

    @Override // defpackage.cxfg
    public final boolean a() {
        return this.a.b > 0;
    }

    @Override // defpackage.cxfg
    public final boolean b() {
        return this.b.nextFloat() * 1000.0f < ((float) this.a.b);
    }
}
