package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: wej  reason: default package */
/* loaded from: classes4.dex */
public final class wej implements ajry {
    private final Context a;
    private final ajmr b;
    private final acti c;
    private final wfe d;

    public wej(Context context, ajmr ajmrVar, acti actiVar, wfe wfeVar) {
        context.getClass();
        this.a = context;
        ajmrVar.getClass();
        this.b = ajmrVar;
        actiVar.getClass();
        this.c = actiVar;
        this.d = wfeVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new wek(this.a, this.b, this.c, this.d);
    }
}
