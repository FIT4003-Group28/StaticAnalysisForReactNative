package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: klh  reason: default package */
/* loaded from: classes3.dex */
public final class klh implements ajry {
    private final Context a;
    private final ajmy b;
    private final aafo c;
    private final acti d;
    private final fmh e;
    private final fnz f;

    public klh(Context context, acti actiVar, ajmy ajmyVar, aafo aafoVar, fmh fmhVar, fnz fnzVar) {
        this.a = context;
        ajmyVar.getClass();
        this.b = ajmyVar;
        aafoVar.getClass();
        this.c = aafoVar;
        this.d = actiVar;
        this.e = fmhVar;
        this.f = fnzVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new kli(this.a, viewGroup, this.d, this.b, this.c, this.e, this.f);
    }
}
