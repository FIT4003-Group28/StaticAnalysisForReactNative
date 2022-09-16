package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
/* compiled from: PG */
/* renamed from: mdl  reason: default package */
/* loaded from: classes3.dex */
public class mdl extends yk {
    private final LinearLayoutManager a;

    public mdl(Context context, LinearLayoutManager linearLayoutManager) {
        super(context);
        this.a = linearLayoutManager;
    }

    @Override // defpackage.yk
    public final PointF d(int i) {
        return this.a.O(i);
    }

    @Override // defpackage.yk
    protected final int k() {
        return -1;
    }

    @Override // defpackage.yk
    protected final int l() {
        return -1;
    }
}
