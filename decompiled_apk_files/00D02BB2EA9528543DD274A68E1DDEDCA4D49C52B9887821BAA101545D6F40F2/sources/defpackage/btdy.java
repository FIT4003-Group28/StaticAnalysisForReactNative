package defpackage;

import android.view.View;
import com.google.android.apps.gmm.settings.navigation.NavigationPlayTestSoundPreference;
/* compiled from: PG */
/* renamed from: btdy  reason: default package */
/* loaded from: classes4.dex */
public final class btdy implements View.OnAttachStateChangeListener {
    final /* synthetic */ NavigationPlayTestSoundPreference a;

    public btdy(NavigationPlayTestSoundPreference navigationPlayTestSoundPreference) {
        this.a = navigationPlayTestSoundPreference;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        NavigationPlayTestSoundPreference navigationPlayTestSoundPreference = this.a;
        if (navigationPlayTestSoundPreference.c) {
            navigationPlayTestSoundPreference.m();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
