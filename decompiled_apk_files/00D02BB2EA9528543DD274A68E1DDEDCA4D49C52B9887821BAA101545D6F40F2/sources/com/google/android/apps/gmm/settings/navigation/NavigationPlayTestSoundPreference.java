package com.google.android.apps.gmm.settings.navigation;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.preference.Preference;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NavigationPlayTestSoundPreference extends Preference {
    public ImageView a;
    public AnimationDrawable b;
    public boolean c;

    public NavigationPlayTestSoundPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.z = R.layout.settings_widget_play_sound;
    }

    @Override // androidx.preference.Preference
    public final void Rk(ave aveVar) {
        super.Rk(aveVar);
        ImageView imageView = (ImageView) aveVar.C(R.id.speaker);
        this.a = imageView;
        this.b = (AnimationDrawable) imageView.getDrawable();
        this.a.addOnAttachStateChangeListener(new btdy(this));
    }

    public final void m() {
        this.a.setVisibility(0);
        this.b.start();
        this.c = true;
    }
}
