package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SponsorshipsRenderers;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: yhd  reason: default package */
/* loaded from: classes4.dex */
public final class yhd implements ajru {
    public final ViewGroup a;
    private final Context b;
    private final aafo c;
    private final ajmy d;
    private final YouTubeTextView e;
    private final ViewGroup f;
    private final ArrayList g = new ArrayList();
    private int h = -1;

    public yhd(Context context, aafo aafoVar, ajmy ajmyVar, ViewGroup viewGroup) {
        this.b = context;
        this.c = aafoVar;
        this.d = ajmyVar;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.sponsorships_loyalty_badges_layout, viewGroup, false);
        this.a = viewGroup2;
        this.e = (YouTubeTextView) viewGroup2.findViewById(R.id.description);
        this.f = (ViewGroup) viewGroup2.findViewById(R.id.badges);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    public final void d(boolean z) {
        int i = 0;
        while (i < this.g.size()) {
            yhc yhcVar = (yhc) this.g.get(i);
            int i2 = 4;
            if (z) {
                int i3 = this.h;
                if (i3 != -1) {
                    yhcVar.d(i3 == i ? 1 : 2);
                } else {
                    yhcVar.d(4);
                }
            } else {
                int i4 = this.h;
                if (i4 == -1) {
                    i4 = 0;
                }
                if (i != i4) {
                    i2 = 3;
                }
                yhcVar.d(i2);
            }
            i++;
        }
    }

    public final void e(auym auymVar) {
        arag aragVar;
        YouTubeTextView youTubeTextView = this.e;
        if ((auymVar.b & 1) != 0) {
            aragVar = auymVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(youTubeTextView, aafv.a(aragVar, this.c, false));
        this.h = auymVar.e;
        for (aunb aunbVar : auymVar.d) {
            yhc yhcVar = new yhc(this.b, this.c, this.d, this.f);
            yhcVar.e((auyl) ajjh.l(aunbVar, SponsorshipsRenderers.sponsorshipsLoyaltyBadgeRenderer));
            this.f.addView(yhcVar.a);
            this.g.add(yhcVar);
        }
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        e((auym) obj);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
