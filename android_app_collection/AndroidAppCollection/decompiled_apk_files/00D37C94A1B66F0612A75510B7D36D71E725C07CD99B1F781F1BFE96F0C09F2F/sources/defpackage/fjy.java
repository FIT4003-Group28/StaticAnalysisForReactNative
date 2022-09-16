package defpackage;

import android.content.Context;
import java.util.Map;
/* compiled from: PG */
/* renamed from: fjy  reason: default package */
/* loaded from: classes3.dex */
public final class fjy {
    private final azqb a;
    private final azqb b;

    public fjy(azqb azqbVar, azqb azqbVar2) {
        azqbVar.getClass();
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public final fjx a(akbi akbiVar, Map map) {
        Context context = (Context) this.a.get();
        context.getClass();
        ggb ggbVar = (ggb) this.b.get();
        ggbVar.getClass();
        return new fjx(context, ggbVar, akbiVar, map);
    }

    public final fjx b(akbi akbiVar, Map map, int i) {
        Context context = (Context) this.a.get();
        context.getClass();
        ggb ggbVar = (ggb) this.b.get();
        ggbVar.getClass();
        return new fjx(context, ggbVar, akbiVar, map, i);
    }
}
