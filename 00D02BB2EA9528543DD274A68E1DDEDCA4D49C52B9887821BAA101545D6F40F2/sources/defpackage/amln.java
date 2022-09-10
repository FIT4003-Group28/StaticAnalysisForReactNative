package defpackage;
/* compiled from: PG */
/* renamed from: amln  reason: default package */
/* loaded from: classes.dex */
public final class amln extends amlo {
    private final ammu a;
    private final String d;
    private final alxo e;
    private final int f;
    private final float g;
    private final float h;

    public amln(ammu ammuVar, String str, alxo alxoVar, int i, float[] fArr) {
        super(fArr[0], fArr[1]);
        this.a = ammuVar;
        this.d = str;
        this.e = alxoVar;
        this.f = i;
        this.g = fArr[2];
        this.h = fArr[3];
    }

    @Override // defpackage.amlo
    @dzsi
    public final bnvf a() {
        bnve b = this.a.b(this.d, this.e, this.f);
        if (b != null) {
            return new bnvf(dcdc.f(b));
        }
        return null;
    }

    @Override // defpackage.amlo
    public final float c() {
        return this.h;
    }

    @Override // defpackage.amlo
    public final float j() {
        return this.g;
    }
}
