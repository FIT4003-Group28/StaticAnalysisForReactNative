package com.google.android.apps.gmm.transit.go.events;

import java.util.Arrays;
/* compiled from: PG */
@ckor
@ckol(a = "transit-guidance-type", b = ckok.MEDIUM)
/* loaded from: classes.dex */
public final class TransitGuidanceTypeEvent {
    @dzsi
    private final Boolean active;
    @dzsi
    private final String description;
    @dzsi
    private final String header;
    @dzsi
    private final String title;
    private final String type;

    public TransitGuidanceTypeEvent(String str) {
        this(str, null, null, null, null);
    }

    public TransitGuidanceTypeEvent(@ckoo(a = "type") String str, @dzsi @ckoo(a = "active") Boolean bool, @dzsi @ckoo(a = "header") String str2, @dzsi @ckoo(a = "title") String str3, @dzsi @ckoo(a = "description") String str4) {
        this.type = str;
        this.active = bool;
        this.header = str2;
        this.title = str3;
        this.description = str4;
    }

    public boolean equals(@dzsi Object obj) {
        if (obj instanceof TransitGuidanceTypeEvent) {
            TransitGuidanceTypeEvent transitGuidanceTypeEvent = (TransitGuidanceTypeEvent) obj;
            if (dbsd.a(this.type, transitGuidanceTypeEvent.type) && dbsd.a(this.active, transitGuidanceTypeEvent.active) && dbsd.a(this.header, transitGuidanceTypeEvent.header) && dbsd.a(this.title, transitGuidanceTypeEvent.title) && dbsd.a(this.description, transitGuidanceTypeEvent.description)) {
                return true;
            }
        }
        return false;
    }

    @ckom(a = "description")
    @dzsi
    public String getDescription() {
        return this.description;
    }

    @ckom(a = "header")
    @dzsi
    public String getHeader() {
        return this.header;
    }

    @ckom(a = "title")
    @dzsi
    public String getTitle() {
        return this.title;
    }

    @ckom(a = "type")
    public String getType() {
        return this.type;
    }

    @ckon(a = "active")
    public boolean hasActive() {
        return this.active != null;
    }

    @ckon(a = "description")
    public boolean hasDescription() {
        return this.description != null;
    }

    @ckon(a = "header")
    public boolean hasHeader() {
        return this.header != null;
    }

    @ckon(a = "title")
    public boolean hasTitle() {
        return this.title != null;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.type, this.active, this.title, this.description});
    }

    @ckom(a = "active")
    @dzsi
    public Boolean isActive() {
        return this.active;
    }

    public String toString() {
        dbsb b = dbsc.b(this);
        b.b("type", this.type);
        b.b("active", this.active);
        b.b("header", this.header);
        b.b("title", this.title);
        b.b("description", this.description);
        return b.toString();
    }
}
