package defpackage;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
/* compiled from: PG */
/* renamed from: bpo  reason: default package */
/* loaded from: classes2.dex */
public final class bpo extends DataSetObserver {
    final /* synthetic */ ViewPager a;

    public bpo(ViewPager viewPager) {
        this.a = viewPager;
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
