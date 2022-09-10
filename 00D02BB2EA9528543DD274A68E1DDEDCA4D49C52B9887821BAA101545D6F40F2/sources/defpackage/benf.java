package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: benf  reason: default package */
/* loaded from: classes3.dex */
public final class benf extends beiv {
    public benl ah;
    public cqkj ai;
    private benk aj;

    public benf() {
        super(false);
    }

    @Override // defpackage.beiv
    protected final String aR() {
        return this.b.getString(bdys.MERCHANT_PANEL_ORGANIC_CALLS_TRANSCRIPT);
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, Bundle bundle) {
        aS();
        this.af = this.ai.e(new beng());
        this.af.e(this.aj);
        return this.af.c();
    }

    @Override // defpackage.beiv, defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        bwrs<ilo> bwrsVar;
        super.l(bundle);
        try {
            Bundle bundle2 = this.o;
            this.ae = this.d.e(ilo.class, bundle2, "MerchantCallsTranscriptFragment.placemark");
            String string = bundle2.getString("MerchantCallsTranscriptFragment.voiceCallId");
            String string2 = bundle2.getString("MerchantCallsTranscriptFragment.audioUrl");
            long j = bundle2.getLong("MerchantCallsTranscriptFragment.audioDurationSeconds");
            bwrs<bvrt<benb>> bwrsVar2 = this.ad;
            if (bwrsVar2 == null || (bwrsVar = this.ae) == null || string == null || string2 == null) {
                return;
            }
            benl benlVar = this.ah;
            ff ffVar = (ff) ((dxjd) benlVar.a).a;
            benl.a(ffVar, 1);
            apny a = benlVar.b.a();
            benl.a(a, 2);
            cqhn a2 = benlVar.c.a();
            benl.a(a2, 3);
            bgyb a3 = benlVar.d.a();
            benl.a(a3, 4);
            bepv a4 = benlVar.e.a();
            benl.a(a4, 5);
            beid a5 = benlVar.f.a();
            benl.a(a5, 6);
            beis a6 = benlVar.g.a();
            try {
                benl.a(a6, 7);
                beni a7 = benlVar.h.a();
                benl.a(a7, 8);
                Executor a8 = benlVar.i.a();
                benl.a(a8, 9);
                benl.a(string2, 11);
                benl.a(bwrsVar2, 12);
                benl.a(bwrsVar, 13);
                benl.a(string, 14);
                benk benkVar = new benk(ffVar, a, a2, a3, a4, a5, a6, a7, a8, j, string2, bwrsVar2, bwrsVar);
                this.aj = benkVar;
                benkVar.n();
                this.ag = this.aj;
                aT();
            } catch (IOException e) {
                e = e;
                bvoo.j(e);
            }
        } catch (IOException e2) {
            e = e2;
        }
    }
}
