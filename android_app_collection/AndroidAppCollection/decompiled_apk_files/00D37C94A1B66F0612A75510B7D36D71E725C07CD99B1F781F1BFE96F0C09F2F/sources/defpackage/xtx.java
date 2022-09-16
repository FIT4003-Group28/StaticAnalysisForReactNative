package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xtx  reason: default package */
/* loaded from: classes4.dex */
final class xtx {
    final View a;
    final View b;
    final YouTubeTextView c;
    final ImageView d;

    public xtx(View view, Context context, boolean z) {
        this.a = view;
        this.b = view.findViewById(R.id.access_restriction_background);
        YouTubeTextView youTubeTextView = (YouTubeTextView) view.findViewById(R.id.access_restriction_text);
        this.c = youTubeTextView;
        this.d = (ImageView) view.findViewById(R.id.access_restriction_image);
        if (z) {
            youTubeTextView.setTextAppearance(context, 2132083726);
            youTubeTextView.setTextColor(zhn.j(context, R.attr.ytTextSecondary).orElse(0));
        }
    }
}
