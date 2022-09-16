package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gxr  reason: default package */
/* loaded from: classes3.dex */
public final class gxr extends zxr {
    final /* synthetic */ gxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxr(gxs gxsVar, Context context, eo eoVar, acti actiVar) {
        super(context, eoVar, actiVar, true, true);
        this.a = gxsVar;
    }

    @Override // defpackage.zxr
    protected final View a() {
        if (!this.a.j()) {
            gxs gxsVar = this.a;
            gxsVar.b(gxs.a);
            gxsVar.c(true);
            return gxsVar.k;
        }
        gxs gxsVar2 = this.a;
        gvz gvzVar = gxsVar2.p.j;
        if (gvzVar != null) {
            gvzVar.a();
        }
        gxsVar2.h(true, true);
        return gxsVar2.l;
    }

    @Override // defpackage.zxr
    protected final CharSequence b() {
        return this.a.g.getString(R.string.shorts_green_screen_title);
    }

    @Override // defpackage.zxr, defpackage.zxy
    public final void f() {
        super.f();
        for (View view : this.a.c) {
            if (view != null) {
                view.setVisibility(0);
            }
        }
        if (this.a.r == gxs.b) {
            this.a.e.c(acuo.a(127083)).a();
        }
        this.a.c(false);
        this.a.r = null;
    }

    @Override // defpackage.zxr, defpackage.zxy
    public final void g() {
        for (View view : this.a.c) {
            if (view != null) {
                view.setVisibility(4);
            }
        }
        super.g();
    }

    @Override // defpackage.zxr
    protected final boolean h() {
        return false;
    }

    @Override // defpackage.zxr
    protected final actj lR() {
        return null;
    }
}
