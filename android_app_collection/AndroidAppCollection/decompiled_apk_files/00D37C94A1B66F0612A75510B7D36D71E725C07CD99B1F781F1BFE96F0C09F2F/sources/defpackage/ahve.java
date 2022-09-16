package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahve  reason: default package */
/* loaded from: classes.dex */
public final class ahve extends ahuz {
    public ahve(Context context, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, aqvc aqvcVar) {
        super(context, creatorEndscreenOverlayPresenter, aqvcVar);
    }

    @Override // defpackage.ahuz
    public final void f(View view) {
        arag aragVar;
        super.f(view);
        view.findViewById(R.id.endscreen_element_duration).setVisibility(8);
        view.findViewById(R.id.endscreen_playlist_bar).setVisibility(0);
        Context context = this.a;
        Object[] objArr = new Object[1];
        aqvc aqvcVar = this.b;
        if ((aqvcVar.b & 32) != 0) {
            aragVar = aqvcVar.g;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        objArr[0] = ajgl.b(aragVar);
        ((TextView) view.findViewById(R.id.playlist_text)).setText(context.getString(R.string.endscreen_element_playlist_count, objArr));
    }
}
