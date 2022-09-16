package defpackage;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.aq;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.ax;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.bp;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import com.google.android.apps.youtube.embeddedplayer.service.util.b;
import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: jhq  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jhq implements ayqb {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ jhq(String str) {
        this.a = str;
    }

    public /* synthetic */ jhq(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                zep.d(this.a, (Throwable) obj);
                return;
            case 1:
                zep.d(this.a, (Throwable) obj);
                return;
            case 2:
                afus.c(2, 1, this.a, (Throwable) obj);
                return;
            case 3:
                String str = this.a;
                ax axVar = (ax) obj;
                if (axVar.n()) {
                    return;
                }
                axVar.g.r(str);
                return;
            case 4:
                String str2 = this.a;
                ax axVar2 = (ax) obj;
                if (axVar2.n()) {
                    return;
                }
                bp bpVar = axVar2.g.a;
                if (!bpVar.f()) {
                    pcu.i();
                    return;
                }
                try {
                    bpVar.c.l(str2);
                    return;
                } catch (RemoteException e) {
                    pcu.h(e);
                    return;
                }
            case 5:
                b.a(this.a).ifPresent(new aq((ax) obj));
                return;
            case 6:
                b.a(this.a).ifPresent(new aq((ax) obj));
                return;
            case 7:
                String str3 = this.a;
                ax axVar3 = (ax) obj;
                try {
                    d dVar = a.b;
                    dVar.i(System.currentTimeMillis());
                    dVar.f(Tick.REMOTE_RECEIVES_PREVIEW_REQUEST, System.currentTimeMillis());
                } catch (RemoteException e2) {
                    pcu.h(e2);
                }
                axVar3.l(SimplePlaybackDescriptor.c(str3, 0));
                return;
            default:
                String str4 = this.a;
                aopa aopaVar = (aopa) obj;
                Charset charset = alfp.a;
                aopaVar.copyOnWrite();
                alcw alcwVar = (alcw) aopaVar.instance;
                alcw alcwVar2 = alcw.a;
                str4.getClass();
                alcwVar.c = 2 | alcwVar.c;
                alcwVar.F = str4;
                return;
        }
    }
}
