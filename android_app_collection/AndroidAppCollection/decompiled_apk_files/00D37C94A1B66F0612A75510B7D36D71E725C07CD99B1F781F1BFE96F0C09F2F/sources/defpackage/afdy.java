package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afdy  reason: default package */
/* loaded from: classes.dex */
public final class afdy extends afcs {
    VideoStreamingData b;
    PlayerConfigModel c;
    boolean d;
    afdx e;
    private int f;
    private int g;
    private final afdx h;
    private final afdx[] i;
    private afnh j;
    private final afjz k;

    public afdy(afdx afdxVar, afjz afjzVar, afdx... afdxVarArr) {
        super(afdxVarArr[0]);
        this.f = 0;
        this.g = 0;
        this.k = afjzVar;
        this.h = afdxVar;
        this.i = afdxVarArr;
    }

    final synchronized boolean A(afdx afdxVar) {
        afgg afggVar = this.a;
        this.f += afggVar.b() - afdxVar.b();
        this.g += afggVar.e() - afdxVar.e();
        if (afdxVar == afggVar) {
            return false;
        }
        afggVar.F(false);
        if (this.k.Y()) {
            afggVar.N(false, 19);
            afdxVar.N(true, 19);
        }
        if (this.j != null) {
            afggVar.s();
            afdxVar.p(this.j);
        }
        this.a = afdxVar;
        return true;
    }

    @Override // defpackage.afcs, defpackage.afgg
    public final afte K(aetw aetwVar) {
        amqi b = amqi.b(amok.a);
        afdw u = u(aetwVar.b, aetwVar.e, afmg.bb(aetwVar, 8));
        boolean A = A(u.a);
        if (u.b) {
            aetwVar.a().i("adpf", new aest("0"));
        }
        if (A) {
            aetwVar.a().i("lsp", new aest(Long.toString(b.a(TimeUnit.MILLISECONDS))));
        }
        this.j = aetwVar.b();
        afdx afdxVar = (afdx) this.a;
        afki afkiVar = afki.ABR;
        afdxVar.getClass().getSimpleName();
        afte K = afdxVar.K(aetwVar);
        aetwVar.a().i("llv", new aest(Long.toString(b.a(TimeUnit.MILLISECONDS))));
        return K;
    }

    @Override // defpackage.afcs, defpackage.affb
    public final int b() {
        return this.f + ((afdx) this.a).b();
    }

    @Override // defpackage.afcs, defpackage.afgg
    public final int c(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        return u(videoStreamingData, playerConfigModel, false).a.c(videoStreamingData, playerConfigModel);
    }

    @Override // defpackage.afcs, defpackage.affb
    public final int e() {
        return this.g + ((afdx) this.a).e();
    }

    @Override // defpackage.afcs, defpackage.afgg
    public final aegu m(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z, aegs aegsVar, int i) {
        boolean z2 = false;
        if (z || (aegsVar != null && aegsVar.a())) {
            z2 = true;
        }
        return u(videoStreamingData, playerConfigModel, z2).a.m(videoStreamingData, playerConfigModel, z, aegsVar, i);
    }

    @Override // defpackage.afcs, defpackage.afgg
    public final void p(afnh afnhVar) {
        this.j = afnhVar;
        super.p(afnhVar);
    }

    @Override // defpackage.afcs, defpackage.affb
    public final void s() {
        this.j = null;
        super.s();
    }

    @Override // defpackage.afcs, defpackage.afgg
    public final void t(aanr aanrVar, aetv aetvVar) {
        if (this.k.p().k) {
            synchronized (this) {
                if (!aanrVar.j) {
                    this.a = this.h;
                }
                this.h.t(aanrVar, aetvVar);
            }
            return;
        }
        synchronized (this) {
            super.t(aanrVar, aetvVar);
        }
    }

    @Override // defpackage.afcs, defpackage.afgg
    public final void y() {
        ((afdx) this.a).y();
    }

    final afdw u(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z) {
        afdx afdxVar = this.e;
        if (afdxVar == null || this.b != videoStreamingData || this.c != playerConfigModel || this.d != z) {
            afdx[] afdxVarArr = this.i;
            for (int i = 0; i < 4; i++) {
                afdx afdxVar2 = afdxVarArr[i];
                if (afdxVar2.H(videoStreamingData, playerConfigModel, z)) {
                    this.b = videoStreamingData;
                    this.c = playerConfigModel;
                    this.d = z;
                    this.e = afdxVar2;
                    return afdw.a(afdxVar2, false);
                }
            }
            return afdw.a(this.i[0], true);
        }
        return afdw.a(afdxVar, false);
    }
}
