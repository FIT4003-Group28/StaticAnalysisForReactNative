package defpackage;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cttg  reason: default package */
/* loaded from: classes5.dex */
public final class cttg {
    private final csvf a;

    public cttg(csvf csvfVar) {
        this.a = csvfVar;
    }

    public static dxvs a(ContactId contactId) {
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        int i = contactId.c().ordinal() != 1 ? 18 : 3;
        dxvr bZ = dxvs.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dxvs) bZ.b).a = eacq.a(i);
        String a = contactId.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        a.getClass();
        ((dxvs) bZ.b).b = a;
        String b = contactId.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        b.getClass();
        ((dxvs) bZ.b).c = b;
        return bZ.bK();
    }

    public static final dehn<String> c(final csun csunVar, String str, String str2, UUID uuid) {
        final HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("ID", str);
        }
        if (str2 != null) {
            hashMap.put("APP_NAME", str2);
        }
        if (uuid != null) {
            hashMap.put("REQUEST_ID", uuid.toString());
        }
        String valueOf = String.valueOf(hashMap);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("DroidGuard Args: ");
        sb.append(valueOf);
        sb.toString();
        cstl.a("RegReqBuilder");
        return csvs.b(new Callable(csunVar, hashMap) { // from class: ctte
            private final csun a;
            private final Map b;

            {
                this.a = csunVar;
                this.b = hashMap;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object a;
                csun csunVar2 = this.a;
                Map map = this.b;
                Context applicationContext = ((aqau) ((aqap) csunVar2).a).a.getApplicationContext();
                cxju.c(applicationContext);
                cnzu cnzuVar = new cnzu(new cnzw(applicationContext), map);
                cnwc.i("This method must not be called on the main thread.");
                coad coadVar = cnzuVar.c.a;
                cnzuVar.e.c(2, coak.COARSE);
                coadVar.a.offer(cnzuVar);
                coadVar.c.post(coadVar);
                try {
                    a = cnzuVar.b.b(cnzuVar.d.a());
                    if (a == null) {
                        int a2 = cnzuVar.d.a();
                        StringBuilder sb2 = new StringBuilder(23);
                        sb2.append("timeout: ");
                        sb2.append(a2);
                        sb2.append(" ms");
                        a = cnzuVar.a(sb2.toString());
                    }
                } catch (InterruptedException unused) {
                    int a3 = cnzuVar.d.a();
                    StringBuilder sb3 = new StringBuilder(44);
                    sb3.append("takeWithTimeout(");
                    sb3.append(a3);
                    sb3.append(") got interrupted");
                    a = cnzuVar.a(sb3.toString());
                }
                return (String) a;
            }
        });
    }

    public static final dehn<String> d(final csuo csuoVar) {
        cstq.a();
        return deha.f(new deff(csuoVar) { // from class: cttd
            private final csuo a;

            {
                this.a = csuoVar;
            }

            @Override // defpackage.deff
            public final dehn a() {
                final csuo csuoVar2 = this.a;
                return csvs.b(new Callable(csuoVar2) { // from class: cttf
                    private final csuo a;

                    {
                        this.a = csuoVar2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        try {
                            return this.a.a();
                        } catch (Exception e) {
                            throw new ctsx(e);
                        }
                    }
                });
            }
        }, dege.a);
    }

    public final dxur b(String str, String str2, String str3, PublicKey publicKey) {
        dxuq bZ = dxur.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxur dxurVar = (dxur) bZ.b;
        str.getClass();
        dxurVar.b = str;
        str2.getClass();
        dxurVar.g = str2;
        String languageTag = Locale.getDefault().toLanguageTag();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        languageTag.getClass();
        ((dxur) bZ.b).e = languageTag;
        List<Integer> c = this.a.c();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxur dxurVar2 = (dxur) bZ.b;
        dsrf dsrfVar = dxurVar2.f;
        if (!dsrfVar.a()) {
            dxurVar2.f = dsqw.cg(dsrfVar);
        }
        dsod.bv(c, dxurVar2.f);
        dxvp bZ2 = dxvq.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        str.getClass();
        ((dxvq) bZ2.b).b = str;
        ((dxvq) bZ2.b).a = eacp.a(3);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxvq bK = bZ2.bK();
        bK.getClass();
        ((dxur) bZ.b).a = bK;
        dxwd bZ3 = dxwe.c.bZ();
        dspd x = dspd.x(publicKey.getEncoded());
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        x.getClass();
        ((dxwe) bZ3.b).b = x;
        ((dxwe) bZ3.b).a = eacu.a(4);
        dxwe bK2 = bZ3.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxur dxurVar3 = (dxur) bZ.b;
        bK2.getClass();
        dxurVar3.c = bK2;
        if (str3 != null) {
            str3.getClass();
            dxurVar3.d = str3;
        }
        return bZ.bK();
    }
}
