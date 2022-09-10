package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bijk  reason: default package */
/* loaded from: classes3.dex */
public abstract class bijk implements bijd {
    protected final bije a;
    protected final gga b;
    public final cjqq c;
    public final buzn d;
    public boolean e = true;
    public boolean f = false;
    private final cjqy g;
    private final dxio<axwy> h;
    private final axxe i;

    /* JADX INFO: Access modifiers changed from: protected */
    public bijk(bijz bijzVar, gga ggaVar, cjqy cjqyVar, cjqq cjqqVar, buzn buznVar, dxio<axwy> dxioVar, @dzsi axxe axxeVar) {
        this.a = bijzVar;
        this.b = ggaVar;
        this.g = cjqyVar;
        this.c = cjqqVar;
        this.h = dxioVar;
        this.i = axxeVar;
        this.d = buznVar;
    }

    protected int A() {
        return R.string.PERSONAL_INTELLIGENCE_DISMISS_RESERVATION_ERROR_TEXT;
    }

    @Override // defpackage.bijd
    public Boolean j() {
        return Boolean.valueOf(!dbsj.d(v()));
    }

    @Override // defpackage.bijd
    public Boolean k() {
        return Boolean.valueOf(this.i != null);
    }

    @Override // defpackage.bijd
    @dzsi
    public String l() {
        if (k().booleanValue()) {
            return this.i.a().c;
        }
        return null;
    }

    @Override // defpackage.bijd
    public cqkl m() {
        View findViewById;
        gfk i = gfk.i(v(), "mail");
        this.b.D(i);
        View view = i.P;
        if (view != null && (findViewById = view.findViewById(R.id.webview_container)) != null) {
            findViewById.addOnLayoutChangeListener(bijg.a);
        }
        return cqkl.a;
    }

    @Override // defpackage.bijd
    public cqkl n() {
        this.h.a().B(this.i);
        return cqkl.a;
    }

    @Override // defpackage.bijd
    public Boolean o() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.bijd
    public Boolean p() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.bijd
    @dzsi
    public jht r() {
        if (q().isEmpty()) {
            return null;
        }
        jhu h = jhv.h();
        jhm a = jhm.a();
        a.a = this.b.getString(R.string.PERSONAL_INTELLIGENCE_DISMISS_TEXT);
        a.d(new View.OnClickListener(this) { // from class: bijh
            private final bijk a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final bijk bijkVar = this.a;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(bijkVar) { // from class: biji
                    private final bijk a;

                    {
                        this.a = bijkVar;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        bijk bijkVar2 = this.a;
                        if (i != -1) {
                            if (i != -2) {
                                return;
                            }
                            bijkVar2.w(dtxy.kR);
                            return;
                        }
                        bijkVar2.f = true;
                        bijkVar2.e = false;
                        String q = bijkVar2.q();
                        dwdn bZ = dwdp.d.bZ();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dwdp dwdpVar = (dwdp) bZ.b;
                        q.getClass();
                        dwdpVar.a |= 1;
                        dwdpVar.b = q;
                        dwdp dwdpVar2 = (dwdp) bZ.b;
                        dwdpVar2.c = 1;
                        dwdpVar2.a |= 2;
                        dwdp bK = bZ.bK();
                        dwdj bZ2 = dwdk.c.bZ();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dwdk dwdkVar = (dwdk) bZ2.b;
                        bK.getClass();
                        dwdkVar.b = bK;
                        dwdkVar.a = 1 | dwdkVar.a;
                        bijkVar2.d.a(bZ2.bK(), new bijj(bijkVar2, q), bvrj.UI_THREAD);
                        cqkx.p(bijkVar2);
                        bijkVar2.w(dtxy.kS);
                    }
                };
                cjqp g = bijkVar.c.g();
                cjta b = cjtd.b();
                b.d = dtxy.kQ;
                g.d(b.a());
                new AlertDialog.Builder(bijkVar.b).setTitle(bijkVar.y()).setMessage(bijkVar.z()).setPositiveButton(R.string.PERSONAL_INTELLIGENCE_DISMISS_TEXT, onClickListener).setNegativeButton(R.string.CANCEL_BUTTON, onClickListener).show();
            }
        });
        a.f = cjtd.a(dtxy.kT);
        h.d(a.c());
        ((jhi) h).e = this.b.getString(R.string.ACCESSIBILITY_PLACE_OVERFLOW_MENU_DESCRIPTION, new Object[]{u()});
        h.c(cjtd.a(dtxy.kV));
        return h.b();
    }

    @dzsi
    public abstract String u();

    @dzsi
    public abstract String v();

    public final void w(ddho ddhoVar) {
        this.g.i(cjtd.a(ddhoVar));
    }

    public final void x() {
        this.f = false;
        this.e = true;
        Toast.makeText(this.b, A(), 1).show();
        cqkx.p(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int y() {
        return R.string.PERSONAL_INTELLIGENCE_DISMISS_RESERVATION_DIALOG_TITLE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int z() {
        return R.string.PERSONAL_INTELLIGENCE_DISMISS_RESERVATION_DIALOG_INFO;
    }
}
