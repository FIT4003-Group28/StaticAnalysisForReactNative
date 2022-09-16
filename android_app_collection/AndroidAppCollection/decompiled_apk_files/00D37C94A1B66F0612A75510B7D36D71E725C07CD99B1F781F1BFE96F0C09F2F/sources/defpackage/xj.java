package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xj  reason: default package */
/* loaded from: classes4.dex */
public final class xj {
    public final Context a;
    public final sf b;
    final sr c;
    public xi d;

    public xj(Context context, View view) {
        this.a = context;
        sf sfVar = new sf(context);
        this.b = sfVar;
        sfVar.b = new xg(this);
        sr srVar = new sr(context, sfVar, view, false, R.attr.popupMenuStyle);
        this.c = srVar;
        srVar.b = 0;
        srVar.c = new xh();
    }

    public final void a() {
        this.c.f();
    }
}
