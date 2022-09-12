package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: batf  reason: default package */
/* loaded from: classes3.dex */
public enum batf {
    DROPPED_PIN_CALLOUT(R.string.DRAG_MAP_TO_ADJUST_HOME_LOCATION_CALLOUT_TEXT, R.string.DRAG_MAP_TO_ADJUST_WORK_LOCATION_CALLOUT_TEXT, R.string.DRAG_MAP_TO_ADJUST_LOCATION_CALLOUT_TEXT),
    POINT_PICKER_TITLE(R.string.SET_HOME_TITLE, R.string.SET_WORK_TITLE, R.string.CHOOSE_ON_MAP_HOME_WORK_TITLE),
    NO_MOVE_SAVE_WARNING(R.string.MOVE_MAP_TO_HOME_LOCATION_TOAST_TEXT, R.string.MOVE_MAP_TO_WORK_LOCATION_TOAST_TEXT, R.string.MOVE_MAP_TO_LOCATION_TOAST_TEXT);
    
    public final int d;
    public final int e;
    public final int f;

    batf(int i, int i2, int i3) {
        this.d = i;
        this.e = i2;
        this.f = i3;
    }
}
