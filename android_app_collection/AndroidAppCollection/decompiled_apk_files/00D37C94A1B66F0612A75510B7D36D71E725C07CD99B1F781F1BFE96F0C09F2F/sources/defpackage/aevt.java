package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: aevt  reason: default package */
/* loaded from: classes.dex */
final class aevt extends aexj {
    private final float[] a;
    private final axdi b;

    public aevt(axdi axdiVar, aevy aevyVar) {
        super(aevyVar);
        this.b = axdiVar;
        this.a = new float[4];
    }

    private final void b() {
        this.b.a(this.a);
        float[] fArr = this.a;
        super.a(fArr[3], fArr[0], fArr[1], fArr[2]);
    }

    @Override // defpackage.aexj, defpackage.pky
    public final void h(ByteBuffer byteBuffer) {
        b();
        super.h(byteBuffer);
    }

    @Override // defpackage.aexj, defpackage.pky
    public final ByteBuffer k() {
        b();
        return super.k();
    }
}
