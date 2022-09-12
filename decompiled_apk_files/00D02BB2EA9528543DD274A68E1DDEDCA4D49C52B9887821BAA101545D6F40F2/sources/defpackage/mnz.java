package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: mnz  reason: default package */
/* loaded from: classes7.dex */
public enum mnz {
    SHORTCUT_RECENT_PLACES(0),
    SHORTCUT_PERSONAL_PLACES(1),
    SHORTCUT_SUGGESTED_DESTINATIONS_AA(2),
    SHORTCUT_SUGGESTED_DESTINATIONS(3),
    MAP_INTERACTION_POI(R.styleable.AppCompatTheme_switchStyle),
    MAP_INTERACTION_DROPPED_PIN(102),
    INTENT_NAVIGATE_VOICE(200),
    INTENT_NAVIGATE_NON_VOICE(201),
    INTENT_DIRECTIONS_VOICE(202),
    INTENT_DIRECTIONS_NON_VOICE(203),
    INTENT_SEARCH_VOICE(204),
    INTENT_SEARCH_NON_VOICE(205),
    INTENT_PLACE_VOICE(206),
    INTENT_PLACE_NON_VOICE(207),
    KEYBOARD_PLACE(cpnx.a),
    SEARCH_KEYBOARD_QUERY(400),
    SEARCH_CATEGORICAL_FREENAV(401),
    ADD_STOP_CATEGORICAL(500),
    ADD_STOP_RECENT_PLACES(501),
    PLACE_CARD_HOST_EV_STATION(600),
    PLACE_CARD_CHILD_ENTITY(601),
    PLACE_CARD_WAYPOINT_REFINEMENT(602),
    ARRIVAL_CARD(700);
    
    public final int x;

    mnz(int i) {
        this.x = i;
    }

    public final boolean a() {
        return this == INTENT_DIRECTIONS_VOICE || this == INTENT_NAVIGATE_VOICE || this == INTENT_PLACE_VOICE || this == INTENT_SEARCH_VOICE;
    }
}
