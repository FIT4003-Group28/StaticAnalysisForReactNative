package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akcf  reason: default package */
/* loaded from: classes.dex */
public final class akcf implements ajru {
    private final akck a;
    private final View b;
    private final TextView c;
    private final acti d;

    public akcf(Context context, acti actiVar, akck akckVar) {
        this.d = actiVar;
        View inflate = View.inflate(context, R.layout.emoji_picker_category, null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.category_name);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.emoji_grid);
        recyclerView.ag(new GridLayoutManager(7, null));
        recyclerView.ad(akckVar);
        this.a = akckVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        aqut aqutVar = (aqut) obj;
        akck akckVar = this.a;
        apzg apzgVar = aqutVar.f;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        akckVar.e = apzgVar;
        TextView textView = this.c;
        arag aragVar = aqutVar.d;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        if (aqutVar.e.size() > 0) {
            akck akckVar2 = this.a;
            akckVar2.d = amuk.o(aqutVar.e);
            akckVar2.mr();
        }
        if ((aqutVar.b & 32) != 0) {
            aoux aouxVar = aqutVar.g;
            if (aouxVar == null) {
                aouxVar = aoux.a;
            }
            if (!actj.c(aouxVar.c)) {
                return;
            }
            ajrsVar.a(this.d);
            aoux aouxVar2 = aqutVar.g;
            if (aouxVar2 == null) {
                aouxVar2 = aoux.a;
            }
            this.d.u(new acte(actj.a(aouxVar2.c)), null);
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.a.d = null;
    }
}
