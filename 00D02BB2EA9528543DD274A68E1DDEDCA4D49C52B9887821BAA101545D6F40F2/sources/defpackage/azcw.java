package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.maps.R;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: azcw  reason: default package */
/* loaded from: classes3.dex */
public final class azcw extends hxf {
    @dzsi
    private azef ad;
    public gga b;
    public bwqv c;
    public efg d;
    public cqkj e;
    public azeu f;
    @dzsi
    private bwrs<baad> g;

    @Override // defpackage.hxf
    protected final jib g() {
        jhz a = jhz.a();
        a.a = Ro(R.string.LIST_SHARING_OPTIONS);
        a.f(new View.OnClickListener(this) { // from class: azcv
            private final azcw a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b.onBackPressed();
            }
        });
        return a.b();
    }

    @Override // defpackage.hxf
    public final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        cqkf c = this.e.c(new azdy(), null);
        azef azefVar = this.ad;
        dbsk.s(azefVar);
        c.e(azefVar);
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        try {
            bwrs<baad> e = this.c.e(baad.class, bundle == null ? this.o : bundle, "arg_local_list");
            if (e == null) {
                return;
            }
            this.g = e;
            azeu azeuVar = this.f;
            baad c = e.c();
            dbsk.s(c);
            gga a = azeuVar.a.a();
            azeu.a(a, 1);
            bvrb a2 = azeuVar.b.a();
            azeu.a(a2, 2);
            dxio a3 = ((dxjh) azeuVar.c).a();
            azeu.a(a3, 3);
            cztz a4 = azeuVar.d.a();
            azeu.a(a4, 4);
            dxio a5 = ((dxjh) azeuVar.e).a();
            azeu.a(a5, 5);
            ayay a6 = azeuVar.f.a();
            azeu.a(a6, 6);
            axwg a7 = azeuVar.g.a();
            azeu.a(a7, 7);
            azeu.a(azeuVar.h.a(), 8);
            caxe a8 = azeuVar.i.a();
            azeu.a(a8, 9);
            aydl a9 = azeuVar.j.a();
            azeu.a(a9, 10);
            axyz a10 = azeuVar.k.a();
            azeu.a(a10, 11);
            axze a11 = azeuVar.l.a();
            azeu.a(a11, 12);
            dxio a12 = ((dxjh) azeuVar.m).a();
            azeu.a(a12, 13);
            azeu.a(c, 14);
            try {
                this.ad = new azet(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, c);
            } catch (IOException e2) {
                e = e2;
                Throwable cause = e.getCause();
                dbsk.s(cause);
                dbue.b(cause);
                Throwable cause2 = e.getCause();
                dbsk.s(cause2);
                throw new RuntimeException(cause2);
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ag(null);
        this.d.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bwrs<baad> bwrsVar = this.g;
        if (bwrsVar != null) {
            this.c.c(bundle, "arg_local_list", bwrsVar);
        }
    }
}
