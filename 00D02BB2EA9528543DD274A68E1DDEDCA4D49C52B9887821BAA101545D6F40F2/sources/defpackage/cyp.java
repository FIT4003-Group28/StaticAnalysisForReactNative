package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cyp  reason: default package */
/* loaded from: classes5.dex */
public final class cyp implements btzi<dhkf, dhkh> {
    public final dqmr a;
    public final gga b;
    private final cztz c;
    private final btrm d;

    public cyp(dqmr dqmrVar, gga ggaVar, cztz cztzVar, btrm btrmVar) {
        this.a = dqmrVar;
        this.b = ggaVar;
        this.c = cztzVar;
        this.d = btrmVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dhkf> btzrVar, btzy btzyVar) {
        cztq a = cztt.a(this.c);
        a.c = this.b.getString(R.string.AD_BLOCKING_SERVER_ERROR_MESSAGE);
        a.d(cztr.LONG);
        a.f(this.b.getString(R.string.GENERIC_TRY_AGAIN_BUTTON), new cyo(this));
        a.c();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dhkf> btzrVar, dhkh dhkhVar) {
        this.d.b(new cxd(this.a.b));
    }
}
