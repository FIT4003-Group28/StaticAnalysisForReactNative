package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: apbz  reason: default package */
/* loaded from: classes2.dex */
class apbz implements jbk {
    final /* synthetic */ apca a;

    public apbz(apca apcaVar) {
        this.a = apcaVar;
    }

    @Override // defpackage.jbk
    public jib NC() {
        jhz a = jhz.a();
        a.q = ibm.b();
        a.u = ibm.t();
        a.A = false;
        a.f(new View.OnClickListener(this) { // from class: apby
            private final apbz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.a.s();
            }
        });
        a.g = ibm.o();
        a.d = ibm.b();
        a.x = false;
        if (this.a.k() > 0) {
            a.a = this.a.a.getString(R.string.MAPS_ACTIVITY_SELECTED_PLACES_TITLE);
        }
        return a.b();
    }
}
