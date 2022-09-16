package defpackage;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;
/* compiled from: PG */
/* renamed from: aloq  reason: default package */
/* loaded from: classes.dex */
public final class aloq extends DataSetObserver {
    final /* synthetic */ TabLayout a;

    public aloq(TabLayout tabLayout) {
        this.a = tabLayout;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.f();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.f();
    }
}
