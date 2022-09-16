package defpackage;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: igr  reason: default package */
/* loaded from: classes3.dex */
public final class igr extends zxr {
    public final ajin a;
    public final ajhl b;
    public final NestedScrollView c;
    public final iee d;
    public final acth e;
    public final boolean f;
    public arag g;
    public Optional h;
    public int i;
    private final aafo j;

    public igr(eo eoVar, Context context, ajin ajinVar, ajhl ajhlVar, aafo aafoVar, iee ieeVar, acth acthVar, Optional optional, boolean z) {
        super(context, eoVar, null, optional, true, z, true);
        this.i = 0;
        this.a = ajinVar;
        this.b = ajhlVar;
        this.j = aafoVar;
        this.f = z;
        this.c = new NestedScrollView(context);
        this.d = ieeVar;
        this.e = acthVar;
        this.h = Optional.empty();
    }

    @Override // defpackage.zxr
    protected final View a() {
        return this.c;
    }

    @Override // defpackage.zxr
    protected final CharSequence b() {
        arag aragVar = this.g;
        return aragVar == null ? "" : ajgl.b(aragVar);
    }

    @Override // defpackage.zxr, defpackage.zxy
    public final void f() {
        super.f();
        this.g = null;
        this.b.qZ(null);
        this.c.removeAllViews();
        if (this.h.isPresent()) {
            this.j.a((apzg) this.h.get());
            this.h = Optional.empty();
        }
        int i = this.i;
        if (i != 0) {
            this.d.c(i);
            this.i = 0;
        }
    }
}
