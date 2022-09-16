package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ctuo  reason: default package */
/* loaded from: classes5.dex */
public final class ctuo {
    public static dbsg<cufh> a(dxla dxlaVar, ctyy ctyyVar, Context context, Map<String, ctuk> map, ctxo ctxoVar) {
        dxqi dxqiVar = dxlaVar.a;
        if (dxqiVar == null) {
            dxqiVar = dxqi.t;
        }
        dbsg<ctrg> i = ctuv.i(dbsg.i(dxqiVar), ctyyVar, context, map, ctxoVar);
        if (!i.a() || i.b().e().k().a().equals(cugt.OVERLAY)) {
            return dbpy.a;
        }
        cugu e = i.b().e();
        cugi n = e.n();
        if (e.j() != -1 && e.f().a() == 1) {
            n.g(cuas.d(dspd.x(Base64.encode(dxlaVar.bS(), 8))));
        }
        dccx F = dcdc.F();
        for (dxks dxksVar : dxlaVar.b) {
            dbsg<cufb> a = ctun.a(dxksVar);
            if (a.a()) {
                F.g(a.b());
                cufb b = a.b();
                cugo g = e.g();
                int o = e.o();
                ConversationId c = e.c();
                int a2 = b.a();
                if (a2 != 3) {
                    if (a2 != 4) {
                        if (a2 != 5) {
                            continue;
                        } else if (o != 0) {
                            if (o == 2 && cugo.n.contains(g)) {
                                n.i(cugo.OUTGOING_SENT);
                            }
                        } else {
                            throw null;
                        }
                    } else if (o == 0) {
                        throw null;
                    } else {
                        if (o == 1) {
                            if (g.equals(cugo.INCOMING_RECEIVED) && b.b().a().a().contains(c.a())) {
                                n.i(cugo.INCOMING_READ);
                            }
                        } else if (!g.equals(cugo.OUTGOING_READ) && !g.equals(cugo.OUTGOING_FAILED_TO_DELIVER)) {
                            n.i(cugo.OUTGOING_DELIVERED);
                        }
                    }
                } else if (o == 0) {
                    throw null;
                } else {
                    if (o == 1) {
                        if (b.b().a().a().contains(c.a())) {
                            if (csvo.a(context).s()) {
                                n.i(cugo.INCOMING_READ_RECEIPT_SENT);
                            } else {
                                n.i(cugo.INCOMING_READ);
                            }
                        }
                    } else if (csvo.a(context).s()) {
                        n.i(cugo.OUTGOING_READ);
                    } else {
                        n.i(cugo.OUTGOING_DELIVERED);
                    }
                }
            }
        }
        cugu a3 = n.a();
        cucx cucxVar = new cucx();
        if (a3 != null) {
            cucxVar.a = a3;
            dcdc<cufb> f = F.f();
            if (f != null) {
                cucxVar.b = f;
                int o2 = e.o();
                if (o2 == 0) {
                    throw null;
                }
                if (o2 == 1) {
                    int o3 = a3.o();
                    if (o3 == 0) {
                        throw null;
                    }
                    cucxVar.c = dbsg.i(Boolean.valueOf(o3 == 1 ? a3.g().equals(cugo.INCOMING_RECEIVED) : false));
                }
                String str = cucxVar.a == null ? " message" : "";
                if (cucxVar.b == null) {
                    str = str.concat(" annotations");
                }
                if (str.isEmpty()) {
                    return dbsg.i(new cucy(cucxVar.a, cucxVar.b, cucxVar.c));
                }
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            throw new NullPointerException("Null annotations");
        }
        throw new NullPointerException("Null message");
    }
}
