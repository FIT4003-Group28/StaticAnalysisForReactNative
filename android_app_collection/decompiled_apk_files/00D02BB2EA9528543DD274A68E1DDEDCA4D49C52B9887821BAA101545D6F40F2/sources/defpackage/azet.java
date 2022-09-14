package defpackage;

import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: azet  reason: default package */
/* loaded from: classes3.dex */
public class azet implements azef {
    public final gga a;
    public final ayay b;
    public final aydl c;
    public final axyz d;
    public final dxio<bwft> e;
    public baad f;
    @dzsi
    public azee g = null;
    private final bvrb h;
    private final dxio<cqkj> i;
    private final dxio<axwi> j;
    private final cztz k;
    private final axwg l;
    private final caxd m;
    private final axze n;

    public azet(gga ggaVar, bvrb bvrbVar, dxio<cqkj> dxioVar, cztz cztzVar, dxio<axwi> dxioVar2, ayay ayayVar, axwg axwgVar, caxe caxeVar, aydl aydlVar, axyz axyzVar, axze axzeVar, dxio<bwft> dxioVar3, baad baadVar) {
        this.a = ggaVar;
        this.h = bvrbVar;
        this.i = dxioVar;
        this.k = cztzVar;
        this.j = dxioVar2;
        this.b = ayayVar;
        this.l = axwgVar;
        this.m = caxeVar;
        this.c = aydlVar;
        this.d = axyzVar;
        this.n = axzeVar;
        this.e = dxioVar3;
        this.f = baadVar;
    }

    private final azee t() {
        if (this.f.w()) {
            if (!this.f.w() || this.f.x()) {
                if (this.f.x()) {
                    return azee.PUBLISHED;
                }
                throw new AssertionError();
            }
            return azee.SHARED;
        }
        return azee.PRIVATE;
    }

    private final dehn<baad> u(dehn<baad> dehnVar) {
        ProgressDialog progressDialog = new ProgressDialog(this.a, 0);
        progressDialog.setMessage(this.a.getString(R.string.SAVING));
        progressDialog.show();
        deig d = deig.d();
        deha.q(dehnVar, new azes(this, progressDialog, d), this.h.h());
        return d;
    }

    @Override // defpackage.azef
    public Boolean a(azee azeeVar) {
        azee azeeVar2 = this.g;
        boolean z = true;
        if (azeeVar2 != null) {
            if (azeeVar2 != azeeVar) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (azeeVar != t()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.azef
    public cqkl b(final azee azeeVar) {
        if (!azeeVar.equals(t()) && this.g == null) {
            this.g = azeeVar;
            cqkx.p(this);
            if (azeeVar == azee.PRIVATE) {
                final Runnable runnable = new Runnable(this, azeeVar) { // from class: azek
                    private final azet a;
                    private final azee b;

                    {
                        this.a = this;
                        this.b = azeeVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.r(this.b);
                    }
                };
                final Runnable runnable2 = new Runnable(this) { // from class: azel
                    private final azet a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.g = null;
                    }
                };
                iii iiiVar = new iii();
                iiiVar.a = this.a.getString(R.string.MAKE_LIST_PRIVATE_CONFIRM_DIALOG_TITLE);
                iiiVar.b = this.a.getString(R.string.MAKE_LIST_PRIVATE_CONFIRM_DIALOG_TEXT);
                iiiVar.d(this.a.getString(R.string.OK_BUTTON), new View.OnClickListener(runnable) { // from class: azeo
                    private final Runnable a;

                    {
                        this.a = runnable;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.run();
                    }
                }, cjtd.a(dtxy.eU));
                iiiVar.c(this.a.getString(R.string.CANCEL_BUTTON), new View.OnClickListener(this, runnable2) { // from class: azep
                    private final azet a;
                    private final Runnable b;

                    {
                        this.a = this;
                        this.b = runnable2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        azet azetVar = this.a;
                        this.b.run();
                        cqkx.p(azetVar);
                    }
                }, cjtd.a(dtxy.eT));
                iiiVar.b();
                iiiVar.a(this.a, this.i.a()).k();
            } else {
                r(azeeVar);
            }
            return cqkl.a;
        }
        return cqkl.a;
    }

    @Override // defpackage.azef
    @dzsi
    public cjtd c(azee azeeVar) {
        azee azeeVar2 = azee.PRIVATE;
        int ordinal = azeeVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return cjtd.a(dtxy.eS);
            }
            if (ordinal == 2) {
                return cjtd.a(dtxy.eP);
            }
            return null;
        }
        return cjtd.a(dtxy.eO);
    }

    @Override // defpackage.azef
    public Boolean d() {
        return Boolean.valueOf(this.f.w());
    }

    @Override // defpackage.azef
    public Boolean e() {
        boolean z = false;
        if (this.l.e() && this.f.w()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.caxc
    public caxd f() {
        return this.m;
    }

    @Override // defpackage.azef
    public Boolean g() {
        return Boolean.valueOf(this.l.e());
    }

    @Override // defpackage.azef
    @dzsi
    public String h() {
        return this.f.u();
    }

    @Override // defpackage.azef
    public cqkl i() {
        bvrj.UI_THREAD.c();
        String h = h();
        if (h != null && !h.isEmpty()) {
            ((ClipboardManager) this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", h));
            cztq a = cztt.a(this.k);
            a.c = this.a.getString(R.string.LIST_SHARING_URL_COPIED_TOAST);
            a.d(cztr.LONG);
            a.c();
        }
        return cqkl.a;
    }

    @Override // defpackage.azef
    public Boolean j() {
        return Boolean.valueOf(this.f.C());
    }

    @Override // defpackage.azef
    public cjtd k() {
        return cjtd.a(dtxy.eN);
    }

    @Override // defpackage.azef
    public Boolean l() {
        return Boolean.valueOf(this.f.D());
    }

    @Override // defpackage.azef
    public cqkl m() {
        final boolean z = !this.f.C();
        if (!this.f.C() || !o().c().booleanValue()) {
            q(z);
        } else {
            final Runnable runnable = new Runnable(this, z) { // from class: azen
                private final azet a;
                private final boolean b;

                {
                    this.a = this;
                    this.b = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.q(this.b);
                }
            };
            iii iiiVar = new iii();
            iiiVar.a = this.a.getString(R.string.REMOVE_ALL_EDITORS_ALERT_TITLE);
            iiiVar.b = this.a.getString(R.string.REMOVE_ALL_EDITORS_ALERT_MESSAGE);
            iiiVar.d(this.a.getString(R.string.OK_BUTTON), new View.OnClickListener(runnable) { // from class: azeq
                private final Runnable a;

                {
                    this.a = runnable;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.run();
                }
            }, cjtd.a(dtxy.eR));
            iiiVar.c(this.a.getString(R.string.CANCEL_BUTTON), new View.OnClickListener(this) { // from class: azei
                private final azet a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cqkx.p(this.a);
                }
            }, cjtd.a(dtxy.eQ));
            iiiVar.b();
            iiiVar.a(this.a, this.i.a()).k();
        }
        return cqkl.a;
    }

    @Override // defpackage.azef
    public String n() {
        return this.f.O();
    }

    @Override // defpackage.azef
    public aydl o() {
        baad baadVar = this.f;
        if (baadVar == null || !baadVar.C()) {
            return this.c;
        }
        this.c.i(true);
        this.c.h(this.f.N());
        this.n.a(this.f.n(), new dbsz(this) { // from class: azeh
            private final azet a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                azet azetVar = this.a;
                azetVar.c.j((List) obj);
                cqkx.p(azetVar);
            }
        }, new dbty(this) { // from class: azej
            private final azet a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(cqkx.l(this.a).iterator().hasNext());
            }
        });
        return this.c;
    }

    @Override // defpackage.azef
    public cqkl p() {
        bvrj.UI_THREAD.c();
        if (dbsj.d(this.f.v())) {
            deha.q(u(this.j.a().m(this.f, dpqn.WRITABLE_ENTITY_LIST)), bvqj.b(new bvqg(this) { // from class: azem
                private final azet a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    azet azetVar = this.a;
                    baad baadVar = (baad) obj;
                    azetVar.e.a().i(azetVar.f, dtxy.eL);
                }
            }), this.h.h());
        } else {
            this.e.a().i(this.f, dtxy.eL);
        }
        return cqkl.a;
    }

    public final void q(boolean z) {
        dpqn dpqnVar;
        axwi a = this.j.a();
        baad baadVar = this.f;
        if (z) {
            dpqnVar = dpqn.WRITABLE_ENTITY_LIST;
        } else if (baadVar.w()) {
            dpqnVar = dpqn.READABLE_ENTITY_LIST;
        } else {
            dpqnVar = dpqn.PRIVATE_ENTITY_LIST;
        }
        deha.q(u(a.m(baadVar, dpqnVar)), new azer(this, z), this.h.h());
    }

    public final void r(azee azeeVar) {
        dehn<baad> m;
        azee t = t();
        azee azeeVar2 = azee.PRIVATE;
        int ordinal = azeeVar.ordinal();
        if (ordinal == 0) {
            m = this.j.a().m(this.f, dpqn.PRIVATE_ENTITY_LIST);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                m = this.j.a().s(this.f, 3);
            }
            m = deha.b(new IllegalStateException("Fail to issue share request."));
        } else if (t == azee.PRIVATE) {
            m = this.j.a().m(this.f, dpqn.READABLE_ENTITY_LIST);
        } else {
            if (t == azee.PUBLISHED) {
                m = this.j.a().s(this.f, 2);
            }
            m = deha.b(new IllegalStateException("Fail to issue share request."));
        }
        u(m);
    }

    public final void s(ProgressDialog progressDialog) {
        this.g = null;
        progressDialog.dismiss();
        cqkx.p(this);
    }
}
