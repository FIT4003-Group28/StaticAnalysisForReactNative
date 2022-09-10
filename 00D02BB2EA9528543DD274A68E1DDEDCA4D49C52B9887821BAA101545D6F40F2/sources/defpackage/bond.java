package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bond  reason: default package */
/* loaded from: classes3.dex */
public class bond implements bopv {
    private static final dcqe p = dcqe.c("bond");
    private final Context d;
    private final bokf e;
    private final String f;
    private final String g;
    private final bbut h;
    private final gfw i;
    private final dwyd j;
    private final String k;
    @dzsi
    private final ddho l;
    @dzsi
    private final ddho m;
    private final bonc n;
    private boolean o = true;

    public bond(Context context, bokf bokfVar, dwyd dwydVar, String str, bbut bbutVar, gfw gfwVar, String str2, boolean z, @dzsi ddho ddhoVar, @dzsi ddho ddhoVar2, @dzsi ddho ddhoVar3) {
        this.e = bokfVar;
        bokfVar.b = str2;
        bokfVar.b();
        this.f = str;
        this.g = context.getString(R.string.PHOTOS_TITLE);
        this.d = context;
        this.h = bbutVar;
        this.i = gfwVar;
        this.j = dwydVar;
        this.k = str2;
        this.l = ddhoVar;
        this.m = ddhoVar2;
        this.n = new bonc(bokfVar, bbutVar, dwydVar, gfwVar, str2, z, ddhoVar3);
    }

    @Override // defpackage.bopv
    /* renamed from: a */
    public bonc r() {
        return this.n;
    }

    @Override // defpackage.bopv
    public cqtd b() {
        return cqrt.f(2131231598);
    }

    @Override // defpackage.bopv
    public String c() {
        return this.f;
    }

    @Override // defpackage.bopv
    public String d() {
        int intValue = p().intValue() - 1;
        return this.d.getResources().getQuantityString(R.plurals.ADD_PHOTOS_MORE_PHOTOS_COUNT, intValue, Integer.valueOf(intValue));
    }

    @Override // defpackage.bopv
    public String e() {
        return this.g;
    }

    @Override // defpackage.bopv
    @dzsi
    public cjtd f() {
        ddho ddhoVar = this.m;
        if (ddhoVar != null) {
            return cjtd.a(ddhoVar);
        }
        return null;
    }

    @Override // defpackage.bopv
    @dzsi
    public cjtd g() {
        ddho ddhoVar = this.l;
        if (ddhoVar != null) {
            return cjtd.a(ddhoVar);
        }
        return null;
    }

    @Override // defpackage.bopv
    @dzsi
    public String h() {
        if (this.e.b().isEmpty()) {
            return null;
        }
        return this.e.b().get(0).a();
    }

    @Override // defpackage.bopv
    public Boolean i() {
        return Boolean.valueOf(this.k.startsWith("business_hours_photo"));
    }

    @Override // defpackage.bopv
    public cqkl j() {
        if (!n().booleanValue()) {
            bvoo.h("Clicked on an image thumbnail when there are no images!", new Object[0]);
            return cqkl.a;
        }
        bbut bbutVar = this.h;
        bbuz m = bbve.m();
        m.e(this.j);
        m.g(this.k);
        m.i(this.e.b());
        bbutVar.k(m.a(), this.i);
        return cqkl.a;
    }

    @Override // defpackage.bopv
    public Boolean k() {
        return Boolean.valueOf(this.o);
    }

    public void l(boolean z) {
        boolean z2 = this.o;
        this.o = z;
        if (z2 != z) {
            cqkx.p(this);
        }
    }

    @Override // defpackage.bopv
    public cqkl m() {
        if (!n().booleanValue()) {
            bvoo.h("Clicked on more photos link when there are no images!", new Object[0]);
            return cqkl.a;
        }
        bbut bbutVar = this.h;
        bbuz m = bbve.m();
        m.e(this.j);
        m.g(this.k);
        m.i(this.e.b());
        bbutVar.k(m.a(), this.i);
        return cqkl.a;
    }

    public Boolean n() {
        return Boolean.valueOf(!this.e.b().isEmpty());
    }

    public bokf o() {
        return this.e;
    }

    @Override // defpackage.bopv
    public Integer p() {
        return Integer.valueOf(this.e.b().size());
    }

    public void q(List<bbtm> list) {
        if (list == null || list.isEmpty()) {
            this.e.a.clear();
            cqkx.p(this);
            return;
        }
        this.e.a(list);
        cqkx.p(this);
    }
}
