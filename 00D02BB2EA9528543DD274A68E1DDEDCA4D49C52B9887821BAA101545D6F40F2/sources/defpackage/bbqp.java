package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bbqp  reason: default package */
/* loaded from: classes3.dex */
abstract class bbqp {
    private static final int b = (int) TimeUnit.DAYS.toSeconds(3);
    protected final String a;
    private final bbvh c;
    private final dbsg<String> d;
    private final String e;
    private final dbsg<Integer> f;
    private final boolean g;

    /* JADX INFO: Access modifiers changed from: protected */
    public bbqp(bbvh bbvhVar, dbsg<String> dbsgVar, String str, String str2, dbsg<Integer> dbsgVar2, boolean z) {
        this.c = bbvhVar;
        this.d = dbsgVar;
        this.a = str;
        this.e = str2;
        this.f = dbsgVar2;
        this.g = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(cruz cruzVar, bbqa bbqaVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b(cruz cruzVar, bbqe bbqeVar, bbqd bbqdVar);

    protected abstract void c(crtl crtlVar, bbvh bbvhVar);

    public final crts d(Context context, dwyd dwydVar, List<Integer> list, crwb crwbVar) {
        crtl bZ = crts.r.bZ();
        dbsg<Integer> dbsgVar = this.f;
        boolean z = this.g;
        String valueOf = String.valueOf(dwydVar.name().toLowerCase(Locale.ENGLISH));
        bZ.a(valueOf.length() != 0 ? "gmm_entry_point:".concat(valueOf) : new String("gmm_entry_point:"));
        String valueOf2 = String.valueOf(String.format(Locale.US, "%s (#%s)", bvoc.a(context), Long.valueOf(bvoc.c(context))));
        bZ.a(valueOf2.length() != 0 ? "agmm_version:".concat(valueOf2) : new String("agmm_version:"));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        crts crtsVar = (crts) bZ.b;
        crtsVar.a |= 32;
        crtsVar.g = z;
        for (Integer num : list) {
            int intValue = num.intValue();
            StringBuilder sb = new StringBuilder(29);
            sb.append("gmm_experiment_id:");
            sb.append(intValue);
            bZ.a(sb.toString());
        }
        if (!crwbVar.u) {
            crtm bZ2 = crtp.d.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            crtp crtpVar = (crtp) bZ2.b;
            crtpVar.b = 1;
            crtpVar.a |= 1;
            int intValue2 = dbsgVar.c(Integer.valueOf(b)).intValue();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            crtp crtpVar2 = (crtp) bZ2.b;
            crtpVar2.a |= 2;
            crtpVar2.c = intValue2;
            crtp bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            crts crtsVar2 = (crts) bZ.b;
            bK.getClass();
            crtsVar2.n = bK;
            crtsVar2.a |= 512;
        }
        bbvh bbvhVar = this.c;
        ilo a = bbvhVar.a();
        akqi ai = a.ai();
        if (ai != null && !ai.equals(akqi.a)) {
            dgrg bZ3 = dgrh.d.bZ();
            long j = ai.b;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dgrh dgrhVar = (dgrh) bZ3.b;
            int i = dgrhVar.a | 1;
            dgrhVar.a = i;
            dgrhVar.b = j;
            long j2 = ai.c;
            dgrhVar.a = i | 2;
            dgrhVar.c = j2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            crts crtsVar3 = (crts) bZ.b;
            dgrh bK2 = bZ3.bK();
            bK2.getClass();
            crtsVar3.e = bK2;
            crtsVar3.a |= 8;
        }
        String cG = a.cG();
        if (!dbsj.d(cG)) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            crts crtsVar4 = (crts) bZ.b;
            cG.getClass();
            crtsVar4.a |= 2048;
            crtsVar4.p = cG;
        }
        if (a.aj() != null) {
            akqq aj = a.aj();
            dgpn bZ4 = dgpo.e.bZ();
            double d = aj.a;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dgpo dgpoVar = (dgpo) bZ4.b;
            int i2 = dgpoVar.a | 1;
            dgpoVar.a = i2;
            dgpoVar.b = d;
            double d2 = aj.b;
            dgpoVar.a = i2 | 2;
            dgpoVar.c = d2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            crts crtsVar5 = (crts) bZ.b;
            dgpo bK3 = bZ4.bK();
            bK3.getClass();
            crtsVar5.d = bK3;
            crtsVar5.a |= 4;
        }
        dbsg<dgpu> b2 = bbvhVar.b();
        if (b2.a()) {
            dgpu b3 = b2.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            crts crtsVar6 = (crts) bZ.b;
            crtsVar6.k = b3.g;
            crtsVar6.a |= 128;
        }
        dbsg<crtr> c = bbvhVar.c();
        if (c.a()) {
            crtr b4 = c.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            crts crtsVar7 = (crts) bZ.b;
            b4.getClass();
            crtsVar7.m = b4;
            crtsVar7.a |= 256;
        }
        String str = this.a;
        dbsg<String> dbsgVar2 = this.d;
        String str2 = this.e;
        if (!str.isEmpty()) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            crts crtsVar8 = (crts) bZ.b;
            str.getClass();
            crtsVar8.a |= 16;
            crtsVar8.f = str;
            String valueOf3 = String.valueOf(dwye.CAPTION.name().toLowerCase(Locale.ENGLISH));
            bZ.a(valueOf3.length() != 0 ? "gmm_modification:".concat(valueOf3) : new String("gmm_modification:"));
        }
        if (dbsgVar2.a()) {
            String b5 = dbsgVar2.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            crts crtsVar9 = (crts) bZ.b;
            b5.getClass();
            crtsVar9.a |= 4096;
            crtsVar9.q = b5;
        }
        String valueOf4 = String.valueOf(str2);
        bZ.a(valueOf4.length() != 0 ? "agmm_provider:".concat(valueOf4) : new String("agmm_provider:"));
        String valueOf5 = String.valueOf(Locale.getDefault().getLanguage());
        bZ.a(valueOf5.length() != 0 ? "language:".concat(valueOf5) : new String("language:"));
        c(bZ, this.c);
        return bZ.bK();
    }
}
