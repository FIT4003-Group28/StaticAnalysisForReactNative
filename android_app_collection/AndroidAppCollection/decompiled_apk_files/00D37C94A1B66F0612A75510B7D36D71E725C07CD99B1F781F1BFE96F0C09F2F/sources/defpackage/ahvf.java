package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahvf  reason: default package */
/* loaded from: classes.dex */
public final class ahvf extends ahuz {
    public ahvf(Context context, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, aqvc aqvcVar) {
        super(context, creatorEndscreenOverlayPresenter, aqvcVar);
    }

    @Override // defpackage.ahuz
    public final void f(View view) {
        arag aragVar;
        super.f(view);
        TextView textView = (TextView) view.findViewById(R.id.endscreen_element_duration);
        aqvc aqvcVar = this.b;
        if ((aqvcVar.b & 16) != 0) {
            aragVar = aqvcVar.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
    }
}
