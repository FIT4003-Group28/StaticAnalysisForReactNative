package defpackage;

import android.support.v7.view.menu.ActionMenuItemView;
/* compiled from: PG */
/* renamed from: uq  reason: default package */
/* loaded from: classes7.dex */
public final class uq extends zq {
    final /* synthetic */ ActionMenuItemView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.a = actionMenuItemView;
    }

    @Override // defpackage.zq
    public final vx a() {
        ur urVar = this.a.d;
        if (urVar != null) {
            return urVar.a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zq
    public final boolean b() {
        vx a;
        ActionMenuItemView actionMenuItemView = this.a;
        ve veVar = actionMenuItemView.c;
        return veVar != null && veVar.b(actionMenuItemView.b) && (a = a()) != null && a.m();
    }
}
