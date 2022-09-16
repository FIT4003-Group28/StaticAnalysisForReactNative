package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Space;
/* compiled from: PG */
/* renamed from: ajrb  reason: default package */
/* loaded from: classes.dex */
public final class ajrb implements ajru {
    private final Context a;
    private final aafo b;
    private final acuh c;
    private View d;

    public ajrb(Context context, aafo aafoVar, acuh acuhVar) {
        this.a = context;
        this.b = aafoVar;
        this.c = acuhVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        if (this.d == null) {
            this.d = new Space(this.a);
        }
        return this.d;
    }

    @Override // defpackage.ajru
    /* renamed from: d */
    public final void oK(ajrs ajrsVar, aqio aqioVar) {
        ajrsVar.a.u(new acte(aqioVar.b), null);
        if (!this.c.b(aqioVar)) {
            this.c.a(aqioVar);
            aafx.c(this.b, aqioVar.c, aqioVar);
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
