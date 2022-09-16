package defpackage;

import android.os.Bundle;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bbcx  reason: default package */
/* loaded from: classes3.dex */
public final class bbcx extends bbea<bbng> {
    public bwqv c;
    public bbox d;
    private bbow g;

    @Override // defpackage.ges
    protected final void Nv() {
        ((bbcy) btsx.b(bbcy.class, this)).cD(this);
    }

    @Override // defpackage.bbea
    protected final cqiw<bbng> bn() {
        return new bbjl();
    }

    @Override // defpackage.bbea
    protected final /* bridge */ /* synthetic */ bbng bo() {
        return this.g;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null && (bundle = this.o) == null) {
            bundle = new Bundle();
        }
        try {
            bwrs e = this.c.e(ilo.class, bundle, "pm");
            bbox bboxVar = this.d;
            dbsk.s(e);
            Runnable runnable = new Runnable(this) { // from class: bbcw
                private final bbcx a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    gn gnVar = this.a.A;
                    if (gnVar != null) {
                        gnVar.f();
                    }
                }
            };
            gga a = bboxVar.a.a();
            bbox.a(a, 1);
            dxio a2 = ((dxjh) bboxVar.b).a();
            bbox.a(a2, 2);
            cqhn a3 = bboxVar.c.a();
            bbox.a(a3, 3);
            bbpm a4 = bboxVar.d.a();
            bbox.a(a4, 4);
            cztz a5 = bboxVar.e.a();
            bbox.a(a5, 5);
            btvo a6 = bboxVar.f.a();
            bbox.a(a6, 6);
            bbox.a(e, 7);
            bbox.a(runnable, 8);
            this.g = new bbow(a, a2, a3, a4, a5, a6, e, runnable);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbea
    public final cqjg w() {
        return bbjl.a;
    }
}
