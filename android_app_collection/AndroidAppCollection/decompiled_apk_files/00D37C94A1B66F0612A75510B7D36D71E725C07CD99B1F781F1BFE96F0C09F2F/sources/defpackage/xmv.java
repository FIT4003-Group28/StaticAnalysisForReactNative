package defpackage;

import android.app.Activity;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: xmv  reason: default package */
/* loaded from: classes4.dex */
public final class xmv implements aavf, xmx {
    private final Activity a;
    private final xko b;
    private final xxx c;
    private final xna d;
    private final xkb e;
    private final ajin f;
    private final ajyj g;
    private final xlp h;
    private final xwd i;
    private final String j;
    private final Long k;
    private final zdt l;

    public xmv(Activity activity, xko xkoVar, xxx xxxVar, xna xnaVar, xkb xkbVar, ajin ajinVar, ajyj ajyjVar, xlp xlpVar, xwd xwdVar, String str, Long l, zdt zdtVar) {
        this.a = activity;
        this.b = xkoVar;
        this.c = xxxVar;
        this.d = xnaVar;
        this.e = xkbVar;
        this.f = ajinVar;
        this.g = ajyjVar;
        this.h = xlpVar;
        this.i = xwdVar;
        this.j = str;
        this.k = l;
        this.l = zdtVar;
    }

    private final acti i() {
        Activity activity = this.a;
        if (activity instanceof acth) {
            return ((acth) activity).oi();
        }
        return null;
    }

    private final ajyj j() {
        ajyj ajyjVar = this.g;
        return ajyjVar == null ? (ajyj) arey.r(this.e.a(), null) : ajyjVar;
    }

    private static amup k(ajyj ajyjVar) {
        if (ajyjVar != null) {
            return amup.k("sectionController", ajyjVar);
        }
        return null;
    }

    @Override // defpackage.aavf
    public final /* synthetic */ aavi a() {
        return null;
    }

    @Override // defpackage.aavf
    public final Long b() {
        return this.k;
    }

    @Override // defpackage.aavf
    public final String c() {
        return this.j;
    }

    @Override // defpackage.aavf
    public final void d() {
        this.i.dismiss();
    }

    @Override // defpackage.aavf
    public final void e(cff cffVar) {
        this.l.a(cffVar);
    }

    @Override // defpackage.aavf
    public final void f(arnz arnzVar) {
        aqbw aqbwVar;
        ampq ampqVar;
        aqbw aqbwVar2;
        arnh arnhVar;
        List<ajyj> r;
        this.i.dismiss();
        aroa aroaVar = arnzVar.d;
        if (aroaVar == null) {
            aroaVar = aroa.a;
        }
        int i = aroaVar.b;
        if (i != 153515154) {
            if (i == 62285833) {
                aqbwVar = (aqbw) aroaVar.c;
            } else {
                aqbwVar = aqbw.a;
            }
            aqax aqaxVar = aqbwVar.c;
            if (aqaxVar == null) {
                aqaxVar = aqax.a;
            }
            if (aqaxVar.b == 62285947) {
                if (aroaVar.b == 62285833) {
                    aqbwVar2 = (aqbw) aroaVar.c;
                } else {
                    aqbwVar2 = aqbw.a;
                }
                ampqVar = ampq.j(new xmu(aqbwVar2));
            } else {
                ampqVar = amon.a;
            }
        } else {
            ampqVar = ampq.j(new xmu((aqtb) aroaVar.c));
        }
        if (ampqVar.h()) {
            xko xkoVar = this.b;
            if ((arnzVar.b & 4) != 0) {
                arnhVar = arnzVar.f;
                if (arnhVar == null) {
                    arnhVar = arnh.a;
                }
            } else {
                arnhVar = null;
            }
            xkoVar.b(arnhVar, k(j()), R.string.comment_added);
            aoob aoobVar = ((xmu) ampqVar.c()).b;
            if (aoobVar != null && i() != null) {
                i().D(new acte(aoobVar.I()));
            }
            Object obj = ((xmu) ampqVar.c()).a;
            ajyj ajyjVar = this.g;
            if (ajyjVar == null) {
                r = this.e.a();
            } else {
                r = amxp.r(ajyjVar);
            }
            for (ajyj ajyjVar2 : r) {
                xnd xndVar = new xnd(ajyjVar2);
                if (!(obj instanceof aqtb) || this.f == null) {
                    xndVar.a(obj, false);
                } else {
                    xndVar.a(ajhh.a((aqtb) obj), false);
                }
            }
        } else if (i() != null) {
            arnh arnhVar2 = arnzVar.f;
            if (arnhVar2 == null) {
                arnhVar2 = arnh.a;
            }
            if ((arnhVar2.b & 4096) == 0) {
                return;
            }
            arnh arnhVar3 = arnzVar.f;
            if (arnhVar3 == null) {
                arnhVar3 = arnh.a;
            }
            if (!arnhVar3.l) {
                return;
            }
            i().n(new acte(actj.CIVILITY_REMINDER_DIALOG));
            i().n(new acte(actj.CIVILITY_REMINDER_EDIT_BUTTON));
            i().n(new acte(actj.CIVILITY_REMINDER_POST_ANYWAY_BUTTON));
            i().n(new acte(actj.CIVILITY_REMINDER_REPORT_BUTTON));
        }
    }

    @Override // defpackage.xmx
    public final void g(cff cffVar) {
        this.l.a(cffVar);
    }

    @Override // defpackage.xmx
    public final void h(arnw arnwVar) {
        aqav aqavVar;
        aqav aqavVar2;
        this.i.dismiss();
        if ((arnwVar.b & 2) != 0 || arnwVar.g.size() <= 0) {
            arnx arnxVar = arnwVar.d;
            if (arnxVar == null) {
                arnxVar = arnx.a;
            }
            if (arnxVar.b != 153515154) {
                xmd xmdVar = this.h.b;
                arnh arnhVar = null;
                if (xmdVar == null) {
                    ajrs ajrsVar = this.c.b;
                    xmdVar = ajrsVar != null ? (xmd) ajrsVar.c("commentThreadMutator") : null;
                }
                xko xkoVar = this.b;
                if ((arnwVar.b & 16) != 0 && (arnhVar = arnwVar.h) == null) {
                    arnhVar = arnh.a;
                }
                xkoVar.b(arnhVar, k(j()), R.string.reply_added);
                arnx arnxVar2 = arnwVar.d;
                if (arnxVar2 == null) {
                    arnxVar2 = arnx.a;
                }
                if (arnxVar2.b == 62285947 && xmdVar != null) {
                    if (!arnwVar.e) {
                        arnx arnxVar3 = arnwVar.d;
                        if (arnxVar3 == null) {
                            arnxVar3 = arnx.a;
                        }
                        if (arnxVar3.b == 62285947) {
                            aqavVar = (aqav) arnxVar3.c;
                        } else {
                            aqavVar = aqav.a;
                        }
                        xmdVar.b(aqavVar);
                    } else {
                        arnx arnxVar4 = arnwVar.d;
                        if (arnxVar4 == null) {
                            arnxVar4 = arnx.a;
                        }
                        if (arnxVar4.b == 62285947) {
                            aqavVar2 = (aqav) arnxVar4.c;
                        } else {
                            aqavVar2 = aqav.a;
                        }
                        xmdVar.g(aqavVar2, this.h.c);
                    }
                }
                arnh arnhVar2 = arnwVar.h;
                if (arnhVar2 == null) {
                    arnhVar2 = arnh.a;
                }
                aqal b = aqal.b(arnhVar2.i);
                if (b == null) {
                    b = aqal.COMMENT_POLL_STATUS_UNKNOWN;
                }
                if (b == aqal.COMMENT_POLL_STATUS_UNKNOWN) {
                    return;
                }
                xxx xxxVar = this.c;
                String str = this.h.c.i;
                arnh arnhVar3 = arnwVar.h;
                if (arnhVar3 == null) {
                    arnhVar3 = arnh.a;
                }
                long j = arnhVar3.j;
                arnh arnhVar4 = arnwVar.h;
                if (arnhVar4 == null) {
                    arnhVar4 = arnh.a;
                }
                aqal b2 = aqal.b(arnhVar4.i);
                if (b2 == null) {
                    b2 = aqal.COMMENT_POLL_STATUS_UNKNOWN;
                }
                xxxVar.k(str, j, b2);
                if ((arnwVar.b & 8) == 0) {
                    return;
                }
                xxx xxxVar2 = this.c;
                String str2 = this.h.c.i;
                aufb aufbVar = arnwVar.f;
                if (aufbVar == null) {
                    aufbVar = aufb.a;
                }
                xxv xxvVar = (xxv) xxxVar2.a.b(xxx.n(str2));
                if (xxvVar == null) {
                    return;
                }
                aopa mo52toBuilder = ((aufe) xxvVar.a).mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                aufe aufeVar = (aufe) mo52toBuilder.instance;
                aufbVar.getClass();
                aufeVar.j = aufbVar;
                aufeVar.b |= 128;
                xxxVar2.a.d(xxx.n(str2), new xxv((aufe) mo52toBuilder.mo39build(), 0L));
                return;
            }
            this.d.a(arnwVar);
        } else if (i() == null) {
        } else {
            arnh arnhVar5 = arnwVar.h;
            if (arnhVar5 == null) {
                arnhVar5 = arnh.a;
            }
            if ((arnhVar5.b & 4096) == 0) {
                return;
            }
            arnh arnhVar6 = arnwVar.h;
            if (arnhVar6 == null) {
                arnhVar6 = arnh.a;
            }
            if (!arnhVar6.l) {
                return;
            }
            i().n(new acte(actj.CIVILITY_REMINDER_DIALOG));
            i().n(new acte(actj.CIVILITY_REMINDER_EDIT_BUTTON));
            i().n(new acte(actj.CIVILITY_REMINDER_POST_ANYWAY_BUTTON));
            i().n(new acte(actj.CIVILITY_REMINDER_REPORT_BUTTON));
        }
    }
}
