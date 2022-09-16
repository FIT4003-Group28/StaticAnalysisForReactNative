package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.libraries.social.peoplekit.PeopleKitPickerResult;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxvv  reason: default package */
/* loaded from: classes5.dex */
public final class cxvv implements View.OnClickListener {
    final /* synthetic */ PeopleKitDataLayer a;
    final /* synthetic */ PeopleKitSelectionModel b;
    final /* synthetic */ cxov c;
    final /* synthetic */ Activity d;
    final /* synthetic */ cxqo e;
    final /* synthetic */ cxwe f;

    public cxvv(cxwe cxweVar, PeopleKitDataLayer peopleKitDataLayer, PeopleKitSelectionModel peopleKitSelectionModel, cxov cxovVar, Activity activity, cxqo cxqoVar) {
        this.f = cxweVar;
        this.a = peopleKitDataLayer;
        this.b = peopleKitSelectionModel;
        this.c = cxovVar;
        this.d = activity;
        this.e = cxqoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.i(this.b.b());
        if (this.c != null) {
            List<czha> a = this.b.a(this.d);
            String h = this.f.i.h();
            czgv bZ = czgw.d.bZ();
            bZ.a(a);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            czgw czgwVar = (czgw) bZ.b;
            h.getClass();
            czgwVar.a |= 1;
            czgwVar.c = h;
            this.c.q(new PeopleKitPickerResult(this.a, bZ.bK(), this.b.b()));
        }
        cxqo cxqoVar = this.e;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(dhjm.F));
        peopleKitVisualElementPath.c(this.f.j);
        cxqoVar.d(4, peopleKitVisualElementPath);
    }
}
