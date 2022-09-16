package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: amhf  reason: default package */
/* loaded from: classes.dex */
public final class amhf implements ae {
    private final Set a;
    private final ae b;
    private final a c;

    public amhf(dp dpVar, ae aeVar, Set set, dyc dycVar) {
        this.a = set;
        this.b = aeVar;
        this.c = new amhd(dpVar, dpVar.m, dycVar);
    }

    @Override // defpackage.ae
    public final ac a(Class cls) {
        if (this.a.contains(cls.getName())) {
            return this.c.a(cls);
        }
        return this.b.a(cls);
    }
}
