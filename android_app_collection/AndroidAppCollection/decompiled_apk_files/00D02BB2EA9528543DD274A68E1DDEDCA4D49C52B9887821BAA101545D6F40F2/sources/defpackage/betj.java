package defpackage;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: betj  reason: default package */
/* loaded from: classes3.dex */
public class betj implements betb {
    @dzsi
    public final beqn a;
    public final ilo b;
    public final ccln c;
    public boolean d = false;
    public boolean e = true;
    public final bvrb f;
    private final gga g;
    private final dxio<akfa> h;
    private final akfc i;
    private final cztz j;
    private final beti k;
    private final int l;
    private final dkik m;
    private final beth n;

    public betj(gga ggaVar, cqhn cqhnVar, bvrb bvrbVar, dxio<akfa> dxioVar, akfc akfcVar, cztz cztzVar, ilo iloVar, ccln cclnVar, @dzsi beqn beqnVar, btvo btvoVar, int i) {
        beth bethVar = new beth(this);
        this.n = bethVar;
        this.g = ggaVar;
        this.c = cclnVar;
        this.b = iloVar;
        this.f = bvrbVar;
        this.h = dxioVar;
        this.i = akfcVar;
        this.j = cztzVar;
        this.l = i;
        this.a = beqnVar;
        if (beqnVar != null) {
            beqnVar.a(new beqj(beqnVar, bethVar, cclnVar, iloVar));
        }
        this.k = new beti(this);
        this.m = btvoVar.getDealsParameters().d();
    }

    @Override // defpackage.betb
    public cqtd a() {
        if (this.d) {
            return cqrt.g(2131232181, ibm.N());
        }
        return cqrt.g(2131232182, ibm.x());
    }

    @Override // defpackage.betb
    public cqkl b() {
        if (this.h.a().j() != null) {
            btlu j = this.h.a().j();
            dbsk.s(j);
            if (j.u()) {
                beqn beqnVar = this.a;
                if (beqnVar != null && !this.e) {
                    if (this.d) {
                        beqnVar.a(new beql(beqnVar, this.c, this.b));
                        this.j.d(this.g.getWindowManager(), true);
                        cztq a = cztt.a(this.j);
                        a.e(R.string.OFFER_UNSAVED_TOAST_MESSAGE, new Object[0]);
                        a.f(this.g.getString(R.string.UNDO), this.k);
                        cztt b = a.b();
                        View findViewById = b.b.findViewById(R.id.toastbar_message);
                        if (findViewById instanceof TextView) {
                            findViewById.setClickable(false);
                            findViewById.setLongClickable(false);
                        }
                        b.b();
                    } else {
                        beqnVar.d(this.c, this.b);
                        gga ggaVar = this.g;
                        btlu j2 = this.h.a().j();
                        dbsk.s(j2);
                        Toast.makeText(ggaVar, ggaVar.getString(R.string.OFFER_SAVED_TOAST_MESSAGE, new Object[]{j2.s().name}), 1).show();
                    }
                    this.d = !this.d;
                    cqkx.p(this);
                }
                return cqkl.a;
            }
        }
        this.i.a(akeu.j(bete.a).b());
        return cqkl.a;
    }

    @Override // defpackage.betb
    @dzsi
    public cjtd c() {
        cjta b = cjtd.b();
        b.d = this.d ? dtxy.hW : dtxy.hV;
        return b.a();
    }

    @Override // defpackage.betb
    public CharSequence d() {
        gga ggaVar;
        int i;
        if (this.d) {
            ggaVar = this.g;
            i = R.string.SAVED;
        } else {
            ggaVar = this.g;
            i = R.string.LOCALSTREAM_OFFER_BADGE_TEXT;
        }
        return ggaVar.getText(i);
    }

    @Override // defpackage.betb
    @dzsi
    public cqss e() {
        if (this.d) {
            return ibm.J();
        }
        return null;
    }

    @Override // defpackage.betb
    @dzsi
    public cqss f() {
        if (this.d) {
            return ibm.J();
        }
        return null;
    }

    @Override // defpackage.betb
    public cqtd g() {
        if (this.d) {
            return cqtt.l(ibm.J(), cqrp.f(10.0d));
        }
        return cqtt.l(ibm.N(), cqrp.f(10.0d));
    }

    @Override // defpackage.betb
    public cqss h() {
        return this.d ? ibm.N() : ibm.b();
    }

    @Override // defpackage.betb
    public CharSequence i() {
        if (this.d) {
            return this.g.getString(R.string.OFFER_SAVED_CONTENT_DESCRIPTION, new Object[]{Integer.valueOf(this.l + 1)});
        }
        return this.g.getString(R.string.OFFER_SAVE_CONTENT_DESCRIPTION, new Object[]{Integer.valueOf(this.l + 1)});
    }

    @Override // defpackage.betb
    public CharSequence j() {
        gga ggaVar;
        int i;
        if (this.d) {
            ggaVar = this.g;
            i = R.string.SAVED;
        } else {
            ggaVar = this.g;
            i = R.string.SAVE;
        }
        return ggaVar.getText(i);
    }

    @Override // defpackage.betb
    public dkik k() {
        return this.m;
    }
}
