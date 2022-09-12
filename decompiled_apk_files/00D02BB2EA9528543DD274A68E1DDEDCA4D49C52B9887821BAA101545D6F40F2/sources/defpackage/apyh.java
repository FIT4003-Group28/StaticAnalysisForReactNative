package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: apyh  reason: default package */
/* loaded from: classes2.dex */
public final class apyh implements apzh {
    public static final cuhq a = cubt.d(dcdc.f(cuhu.PLATFORM_DEFAULT_MEDIUM));
    public final gga b;
    public final dxio<aqav> c;
    public final Executor d;
    public final btvo e;
    private final dxio<aqbo> f;

    public apyh(gga ggaVar, dxio<aqav> dxioVar, dxio<aqbo> dxioVar2, btvo btvoVar, Executor executor) {
        this.b = ggaVar;
        this.c = dxioVar;
        this.f = dxioVar2;
        this.d = executor;
        this.e = btvoVar;
    }

    public static cuhq b(Context context, int i) {
        return cubt.c(context.getResources().getInteger(i));
    }

    @Override // defpackage.apzh
    public final dehn<dbsg<apyw>> a(final ilo iloVar, final dcdn<String, String> dcdnVar, final String str) {
        final String a2 = aqco.a(iloVar);
        if (a2 == null) {
            return deha.a(dbpy.a);
        }
        return deew.g(this.f.a().g(1), new defg(this, a2, iloVar, dcdnVar, str) { // from class: apyd
            private final apyh a;
            private final String b;
            private final ilo c;
            private final dcdn d;
            private final String e;

            {
                this.a = this;
                this.b = a2;
                this.c = iloVar;
                this.d = dcdnVar;
                this.e = str;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                final apyh apyhVar = this.a;
                String str2 = this.b;
                final ilo iloVar2 = this.c;
                final dcdn dcdnVar2 = this.d;
                final String str3 = this.e;
                dbsg dbsgVar = (dbsg) obj;
                if (dbsgVar == null || !dbsgVar.a()) {
                    return deha.a(dbpy.a);
                }
                final ctyy ctyyVar = (ctyy) dbsgVar.b();
                dbsg<cufp> i = apyhVar.c.a().c().i(ctyyVar, str2);
                if (!i.a()) {
                    return deha.a(dbpy.a);
                }
                final ConversationId a3 = i.b().a();
                return deew.h(deew.h(apyhVar.c.a().a().a(ctyyVar, 5), new dbrn(apyhVar) { // from class: apyf
                    private final apyh a;

                    {
                        this.a = apyhVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        apyh apyhVar2 = this.a;
                        boolean z = false;
                        if (Boolean.TRUE.equals((Boolean) obj2) && apyhVar2.e.getBusinessMessagingParameters().z) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                }, apyhVar.d), new dbrn(apyhVar, dcdnVar2, str3, a3, iloVar2, ctyyVar) { // from class: apye
                    private final apyh a;
                    private final dcdn b;
                    private final String c;
                    private final ConversationId d;
                    private final ilo e;
                    private final ctyy f;

                    {
                        this.a = apyhVar;
                        this.b = dcdnVar2;
                        this.c = str3;
                        this.d = a3;
                        this.e = iloVar2;
                        this.f = ctyyVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        apyh apyhVar2;
                        ilo iloVar3;
                        ctyy ctyyVar2;
                        String str4;
                        cugu j;
                        boolean z;
                        boolean z2;
                        apyh apyhVar3 = this.a;
                        dcdn dcdnVar3 = this.b;
                        String str5 = this.c;
                        ConversationId conversationId = this.d;
                        ilo iloVar4 = this.e;
                        ctyy ctyyVar3 = this.f;
                        int i2 = 0;
                        String format = String.format("%s\n\n%s", str5, dbrz.f('\n').c(": ").a(dcdnVar3));
                        String format2 = String.format("[%s] %s", str5, dbrz.e(", ").c(": ").a(dcdnVar3));
                        dbsg<String> i3 = dbsg.i("LOCAL-QUOTE-");
                        String str6 = "";
                        if (Boolean.TRUE.equals((Boolean) obj2)) {
                            apyhVar3.c.a().l();
                            gga ggaVar = apyhVar3.b;
                            dccx F = dcdc.F();
                            cuhf g = cuhg.g();
                            g.e(str6);
                            F.g(g.a());
                            dcpd it = dcdnVar3.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                cuhf g2 = cuhg.g();
                                g2.e((String) entry.getKey());
                                g2.d(cuhp.CAPTION_TEXT);
                                F.g(g2.a());
                                cuhf g3 = cuhg.g();
                                g3.e((String) entry.getValue());
                                cuhh e = cuhi.e();
                                e.c(i2);
                                e.b(((String) entry.getValue()).length());
                                e.d(dcdc.h(cubt.c(ggaVar.getResources().getInteger(R.integer.chatty_quotes_field_text_size_sp)), cubt.a(akm.c(ggaVar, R.color.quotes_request_field_text_color)), cubt.d(dcdc.g(cuhu.GOOGLE_SANS_REGULAR, cuhu.PLATFORM_DEFAULT_REGULAR))));
                                g3.b(dcdc.f(e.a()));
                                F.g(g3.a());
                                it = it;
                                i2 = 0;
                            }
                            cuhf g4 = cuhg.g();
                            g4.e(str6);
                            F.g(g4.a());
                            cuhf g5 = cuhg.g();
                            g5.e(ggaVar.getString(R.string.RICH_CARD_QUOTE_REQUEST_FROM_GOOGLE_TEXT));
                            g5.d(cuhp.CAPTION_TEXT);
                            F.g(g5.a());
                            cuhe c = cuhv.c();
                            c.b(F.f());
                            cuhv a4 = c.a();
                            int integer = ggaVar.getResources().getInteger(R.integer.chatty_quotes_padding_external_dp);
                            int integer2 = ggaVar.getResources().getInteger(R.integer.chatty_quotes_padding_internal_dp);
                            cuqj b = cuqk.b();
                            cuqm g6 = cuqq.g();
                            g6.e(integer);
                            g6.f(integer);
                            g6.d(integer);
                            cuqg d = cuqh.d();
                            d.b(akm.c(ggaVar, R.color.quotes_request_status_badge_color));
                            d.d(-1);
                            d.c(dbqa.b(ggaVar.getString(R.string.RICH_CARD_QUOTE_REQUEST_BADGE_TEXT)));
                            g6.m(d.a());
                            cuqq a5 = g6.a();
                            cuqm g7 = cuqq.g();
                            g7.e(integer);
                            g7.f(integer2);
                            g7.d(integer);
                            g7.c(integer);
                            g7.l(a4);
                            b.b(dcdc.g(a5, g7.a()));
                            cuqk a6 = b.a();
                            cuqc b2 = cuqd.b();
                            b2.b(dcdc.f(cuoe.a(a6)));
                            cupx a7 = cuoa.a(b2.a());
                            cugi p = cugu.p();
                            p.h(csvv.a(i3.c(str6)));
                            p.o(2);
                            p.i(cugo.OUTGOING_PENDING_SEND);
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            cstd.a();
                            p.m(Long.valueOf(timeUnit.toMicros(System.currentTimeMillis())));
                            p.c(conversationId);
                            cugk c2 = cugl.c();
                            ((cudv) c2).a = "rich_card";
                            c2.b(cumv.b(a7));
                            p.g(cuas.b(c2.a()));
                            p.d(format);
                            p.n(format2);
                            p.l(conversationId.a());
                            p.b(196);
                            apyhVar2 = apyhVar3;
                            iloVar3 = iloVar4;
                            ctyyVar2 = ctyyVar3;
                            j = p.a();
                            str4 = str6;
                        } else {
                            csuk c3 = apyhVar3.c.a().c();
                            gga ggaVar2 = apyhVar3.b;
                            cuhf g8 = cuhg.g();
                            g8.e(str5);
                            cuhh e2 = cuhi.e();
                            e2.c(0);
                            e2.b(str5.length());
                            e2.d(dcdc.g(apyh.a, apyh.b(ggaVar2, R.integer.chatty_quotes_title_text_size_sp)));
                            g8.b(dcdc.f(e2.a()));
                            cuhg a8 = g8.a();
                            dccx dccxVar = new dccx();
                            dccxVar.g(a8);
                            cuhf g9 = cuhg.g();
                            g9.e(str6);
                            dccxVar.g(g9.a());
                            dcpd it2 = dcdnVar3.entrySet().iterator();
                            while (it2.hasNext()) {
                                Map.Entry entry2 = (Map.Entry) it2.next();
                                String str7 = (String) entry2.getKey();
                                String str8 = (String) entry2.getValue();
                                String string = ggaVar2.getString(R.string.BUSINESS_MESSAGING_QUOTE_REQUEST_FIELD_FORMAT, str7, str8);
                                dcpd dcpdVar = it2;
                                cuhq b3 = apyh.b(ggaVar2, R.integer.chatty_quotes_field_text_size_sp);
                                dcdc<cuhq> g10 = dcdc.g(apyh.a, b3);
                                String str9 = str6;
                                ctyy ctyyVar4 = ctyyVar3;
                                String a9 = apyg.a('a', 'b', ggaVar2);
                                ilo iloVar5 = iloVar4;
                                String a10 = apyg.a('c', 'd', ggaVar2);
                                gga ggaVar3 = ggaVar2;
                                int i4 = 0;
                                int i5 = 0;
                                int i6 = 0;
                                while (i4 < a9.length()) {
                                    apyh apyhVar4 = apyhVar3;
                                    if (a9.charAt(i4) != a10.charAt(i4)) {
                                        if (a9.charAt(i4) == 'a') {
                                            i5 = i4;
                                        } else {
                                            i6 = i4;
                                        }
                                    }
                                    i4++;
                                    apyhVar3 = apyhVar4;
                                }
                                apyh apyhVar5 = apyhVar3;
                                dbsi a11 = dbsi.a(Integer.valueOf(i5), Integer.valueOf(i6));
                                int intValue = ((Integer) a11.a).intValue();
                                int intValue2 = ((Integer) a11.b).intValue();
                                int length = intValue2 + (intValue < intValue2 ? str7.length() - 1 : 0);
                                int length2 = str8.length() + length;
                                dccx dccxVar2 = new dccx();
                                if (length > 0) {
                                    cuhh e3 = cuhi.e();
                                    e3.c(0);
                                    e3.b(length);
                                    e3.d(g10);
                                    dccxVar2.g(e3.a());
                                }
                                if (str8.length() > 0) {
                                    cuhh e4 = cuhi.e();
                                    e4.c(length);
                                    e4.b(length2);
                                    e4.d(dcdc.f(b3));
                                    dccxVar2.g(e4.a());
                                }
                                if (length2 < string.length()) {
                                    cuhh e5 = cuhi.e();
                                    e5.c(length2);
                                    e5.b(string.length());
                                    e5.d(g10);
                                    dccxVar2.g(e5.a());
                                }
                                cuhf g11 = cuhg.g();
                                g11.e(string);
                                g11.b(dccxVar2.f());
                                dccxVar.g(g11.a());
                                it2 = dcpdVar;
                                str6 = str9;
                                ctyyVar3 = ctyyVar4;
                                iloVar4 = iloVar5;
                                ggaVar2 = ggaVar3;
                                apyhVar3 = apyhVar5;
                            }
                            apyhVar2 = apyhVar3;
                            iloVar3 = iloVar4;
                            ctyyVar2 = ctyyVar3;
                            cuhe c4 = cuhv.c();
                            c4.b(dccxVar.f());
                            str4 = str6;
                            j = c3.j(conversationId, cuas.c(c4.a()), format, dbsg.i(format2), i3, dcmn.a);
                        }
                        dfuq bZ = dfur.e.bZ();
                        dfuu bZ2 = dfuw.b.bZ();
                        if (bZ2.c) {
                            bZ2.bF();
                            z = false;
                            bZ2.c = false;
                        } else {
                            z = false;
                        }
                        ((dfuw) bZ2.b).a = dfuv.a(3);
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = z;
                        }
                        dfuw bK = bZ2.bK();
                        bK.getClass();
                        ((dfur) bZ.b).a = bK;
                        dfus bZ3 = dfut.d.bZ();
                        if (bZ3.c) {
                            bZ3.bF();
                            z2 = false;
                            bZ3.c = false;
                        } else {
                            z2 = false;
                        }
                        ((dfut) bZ3.b).c = dfup.a(3);
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = z2;
                        }
                        ((dfut) bZ3.b).a = dtbd.a(5);
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = z2;
                        }
                        ((dfut) bZ3.b).b = dhji.a(4);
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = z2;
                        }
                        dfut bK2 = bZ3.bK();
                        bK2.getClass();
                        ((dfur) bZ.b).b = bK2;
                        dcdc r = dcdc.r(apyhVar2.e.getBusinessMessagingParameters().x);
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dfur dfurVar = (dfur) bZ.b;
                        dsrj<String> dsrjVar = dfurVar.d;
                        if (!dsrjVar.a()) {
                            dfurVar.d = dsqw.cl(dsrjVar);
                        }
                        dsod.bv(r, dfurVar.d);
                        dcpd<String> it3 = iloVar3.as().iterator();
                        if (it3.hasNext()) {
                            String valueOf = String.valueOf(it3.next());
                            String concat = valueOf.length() != 0 ? "gcid:".concat(valueOf) : new String("gcid:");
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            concat.getClass();
                            ((dfur) bZ.b).c = concat;
                        }
                        dcdg c5 = new dcdg().c(j.i());
                        dsoj bZ4 = dsok.c.bZ();
                        if (bZ4.c) {
                            bZ4.bF();
                            bZ4.c = false;
                        }
                        ((dsok) bZ4.b).a = "type.googleapis.com/geo.local.boq.serviceareabusiness.getaquote.proto.ChattyMetadata";
                        dspd bR = bZ.bK().bR();
                        if (bZ4.c) {
                            bZ4.bF();
                            bZ4.c = false;
                        }
                        bR.getClass();
                        ((dsok) bZ4.b).b = bR;
                        c5.f("chatty_metadata", bZ4.bK().bR());
                        dcdn b4 = c5.b();
                        cugi n = j.n();
                        n.j(b4);
                        cugu a12 = n.a();
                        apvt apvtVar = new apvt();
                        if (ctyyVar2 != null) {
                            apvtVar.a = ctyyVar2;
                            if (a12 != null) {
                                apvtVar.b = a12;
                                apvtVar.c = 4;
                                String str10 = apvtVar.a == null ? " accountContext" : str4;
                                if (apvtVar.b == null) {
                                    str10 = str10.concat(" message");
                                }
                                if (apvtVar.c == null) {
                                    str10 = String.valueOf(str10).concat(" messageOrigin");
                                }
                                if (str10.isEmpty()) {
                                    return dbsg.i(new apvu(apvtVar.a, apvtVar.b, apvtVar.c.intValue()));
                                }
                                String valueOf2 = String.valueOf(str10);
                                throw new IllegalStateException(valueOf2.length() != 0 ? "Missing required properties:".concat(valueOf2) : new String("Missing required properties:"));
                            }
                            throw new NullPointerException("Null message");
                        }
                        throw new NullPointerException("Null accountContext");
                    }
                }, apyhVar.d);
            }
        }, this.d);
    }
}
