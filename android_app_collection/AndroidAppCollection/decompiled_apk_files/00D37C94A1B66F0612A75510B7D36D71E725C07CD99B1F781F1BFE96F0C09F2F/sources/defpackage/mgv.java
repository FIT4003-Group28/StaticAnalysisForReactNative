package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mgv  reason: default package */
/* loaded from: classes3.dex */
public final class mgv implements ajru {
    public final aafo a;
    private final View b;
    private final TextView c;
    private final TextView d;

    public mgv(Context context, aafo aafoVar, akem akemVar) {
        this.a = aafoVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.comments_entry_point_user_edu, (ViewGroup) null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.title);
        this.d = (TextView) inflate.findViewById(R.id.call_to_action);
        if (akemVar.d()) {
            akemVar.c(inflate, akemVar.a(inflate, null));
        } else {
            zav.d(inflate, zag.e(context, 0));
        }
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(final ajrs ajrsVar, Object obj) {
        Spanned spanned;
        Spanned spanned2;
        final aqci aqciVar = (aqci) obj;
        TextView textView = this.c;
        if ((aqciVar.b & 1) != 0) {
            arag aragVar = aqciVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            spanned = ajgl.b(aragVar);
        } else {
            spanned = null;
        }
        zag.m(textView, spanned);
        TextView textView2 = this.d;
        if ((aqciVar.b & 2) != 0) {
            arag aragVar2 = aqciVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            spanned2 = ajgl.b(aragVar2);
        } else {
            spanned2 = null;
        }
        zag.m(textView2, spanned2);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: mgu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mgv mgvVar = mgv.this;
                aqci aqciVar2 = aqciVar;
                ajrs ajrsVar2 = ajrsVar;
                if ((aqciVar2.b & 4) != 0) {
                    aafo aafoVar = mgvVar.a;
                    apzg apzgVar = aqciVar2.e;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, amup.k("sectionListController", ajrsVar2.c("sectionListController")));
                    ajrsVar2.a.H(3, new acte(aqciVar2.f), null);
                }
            }
        });
        ajrsVar.a.u(new acte(aqciVar.f), null);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
