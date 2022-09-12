package defpackage;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ctul  reason: default package */
/* loaded from: classes5.dex */
public final class ctul {
    public static dbsg<ctqs> a(Map<String, byte[]> map) {
        byte[] bArr = map.get("Lighter");
        if (bArr != null) {
            try {
                dspd dspdVar = ((dsok) dsqw.cq(dsok.c, bArr)).b;
                dsqa c = dsqa.c();
                dxmw dxmwVar = dxmw.e;
                try {
                    dspj s = dspdVar.s();
                    dsqw dsqwVar = (dsqw) dxmwVar.cu(4);
                    try {
                        try {
                            dstc b = dsst.a.b(dsqwVar);
                            b.f(dsqwVar, dspk.n(s), c);
                            b.j(dsqwVar);
                            try {
                                s.b(0);
                                dsqw.cv(dsqwVar);
                                dxmw dxmwVar2 = (dxmw) dsqwVar;
                                HashSet hashSet = new HashSet();
                                for (dxnc dxncVar : dxmwVar2.d) {
                                    hashSet.add(ctus.c(dxncVar));
                                }
                                ctpp ctppVar = new ctpp();
                                String str = dxmwVar2.a;
                                if (str != null) {
                                    ctppVar.a = str;
                                    ctppVar.c = Boolean.valueOf(dxmwVar2.c);
                                    ctppVar.b = Boolean.valueOf(dxmwVar2.b);
                                    ctppVar.d = hashSet;
                                    String str2 = "";
                                    if (ctppVar.a == null) {
                                        str2 = " handlerId";
                                    }
                                    if (ctppVar.b == null) {
                                        str2 = str2.concat(" supportsBlocking");
                                    }
                                    if (ctppVar.c == null) {
                                        str2 = String.valueOf(str2).concat(" isBlocked");
                                    }
                                    if (ctppVar.d == null) {
                                        str2 = String.valueOf(str2).concat(" importantParticipants");
                                    }
                                    if (str2.isEmpty()) {
                                        return dbsg.i(new ctpq(ctppVar.a, ctppVar.b.booleanValue(), ctppVar.c.booleanValue(), ctppVar.d));
                                    }
                                    String valueOf = String.valueOf(str2);
                                    throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                                }
                                throw new NullPointerException("Null handlerId");
                            } catch (dsrm e) {
                                throw e;
                            }
                        } catch (RuntimeException e2) {
                            if (e2.getCause() instanceof dsrm) {
                                throw ((dsrm) e2.getCause());
                            }
                            throw e2;
                        }
                    } catch (IOException e3) {
                        if (!(e3.getCause() instanceof dsrm)) {
                            throw new dsrm(e3.getMessage());
                        }
                        throw ((dsrm) e3.getCause());
                    }
                } catch (dsrm e4) {
                    throw e4;
                }
            } catch (dsrm unused) {
                cstl.a("GroupMetadataProtos");
                return dbpy.a;
            }
        }
        return dbpy.a;
    }
}
