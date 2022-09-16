package defpackage;

import android.text.Spanned;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: fwx  reason: default package */
/* loaded from: classes3.dex */
public final class fwx {
    public final fxc a;
    public final aafo b;
    public acti c = acti.l;
    public akai d;
    public fxi e;

    public fwx(fxc fxcVar, aafo aafoVar) {
        this.a = fxcVar;
        this.b = aafoVar;
    }

    private final void h(boolean z) {
        if (!this.a.h() || !this.a.b().h()) {
            return;
        }
        this.a.d(z);
        fxb fxbVar = (fxb) this.a.b().c();
        if (fxbVar.d.h()) {
            ((akev) fxbVar.d.c()).le(fxbVar, 3);
        }
        if (fxbVar.h != 2 || !e()) {
            return;
        }
        this.e.d(false);
    }

    public final void a() {
        h(false);
    }

    public final void b() {
        h(true);
    }

    public final void c(FrameLayout frameLayout, akai akaiVar, fxi fxiVar, acti actiVar) {
        if (this.a.h()) {
            a();
        }
        this.d = akaiVar;
        this.e = fxiVar;
        this.c = actiVar;
        this.a.e(frameLayout);
    }

    public final boolean d() {
        return this.d != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return this.e != null;
    }

    public final void f(final fxb fxbVar, boolean z) {
        if (!d()) {
            return;
        }
        Object f = this.a.b().f();
        if (this.a.h()) {
            if (fxbVar == f) {
                return;
            }
            a();
        }
        this.a.g(fxbVar, z);
        if (!this.a.a().h()) {
            throw new IllegalStateException("Click target is not available for pill");
        }
        if (fxbVar != f) {
            ((View) this.a.a().c()).setOnClickListener(new View.OnClickListener() { // from class: fww
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fwx fwxVar = fwx.this;
                    fxb fxbVar2 = fxbVar;
                    if (fxbVar2.e.h()) {
                        ((View.OnClickListener) fxbVar2.e.c()).onClick(view);
                    }
                    int i = fxbVar2.h;
                    int i2 = i - 1;
                    if (i != 0) {
                        if (i2 == 1) {
                            if (!fwxVar.e()) {
                                return;
                            }
                            fwxVar.e.mT();
                            fwxVar.b();
                            return;
                        } else if (i2 == 4) {
                            if (!fxbVar2.c.h()) {
                                return;
                            }
                            fwxVar.b.c((apzg) fxbVar2.c.c(), null);
                            return;
                        } else {
                            akai akaiVar = fwxVar.d;
                            if (akaiVar == null) {
                                return;
                            }
                            akaiVar.ll();
                            return;
                        }
                    }
                    throw null;
                }
            });
        }
        if (fxbVar.h == 2 && e()) {
            this.e.d(true);
        }
        if (!fxbVar.d.h()) {
            return;
        }
        ((akev) fxbVar.d.c()).lf(fxbVar);
    }

    public final fxb g(final aqgu aqguVar) {
        int i;
        arag aragVar;
        avgj avgjVar;
        fxa fxaVar;
        arhr arhrVar;
        int i2;
        int i3;
        avgj avgjVar2;
        int i4;
        if (aqguVar == null) {
            fxaVar = fxb.a();
        } else {
            int i5 = 4;
            int i6 = 1;
            if ((aqguVar.b & 4) != 0) {
                aqgs aqgsVar = aqguVar.e;
                if (aqgsVar == null) {
                    aqgsVar = aqgs.a;
                }
                i5 = aqmv.g(aqgsVar.b);
                if (i5 == 0) {
                    i5 = 1;
                }
            }
            if ((aqguVar.b & 128) != 0) {
                aqgt aqgtVar = aqguVar.g;
                if (aqgtVar == null) {
                    aqgtVar = aqgt.a;
                }
                i = aqmv.f(aqgtVar.b);
                if (i == 0) {
                    i = 1;
                }
            } else {
                i = 5;
            }
            arhr arhrVar2 = arhr.REFRESH;
            if ((aqguVar.b & 2) != 0) {
                arhs arhsVar = aqguVar.d;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
                arhrVar2 = arhr.b(arhsVar.c);
                if (arhrVar2 == null) {
                    arhrVar2 = arhr.UNKNOWN;
                }
            }
            fxa a = fxb.a();
            apzg apzgVar = null;
            if ((aqguVar.b & 1) != 0) {
                aragVar = aqguVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            Spanned b = ajgl.b(aragVar);
            if (b != null) {
                a.a = b;
                a.h = i5;
                a.g = i;
                if (arhrVar2 != null) {
                    a.b = arhrVar2;
                    if ((aqguVar.b & 512) != 0 && (apzgVar = aqguVar.h) == null) {
                        apzgVar = apzg.a;
                    }
                    a.c = ampq.i(apzgVar);
                    if ((aqguVar.b & 1024) != 0) {
                        avgjVar = aqguVar.i;
                        if (avgjVar == null) {
                            avgjVar = avgj.a;
                        }
                    } else {
                        avgjVar = avgj.a;
                    }
                    a.a(avgjVar);
                    int h = aqmv.h(aqguVar.j);
                    if (h != 0) {
                        i6 = h;
                    }
                    a.i = i6;
                    fxaVar = a;
                } else {
                    throw new NullPointerException("Null iconType");
                }
            } else {
                throw new NullPointerException("Null text");
            }
        }
        final acti actiVar = this.c;
        fxaVar.d = ampq.i(new fwz(aqguVar, actiVar));
        fxaVar.e = ampq.i(new View.OnClickListener() { // from class: fwy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aqgu aqguVar2 = aqgu.this;
                acti actiVar2 = actiVar;
                if (actiVar2 != null) {
                    actiVar2.H(3, new acte(aqguVar2.f), null);
                }
            }
        });
        CharSequence charSequence = fxaVar.a;
        if (charSequence == null || (arhrVar = fxaVar.b) == null || (i2 = fxaVar.g) == 0 || (i3 = fxaVar.h) == 0 || (avgjVar2 = fxaVar.f) == null || (i4 = fxaVar.i) == 0) {
            StringBuilder sb = new StringBuilder();
            if (fxaVar.a == null) {
                sb.append(" text");
            }
            if (fxaVar.b == null) {
                sb.append(" iconType");
            }
            if (fxaVar.g == 0) {
                sb.append(" position");
            }
            if (fxaVar.h == 0) {
                sb.append(" behavior");
            }
            if (fxaVar.f == null) {
                sb.append(" colorPalette");
            }
            if (fxaVar.i == 0) {
                sb.append(" presentationStyle");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new fxb(charSequence, arhrVar, i2, i3, fxaVar.c, fxaVar.d, fxaVar.e, avgjVar2, i4);
    }
}
