package defpackage;

import android.text.Spanned;
import android.widget.Filter;
import com.google.android.libraries.youtube.metadataeditor.geo.LocationSearchView;
import com.google.protos.youtube.api.innertube.MobilePlaceResultRendererOuterClass;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: afqt  reason: default package */
/* loaded from: classes.dex */
public final class afqt extends Filter {
    public asvk a;
    private final aawp b;
    private final afqu c;
    private Spanned d;

    public afqt(aawp aawpVar, afqu afquVar) {
        this.b = aawpVar;
        this.c = afquVar;
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        aopa createBuilder = aryx.a.createBuilder();
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        createBuilder.copyOnWrite();
        aryx aryxVar = (aryx) createBuilder.instance;
        charSequence2.getClass();
        aryxVar.b |= 4;
        aryxVar.e = charSequence2;
        asvk asvkVar = this.a;
        if (asvkVar != null) {
            createBuilder.copyOnWrite();
            aryx aryxVar2 = (aryx) createBuilder.instance;
            aryxVar2.d = asvkVar;
            aryxVar2.b |= 2;
        }
        arag aragVar = null;
        try {
            aawp aawpVar = this.b;
            aarl aarlVar = aawpVar.b;
            aawq aawqVar = new aawq(aawpVar.e, aawpVar.a.c(), createBuilder);
            aawqVar.k(aadi.b);
            aryy aryyVar = (aryy) aarlVar.d(aawqVar);
            ArrayList arrayList = new ArrayList(aryyVar.d.size());
            for (aunb aunbVar : aryyVar.d) {
                athg athgVar = (athg) aunbVar.qm(MobilePlaceResultRendererOuterClass.mobilePlaceResultRenderer);
                if ((athgVar.b & 2) == 0) {
                    String valueOf = String.valueOf(athgVar.c);
                    zep.b(valueOf.length() != 0 ? "Empty place received: ".concat(valueOf) : new String("Empty place received: "));
                } else {
                    arrayList.add(athgVar);
                }
            }
            filterResults.values = arrayList;
            filterResults.count = aryyVar.d.size();
            if ((aryyVar.b & 2) != 0 && (aragVar = aryyVar.e) == null) {
                aragVar = arag.a;
            }
            this.d = ajgl.b(aragVar);
            return filterResults;
        } catch (aart e) {
            zep.d("Failed to fetch autocomplete results.", e);
            this.d = null;
            return filterResults;
        }
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults.values != null) {
            ArrayList arrayList = (ArrayList) filterResults.values;
            if (!arrayList.isEmpty()) {
                this.c.a(arrayList);
                return;
            }
            afqu afquVar = this.c;
            LocationSearchView locationSearchView = (LocationSearchView) afquVar;
            locationSearchView.c.setText(this.d);
            locationSearchView.b.setVisibility(8);
            locationSearchView.c.setVisibility(0);
            return;
        }
        this.c.a(Collections.emptyList());
    }
}
