package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aadk  reason: default package */
/* loaded from: classes.dex */
public final class aadk implements aadj {
    public static final /* synthetic */ aadk a = new aadk(2);
    private final /* synthetic */ int b;

    public aadk() {
    }

    public aadk(int i) {
        this.b = i;
    }

    private static void b(apji apjiVar, ArrayList arrayList) {
        apzg apzgVar;
        if ((apjiVar.b & 4) != 0) {
            apjh apjhVar = apjiVar.e;
            if (apjhVar == null) {
                apjhVar = apjh.a;
            }
            apzg apzgVar2 = null;
            if (apjhVar.b == 84996305) {
                apjf apjfVar = (apjf) apjhVar.c;
                int i = apjfVar.b & 1;
                if (i != 0) {
                    if (i != 0) {
                        apzgVar = apjfVar.c;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                    } else {
                        apzgVar = null;
                    }
                    arrayList.add(apzgVar);
                }
            }
            if (apjhVar.b != 111631903) {
                return;
            }
            apje apjeVar = (apje) apjhVar.c;
            int i2 = apjeVar.b & 1;
            if (i2 == 0) {
                return;
            }
            if (i2 != 0 && (apzgVar2 = apjeVar.c) == null) {
                apzgVar2 = apzg.a;
            }
            arrayList.add(apzgVar2);
        }
    }

    @Override // defpackage.aadj
    public final List a(Object obj) {
        auqh auqhVar;
        armc armcVar;
        avfo avfoVar;
        int i = this.b;
        if (i == 0) {
            ArrayList arrayList = new ArrayList();
            if (obj instanceof asgt) {
                asgt asgtVar = (asgt) obj;
                if ((asgtVar.b & 2) != 0) {
                    asgu asguVar = asgtVar.d;
                    if (asguVar == null) {
                        asguVar = asgu.a;
                    }
                    if (asguVar.b == 51779735) {
                        asgl asglVar = (asgl) asguVar.c;
                        if ((asglVar.b & 4) != 0) {
                            asgh asghVar = asglVar.e;
                            if (asghVar == null) {
                                asghVar = asgh.a;
                            }
                            if (asghVar.b == 46659098) {
                                apjj apjjVar = (apjj) asghVar.c;
                                for (apji apjiVar : apjjVar.b) {
                                    b(apjiVar, arrayList);
                                }
                                for (apji apjiVar2 : apjjVar.c) {
                                    b(apjiVar2, arrayList);
                                }
                                for (apji apjiVar3 : apjjVar.d) {
                                    b(apjiVar3, arrayList);
                                }
                            }
                        }
                    }
                }
            }
            return arrayList;
        } else if (i == 1) {
            if (obj instanceof arlt) {
                arlt arltVar = (arlt) obj;
                if ((arltVar.b & 64) != 0) {
                    amuf amufVar = new amuf();
                    arlu arluVar = arltVar.f;
                    if (arluVar == null) {
                        arluVar = arlu.a;
                    }
                    if (arluVar.b == 49399797) {
                        auqhVar = (auqh) arluVar.c;
                    } else {
                        auqhVar = auqh.a;
                    }
                    amufVar.j(auqhVar.e);
                    arlu arluVar2 = arltVar.f;
                    if (arluVar2 == null) {
                        arluVar2 = arlu.a;
                    }
                    if (arluVar2.b == 58173949) {
                        armcVar = (armc) arluVar2.c;
                    } else {
                        armcVar = armc.a;
                    }
                    for (arlw arlwVar : armcVar.c) {
                        if (arlwVar.b == 58174010) {
                            avfoVar = (avfo) arlwVar.c;
                        } else {
                            avfoVar = avfo.a;
                        }
                        avfk avfkVar = avfoVar.k;
                        if (avfkVar == null) {
                            avfkVar = avfk.a;
                        }
                        auqh auqhVar2 = avfkVar.c;
                        if (auqhVar2 == null) {
                            auqhVar2 = auqh.a;
                        }
                        amufVar.j(auqhVar2.e);
                    }
                    return amufVar.g();
                }
            }
            return amuk.q();
        } else {
            aaoq aaoqVar = aaoq.a;
            return amuk.q();
        }
    }
}
