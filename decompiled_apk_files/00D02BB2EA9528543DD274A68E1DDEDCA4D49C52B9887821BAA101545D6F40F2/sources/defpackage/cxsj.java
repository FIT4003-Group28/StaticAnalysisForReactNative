package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cxsj  reason: default package */
/* loaded from: classes5.dex */
final class cxsj implements cpcl<Void> {
    final /* synthetic */ coxz a;
    final /* synthetic */ String b;
    final /* synthetic */ Context c;
    final /* synthetic */ String d;

    public cxsj(coxz coxzVar, String str, Context context, String str2) {
        this.a = coxzVar;
        this.b = str;
        this.c = context;
        this.d = str2;
    }

    @Override // defpackage.cpcl
    public final /* bridge */ /* synthetic */ void c(Void r6) {
        new coyf(this.a, this.b, this.c.getSharedPreferences("phenotype_shared_prefs", 0)).d(this.d, new cxsi());
    }
}
