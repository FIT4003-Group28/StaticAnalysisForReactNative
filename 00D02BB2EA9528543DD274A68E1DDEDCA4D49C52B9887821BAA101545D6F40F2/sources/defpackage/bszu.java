package defpackage;

import androidx.preference.Preference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bszu  reason: default package */
/* loaded from: classes4.dex */
public final class bszu implements ckcx {
    final /* synthetic */ Preference a;
    final /* synthetic */ bszv b;

    public bszu(bszv bszvVar, Preference preference) {
        this.b = bszvVar;
        this.a = preference;
    }

    @Override // defpackage.ckcx
    public final void a(ddyf ddyfVar) {
        Preference preference = this.a;
        String str = preference.q;
        if (str == null) {
            String valueOf = String.valueOf(preference.u());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 6);
            sb.append("title=");
            sb.append(valueOf);
            str = sb.toString();
        }
        int b = this.b.aR().b();
        if (ddyfVar.c) {
            ddyfVar.bF();
            ddyfVar.c = false;
        }
        ddyq ddyqVar = (ddyq) ddyfVar.b;
        ddyq ddyqVar2 = ddyq.K;
        int i = ddyqVar.a | 33554432;
        ddyqVar.a = i;
        ddyqVar.v = b;
        str.getClass();
        ddyqVar.a = 67108864 | i;
        ddyqVar.w = str;
    }
}
