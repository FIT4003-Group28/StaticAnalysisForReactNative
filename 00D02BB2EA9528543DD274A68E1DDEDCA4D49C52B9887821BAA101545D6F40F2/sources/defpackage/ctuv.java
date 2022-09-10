package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ctuv  reason: default package */
/* loaded from: classes5.dex */
public final class ctuv {
    public static final byte[] a = new byte[0];
    private static final dcdn<dxos, String> b = dcdn.l(dxos.PHOTO, "photos", dxos.RICH_CARD, "rich_card");

    /* JADX WARN: Removed duplicated region for block: B:211:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x083f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dbsg<defpackage.ctrg> a(defpackage.dxtx r17, defpackage.ctyy r18, android.content.Context r19, java.util.Map<java.lang.String, defpackage.ctuk> r20, defpackage.ctxo r21) {
        /*
            Method dump skipped, instructions count: 2302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctuv.a(dxtx, ctyy, android.content.Context, java.util.Map, ctxo):dbsg");
    }

    public static List<ctrg> b(List<dxtx> list, ctyy ctyyVar, Context context, Map<String, ctuk> map, ctxo ctxoVar) {
        ArrayList arrayList = new ArrayList();
        for (dxtx dxtxVar : list) {
            dbsg<ctrg> a2 = a(dxtxVar, ctyyVar, context, map, ctxoVar);
            if (a2.a()) {
                arrayList.add(a2.b());
            }
        }
        return arrayList;
    }

    public static List<String> c(List<dxtx> list) {
        final ArrayList arrayList = new ArrayList();
        for (dxtx dxtxVar : list) {
            d(dxtxVar).h(new dbrn(arrayList) { // from class: ctuu
                private final ArrayList a;

                {
                    this.a = arrayList;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return Boolean.valueOf(this.a.add((String) obj));
                }
            });
        }
        return arrayList;
    }

    public static dbsg<String> d(dxtx dxtxVar) {
        int i = dxtxVar.d;
        char c = 5;
        char c2 = 1;
        if (i == 0) {
            c = 2;
        } else if (i == 1) {
            c = 3;
        } else if (i == 2) {
            c = 4;
        } else if (i != 3) {
            c = i != 4 ? i != 5 ? (char) 0 : (char) 7 : (char) 6;
        }
        if (c != 0) {
            c2 = c;
        }
        return (c2 == 4 || c2 == 7) ? dbpy.a : dbsg.i(dxtxVar.a);
    }

    public static dxqi e(String str, ConversationId conversationId, byte[] bArr, boolean z, boolean z2) {
        dxnc a2 = ctus.a(conversationId.a());
        dxqg bZ = dxqi.t.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxqi dxqiVar = (dxqi) bZ.b;
        str.getClass();
        dxqiVar.g = str;
        a2.getClass();
        dxqiVar.i = a2;
        dxmq b2 = ctuq.b(conversationId);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxqi dxqiVar2 = (dxqi) bZ.b;
        b2.getClass();
        dxqiVar2.j = b2;
        a2.getClass();
        dxqiVar2.b = a2;
        dxqiVar2.a = 5;
        dxos dxosVar = dxos.EVENT;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dxqi) bZ.b).l = dxosVar.a();
        dxqe bZ2 = dxqf.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ((dxqf) bZ2.b).a = dxow.a(7);
        dsoj bZ3 = dsok.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        ((dsok) bZ3.b).a = "type.googleapis.com/google.internal.communications.instantmessaging.v1.ConversationIntentOpenedEvent";
        dxqa bZ4 = dxqb.d.bZ();
        dspd x = dspd.x(bArr);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dxqb dxqbVar = (dxqb) bZ4.b;
        x.getClass();
        dxqbVar.a = x;
        dxqbVar.b = z;
        dxqbVar.c = z2;
        dspd bR = bZ4.bK().bR();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bR.getClass();
        ((dsok) bZ3.b).b = bR;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dsok bK = bZ3.bK();
        bK.getClass();
        ((dxqf) bZ2.b).b = bK;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxqi dxqiVar3 = (dxqi) bZ.b;
        dxqf bK2 = bZ2.bK();
        bK2.getClass();
        dxqiVar3.d = bK2;
        dxqiVar3.c = 105;
        return bZ.bK();
    }

    public static dxqi f(String str, ConversationId conversationId, dbsg<String> dbsgVar, String str2) {
        dxnc a2 = ctus.a(conversationId.a());
        dxqg bZ = dxqi.t.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxqi dxqiVar = (dxqi) bZ.b;
        str.getClass();
        dxqiVar.g = str;
        a2.getClass();
        dxqiVar.i = a2;
        dxmq b2 = ctuq.b(conversationId);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxqi dxqiVar2 = (dxqi) bZ.b;
        b2.getClass();
        dxqiVar2.j = b2;
        a2.getClass();
        dxqiVar2.b = a2;
        dxqiVar2.a = 5;
        dxos dxosVar = dxos.EVENT;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dxqi) bZ.b).l = dxosVar.a();
        dxqe bZ2 = dxqf.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ((dxqf) bZ2.b).a = dxow.a(8);
        dsoj bZ3 = dsok.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        ((dsok) bZ3.b).a = "type.googleapis.com/google.internal.communications.instantmessaging.v1.ActionEvent";
        dxpw bZ4 = dxpx.c.bZ();
        String c = dbsgVar.c("");
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dxpx dxpxVar = (dxpx) bZ4.b;
        c.getClass();
        dxpxVar.a = c;
        str2.getClass();
        dxpxVar.b = str2;
        dspd bR = bZ4.bK().bR();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bR.getClass();
        ((dsok) bZ3.b).b = bR;
        dsok bK = bZ3.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        bK.getClass();
        ((dxqf) bZ2.b).b = bK;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxqi dxqiVar3 = (dxqi) bZ.b;
        dxqf bK2 = bZ2.bK();
        bK2.getClass();
        dxqiVar3.d = bK2;
        dxqiVar3.c = 105;
        return bZ.bK();
    }

    public static List<dxwg> g(ctyy ctyyVar, List<String> list) {
        dccx dccxVar = new dccx();
        for (String str : list) {
            dxwf bZ = dxwg.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            str.getClass();
            ((dxwg) bZ.b).a = str;
            dxvs a2 = ctum.a(ctyyVar.b().e());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            a2.getClass();
            ((dxwg) bZ.b).b = a2;
            dccxVar.g(bZ.bK());
        }
        return dccxVar.f();
    }

    public static ContactId h(dxqi dxqiVar) {
        dxnc dxncVar = dxqiVar.i;
        if (dxncVar == null) {
            dxncVar = dxnc.e;
        }
        return dxqiVar.a == 5 ? ctus.c((dxnc) dxqiVar.b) : ctus.c(dxncVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bc, code lost:
        if ((r10.e == 151 ? (defpackage.dxnx) r10.f : defpackage.dxnx.j).f == 1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:393:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0785  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dbsg<defpackage.ctrg> i(defpackage.dbsg<defpackage.dxqi> r17, defpackage.ctyy r18, android.content.Context r19, java.util.Map<java.lang.String, defpackage.ctuk> r20, defpackage.ctxo r21) {
        /*
            Method dump skipped, instructions count: 2734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctuv.i(dbsg, ctyy, android.content.Context, java.util.Map, ctxo):dbsg");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0149 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dxqi j(defpackage.cugu r8, java.util.Map<java.lang.String, defpackage.ctuk> r9) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctuv.j(cugu, java.util.Map):dxqi");
    }

    private static dbsg<ctrg> k(ctyy ctyyVar, ctxo ctxoVar, dxqi dxqiVar, ConversationId conversationId, ContactId contactId, cugi cugiVar) {
        dxkz bZ = dxla.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxqiVar.getClass();
        ((dxla) bZ.b).a = dxqiVar;
        cugiVar.t(dspd.x(Base64.encode(bZ.bK().bS(), 8)));
        cugiVar.b(dxqiVar.q);
        return dbsg.i(m(cugiVar, dxqiVar, contactId, conversationId, ctyyVar, ctxoVar));
    }

    private static boolean l(dxos dxosVar, cugi cugiVar, Map<String, ctuk> map, dxqi dxqiVar, ctyy ctyyVar) {
        String str = b.get(dxosVar);
        if (map.containsKey(str)) {
            cugiVar.g(map.get(str).a().b(ctyyVar, dxqiVar));
            return true;
        }
        dxkz bZ = dxla.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxqiVar.getClass();
        ((dxla) bZ.b).a = dxqiVar;
        cugiVar.t(dspd.x(Base64.encode(bZ.bK().bS(), 8)));
        cugiVar.b(dxqiVar.q);
        return false;
    }

    private static ctrg m(cugi cugiVar, dxqi dxqiVar, ContactId contactId, ConversationId conversationId, ctyy ctyyVar, ctxo ctxoVar) {
        HashMap hashMap = new HashMap();
        Map unmodifiableMap = Collections.unmodifiableMap(dxqiVar.m);
        for (String str : unmodifiableMap.keySet()) {
            hashMap.put(str, ((dsok) unmodifiableMap.get(str)).bR());
        }
        cugiVar.j(hashMap);
        cugiVar.d(dxqiVar.k);
        boolean equals = contactId.equals(conversationId.a());
        boolean z = false;
        cugiVar.e((equals || dxqiVar.o) ? 1 : 0);
        cugiVar.h(dxqiVar.g);
        cugiVar.o(equals ? 2 : 1);
        cugiVar.i(equals ? cugo.OUTGOING_SENT : cugo.INCOMING_RECEIVED);
        cugiVar.n(dxqiVar.n);
        cugiVar.l(contactId);
        cugiVar.c(conversationId);
        cugiVar.m(Long.valueOf(dxqiVar.h));
        cugu a2 = cugiVar.a();
        if (a2.j() != -1) {
            ctxm r = ctxn.r();
            r.g(10011);
            r.n(ctyyVar.b().e());
            r.o(ctyyVar.c().J());
            r.p(dxqiVar.g);
            r.q(a2.j());
            ctxoVar.b(r.a());
        }
        ctrd l = ctrg.l();
        a2.getClass();
        ((ctpz) l).a = new ctou(a2);
        if (equals || dxqiVar.o) {
            z = true;
        }
        l.c(z);
        return l.a();
    }

    private static ctoj n(ctyy ctyyVar, dxvs dxvsVar, List<dxvs> list) {
        ctpa ctpaVar = new ctpa();
        ConversationId c = ctum.c(dxvsVar, ctyyVar);
        if (c != null) {
            ctpaVar.a = c;
            ArrayList arrayList = new ArrayList();
            for (dxvs dxvsVar2 : list) {
                ContactId b2 = ctum.b(dxvsVar2);
                if (b2 != null) {
                    arrayList.add(b2);
                } else {
                    String str = dxvsVar2.b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35);
                    sb.append("Failed to convert Id: ");
                    sb.append(str);
                    sb.append(" to ContactId");
                    sb.toString();
                    cstl.a("MsgProtoConverter");
                }
            }
            ctqp b3 = ctqq.b();
            b3.b(arrayList);
            ctqq a2 = b3.a();
            if (a2 != null) {
                ctpaVar.b = a2;
                String str2 = ctpaVar.a == null ? " conversationId" : "";
                if (ctpaVar.b == null) {
                    str2 = str2.concat(" groupInfoChanges");
                }
                if (str2.isEmpty()) {
                    return new ctpb(ctpaVar.a, ctpaVar.b);
                }
                String valueOf = String.valueOf(str2);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            throw new NullPointerException("Null groupInfoChanges");
        }
        throw new NullPointerException("Null conversationId");
    }
}
