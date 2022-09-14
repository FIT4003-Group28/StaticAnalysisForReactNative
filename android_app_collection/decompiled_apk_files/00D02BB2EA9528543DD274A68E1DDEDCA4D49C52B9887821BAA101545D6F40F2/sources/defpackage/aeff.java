package defpackage;

import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aeff  reason: default package */
/* loaded from: classes2.dex */
final class aeff implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ aefg a;

    public aeff(aefg aefgVar) {
        this.a = aefgVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        cqkf<aeeq> l;
        RecyclerView recyclerView;
        abs absVar;
        aefg aefgVar = this.a;
        if (aefgVar.a == null || (l = aefgVar.l()) == null || (recyclerView = (RecyclerView) l.c().findViewById(R.id.scrollable_card_stream_container)) == null || (absVar = recyclerView.l) == null) {
            return true;
        }
        aegc aegcVar = (aegc) l.c();
        if (aegcVar != null) {
            aegcVar.h(aegcVar.w());
        }
        Parcelable parcelable = this.a.a;
        if (parcelable != null) {
            absVar.C(parcelable);
        }
        this.a.a = null;
        return false;
    }
}
