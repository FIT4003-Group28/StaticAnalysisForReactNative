package com.google.android.apps.youtube.embeddedplayer.service.jar.client;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aa implements ayqb {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ aa(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            boolean z = this.a;
            com.google.android.apps.youtube.embeddedplayer.service.model.f a = com.google.android.apps.youtube.embeddedplayer.service.model.g.a();
            a.a = z;
            ((ax) obj).l = a.a();
            return;
        }
        boolean z2 = this.a;
        ax axVar = (ax) obj;
        if (axVar.n()) {
            return;
        }
        axVar.g.x(axVar, z2);
    }
}
