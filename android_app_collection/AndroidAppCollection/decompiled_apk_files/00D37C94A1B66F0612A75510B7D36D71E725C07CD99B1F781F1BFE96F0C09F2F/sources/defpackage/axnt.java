package defpackage;

import android.os.Bundle;
import java.util.Set;
/* compiled from: PG */
/* renamed from: axnt  reason: default package */
/* loaded from: classes2.dex */
public final class axnt implements ae {
    private final Set a;
    private final ae b;
    private final a c;

    public axnt(bll bllVar, Bundle bundle, Set set, ae aeVar, dyd dydVar) {
        this.a = set;
        this.b = aeVar;
        this.c = new axnr(bllVar, bundle, dydVar);
    }

    @Override // defpackage.ae
    public final ac a(Class cls) {
        if (this.a.contains(cls.getName())) {
            return this.c.a(cls);
        }
        return this.b.a(cls);
    }
}
