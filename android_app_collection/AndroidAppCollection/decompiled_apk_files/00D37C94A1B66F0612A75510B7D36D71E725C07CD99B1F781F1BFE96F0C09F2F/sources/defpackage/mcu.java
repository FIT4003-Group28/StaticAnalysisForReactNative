package defpackage;

import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: mcu  reason: default package */
/* loaded from: classes3.dex */
public final class mcu {
    public final mcv a;
    public final Map b = new WeakHashMap();
    public final Map c = new WeakHashMap();

    public mcu(mcv mcvVar) {
        this.a = mcvVar;
    }

    public final ggt a(fin finVar) {
        return (ggt) this.b.get(finVar);
    }
}
