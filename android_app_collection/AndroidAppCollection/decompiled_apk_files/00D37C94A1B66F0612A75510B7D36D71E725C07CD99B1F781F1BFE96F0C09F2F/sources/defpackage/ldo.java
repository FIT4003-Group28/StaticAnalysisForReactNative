package defpackage;

import android.view.View;
import android.view.WindowInsets;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
/* compiled from: PG */
/* renamed from: ldo  reason: default package */
/* loaded from: classes3.dex */
public final class ldo implements View.OnApplyWindowInsetsListener {
    final /* synthetic */ VoiceSearchActivity a;

    public ldo(VoiceSearchActivity voiceSearchActivity) {
        this.a = voiceSearchActivity;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        this.a.m = windowInsets.getSystemWindowInsetTop();
        return windowInsets;
    }
}
