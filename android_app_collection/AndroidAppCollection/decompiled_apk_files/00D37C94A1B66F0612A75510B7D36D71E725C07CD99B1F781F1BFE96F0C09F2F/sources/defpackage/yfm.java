package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: yfm  reason: default package */
/* loaded from: classes4.dex */
public final class yfm implements ajry {
    private final Context a;
    private final aafo b;
    private final akbn c;

    public yfm(Context context, aafo aafoVar, akbn akbnVar) {
        this.a = context;
        aafoVar.getClass();
        this.b = aafoVar;
        this.c = akbnVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new yfn(this.a, viewGroup, this.b, this.c);
    }
}
