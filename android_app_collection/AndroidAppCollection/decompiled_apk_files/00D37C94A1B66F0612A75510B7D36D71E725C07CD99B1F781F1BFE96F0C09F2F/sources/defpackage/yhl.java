package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: yhl  reason: default package */
/* loaded from: classes4.dex */
public final class yhl implements ajry {
    private final azqb a;
    private final azqb b;

    public yhl(azqb azqbVar, azqb azqbVar2) {
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
    }

    @Override // defpackage.ajry
    /* renamed from: a */
    public final yhk b(ViewGroup viewGroup) {
        Context context = (Context) ((axov) this.a).a;
        context.getClass();
        viewGroup.getClass();
        return new yhk(context, (yhj) this.b.get(), viewGroup);
    }
}
