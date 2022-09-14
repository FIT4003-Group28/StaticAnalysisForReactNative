package defpackage;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdun  reason: default package */
/* loaded from: classes3.dex */
public class bdun implements bduj {
    public final dxio<bbul> b;
    public final dxio<gdc> c;
    public final dxio<cjqy> d;
    private final ConnectivityManager f;
    private final dxio<btvo> g;
    private final cjnf h;
    private boolean i;
    @dzsi
    public View e = null;
    private final View.OnAttachStateChangeListener j = new bdum(this);

    public bdun(Application application, dxio<btvo> dxioVar, dxio<bbul> dxioVar2, dxio<gdc> dxioVar3, dxio<cjqy> dxioVar4, cjnf cjnfVar, dxio<jlp> dxioVar5) {
        application.getResources();
        this.f = (ConnectivityManager) application.getSystemService("connectivity");
        this.g = dxioVar;
        this.b = dxioVar2;
        this.c = dxioVar3;
        this.d = dxioVar4;
        this.h = cjnfVar;
    }

    @Override // defpackage.bduj
    public Boolean a() {
        return Boolean.valueOf(this.b.a().a());
    }

    @Override // defpackage.bduj
    public CompoundButton.OnCheckedChangeListener b() {
        return new CompoundButton.OnCheckedChangeListener(this) { // from class: bduk
            private final bdun a;

            {
                this.a = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                bdun bdunVar = this.a;
                if (bdunVar.a().booleanValue() != z) {
                    bdunVar.d.a().i(cjqg.a(z, cjtd.a(dtyf.d)));
                    bdunVar.b.a().b(z);
                    if (!z) {
                        return;
                    }
                    gcz a = bdunVar.c.a().a();
                    a.i(R.string.WAIT_FOR_WIFI_SWITCH_ON_DIALOG_TITLE);
                    a.d(R.string.WAIT_FOR_WIFI_SWITCH_ON_DIALOG_MESSAGE);
                    a.i = cjtd.a(dtyf.b);
                    a.h(R.string.OK_BUTTON, cjtd.a(dtyf.c), bdul.a);
                    a.b();
                }
            }
        };
    }

    @Override // defpackage.bduj
    public View.OnAttachStateChangeListener c() {
        return this.j;
    }

    @Override // defpackage.bduj
    public cqkl d() {
        View view = this.e;
        dbuh.d(view);
        cjnf cjnfVar = this.h;
        cjnd i = cjne.i();
        i.d(view);
        i.c(R.string.WAIT_FOR_WIFI_SWITCH_INFO_TOOLTIP_MESSAGE);
        cjnfVar.a(i.a());
        return cqkl.a;
    }

    @Override // defpackage.bdrq
    public Boolean h() {
        dvmb dvmbVar = this.g.a().getPhotoUploadParameters().a;
        if (dvmbVar == null) {
            dvmbVar = dvmb.f;
        }
        if (dvmbVar.e && this.g.a().getPhotoUploadParameters().e) {
            NetworkInfo networkInfo = this.f.getNetworkInfo(1);
            if (networkInfo == null || !networkInfo.isConnected()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.bdrq
    public Boolean i() {
        return Boolean.valueOf(!this.i);
    }

    @Override // defpackage.bdrq
    public void j() {
        this.i = true;
    }
}
