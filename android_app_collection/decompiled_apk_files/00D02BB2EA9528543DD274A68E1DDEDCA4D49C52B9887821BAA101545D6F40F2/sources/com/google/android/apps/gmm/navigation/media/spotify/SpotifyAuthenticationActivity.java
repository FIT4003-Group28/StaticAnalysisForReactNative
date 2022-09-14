package com.google.android.apps.gmm.navigation.media.spotify;

import android.os.Bundle;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SpotifyAuthenticationActivity extends gga implements btss {
    public efc k;
    private arvr l;

    public SpotifyAuthenticationActivity() {
        dbsk.l(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gga, defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onCreate(@dzsi Bundle bundle) {
        arvr arvrVar = (arvr) btsq.a(arvr.class, this);
        this.l = arvrVar;
        arvrVar.xc(this);
        super.onCreate(bundle);
        D(new arvt());
    }

    @Override // defpackage.gga
    protected final void q() {
    }

    @Override // defpackage.gga
    public final efc r() {
        return this.k;
    }

    @Override // defpackage.gga
    public final void s() {
    }

    @Override // defpackage.btss
    public final <T extends btsy> T t(Class<T> cls) {
        return cls.cast(this.l);
    }
}
