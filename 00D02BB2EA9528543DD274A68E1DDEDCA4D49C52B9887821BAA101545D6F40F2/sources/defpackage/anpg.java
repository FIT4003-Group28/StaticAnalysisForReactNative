package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: anpg  reason: default package */
/* loaded from: classes2.dex */
public final class anpg extends ggo {
    public gfq al;
    public bwqv am;
    public dxio<hwe> an;
    public dxio<bgea> ao;
    public Executor ap;
    @dzsi
    btzc aq;
    public bupz ar;

    private final void bE(akqq akqqVar) {
        by(true);
        bz(false);
        bx();
        btzc btzcVar = this.aq;
        if (btzcVar != null) {
            btzcVar.a();
        }
        dwcv a = this.ao.a().a(akqqVar);
        if (a.c) {
            a.bF();
            a.c = false;
        }
        dwcw dwcwVar = (dwcw) a.b;
        dwcw dwcwVar2 = dwcw.p;
        dwcwVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        dwcwVar.o = true;
        this.aq = this.ar.b(a.bK(), new anpe(this), this.ap);
        this.ak = this.an.a().i(akpp.o(akqqVar), true);
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof bhwt) {
            bhwt bhwtVar = (bhwt) obj;
            if (bhwtVar.b != 1) {
                return;
            }
            Nw(bhwtVar.a);
            gfq.m(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    public final void aX() {
        dbsk.s(this.ag);
        if (this.ag.ce() != doay.TYPE_GEOCODED_ADDRESS && this.ag.aj() == null) {
            return;
        }
        aZ(bhul.i(this.am, bwrs.a(this.ag)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    public final boolean bB(alhr alhrVar) {
        if (!this.aD) {
            return false;
        }
        bE(alhrVar.a.S());
        return true;
    }

    public final void bD() {
        Toast.makeText(J(), Rp(R.string.LOCATION_DATA_ERROR), 0).show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    public final String g() {
        return Rp(R.string.MAPS_ACTIVITY_CREATE_A_PERSONAL_PLACE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    public final String i() {
        return Rp(R.string.MAPS_ACTIVITY_PERSONAL_PLACE_HINT_PICK_LOCATION);
    }

    @Override // defpackage.ggo, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        akqq aj = this.ag.aj();
        if (aj != null) {
            bE(aj);
        }
    }

    @Override // defpackage.ggo
    protected final String w() {
        return Rp(R.string.NEXT_BUTTON);
    }
}
