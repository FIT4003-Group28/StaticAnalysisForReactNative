package com.google.android.apps.gmm.replay.events;
/* compiled from: PG */
@ckol(a = "tombstone", b = ckok.HIGH)
/* loaded from: classes.dex */
public final class TombstoneEvent {
    private static final int MAX_EXTRA_DATA = 80;
    private final String deletedEvent;
    @dzsi
    private final String extraData;

    public TombstoneEvent(String str) {
        this(str, null);
    }

    public TombstoneEvent(@ckoo(a = "deletedEvent") String str, @dzsi @ckoo(a = "extra") String str2) {
        this.deletedEvent = str;
        if (str2 != null && str2.length() > 80) {
            str2 = String.valueOf(str2.substring(0, 80)).concat("...");
        }
        this.extraData = str2;
    }

    @ckom(a = "deletedEvent")
    public String getDeletedEvent() {
        return this.deletedEvent;
    }

    @ckom(a = "extra")
    @dzsi
    public String getExtraData() {
        return this.extraData;
    }

    @ckon(a = "extra")
    public boolean hasExtraData() {
        return this.extraData != null;
    }

    public String toString() {
        String concat;
        String str = this.deletedEvent;
        if (this.extraData != null) {
            concat = "";
        } else {
            concat = "null".length() != 0 ? " : ".concat("null") : new String(" : ");
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(concat).length());
        sb.append("Tombstone[");
        sb.append(str);
        sb.append(concat);
        sb.append("]");
        return sb.toString();
    }
}
