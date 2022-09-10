package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: basp  reason: default package */
/* loaded from: classes3.dex */
class basp implements baqi {
    public final bakx a;
    public final drjs b;
    private final gga c;
    private final gdc d;
    @dzsi
    private final bruv e;

    public basp(gga ggaVar, bakx bakxVar, gdc gdcVar, drjs drjsVar, @dzsi bruv bruvVar) {
        this.c = ggaVar;
        this.a = bakxVar;
        this.d = gdcVar;
        this.b = drjsVar;
        this.e = bruvVar;
    }

    @Override // defpackage.baqi
    @dzsi
    public String a() {
        if (this.b.f.isEmpty()) {
            return null;
        }
        return this.b.f.get(0).a;
    }

    @Override // defpackage.baqi
    @dzsi
    public String b() {
        return null;
    }

    @Override // defpackage.baqi
    @dzsi
    public String c() {
        return null;
    }

    @Override // defpackage.baqi
    @dzsi
    public String d() {
        return null;
    }

    @Override // defpackage.baqi
    @dzsi
    public String e() {
        return null;
    }

    @Override // defpackage.baqi
    @dzsi
    public String f() {
        return null;
    }

    @Override // defpackage.baqi
    @dzsi
    public String g() {
        return null;
    }

    @Override // defpackage.baqi
    @dzsi
    public String h() {
        return null;
    }

    @Override // defpackage.baqi
    @dzsi
    public String i() {
        return null;
    }

    @Override // defpackage.baqi
    @dzsi
    public String j() {
        return null;
    }

    @Override // defpackage.baqi
    @dzsi
    public String k() {
        return null;
    }

    @Override // defpackage.baqi
    @dzsi
    public String l() {
        return null;
    }

    @Override // defpackage.baqi
    public String m() {
        return batk.a(this.c, this.b);
    }

    @Override // defpackage.baqi
    public cqkl n() {
        gga ggaVar = this.c;
        Toast.makeText(ggaVar, ggaVar.getText(R.string.RESERVATION_CONFIRMATION_CODE_COPIED_MESSAGE), 0).show();
        return cqkl.a;
    }

    @Override // defpackage.baqi
    public Boolean o() {
        return Boolean.valueOf(!this.b.g.isEmpty());
    }

    @Override // defpackage.baqi
    public cqkl p() {
        View findViewById;
        if (this.b.g.isEmpty()) {
            return cqkl.a;
        }
        gfk i = gfk.i(this.b.g.get(0).a, "mail");
        this.c.D(i);
        View view = i.P;
        if (view != null && (findViewById = view.findViewById(R.id.webview_container)) != null) {
            findViewById.addOnLayoutChangeListener(basf.a);
        }
        return cqkl.a;
    }

    @Override // defpackage.baqi
    public cqkl q() {
        gcz a = this.d.a();
        a.i(R.string.RESERVATION_HIDE_DIALOG_TITLE);
        a.d(R.string.RESERVATION_HIDE_DIALOG_MESSAGE);
        a.h(R.string.RESERVATION_HIDE_DIALOG_POSITIVE_BUTTON, cjtd.a(dtyd.dh), new gdd(this) { // from class: basg
            private final basp a;

            {
                this.a = this;
            }

            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
                basp baspVar = this.a;
                bakx bakxVar = baspVar.a;
                ((bakk) bakxVar).a.d(baspVar.b);
            }
        });
        a.e(R.string.RESERVATION_HIDE_DIALOG_NEGATIVE_BUTTON, cjtd.a(dtyd.df), bash.a);
        a.i = cjtd.a(dtyd.dg);
        a.b();
        return cqkl.a;
    }

    @Override // defpackage.baqi
    @dzsi
    public bruv r() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final String s(dqfu dqfuVar) {
        return dbsj.f(batk.j(this.c, dqfuVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final String t(dqfu dqfuVar) {
        return dbsj.f(batk.k(this.c, dqfuVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final String u(int i) {
        return dbsj.f(batk.h(this.c, i));
    }
}
