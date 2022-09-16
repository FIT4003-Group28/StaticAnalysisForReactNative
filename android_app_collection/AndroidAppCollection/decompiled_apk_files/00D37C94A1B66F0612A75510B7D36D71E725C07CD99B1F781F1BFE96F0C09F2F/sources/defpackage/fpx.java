package defpackage;

import android.text.Spanned;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.common.tvfilm.RentalActivationOverlay;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fpx  reason: default package */
/* loaded from: classes3.dex */
public final class fpx extends fdm implements ynl {
    private final RentalActivationOverlay a;
    private final yni b;
    private final airw c;
    private final aypf d;
    private boolean e;
    private final aacz f;

    public fpx(feh fehVar, RentalActivationOverlay rentalActivationOverlay, yni yniVar, airw airwVar, aacz aaczVar) {
        super(fehVar);
        rentalActivationOverlay.getClass();
        this.a = rentalActivationOverlay;
        this.b = yniVar;
        this.c = airwVar;
        this.f = aaczVar;
        this.d = new aypf();
    }

    public final void a(ahhm ahhmVar) {
        PlayerResponseModel b = ahhmVar.b();
        if (b == null) {
            return;
        }
        asaa asaaVar = b.a.f;
        if (asaaVar == null) {
            asaaVar = asaa.a;
        }
        asar asarVar = asaaVar.m;
        if (asarVar == null) {
            asarVar = asar.a;
        }
        if (((asarVar.b == 86428467 ? (awip) asarVar.c : awip.a).b & 4) == 0 || this.e) {
            return;
        }
        RentalActivationOverlay rentalActivationOverlay = this.a;
        asar asarVar2 = asaaVar.m;
        if (asarVar2 == null) {
            asarVar2 = asar.a;
        }
        arag aragVar = (asarVar2.b == 86428467 ? (awip) asarVar2.c : awip.a).c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        Spanned b2 = ajgl.b(aragVar);
        if (rentalActivationOverlay.a == null) {
            rentalActivationOverlay.a = (YouTubeTextView) LayoutInflater.from(rentalActivationOverlay.getContext()).inflate(R.layout.rental_activation_overlay, rentalActivationOverlay).findViewById(R.id.rental_activation_message);
            rentalActivationOverlay.h();
        }
        rentalActivationOverlay.a.setText(b2);
        rentalActivationOverlay.h();
    }

    public final void d(ahia ahiaVar) {
        boolean z = ahiaVar.a() == 2;
        this.e = z;
        if (z) {
            this.a.g();
        }
    }

    public final void e() {
        this.a.g();
    }

    @Override // defpackage.feg
    public final void kF() {
        if (eog.aq(this.f)) {
            this.d.c();
        } else {
            this.b.m(this);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ahhk ahhkVar = (ahhk) obj;
                e();
                return null;
            } else if (i == 1) {
                a((ahhm) obj);
                return null;
            } else if (i == 2) {
                d((ahia) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhk.class, ahhm.class, ahia.class};
    }

    @Override // defpackage.feg
    public final void nr() {
        if (eog.aq(this.f)) {
            aypf aypfVar = this.d;
            airw airwVar = this.c;
            aypfVar.g(airwVar.al().aa(new fpw(this, 1), dzq.r), airwVar.ao().I().G(aypa.a()).aa(new fpw(this), dzq.r), airwVar.G().j.aa(new fpw(this, 2), dzq.r));
            return;
        }
        this.b.g(this);
    }
}
