package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: agvo  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agvo implements ampg {
    public final /* synthetic */ afvn a;
    private final /* synthetic */ int b;

    public /* synthetic */ agvo(afvn afvnVar, int i) {
        this.b = i;
        this.a = afvnVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            afvn afvnVar = this.a;
            SharedPreferences sharedPreferences = (SharedPreferences) obj;
            aopa createBuilder = awvb.a.createBuilder();
            String d = afvnVar.c().d();
            if (!TextUtils.isEmpty(d)) {
                String q = zhn.q("offline_auto_offline_time_%s", d);
                aopa createBuilder2 = awuz.a.createBuilder();
                long j = sharedPreferences.getLong(q, 0L);
                createBuilder2.copyOnWrite();
                awuz awuzVar = (awuz) createBuilder2.instance;
                awuzVar.b = 1 | awuzVar.b;
                awuzVar.c = j;
                createBuilder.bv(d, (awuz) createBuilder2.mo39build());
            }
            return (awvb) createBuilder.mo39build();
        }
        afvn afvnVar2 = this.a;
        SharedPreferences sharedPreferences2 = (SharedPreferences) obj;
        amvn amvnVar = fdl.a;
        aopa createBuilder3 = fda.a.createBuilder();
        sharedPreferences2.getClass();
        fdk fdkVar = new fdk(sharedPreferences2, 1);
        sharedPreferences2.getClass();
        fdk fdkVar2 = new fdk(sharedPreferences2, 2);
        sharedPreferences2.getClass();
        fdk fdkVar3 = new fdk(sharedPreferences2);
        sharedPreferences2.getClass();
        fdl.f(createBuilder3, fdkVar, fdkVar2, fdkVar3, new fdh(sharedPreferences2));
        String d2 = afvnVar2.c().d();
        if (!TextUtils.isEmpty(d2)) {
            String q2 = zhn.q("offline_access_enabled%s", d2);
            String q3 = zhn.q("offline_access_updated_at%s", d2);
            aopa createBuilder4 = fcv.a.createBuilder();
            boolean z = sharedPreferences2.getBoolean(q2, false);
            createBuilder4.copyOnWrite();
            fcv fcvVar = (fcv) createBuilder4.instance;
            fcvVar.b = 1 | fcvVar.b;
            fcvVar.c = z;
            long j2 = sharedPreferences2.getLong(q3, 0L);
            createBuilder4.copyOnWrite();
            fcv fcvVar2 = (fcv) createBuilder4.instance;
            fcvVar2.b |= 2;
            fcvVar2.d = j2;
            createBuilder3.i(d2, (fcv) createBuilder4.mo39build());
        }
        return (fda) createBuilder3.mo39build();
    }
}
