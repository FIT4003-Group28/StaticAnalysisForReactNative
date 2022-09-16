package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: vyt  reason: default package */
/* loaded from: classes4.dex */
public final class vyt implements ajry {
    private final Context a;
    private final ajmy b;
    private final acti c;
    private final wfe d;
    private final wfg e;
    private final ajxz f;
    private final akbk g;

    public vyt(Context context, ajmy ajmyVar, acti actiVar, wfe wfeVar, wfg wfgVar, ajxz ajxzVar, akbk akbkVar) {
        context.getClass();
        this.a = context;
        ajmyVar.getClass();
        this.b = ajmyVar;
        actiVar.getClass();
        this.c = actiVar;
        this.d = wfeVar;
        this.e = wfgVar;
        this.f = ajxzVar;
        this.g = akbkVar;
    }

    public final vyu a() {
        return new vyu(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return a();
    }
}
