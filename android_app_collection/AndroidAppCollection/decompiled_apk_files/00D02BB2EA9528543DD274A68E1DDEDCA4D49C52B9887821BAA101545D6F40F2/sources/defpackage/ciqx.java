package defpackage;

import android.view.View;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: ciqx  reason: default package */
/* loaded from: classes4.dex */
public class ciqx extends cibj implements ciqu, chyv {
    public final dcdc<ciqw> a;
    public final chxr b;
    private final boolean c;
    private final cidb d;

    public ciqx(chyy chyyVar, btvo btvoVar, chrx chrxVar, chxh chxhVar, chxl chxlVar) {
        super(chxlVar);
        chxr chxrVar = chxlVar.b;
        this.b = chxrVar == null ? chxr.e : chxrVar;
        this.d = new cidb(chrxVar, chxlVar);
        chxp chxpVar = chxlVar.i;
        this.c = (chxpVar == null ? chxp.k : chxpVar).g;
        dccx dccxVar = new dccx();
        int i = 0;
        while (i < chxhVar.a.size()) {
            int i2 = i + 1;
            dccxVar.g(new ciqw(chxhVar.a.get(i), chxlVar, chrxVar, i2, chyyVar, btvoVar));
            i = i2;
        }
        this.a = dccxVar.f();
    }

    @Override // defpackage.chyv
    public chyu a() {
        return chys.a(this);
    }

    @Override // defpackage.chyv
    public boolean b() {
        return chys.b(this);
    }

    @Override // defpackage.chyv
    public chyw c() {
        return chyw.TAG_PHOTOS;
    }

    @Override // defpackage.chyv
    public List<? extends chyv> d() {
        return this.a;
    }

    @Override // defpackage.ciqu
    public List<? extends ciqt> e() {
        return this.a;
    }

    public boolean equals(@dzsi Object obj) {
        return cidc.a(this, obj, new cidd(this) { // from class: ciqv
            private final ciqx a;

            {
                this.a = this;
            }

            @Override // defpackage.cidd
            public final boolean a(Object obj2) {
                ciqx ciqxVar = this.a;
                ciqx ciqxVar2 = (ciqx) obj2;
                return ciqxVar.b.equals(ciqxVar2.b) && ciqxVar.a.size() == ciqxVar2.a.size();
            }
        });
    }

    @Override // defpackage.ciqu
    public Boolean f() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.ciqu
    public jiw g() {
        return this.d;
    }

    @Override // defpackage.ciqu
    public View.OnLayoutChangeListener h() {
        return this.d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, chxj.TAG_PUBLISHED_PHOTOS, Integer.valueOf(this.a.size())});
    }
}
