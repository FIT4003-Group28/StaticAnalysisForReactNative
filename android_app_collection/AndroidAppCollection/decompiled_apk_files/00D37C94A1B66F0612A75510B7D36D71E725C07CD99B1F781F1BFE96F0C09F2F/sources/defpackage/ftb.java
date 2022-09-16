package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
/* compiled from: PG */
/* renamed from: ftb  reason: default package */
/* loaded from: classes3.dex */
public final class ftb {
    private final azqb a;

    public ftb(azqb azqbVar) {
        this.a = azqbVar;
    }

    public final fta a(Context context, View view) {
        ajxz ajxzVar = (ajxz) this.a.get();
        ajxzVar.getClass();
        context.getClass();
        view.getClass();
        return new fta(ajxzVar, context, view);
    }

    public final fta b(Context context, ViewStub viewStub) {
        ajxz ajxzVar = (ajxz) this.a.get();
        ajxzVar.getClass();
        context.getClass();
        viewStub.getClass();
        return new fta(ajxzVar, context, viewStub);
    }
}
