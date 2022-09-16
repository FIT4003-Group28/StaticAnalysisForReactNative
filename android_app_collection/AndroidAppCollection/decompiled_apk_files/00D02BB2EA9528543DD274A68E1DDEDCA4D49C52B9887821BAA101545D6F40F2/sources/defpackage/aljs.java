package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: aljs  reason: default package */
/* loaded from: classes.dex */
final class aljs implements alkp {
    final /* synthetic */ alot a;
    final /* synthetic */ bnsn b;
    final /* synthetic */ akpq c;
    final /* synthetic */ btrm d;
    final /* synthetic */ akzh e;
    final /* synthetic */ Context f;

    public aljs(alot alotVar, bnsn bnsnVar, akpq akpqVar, btrm btrmVar, akzh akzhVar, Context context) {
        this.a = alotVar;
        this.b = bnsnVar;
        this.c = akpqVar;
        this.d = btrmVar;
        this.e = akzhVar;
        this.f = context;
    }

    @Override // defpackage.alkp
    public final alko a(alkq alkqVar, @dzsi alvn alvnVar) {
        bnrz bnrzVar;
        alwr alwrVar = alvnVar != null ? alvnVar.e : alwr.DEFAULT;
        alwr alwrVar2 = alwr.DEFAULT;
        int ordinal = alwrVar.ordinal();
        if (ordinal == 1) {
            bnrzVar = bntn.CLIENT_INJECTED_AREAS_ABOVE_LABELS;
        } else if (ordinal == 2) {
            bnrzVar = bntn.CLIENT_INJECTED_AREAS_ABOVE_LABELS_AND_CALLOUTS;
        } else {
            bnrzVar = bntj.a;
        }
        return new alko(alkqVar, bnrzVar);
    }
}
