package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: mlt  reason: default package */
/* loaded from: classes3.dex */
public final class mlt implements ajru {
    final ajsm a;
    public ajrs b;
    private final ViewGroup c;
    private final TextView d;
    private final ajrc e;
    private final mls f;
    private final aadd g;
    private final Resources h;
    private int i;

    public mlt(Context context, ajsg ajsgVar, akfb akfbVar, fly flyVar, final fjy fjyVar, aadd aaddVar) {
        this.h = context.getResources();
        this.g = aaddVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.mysubs_content_filter, (ViewGroup) null, false);
        this.c = viewGroup;
        this.d = (TextView) viewGroup.findViewById(R.id.title_text);
        this.f = new mls(viewGroup, flyVar.d(null, R.layout.mysubs_sort_filter_item_header, R.layout.mysubs_sort_filter_spinner_contents), akfbVar);
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.button_container);
        recyclerView.ag(new LinearLayoutManager(0));
        ajsi ajsiVar = new ajsi();
        final akbh akbhVar = new akbh() { // from class: mlr
            @Override // defpackage.akbh
            public final Map a() {
                mlt mltVar = mlt.this;
                HashMap hashMap = new HashMap(2);
                Bundle bundle = new Bundle();
                bundle.putBoolean("menu_as_bottom_sheet", true);
                hashMap.put("com.google.android.libraries.youtube.innertube.bundle", bundle);
                hashMap.put("sectionListController", mltVar.b.c("sectionListController"));
                return hashMap;
            }
        };
        ajsiVar.f(apoj.class, new ajry() { // from class: mlq
            @Override // defpackage.ajry
            public final ajru b(ViewGroup viewGroup2) {
                fjy fjyVar2 = fjy.this;
                akbh akbhVar2 = akbhVar;
                fjx b = fjyVar2.b(null, null, R.layout.mysubs_content_filter_button);
                b.a.e = akbhVar2;
                return b;
            }
        });
        ajsf a = ajsgVar.a(ajsiVar);
        ajsm ajsmVar = new ajsm();
        this.a = ajsmVar;
        a.h(ajsmVar);
        ajrc ajrcVar = new ajrc();
        this.e = ajrcVar;
        a.rZ(ajrcVar);
        recyclerView.ad(a);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        atnj atnjVar;
        atnj atnjVar2;
        atni atniVar = (atni) obj;
        this.b = ajrsVar;
        this.e.a = ajrsVar.a;
        this.a.clear();
        for (apok apokVar : atniVar.d) {
            if (apokVar != null && (1 & apokVar.b) != 0) {
                ajsm ajsmVar = this.a;
                apoj apojVar = apokVar.c;
                if (apojVar == null) {
                    apojVar = apoj.a;
                }
                ajsmVar.add(apojVar);
            }
        }
        if (eog.E(this.g) && this.h.getConfiguration().orientation == 1) {
            this.i = zew.i(this.h.getDisplayMetrics(), 16);
            ViewGroup viewGroup = this.c;
            viewGroup.setPadding(viewGroup.getPaddingLeft(), 0, this.c.getPaddingRight(), this.i);
        } else {
            ViewGroup viewGroup2 = this.c;
            viewGroup2.setPadding(viewGroup2.getPaddingLeft(), 0, this.c.getPaddingRight(), 0);
        }
        if (atniVar.b == 1) {
            aragVar = (arag) atniVar.c;
        } else {
            aragVar = arag.a;
        }
        auxr auxrVar = null;
        if (!TextUtils.isEmpty(ajgl.b(aragVar))) {
            this.d.setText(ajgl.b(atniVar.b == 1 ? (arag) atniVar.c : null));
            this.d.setVisibility(0);
            this.f.a(this.b, null, null);
            return;
        }
        mls mlsVar = this.f;
        if (atniVar.b == 6) {
            atnjVar = (atnj) atniVar.c;
        } else {
            atnjVar = atnj.a;
        }
        if ((atnjVar.b & 1) != 0) {
            if (atniVar.b == 6) {
                atnjVar2 = (atnj) atniVar.c;
            } else {
                atnjVar2 = atnj.a;
            }
            auxrVar = atnjVar2.c;
            if (auxrVar == null) {
                auxrVar = auxr.a;
            }
        }
        atnh atnhVar = atniVar.e;
        if (atnhVar == null) {
            atnhVar = atnh.a;
        }
        mlsVar.a(ajrsVar, auxrVar, atnhVar);
        this.d.setVisibility(8);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
