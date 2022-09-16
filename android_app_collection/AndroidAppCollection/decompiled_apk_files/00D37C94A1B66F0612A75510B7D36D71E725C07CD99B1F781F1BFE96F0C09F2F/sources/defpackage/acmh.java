package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: acmh  reason: default package */
/* loaded from: classes.dex */
public final class acmh implements ajry {
    public ajyb a;
    public ajya b;
    private final Context c;
    private final aafo d;
    private final ajxz e;

    public acmh(Context context, aafo aafoVar, ajxz ajxzVar) {
        this.c = context;
        this.d = aafoVar;
        this.e = ajxzVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        ajya ajyaVar = this.b;
        ajyaVar.getClass();
        ajyb ajybVar = this.a;
        ajybVar.getClass();
        return new acmi(this.c, this.d, this.e, ajyaVar, ajybVar);
    }
}
