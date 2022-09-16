package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bpcp  reason: default package */
/* loaded from: classes3.dex */
public class bpcp extends ivn {
    final /* synthetic */ bpcq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpcp(bpcq bpcqVar, String str, String str2) {
        super(str, 1, str2, bpcqVar.g.getString(R.string.REPORT_MAP_ISSUE_SUBMIT), cjtd.a(dtya.ae), cjtd.a(dtya.af), true, true, false, true);
        this.a = bpcqVar;
    }

    @Override // defpackage.ivn, defpackage.jbk
    public jib NC() {
        jhz e = super.NC().e();
        e.x = false;
        return e.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ivn
    public final void a() {
        bpcq bpcqVar = this.a;
        if (bpcqVar.f.aD) {
            bpcqVar.h.b(bpcqVar.u(true));
        }
    }

    @Override // defpackage.ivn, defpackage.jbh
    public void b(cjqm cjqmVar) {
        if (this.a.f.S()) {
            jmw.d(this.a.g, new bpco(this));
        } else {
            this.a.d();
        }
    }
}
