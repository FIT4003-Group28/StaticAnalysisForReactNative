package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: adzv  reason: default package */
/* loaded from: classes.dex */
public final class adzv implements axou {
    private final azqb a;

    public adzv(azqb azqbVar) {
        this.a = azqbVar;
    }

    public static adzu b(Context context) {
        return new adzu(context);
    }

    public static adzv c(azqb azqbVar) {
        return new adzv(azqbVar);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final adzu get() {
        return b((Context) ((axov) this.a).a);
    }
}
