package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: flg  reason: default package */
/* loaded from: classes3.dex */
public final class flg {
    public final Context a;
    public final aafo b;
    public final YouTubeTextView c;
    public final YouTubeTextView d;

    public flg(Context context, aafo aafoVar, ViewGroup viewGroup) {
        this.a = context;
        this.b = aafoVar;
        this.c = (YouTubeTextView) viewGroup.findViewById(R.id.nonprofit_title_view);
        this.d = (YouTubeTextView) viewGroup.findViewById(R.id.nonprofit_subtitle_view);
    }
}
