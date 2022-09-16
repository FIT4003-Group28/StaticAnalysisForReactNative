package defpackage;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ivs  reason: default package */
/* loaded from: classes3.dex */
public final class ivs extends aizc {
    public final YouTubeTextView a;
    private final alj b;

    public ivs(Context context, int i) {
        super(context);
        YouTubeTextView youTubeTextView = (YouTubeTextView) LayoutInflater.from(context).inflate(R.layout.playing_on_tv_text, (ViewGroup) this, false);
        this.a = youTubeTextView;
        youTubeTextView.setPadding(0, i, 0, 0);
        addView(youTubeTextView);
        setBackgroundColor(ake.d(context, R.color.mdx_background_scrim));
        this.b = alj.a();
    }

    public final String a(int i, String str) {
        return Html.fromHtml(getContext().getString(i, this.b.b(str))).toString();
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public final void d(String str) {
        this.a.setText(a(R.string.mdx_connected_to_screen, str));
    }
}
