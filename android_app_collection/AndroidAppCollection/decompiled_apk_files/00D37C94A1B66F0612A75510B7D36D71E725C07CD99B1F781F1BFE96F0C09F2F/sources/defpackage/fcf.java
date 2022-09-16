package defpackage;

import android.text.TextUtils;
import android.view.View;
/* compiled from: PG */
/* renamed from: fcf  reason: default package */
/* loaded from: classes3.dex */
public final class fcf implements View.OnClickListener {
    private final fcl a;
    private final ahce b;
    private final aafo c;
    private final String d;
    private final attp e;
    private final apoj f;
    private final azqb g;
    private final azqb h;
    private final acti i;

    public fcf(fcl fclVar, ahce ahceVar, aafo aafoVar, String str, attp attpVar, apoj apojVar, azqb azqbVar, azqb azqbVar2, acti actiVar) {
        this.a = fclVar;
        this.b = ahceVar;
        this.c = aafoVar;
        this.d = str;
        this.e = attpVar;
        this.f = apojVar;
        this.g = azqbVar;
        this.h = azqbVar2;
        this.i = actiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (TextUtils.isEmpty(this.d)) {
            return;
        }
        apoj apojVar = this.f;
        if (apojVar != null) {
            if ((apojVar.b & 16384) == 0) {
                return;
            }
            aafo aafoVar = this.c;
            apzg apzgVar = apojVar.o;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        } else if (!this.a.i(this.d)) {
            this.b.j(this.d, this.e, this.i, null);
        } else if (((Boolean) this.g.get()).booleanValue()) {
            this.b.g(this.d);
        } else if (((Boolean) this.h.get()).booleanValue()) {
            this.b.f(this.d, ahbt.a(true));
        } else {
            this.b.a(this.d, ahbt.a(true));
        }
    }
}
