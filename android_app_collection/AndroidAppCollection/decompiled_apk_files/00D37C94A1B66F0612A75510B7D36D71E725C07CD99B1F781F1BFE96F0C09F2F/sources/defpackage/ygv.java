package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SponsorshipsRenderers;
/* compiled from: PG */
/* renamed from: ygv  reason: default package */
/* loaded from: classes4.dex */
public final class ygv implements ajru {
    public final View a;
    public final ViewGroup b;
    private final aafo c;
    private final YouTubeTextView d;
    private final ImageView e;
    private final ImageView f;
    private final ViewGroup g;
    private final View h;
    private final View i;
    private final View j;
    private final yhl k;
    private final yho l;

    public ygv(Context context, aafo aafoVar, yhl yhlVar, yho yhoVar, ViewGroup viewGroup) {
        this.c = aafoVar;
        this.k = yhlVar;
        this.l = yhoVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sponsorships_expandable_message_layout, viewGroup, false);
        this.a = inflate;
        this.d = (YouTubeTextView) inflate.findViewById(R.id.message);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.expand_icon);
        this.e = imageView;
        this.f = (ImageView) inflate.findViewById(R.id.check_icon);
        imageView.setColorFilter(zhn.d(context, R.attr.ytTextSecondary));
        this.b = (ViewGroup) inflate.findViewById(R.id.expanded_content);
        this.g = (ViewGroup) inflate.findViewById(R.id.message_container);
        this.h = inflate.findViewById(R.id.border_top);
        this.i = inflate.findViewById(R.id.border_bottom);
        this.j = inflate.findViewById(R.id.margin_bottom);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    /* renamed from: d */
    public final void oK(ajrs ajrsVar, auyf auyfVar) {
        arag aragVar;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        YouTubeTextView youTubeTextView = this.d;
        boolean z4 = true;
        View.OnClickListener onClickListener = null;
        if ((auyfVar.b & 1) != 0) {
            aragVar = auyfVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        boolean z5 = false;
        zag.m(youTubeTextView, aafv.a(aragVar, this.c, false));
        boolean z6 = !auyfVar.d.isEmpty();
        zag.o(this.e, z6);
        View view = this.a;
        if (z6) {
            onClickListener = new View.OnClickListener() { // from class: ygu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ygv ygvVar = ygv.this;
                    ygvVar.e(ygvVar.b.getVisibility() != 0);
                }
            };
        }
        view.setOnClickListener(onClickListener);
        this.b.removeAllViews();
        for (aunb aunbVar : auyfVar.d) {
            if (aunbVar.qn(SponsorshipsRenderers.sponsorshipsPerksRenderer)) {
                yhk b = this.k.b(this.b);
                b.oK(ajrsVar, (auys) aunbVar.qm(SponsorshipsRenderers.sponsorshipsPerksRenderer));
                this.b.addView(b.a);
            } else if (aunbVar.qn(SponsorshipsRenderers.sponsorshipsTierRenderer)) {
                yhn b2 = this.l.b(this.b);
                b2.oK(ajrsVar, (auyv) aunbVar.qm(SponsorshipsRenderers.sponsorshipsTierRenderer));
                this.b.addView(b2.a);
            }
        }
        e(auyfVar.f);
        int aR = awwc.aR(auyfVar.e);
        if (aR == 0) {
            aR = 1;
        }
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        int orElse = zhn.j(this.a.getContext(), R.attr.ytGeneralBackgroundB).orElse(0);
        int orElse2 = zhn.j(this.a.getContext(), R.attr.ytGeneralBackgroundB).orElse(0);
        int orElse3 = zhn.j(this.a.getContext(), R.attr.ytTextSecondary).orElse(0);
        int i6 = zew.i(displayMetrics, 8);
        int i7 = zew.i(displayMetrics, 16);
        int i8 = zew.i(displayMetrics, 16);
        int i9 = zew.i(displayMetrics, 16);
        int i10 = aR - 1;
        if (i10 != 2) {
            if (i10 == 3) {
                z3 = false;
            } else if (i10 != 4) {
                i = i9;
                i2 = i8;
                z = false;
                i3 = 0;
                z4 = false;
                i4 = 0;
                z2 = false;
                i5 = 2132083726;
            } else {
                z3 = true;
            }
            i6 = zew.i(displayMetrics, 20);
            int i11 = zew.i(displayMetrics, 42);
            int i12 = zew.i(displayMetrics, 0);
            int i13 = zew.i(displayMetrics, 24);
            orElse3 = zhn.j(this.a.getContext(), R.attr.ytTextPrimary).orElse(0);
            i = i9;
            i2 = i12;
            orElse2 = 0;
            z5 = true;
            i5 = 2132083726;
            z2 = z3;
            i4 = i13;
            i3 = i11;
            z = false;
            orElse = 0;
        } else {
            i6 = zew.i(displayMetrics, 24);
            orElse3 = zhn.j(this.a.getContext(), R.attr.ytTextPrimary).orElse(0);
            orElse2 = zhn.j(this.a.getContext(), R.attr.ytGeneralBackgroundA).orElse(0);
            i = zew.i(displayMetrics, 0);
            i2 = zew.i(displayMetrics, 12);
            z = true;
            i3 = 0;
            z4 = false;
            i4 = 0;
            z2 = false;
            i5 = 2132083734;
        }
        this.g.setBackgroundColor(orElse);
        this.g.setPadding(i7, i6, i7, i6);
        this.d.setTextAppearance(this.a.getContext(), i5);
        this.d.setTextColor(orElse3);
        this.b.setBackgroundColor(orElse2);
        this.b.setPadding(i3 + i, i2, i, i4 + i2);
        zag.o(this.f, z4);
        zag.o(this.h, z2);
        zag.o(this.i, z5);
        zag.o(this.j, z);
    }

    public final void e(boolean z) {
        zag.o(this.b, z);
        this.e.setImageResource(true != z ? 2131232372 : 2131232375);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
