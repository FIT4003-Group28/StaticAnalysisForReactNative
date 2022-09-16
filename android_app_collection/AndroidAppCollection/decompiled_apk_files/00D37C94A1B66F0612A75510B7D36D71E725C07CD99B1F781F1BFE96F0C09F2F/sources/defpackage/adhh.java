package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: adhh  reason: default package */
/* loaded from: classes.dex */
public final class adhh {
    private final azqb a;
    private final boolean b;

    public adhh(azqb azqbVar, aczr aczrVar) {
        this.a = azqbVar;
        this.b = aczrVar.c.equals("m");
    }

    public final boolean a(eo eoVar) {
        ajbf o;
        VideoStreamingData videoStreamingData;
        if (this.b && (o = ((airr) this.a.get()).o()) != null && o.c() != null) {
            PlayerResponseModel c = o.c();
            if (c.B().isEmpty() && c.t() != null && (videoStreamingData = c.c) != null && videoStreamingData.F()) {
                adhj adhjVar = new adhj();
                adhjVar.qv(eoVar, adhjVar.getClass().getCanonicalName());
                return true;
            }
        }
        return false;
    }
}
