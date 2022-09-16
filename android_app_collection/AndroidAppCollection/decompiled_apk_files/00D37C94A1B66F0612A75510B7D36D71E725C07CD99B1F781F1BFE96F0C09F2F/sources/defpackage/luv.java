package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.ui.MultiPageMenuDialogFragmentController;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: luv  reason: default package */
/* loaded from: classes3.dex */
public final class luv extends fse implements View.OnClickListener, View.OnLongClickListener {
    public final atjf a;
    protected View b;
    protected ImageView c;
    protected Bitmap d;
    private final axnm e;
    private final dt f;
    private final LayoutInflater g;
    private final Resources h;
    private final ajmy i;
    private final afwc j;
    private final azqb k;
    private final ajxz l;
    private final acti m;
    private final yit n;
    private MenuItem o;
    private final MultiPageMenuDialogFragmentController p;
    private final lyb q;

    public luv(dt dtVar, ajmy ajmyVar, MultiPageMenuDialogFragmentController multiPageMenuDialogFragmentController, afwc afwcVar, azqb azqbVar, ajxz ajxzVar, axnm axnmVar, lya lyaVar, LayoutInflater layoutInflater, Resources resources, acti actiVar, atjf atjfVar) {
        this.f = dtVar;
        this.h = resources;
        this.g = layoutInflater;
        this.i = ajmyVar;
        this.e = axnmVar;
        this.p = multiPageMenuDialogFragmentController;
        this.j = afwcVar;
        this.k = azqbVar;
        this.l = ajxzVar;
        this.m = actiVar;
        this.a = atjfVar;
        this.q = lyaVar.b();
        this.n = yit.c(dtVar, new luu(this));
        this.d = BitmapFactory.decodeResource(resources, 2131232356);
        n();
    }

    private final void n() {
        avhn avhnVar;
        avhn avhnVar2;
        atjf atjfVar = this.a;
        if (atjfVar.c == 2) {
            avhnVar = (avhn) atjfVar.d;
        } else {
            avhnVar = avhn.a;
        }
        if (avhnVar.c.size() != 0) {
            atjf atjfVar2 = this.a;
            if (atjfVar2.c == 2) {
                avhnVar2 = (avhn) atjfVar2.d;
            } else {
                avhnVar2 = avhn.a;
            }
            this.i.l(Uri.parse(((avhm) avhnVar2.c.get(0)).c), this.n);
        }
        atjf atjfVar3 = this.a;
        if (atjfVar3.c == 1) {
            ajxz ajxzVar = this.l;
            arhr b = arhr.b(((arhs) atjfVar3.d).c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            int a = ajxzVar.a(b);
            if (this.o == null || this.b == null || a == 0) {
                return;
            }
            this.c.setImageResource(a);
            this.c.setColorFilter(zhn.j(this.f, R.attr.ytTextPrimary).orElse(0));
            this.o.setActionView(this.b);
        }
    }

    public final void a() {
        if (this.o == null || this.b == null) {
            return;
        }
        this.c.setImageDrawable(new BitmapDrawable(this.h, this.d));
        this.c.clearColorFilter();
        this.o.setActionView(this.b);
    }

    @Override // defpackage.fse
    public final int b() {
        return this.q.a + 1000;
    }

    @Override // defpackage.fse
    public final CharSequence c() {
        return this.h.getString(R.string.account);
    }

    @Override // defpackage.fry
    public final int g() {
        return this.q.a();
    }

    @Override // defpackage.fse, defpackage.fry
    public final int h() {
        return 0;
    }

    @Override // defpackage.fry
    public final frx i() {
        return null;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
        if (this.b == null) {
            this.b = this.g.inflate(R.layout.mobile_topbar_avatar_button, (ViewGroup) null, false);
        }
        this.c = (ImageView) this.b.findViewById(R.id.image);
        menuItem.setShowAsAction(2);
        this.c.setContentDescription(c());
        this.b.setOnClickListener(this);
        this.b.setOnLongClickListener(this);
        this.o = menuItem;
        a();
        final mes mesVar = (mes) this.k.get();
        mesVar.c(new zdt() { // from class: lut
            @Override // defpackage.zdt
            public final void a(Object obj) {
                luv luvVar = luv.this;
                mes mesVar2 = mesVar;
                Boolean bool = (Boolean) obj;
                if (bool == null || !bool.booleanValue()) {
                    return;
                }
                mesVar2.f(luvVar.c, luvVar.a);
            }
        });
        n();
        if ((this.a.b & 4096) != 0) {
            ((akfw) this.e.get()).d(this.a.j, this.b);
        }
    }

    @Override // defpackage.fry
    public final boolean l() {
        return false;
    }

    @Override // defpackage.fry
    public final boolean m() {
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MultiPageMenuDialogFragmentController multiPageMenuDialogFragmentController = this.p;
        atjf atjfVar = this.a;
        multiPageMenuDialogFragmentController.k();
        if (multiPageMenuDialogFragmentController.i() == null) {
            lpw lpwVar = new lpw();
            Bundle bundle = new Bundle();
            bundle.putByteArray("MenuButtonRendererKey", atjfVar.toByteArray());
            lpwVar.ae(bundle);
            lpwVar.aC();
            aqxo.y(true);
            multiPageMenuDialogFragmentController.j(lpwVar);
        }
        atjf atjfVar2 = this.a;
        if ((atjfVar2.b & 32) != 0) {
            this.m.H(3, new acte(atjfVar2.g.I()), null);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.j.c(this.f, this.a.g.I(), null);
        atjf atjfVar = this.a;
        if ((atjfVar.b & 32) != 0) {
            this.m.H(1025, new acte(atjfVar.g.I()), null);
            return false;
        }
        return false;
    }
}
