package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cpz  reason: default package */
/* loaded from: classes5.dex */
final class cpz extends ne {
    private final Map<Integer, pp> b = new LinkedHashMap();
    private final cqa[] c;

    public cpz(cqa[] cqaVarArr) {
        this.c = cqaVarArr;
    }

    @Override // defpackage.ne
    public final void f(View view, pc pcVar) {
        cqa[] cqaVarArr;
        dzvx.c(view, "host");
        super.f(view, pcVar);
        for (cqa cqaVar : this.c) {
            cqaVar.b(view, pcVar);
            if (cqaVar instanceof cpk) {
                ((cpk) cqaVar).a(this.b);
            }
        }
        if (!this.b.isEmpty()) {
            if (Build.VERSION.SDK_INT >= 24) {
                pcVar.a.setImportantForAccessibility(true);
            }
            pcVar.O(true);
        }
    }

    @Override // defpackage.ne
    public final boolean i(View view, int i, Bundle bundle) {
        dzvx.c(view, "host");
        pp ppVar = this.b.get(Integer.valueOf(i));
        return (ppVar != null && ppVar.a(view)) || super.i(view, i, bundle);
    }
}
