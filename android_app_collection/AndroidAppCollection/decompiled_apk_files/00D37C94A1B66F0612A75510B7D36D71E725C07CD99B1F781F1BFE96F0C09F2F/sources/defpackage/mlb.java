package defpackage;

import android.app.Activity;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mlb  reason: default package */
/* loaded from: classes3.dex */
public final class mlb implements ajru {
    private final fly a;
    private final ajrx b;
    private final ViewGroup c;
    private final TextView d;
    private final Space e;
    private final ViewGroup f;
    private flx g;

    public mlb(Activity activity, fly flyVar, gem gemVar) {
        this.a = flyVar;
        this.b = gemVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(activity).inflate(R.layout.item_section_title_menu_header, (ViewGroup) null);
        this.c = viewGroup;
        this.d = (TextView) viewGroup.findViewById(R.id.title);
        this.e = (Space) viewGroup.findViewById(R.id.spacing);
        this.f = (ViewGroup) viewGroup.findViewById(R.id.sub_menu_container);
        gemVar.c(viewGroup);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        Spanned b;
        aslu asluVar = (aslu) obj;
        auxr auxrVar = null;
        if ((asluVar.b & 1) != 0) {
            aragVar = asluVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(this.d, ajgl.b(aragVar));
        kz.s(this.d, 2132083734);
        zag.o(this.e, !TextUtils.isEmpty(b));
        this.f.removeAllViews();
        if ((asluVar.b & 2) != 0) {
            aslr aslrVar = asluVar.d;
            if (aslrVar == null) {
                aslrVar = aslr.a;
            }
            auxrVar = aslrVar.c;
            if (auxrVar == null) {
                auxrVar = auxr.a;
            }
        }
        if (auxrVar != null) {
            if (this.g == null) {
                this.g = this.a.c(this.c);
            }
            this.g.oK(ajrsVar, auxrVar);
            this.f.addView(this.g.c);
        }
        this.b.e(ajrsVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        zag.o(this.e, false);
    }
}
