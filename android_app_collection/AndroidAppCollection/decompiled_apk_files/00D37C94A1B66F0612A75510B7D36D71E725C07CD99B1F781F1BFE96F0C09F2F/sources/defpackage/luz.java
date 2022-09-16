package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: luz  reason: default package */
/* loaded from: classes3.dex */
public final class luz extends fse implements frx, yff {
    private final Context a;
    private final LayoutInflater b;
    private final arhm c;
    private final yfk d;
    private final acti e;
    private View f;
    private yfj g;
    private final lyb h;

    public luz(lya lyaVar, Context context, yfk yfkVar, acti actiVar, arhm arhmVar) {
        this.a = context;
        this.b = LayoutInflater.from(context);
        this.d = yfkVar;
        this.e = actiVar;
        this.c = arhmVar;
        this.h = lyaVar.b();
    }

    private final void o(boolean z) {
        zag.o(this.f, z);
    }

    @Override // defpackage.frx
    public final void a(yzh yzhVar, int i) {
        yfj yfjVar;
        if (i != zhn.d(this.a, R.attr.ytIconActiveOther) || (yfjVar = this.g) == null) {
            yfj yfjVar2 = this.g;
            if (yfjVar2 == null) {
                return;
            }
            yfjVar2.k(yzhVar.b(yfjVar2.f(), i));
            return;
        }
        yfjVar.k(yzhVar.b(yfjVar.f(), zhn.d(this.a, R.attr.ytTextPrimary)));
    }

    @Override // defpackage.fse
    public final int b() {
        return this.h.a + 1000;
    }

    @Override // defpackage.fse
    public final CharSequence c() {
        aovr aovrVar = this.c.i;
        if (aovrVar == null) {
            aovrVar = aovr.a;
        }
        if ((aovrVar.b & 2) != 0) {
            aovr aovrVar2 = this.c.i;
            if (aovrVar2 == null) {
                aovrVar2 = aovr.a;
            }
            return aovrVar2.c;
        }
        return null;
    }

    @Override // defpackage.fry
    public final int g() {
        return this.h.a();
    }

    @Override // defpackage.fry
    public final frx i() {
        return this;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
        if (this.f == null) {
            this.f = this.b.inflate(R.layout.mobile_topbar_icon_badge_item, (ViewGroup) null, false);
        }
        if (this.g == null) {
            this.g = this.d.a((ViewStub) this.f.findViewById(R.id.icon_badge));
        }
        ajrs ajrsVar = new ajrs();
        ajrsVar.a(this.e);
        this.g.oK(ajrsVar, this.c);
        if (!this.c.c.isEmpty()) {
            this.g.j(this);
        }
        o(this.c.f);
        menuItem.setShowAsAction(2);
        menuItem.setActionView(this.f);
    }

    @Override // defpackage.fry
    public final boolean l() {
        return true;
    }

    @Override // defpackage.fry
    public final boolean m() {
        return false;
    }

    @Override // defpackage.yff
    public final void n(arhk arhkVar) {
        yfj yfjVar = this.g;
        if (yfjVar == null || !yfjVar.m(arhkVar)) {
            return;
        }
        o(arhkVar.getIsVisible().booleanValue());
    }
}
