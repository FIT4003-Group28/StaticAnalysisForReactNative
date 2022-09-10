package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gmm.settings.navigation.VoiceOptionListPreference;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btff  reason: default package */
/* loaded from: classes4.dex */
public final class btff extends aug implements btsv {
    public cqkj ad;
    public CharSequence ae;
    @dzsi
    private btta af;
    private CharSequence[] ag;
    private CharSequence[] ai;
    private CharSequence[] aj;
    private boolean[] ak;

    @Override // defpackage.ex, defpackage.fd
    public final void Qi(Context context) {
        ((btfg) btsx.b(btfg.class, this)).mo2do(this);
        super.Qi(context);
    }

    @Override // defpackage.aug
    public final void aL(boolean z) {
        VoiceOptionListPreference voiceOptionListPreference = (VoiceOptionListPreference) aN();
        if (!z || !voiceOptionListPreference.I(this.ae)) {
            return;
        }
        voiceOptionListPreference.Rj(this.ae.toString());
    }

    @Override // defpackage.aug
    public final void aM(qx qxVar) {
        String Rp;
        cqlm cqlmVar = new cqlm(this.ad);
        dccx dccxVar = new dccx();
        for (int i = 0; i < this.ag.length; i++) {
            if (i != 0) {
                boolean[] zArr = this.ak;
                if (!zArr[i]) {
                    if (!zArr[i - 1]) {
                    }
                }
                dccxVar.g(cqgr.fT(new btfm(), new btfo(this.ag[i], this.aj[i], this.ai[i].toString().contentEquals(this.ae), this.ai[i])));
            }
            if (i == 0) {
                Rp = Rp(R.string.VOICE_LIST_SECTION_TITLE_SUGGESTED);
            } else {
                Rp = Rp(R.string.VOICE_LIST_SECTION_TITLE_ALL);
            }
            dccxVar.g(cqix.d(new btfq(), new iyb(Rp), false));
            dccxVar.g(cqgr.fT(new btfm(), new btfo(this.ag[i], this.aj[i], this.ai[i].toString().contentEquals(this.ae), this.ai[i])));
        }
        dcdc f = dccxVar.f();
        int size = f.size();
        for (int i2 = 0; i2 < size; i2++) {
            cqlmVar.a((cqix) f.get(i2));
        }
        qxVar.d(cqlmVar, new btfd(this, f));
        qxVar.l(R.string.CANCEL_BUTTON, new btfe());
    }

    @Override // defpackage.btsv
    public final btta be() {
        if (this.af == null) {
            this.af = btsx.a(btta.class, this);
        }
        return this.af;
    }

    @Override // defpackage.btsv
    public final boolean bf() {
        return this.af != null;
    }

    @Override // defpackage.aug, defpackage.ex, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        if (bundle != null) {
            this.ae = bundle.getCharSequence("selectedEntryValue", "");
            this.ag = bundle.getCharSequenceArray("entries");
            this.ai = bundle.getCharSequenceArray("entryValues");
            this.aj = bundle.getCharSequenceArray("entrySummaries");
            this.ak = bundle.getBooleanArray("entryIsRecommended");
        }
    }

    @Override // defpackage.aug, defpackage.ex, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putCharSequence("selectedEntryValue", this.ae);
        bundle.putCharSequenceArray("entries", this.ag);
        bundle.putCharSequenceArray("entryValues", this.ai);
        bundle.putCharSequenceArray("entrySummaries", this.aj);
        bundle.putBooleanArray("entryIsRecommended", this.ak);
    }
}
