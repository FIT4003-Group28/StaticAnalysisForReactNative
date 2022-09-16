package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: czsp  reason: default package */
/* loaded from: classes5.dex */
public final class czsp extends ex {
    public static final String ad;

    static {
        String valueOf = String.valueOf(czsp.class.getSimpleName());
        ad = valueOf.length() != 0 ? "SurveySysInfoDialog-".concat(valueOf) : new String("SurveySysInfoDialog-");
    }

    @Override // defpackage.ex
    public final Dialog q(Bundle bundle) {
        ff J = J();
        View inflate = J().getLayoutInflater().inflate(R.layout.survey_system_info_dialog, (ViewGroup) null);
        czys czysVar = new czys(J);
        czysVar.t(inflate);
        final qy b = czysVar.b();
        inflate.findViewById(R.id.survey_system_info_dialog_ok_button).setOnClickListener(new View.OnClickListener(b) { // from class: czsn
            private final qy a;

            {
                this.a = b;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qy qyVar = this.a;
                String str = czsp.ad;
                qyVar.cancel();
            }
        });
        Bundle bundle2 = this.o;
        String string = bundle2.getString("EXTRA_ACCOUNT_NAME");
        Bundle bundle3 = bundle2.getBundle("EXTRA_PSD_BUNDLE");
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.survey_system_info_dialog_list_items);
        recyclerView.setLayoutManager(new aag());
        czsr czsrVar = new czsr();
        recyclerView.setAdapter(czsrVar);
        recyclerView.i(new czso(this, inflate));
        czsrVar.a(czph.g(J, string, bundle3));
        return b;
    }
}
