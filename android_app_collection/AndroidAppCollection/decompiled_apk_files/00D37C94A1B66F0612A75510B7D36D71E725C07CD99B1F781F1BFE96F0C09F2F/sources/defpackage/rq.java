package defpackage;

import android.support.v7.view.menu.ActionMenuItemView;
/* compiled from: PG */
/* renamed from: rq  reason: default package */
/* loaded from: classes4.dex */
public final class rq extends wc {
    final /* synthetic */ ActionMenuItemView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.a = actionMenuItemView;
    }

    @Override // defpackage.wc
    public final sx a() {
        tk tkVar;
        rr rrVar = this.a.d;
        if (rrVar == null || (tkVar = rrVar.a.l) == null) {
            return null;
        }
        return tkVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wc
    public final boolean b() {
        sx a;
        ActionMenuItemView actionMenuItemView = this.a;
        se seVar = actionMenuItemView.c;
        return seVar != null && seVar.b(actionMenuItemView.b) && (a = a()) != null && a.u();
    }
}
