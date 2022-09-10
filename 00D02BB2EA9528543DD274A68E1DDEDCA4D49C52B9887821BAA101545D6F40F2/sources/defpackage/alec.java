package defpackage;

import android.content.res.Resources;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: alec  reason: default package */
/* loaded from: classes2.dex */
public final class alec implements aldk {
    public final dxio<akvz> a;
    public final dbty<akxa> b;
    public final akpn c;
    public final int e;
    public final int f;
    private final Resources h;
    private final dxio<aksp> i;
    private final dbty<akuh> k;
    private final Map<aldz, alea> j = new HashMap();
    public final Map<aleb, akuh> d = new HashMap();
    public final aleu g = new aleu();

    public alec(dxio<akvz> dxioVar, dxio<aksp> dxioVar2, final akox akoxVar, Resources resources, akpn akpnVar) {
        this.a = dxioVar;
        this.i = dxioVar2;
        this.h = resources;
        this.c = akpnVar;
        this.b = dbud.a(new dbty(akoxVar) { // from class: aldw
            private final akox a;

            {
                this.a = akoxVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.aj().aj();
            }
        });
        this.e = akpnVar.b(0, false);
        this.f = akpnVar.b(1, false);
        this.k = dbud.a(new aldx(dxioVar));
    }

    public final akta a(aldl aldlVar, int i) {
        return (akta) aldlVar.a(this, i);
    }

    public final akta b(akqq akqqVar, int i, int i2) {
        dbty<akuh> dbtyVar;
        int i3;
        aldz aldzVar = new aldz(i, i2);
        alea aleaVar = this.j.get(aldzVar);
        if (aleaVar == null) {
            bnrd b = bnrh.b(this.h, i);
            if (b.a() != null) {
                dbtyVar = dbud.a(new aldy(this, b, i2));
                i3 = b.b().a();
                this.j.put(aldzVar, new alea(dbtyVar, i3));
            } else {
                dbtyVar = this.k;
                i3 = 0;
            }
        } else {
            dbtyVar = aleaVar.a;
            i3 = aleaVar.b;
        }
        return this.b.a().e(akqqVar.a, akqqVar.b, 4, i3, true, dbtyVar.a(), false);
    }

    public final void c(List<akta> list) {
        for (akta aktaVar : list) {
            this.i.a().d(aktaVar);
            this.i.a().a(aktaVar);
        }
    }

    public final void d() {
        for (alea aleaVar : this.j.values()) {
            this.a.a().j(aleaVar.a.a());
        }
        this.j.clear();
        for (akuh akuhVar : this.d.values()) {
            this.a.a().j(akuhVar);
        }
        this.d.clear();
    }
}
