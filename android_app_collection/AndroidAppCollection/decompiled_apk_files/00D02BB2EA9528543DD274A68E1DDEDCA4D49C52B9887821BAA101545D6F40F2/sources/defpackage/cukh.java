package defpackage;

import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: cukh  reason: default package */
/* loaded from: classes5.dex */
public final class cukh implements ctxf<dxxe, dxxg, cujv, cukc> {
    public final byte[] a;
    private final dehp b = cstu.b().a;
    private final ConversationId c;
    private final ctyy d;

    public cukh(ctyy ctyyVar, ConversationId conversationId, byte[] bArr) {
        this.a = bArr;
        this.c = conversationId;
        this.d = ctyyVar;
    }

    @Override // defpackage.ctxf
    public final dehn<dxxe> a(dxwi dxwiVar) {
        dxvs bK;
        dxxd bZ = dxxe.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxwiVar.getClass();
        ((dxxe) bZ.b).c = dxwiVar;
        ((dxxe) bZ.b).d = eacr.a(12);
        dxvt bZ2 = dxvu.b.bZ();
        ConversationId conversationId = this.c;
        if (conversationId.c() == ConversationId.IdType.ONE_TO_ONE) {
            bK = ctum.a(conversationId.e());
        } else {
            dxvr bZ3 = dxvs.d.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            ((dxvs) bZ3.b).a = eacq.a(4);
            String a = conversationId.d().a();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            a.getClass();
            ((dxvs) bZ3.b).b = a;
            String b = conversationId.d().b();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            b.getClass();
            ((dxvs) bZ3.b).c = b;
            bK = bZ3.bK();
        }
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dxvu dxvuVar = (dxvu) bZ2.b;
        bK.getClass();
        dsrj<dxvs> dsrjVar = dxvuVar.a;
        if (!dsrjVar.a()) {
            dxvuVar.a = dsqw.cl(dsrjVar);
        }
        dxvuVar.a.add(bK);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxxe dxxeVar = (dxxe) bZ.b;
        dxvu bK2 = bZ2.bK();
        bK2.getClass();
        dxxeVar.b = bK2;
        dxxeVar.a = 5;
        return deha.a(bZ.bK());
    }

    @Override // defpackage.ctxf
    public final void b(UUID uuid, int i, dyjb dyjbVar, ctog ctogVar, long j) {
        int i2 = dyjbVar.p.r;
        Throwable th = dyjbVar.r;
        if (th instanceof cujx) {
            int i3 = ((cujx) th).a;
        }
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.d.b().e());
        r.o(this.d.c().J());
        r.p(uuid.toString());
        r.j(17);
        r.m(Integer.valueOf(i2));
        r.f(i);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ void c(UUID uuid, cujv cujvVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.d.b().e());
        r.o(this.d.c().J());
        r.p(uuid.toString());
        r.j(17);
        r.f(1);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ cujv d(dxxg dxxgVar) {
        dxxg dxxgVar2 = dxxgVar;
        cujq cujqVar = new cujq();
        cukm c = cukn.c();
        dxvy dxvyVar = dxxgVar2.a;
        if (dxvyVar == null) {
            dxvyVar = dxvy.d;
        }
        c.b(dxvyVar.a);
        dxvy dxvyVar2 = dxxgVar2.a;
        if (dxvyVar2 == null) {
            dxvyVar2 = dxvy.d;
        }
        dsqy dsqyVar = dxvyVar2.c;
        if (dsqyVar == null) {
            dsqyVar = dsqy.b;
        }
        c.c(dsqyVar.a);
        cukn a = c.a();
        if (a != null) {
            cujqVar.a = a;
            String str = cujqVar.a == null ? " mediaId" : "";
            if (str.isEmpty()) {
                return new cujr(cujqVar.a);
            }
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        throw new NullPointerException("Null mediaId");
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<dxxg> e(dehn<cukc> dehnVar, dxxe dxxeVar) {
        final dxxe dxxeVar2 = dxxeVar;
        return deew.g(dehnVar, new defg(this, dxxeVar2) { // from class: cukg
            private final cukh a;
            private final dxxe b;

            {
                this.a = this;
                this.b = dxxeVar2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                cukh cukhVar = this.a;
                dxxe dxxeVar3 = this.b;
                cukc cukcVar = (cukc) obj;
                byte[] bArr = cukhVar.a;
                String encodeToString = Base64.encodeToString(dxxeVar3.bS(), 2);
                String f = cukcVar.b.a.f();
                duit a = duiu.a();
                a.a = 5L;
                duiu a2 = a.a();
                duid duidVar = new duid(new ByteArrayInputStream(bArr), 4000000);
                duhx duhxVar = new duhx();
                duhxVar.a("X-Goog-Upload-Header-Content-Length", Long.toString(bArr.length));
                String valueOf = String.valueOf(cukcVar.c);
                duhxVar.a("Authorization", valueOf.length() != 0 ? "Bearer ".concat(valueOf) : new String("Bearer "));
                return deew.h(cukcVar.d.b(f, duhxVar, duidVar, encodeToString, a2).a(), new dbrn() { // from class: cukb
                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        String str;
                        dxvy dxvyVar;
                        duir duirVar = (duir) obj2;
                        if (duirVar.a()) {
                            duiq duiqVar = duirVar.a;
                            if (duiqVar.a == duip.CANCELED) {
                                throw cukc.a("Unknown", "Media upload canceled (hasTransferException)", dyjb.c);
                            }
                            throw cukc.b("Unknown", "Media upload failed (hasTransferException)", duiqVar.a() ? dyjb.m : dyjb.d, duiqVar);
                        }
                        duhy duhyVar = duirVar.b;
                        if (duhyVar == null) {
                            throw cukc.a("Unknown", "Media upload failed: no response", dyjb.m);
                        }
                        int i = duhyVar.a;
                        duhx duhxVar2 = duhyVar.b;
                        if (duhxVar2 == null || !duhxVar2.a.containsKey("x-guploader-uploadid".toLowerCase(Locale.US))) {
                            str = "Unknown";
                        } else {
                            str = duhxVar2.d("x-guploader-uploadid");
                            if (String.valueOf(str).length() == 0) {
                                new String("Media Upload requestId=");
                            }
                            cstl.a("ScottyStub");
                        }
                        if (i != 200) {
                            if (i == 401) {
                                throw cukc.a(str, "Media upload unauthenticated (Response Code 401)", dyjb.i);
                            }
                            if (i == 413) {
                                throw cukc.a(str, "Media upload rejected by server because it was too large! (Response Code 413)", dyjb.e);
                            }
                            StringBuilder sb = new StringBuilder(45);
                            sb.append("Media upload failed: responseCode=");
                            sb.append(i);
                            throw cukc.a(str, sb.toString(), dyjb.m);
                        } else if (duhxVar2 != null) {
                            InputStream inputStream = duhyVar.c;
                            if (inputStream == null) {
                                throw cukc.a(str, "Media upload failed: responseBodyStream null", dyjb.m);
                            }
                            String d = duhxVar2.d("X-Goog-Upload-Status");
                            if (((d.hashCode() == 97436022 && d.equals("final")) ? (char) 0 : (char) 65535) != 0) {
                                String valueOf2 = String.valueOf(d);
                                throw cukc.a(str, valueOf2.length() != 0 ? "Media upload failed: scottyStatus=".concat(valueOf2) : new String("Media upload failed: scottyStatus="), dyjb.m);
                            }
                            try {
                                dxxg dxxgVar = (dxxg) dsqw.cr(dxxg.b, ddak.b(inputStream), dsqa.c());
                                if (dxxgVar != null && (dxvyVar = dxxgVar.a) != null && !dxvyVar.a.isEmpty()) {
                                    return dxxgVar;
                                }
                                throw cukc.a("Unknown", "Media upload failed: mediaId not found in response", dyjb.m);
                            } catch (IOException e) {
                                throw cukc.b(str, "Error parsing response body", dyjb.m, e);
                            }
                        } else {
                            throw cukc.a(str, "Media upload failed: responseBodyHeaders null", dyjb.m);
                        }
                    }
                }, cukcVar.a);
            }
        }, this.b);
    }
}
