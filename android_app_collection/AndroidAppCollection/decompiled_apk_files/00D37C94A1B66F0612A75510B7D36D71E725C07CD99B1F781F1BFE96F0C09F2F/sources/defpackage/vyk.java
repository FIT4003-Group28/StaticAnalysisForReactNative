package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: vyk  reason: default package */
/* loaded from: classes4.dex */
public final class vyk implements ajry {
    private final Context a;
    private final aafo b;
    private final wfg c;

    public vyk(Context context, aafo aafoVar, wfg wfgVar) {
        context.getClass();
        this.a = context;
        this.b = aafoVar;
        this.c = wfgVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new vyl(this.a, this.b, this.c);
    }
}
