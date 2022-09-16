package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: vym  reason: default package */
/* loaded from: classes4.dex */
public final class vym implements ajyi {
    private final Context a;
    private final wfg b;
    private final azqb c;
    private ajsa d;
    private final vyw e;

    public vym(Context context, wfg wfgVar, vyw vywVar, azqb azqbVar) {
        this.a = context;
        this.b = wfgVar;
        this.e = vywVar;
        this.c = azqbVar;
    }

    @Override // defpackage.ajyi
    public final void a(Class cls) {
        aqxo.p(cls == aarz.class);
        this.d = new ajqw();
        if (!this.e.b()) {
            return;
        }
        this.d.f(aowx.class, new vyk(this.a, (aafo) this.c.get(), this.b));
    }

    @Override // defpackage.amqo
    public final /* bridge */ /* synthetic */ Object get() {
        return this.d;
    }
}
