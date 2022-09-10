package defpackage;

import android.view.MotionEvent;
import com.google.geo.imagery.viewer.api.PhotoHandle;
import com.google.geo.imagery.viewer.api.Renderer;
import com.google.geo.imagery.viewer.api.RendererSwigJNI;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dfra  reason: default package */
/* loaded from: classes6.dex */
public final class dfra extends dfqz {
    private final dfum l;
    @dzsi
    private dfsg m;
    private final dhjz n;

    public dfra(Executor executor, Executor executor2, @dzsi dfua dfuaVar, dfuk dfukVar, dfuh dfuhVar, dfrr dfrrVar, dfrh dfrhVar, dfum dfumVar, List<dfqz> list, @dzsi dfqt dfqtVar) {
        super(executor, executor2, dfuaVar, dfukVar, dfuhVar, dfrrVar, dfrhVar, list, dfqtVar);
        this.l = dfumVar;
        this.m = null;
        dhjz dhjzVar = this.e.e.b;
        this.n = dhjzVar == null ? dhjz.e : dhjzVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dfqz
    public final void b(PhotoHandle photoHandle, @dzsi dfqt dfqtVar) {
        dfuj<?> dfujVar;
        dhjx dhjxVar;
        dfsg dfsgVar = this.m;
        synchronized (this.k) {
            dfujVar = this.j;
        }
        if (dfujVar == null || dfsgVar == null) {
            return;
        }
        if (dfqtVar != null) {
            int a = dfse.a(dfsgVar.b);
            if (a == 0) {
                a = 1;
            }
            dhjz dhjzVar = dfujVar.a.c;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            dfqtVar.c(a, dhjzVar);
        }
        dhjw bZ = dhjx.f.bZ();
        dhjz dhjzVar2 = dfujVar.a.c;
        if (dhjzVar2 == null) {
            dhjzVar2 = dhjz.e;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjx dhjxVar2 = (dhjx) bZ.b;
        dhjzVar2.getClass();
        dhjxVar2.b = dhjzVar2;
        dhjxVar2.a |= 1;
        dhjx dhjxVar3 = dfsgVar.d;
        if (dhjxVar3 == null) {
            dhjxVar3 = dhjx.f;
        }
        if ((1 & dhjxVar3.a) != 0) {
            dhkb dhkbVar = this.e.e.c;
            if (dhkbVar == null) {
                dhkbVar = dhkb.e;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjx dhjxVar4 = (dhjx) bZ.b;
            dhkbVar.getClass();
            dhjxVar4.c = dhkbVar;
            dhjxVar4.a |= 2;
            dfua dfuaVar = this.d;
            if (dfuaVar != null) {
                dhjx bK = bZ.bK();
                dhjx dhjxVar5 = dfsgVar.d;
                if (dhjxVar5 == null) {
                    dhjxVar5 = dhjx.f;
                }
                dhjz dhjzVar3 = dhjxVar5.b;
                if (dhjzVar3 == null) {
                    dhjzVar3 = dhjz.e;
                }
                synchronized (dfuaVar.b) {
                    Renderer renderer = dfuaVar.a;
                    dhjxVar = null;
                    if (renderer != null) {
                        byte[] Renderer_computeRelativeOrientation = RendererSwigJNI.Renderer_computeRelativeOrientation(renderer.a, renderer, bK == null ? null : bK.bS(), dhjzVar3 == null ? null : dhjzVar3.bS());
                        if (Renderer_computeRelativeOrientation != null) {
                            try {
                                dhjxVar = (dhjx) dsqw.cq(dhjx.f, Renderer_computeRelativeOrientation);
                            } catch (dsrm e) {
                                throw new RuntimeException("Unable to parse com.google.maps.geom.Camera protocol message.", e);
                            }
                        }
                    }
                }
                if (dhjxVar != null) {
                    dhkb dhkbVar2 = dhjxVar.c;
                    if (dhkbVar2 == null) {
                        dhkbVar2 = dhkb.e;
                    }
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dhjx dhjxVar6 = (dhjx) bZ.b;
                    dhkbVar2.getClass();
                    dhjxVar6.c = dhkbVar2;
                    dhjxVar6.a |= 2;
                }
            }
        }
        int a2 = dfse.a(dfsgVar.b);
        if (a2 != 0 && a2 == 9) {
            dhjx dhjxVar7 = dfsgVar.d;
            if (dhjxVar7 == null) {
                dhjxVar7 = dhjx.f;
            }
            dfrr dfrrVar = this.e;
            dhkb dhkbVar3 = dhjxVar7.c;
            if (dhkbVar3 == null) {
                dhkbVar3 = dhkb.e;
            }
            float f = dhkbVar3.b;
            dhkb dhkbVar4 = ((dhjx) dfrrVar.d.b).c;
            if (dhkbVar4 == null) {
                dhkbVar4 = dhkb.e;
            }
            float abs = Math.abs(dfug.f(dhkbVar4.b, f));
            if (abs > 10.0f && abs < 150.0f) {
                dhkb dhkbVar5 = dhjxVar7.c;
                if (dhkbVar5 == null) {
                    dhkbVar5 = dhkb.e;
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dhjx dhjxVar8 = (dhjx) bZ.b;
                dhkbVar5.getClass();
                dhjxVar8.c = dhkbVar5;
                dhjxVar8.a |= 2;
            }
        }
        int a3 = dftl.a(dfujVar.a.m);
        if (a3 != 0 && a3 == 3) {
            dhkb dhkbVar6 = dfujVar.a.d;
            if (dhkbVar6 == null) {
                dhkbVar6 = dhkb.e;
            }
            dsqp dsqpVar = (dsqp) dhkbVar6.cu(5);
            dsqpVar.bC(dhkbVar6);
            dhka dhkaVar = (dhka) dsqpVar;
            if (dhkaVar.c) {
                dhkaVar.bF();
                dhkaVar.c = false;
            }
            dhkb dhkbVar7 = (dhkb) dhkaVar.b;
            dhkbVar7.a &= -5;
            dhkbVar7.d = 0.0f;
            dhkb bK2 = dhkaVar.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjx dhjxVar9 = (dhjx) bZ.b;
            bK2.getClass();
            dhjxVar9.c = bK2;
            dhjxVar9.a |= 2;
        }
        dhjz dhjzVar4 = this.e.e.b;
        if (dhjzVar4 == null) {
            dhjzVar4 = dhjz.e;
        }
        float c = (float) dfug.c(dhjzVar4, this.n);
        int a4 = dftl.a(dfujVar.a.m);
        if (a4 == 0 || a4 != 3) {
            this.i.b(photoHandle, bZ.bK(), 750L, e(dfqtVar, dfujVar, c));
            return;
        }
        dfrh dfrhVar = this.i;
        dhjx bK3 = bZ.bK();
        Runnable e2 = e(dfqtVar, dfujVar, c);
        dfrhVar.g();
        dfrhVar.e();
        if (!dfrhVar.j.c()) {
            dfrhVar.h(photoHandle, bK3, e2);
        } else {
            dfrhVar.i(photoHandle, bK3, e2, 750L, true);
        }
    }

    @Override // defpackage.dfqz
    public final void d() {
        this.m = null;
    }

    public final boolean f(MotionEvent motionEvent, int i) {
        dfua dfuaVar = this.d;
        if (dfuaVar != null && !dfuaVar.d()) {
            dfsg c = this.d.c(this.e.e, motionEvent.getX(), motionEvent.getY(), i, this.l.a());
            this.m = c;
            if (c == null || (c.a & 2) == 0) {
                c();
            } else {
                dftd dftdVar = c.c;
                if (dftdVar == null) {
                    dftdVar = dftd.d;
                }
                dhjx dhjxVar = c.d;
                if (dhjxVar == null) {
                    dhjxVar = dhjx.f;
                }
                dhjz dhjzVar = dhjxVar.b;
                if (dhjzVar == null) {
                    dhjzVar = dhjz.e;
                }
                return a(dftdVar, dhjzVar);
            }
        }
        return false;
    }
}
