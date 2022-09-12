package com.google.android.apps.gmm.map.intents;

import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
@ckol(a = "intent", b = ckok.LOW)
/* loaded from: classes.dex */
public class AndroidIntentEvent {
    private final Intent intent;
    @dzsi
    private final Boolean isSynthetic;

    public AndroidIntentEvent(Intent intent) {
        this.intent = intent;
        this.isSynthetic = null;
    }

    public AndroidIntentEvent(@dzsi @ckoo(a = "action") String str, @dzsi @ckoo(a = "uri") String str2, @dzsi @ckoo(a = "synthetic") Boolean bool) {
        Intent intent = new Intent();
        this.intent = intent;
        if (str != null) {
            intent.setAction(str);
        }
        if (str2 != null) {
            intent.setData(Uri.parse(str2));
        } else {
            intent.setData(Uri.EMPTY);
        }
        this.isSynthetic = bool;
    }

    @ckom(a = "action")
    public String getAction() {
        return this.intent.getAction();
    }

    public Intent getIntent() {
        return this.intent;
    }

    @ckom(a = "synthetic")
    public Boolean getSynthetic() {
        return this.isSynthetic;
    }

    @ckom(a = "uri")
    public String getUriString() {
        return this.intent.getDataString();
    }

    @ckon(a = "action")
    public boolean hasAction() {
        return this.intent.getAction() != null;
    }

    @ckon(a = "synthetic")
    public boolean hasSynthetic() {
        return this.isSynthetic != null;
    }

    @ckon(a = "uri")
    public boolean hasUriString() {
        return this.intent.getDataString() != null;
    }

    public String toString() {
        dbsb b = dbsc.b(this);
        b.c();
        b.b("action", getAction());
        b.b("uri", getUriString());
        b.b("synthetic", getSynthetic());
        return b.toString();
    }
}
