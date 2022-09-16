package defpackage;

import android.app.AlertDialog;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bixn  reason: default package */
/* loaded from: classes3.dex */
public class bixn implements biwm, bega {
    public static final dcqe a = dcqe.c("bixn");
    public final boxa b;
    public final cjqy c;
    @dzsi
    public bwrs<ilo> d;
    private final gga e;
    private final akfa f;
    private final bwqv g;
    private final btvo h;
    private boolean i = false;
    private String j = "";
    private boolean k;
    private boolean l;
    @dzsi
    private cjtd m;
    @dzsi
    private bgvz n;

    public bixn(gga ggaVar, boxa boxaVar, cjqy cjqyVar, akfa akfaVar, bwqv bwqvVar, btvo btvoVar, bhat bhatVar, dxio<bgvz> dxioVar) {
        this.e = ggaVar;
        this.b = boxaVar;
        this.c = cjqyVar;
        this.f = akfaVar;
        this.g = bwqvVar;
        this.h = btvoVar;
    }

    @Override // defpackage.biwm
    public Boolean a() {
        return Boolean.valueOf(this.k);
    }

    @Override // defpackage.biwm
    public Boolean b() {
        return Boolean.valueOf(this.l);
    }

    @Override // defpackage.biwm
    public Boolean c() {
        doav cx;
        int a2;
        ilo iloVar = (ilo) bwrs.b(this.d);
        boolean z = true;
        if (iloVar != null && (cx = iloVar.cx()) != null && (a2 = doau.a(cx.b)) != 0 && a2 == 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.biwm
    public Boolean d() {
        boolean z = false;
        if (this.i && c().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.biwm
    @dzsi
    public bgvz e() {
        boolean z = this.i;
        return null;
    }

    @Override // defpackage.biwm
    @dzsi
    public cjtd f() {
        return this.m;
    }

    @Override // defpackage.biwm
    public String g() {
        if (!j().booleanValue()) {
            return a().booleanValue() ? this.e.getString(R.string.PLACE_STATUS_CLOSED) : "";
        } else if (this.k) {
            return this.e.getString(R.string.PLACE_STATUS_CLOSED);
        } else {
            return this.e.getString(R.string.PLACE_STATUS_TEMPORARILY_CLOSED);
        }
    }

    @Override // defpackage.biwm
    public String h() {
        if (j().booleanValue()) {
            if (a().booleanValue()) {
                return this.e.getString(R.string.PLACE_PERMANENTLY_CLOSED_SUGGEST_EDIT_INFO, new Object[]{this.j});
            }
            return this.e.getString(R.string.PLACE_TEMPORARILY_CLOSED_SUGGEST_EDIT_INFO, new Object[]{this.j});
        }
        return this.e.getString(R.string.PLACE_PERMANENTLY_CLOSED_INFO, new Object[]{this.j});
    }

    @Override // defpackage.biwm
    public String i() {
        if (j().booleanValue()) {
            return this.e.getString(R.string.PLACE_SUGGEST_EDIT_EXPANDO_BUTTON);
        }
        return this.e.getString(R.string.PLACE_REOPEN_BUTTON).toUpperCase(Locale.getDefault());
    }

    @Override // defpackage.biwm
    public Boolean j() {
        return Boolean.valueOf(this.h.getUgcParameters().ac());
    }

    @Override // defpackage.biwm
    public cqkl k() {
        String string;
        String string2;
        if (!c().booleanValue()) {
            return cqkl.a;
        }
        if (!this.f.c()) {
            this.e.D(akef.i(this.g, new bixj(), R.string.RAP_AAP_LOGIN_SCREEN_TITLE, R.string.RAP_AAP_LOGIN_SCREEN_SUBTITLE));
        } else {
            if (j().booleanValue()) {
                if (this.k) {
                    string = this.e.getString(R.string.PLACE_REOPEN_ALERT_MESSAGE_PERMANENTLY_CLOSED, new Object[]{this.j});
                } else {
                    string = this.e.getString(R.string.PLACE_REOPEN_ALERT_MESSAGE_TEMPORARILY_CLOSED, new Object[]{this.j});
                }
                string2 = this.e.getString(R.string.PLACE_REOPEN_ALERT_REOPEN_BUTTON);
            } else {
                string = this.e.getString(R.string.PLACE_REOPEN_ALERT_MESSAGE, new Object[]{this.j});
                string2 = this.e.getString(R.string.PLACE_REOPEN_ALERT_SEND_BUTTON);
            }
            new AlertDialog.Builder(this.e).setTitle(R.string.PLACE_REOPEN_ALERT_HEADER).setMessage(string).setNegativeButton(R.string.PLACE_REOPEN_ALERT_CANCEL_BUTTON, new bixm()).setPositiveButton(string2, new bixl(this)).setOnCancelListener(new bixk(this)).show();
        }
        return cqkl.a;
    }

    @Override // defpackage.biwm
    public cqkl l() {
        if (!c().booleanValue()) {
            return cqkl.a;
        }
        this.i = !this.i;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        String q;
        this.d = bwrsVar;
        ilo c = bwrsVar.c();
        if (c == null) {
            bvoo.h("Placemark should not be null", new Object[0]);
            return;
        }
        this.k = c.an();
        this.l = c.ao();
        this.n = null;
        if (c.bi()) {
            q = this.e.getString(R.string.ALIAS_BUSINESS_PLACE_TITLE, new Object[]{c.bh(), c.n()});
        } else {
            q = c.q();
        }
        this.j = q;
        String str = c.a().e;
        cjta b = cjtd.b();
        b.d = dtya.O;
        b.b = str;
        this.m = b.a();
    }

    @Override // defpackage.bega
    public void u() {
        this.d = null;
        this.k = false;
        this.l = false;
        this.n = null;
        this.j = "";
        this.m = null;
        this.i = false;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return a();
    }
}
