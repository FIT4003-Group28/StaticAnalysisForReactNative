package defpackage;

import android.os.Build;
import com.google.android.filament.R;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: acgc  reason: default package */
/* loaded from: classes2.dex */
public final class acgc<T> extends btrh<T> {
    private final int d;

    public acgc(Class<?> cls, T t) {
        super(cls, t);
        this.d = 1;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        acfh acfhVar;
        int i = this.d;
        if (i == 0) {
            afws afwsVar = (afws) obj;
            acgb acgbVar = ((acga) this.a).a;
            if (!acgbVar.u || afwsVar.a != 3) {
                return;
            }
            acgbVar.u = false;
            acgbVar.i();
        } else if (i == 1) {
            ((acga) this.a).a.v = ((crhp) obj).b();
        } else if (i != 2) {
            acga acgaVar = (acga) this.a;
            acfl acflVar = (acfl) obj;
            acfk acfkVar = acflVar.a;
            dcqe dcqeVar = acgb.a;
            if (acfkVar == acfk.INACTIVE) {
                acgaVar.a.r = false;
                acgb acgbVar2 = acgaVar.a;
                acgbVar2.s = false;
                acgbVar2.d.e(acflVar);
                acgaVar.a.t = null;
                return;
            }
            acgaVar.a.r = true;
            achc achcVar = achc.AR_CALIBRATOR;
            int ordinal = acfkVar.ordinal();
            if (ordinal == 1) {
                acgb acgbVar3 = acgaVar.a;
                if (!acgbVar3.s) {
                    return;
                }
                acgbVar3.s = false;
                if (acgbVar3.t == null) {
                    bvoo.h("Missing feedback for %s", acfkVar);
                } else {
                    List asList = Arrays.asList(ache.IZ);
                    acfi acfiVar = acgaVar.a.t;
                    dbsk.s(acfiVar);
                    if (asList.contains(acfiVar.d)) {
                        acgaVar.a.p();
                        acgaVar.a.d.b(new acfl(acfk.INACTIVE, null));
                        return;
                    }
                }
                acgaVar.a.d.b(new acfl(acfk.FEEDBACK_TYPE_FRAGMENT_START, null));
            } else if (ordinal == 2) {
                acgb acgbVar4 = acgaVar.a;
                acgbVar4.t = acflVar.b;
                acfi acfiVar2 = acgbVar4.t;
                if (acfiVar2 == null) {
                    bvoo.h("Missing feedback for %s", acfkVar);
                    return;
                }
                switch (acfiVar2.d.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 19:
                    case 29:
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    case 35:
                    case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        acgbVar4.p();
                        acgbVar4.d.b(new acfl(acfk.INACTIVE, null));
                        return;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 28:
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        acgbVar4.d.b(new acfl(acfk.FEEDBACK_TYPE_FRAGMENT_START, acgbVar4.t));
                        return;
                    case 27:
                        acfi acfiVar3 = acgbVar4.t;
                        if (acfiVar3 != null && dbsj.d(acfiVar3.c())) {
                            acfi acfiVar4 = acgbVar4.t;
                            dbsk.s(acfiVar4);
                            acfh acfhVar2 = acfiVar4.b;
                            if (acfhVar2 != null) {
                                acfhVar2.a = " ";
                            }
                        }
                        acgbVar4.p();
                        acgbVar4.d.b(new acfl(acfk.INACTIVE, null));
                        return;
                    default:
                        return;
                }
            } else if (ordinal == 3) {
                gei.b(acgaVar.a.b, new acgv(), "ShakenDialog");
            } else if (ordinal == 5) {
                acgb acgbVar5 = acgaVar.a;
                acgbVar5.s = true;
                acfi acfiVar5 = acgbVar5.t;
                if (acfiVar5 == null || (acfhVar = acfiVar5.b) == null) {
                    return;
                }
                achg achgVar = acfhVar.c;
                if (achgVar != null && !achgVar.b()) {
                    return;
                }
                acgaVar.a.d.b(new acfl(acfk.SCREENSHOT_COMPLETED, null));
            } else if (ordinal != 6) {
                if (ordinal != 7) {
                    return;
                }
                acgb acgbVar6 = acgaVar.a;
                acgbVar6.t = acflVar.b;
                acgbVar6.d.e(acflVar);
            } else {
                try {
                    acgaVar.a.p.a();
                    acgaVar.a.p.a().a();
                    try {
                        acgaVar.a.j.a();
                        if (acgaVar.a.j.a().o()) {
                            acgaVar.a.j.a().q();
                            acgaVar.a.u = true;
                            return;
                        }
                        acgaVar.a.i();
                    } catch (IllegalStateException unused) {
                        acgaVar.a.d.b(new acfl(acfk.INACTIVE, null));
                    }
                } catch (IllegalStateException unused2) {
                    acgaVar.a.d.b(new acfl(acfk.INACTIVE, null));
                }
            }
        } else {
            acga acgaVar2 = (acga) this.a;
            acgq acgqVar = (acgq) obj;
            if (!acgaVar2.a.i.b()) {
                return;
            }
            if ((Build.MODEL.contains("Sensation") && !acgaVar2.a.c.U()) || !acgaVar2.a.h.m(bvjk.I, false) || acgaVar2.a.r) {
                return;
            }
            acgb acgbVar7 = acgaVar2.a;
            if (acgbVar7.w > 0 || acgbVar7.v) {
                return;
            }
            acgbVar7.e.m(new cjte(deaf.SHAKE), cjtd.a(dtxn.m));
            acgaVar2.a.o(true, null);
        }
    }

    public acgc(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }
}
