package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ygz  reason: default package */
/* loaded from: classes4.dex */
public final class ygz implements ajru {
    private final aafo a;
    private final ViewGroup b;

    public ygz(Context context, aafo aafoVar, ViewGroup viewGroup) {
        this.a = aafoVar;
        this.b = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.sponsorships_links_layout, viewGroup, false);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.links_in_between_padding);
        for (arag aragVar : ((auyj) obj).b) {
            YouTubeTextView youTubeTextView = new YouTubeTextView(this.b.getContext());
            youTubeTextView.setText(aafv.a(aragVar, this.a, false));
            youTubeTextView.c();
            youTubeTextView.d(true);
            youTubeTextView.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
            this.b.addView(youTubeTextView);
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.b.removeAllViews();
    }
}
