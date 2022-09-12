package defpackage;

import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: baba  reason: default package */
/* loaded from: classes3.dex */
public final class baba implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ babb a;

    public baba(babb babbVar) {
        this.a = babbVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        babb babbVar = this.a;
        if (babbVar.ak != null) {
            View findViewById = babbVar.ai.c().findViewById(R.id.saved_tab_content);
            if (!(findViewById instanceof RecyclerView)) {
                return true;
            }
            SparseArray<Parcelable> sparseArray = this.a.ak;
            dbsk.s(sparseArray);
            ((RecyclerView) findViewById).restoreHierarchyState(sparseArray);
            this.a.ak = null;
            return true;
        }
        return true;
    }
}
