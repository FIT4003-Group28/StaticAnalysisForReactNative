package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ngk  reason: default package */
/* loaded from: classes7.dex */
final class ngk implements btxt {
    final /* synthetic */ ngl a;

    public ngk(ngl nglVar) {
        this.a = nglVar;
    }

    @Override // defpackage.btxt
    public final void a(int i) {
        if (i != 1) {
            this.a.d.execute(new Runnable(this) { // from class: ngj
                private final ngk a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ngl nglVar = this.a.a;
                    nglVar.b.k(nglVar.c.getString(R.string.OFFLINE_LAYER_NOT_AVAILABLE, nglVar.a), 1);
                }
            });
        }
    }
}
