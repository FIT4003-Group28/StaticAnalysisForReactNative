package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: amfe  reason: default package */
/* loaded from: classes.dex */
public final class amfe {
    public static final AtomicInteger a = new AtomicInteger(123051698);
    public final String b;
    public final afw c = new afw();
    public final afw d = new afw();

    public amfe() {
        aqxo.q(!amps.e("FuturesMixinRF"), "mapKey must be a non-empty, non-null static String unique to the class using CallbackIdMap.");
        this.b = "FuturesMixinRF";
    }

    public final Object a(int i) {
        uwp.f();
        Object obj = this.c.get(Integer.valueOf(i));
        if (obj == null) {
            for (Map.Entry entry : this.d.entrySet()) {
                if (((Integer) entry.getValue()).intValue() == i) {
                    String valueOf = String.valueOf(((Class) entry.getKey()).getName());
                    throw new NullPointerException(valueOf.length() != 0 ? "Callback not re-registered for: ".concat(valueOf) : new String("Callback not re-registered for: "));
                }
            }
        }
        obj.getClass();
        return obj;
    }
}
