package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbys  reason: default package */
/* loaded from: classes3.dex */
public final class bbys implements cqkn<bbyg> {
    final /* synthetic */ bbyy a;

    public bbys(bbyy bbyyVar) {
        this.a = bbyyVar;
    }

    @Override // defpackage.cqkn
    public final /* bridge */ /* synthetic */ void a(bbyg bbygVar, View view) {
        isc a = this.a.f.a(view);
        jhm jhmVar = new jhm();
        jhmVar.a = this.a.b.getString(R.string.OPEN_SYSTEM_CAMERA);
        jhmVar.f = cjtd.a(dtxu.K);
        jhmVar.d(new View.OnClickListener(this) { // from class: bbyr
            private final bbys a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                bbwq bbwqVar = this.a.a.a;
                if (!bbwqVar.aD) {
                    return;
                }
                bbwqVar.aj = true;
                bbwqVar.g.a(bbwqVar, bbwqVar.ai, false, bbts.k().a());
            }
        });
        a.a(dcdc.f(jhmVar.c()));
        a.show();
    }
}
