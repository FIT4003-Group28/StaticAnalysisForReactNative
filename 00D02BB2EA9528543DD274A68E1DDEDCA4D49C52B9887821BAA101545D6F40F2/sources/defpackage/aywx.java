package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aywx  reason: default package */
/* loaded from: classes3.dex */
public final class aywx implements bzml {
    jdi a;
    private final dxio<bzmm> b;
    private final gga c;
    private final cqkj d;

    public aywx(dxio<bzmm> dxioVar, gga ggaVar, cqkj cqkjVar) {
        this.b = dxioVar;
        this.c = ggaVar;
        this.d = cqkjVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.EDIT_PLACE_NOTE;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.HIGH;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return false;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        return this.b.a().b(dqkc.EDIT_PLACE_NOTE) != bzmk.VISIBLE ? bzmk.VISIBLE : bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        if (bzmkVar != bzmk.REPRESSED && this.a == null) {
            this.a = new jdi(this.c, jdo.TOP, null);
            cqkf c = this.d.c(new ayxd(), null);
            c.e(new ayxj(new Runnable(this) { // from class: ayww
                private final aywx a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    aywx aywxVar = this.a;
                    jdi jdiVar = aywxVar.a;
                    if (jdiVar == null || !jdiVar.b()) {
                        return;
                    }
                    aywxVar.a.f();
                }
            }));
            this.a.c(c.c());
            this.a.a(this.c.getResources().getColor(R.color.save_to_place_list_promo_background));
        }
        return false;
    }
}
