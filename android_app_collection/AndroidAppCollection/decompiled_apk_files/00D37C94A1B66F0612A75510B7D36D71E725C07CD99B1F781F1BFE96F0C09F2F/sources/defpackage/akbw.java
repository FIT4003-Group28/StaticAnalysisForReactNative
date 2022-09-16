package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akbw  reason: default package */
/* loaded from: classes.dex */
public final class akbw implements ajru {
    private final akbr a;
    private final View b;
    private final TextView c;
    private final acti d;

    public akbw(Context context, acti actiVar, akbr akbrVar) {
        View inflate = View.inflate(context, R.layout.emoji_picker_category, null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.category_name);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.emoji_grid);
        recyclerView.ag(new GridLayoutManager(7, null));
        recyclerView.ad(akbrVar);
        this.a = akbrVar;
        this.d = actiVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        aquq aquqVar = (aquq) obj;
        this.a.d = (akbv) ajrsVar.c("CONTROLLER_KEY");
        TextView textView = this.c;
        arag aragVar = aquqVar.d;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        if (aquqVar.e.size() > 0) {
            akbr akbrVar = this.a;
            akbrVar.e = amuk.o(aquqVar.e);
            akbrVar.mr();
        }
        if ((aquqVar.b & 4) != 0) {
            aoux aouxVar = aquqVar.f;
            if (aouxVar == null) {
                aouxVar = aoux.a;
            }
            if (!actj.c(aouxVar.c)) {
                return;
            }
            ajrsVar.a(this.d);
            aoux aouxVar2 = aquqVar.f;
            if (aouxVar2 == null) {
                aouxVar2 = aoux.a;
            }
            this.d.u(new acte(actj.a(aouxVar2.c)), null);
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.a.e = null;
    }
}
