package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: brmo  reason: default package */
/* loaded from: classes4.dex */
public final class brmo implements braw {
    private final dxio<akox> a;
    private final brba c;
    private final dxio<brmt> d;
    private final brat e;
    private final brmn f;
    private final brmp g;
    private final Map<dmni, alax> b = new HashMap();
    private dkee h = dkee.UNKNOWN_VIEW_TYPE;

    public brmo(dxio<akty> dxioVar, dxio<akvz> dxioVar2, dxio<akox> dxioVar3, dzsj<dwwr> dzsjVar, dzsj<dujz> dzsjVar2, dzsj<dvsm> dzsjVar3, dzsj<akwu> dzsjVar4, Resources resources, Context context, cqat cqatVar, btvo btvoVar, brat bratVar, brba brbaVar, bsqi bsqiVar, dxio<brmt> dxioVar4) {
        String str = dzsjVar.a().h;
        int a = dujv.a(dzsjVar2.a().b);
        brmn brmnVar = new brmn(new aluu(str, alxb.a(a == 0 ? 1 : a, resources), btvoVar.getCategoricalSearchParameters().u()), dxioVar.a(), dxioVar2.a(), context, cqatVar, btvoVar, bratVar, dxioVar3, bsqiVar);
        this.f = brmnVar;
        this.g = new brmp(brmnVar, dzsjVar3.a(), dzsjVar4.a().a());
        this.c = brbaVar;
        this.a = dxioVar3;
        this.d = dxioVar4;
        this.e = bratVar;
    }

    private final void d() {
        brmt a = this.d.a();
        a.c();
        a.e.a(null);
    }

    private final void e() {
        for (alax alaxVar : this.b.values()) {
            alaxVar.b();
            alaxVar.c();
        }
        this.b.clear();
    }

    private final void f() {
        this.g.a();
    }

    @Override // defpackage.braw
    public final void a(brav bravVar) {
        brlk G = this.c.G();
        if (G == null || !G.f()) {
            dcdc<dmni> c = bravVar.c();
            boolean z = this.h == dkee.HOTEL || this.h == dkee.HOTEL_CHAIN;
            if (c.isEmpty() || !z) {
                dfpo a = bravVar.a();
                if (this.e.d() != 4 || a == null) {
                    dcdc<brod> b = bravVar.b();
                    e();
                    d();
                    if (!b.isEmpty()) {
                        this.g.b(b);
                        return;
                    } else {
                        f();
                        return;
                    }
                }
                f();
                e();
                this.d.a().b(a);
                this.d.a().d();
                return;
            }
            f();
            d();
            HashMap hashMap = new HashMap(this.b);
            for (dmni dmniVar : c) {
                if (hashMap.containsKey(dmniVar)) {
                    hashMap.remove(dmniVar);
                } else {
                    alax a2 = alay.a(dmniVar, this.a.a(), true);
                    a2.a();
                    this.b.put(dmniVar, a2);
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                ((alax) entry.getValue()).b();
                ((alax) entry.getValue()).c();
                this.b.remove(entry.getKey());
            }
        }
    }

    @Override // defpackage.braw
    public final void b() {
        d();
        e();
        f();
    }

    @Override // defpackage.braw
    public final void c(dkee dkeeVar) {
        this.h = dkeeVar;
        this.f.d = dkeeVar;
    }
}
