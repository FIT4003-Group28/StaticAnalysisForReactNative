package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import org.webrtc.DataChannel;
import org.webrtc.VideoTrack;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acow  reason: default package */
/* loaded from: classes.dex */
public final class acow implements acph {
    public final Context a;
    public final Handler b;
    public final abss c;
    public acov e;
    public abut f;
    public baoo g;
    public VideoTrack h;
    public final ArrayList d = new ArrayList();
    private long i = -1;

    public acow(Context context, Handler handler, abss abssVar) {
        this.a = context;
        this.b = handler;
        this.c = abssVar;
    }

    @Override // org.webrtc.DataChannel.Observer
    public final void onBufferedAmountChange(long j) {
    }

    @Override // org.webrtc.DataChannel.Observer
    public final void onMessage(DataChannel.Buffer buffer) {
        acov acovVar;
        byte[] bArr = new byte[buffer.a.remaining()];
        buffer.a.get(bArr);
        try {
            boolean z = false;
            for (aohr aohrVar : ((aoho) aopi.parseFrom(aoho.a, bArr, aoos.b())).b) {
                aohs aohsVar = aohrVar.b;
                if (aohsVar == null) {
                    aohsVar = aohs.a;
                }
                long j = aohsVar.b;
                if (this.i < j) {
                    for (aohn aohnVar : aohrVar.c) {
                        ArrayList arrayList = this.d;
                        aohp aohpVar = aohnVar.b;
                        if (aohpVar == null) {
                            aohpVar = aohp.a;
                        }
                        arrayList.add(Integer.toString(aohpVar.b));
                    }
                    for (aohq aohqVar : aohrVar.d) {
                        this.d.remove(Integer.toString(aohqVar.b));
                    }
                    this.i = j;
                    z = true;
                }
            }
            if (z && (acovVar = this.e) != null) {
                ((acpg) acovVar).x.getClass();
                ((acpg) acovVar).a();
            }
        } catch (aopx e) {
            String valueOf = String.valueOf(e.getMessage());
            zep.h("ParticipantMediaStreamMgr", valueOf.length() != 0 ? "Didn't find PushNotification proto in DataChannel buffer: ".concat(valueOf) : new String("Didn't find PushNotification proto in DataChannel buffer: "));
        }
        try {
            final axiu axiuVar = (axiu) aopi.parseFrom(axiu.a, bArr, aoos.b());
            if (this.f == null || axiuVar.b == null) {
                return;
            }
            this.b.post(new Runnable() { // from class: acos
                @Override // java.lang.Runnable
                public final void run() {
                    acow acowVar = acow.this;
                    axiu axiuVar2 = axiuVar;
                    abut abutVar = acowVar.f;
                    aorw aorwVar = axiuVar2.b;
                    if (aorwVar == null) {
                        aorwVar = aorw.a;
                    }
                    long j2 = aorwVar.b;
                    if (!achk.b((dp) abutVar)) {
                        return;
                    }
                    acke ackeVar = (acke) abutVar;
                    int c = (int) (j2 - (ackeVar.al.c() / 1000));
                    if (c <= 0) {
                        return;
                    }
                    ackeVar.aM();
                    ackeVar.as.b(c);
                    ackeVar.as.c = new ackc(ackeVar);
                }
            });
        } catch (aopx e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            zep.h("ParticipantMediaStreamMgr", valueOf2.length() != 0 ? "Didn't find CostreamMessage proto in DataChannel buffer: ".concat(valueOf2) : new String("Didn't find CostreamMessage proto in DataChannel buffer: "));
        }
    }

    @Override // org.webrtc.DataChannel.Observer
    public final void onStateChange() {
    }
}
