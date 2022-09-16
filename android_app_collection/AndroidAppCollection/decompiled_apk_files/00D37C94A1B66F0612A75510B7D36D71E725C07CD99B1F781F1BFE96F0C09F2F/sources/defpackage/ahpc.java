package defpackage;

import android.util.Range;
/* compiled from: PG */
/* renamed from: ahpc  reason: default package */
/* loaded from: classes.dex */
public final class ahpc {
    public ahow a;
    public ahow b;
    public ahou c;
    public ahou d;
    public ahpe e;
    public ahpe f;
    public ahpe g;
    public Range h;
    public anuf i;
    public anuf j;
    private anuf k;

    public final void a(final ahpa ahpaVar) {
        float f = ahpaVar.d;
        if (f <= 0.0f) {
            f = ahpaVar.c;
        }
        final ahpd ahpdVar = new ahpd(ahpaVar.f, ahpaVar.g, f, ahpaVar.e, ahpaVar.h, ahpaVar.i);
        int i = ahpaVar.a;
        this.k = new anuf(1024, new ahpb() { // from class: ahoz
            @Override // defpackage.ahpb
            public final double a(int i2, double d) {
                float a;
                ahpd ahpdVar2 = ahpd.this;
                ahpa ahpaVar2 = ahpaVar;
                double d2 = i2 * 10000.0f;
                Double.isNaN(d2);
                float f2 = (float) (d2 / d);
                if (f2 < ahpdVar2.c) {
                    a = ahpdVar2.a.a(f2);
                } else {
                    a = ahpdVar2.b.a(f2);
                }
                return a / ahpaVar2.e;
            }
        });
    }

    public final byte[] b() {
        return this.k.a;
    }
}
