package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: pow  reason: default package */
/* loaded from: classes7.dex */
public class pow implements pov {
    private final Runnable a;
    private final Runnable b;
    private final dvdy c;
    private final Resources d;
    private boolean e = true;

    public pow(dvdy dvdyVar, Resources resources, cqhn cqhnVar, Runnable runnable, Runnable runnable2) {
        this.c = dvdyVar;
        this.d = resources;
        this.a = runnable;
        this.b = runnable2;
    }

    @Override // defpackage.pov
    public cqkl a() {
        this.b.run();
        return cqkl.a;
    }

    @Override // defpackage.pov
    public cqkl b() {
        this.a.run();
        return cqkl.a;
    }

    @Override // defpackage.pov
    public jic c() {
        return new jic(this.c.g, ckqc.FULLY_QUALIFIED, 0);
    }

    @Override // defpackage.pov
    public CharSequence d() {
        return this.c.c;
    }

    @Override // defpackage.pov
    @dzsi
    public CharSequence e() {
        dvdy dvdyVar = this.c;
        if ((dvdyVar.a & 16) != 0) {
            return dvdyVar.d;
        }
        return null;
    }

    @Override // defpackage.pov
    public CharSequence f() {
        dvdy dvdyVar = this.c;
        return (dvdyVar.a & 256) != 0 ? dvdyVar.f : this.d.getString(R.string.CUSTOM_CHEVRON_PROMO_DEFAULT_ACCEPT_BUTTON_TEXT);
    }

    @Override // defpackage.pov
    public CharSequence g() {
        dvdy dvdyVar = this.c;
        return (dvdyVar.a & 64) != 0 ? dvdyVar.e : this.d.getString(R.string.NO_THANKS);
    }

    @Override // defpackage.pov
    @dzsi
    public cjtd h() {
        if (k().booleanValue()) {
            return null;
        }
        return cjtd.a(dtxl.it);
    }

    @Override // defpackage.pov
    @dzsi
    public cjtd i() {
        return cjtd.a(dtxl.iu);
    }

    @Override // defpackage.pov
    @dzsi
    public cjtd j() {
        return cjtd.a(dtxl.iv);
    }

    @Override // defpackage.pov
    public Boolean k() {
        return Boolean.valueOf(this.e);
    }

    public void l(boolean z) {
        this.e = false;
        cqkx.p(this);
    }
}
