package defpackage;

import android.util.Property;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahij  reason: default package */
/* loaded from: classes.dex */
final class ahij extends Property {
    public ahij(Class cls) {
        super(cls, "countDownProgress");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return ((ahik) obj).b;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ahik ahikVar = (ahik) obj;
        Long l = (Long) obj2;
        ahikVar.b = l;
        ahikVar.c.b.m(l.longValue(), ahikVar.a);
        ahikVar.c.d.d(new ahif(TimeUnit.MILLISECONDS.toSeconds(l.longValue()), TimeUnit.MILLISECONDS.toSeconds(ahikVar.a)));
        if (l.longValue() == ahikVar.a) {
            ahikVar.c.q(true);
        }
    }
}
