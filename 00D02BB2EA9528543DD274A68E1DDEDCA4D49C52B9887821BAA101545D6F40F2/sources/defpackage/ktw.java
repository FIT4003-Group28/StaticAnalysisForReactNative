package defpackage;

import com.google.android.apps.auto.sdk.nav.ClientMode;
/* compiled from: PG */
/* renamed from: ktw  reason: default package */
/* loaded from: classes.dex */
public final class ktw {
    @dzsi
    public volatile ClientMode a;
    public boolean b;
    private final ckcw c;

    public ktw(ckcw ckcwVar) {
        this.c = ckcwVar;
    }

    public final void a(@dzsi ClientMode clientMode) {
        this.a = clientMode;
        this.c.b(ckgx.ANDROID_AUTO_CLIENT_MODE, new ktv(clientMode));
    }
}
