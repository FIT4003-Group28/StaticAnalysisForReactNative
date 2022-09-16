package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: hip  reason: default package */
/* loaded from: classes3.dex */
public final class hip {
    public final aafo a;
    public hzr b;
    private final ajxz c;
    private final gfu d;
    private final acth e;

    public hip(aafo aafoVar, ajxz ajxzVar, acth acthVar, gfu gfuVar) {
        this.a = aafoVar;
        this.c = ajxzVar;
        this.d = gfuVar;
        this.e = acthVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(dt dtVar, atep atepVar) {
        if (this.b != null) {
            return;
        }
        hzr aH = hzr.aH(atepVar, this.c, this.d, this.e);
        this.b = aH;
        aH.af = new akbe() { // from class: hio
            @Override // defpackage.akbe
            public final void a(aten atenVar) {
                hip hipVar = hip.this;
                HashMap hashMap = new HashMap();
                hashMap.put(actk.b, Boolean.TRUE);
                if (abgc.e(atenVar) != null) {
                    hipVar.a.c(abgc.e(atenVar), hashMap);
                } else if (abgc.d(atenVar) == null) {
                } else {
                    hipVar.a.c(abgc.d(atenVar), hashMap);
                }
            }
        };
        this.b.X.c(new f() { // from class: com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search.PivotMenuBottomSheetController$1
            @Override // defpackage.f, defpackage.g
            public final /* synthetic */ void kG(apy apyVar) {
            }

            @Override // defpackage.f, defpackage.g
            public final /* synthetic */ void lc(apy apyVar) {
            }

            @Override // defpackage.f, defpackage.g
            public final void ld(apy apyVar) {
                hip.this.b = null;
            }

            @Override // defpackage.g
            public final /* synthetic */ void nA(apy apyVar) {
            }

            @Override // defpackage.g
            public final /* synthetic */ void nv(apy apyVar) {
            }

            @Override // defpackage.f, defpackage.g
            public final /* synthetic */ void nz(apy apyVar) {
            }
        });
        this.b.qv(dtVar.getSupportFragmentManager(), null);
    }
}
