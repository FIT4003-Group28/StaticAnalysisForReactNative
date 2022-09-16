package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.view.View;
import j$.util.function.Consumer;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class w implements Consumer {
    public final /* synthetic */ al a;
    private final /* synthetic */ int b;

    public /* synthetic */ w(al alVar, int i) {
        this.b = i;
        this.a = alVar;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.b != 0 ? consumer.getClass() : consumer.getClass();
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.b == 0) {
            this.a.O((View) obj);
        } else {
            this.a.Q((View) obj);
        }
    }
}
