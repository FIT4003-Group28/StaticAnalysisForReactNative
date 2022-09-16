package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: boub  reason: default package */
/* loaded from: classes3.dex */
final class boub implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ bouf a;

    public boub(bouf boufVar) {
        this.a = boufVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(@dzsi Map<String, Object> map) {
        Map<String, Object> map2 = map;
        if (this.a.f.getUgcParameters().A()) {
            final int i = 0;
            if (map2 != null && map2.containsKey("rapMode")) {
                i = djhm.a(((Integer) map2.get("rapMode")).intValue());
            }
            this.a.e.b(new Runnable(this, i) { // from class: boua
                private final boub a;
                private final int b;

                {
                    this.a = this;
                    this.b = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boub boubVar = this.a;
                    int i2 = this.b;
                    bouf boufVar = boubVar.a;
                    djgx bZ = djhq.j.bZ();
                    djgw a = chiw.a();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    djhq djhqVar = (djhq) bZ.b;
                    a.getClass();
                    djhqVar.b = a;
                    djhqVar.a |= 1;
                    if (i2 != 0) {
                        djhk bZ2 = djhn.d.bZ();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        djhn djhnVar = (djhn) bZ2.b;
                        djhnVar.b = i2 - 1;
                        djhnVar.a |= 1;
                        if (boufVar.h.a() && i2 != 2) {
                            ilo c = boufVar.h.b().c();
                            dbsk.s(c);
                            String o = c.ai().o();
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            djhn djhnVar2 = (djhn) bZ2.b;
                            o.getClass();
                            djhnVar2.a = 2 | djhnVar2.a;
                            djhnVar2.c = o;
                        }
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        djhq djhqVar2 = (djhq) bZ.b;
                        djhn bK = bZ2.bK();
                        bK.getClass();
                        djhqVar2.i = bK;
                        djhqVar2.a |= 512;
                    }
                    boufVar.c.b(bZ.bK(), new boue(boufVar), boufVar.b);
                }
            }, bvrj.BACKGROUND_THREADPOOL);
        }
        return bvwy.a;
    }
}
