package defpackage;

import android.app.Application;
import android.content.Context;
/* compiled from: PG */
/* renamed from: yim  reason: default package */
/* loaded from: classes4.dex */
public final class yim implements axou {
    private final azqb a;

    public yim(azqb azqbVar) {
        this.a = azqbVar;
    }

    public static Application b(Context context) {
        Application C = zew.C(context);
        axzl.o(C);
        return C;
    }

    public static yim c(azqb azqbVar) {
        return new yim(azqbVar);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final Application get() {
        return b((Context) ((axov) this.a).a);
    }
}
