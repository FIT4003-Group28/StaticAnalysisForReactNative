package com.google.android.apps.youtube.embeddedplayer.service.model;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class n {
    public CharSequence a;
    public CharSequence b;
    private aoob c;

    public final void b(aoob aoobVar) {
        if (aoobVar != null) {
            this.c = aoobVar;
            return;
        }
        throw new NullPointerException("Null trackingParams");
    }

    public final VideoDetailsCollapsed a() {
        aoob aoobVar = this.c;
        if (aoobVar == null) {
            throw new IllegalStateException("Missing required properties: trackingParams");
        }
        return new AutoValue_VideoDetailsCollapsed(this.a, this.b, aoobVar);
    }
}
