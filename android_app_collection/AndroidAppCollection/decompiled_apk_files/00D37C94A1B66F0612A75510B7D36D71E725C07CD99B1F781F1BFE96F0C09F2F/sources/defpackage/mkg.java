package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mkg  reason: default package */
/* loaded from: classes3.dex */
public final class mkg extends ajsl {
    final ajsm a;
    public apzg b;
    private final ViewGroup c;
    private final View d;
    private final RecyclerView e;
    private final ajsf f;
    private msc g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, ajsa] */
    public mkg(ajyi ajyiVar, aafo aafoVar, ajsg ajsgVar, ViewGroup viewGroup) {
        this.c = viewGroup;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.drawer_results);
        this.e = recyclerView;
        recyclerView.ag(new LinearLayoutManager(0));
        ajsf a = ajsgVar.a(ajyiVar.get());
        this.f = a;
        recyclerView.ad(a);
        ajsm ajsmVar = new ajsm();
        this.a = ajsmVar;
        a.h(ajsmVar);
        View findViewById = viewGroup.findViewById(R.id.all_channels);
        this.d = findViewById;
        findViewById.setOnClickListener(new mkf(this, aafoVar));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        aupw aupwVar = (aupw) obj;
        aupwVar.getClass();
        if ((aupwVar.c & 32) != 0) {
            apzgVar = aupwVar.i;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        this.b = apzgVar;
        zag.o(this.d, apzgVar != null);
        if (this.g == null) {
            msc mscVar = new msc(ajrsVar, 1);
            this.g = mscVar;
            this.f.rZ(mscVar);
        }
        this.a.clear();
        for (aupy aupyVar : aupwVar.g) {
            if (aupyVar.b == 105604662) {
                aupu aupuVar = (aupu) aupyVar.c;
                if (!aupuVar.o) {
                    this.a.add(aupuVar);
                }
            }
        }
        this.a.l();
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aupw) obj).h.I();
    }

    @Override // defpackage.ajsl
    protected final boolean l() {
        return true;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.b = null;
        this.a.clear();
    }
}
