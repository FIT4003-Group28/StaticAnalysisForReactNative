package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: flh  reason: default package */
/* loaded from: classes3.dex */
public final class flh {
    private final Context a;
    private final ProgressBar b;
    private final YouTubeTextView c;
    private final YouTubeTextView d;
    private final YouTubeTextView e;
    private final YouTubeTextView f;
    private final aafo g;

    public flh(Context context, ViewGroup viewGroup, aafo aafoVar) {
        this.a = context;
        this.g = aafoVar;
        this.b = (ProgressBar) viewGroup.findViewById(R.id.progress_bar);
        this.c = (YouTubeTextView) viewGroup.findViewById(R.id.start_label);
        this.d = (YouTubeTextView) viewGroup.findViewById(R.id.end_label);
        this.e = (YouTubeTextView) viewGroup.findViewById(R.id.amount_raised_label);
        this.f = (YouTubeTextView) viewGroup.findViewById(R.id.match_label);
    }

    public final void a(aqnb aqnbVar) {
        if ((aqnbVar.b & 8192) == 0) {
            this.b.setVisibility(0);
            this.b.setProgress((int) (aqnbVar.g * 100.0f));
            this.b.setProgressTintList(ColorStateList.valueOf(zhn.j(this.a, R.attr.ytCallToAction).orElse(0)));
        } else {
            this.b.setVisibility(8);
        }
        YouTubeTextView youTubeTextView = this.c;
        arag aragVar = aqnbVar.h;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(youTubeTextView, ajgl.b(aragVar));
        YouTubeTextView youTubeTextView2 = this.d;
        arag aragVar2 = aqnbVar.i;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(youTubeTextView2, ajgl.b(aragVar2));
        YouTubeTextView youTubeTextView3 = this.e;
        arag aragVar3 = aqnbVar.k;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        zag.m(youTubeTextView3, ajgl.b(aragVar3));
        YouTubeTextView youTubeTextView4 = this.f;
        arag aragVar4 = aqnbVar.j;
        if (aragVar4 == null) {
            aragVar4 = arag.a;
        }
        zag.m(youTubeTextView4, ajgl.c(aragVar4, new ajve(this.g)));
        this.f.c();
    }
}
