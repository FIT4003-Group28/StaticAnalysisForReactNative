package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zod  reason: default package */
/* loaded from: classes7.dex */
public class zod implements zdx, zdr, cqkp {
    public final List<zob> a = new ArrayList();
    public int b = 0;
    private final Activity c;
    private final voh d;
    private final zoc e;
    private final vou f;
    private final zom g;
    @dzsi
    private amuk h;

    public zod(Activity activity, zoc zocVar, voh vohVar, vou vouVar, zom zomVar) {
        this.c = activity;
        this.d = vohVar;
        this.e = zocVar;
        this.f = vouVar;
        this.g = zomVar;
    }

    @Override // defpackage.zdr
    public CharSequence a() {
        amuk amukVar = this.h;
        return amukVar == null ? "" : amukVar.a();
    }

    @Override // defpackage.zdr
    public CharSequence b() {
        return e().booleanValue() ? this.c.getString(R.string.DIRECTIONS_SUB_TAB_SELECTED, new Object[]{a()}) : a();
    }

    @Override // defpackage.zdr
    public String c() {
        return a().toString();
    }

    @Override // defpackage.zdr
    @dzsi
    public jhk d() {
        amuk amukVar = this.h;
        if (amukVar == null) {
            return null;
        }
        return amukVar.b();
    }

    @Override // defpackage.zdr
    public Boolean e() {
        boolean z = true;
        if (this.g.h().b() != this || this.g.g().size() <= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zdr
    public cjtd f() {
        cjta b = cjtd.b();
        b.d = dtxn.dv;
        return b.a();
    }

    @Override // defpackage.zdx
    public Boolean g() {
        for (zob zobVar : h()) {
            if (!zobVar.s().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zdx
    public List<zob> h() {
        return this.a;
    }

    @Override // defpackage.zdx
    public CharSequence j() {
        return "";
    }

    @Override // defpackage.zdx
    public cqkl k() {
        ((vok) this.d).d.a();
        cqkx.p(this.g);
        return cqkl.a;
    }

    @Override // defpackage.zdx
    public Boolean l() {
        btpf.c(this.c);
        return false;
    }

    @Override // defpackage.zdx
    public CharSequence m() {
        return "";
    }

    @Override // defpackage.zdx
    public cqkl n() {
        return cqkl.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(wuv wuvVar, boolean z) {
        if (this.h == null) {
            this.h = wuvVar.b();
        }
        zoc zocVar = this.e;
        voh vohVar = this.d;
        vou vouVar = this.f;
        zom zomVar = this.g;
        Activity activity = (Activity) ((dxjd) zocVar.a).a;
        zoc.a(activity, 1);
        zoc.a(zocVar.b.a(), 2);
        zoc.a(zocVar.c.a(), 3);
        byae a = zocVar.d.a();
        zoc.a(a, 4);
        wtu a2 = zocVar.e.a();
        zoc.a(a2, 5);
        zoc.a(vohVar, 6);
        zoc.a(vouVar, 7);
        zoc.a(zomVar, 8);
        zoc.a(this, 9);
        zoc.a(wuvVar, 10);
        this.a.add(new zob(activity, a, a2, vohVar, vouVar, zomVar, this, wuvVar));
        if (z) {
            this.b = this.a.size() - 1;
        }
    }

    @Override // defpackage.zdx
    /* renamed from: p */
    public zob i() {
        return this.a.get(this.b);
    }

    public String q() {
        amuk amukVar = this.h;
        return amukVar == null ? "" : amukVar.c();
    }
}
