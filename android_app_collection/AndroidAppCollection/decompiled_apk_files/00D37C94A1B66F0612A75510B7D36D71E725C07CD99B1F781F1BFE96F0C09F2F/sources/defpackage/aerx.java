package defpackage;

import android.media.UnsupportedSchemeException;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.media.player.drm.WidevineHelper$Listener;
import com.google.android.libraries.youtube.media.player.drm.WidevineHelper$UnsupportedDrmExceptionWithQoeMetrics;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: aerx  reason: default package */
/* loaded from: classes.dex */
public final class aerx implements aerq, aerw {
    public final WidevineHelper$Listener a;
    public final int b;
    public final PlayerConfigModel c;
    public final String d;
    public final azqb e;
    public final aesh f;
    public boolean g;
    public boolean h;
    public aere i;
    public boolean j;

    public aerx(WidevineHelper$Listener widevineHelper$Listener, int i, PlayerConfigModel playerConfigModel, String str, azqb azqbVar, aesh aeshVar) {
        afms.a(widevineHelper$Listener);
        this.a = widevineHelper$Listener;
        this.b = i;
        afms.a(playerConfigModel);
        this.c = playerConfigModel;
        afms.a(str);
        this.d = str;
        afms.a(azqbVar);
        this.e = azqbVar;
        afms.a(aeshVar);
        this.f = aeshVar;
    }

    public static aere b(Uri uri, aesh aeshVar, Looper looper, Handler handler, aerx aerxVar, final String str, String str2, String str3, String str4, String str5, boolean z, final aerh aerhVar, aflm aflmVar, PlayerConfigModel playerConfigModel) {
        aesk aeskVar = new aesk(playerConfigModel.aW() ? null : uri.toString(), aeshVar, str, str2, str4, str5, handler, aerxVar);
        HashMap hashMap = new HashMap(1);
        hashMap.put("aid", str3);
        amqo amqoVar = new amqo() { // from class: com.google.android.libraries.youtube.media.player.drm.WidevineHelper$$ExternalSyntheticLambda0
            @Override // defpackage.amqo
            public final Object get() {
                return aerh.this.a(str);
            }
        };
        try {
            oxe oxeVar = new oxe(aeqw.a);
            if (playerConfigModel.aj()) {
                try {
                    oxeVar.b("securityLevel", "L3");
                } catch (IllegalStateException e) {
                    String valueOf = String.valueOf(e.getLocalizedMessage());
                    afus.b(1, 6, valueOf.length() != 0 ? "Cannot set mediaDrm property securityLevel to L3 : ".concat(valueOf) : new String("Cannot set mediaDrm property securityLevel to L3 : "));
                    String e2 = afca.e(oxeVar);
                    String valueOf2 = String.valueOf(e2);
                    zep.l(valueOf2.length() != 0 ? "MediaDrm metrics while trying to set securityLevel to L3: ".concat(valueOf2) : new String("MediaDrm metrics while trying to set securityLevel to L3: "));
                    throw new WidevineHelper$UnsupportedDrmExceptionWithQoeMetrics(e2, new oxg(2, e));
                }
            }
            try {
                if (z) {
                    return new aerd(looper, aeskVar, hashMap, handler, aerxVar, oxeVar, aflmVar, playerConfigModel);
                }
                return new aerv(looper, aeskVar, hashMap, handler, aerxVar, amqoVar, oxeVar, aflmVar);
            } catch (oxg e3) {
                throw new WidevineHelper$UnsupportedDrmExceptionWithQoeMetrics(afca.e(oxeVar), e3);
            }
        } catch (UnsupportedSchemeException e4) {
            throw new WidevineHelper$UnsupportedDrmExceptionWithQoeMetrics(null, new oxg(1, e4));
        }
    }

    @Override // defpackage.aerw
    public final void rv() {
        VideoStreamingData videoStreamingData;
        boolean z = true;
        this.h = true;
        if (!this.j) {
            this.a.onHdDrmUnavailable(this.b, "SecureSurfaceUnavailable");
        } else if (a() != 1) {
            this.a.onHdDrmUnavailable(this.b, "WidevineL1");
        } else if (!this.c.Y()) {
            this.a.onHdDrmUnavailable(this.b, "DeviceBlacklisted");
        } else {
            this.g = true;
            WidevineHelper$Listener widevineHelper$Listener = this.a;
            int i = this.b;
            ylr.c();
            afdv afdvVar = (afdv) widevineHelper$Listener;
            if (i == afdvVar.u() && ((videoStreamingData = afdvVar.t) == null || !videoStreamingData.v)) {
                z = false;
            }
            afms.d(z);
            if (i != afdvVar.u()) {
                return;
            }
            afdvVar.z();
            afdvVar.M = 0;
            afdvVar.i.g();
        }
    }

    public final int a() {
        if (!this.j) {
            return 3;
        }
        aere aereVar = this.i;
        if (aereVar == null) {
            return aerv.i();
        }
        return aereVar.h();
    }
}
