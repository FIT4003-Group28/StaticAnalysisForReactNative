package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axst  reason: default package */
/* loaded from: classes3.dex */
final class axst implements Runnable {
    final /* synthetic */ alap a;
    final /* synthetic */ int b;
    final /* synthetic */ axtp c;

    public axst(axtp axtpVar, alap alapVar, int i) {
        this.c = axtpVar;
        this.a = alapVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.c.v.c() || !this.c.r.a().n(axtp.W(this.a)).booleanValue()) {
            axtp axtpVar = this.c;
            axtpVar.V(this.a, axtpVar.b.getString(R.string.STARRED_PLACES_BUILT_IN_LIST_TITLE), drcs.PRIVATE, this.b);
        }
    }
}
