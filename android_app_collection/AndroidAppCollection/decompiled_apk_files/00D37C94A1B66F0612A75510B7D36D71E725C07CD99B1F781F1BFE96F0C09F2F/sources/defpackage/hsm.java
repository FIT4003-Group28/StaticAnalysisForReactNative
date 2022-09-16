package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hsm  reason: default package */
/* loaded from: classes3.dex */
public final class hsm extends zxr {
    private final dt a;
    private final ajmy b;
    private final htq c;

    public hsm(dt dtVar, ajmy ajmyVar, htq htqVar) {
        super(dtVar, dtVar.getSupportFragmentManager(), null, true, false);
        this.a = dtVar;
        this.b = ajmyVar;
        this.c = htqVar;
    }

    @Override // defpackage.zxr
    protected final View a() {
        View inflate = LayoutInflater.from(new ContextThemeWrapper(this.a, (int) R.style.ReelsBottomSheetDialog)).inflate(R.layout.link_sticker_usage_exceeded, (ViewGroup) null);
        YouTubeTextView youTubeTextView = (YouTubeTextView) inflate.findViewById(R.id.sticker_usage_exceeded_title);
        htq htqVar = this.c;
        Context applicationContext = this.a.getApplicationContext();
        int b = htqVar.b(2);
        if (b == 0) {
            b = 1;
        }
        youTubeTextView.setText(applicationContext.getResources().getQuantityString(R.plurals.sticker_dialog_title, b, Integer.valueOf(b)));
        this.b.g((ImageView) inflate.findViewById(R.id.artwork), Uri.parse("https://www.gstatic.com/youtube/img/stories/sticker_usage_exceeded_artwork.png"));
        return inflate;
    }

    @Override // defpackage.zxr
    protected final CharSequence b() {
        return this.a.getResources().getString(R.string.stories_add_link_header);
    }
}
