package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service;

import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.n;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ n a;
    private final /* synthetic */ int b;

    public /* synthetic */ i(n nVar, int i) {
        this.b = i;
        this.a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afng afngVar;
        afng afngVar2;
        int i = this.b;
        if (i == 0) {
            e eVar = this.a.a;
            if (eVar == null || (afngVar = eVar.b) == null) {
                return;
            }
            afngVar.b();
        } else if (i != 1) {
            e eVar2 = this.a.a;
            if (eVar2 == null || (afngVar2 = eVar2.b) == null) {
                return;
            }
            afngVar2.b();
        } else {
            e eVar3 = this.a.a;
            if (eVar3 == null) {
                return;
            }
            eVar3.c = null;
            afng afngVar3 = eVar3.b;
            if (afngVar3 == null) {
                return;
            }
            afngVar3.d();
        }
    }
}
