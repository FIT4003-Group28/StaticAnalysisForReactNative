package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: wce  reason: default package */
/* loaded from: classes4.dex */
public final class wce implements View.OnClickListener, ajru {
    private final View a;
    private final RecyclerView b;
    private final wcd c;
    private final wbc d;

    public wce(Context context, wbc wbcVar, ViewGroup viewGroup) {
        this.d = wbcVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.modal_other_methods_layout, viewGroup, false);
        this.a = inflate;
        wcd wcdVar = new wcd(context, wbcVar);
        this.c = wcdVar;
        inflate.findViewById(R.id.close_button).setOnClickListener(this);
        inflate.findViewById(R.id.cancel_button).setOnClickListener(this);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.methods_list);
        this.b = recyclerView;
        recyclerView.ad(wcdVar);
        recyclerView.ag(new LinearLayoutManager());
        recyclerView.aC(new vr(context));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        wcd wcdVar = this.c;
        wcdVar.d = ((wcx) obj).a;
        wcdVar.mr();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.d.b();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        wcd wcdVar = this.c;
        wcdVar.d = null;
        wcdVar.mr();
    }
}
