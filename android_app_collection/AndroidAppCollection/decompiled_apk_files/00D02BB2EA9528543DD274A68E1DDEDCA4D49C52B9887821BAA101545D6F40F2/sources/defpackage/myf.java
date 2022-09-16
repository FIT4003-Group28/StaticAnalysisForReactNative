package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: myf  reason: default package */
/* loaded from: classes7.dex */
public class myf implements myd {
    public final mxt a;
    public final vup b;
    public boolean c;
    private final Context d;
    private final noo e;
    private final mye f = new mye(this);

    public myf(Context context, mxt mxtVar, noo nooVar) {
        this.d = context;
        this.a = mxtVar;
        this.e = nooVar;
        this.b = mxtVar.a();
    }

    @Override // defpackage.myd
    public CharSequence a() {
        return this.d.getResources().getString(R.string.CAR_ROUTE_OPTIONS);
    }

    @Override // defpackage.myd
    public Boolean b(vux vuxVar) {
        Integer a = this.b.a(vuxVar);
        boolean z = false;
        if (a != null && a.intValue() != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.myd
    public cqkl c(vux vuxVar) {
        this.c = true;
        Integer a = this.b.a(vuxVar);
        int i = 0;
        if (a != null && a.intValue() != 0) {
            i = 1;
        }
        this.b.b(vuxVar, 1 ^ i);
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.myd
    public cqkl d() {
        this.e.b();
        return cqkl.a;
    }

    @Override // defpackage.myd
    public cqkl e() {
        this.e.a();
        return cqkl.a;
    }

    @Override // defpackage.myd
    public cjtd f(vux vuxVar) {
        ddho ddhoVar;
        deaa deaaVar = b(vuxVar).booleanValue() ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        cjta b = cjtd.b();
        vux vuxVar2 = vux.GOOD_TO_GO;
        int ordinal = vuxVar.ordinal();
        if (ordinal == 1) {
            ddhoVar = dtxm.ee;
        } else if (ordinal == 2) {
            ddhoVar = dtxm.ef;
        } else if (ordinal != 3) {
            String valueOf = String.valueOf(vuxVar.name());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "DirectionsOption not supported: ".concat(valueOf) : new String("DirectionsOption not supported: "));
        } else {
            ddhoVar = dtxm.ed;
        }
        b.d = ddhoVar;
        ddzy bZ = deab.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        return b.a();
    }

    public void g() {
        mxt mxtVar = this.a;
        mye myeVar = this.f;
        Collection<mye> collection = ((mxq) mxtVar).b;
        dbsk.s(myeVar);
        collection.add(myeVar);
    }

    public void h() {
        mxt mxtVar = this.a;
        dbsk.a(((mxq) mxtVar).b.remove(this.f));
    }

    public vup i() {
        return this.b;
    }
}
