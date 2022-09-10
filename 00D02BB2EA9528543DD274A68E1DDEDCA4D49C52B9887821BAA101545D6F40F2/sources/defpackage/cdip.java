package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cdip  reason: default package */
/* loaded from: classes4.dex */
public class cdip implements cdin {
    public final cdhp a;
    private final Integer c;
    private final CharSequence d;
    private final CharSequence e;
    private final dxio<aesb> f;
    public int b = 1;
    private dcdc<cdim> g = dcdc.e();

    public cdip(cdhp cdhpVar, Integer num, cqhn cqhnVar, dxio<aesb> dxioVar) {
        this.a = cdhpVar;
        this.c = num;
        this.f = dxioVar;
        this.d = cdhpVar.J().getString(R.string.CLOSE_BUTTON);
        this.e = cdhpVar.J().getString(R.string.GENERIC_TRY_AGAIN_BUTTON);
    }

    @Override // defpackage.cdin
    public Integer a() {
        return this.c;
    }

    @Override // defpackage.cdin
    public Boolean b() {
        int i = this.b;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cdin
    public Boolean c() {
        return Boolean.valueOf(this.b == 3);
    }

    @Override // defpackage.cdin
    public Boolean d() {
        return Boolean.valueOf(this.b == 4);
    }

    @Override // defpackage.cdin
    public Boolean e() {
        return true;
    }

    @Override // defpackage.cdin
    public List<cdim> f() {
        return this.b == 4 ? this.g : dcdc.e();
    }

    @Override // defpackage.cdin
    public cqkl g() {
        this.b = 1;
        cqkx.p(this);
        this.a.q();
        return cqkl.a;
    }

    @Override // defpackage.cdin
    public cqkl h() {
        if (this.b != 4) {
            return cqkl.a;
        }
        this.a.aT();
        this.f.a().m(false, false, this.a.ba());
        return cqkl.a;
    }

    @Override // defpackage.cdin
    public cqkl i() {
        this.a.aT();
        return cqkl.a;
    }

    @Override // defpackage.cdin
    public CharSequence j() {
        return this.d;
    }

    @Override // defpackage.cdin
    public CharSequence k() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(@dzsi List<cdhl> list) {
        if (list == null) {
            this.b = 3;
        } else {
            this.b = 4;
            this.g = dcbg.b(list).s(new dbrn(this) { // from class: cdio
                private final cdip a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return new cdik(this.a.a, (cdhl) obj);
                }
            }).z();
        }
        cqkx.p(this);
    }
}
