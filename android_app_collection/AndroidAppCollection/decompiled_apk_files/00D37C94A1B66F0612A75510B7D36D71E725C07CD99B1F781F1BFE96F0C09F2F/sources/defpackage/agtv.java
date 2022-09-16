package defpackage;

import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.offline.player.OfflinePlaybackTrackingPlaybackListener$State;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agtv  reason: default package */
/* loaded from: classes.dex */
public final class agtv extends ajfb {
    private final agtx a;
    private final agtu b;
    private agtw c;
    private agtt d;
    private String e;
    private long f;
    private final aacz g;

    public agtv(agtx agtxVar, agtu agtuVar, aacz aaczVar) {
        this.a = agtxVar;
        this.b = agtuVar;
        this.g = aaczVar;
    }

    @Override // defpackage.ajfb
    public final Parcelable Q() {
        return new OfflinePlaybackTrackingPlaybackListener$State(this.e);
    }

    @Override // defpackage.ajfb
    public final void R(ahhw ahhwVar) {
        PlayerResponseModel b;
        aika c = ahhwVar.c();
        if ((c == aika.VIDEO_REQUESTED || c == aika.VIDEO_PLAYING) && (b = ahhwVar.b()) != null) {
            String B = b.B();
            String str = this.e;
            if (str != null && str.equals(B)) {
                return;
            }
            this.e = B;
            agtx agtxVar = this.a;
            azqb azqbVar = agtxVar.a;
            snc sncVar = (snc) agtxVar.b.get();
            sncVar.getClass();
            B.getClass();
            this.c = new agtw(azqbVar, sncVar, B);
            agtu agtuVar = this.b;
            String str2 = this.e;
            azqb azqbVar2 = agtuVar.a;
            azqb azqbVar3 = agtuVar.b;
            str2.getClass();
            this.d = new agtt(azqbVar2, azqbVar3, str2);
        }
    }

    @Override // defpackage.ajfb
    public final void b() {
        agtt agttVar;
        agqv e;
        if (!ahdf.o(this.g) || (agttVar = this.d) == null) {
            return;
        }
        if (this.f >= 0) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f);
            if (!TextUtils.isEmpty(agttVar.c)) {
                agrf agrfVar = (agrf) agttVar.b.get();
                if (agrfVar.h()) {
                    agvx a = agrfVar.a();
                    if (!((agvq) agttVar.a.get()).K(agrfVar.d()) && (e = a.m().e(agttVar.c)) != null && !e.s()) {
                        a.m().D(agttVar.c, seconds);
                    }
                }
            }
        }
        this.f = -1L;
    }

    @Override // defpackage.ajfb
    public final void e(ahhx ahhxVar) {
        agtw agtwVar = this.c;
        if (agtwVar != null && ahhxVar.j()) {
            if (!TextUtils.isEmpty(agtwVar.c)) {
                agrf agrfVar = (agrf) agtwVar.a.get();
                if (agrfVar.h()) {
                    agvx a = agrfVar.a();
                    if (a.m().e(agtwVar.c) != null) {
                        long c = agtwVar.b.c();
                        agtwVar.c.length();
                        a.m().E(agtwVar.c, c);
                    }
                }
            }
            this.c = null;
        }
        if (!ahdf.o(this.g) || !ahhxVar.j()) {
            return;
        }
        this.f = ahhxVar.e();
    }

    @Override // defpackage.ajfb
    public final void f(Parcelable parcelable, anvz anvzVar) {
        aqxo.p(parcelable instanceof OfflinePlaybackTrackingPlaybackListener$State);
        if (!anvzVar.a) {
            this.e = ((OfflinePlaybackTrackingPlaybackListener$State) parcelable).a;
        }
    }
}
