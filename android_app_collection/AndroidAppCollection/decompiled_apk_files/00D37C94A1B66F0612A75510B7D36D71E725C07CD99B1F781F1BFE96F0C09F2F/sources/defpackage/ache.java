package defpackage;

import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: ache  reason: default package */
/* loaded from: classes.dex */
public final class ache implements ajxz {
    private volatile EnumMap a = new EnumMap(arhr.class);

    public ache() {
        this.a.put((EnumMap) arhr.LINK, (arhr) 2131232577);
        this.a.put((EnumMap) arhr.PUBLIC, (arhr) 2131232685);
        this.a.put((EnumMap) arhr.PHOTO_CAMERA_LIGHT, (arhr) 2131232658);
        this.a.put((EnumMap) arhr.PHOTO_CAMERA, (arhr) 2131232658);
        this.a.put((EnumMap) arhr.CHAT_BUBBLE, (arhr) 2131231372);
        this.a.put((EnumMap) arhr.CHAT_BUBBLE_OFF, (arhr) 2131231371);
        this.a.put((EnumMap) arhr.VOICE_CHAT, (arhr) 2131232815);
        this.a.put((EnumMap) arhr.SETTINGS_LIGHT, (arhr) 2131232728);
        this.a.put((EnumMap) arhr.SETTINGS, (arhr) 2131232728);
        this.a.put((EnumMap) arhr.KIDS_BLOCK_LIGHT, (arhr) 2131232394);
        this.a.put((EnumMap) arhr.CREATOR_METADATA_MONETIZATION, (arhr) 2131232385);
        this.a.put((EnumMap) arhr.CREATOR_METADATA_MONETIZATION_OFF, (arhr) 2131232594);
        this.a.put((EnumMap) arhr.VIDEO_CAMERA_SWITCH_LIGHT, (arhr) 2131231857);
        this.a.put((EnumMap) arhr.FILTER_EFFECT_LIGHT, (arhr) 2131231452);
        this.a.put((EnumMap) arhr.FLASH_ON, (arhr) 2131232511);
        this.a.put((EnumMap) arhr.FLASH_OFF, (arhr) 2131232510);
        this.a.put((EnumMap) arhr.MICROPHONE_ON, (arhr) 2131232590);
        this.a.put((EnumMap) arhr.MICROPHONE_OFF, (arhr) 2131232588);
        this.a.put((EnumMap) arhr.MORE_HORIZ_LIGHT, (arhr) 2131232605);
        this.a.put((EnumMap) arhr.CHAT_BUBBLE_LIGHT, (arhr) 2131231372);
        this.a.put((EnumMap) arhr.SHARE_ARROW, (arhr) 2131232535);
        this.a.put((EnumMap) arhr.SHARE_ARROW_LIGHT, (arhr) 2131232535);
        this.a.put((EnumMap) arhr.SPONSORS_ONLY_LIVE_CHAT_MODE_ON, (arhr) 2131231544);
        this.a.put((EnumMap) arhr.SPONSORS_ONLY_LIVE_CHAT_MODE_OFF, (arhr) 2131231544);
        this.a.put((EnumMap) arhr.CHAT_OFF, (arhr) 2131231371);
        this.a.put((EnumMap) arhr.CHAT, (arhr) 2131232408);
        this.a.put((EnumMap) arhr.CHAT_SPONSORED, (arhr) 2131231842);
        this.a.put((EnumMap) arhr.CLOSE_LIGHT, (arhr) 2131232439);
        this.a.put((EnumMap) arhr.CLOSE, (arhr) 2131232435);
        this.a.put((EnumMap) arhr.ADD, (arhr) 2131232366);
        this.a.put((EnumMap) arhr.PLACE, (arhr) 2131232663);
        this.a.put((EnumMap) arhr.EVENT_LIGHT, (arhr) 2131232482);
        this.a.put((EnumMap) arhr.CREATOR_METADATA_BASIC, (arhr) 2131232459);
        this.a.put((EnumMap) arhr.UPLOAD, (arhr) 2131232504);
        this.a.put((EnumMap) arhr.BACK, (arhr) 2131232367);
        this.a.put((EnumMap) arhr.BACK_LIGHT, (arhr) 2131232369);
        this.a.put((EnumMap) arhr.DELETE_LIGHT, (arhr) 2131232461);
        this.a.put((EnumMap) arhr.VOLUME_UP, (arhr) 2131232820);
        this.a.put((EnumMap) arhr.SPEAKER_NOTES, (arhr) 2131232752);
        this.a.put((EnumMap) arhr.MOBILE_SCREEN_SHARE, (arhr) 2131232592);
        this.a.put((EnumMap) arhr.TRAILER, (arhr) 2131232608);
        this.a.put((EnumMap) arhr.HELP_OUTLINE, (arhr) 2131232537);
    }

    @Override // defpackage.ajxz
    public final int a(arhr arhrVar) {
        if (this.a.containsKey(arhrVar)) {
            return ((Integer) this.a.get(arhrVar)).intValue();
        }
        return 0;
    }
}
