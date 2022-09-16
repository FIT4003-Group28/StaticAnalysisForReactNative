package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xlv  reason: default package */
/* loaded from: classes4.dex */
public final class xlv implements xkp, xlx, afzf {
    public final xmd a;
    public final aqav b;
    private final Context c;
    private final xxx d;
    private final xko e;
    private final ajuw f;
    private final ajuf g;
    private final yzj h;
    private final ajyj i;
    private final xmc j;
    private final acti k;
    private final boolean l;

    public xlv(Context context, xxx xxxVar, xko xkoVar, ajuw ajuwVar, ajuf ajufVar, yzj yzjVar, ajyj ajyjVar, xmd xmdVar, aqav aqavVar, acti actiVar, boolean z) {
        this.c = context;
        this.d = xxxVar;
        this.e = xkoVar;
        this.f = ajuwVar;
        this.g = ajufVar;
        this.h = yzjVar;
        this.i = ajyjVar;
        this.a = xmdVar;
        this.j = new xnh(ajyjVar);
        this.b = aqavVar;
        this.k = actiVar;
        this.l = z;
        ajufVar.b = this;
    }

    public static final void f(Context context, arrz arrzVar, xkp xkpVar) {
        aqav aqavVar;
        if ((arrzVar.b & 4) != 0) {
            arrx arrxVar = arrzVar.e;
            if (arrxVar == null) {
                arrxVar = arrx.a;
            }
            arag aragVar = arrxVar.b;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            zag.r(context, ajgl.b(aragVar), 1);
        }
        xlv xlvVar = (xlv) xkpVar;
        aqav aqavVar2 = xlvVar.b;
        xmd xmdVar = xlvVar.a;
        aqbw a = xmdVar.a();
        if (a != null && (a.b & 1) == 0) {
            xmdVar.c(aqavVar2);
        } else if (a == null) {
        } else {
            aqax aqaxVar = a.c;
            if (aqaxVar == null) {
                aqaxVar = aqax.a;
            }
            if (aqaxVar.b != 62285947) {
                return;
            }
            aqax aqaxVar2 = a.c;
            if (aqaxVar2 == null) {
                aqaxVar2 = aqax.a;
            }
            if (aqaxVar2.b == 62285947) {
                aqavVar = (aqav) aqaxVar2.c;
            } else {
                aqavVar = aqav.a;
            }
            if (aqavVar.equals(aqavVar2)) {
                xmdVar.d();
            } else {
                xmdVar.c(aqavVar2);
            }
        }
    }

    private final void g() {
        aqav aqavVar;
        aqbw a = this.a.a();
        if (a != null) {
            aqax aqaxVar = a.c;
            if (aqaxVar == null) {
                aqaxVar = aqax.a;
            }
            if (aqaxVar.b == 62285947) {
                aqax aqaxVar2 = a.c;
                if (aqaxVar2 == null) {
                    aqaxVar2 = aqax.a;
                }
                if (aqaxVar2.b == 62285947) {
                    aqavVar = (aqav) aqaxVar2.c;
                } else {
                    aqavVar = aqav.a;
                }
                if (aqavVar.equals(this.b)) {
                    this.a.d();
                    return;
                } else if (this.l) {
                    this.a.g(null, this.b);
                    return;
                } else {
                    this.a.c(this.b);
                    return;
                }
            }
        }
        this.a.c(this.b);
    }

    @Override // defpackage.xkp
    public final aqav d() {
        return this.b;
    }

    @Override // defpackage.xlx
    public final xmd e() {
        return this.a;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.h.e(cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final void lG(Object obj) {
        aunm aunmVar;
        aqav aqavVar;
        aqbw aqbwVar;
        aqbw aqbwVar2;
        aqbw aqbwVar3;
        ajsm ajsmVar = null;
        if (obj instanceof arnr) {
            for (arnh arnhVar : ((arnr) obj).c) {
                xko xkoVar = this.e;
                ajyj ajyjVar = this.i;
                xkoVar.a(arnhVar, ajyjVar != null ? amup.k("sectionController", ajyjVar) : null);
                int J2 = akpq.J(arnhVar.d);
                if (J2 == 0) {
                    J2 = 1;
                }
                int i = J2 - 1;
                if (i != 1) {
                    if (i == 9) {
                        g();
                        arni arniVar = arnhVar.g;
                        if (arniVar == null) {
                            arniVar = arni.a;
                        }
                        if (arniVar.b == 62285833) {
                            xmc xmcVar = this.j;
                            arni arniVar2 = arnhVar.g;
                            if (arniVar2 == null) {
                                arniVar2 = arni.a;
                            }
                            if (arniVar2.b == 62285833) {
                                aqbwVar3 = (aqbw) arniVar2.c;
                            } else {
                                aqbwVar3 = aqbw.a;
                            }
                            xmcVar.a(aqbwVar3, true);
                        }
                    } else if (i == 10) {
                        g();
                        arni arniVar3 = arnhVar.g;
                        if (arniVar3 == null) {
                            arniVar3 = arni.a;
                        }
                        if (arniVar3.b == 62285833) {
                            xmc xmcVar2 = this.j;
                            arni arniVar4 = arnhVar.g;
                            if (arniVar4 == null) {
                                arniVar4 = arni.a;
                            }
                            if (arniVar4.b == 62285833) {
                                aqbwVar2 = (aqbw) arniVar4.c;
                            } else {
                                aqbwVar2 = aqbw.a;
                            }
                            xmcVar2.a(aqbwVar2, false);
                        }
                    } else if (i == 15) {
                        arni arniVar5 = arnhVar.g;
                        if (arniVar5 == null) {
                            arniVar5 = arni.a;
                        }
                        if (arniVar5.b == 62285833) {
                            ajyj ajyjVar2 = this.i;
                            ajzu ajzuVar = ajyjVar2 instanceof ajzu ? (ajzu) ajyjVar2 : null;
                            if (ajzuVar != null) {
                                arni arniVar6 = arnhVar.g;
                                if (arniVar6 == null) {
                                    arniVar6 = arni.a;
                                }
                                if (arniVar6.b == 62285833) {
                                    aqbwVar = (aqbw) arniVar6.c;
                                } else {
                                    aqbwVar = aqbw.a;
                                }
                                ajzuVar.O(this.a.a(), aqbwVar);
                            }
                        }
                    } else if (i != 16) {
                    }
                }
                g();
                if (this.a.a() != null) {
                    aqax aqaxVar = this.a.a().c;
                    if (aqaxVar == null) {
                        aqaxVar = aqax.a;
                    }
                    if (aqaxVar.b == 62285947) {
                        xxx xxxVar = this.d;
                        aqax aqaxVar2 = this.a.a().c;
                        if (aqaxVar2 == null) {
                            aqaxVar2 = aqax.a;
                        }
                        if (aqaxVar2.b == 62285947) {
                            aqavVar = (aqav) aqaxVar2.c;
                        } else {
                            aqavVar = aqav.a;
                        }
                        String str = aqavVar.i;
                        long j = arnhVar.j;
                        aqal b = aqal.b(arnhVar.i);
                        if (b == null) {
                            b = aqal.COMMENT_POLL_STATUS_UNKNOWN;
                        }
                        xxxVar.k(str, j, b);
                    }
                }
            }
        } else if (obj instanceof arrz) {
            final arrz arrzVar = (arrz) obj;
            if (arrzVar == null) {
                zag.q(this.c, R.string.video_flagged, 1);
                return;
            }
            this.g.lG(arrzVar);
            final Context context = this.c;
            if ((arrzVar.b & 2) == 0) {
                f(context, arrzVar, this);
                return;
            }
            AlertDialog.Builder cancelable = new AlertDialog.Builder(context).setCancelable(true);
            arag aragVar = arrzVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            cancelable.setMessage(ajgl.b(aragVar)).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: xlu
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    xlv.f(context, arrzVar, this);
                }
            }).show();
        } else if (obj instanceof asbi) {
            asbi asbiVar = (asbi) obj;
            if (asbiVar == null) {
                return;
            }
            asbj asbjVar = asbiVar.c;
            if (asbjVar == null) {
                asbjVar = asbj.a;
            }
            if (asbjVar.b != 113762946) {
                return;
            }
            asbj asbjVar2 = asbiVar.c;
            if (asbjVar2 == null) {
                asbjVar2 = asbj.a;
            }
            if (asbjVar2.b == 113762946) {
                aunmVar = (aunm) asbjVar2.c;
            } else {
                aunmVar = aunm.a;
            }
            this.k.D(new acte(aunmVar.i.I()));
            this.f.c(aunmVar, this);
        } else if (obj instanceof arrw) {
            aqbw a = this.a.a();
            ajyj ajyjVar3 = this.i;
            if (ajyjVar3 != null) {
                ajsmVar = (ajsm) ajyjVar3.lA();
            }
            if (ajsmVar == null || a == null) {
                return;
            }
            ajsmVar.remove(a);
        }
    }
}
