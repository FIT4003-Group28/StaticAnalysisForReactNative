package defpackage;

import android.support.v7.widget.SearchView;
/* compiled from: PG */
/* renamed from: yz  reason: default package */
/* loaded from: classes4.dex */
public final class yz implements Runnable {
    final /* synthetic */ SearchView a;
    private final /* synthetic */ int b;

    public yz(SearchView searchView) {
        this.a = searchView;
    }

    public yz(SearchView searchView, int i) {
        this.b = i;
        this.a = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            amc amcVar = this.a.mSuggestionsAdapter;
            if (!(amcVar instanceof zw)) {
                return;
            }
            amcVar.d(null);
            return;
        }
        this.a.updateFocusedState();
    }
}
