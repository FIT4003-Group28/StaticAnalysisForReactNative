package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cutv  reason: default package */
/* loaded from: classes5.dex */
public final class cutv extends RecyclerView implements cuww, cuvv {
    public final aag S;
    public final cutt T;
    public final cutl U;

    public cutv(Context context, cutq cutqVar, cuvx cuvxVar) {
        super(context);
        cutt cuttVar = new cutt(context.getResources().getDimensionPixelSize(R.dimen.suggestion_list_padding), cste.a(context));
        this.T = cuttVar;
        cutu cutuVar = new cutu(context);
        this.S = cutuVar;
        cutuVar.G(0);
        cutuVar.F(true);
        setLayoutManager(cuttVar);
        cutl cutlVar = new cutl(cuvxVar);
        this.U = cutlVar;
        setAdapter(cutlVar);
    }

    @Override // defpackage.cuww
    public final void b() {
    }

    @Override // defpackage.cuvv
    public /* bridge */ /* synthetic */ void setPresenter(Object obj) {
        Void r1 = (Void) obj;
    }

    public void setPresenter(Void r1) {
    }

    public void setSuggestionClickListener(cvfx cvfxVar) {
        this.U.e = cvfxVar;
    }
}
