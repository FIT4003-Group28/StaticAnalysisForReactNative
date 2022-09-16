package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: fkt  reason: default package */
/* loaded from: classes3.dex */
public final class fkt implements ajry {
    private final Context a;
    private final ajxz b;

    public fkt(Context context, ajxz ajxzVar) {
        this.a = context;
        this.b = ajxzVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new fks(this.a, this.b);
    }
}
