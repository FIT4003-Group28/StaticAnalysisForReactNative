package defpackage;

import android.util.FloatProperty;
/* compiled from: PG */
/* renamed from: csaq  reason: default package */
/* loaded from: classes5.dex */
final class csaq extends FloatProperty<csaw> {
    public csaq() {
        super("Logo Height");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(Object obj) {
        int i = csaw.f;
        return Float.valueOf(((csaw) obj).a.l);
    }

    @Override // android.util.FloatProperty
    public final /* bridge */ /* synthetic */ void setValue(csaw csawVar, float f) {
        csaw csawVar2 = csawVar;
        int i = csaw.f;
        csawVar2.setLogoSize(csawVar2.a.k, f);
    }
}
