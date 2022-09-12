package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfcr  reason: default package */
/* loaded from: classes3.dex */
public final class bfcr implements degu<dpri> {
    final /* synthetic */ bfcs a;

    public bfcr(bfcs bfcsVar) {
        this.a = bfcsVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        gga ggaVar = this.a.a;
        if (!ggaVar.aZ) {
            return;
        }
        cjxu.i(ggaVar, ggaVar.getString(R.string.LOCAL_FOLLOW_FAILURE_MESSAGE));
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dpri dpriVar) {
        this.a.u();
        this.a.c.h();
        this.a.b.execute(new Runnable(this) { // from class: bfcq
            private final bfcr a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bfcr bfcrVar = this.a;
                bfcs bfcsVar = bfcrVar.a;
                bwrs<ilo> bwrsVar = bfcsVar.h;
                if (bwrsVar != null && bfcsVar.d.b(bwrsVar)) {
                    bfcrVar.a.e.y(true);
                    bfbj bfbjVar = bfcrVar.a.i;
                    if (bfbjVar == null) {
                        return;
                    }
                    bfbjVar.m(true);
                    return;
                }
                bfcs bfcsVar2 = bfcrVar.a;
                if (bfcsVar2.g == null) {
                    return;
                }
                bfdf bfdfVar = bfcrVar.a.g;
                dbsk.s(bfdfVar);
                bfcsVar2.f.a().a(bfdfVar);
            }
        });
    }
}
