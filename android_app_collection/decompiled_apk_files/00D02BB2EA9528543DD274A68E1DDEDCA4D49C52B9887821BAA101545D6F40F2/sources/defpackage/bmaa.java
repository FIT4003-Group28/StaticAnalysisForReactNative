package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bmaa  reason: default package */
/* loaded from: classes3.dex */
public final class bmaa implements bvwz {
    public static final dcqe a = dcqe.c("bmaa");
    public final chhr b;

    public bmaa(chhr chhrVar) {
        this.b = chhrVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new dbrn(this) { // from class: blzz
            private final bmaa a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bmaa bmaaVar = this.a;
                Map map = (Map) obj;
                if (map == null) {
                    return bvwy.a;
                }
                Object obj2 = map.get("otpfpk");
                if (obj2 instanceof String) {
                    try {
                        dqec dqecVar = (dqec) dsqw.cq(dqec.a, ddae.e.j((String) obj2));
                        djgx bZ = djhq.j.bZ();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        djhq djhqVar = (djhq) bZ.b;
                        dqecVar.getClass();
                        djhqVar.g = dqecVar;
                        djhqVar.a |= 128;
                        djhq bK = bZ.bK();
                        chhr chhrVar = bmaaVar.b;
                        chir chirVar = chir.c;
                        if (chhrVar.c(null)) {
                            chix chixVar = chhrVar.c;
                            chis bZ2 = chit.i.bZ();
                            chij bZ3 = chik.c.bZ();
                            chih bZ4 = chii.c.bZ();
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            chii chiiVar = (chii) bZ4.b;
                            bK.getClass();
                            chiiVar.b = bK;
                            chiiVar.a |= 1;
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            chik chikVar = (chik) bZ3.b;
                            chii bK2 = bZ4.bK();
                            bK2.getClass();
                            chikVar.b = bK2;
                            chikVar.a = 3;
                            bZ2.a(bZ3);
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            chit chitVar = (chit) bZ2.b;
                            chitVar.a |= 1;
                            chitVar.c = false;
                            chit chitVar2 = (chit) bZ2.b;
                            chitVar2.h = 0;
                            int i = chitVar2.a | 32;
                            chitVar2.a = i;
                            chirVar.getClass();
                            chitVar2.f = chirVar;
                            chitVar2.a = i | 8;
                            chhrVar.a.D(chbx.g(bZ2.bK(), chhrVar.b, bwrs.a(null)));
                        }
                        return bvwy.a;
                    } catch (dsrm unused) {
                        bvoo.h("Could not parse the argument into a proto.", new Object[0]);
                        return bvwy.a;
                    }
                }
                return bvwy.a;
            }
        };
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        return null;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "otpfi";
    }
}
