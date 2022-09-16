package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.ui.inline.SnappyLinearLayoutManager;
/* compiled from: PG */
/* renamed from: mgm  reason: default package */
/* loaded from: classes3.dex */
final class mgm extends SnappyLinearLayoutManager {
    final /* synthetic */ mgr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgm(mgr mgrVar, Context context) {
        super(context);
        this.a = mgrVar;
    }

    @Override // com.google.android.apps.youtube.app.ui.inline.SnappyLinearLayoutManager
    protected final yk c() {
        if (zew.y(this.a.a)) {
            return new mgq(this.a.a, this);
        }
        return new mgp(this.a.a, this);
    }
}
