package defpackage;

import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;
/* compiled from: PG */
/* renamed from: baep  reason: default package */
/* loaded from: classes2.dex */
public final class baep implements Runnable {
    final /* synthetic */ VersionSafeCallbacks$UrlRequestStatusListener a;

    public baep(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener) {
        this.a = versionSafeCallbacks$UrlRequestStatusListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onStatus(-1);
    }
}
