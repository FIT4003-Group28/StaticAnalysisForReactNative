package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: mtd  reason: default package */
/* loaded from: classes3.dex */
public final class mtd implements ajry {
    private final Context a;
    private final mte b;

    public mtd(Context context, mte mteVar) {
        context.getClass();
        this.a = context;
        this.b = mteVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new mtf(this.a, this.b);
    }
}
