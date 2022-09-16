package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.util.Set;
/* compiled from: PG */
/* renamed from: axnq  reason: default package */
/* loaded from: classes2.dex */
public final class axnq {
    private final Application a;
    private final Set b;
    private final dyd c;

    public axnq(Application application, Set set, dyd dydVar) {
        this.a = application;
        this.b = set;
        this.c = dydVar;
    }

    public final ae a(dp dpVar, ae aeVar) {
        return b(dpVar, dpVar.m, aeVar);
    }

    public final ae b(bll bllVar, Bundle bundle, ae aeVar) {
        if (aeVar == null) {
            aeVar = new z(this.a, bllVar, bundle);
        }
        return new axnt(bllVar, bundle, this.b, aeVar, this.c);
    }
}
