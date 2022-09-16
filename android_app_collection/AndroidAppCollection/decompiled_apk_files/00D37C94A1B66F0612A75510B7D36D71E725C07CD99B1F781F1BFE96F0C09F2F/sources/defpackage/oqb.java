package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: oqb  reason: default package */
/* loaded from: classes4.dex */
public final class oqb implements axou {
    private final azqb a;

    public oqb(azqb azqbVar) {
        this.a = azqbVar;
    }

    public static oqb a(azqb azqbVar) {
        return new oqb(azqbVar);
    }

    @Override // defpackage.azqb
    /* renamed from: b */
    public final qys get() {
        return new qys((Context) ((axov) this.a).a);
    }
}
