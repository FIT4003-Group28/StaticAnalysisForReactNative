package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
/* compiled from: PG */
/* renamed from: aivw  reason: default package */
/* loaded from: classes.dex */
public final class aivw implements aiua {
    public final String a;
    public final awef b;
    public final snc c;
    public final aijh d;
    public final aadd e;
    public final aynx f;
    public final aynx g;
    public final aynx h;
    public final aynx i;
    public final aynx j;
    public final aynx k;
    public final aynx l;
    public final aynx m;
    public final aynx n;
    public final aynx o;
    public final aynx p;
    public final ajft q;
    public final aynx r;
    public afiz s;
    public final aypf t = new aypf();
    private final afja u;
    private final boolean v;

    public aivw(snc sncVar, String str, awef awefVar, boolean z, aynx aynxVar, aynx aynxVar2, aynx aynxVar3, aynx aynxVar4, aynx aynxVar5, aynx aynxVar6, aynx aynxVar7, aynx aynxVar8, aynx aynxVar9, aynx aynxVar10, aynx aynxVar11, ajft ajftVar, aadd aaddVar, afja afjaVar, aijh aijhVar, aacz aaczVar, aynx aynxVar12) {
        this.c = sncVar;
        this.a = str;
        this.b = awefVar;
        this.v = z;
        this.f = aynxVar;
        this.g = aynxVar2;
        this.h = aynxVar3;
        this.i = aynxVar4;
        this.j = aynxVar5;
        this.k = aynxVar6;
        this.n = aynxVar7;
        this.o = aynxVar8;
        this.m = aynxVar9;
        this.l = aynxVar10;
        this.p = aynxVar11;
        this.q = ajftVar;
        this.e = aaddVar;
        this.u = afjaVar;
        this.d = aijhVar;
        this.r = aynxVar12;
        if (!aiix.E(aaczVar) || !b(aaddVar).d) {
            return;
        }
        afiz a = afjaVar.a(str, awefVar);
        this.s = a;
        if (a == null) {
            return;
        }
        ajftVar.addObserver(a);
    }

    public static aujv b(aadd aaddVar) {
        if (aaddVar == null || aaddVar.a() == null) {
            return aujv.b;
        }
        atdy atdyVar = aaddVar.a().i;
        if (atdyVar == null) {
            atdyVar = atdy.a;
        }
        aujv aujvVar = atdyVar.f;
        return aujvVar == null ? aujv.b : aujvVar;
    }

    @Override // defpackage.aiua
    public final void a(long j) {
        afiz afizVar = this.s;
        if (afizVar != null) {
            afizVar.J(j);
        }
    }

    public final void c(String str, String str2, awef awefVar, VideoStreamingData videoStreamingData, TrackingUrlModel trackingUrlModel, PlayerConfigModel playerConfigModel) {
        afiz afizVar = this.s;
        if (afizVar != null) {
            if (afizVar.m) {
                return;
            }
            afizVar.h(trackingUrlModel, str2, null, null, str, videoStreamingData, playerConfigModel);
            return;
        }
        afiz b = this.u.b(trackingUrlModel, str2, awefVar, null, null, str, videoStreamingData, this.v, playerConfigModel);
        this.s = b;
        if (b == null) {
            return;
        }
        this.q.addObserver(b);
    }

    public final boolean d() {
        arhd a;
        aadd aaddVar = this.e;
        if (aaddVar != null && (a = aaddVar.a()) != null) {
            atdy atdyVar = a.i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            apfk apfkVar = atdyVar.i;
            if (apfkVar == null) {
                apfkVar = apfk.a;
            }
            if (apfkVar.i) {
                return true;
            }
        }
        return false;
    }
}
