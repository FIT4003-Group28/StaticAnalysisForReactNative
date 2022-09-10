package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: acvm  reason: default package */
/* loaded from: classes2.dex */
public class acvm implements acvh {
    private final String a;
    private final String b;
    private final boolean c;
    private final boolean d;
    private final String e;
    private boolean f;
    private final List<acvf> g = new ArrayList();
    @dzsi
    private final actx h;

    public acvm(Context context, String str, byee byeeVar, cqat cqatVar, boolean z, @dzsi actx actxVar, String str2) {
        String str3;
        this.a = str;
        bydp e = byeeVar.e(cqatVar);
        this.b = e.l(context);
        this.c = e.c();
        this.d = e.e();
        this.e = str2;
        this.f = z;
        this.h = actxVar;
        boolean z2 = true;
        for (bydp bydpVar : byeeVar.h(cqatVar)) {
            List<acvf> list = this.g;
            String g = bydpVar.g(context);
            String l = bydpVar.l(context);
            if (bydpVar.d()) {
                String b = bydpVar.b();
                StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 2);
                sb.append("(");
                sb.append(b);
                sb.append(")");
                str3 = sb.toString();
            } else {
                str3 = null;
            }
            list.add(new acvi(g, l, str3, bydpVar.c(), z2, bydpVar.e(), false, false));
            z2 = false;
        }
    }

    @Override // defpackage.acvh
    public String a() {
        return this.a;
    }

    @Override // defpackage.acvh
    public String b() {
        return this.b;
    }

    @Override // defpackage.acvh
    public Boolean c() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.acvh
    public Boolean d() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.acvh
    public Boolean e() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.acvh
    public cqkl f() {
        this.f = !this.f;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.acvh
    public List<acvf> g() {
        return this.g;
    }

    @Override // defpackage.acvh
    public Boolean h() {
        return Boolean.valueOf(this.h != null);
    }

    @Override // defpackage.acvh
    public cqkl i() {
        actx actxVar = this.h;
        if (actxVar != null) {
            dnps bZ = dnqe.i.bZ();
            dnqb dnqbVar = dnqb.OPEN_HOURS_LEAF_PAGE;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqe dnqeVar = (dnqe) bZ.b;
            dnqeVar.b = dnqbVar.ah;
            dnqeVar.a |= 1;
            dnqe dnqeVar2 = (dnqe) bZ.b;
            dnqeVar2.c = 1;
            dnqeVar2.a |= 2;
            acvj acvjVar = (acvj) actxVar;
            acvjVar.b.B(bwrs.a(acvjVar.a), bZ.bK(), bomu.BUSINESS_HOURS);
        }
        return cqkl.a;
    }

    @Override // defpackage.acvh
    public String j() {
        return this.e;
    }
}
