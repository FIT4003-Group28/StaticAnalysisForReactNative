package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bixd  reason: default package */
/* loaded from: classes3.dex */
public class bixd extends bixc {
    private static final bmds a;
    private final dnvr b;
    private final Activity c;
    private final bwrs<ilo> d;
    private final bmdq e;
    private final bhhf f;
    private final dxio<afha> g;

    static {
        bmdr i = bmds.i();
        i.g(true);
        i.b(true);
        i.c(true);
        a = i.a();
    }

    public bixd(Activity activity, boxa boxaVar, dnvr dnvrVar, cjtd cjtdVar, bwrs<ilo> bwrsVar, bmdq bmdqVar, bhhf bhhfVar, dxio<afha> dxioVar) {
        super(activity, boxaVar, dnvrVar, cjtdVar, bwrsVar, false);
        this.b = dnvrVar;
        this.c = activity;
        this.d = bwrsVar;
        this.e = bmdqVar;
        this.f = bhhfVar;
        this.g = dxioVar;
    }

    @Override // defpackage.bixc, defpackage.biwl
    public CharSequence a() {
        if (this.f.b(this.d)) {
            return this.c.getString(R.string.PLACE_PENDING_MERCHANT_EDIT_TITLE);
        }
        return this.c.getString(R.string.PLACE_PENDING_USER_EDIT_TITLE);
    }

    @Override // defpackage.bixc, defpackage.biwl
    public Boolean e() {
        return Boolean.TRUE;
    }

    @Override // defpackage.bixc, defpackage.biwl
    public cqkl i() {
        dqgh b = dqgh.b(this.b.b);
        if (b == null) {
            b = dqgh.UNDEFINED;
        }
        if (b != dqgh.PHONE_NUMBER || !this.e.c()) {
            dqgh b2 = dqgh.b(this.b.b);
            if (b2 == null) {
                b2 = dqgh.UNDEFINED;
            }
            if (b2 == dqgh.WEBSITE) {
                afha a2 = this.g.a();
                Activity activity = this.c;
                dnfe dnfeVar = this.b.d;
                if (dnfeVar == null) {
                    dnfeVar = dnfe.p;
                }
                String str = dnfeVar.c;
                if (!str.startsWith("http://") && !str.startsWith("https://")) {
                    String valueOf = String.valueOf(str);
                    str = valueOf.length() != 0 ? "http://".concat(valueOf) : new String("http://");
                }
                a2.k(activity, str, 1);
            }
        } else {
            this.e.a(this.d, a);
        }
        return cqkl.a;
    }

    @Override // defpackage.bixc, defpackage.biwl
    public Boolean l() {
        dqgh b = dqgh.b(this.b.b);
        if (b == null) {
            b = dqgh.UNDEFINED;
        }
        boolean z = true;
        if (b != dqgh.PHONE_NUMBER || !this.e.c()) {
            dqgh b2 = dqgh.b(this.b.b);
            if (b2 == null) {
                b2 = dqgh.UNDEFINED;
            }
            if (b2 != dqgh.WEBSITE) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
