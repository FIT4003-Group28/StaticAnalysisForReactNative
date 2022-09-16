package com.google.android.apps.youtube.app.player.overlay.accessibility;

import android.accessibilityservice.AccessibilityServiceInfo;
import com.google.android.apps.youtube.app.player.overlay.accessibility.AccessibilityEventLogger$LifecycleObserver;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccessibilityEventLogger$LifecycleObserver implements f {
    public final /* synthetic */ kjm a;
    private aypg b;

    public AccessibilityEventLogger$LifecycleObserver(kjm kjmVar) {
        this.a = kjmVar;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        aypg aypgVar = this.b;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
            this.b = null;
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.b = this.a.b.a().aa(new ayqb() { // from class: kjl
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ahxu ahxuVar = (ahxu) obj;
                kjm kjmVar = AccessibilityEventLogger$LifecycleObserver.this.a;
                amuk o = amuk.o(zdg.a(kjmVar.c.a).getEnabledAccessibilityServiceList(-1));
                int size = o.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    i |= ((AccessibilityServiceInfo) o.get(i2)).feedbackType;
                }
                TreeSet treeSet = new TreeSet();
                while (i != 0) {
                    int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i);
                    aovv aovvVar = aovv.a;
                    if (numberOfTrailingZeros == 1) {
                        aovvVar = aovv.e;
                    } else if (numberOfTrailingZeros == 2) {
                        aovvVar = aovv.d;
                    } else if (numberOfTrailingZeros == 4) {
                        aovvVar = aovv.b;
                    } else if (numberOfTrailingZeros == 8) {
                        aovvVar = aovv.f;
                    } else if (numberOfTrailingZeros == 16) {
                        aovvVar = aovv.c;
                    } else if (numberOfTrailingZeros == 32) {
                        aovvVar = aovv.g;
                    }
                    treeSet.add(aovvVar);
                    i &= numberOfTrailingZeros ^ (-1);
                }
                arrf a = arrh.a();
                aovw a2 = aovx.a();
                a2.copyOnWrite();
                aovx.c((aovx) a2.instance, treeSet);
                a.copyOnWrite();
                ((arrh) a.instance).bR((aovx) a2.mo39build());
                kjmVar.a.c((arrh) a.mo39build());
            }
        }, kjt.b);
    }
}
