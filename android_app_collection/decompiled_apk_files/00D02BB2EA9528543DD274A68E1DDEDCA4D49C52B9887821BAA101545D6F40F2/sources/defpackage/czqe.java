package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: czqe  reason: default package */
/* loaded from: classes5.dex */
final class czqe extends abx {
    final /* synthetic */ View a;
    final /* synthetic */ czqf b;

    public czqe(czqf czqfVar, View view) {
        this.b = czqfVar;
        this.a = view;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (!recyclerView.canScrollVertically(-1)) {
            this.a.findViewById(R.id.survey_system_info_dialog_title).setElevation(0.0f);
        } else {
            this.a.findViewById(R.id.survey_system_info_dialog_title).setElevation(this.b.getResources().getDimensionPixelSize(R.dimen.survey_system_info_dialog_title_elevation));
        }
        this.a.findViewById(R.id.survey_system_info_dialog_section_divider).setVisibility(true != recyclerView.canScrollVertically(1) ? 8 : 0);
    }
}
