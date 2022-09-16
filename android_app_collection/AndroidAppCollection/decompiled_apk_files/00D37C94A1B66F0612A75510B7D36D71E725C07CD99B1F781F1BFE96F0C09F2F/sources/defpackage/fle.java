package defpackage;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fle  reason: default package */
/* loaded from: classes3.dex */
public final class fle {
    public final ajmy a;
    public final ImageView b;
    public final YouTubeTextView c;
    public final YouTubeTextView d;

    public fle(ViewGroup viewGroup, boolean z, ajmy ajmyVar) {
        this.b = (ImageView) viewGroup.findViewById(R.id.campaign_image);
        YouTubeTextView youTubeTextView = (YouTubeTextView) viewGroup.findViewById(R.id.campaign_title_view);
        this.c = youTubeTextView;
        YouTubeTextView youTubeTextView2 = (YouTubeTextView) viewGroup.findViewById(R.id.campaign_subtitle_view);
        this.d = youTubeTextView2;
        if (z) {
            youTubeTextView.setMaxLines(1);
            youTubeTextView.setEllipsize(TextUtils.TruncateAt.END);
            youTubeTextView2.setMaxLines(1);
            youTubeTextView2.setEllipsize(TextUtils.TruncateAt.END);
        }
        this.a = ajmyVar;
    }

    public final void a(aqnb aqnbVar) {
        ajmy ajmyVar = this.a;
        ImageView imageView = this.b;
        avhn avhnVar = aqnbVar.e;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        YouTubeTextView youTubeTextView = this.c;
        arag aragVar = aqnbVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(youTubeTextView, ajgl.b(aragVar));
        YouTubeTextView youTubeTextView2 = this.d;
        arag aragVar2 = aqnbVar.d;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(youTubeTextView2, ajgl.b(aragVar2));
    }

    public fle(ajmy ajmyVar, ViewGroup viewGroup) {
        this.a = ajmyVar;
        this.b = (ImageView) viewGroup.findViewById(R.id.creator_message_thumbnail);
        this.c = (YouTubeTextView) viewGroup.findViewById(R.id.creator_message_title);
        this.d = (YouTubeTextView) viewGroup.findViewById(R.id.creator_message_description);
    }
}
