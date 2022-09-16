package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aexu  reason: default package */
/* loaded from: classes.dex */
public final class aexu extends pmi {
    public aevn t;
    private final aevy u;
    private final Handler v;

    public aexu(Context context, pli pliVar, aevy aevyVar, Handler handler, aexm aexmVar, plo ploVar) {
        super(context, aexmVar, handler, pliVar, ploVar);
        this.t = aevn.a;
        this.u = aevyVar;
        this.v = handler;
    }

    @Override // defpackage.pmi, defpackage.awb, defpackage.pkd
    public final boolean I() {
        if (!super.I()) {
            return false;
        }
        this.t.e();
        return true;
    }

    @Override // defpackage.pmi, defpackage.phj, defpackage.pkb
    public final void ad(int i, Object obj) {
        if (i == 10001) {
            aevn aevnVar = (aevn) obj;
            if (aevnVar == null) {
                aevnVar = aevn.a;
            }
            this.t = aevnVar;
            return;
        }
        super.ad(i, obj);
    }

    @Override // defpackage.pmi, defpackage.phj
    public final void af() {
        if (this.u.s.Z(aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_REPORT_PRE_AUDIO_TRACK_LATENCY)) {
            this.v.post(new Runnable() { // from class: aext
                @Override // java.lang.Runnable
                public final void run() {
                    aexu.this.t.a();
                }
            });
        }
        super.af();
        this.t.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pmi, defpackage.awb
    public final float b(float f, Format format, Format[] formatArr) {
        if (this.u.s.Z(aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_DISABLE_CODEC_OPERATING_RATE)) {
            return -1.0f;
        }
        return super.b(f, format, formatArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pmi, defpackage.awb, defpackage.phj
    public final void q(boolean z, boolean z2) {
        super.q(z, z2);
        this.t.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pmi, defpackage.awb
    public final void v(pmv pmvVar) {
        super.v(pmvVar);
        this.t.d();
    }
}
