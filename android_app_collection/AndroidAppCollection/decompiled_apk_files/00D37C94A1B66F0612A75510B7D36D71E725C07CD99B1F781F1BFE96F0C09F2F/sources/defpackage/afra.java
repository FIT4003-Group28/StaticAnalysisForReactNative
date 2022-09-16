package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.metadataeditor.geo.Place;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: afra  reason: default package */
/* loaded from: classes.dex */
public final class afra extends xo {
    public List d = new ArrayList();
    public afqv e;
    private final LayoutInflater f;
    private final afqy g;

    public afra(LayoutInflater layoutInflater, afqy afqyVar) {
        this.f = layoutInflater;
        this.g = afqyVar;
    }

    @Override // defpackage.xo
    public final int b() {
        return this.d.size();
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ yo f(ViewGroup viewGroup, int i) {
        return new afrc(this.f.inflate(R.layout.metadataeditor_location_search_item, viewGroup, false), this.e, this.g);
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void o(yo yoVar, int i) {
        arag aragVar;
        final afrc afrcVar = (afrc) yoVar;
        final athg athgVar = (athg) this.d.get(i);
        TextView textView = afrcVar.t;
        arag aragVar2 = null;
        if ((athgVar.b & 2) != 0) {
            aragVar = athgVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = afrcVar.u;
        if ((athgVar.b & 4) != 0 && (aragVar2 = athgVar.e) == null) {
            aragVar2 = arag.a;
        }
        textView2.setText(ajgl.b(aragVar2));
        afrcVar.a.setOnClickListener(new View.OnClickListener() { // from class: afrb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                afrc afrcVar2 = afrc.this;
                athg athgVar2 = athgVar;
                afrcVar2.w.a.b(true);
                afqs afqsVar = afrcVar2.v.b;
                String str = athgVar2.c;
                arag aragVar3 = athgVar2.d;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
                afqsVar.e(new Place(str, ajgl.b(aragVar3).toString()));
            }
        });
    }
}
