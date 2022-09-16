package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class y implements ayqb {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ y(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public /* synthetic */ y(String str, boolean z, int i) {
        this.c = i;
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.c == 0) {
            ((ax) obj).l(SimplePlaybackDescriptor.c(this.a, ax.a(this.b)));
            return;
        }
        String str = this.a;
        boolean z = this.b;
        com.google.android.apps.youtube.embeddedplayer.service.model.k kVar = new com.google.android.apps.youtube.embeddedplayer.service.model.k();
        kVar.a = 2;
        kVar.c = str;
        kVar.e = ax.a(z);
        ((ax) obj).l(kVar.a());
    }
}
