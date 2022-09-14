package defpackage;

import android.content.res.Resources;
import android.text.SpannableString;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bibu  reason: default package */
/* loaded from: classes3.dex */
public class bibu implements bibp {
    public final azxb a;
    private final gga d;
    private final dxio<axwo> e;
    private final azwu g;
    @dzsi
    public baad b = null;
    @dzsi
    public baal c = null;
    private final alp f = alp.a();

    public bibu(gga ggaVar, dxio<axwo> dxioVar, dxio<axwi> dxioVar2, azwu azwuVar, azxb azxbVar) {
        this.d = ggaVar;
        this.e = dxioVar;
        this.g = azwuVar;
        this.a = azxbVar;
        bvqj.c(dxioVar2.a().h(azwuVar.a()), new bvqg(this) { // from class: bibt
            private final bibu a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                bibu bibuVar = this.a;
                baad baadVar = (baad) obj;
                if (baadVar == null) {
                    return;
                }
                bibuVar.b = baadVar;
                dcdc<baal> i = baadVar.i();
                int size = i.size();
                int i2 = 0;
                while (i2 < size) {
                    baal baalVar = i.get(i2);
                    i2++;
                    if (baalVar.a().h(bibuVar.a)) {
                        bibuVar.c = baalVar;
                        cqkx.p(bibuVar);
                        return;
                    }
                }
                baadVar.l();
            }
        }, dege.a);
    }

    private final boolean k() {
        baad baadVar = this.b;
        return baadVar != null ? baadVar.z() : this.g.f();
    }

    @Override // defpackage.bibp
    public jic a() {
        baab b;
        cqtd d;
        baad baadVar = this.b;
        if (baadVar != null) {
            return baadVar.a();
        }
        ckqc ckqcVar = ckqc.FULLY_QUALIFIED;
        if (this.g.e()) {
            d = cqrt.f(2131232006);
        } else {
            baad baadVar2 = this.b;
            if (baadVar2 != null) {
                b = baadVar2.o();
            } else {
                b = this.g.b();
            }
            d = baam.d(b);
        }
        return new jic((String) null, ckqcVar, d, 0);
    }

    @Override // defpackage.bibp
    public CharSequence b() {
        String g = g();
        if (g.isEmpty()) {
            return "";
        }
        if (k()) {
            return this.d.getString(R.string.YOUR_ARE_FOLLOWING_LIST, new Object[]{g});
        }
        return this.d.getString(R.string.SAVED_IN_LIST, new Object[]{g});
    }

    @Override // defpackage.bibp
    public CharSequence c() {
        int i;
        String h;
        if (k()) {
            baad baadVar = this.b;
            if (baadVar != null) {
                h = baadVar.O();
            } else {
                h = this.g.h();
            }
            if (dbsj.d(h)) {
                return "";
            }
            gga ggaVar = this.d;
            dbsk.s(h);
            return ggaVar.getString(R.string.BY_LIST_AUTHOR, new Object[]{h});
        } else if (this.b == null) {
            return "";
        } else {
            Resources resources = this.d.getResources();
            baad baadVar2 = this.b;
            dbsk.s(baadVar2);
            baac t = baadVar2.t();
            baac baacVar = baac.PRIVATE;
            int ordinal = t.ordinal();
            if (ordinal == 0) {
                i = R.string.YOUR_PRIVATE_LIST;
            } else if (ordinal == 1) {
                i = R.string.YOUR_SHARED_LIST;
            } else if (ordinal != 2) {
                String valueOf = String.valueOf(t);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Illegal sharing state - ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } else {
                i = R.string.YOUR_PUBLIC_LIST;
            }
            return resources.getText(i);
        }
    }

    @Override // defpackage.bibp
    public CharSequence d() {
        baal baalVar = this.c;
        if (baalVar == null) {
            return "";
        }
        return new SpannableString(this.f.b(baalVar.c()));
    }

    @Override // defpackage.bibp
    public cjtd e() {
        return cjtd.a(d().length() > 0 ? dtxy.jn : dtxy.jm);
    }

    @Override // defpackage.bibp
    public cjtd f() {
        return cjtd.a(dtxy.jp);
    }

    @Override // defpackage.bibp
    public String g() {
        baad baadVar = this.b;
        return baadVar != null ? baadVar.E(this.d) : this.g.c();
    }

    @Override // defpackage.bibp
    public cqkl h() {
        if (this.c != null) {
            baal baalVar = this.c;
            dbsk.s(baalVar);
            this.e.a().b(null, baalVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.bibp
    public cqkl i() {
        this.e.a().f(this.g.a());
        return cqkl.a;
    }

    @Override // defpackage.bibp
    public Boolean j() {
        return Boolean.valueOf(!k());
    }
}
