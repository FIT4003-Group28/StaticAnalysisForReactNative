package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: ryg  reason: default package */
/* loaded from: classes4.dex */
public final class ryg implements ae {
    private final Application a;
    private final ryl b;
    private final rzs c;

    public ryg(Application application, ryl rylVar, rzs rzsVar) {
        this.a = application;
        this.b = rylVar;
        this.c = rzsVar;
    }

    @Override // defpackage.ae
    public final ac a(Class cls) {
        aqxo.q(cls == ryh.class, "LinkingStateViewMode.Factory should only be used for AccountLinkingViewModel");
        return new ryh(this.a, this.b, this.c);
    }
}
