package defpackage;

import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* renamed from: eamn  reason: default package */
/* loaded from: classes6.dex */
public final class eamn extends UrlRequest.StatusListener {
    private final UrlRequest.StatusListener a;

    public eamn(UrlRequest.StatusListener statusListener) {
        this.a = statusListener;
    }

    @Override // org.chromium.net.UrlRequest.StatusListener
    public final void onStatus(int i) {
        this.a.onStatus(i);
    }
}
