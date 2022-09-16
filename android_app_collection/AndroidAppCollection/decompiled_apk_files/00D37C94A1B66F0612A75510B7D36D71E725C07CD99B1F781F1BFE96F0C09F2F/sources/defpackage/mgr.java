package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.common.rendering.SnappyRecyclerView;
import com.google.android.apps.youtube.app.ui.inline.SnappyLinearLayoutManager;
/* compiled from: PG */
/* renamed from: mgr  reason: default package */
/* loaded from: classes3.dex */
public final class mgr {
    public final Context a;
    public final SnappyLinearLayoutManager b;
    public final ajsg c;
    public final ajyi d;
    public final acth e;
    public ajzi f;
    final mgn g;
    SnappyRecyclerView h;

    public mgr(Context context, ajmy ajmyVar, ajsg ajsgVar, ajyi ajyiVar, acth acthVar) {
        this.a = context;
        this.c = ajsgVar;
        this.d = ajyiVar;
        this.e = acthVar;
        mgm mgmVar = new mgm(this, context);
        mgmVar.ab(0);
        this.b = mgmVar;
        this.g = new mgn(context, ajmyVar);
    }
}
