package defpackage;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
/* compiled from: PG */
/* renamed from: bbd  reason: default package */
/* loaded from: classes3.dex */
public final class bbd extends DataSetObserver {
    final /* synthetic */ ViewPager a;

    public bbd(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.k();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.k();
    }
}
