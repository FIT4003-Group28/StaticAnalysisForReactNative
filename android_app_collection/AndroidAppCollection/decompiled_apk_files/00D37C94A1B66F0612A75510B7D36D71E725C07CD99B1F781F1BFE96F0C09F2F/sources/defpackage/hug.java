package defpackage;

import android.support.constraint.ConstraintLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hug  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hug implements axnm {
    public final /* synthetic */ huj a;
    private final /* synthetic */ int b;

    public /* synthetic */ hug(huj hujVar, int i) {
        this.b = i;
        this.a = hujVar;
    }

    @Override // defpackage.axnm
    public final Object get() {
        return this.b != 0 ? this.a.ax : (ConstraintLayout) this.a.as.findViewById(R.id.tabs_constraint_layout);
    }
}
