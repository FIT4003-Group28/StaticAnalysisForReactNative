package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: rzt  reason: default package */
/* loaded from: classes4.dex */
public final class rzt implements ae {
    private final Application a;
    private final ryl b;

    public rzt(Application application, ryl rylVar) {
        this.a = application;
        this.b = rylVar;
    }

    @Override // defpackage.ae
    public final ac a(Class cls) {
        aqxo.q(cls == rzu.class, "LinkingStateViewMode.Factory should only be used for AccountLinkingViewModel");
        return new rzu(this.a, this.b);
    }
}
