package defpackage;

import android.util.FloatProperty;
/* compiled from: PG */
/* renamed from: csap  reason: default package */
/* loaded from: classes5.dex */
final class csap extends FloatProperty<csaw> {
    public csap() {
        super("Logo Width");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(Object obj) {
        int i = csaw.f;
        return Float.valueOf(((csaw) obj).a.k);
    }

    @Override // android.util.FloatProperty
    public final /* bridge */ /* synthetic */ void setValue(csaw csawVar, float f) {
        csaw csawVar2 = csawVar;
        int i = csaw.f;
        csawVar2.setLogoSize(f, csawVar2.a.l);
    }
}
