package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: czsr  reason: default package */
/* loaded from: classes5.dex */
public final class czsr extends abg<czsq> {
    private List<mx<String, String>> a;

    public final void a(List<mx<String, String>> list) {
        this.a = list;
        s();
    }

    @Override // defpackage.abg
    public final int c() {
        List<mx<String, String>> list = this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ czsq d(ViewGroup viewGroup, int i) {
        return new czsq(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.survey_system_info_item, viewGroup, false));
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void e(czsq czsqVar, int i) {
        czsq czsqVar2 = czsqVar;
        mx<String, String> mxVar = this.a.get(i);
        ((TextView) czsqVar2.s.findViewById(R.id.survey_system_info_item_key)).setText(mxVar.a);
        ((TextView) czsqVar2.s.findViewById(R.id.survey_system_info_item_value)).setText(mxVar.b);
    }
}
