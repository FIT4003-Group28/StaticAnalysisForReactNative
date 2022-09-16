package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: czso  reason: default package */
/* loaded from: classes5.dex */
final class czso extends abx {
    final /* synthetic */ View a;
    final /* synthetic */ czsp b;

    public czso(czsp czspVar, View view) {
        this.b = czspVar;
        this.a = view;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (!recyclerView.canScrollVertically(-1)) {
            this.a.findViewById(R.id.survey_system_info_dialog_title).setElevation(0.0f);
        } else {
            this.a.findViewById(R.id.survey_system_info_dialog_title).setElevation(this.b.Rn().getDimensionPixelSize(R.dimen.survey_system_info_dialog_title_elevation));
        }
        this.a.findViewById(R.id.survey_system_info_dialog_section_divider).setVisibility(true != recyclerView.canScrollVertically(1) ? 8 : 0);
    }
}
