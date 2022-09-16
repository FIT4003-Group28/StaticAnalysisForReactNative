package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: xkl  reason: default package */
/* loaded from: classes4.dex */
public final class xkl implements aavf {
    public final aafo a;
    public xmc b;
    public dh c;
    public String d;
    private final WeakReference e;
    private final akfg f;

    public xkl(xkm xkmVar, aafo aafoVar, akfg akfgVar) {
        this.e = new WeakReference(xkmVar);
        this.a = aafoVar;
        this.f = akfgVar;
    }

    @Override // defpackage.aavf
    public final /* synthetic */ aavi a() {
        return null;
    }

    @Override // defpackage.aavf
    public final Long b() {
        return null;
    }

    @Override // defpackage.aavf
    public final String c() {
        return this.d;
    }

    @Override // defpackage.aavf
    public final void d() {
        this.c.ku();
    }

    @Override // defpackage.aavf
    public final void e(cff cffVar) {
        xkm xkmVar = (xkm) this.e.get();
        if (xkmVar == null) {
            return;
        }
        zag.q(xkmVar.a, R.string.error_post_failed, 1);
    }

    @Override // defpackage.aavf
    public final void f(arnz arnzVar) {
        aqbw aqbwVar;
        aqav aqavVar;
        aqbw aqbwVar2;
        aqbw aqbwVar3;
        xkm xkmVar = (xkm) this.e.get();
        arag aragVar = null;
        if (xkmVar != null) {
            xkmVar.d = null;
        }
        aroa aroaVar = arnzVar.d;
        if (aroaVar == null) {
            aroaVar = aroa.a;
        }
        if (aroaVar.b == 62285833) {
            aqbwVar = (aqbw) aroaVar.c;
        } else {
            aqbwVar = aqbw.a;
        }
        if ((aqbwVar.b & 1) != 0) {
            aroa aroaVar2 = arnzVar.d;
            if (aroaVar2 == null) {
                aroaVar2 = aroa.a;
            }
            if (aroaVar2.b == 62285833) {
                aqbwVar3 = (aqbw) aroaVar2.c;
            } else {
                aqbwVar3 = aqbw.a;
            }
            aqax aqaxVar = aqbwVar3.c;
            if (aqaxVar == null) {
                aqaxVar = aqax.a;
            }
            if (aqaxVar.b == 62285947) {
                aqavVar = (aqav) aqaxVar.c;
            } else {
                aqavVar = aqav.a;
            }
        } else {
            aqavVar = null;
        }
        dh dhVar = this.c;
        if (dhVar != null) {
            dhVar.ku();
            this.c = null;
        }
        xmc xmcVar = this.b;
        if (xmcVar != null && aqavVar != null) {
            aroa aroaVar3 = arnzVar.d;
            if (aroaVar3 == null) {
                aroaVar3 = aroa.a;
            }
            if (aroaVar3.b == 62285833) {
                aqbwVar2 = (aqbw) aroaVar3.c;
            } else {
                aqbwVar2 = aqbw.a;
            }
            xmcVar.a(aqbwVar2, false);
        }
        if ((arnzVar.b & 4) != 0) {
            arnh arnhVar = arnzVar.f;
            if (arnhVar == null) {
                arnhVar = arnh.a;
            }
            int I = akpq.I(arnhVar.c);
            if (I == 0 || I != 2) {
                return;
            }
            arnh arnhVar2 = arnzVar.f;
            if (arnhVar2 == null) {
                arnhVar2 = arnh.a;
            }
            arag aragVar2 = arnhVar2.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            Spanned b = ajgl.b(aragVar2);
            if (TextUtils.isEmpty(b)) {
                return;
            }
            final arnh arnhVar3 = arnzVar.f;
            if (arnhVar3 == null) {
                arnhVar3 = arnh.a;
            }
            akfh l = this.f.l();
            l.k(b);
            l.j(false);
            apok apokVar = arnhVar3.h;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            if ((apokVar.b & 1) != 0) {
                apok apokVar2 = arnhVar3.h;
                if (apokVar2 == null) {
                    apokVar2 = apok.a;
                }
                apoj apojVar = apokVar2.c;
                if (apojVar == null) {
                    apojVar = apoj.a;
                }
                if ((apojVar.b & 256) != 0) {
                    apok apokVar3 = arnhVar3.h;
                    if (apokVar3 == null) {
                        apokVar3 = apok.a;
                    }
                    apoj apojVar2 = apokVar3.c;
                    if (apojVar2 == null) {
                        apojVar2 = apoj.a;
                    }
                    aragVar = apojVar2.i;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                }
                l.m(ajgl.b(aragVar), new View.OnClickListener() { // from class: xkk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        xkl xklVar = xkl.this;
                        arnh arnhVar4 = arnhVar3;
                        aafo aafoVar = xklVar.a;
                        apok apokVar4 = arnhVar4.h;
                        if (apokVar4 == null) {
                            apokVar4 = apok.a;
                        }
                        apoj apojVar3 = apokVar4.c;
                        if (apojVar3 == null) {
                            apojVar3 = apoj.a;
                        }
                        apzg apzgVar = apojVar3.o;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        aafoVar.c(apzgVar, null);
                    }
                });
            }
            this.f.n(l.b());
        }
    }
}
