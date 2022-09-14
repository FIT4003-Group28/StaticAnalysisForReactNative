package defpackage;

import android.view.View;
import java.util.Objects;
/* compiled from: PG */
/* renamed from: czvc  reason: default package */
/* loaded from: classes5.dex */
final class czvc implements nq {
    final /* synthetic */ czvg a;

    public czvc(czvg czvgVar) {
        this.a = czvgVar;
    }

    @Override // defpackage.nq
    public final ow a(View view, ow owVar) {
        czvg czvgVar = this.a;
        ow owVar2 = true != od.M(czvgVar) ? null : owVar;
        if (!Objects.equals(czvgVar.d, owVar2)) {
            czvgVar.d = owVar2;
            czvgVar.requestLayout();
        }
        return owVar.h();
    }
}
