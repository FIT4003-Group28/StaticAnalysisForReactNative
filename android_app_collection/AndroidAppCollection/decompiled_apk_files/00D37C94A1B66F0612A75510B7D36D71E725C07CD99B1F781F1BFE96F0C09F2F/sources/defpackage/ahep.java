package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahep  reason: default package */
/* loaded from: classes.dex */
public final class ahep extends AudioDeviceCallback {
    final /* synthetic */ aheq a;

    public ahep(aheq aheqVar) {
        this.a = aheqVar;
    }

    private final void a() {
        aheq aheqVar = this.a;
        aheqVar.b.a.h.c(aheqVar.a.a());
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        a();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        a();
    }
}
