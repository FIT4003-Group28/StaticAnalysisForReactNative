package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SponsorshipsRenderers;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: yhk  reason: default package */
/* loaded from: classes4.dex */
public final class yhk implements ajru {
    public final LinearLayout a;
    public final ArrayList b = new ArrayList();
    private final yhj c;

    public yhk(Context context, yhj yhjVar, ViewGroup viewGroup) {
        this.c = yhjVar;
        this.a = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.sponsorships_perks_layout, viewGroup, false);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    /* renamed from: d */
    public final void oK(ajrs ajrsVar, auys auysVar) {
        this.a.removeAllViews();
        this.b.clear();
        if (auysVar == null) {
            return;
        }
        if ((auysVar.b & 1) != 0) {
            YouTubeTextView youTubeTextView = new YouTubeTextView(this.a.getContext());
            youTubeTextView.setTextAppearance(this.a.getContext(), 2132083714);
            arag aragVar = auysVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            youTubeTextView.setText(ajgl.b(aragVar));
            this.a.addView(youTubeTextView);
        }
        for (aunb aunbVar : auysVar.d) {
            auyr auyrVar = (auyr) ajjh.l(aunbVar, SponsorshipsRenderers.sponsorshipsPerkRenderer);
            if (auyrVar != null) {
                yhi b = this.c.b(this.a);
                this.b.add(b);
                this.a.addView(b.b);
                b.d(auyrVar);
            }
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
