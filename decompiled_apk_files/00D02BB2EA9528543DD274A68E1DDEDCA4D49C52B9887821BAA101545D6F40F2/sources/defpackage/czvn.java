package defpackage;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.android.gms.location.FusedLocationProviderApi;
/* compiled from: PG */
/* renamed from: czvn  reason: default package */
/* loaded from: classes5.dex */
public final class czvn {
    public static final int[] a = {16843848};

    public static void a(View view, float f) {
        int integer = view.getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{16842766, R.attr.state_liftable, -2130969773}, ObjectAnimator.ofFloat(view, FusedLocationProviderApi.EXTRA_KEY_ELEVATION_WGS84_M, 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, FusedLocationProviderApi.EXTRA_KEY_ELEVATION_WGS84_M, f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, FusedLocationProviderApi.EXTRA_KEY_ELEVATION_WGS84_M, 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
