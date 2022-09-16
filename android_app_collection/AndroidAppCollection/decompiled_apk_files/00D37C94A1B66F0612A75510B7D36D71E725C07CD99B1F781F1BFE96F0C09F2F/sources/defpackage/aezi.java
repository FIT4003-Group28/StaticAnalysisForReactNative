package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aezi  reason: default package */
/* loaded from: classes.dex */
public final class aezi extends aezb {
    private final aeun l;
    private final afhh m;
    private final aezq n;
    private final yrj o;
    private final aexg[] p;
    private final afjz q;

    public aezi(afjm afjmVar, pnp pnpVar, pnj pnjVar, atk atkVar, pqh pqhVar, axf axfVar, PlayerConfigModel playerConfigModel, VideoStreamingData videoStreamingData, aeun aeunVar, afhh afhhVar, aezk aezkVar, String str, pjc pjcVar, afbq afbqVar, aexg[] aexgVarArr, yrj yrjVar, afjz afjzVar) {
        super(afjmVar, pnpVar, pnjVar, atkVar, pqhVar, axfVar, playerConfigModel, videoStreamingData, aezkVar, str, pjcVar, afbqVar);
        afms.b(!videoStreamingData.p.isEmpty());
        this.l = aeunVar;
        this.m = afhhVar;
        this.n = new aezq(((FormatStreamModel) videoStreamingData.p.get(0)).h());
        this.p = aexgVarArr;
        this.o = yrjVar;
        this.q = afjzVar;
    }

    @Override // defpackage.aezb
    protected final pry c(afbk afbkVar, pvf pvfVar) {
        aeze aezeVar = new aeze(this.a, afbkVar.b, this.e, this.l, this.h, (aezk) this.d, pvfVar, this.m, this.n, this.c, afbkVar.a, this.b.G(), this.b.E(), this.j, this.p, this.o, this.q);
        this.n.c(aezeVar);
        return aezeVar;
    }

    @Override // defpackage.aezb, defpackage.ppy, defpackage.prk
    public final boolean o(long j) {
        aeug l;
        for (prx prxVar : this.k) {
            pry pryVar = prxVar.b;
            if ((pryVar instanceof aeze) && (l = ((aeze) pryVar).l()) != null && l.c()) {
                l.a(new Runnable() { // from class: aezh
                    @Override // java.lang.Runnable
                    public final void run() {
                        aezi.this.r();
                    }
                });
                return false;
            }
        }
        return super.o(j);
    }

    @Override // defpackage.aezb
    protected final void q(pry pryVar) {
        if (pryVar instanceof aeze) {
            this.n.e((aeze) pryVar);
        }
    }
}
