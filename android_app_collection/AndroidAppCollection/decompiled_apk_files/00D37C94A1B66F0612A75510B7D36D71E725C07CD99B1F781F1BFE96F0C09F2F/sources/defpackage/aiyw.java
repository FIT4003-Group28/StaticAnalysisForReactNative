package defpackage;

import android.view.accessibility.CaptioningManager;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
/* compiled from: PG */
/* renamed from: aiyw  reason: default package */
/* loaded from: classes.dex */
final class aiyw extends CaptioningManager.CaptioningChangeListener {
    final /* synthetic */ aiyx a;

    public aiyw(aiyx aiyxVar) {
        this.a = aiyxVar;
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onFontScaleChanged(float f) {
        super.onFontScaleChanged(f);
        this.a.c(f);
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onUserStyleChanged(CaptioningManager.CaptionStyle captionStyle) {
        super.onUserStyleChanged(captionStyle);
        aiyx aiyxVar = this.a;
        aiyxVar.d(new SubtitlesStyle(captionStyle, aiyxVar.b));
    }
}
