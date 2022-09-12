package defpackage;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: isb  reason: default package */
/* loaded from: classes6.dex */
public final class isb extends ActionProvider {
    final /* synthetic */ cjtd a;
    final /* synthetic */ MenuItem b;
    final /* synthetic */ jho c;
    final /* synthetic */ isc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isb(isc iscVar, Context context, cjtd cjtdVar, MenuItem menuItem, jho jhoVar) {
        super(context);
        this.d = iscVar;
        this.a = cjtdVar;
        this.b = menuItem;
        this.c = jhoVar;
    }

    @Override // android.view.ActionProvider
    @Deprecated
    public final View onCreateActionView() {
        View view = new View(this.d.a);
        cjtd cjtdVar = this.a;
        if (cjtdVar != null) {
            cjqg.h(view, cjtdVar);
        }
        return view;
    }

    @Override // android.view.ActionProvider
    public final boolean onPerformDefaultAction() {
        PopupMenu.OnMenuItemClickListener onMenuItemClickListener;
        View actionView = this.b.getActionView();
        if (!this.c.d(actionView, cjqg.r(this.d.b, actionView)) && (onMenuItemClickListener = this.d.c) != null) {
            onMenuItemClickListener.onMenuItemClick(this.b);
        }
        return true;
    }
}
