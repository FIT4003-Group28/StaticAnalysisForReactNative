package defpackage;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: alfp  reason: default package */
/* loaded from: classes.dex */
public final class alfp extends alfw {
    public static final Charset a = Charset.forName("UTF-8");
    public final snc b;
    public final asfs c;
    public final alak e;
    private final awyu f;
    private final akze g;
    private final alhn h;
    private final alhs i;
    private final albk k;
    private final Map l;
    private final aqxo m;

    public alfp(snc sncVar, aadd aaddVar, asfs asfsVar, alak alakVar, albo alboVar, albq albqVar, akze akzeVar, alhn alhnVar, alhs alhsVar, aqxo aqxoVar, albf albfVar, alez alezVar, aldn aldnVar, alht alhtVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(avuo.UPLOAD_PROCESSOR_TYPE_TRANSFER, sncVar, aaddVar, akzeVar, albfVar, alezVar, aldnVar, alhtVar);
        this.l = new ConcurrentHashMap();
        this.b = sncVar;
        this.c = asfsVar;
        this.e = alakVar;
        this.g = akzeVar;
        this.h = alhnVar;
        this.i = alhsVar;
        this.m = aqxoVar;
        this.k = new albk(alboVar, albqVar);
        awyt a2 = awyu.a();
        a2.a = 0L;
        this.f = a2.a();
    }

    @Override // defpackage.algt
    public final albu a(alcw alcwVar) {
        return this.k;
    }

    @Override // defpackage.algt
    public final alct b(alcw alcwVar) {
        alct alctVar = alcwVar.H;
        return alctVar == null ? alct.a : alctVar;
    }

    @Override // defpackage.aleo
    public final ankt c(String str, akzp akzpVar, alcw alcwVar) {
        awxy a2;
        final String str2 = alcwVar.k;
        String str3 = alcwVar.E;
        final String str4 = (alcwVar.c & 2) != 0 ? alcwVar.F : null;
        if (alht.l(alcwVar)) {
            a2 = new awxy(alht.h(alcwVar));
        } else {
            a2 = this.h.a(alcwVar, new aldi() { // from class: alfk
                @Override // defpackage.aldi
                public final void a(double d) {
                    alfp alfpVar = alfp.this;
                    alfpVar.e.e(str2, d);
                }
            });
        }
        awyn awynVar = new awyn(str3, "PUT", null, a2, null, this.i.a().a, this.f, true);
        awynVar.j(new alfo(this, str2), 65536, 500);
        this.m.J();
        ankt i = anii.i(awynVar.a(), new anir() { // from class: alfl
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                alfp alfpVar = alfp.this;
                String str5 = str4;
                awys awysVar = (awys) obj;
                if (awysVar.b()) {
                    throw akzh.c(avun.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_TRANSFER_EXCEPTION, alfpVar.c.e);
                }
                if (!awysVar.a()) {
                    throw akzh.c(avun.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_EMPTY_RESPONSE, alfpVar.c.e);
                }
                awyb awybVar = awysVar.b;
                int i2 = awybVar.a;
                if (i2 >= 0) {
                    awya awyaVar = awybVar.b;
                    if (awyaVar != null) {
                        try {
                            InputStream inputStream = awybVar.c;
                            if (inputStream == null) {
                                throw akzh.c(avun.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_ERROR_PARSING_RESPONSE, alfpVar.c.e);
                            }
                            byte[] c = anek.c(inputStream);
                            String a3 = awyaVar.a("X-Goog-Upload-Status");
                            if ("cancelled".equals(a3)) {
                                throw akzh.a(avun.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_CANCELLATION);
                            }
                            if (!"final".equals(a3)) {
                                throw akzh.c(avun.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_UNEXPECTED_SCOTTY_STATUS, alfpVar.c.e);
                            }
                            if (i2 != 200) {
                                throw akzh.a(avun.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_ERROR_RESPONSE_CODE);
                            }
                            try {
                                JSONObject jSONObject = new JSONObject(new String(c, alfp.a));
                                String string = jSONObject.getString("status");
                                String optString = jSONObject.optString("scottyResourceId", "");
                                if (!string.equals("STATUS_SUCCESS")) {
                                    throw akzh.a(avun.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_UNSUCCESSFUL_STATUS);
                                }
                                if (TextUtils.isEmpty(optString)) {
                                    throw akzh.a(avun.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_EMPTY_RESOURCE_OR_HANDLE);
                                }
                                if (str5 == null || optString.equals(str5)) {
                                    return anlz.q(alfpVar.u(alfpVar.d.e(), true, new jhq(optString, 8)));
                                }
                                throw akzh.a(avun.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_RESOURCE_MISMATCH);
                            } catch (JSONException unused) {
                                throw akzh.c(avun.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_ERROR_PARSING_RESPONSE, alfpVar.c.e);
                            }
                        } catch (IOException unused2) {
                            throw akzh.c(avun.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_ERROR_PARSING_RESPONSE, alfpVar.c.e);
                        }
                    }
                    throw new AssertionError("Null response headers");
                }
                throw akzh.c(avun.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_ERROR_RESPONSE_CODE, alfpVar.c.e);
            }
        }, anjk.a);
        anlz.A(i, new alfn(this, awynVar, str2), anjk.a);
        return i;
    }

    @Override // defpackage.algt
    public final aypx e() {
        return akxp.t;
    }

    @Override // defpackage.algt
    public final String f() {
        return "ScottyTransferTask";
    }

    @Override // defpackage.algt
    public final boolean h() {
        return true;
    }

    @Override // defpackage.aleo
    public final boolean i(alcw alcwVar) {
        int i = alcwVar.b;
        return ((i & 64) == 0 || (alcwVar.c & 1) == 0 || (i & 2) == 0) ? false : true;
    }

    @Override // defpackage.alfw, defpackage.aleo
    public final akzs k(Throwable th, alcw alcwVar, boolean z) {
        if (alht.l(alcwVar)) {
            akze akzeVar = this.g;
            alcu a2 = alcu.a(alcwVar.l);
            if (a2 == null) {
                a2 = alcu.UNKNOWN_UPLOAD;
            }
            akzeVar.c("ScottyTransferTask Fallback to Source", th, a2);
            alht alhtVar = this.d;
            avun avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_FALLBACK_TO_SOURCE;
            alct alctVar = alcwVar.H;
            if (alctVar == null) {
                alctVar = alct.a;
            }
            alctVar.getClass();
            return u(alhtVar.d(avunVar, alctVar, this.c.e, this.g), z, alfv.b);
        }
        if (th instanceof akzh) {
            akzh akzhVar = (akzh) th;
            if (akzhVar.b) {
                final Long l = (Long) this.l.get(alcwVar.k);
                if (l == null || l.longValue() <= alcwVar.G || akzhVar.c.isEmpty()) {
                    return t(n(alcwVar, akzhVar), z);
                }
                aopa createBuilder = alct.a.createBuilder();
                createBuilder.copyOnWrite();
                alct alctVar2 = (alct) createBuilder.instance;
                alctVar2.c = 2;
                alctVar2.b |= 1;
                long c = this.b.c();
                long longValue = ((Long) akzhVar.c.get(0)).longValue();
                createBuilder.copyOnWrite();
                alct alctVar3 = (alct) createBuilder.instance;
                alctVar3.b |= 8;
                alctVar3.f = c + longValue;
                createBuilder.copyOnWrite();
                alct alctVar4 = (alct) createBuilder.instance;
                alctVar4.b |= 4;
                alctVar4.e = 1;
                avun avunVar2 = akzhVar.a;
                createBuilder.copyOnWrite();
                alct alctVar5 = (alct) createBuilder.instance;
                alctVar5.d = avunVar2.aB;
                alctVar5.b |= 2;
                return u((alct) createBuilder.mo39build(), z, new ayqb() { // from class: alfm
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        Long l2 = l;
                        aopa aopaVar = (aopa) obj;
                        Charset charset = alfp.a;
                        long longValue2 = l2.longValue();
                        aopaVar.copyOnWrite();
                        alcw alcwVar2 = (alcw) aopaVar.instance;
                        alcw alcwVar3 = alcw.a;
                        alcwVar2.c |= 4;
                        alcwVar2.G = longValue2;
                    }
                });
            }
        }
        return super.k(th, alcwVar, z);
    }

    public final void s(String str, awyp awypVar, double d) {
        awxx c = awypVar.c();
        long j = 0;
        long e = c != null ? c.e() : 0L;
        if (c != null) {
            j = c.a();
        }
        long j2 = j == -1 ? -1L : j;
        this.l.put(str, Long.valueOf(e));
        this.e.f(str, e, j2, d);
    }
}
