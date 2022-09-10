package defpackage;

import android.view.View;
import com.google.android.libraries.social.peoplekit.PeopleKitPickerResult;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxwf  reason: default package */
/* loaded from: classes5.dex */
final class cxwf implements View.OnClickListener {
    final /* synthetic */ cxwi a;

    public cxwf(cxwi cxwiVar) {
        this.a = cxwiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cxwi cxwiVar = this.a;
        PeopleKitSelectionModel peopleKitSelectionModel = cxwiVar.d;
        if (peopleKitSelectionModel != null) {
            cxwiVar.f.i(peopleKitSelectionModel.b());
            if (cxwiVar.e != null) {
                List<czha> a = cxwiVar.d.a(cxwiVar.a);
                czgv bZ = czgw.d.bZ();
                bZ.a(a);
                String h = cxwiVar.h();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                czgw czgwVar = (czgw) bZ.b;
                h.getClass();
                czgwVar.a |= 1;
                czgwVar.c = h;
                cxwiVar.e.q(new PeopleKitPickerResult(cxwiVar.f, bZ.bK(), cxwiVar.d.b()));
            }
            cxqo cxqoVar = cxwiVar.g;
            PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath.a(new czhc(dhjm.F));
            peopleKitVisualElementPath.c(cxwiVar.c);
            cxqoVar.d(4, peopleKitVisualElementPath);
        }
    }
}
