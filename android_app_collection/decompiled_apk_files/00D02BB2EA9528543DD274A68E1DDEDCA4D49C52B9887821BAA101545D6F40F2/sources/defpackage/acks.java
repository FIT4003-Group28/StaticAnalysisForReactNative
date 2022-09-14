package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: acks  reason: default package */
/* loaded from: classes2.dex */
public class acks extends acts implements acko {
    public final gfw a;
    public final dxio<bbut> b;
    public dcdc<String> c;
    private final Context e;

    public acks(Context context, cjqy cjqyVar, gfw gfwVar, dxio<bbut> dxioVar) {
        super(cjqyVar);
        this.c = dcdc.e();
        this.e = context;
        this.a = gfwVar;
        this.b = dxioVar;
    }

    private final View.OnClickListener t(int i) {
        return new ackq(this, i);
    }

    @Override // defpackage.acts, defpackage.actl
    public Boolean a() {
        return true;
    }

    @Override // defpackage.acko
    public void c(awtn awtnVar) {
        dccx dccxVar = new dccx();
        this.c = dcdc.r(awtnVar.g());
        for (int i = 0; i < this.c.size(); i++) {
            View.OnClickListener t = t(i);
            aclh aclhVar = new aclh();
            aclhVar.a = dtyb.T;
            dccxVar.g(new actp(this.c.get(i), t, aclhVar.a(), new actd()));
        }
        x(dccxVar.f(), this.c.isEmpty() ? null : t(0), new ackr(this), 8);
    }

    @Override // defpackage.actl
    @dzsi
    public acli d() {
        return acli.a(dtyb.R);
    }

    @Override // defpackage.actl
    @dzsi
    public acli e() {
        return acli.a(dtyb.S);
    }

    @Override // defpackage.actl
    @dzsi
    public acli f() {
        return acli.a(dtyb.U);
    }

    @Override // defpackage.actl
    @dzsi
    public String g() {
        return this.e.getString(R.string.ADD_PARKING_LOCATION_PHOTOS_TITLE);
    }

    @Override // defpackage.actl
    @dzsi
    public acli h() {
        return acli.a(dtyb.V);
    }

    @Override // defpackage.actl
    @dzsi
    public acli i() {
        return acli.a(dtyb.W);
    }
}
