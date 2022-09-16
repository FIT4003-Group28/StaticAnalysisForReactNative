package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewStub;
/* compiled from: PG */
/* renamed from: oea  reason: default package */
/* loaded from: classes3.dex */
public final class oea implements oar {
    public final aaar a;
    private final aaas b;

    public oea(Activity activity, aaar aaarVar, aaan aaanVar, Context context, ViewStub viewStub, oas oasVar) {
        aaag aaagVar = new aaag(context, new odz(activity), viewStub, aaanVar);
        this.a = aaarVar;
        this.b = aaagVar;
        oasVar.d(this);
    }

    @Override // defpackage.oar
    public final void e(int i, int i2) {
        if (i2 == 3) {
            this.a.l(this.b);
        }
    }
}
