package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: aaoj  reason: default package */
/* loaded from: classes2.dex */
public final class aaoj extends ges {
    public cqkj a;
    private diwb ad;
    private Bitmap ae;
    public efg b;
    public aapr c;
    public btvo d;
    public bwqv e;
    private cqkf<aape> f;
    private aape g;

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        this.f = this.a.e(new aapb());
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = (Bundle) dbsc.a(bundle, this.o);
        dssr dssrVar = (dssr) diwb.U.cu(7);
        dbsk.s(dssrVar);
        this.ad = (diwb) bvrs.e(bundle2, diwb.class, dssrVar);
        String string = bundle2.getString("SCREENSHOT_TOKEN_KEY");
        if (string != null) {
            try {
                byte[] bArr = (byte[]) this.e.n(byte[].class, string);
                this.ae = BitmapFactory.decodeByteArray((byte[]) dbsk.s(bArr), 0, bArr.length);
            } catch (IOException e) {
                bvoo.j(new IllegalStateException("Error loading serialized item from storage", e));
            }
        }
        aapr aaprVar = this.c;
        drlp drlpVar = this.d.getEventsUgcParameters().g;
        if (drlpVar == null) {
            drlpVar = drlp.b;
        }
        drlp drlpVar2 = drlpVar;
        diwb diwbVar = this.ad;
        Bitmap bitmap = this.ae;
        aapr.a(drlpVar2, 1);
        aapr.a(diwbVar, 2);
        gga a = aaprVar.a.a();
        aapr.a(a, 4);
        aapr.a(aaprVar.b.a(), 5);
        aapl a2 = aaprVar.c.a();
        aapr.a(a2, 6);
        cklf a3 = aaprVar.d.a();
        aapr.a(a3, 7);
        dxio a4 = ((dxjh) aaprVar.e).a();
        aapr.a(a4, 8);
        cbqg a5 = aaprVar.f.a();
        aapr.a(a5, 9);
        dxio a6 = ((dxjh) aaprVar.g).a();
        aapr.a(a6, 10);
        dxio a7 = ((dxjh) aaprVar.h).a();
        aapr.a(a7, 11);
        this.g = new aapq(drlpVar2, diwbVar, bitmap, a, a2, a3, a4, a5, a6, a7);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        cqkf<aape> cqkfVar = this.f;
        aape aapeVar = this.g;
        dbsk.s(aapeVar);
        cqkfVar.e(aapeVar);
        egj egjVar = new egj(this);
        egjVar.w(this.f.c());
        egjVar.ag(null);
        egjVar.e(this);
        this.b.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.f.e(null);
        super.u();
    }
}
