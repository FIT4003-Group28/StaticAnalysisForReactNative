package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: emh  reason: default package */
/* loaded from: classes3.dex */
public final class emh implements ajry {
    private final Context a;
    private final fob b;

    public emh(Context context, fob fobVar) {
        this.a = context;
        this.b = fobVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new emi(this.a, this.b, viewGroup);
    }
}
