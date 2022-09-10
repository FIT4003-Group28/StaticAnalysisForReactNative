package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: apwo  reason: default package */
/* loaded from: classes2.dex */
public class apwo extends bruj {
    private final Activity e;
    private final btvo f;
    private final dxio<apyz> g;
    private final dxio<bhjg> h;

    public apwo(Activity activity, btvo btvoVar, dxio<apyz> dxioVar, dxio<bhjg> dxioVar2, bebu bebuVar, brsc brscVar, jba jbaVar, brrx brrxVar) {
        super(brscVar, brrxVar);
        this.e = activity;
        this.h = dxioVar2;
        this.f = btvoVar;
        this.g = dxioVar;
    }

    @Override // defpackage.brvb
    public cqkl a(cjqm cjqmVar) {
        apyz a = this.g.a();
        ilo r = r();
        if (r != null && a.p(r)) {
            a.m(r, apzb.PLACECARD);
            if (this.f.getBusinessMessagingParameters().g) {
                this.h.a().a(r);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.brvb
    @dzsi
    public String b() {
        return null;
    }

    @Override // defpackage.bruj
    protected final String c() {
        if (this.f.getBusinessMessagingParameters().k) {
            return this.e.getString(R.string.LOCAL_CLICK_TO_CHAT_ACTION_CONTACT);
        }
        return this.e.getString(R.string.LOCAL_CLICK_TO_CHAT_ACTION_MESSAGE);
    }

    @Override // defpackage.brvb
    public Boolean d() {
        return Boolean.valueOf(this.g.a().p(r()));
    }

    @Override // defpackage.brvb
    public cqtd f() {
        return cqrt.g(2131232347, ibm.x());
    }
}
