package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kty  reason: default package */
/* loaded from: classes3.dex */
public final class kty implements ajru {
    public final aafo a;
    private final View b;
    private final TextView c;

    public kty(Context context, aafo aafoVar, ViewGroup viewGroup) {
        this.a = aafoVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.see_all_button, viewGroup, false);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.text_view);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(final ajrs ajrsVar, Object obj) {
        final auqm auqmVar = (auqm) obj;
        TextView textView = this.c;
        arag aragVar = auqmVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        awbs d = ajra.d(ajrsVar);
        ampq d2 = d(auqmVar);
        if (d2.h()) {
            ajrsVar.a.o((acum) d2.c(), acun.a(d));
        }
        this.b.setOnClickListener(new View.OnClickListener() { // from class: ktx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kty ktyVar = kty.this;
                auqm auqmVar2 = auqmVar;
                ajrs ajrsVar2 = ajrsVar;
                ampq d3 = kty.d(auqmVar2);
                if (d3.h()) {
                    ajrsVar2.a.H(3, (acum) d3.c(), null);
                }
                aafo aafoVar = ktyVar.a;
                apzg apzgVar = auqmVar2.d;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.a(apzgVar);
            }
        });
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }

    public static ampq d(auqm auqmVar) {
        aoob aoobVar = (auqmVar.b & 8) != 0 ? auqmVar.f : null;
        if (aoobVar == null || aoobVar.H()) {
            if ((auqmVar.b & 4) != 0) {
                aoux aouxVar = auqmVar.e;
                if (aouxVar == null) {
                    aouxVar = aoux.a;
                }
                if (actj.c(aouxVar.c)) {
                    aoux aouxVar2 = auqmVar.e;
                    if (aouxVar2 == null) {
                        aouxVar2 = aoux.a;
                    }
                    return ampq.j(new acte(actj.a(aouxVar2.c)));
                }
            }
            return amon.a;
        }
        return ampq.j(new acte(aoobVar));
    }
}
