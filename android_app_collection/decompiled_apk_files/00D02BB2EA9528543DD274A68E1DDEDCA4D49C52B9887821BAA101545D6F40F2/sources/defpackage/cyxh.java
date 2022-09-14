package defpackage;
/* compiled from: PG */
/* renamed from: cyxh  reason: default package */
/* loaded from: classes5.dex */
public enum cyxh {
    UNKNOWN(false),
    TIMES_CONTACTED(true),
    SECONDS_SINCE_LAST_TIME_CONTACTED(true),
    IS_SECONDARY_GOOGLE_ACCOUNT(true),
    FIELD_TIMES_USED(false),
    FIELD_SECONDS_SINCE_LAST_TIME_USED(false),
    IS_CONTACT_STARRED(true),
    HAS_POSTAL_ADDRESS(true),
    HAS_NICKNAME(true),
    HAS_BIRTHDAY(true),
    HAS_CUSTOM_RINGTONE(true),
    HAS_AVATAR(true),
    IS_SENT_TO_VOICEMAIL(true),
    IS_PINNED(true),
    PINNED_POSITION(true),
    NUM_COMMUNICATION_CHANNELS(true),
    NUM_RAW_CONTACTS(true),
    FIELD_IS_PRIMARY(false),
    FIELD_IS_SUPER_PRIMARY(false);
    
    public final boolean t;

    cyxh(boolean z) {
        this.t = z;
    }
}
