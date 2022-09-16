package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.metadataeditor.geo.LocationSearchView;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: acla  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acla implements zdt {
    public final /* synthetic */ acll a;
    private final /* synthetic */ int b;

    public /* synthetic */ acla(acll acllVar) {
        this.a = acllVar;
    }

    public /* synthetic */ acla(acll acllVar, int i) {
        this.b = i;
        this.a = acllVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            acll acllVar = this.a;
            View view = (View) obj;
            if (acllVar.e == null) {
                acllVar.e = acllVar.aF.a((LocationSearchView) view, new aclc(acllVar));
            }
            acllVar.e.a();
            acllVar.d = R.id.pre_stream_location_search;
        } else if (i == 1) {
            View view2 = (View) obj;
            this.a.d = R.id.pre_stream_content;
        } else if (i == 2) {
            acll acllVar2 = this.a;
            View view3 = (View) obj;
            if (acllVar2.as == null) {
                aciy aciyVar = acllVar2.aJ;
                ackv ackvVar = new ackv(acllVar2);
                abzb abzbVar = (abzb) aciyVar.a.get();
                abzbVar.getClass();
                Executor executor = (Executor) aciyVar.b.get();
                executor.getClass();
                view3.getClass();
                acllVar2.as = new acix(abzbVar, executor, view3, ackvVar);
            }
            acix acixVar = acllVar2.as;
            acixVar.e.w();
            acixVar.e.mr();
            acixVar.b.setText((CharSequence) null);
            acixVar.b.requestFocus();
            zag.p(acixVar.b);
        } else {
            acll acllVar3 = this.a;
            arbt arbtVar = ((arbp) obj).c;
            if (arbtVar == null) {
                arbtVar = arbt.a;
            }
            acllVar3.aE(arbtVar);
        }
    }
}
