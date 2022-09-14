package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ajbb  reason: default package */
/* loaded from: classes2.dex */
public class ajbb implements ajao, ajwt, ajxc, ajbh {
    public final ajba a;
    public final btlu b;
    public final ajwe c;
    public final ajus d;
    public final Set<czha> e = new HashSet();
    public final Set<czha> f = new HashSet();
    public cxsx g = null;
    public boolean h = false;
    private final dcdc<ajxq> i;
    private final String j;
    private final cjtd k;
    private final cjtd l;
    private boolean m;

    public ajbb(bwfp bwfpVar, ajba ajbaVar, final ajvd ajvdVar, ajwe ajweVar, cqhn cqhnVar, final Context context, ajus ajusVar, String str, btlu btluVar, boolean z, cjtd cjtdVar, cjtd cjtdVar2, final ddho ddhoVar) {
        this.j = str;
        this.b = btluVar;
        this.c = ajweVar;
        this.m = z;
        this.a = ajbaVar;
        this.d = ajusVar;
        this.i = dcdc.q(dcft.o(bwfpVar.a(btluVar), new dbrn(ajvdVar, context, ddhoVar) { // from class: ajau
            private final ajvd a;
            private final Context b;
            private final ddho c;

            {
                this.a = ajvdVar;
                this.b = context;
                this.c = ddhoVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return new ajaz(this.a, (ResolveInfo) obj, this.b, this.c);
            }
        }));
        this.k = cjtdVar;
        this.l = cjtdVar2;
    }

    @Override // defpackage.ajao
    public Boolean a() {
        boolean z = false;
        if (this.m && !this.h) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ajao
    public ajwt b() {
        return this;
    }

    @Override // defpackage.ajao
    public ajxc c() {
        return this;
    }

    @Override // defpackage.ajao
    public ajbh d() {
        return this;
    }

    public void e(boolean z) {
        this.m = z;
        cqkx.p(this);
    }

    @Override // defpackage.ajxc
    public ajxw f() {
        return new ajaw(this);
    }

    @Override // defpackage.ajxc
    public dbsz<SendKitPickerResult> g() {
        return new dbsz(this) { // from class: ajaq
            private final ajbb a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                this.a.a.a((SendKitPickerResult) obj);
            }
        };
    }

    @Override // defpackage.ajxc
    public dbsz<cxsx> h() {
        return new dbsz(this) { // from class: ajar
            private final ajbb a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                this.a.g = (cxsx) obj;
            }
        };
    }

    @Override // defpackage.ajxc
    public ajxz i() {
        return new ajax(this);
    }

    @Override // defpackage.ajxc
    @dzsi
    public String j() {
        return this.j;
    }

    @Override // defpackage.ajwt
    public List<ajxq> k() {
        return this.i;
    }

    @Override // defpackage.ajxc
    public dbsl<String> l() {
        return new dbsl(this) { // from class: ajas
            private final ajbb a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.c.t((String) obj);
            }
        };
    }

    @Override // defpackage.ajxc
    public ajxx m() {
        return new ajxx(this) { // from class: ajat
            private final ajbb a;

            {
                this.a = this;
            }

            @Override // defpackage.ajxx
            public final void a(String[] strArr, ajxy ajxyVar) {
                this.a.c.u(strArr, 1234, ajxyVar);
            }
        };
    }

    @Override // defpackage.ajbh
    public cjtd n() {
        return this.l;
    }

    @Override // defpackage.ajbh
    public cqkl o() {
        if (!this.h) {
            return cqkl.a;
        }
        cxsx cxsxVar = this.g;
        dbsk.s(cxsxVar);
        SendKitPickerResult c = cxsxVar.c();
        c.c();
        this.a.c(c);
        return cqkl.a;
    }

    @Override // defpackage.ajbh
    public cjtd p() {
        return this.k;
    }

    @Override // defpackage.ajbh
    public cqkl q() {
        this.a.d();
        return cqkl.a;
    }

    @Override // defpackage.ajbh
    public Boolean r() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.ajwt
    public Boolean s() {
        return Boolean.FALSE;
    }
}
