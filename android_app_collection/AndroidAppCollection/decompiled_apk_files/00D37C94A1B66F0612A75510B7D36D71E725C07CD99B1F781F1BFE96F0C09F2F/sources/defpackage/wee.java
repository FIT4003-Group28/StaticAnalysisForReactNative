package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: wee  reason: default package */
/* loaded from: classes4.dex */
public final class wee implements ajry {
    private final Context a;
    private final yzj b;
    private final wff c;

    public wee(Context context, yzj yzjVar, wff wffVar) {
        context.getClass();
        this.a = context;
        yzjVar.getClass();
        this.b = yzjVar;
        this.c = wffVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new wef(this.a, this.b, this.c);
    }
}
