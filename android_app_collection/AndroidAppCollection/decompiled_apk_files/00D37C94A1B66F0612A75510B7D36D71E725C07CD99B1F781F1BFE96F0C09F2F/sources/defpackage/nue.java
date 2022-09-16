package defpackage;
/* compiled from: PG */
/* renamed from: nue  reason: default package */
/* loaded from: classes3.dex */
public class nue implements nva {
    public final int a;
    private final amxt b;

    public nue(int i, float f, float f2) {
        this.a = i;
        boolean z = true;
        if (f > f2) {
            afus.b(2, 25, String.format("Flexy FixedRangeResizeConstraint cannot have minAspectRatio=%s > maxAspectRatio=%s", Float.valueOf(f), Float.valueOf(f2)));
            f2 = f;
        }
        z = f < 0.0f ? false : z;
        Float valueOf = Float.valueOf(f);
        aqxo.u(z, "Invalid minAspectRatio=%s", valueOf);
        this.b = amxt.d(valueOf, Float.valueOf(f2));
    }

    @Override // defpackage.nva
    public final int a() {
        return this.a;
    }

    @Override // defpackage.nva
    public final amxt b(float f) {
        aqxo.p(f >= 0.0f);
        return this.b;
    }
}
