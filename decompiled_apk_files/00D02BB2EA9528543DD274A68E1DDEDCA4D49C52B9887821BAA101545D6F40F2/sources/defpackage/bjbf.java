package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bjbf  reason: default package */
/* loaded from: classes3.dex */
public final class bjbf implements bkal {
    final /* synthetic */ bjbg a;

    public bjbf(bjbg bjbgVar) {
        this.a = bjbgVar;
    }

    @Override // defpackage.bkal
    public final void a(dqcq dqcqVar, int i) {
        bjbg bjbgVar = this.a;
        if (i == 1) {
            dqcqVar = null;
        }
        bjbgVar.c(dqcqVar);
    }

    @Override // defpackage.bkal
    public final CharSequence b(dqcq dqcqVar, int i) {
        return this.a.a.getString(R.string.PLACE_QA_FILTER_BY_TAG_DESCRIPTION, new Object[]{dqcqVar.a});
    }

    @Override // defpackage.bkal
    public final cjtd c(int i) {
        cjta c = cjtd.c(this.a.b);
        c.d = i == 1 ? dtxl.K : dtxl.L;
        return c.a();
    }
}
