package com.google.android.apps.youtube.embeddedplayer.service.jar.client;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bg implements com.google.android.apps.youtube.embeddedplayer.service.jar.d {
    final /* synthetic */ bp a;

    public bg(bp bpVar) {
        this.a = bpVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.d
    public final void a(int i) {
        if (i == 0 || i == 5) {
            this.a.m.post(new bf(this));
        } else if (i != 1) {
        } else {
            this.a.m.post(new bf(this, 1));
        }
    }
}
