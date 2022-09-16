package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: PG */
/* renamed from: yij  reason: default package */
/* loaded from: classes4.dex */
public final class yij implements axou {
    private final azqb a;
    private final azqb b;

    public yij(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public static yij a(azqb azqbVar, azqb azqbVar2) {
        return new yij(azqbVar, azqbVar2);
    }

    @Override // defpackage.azqb
    /* renamed from: b */
    public final File get() {
        return yih.a((Context) ((axov) this.a).a, (String) ((axov) this.b).a);
    }
}
