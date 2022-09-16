package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: zek  reason: default package */
/* loaded from: classes4.dex */
public final class zek implements axou {
    private final azqb a;

    public zek(azqb azqbVar) {
        this.a = azqbVar;
    }

    public static zek b(azqb azqbVar) {
        return new zek(azqbVar);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final zei get() {
        return new zei((Context) ((axov) this.a).a);
    }
}
