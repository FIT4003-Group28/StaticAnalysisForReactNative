package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
/* compiled from: PG */
/* renamed from: fmj  reason: default package */
/* loaded from: classes3.dex */
public final class fmj extends fsz {
    public final ajxz a;
    public final Context b;
    public boolean c;

    public fmj(ViewStub viewStub, Context context, ajxz ajxzVar) {
        super(viewStub);
        this.a = ajxzVar;
        this.b = context;
        this.c = false;
    }

    public final void a() {
        View view = this.f;
        if (this.e && view != null && view.getVisibility() == 0) {
            view.setVisibility(8);
        }
        this.c = false;
    }
}
