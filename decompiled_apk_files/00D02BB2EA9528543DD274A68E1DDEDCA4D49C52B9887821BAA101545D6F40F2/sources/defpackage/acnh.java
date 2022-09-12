package defpackage;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
/* compiled from: PG */
/* renamed from: acnh  reason: default package */
/* loaded from: classes2.dex */
final class acnh extends DataSetObserver {
    final /* synthetic */ ViewPager a;
    final /* synthetic */ acnj b;

    public acnh(acnj acnjVar, ViewPager viewPager) {
        this.b = acnjVar;
        this.a = viewPager;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.b.a = this.a.c().OV();
        this.b.invalidate();
    }
}
