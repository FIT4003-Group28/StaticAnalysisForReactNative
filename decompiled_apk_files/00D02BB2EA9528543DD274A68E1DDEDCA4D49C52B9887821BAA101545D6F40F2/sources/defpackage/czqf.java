package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: czqf  reason: default package */
/* loaded from: classes5.dex */
public final class czqf extends DialogFragment {
    public static final String a;

    static {
        String valueOf = String.valueOf(czqf.class.getSimpleName());
        a = valueOf.length() != 0 ? "SurveyPlatSysInfoDialog-".concat(valueOf) : new String("SurveyPlatSysInfoDialog-");
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.survey_system_info_dialog, (ViewGroup) null);
        czys czysVar = new czys(activity);
        czysVar.t(inflate);
        final qy b = czysVar.b();
        inflate.findViewById(R.id.survey_system_info_dialog_ok_button).setOnClickListener(new View.OnClickListener(b) { // from class: czqd
            private final qy a;

            {
                this.a = b;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qy qyVar = this.a;
                String str = czqf.a;
                qyVar.cancel();
            }
        });
        Bundle arguments = getArguments();
        String string = arguments.getString("EXTRA_ACCOUNT_NAME");
        Bundle bundle2 = arguments.getBundle("EXTRA_PSD_BUNDLE");
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.survey_system_info_dialog_list_items);
        recyclerView.setLayoutManager(new aag());
        czsr czsrVar = new czsr();
        recyclerView.setAdapter(czsrVar);
        recyclerView.i(new czqe(this, inflate));
        czsrVar.a(czph.g(activity, string, bundle2));
        return b;
    }
}
