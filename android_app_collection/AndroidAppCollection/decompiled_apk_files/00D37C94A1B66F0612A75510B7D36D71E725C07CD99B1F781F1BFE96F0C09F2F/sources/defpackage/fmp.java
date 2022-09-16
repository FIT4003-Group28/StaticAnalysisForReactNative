package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.Map;
/* compiled from: PG */
/* renamed from: fmp  reason: default package */
/* loaded from: classes3.dex */
public final class fmp implements ajru {
    public final aafo a;
    private final View b;
    private final View c;
    private final YouTubeTextView d;
    private final YouTubeTextView e;
    private final YouTubeTextView f;
    private final Button g;
    private final YouTubeTextView h;
    private final ImageView i;
    private final View j;
    private final YouTubeTextView k;
    private final YouTubeTextView l;
    private final View m;

    public fmp(Context context, aafo aafoVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.ticket_companion, (ViewGroup) null, false);
        this.b = inflate;
        this.c = inflate.findViewById(R.id.info_layout);
        this.g = (Button) inflate.findViewById(R.id.ticket_button);
        this.d = (YouTubeTextView) inflate.findViewById(R.id.title_view);
        this.e = (YouTubeTextView) inflate.findViewById(R.id.subtitle_view);
        this.f = (YouTubeTextView) inflate.findViewById(R.id.subtitle_view2);
        this.k = (YouTubeTextView) inflate.findViewById(R.id.calendar_month);
        this.l = (YouTubeTextView) inflate.findViewById(R.id.calendar_day);
        this.j = inflate.findViewById(R.id.calendar_view);
        this.h = (YouTubeTextView) inflate.findViewById(R.id.more_tickets_text);
        this.i = (ImageView) inflate.findViewById(R.id.sponsored_icon);
        this.m = inflate.findViewById(R.id.divider);
        this.a = aafoVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(final ajrs ajrsVar, Object obj) {
        final avhv avhvVar;
        final fmo fmoVar = (fmo) obj;
        acti actiVar = ajrsVar.a;
        avhw avhwVar = (avhw) fmoVar.a.c.get(0);
        if (avhwVar.b == 136346452) {
            avhvVar = (avhv) avhwVar.c;
        } else {
            avhvVar = avhv.a;
        }
        zag.m(this.d, avhvVar.c);
        zag.m(this.e, avhvVar.e);
        this.c.setContentDescription(avhvVar.d);
        if (ajrsVar.j("always_display_as_grid", false)) {
            this.j.setVisibility(8);
            this.f.setVisibility(0);
            this.f.setText(avhvVar.f);
        } else {
            this.j.setVisibility(0);
            this.f.setVisibility(8);
        }
        this.k.setText(avhvVar.j);
        this.l.setText(avhvVar.k);
        if (!avhvVar.g.isEmpty()) {
            this.g.setVisibility(0);
            this.g.setText(avhvVar.g);
            this.g.setContentDescription(avhvVar.h);
            this.g.setOnClickListener(new View.OnClickListener() { // from class: fmn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fmp fmpVar = fmp.this;
                    avhv avhvVar2 = avhvVar;
                    aafo aafoVar = fmpVar.a;
                    apzg apzgVar = avhvVar2.i;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, actk.f(avhvVar2));
                }
            });
        } else {
            this.g.setVisibility(8);
        }
        if ((fmoVar.a.b & 1024) == 0) {
            this.h.setClickable(false);
        } else {
            this.h.setOnClickListener(new View.OnClickListener() { // from class: fmm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fmp fmpVar = fmp.this;
                    fmo fmoVar2 = fmoVar;
                    ajrs ajrsVar2 = ajrsVar;
                    Map h = actk.h(fmoVar2.a, false);
                    h.putAll(ajrsVar2.e());
                    aafo aafoVar = fmpVar.a;
                    apzg apzgVar = fmoVar2.a.g;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, h);
                }
            });
            this.h.setClickable(true);
        }
        avhx avhxVar = fmoVar.a;
        String str = (avhxVar.b & 4) != 0 ? avhxVar.d : null;
        this.h.setText(str);
        if (str == null || str.length() <= 0) {
            this.h.setVisibility(8);
            this.m.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            this.m.setVisibility(0);
        }
        if ((fmoVar.a.b & 512) == 0) {
            zag.o(this.i, false);
        } else {
            zag.o(this.i, true);
            this.i.setContentDescription(fmoVar.a.e);
            this.i.setOnClickListener(new View.OnClickListener() { // from class: fml
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fmp fmpVar = fmp.this;
                    fmo fmoVar2 = fmoVar;
                    aafo aafoVar = fmpVar.a;
                    apzg apzgVar = fmoVar2.a.f;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, null);
                }
            });
        }
        actiVar.u(new acte(avhvVar.m), null);
        actiVar.u(new acte(fmoVar.a.h), null);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
