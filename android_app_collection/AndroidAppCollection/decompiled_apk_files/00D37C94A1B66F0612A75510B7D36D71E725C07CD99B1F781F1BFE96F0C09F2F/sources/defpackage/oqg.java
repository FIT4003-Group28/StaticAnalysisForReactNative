package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.embeddedplayer.service.EmbedsBackgroundTaskWorker;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.f;
/* compiled from: PG */
/* renamed from: oqg  reason: default package */
/* loaded from: classes4.dex */
final class oqg implements yjr {
    private final aoce a;

    public oqg(f fVar, boolean z, String str) {
        this.a = new aoce(fVar, z, str);
    }

    @Override // defpackage.yjr
    public final Bundle a() {
        return this.a.a;
    }

    @Override // defpackage.yjr
    public final Class b() {
        return EmbedsBackgroundTaskWorker.class;
    }
}
