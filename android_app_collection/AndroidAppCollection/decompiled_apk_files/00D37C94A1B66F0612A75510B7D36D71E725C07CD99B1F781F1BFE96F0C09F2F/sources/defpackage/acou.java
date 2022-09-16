package defpackage;

import org.webrtc.MediaStream;
/* compiled from: PG */
/* renamed from: acou  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acou implements Runnable {
    public final /* synthetic */ acow a;
    public final /* synthetic */ MediaStream b;
    private final /* synthetic */ int c;

    public /* synthetic */ acou(acow acowVar, MediaStream mediaStream) {
        this.a = acowVar;
        this.b = mediaStream;
    }

    public /* synthetic */ acou(acow acowVar, MediaStream mediaStream, int i) {
        this.c = i;
        this.a = acowVar;
        this.b = mediaStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            acow acowVar = this.a;
            MediaStream mediaStream = this.b;
            abut abutVar = acowVar.f;
            acke ackeVar = (acke) abutVar;
            if (!ackeVar.aE.equals(mediaStream.b())) {
                zep.b("Removed stream id doesn't match active stream id. Skipping.");
                return;
            }
            ackeVar.aN(asux.LIVESTREAM_CONNECTION_STATE_DISCONNECTED);
            ackeVar.aL();
            return;
        }
        acow acowVar2 = this.a;
        MediaStream mediaStream2 = this.b;
        abut abutVar2 = acowVar2.f;
        String b = mediaStream2.b();
        baoo baooVar = acowVar2.g;
        acke ackeVar2 = (acke) abutVar2;
        ackeVar2.aE = b;
        ackeVar2.aN(asux.LIVESTREAM_CONNECTION_STATE_ACTIVE);
        ackeVar2.aq.removeAllViews();
        ackeVar2.aq.addView(baooVar);
    }
}
