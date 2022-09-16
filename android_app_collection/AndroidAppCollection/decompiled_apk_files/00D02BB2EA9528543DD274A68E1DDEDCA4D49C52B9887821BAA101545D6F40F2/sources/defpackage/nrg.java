package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
/* compiled from: PG */
/* renamed from: nrg  reason: default package */
/* loaded from: classes7.dex */
public final class nrg extends cqfb {
    private final cqho a;
    private final aufc b;
    private final bvjj c;

    public nrg(cqho cqhoVar, aufc aufcVar, bvjj bvjjVar) {
        this.a = cqhoVar;
        dbsk.s(aufcVar);
        this.b = aufcVar;
        dbsk.s(bvjjVar);
        this.c = bvjjVar;
    }

    @Override // defpackage.cqfb, defpackage.cqkv
    public final boolean a(cqku cqkuVar, @dzsi Object obj, cqjz<?> cqjzVar) {
        Drawable a;
        View view = cqjzVar.c;
        if (cqkuVar instanceof nrf) {
            nrf nrfVar = nrf.END_PADDING_WHEN_SCROLL_BAR_HIDDEN;
            switch (((nrf) cqkuVar).ordinal()) {
                case 0:
                    if (obj == null || !(view instanceof nti)) {
                        return false;
                    }
                    ((nti) view).setEndPaddingWhenScrollBarHidden(cqfp.g(obj, view));
                    return true;
                case 1:
                    if (!(view instanceof com) || !(obj instanceof con)) {
                        return false;
                    }
                    ((com) view).setForceFieldType((con) obj);
                    return true;
                case 2:
                    if (!(view instanceof nti)) {
                        return false;
                    }
                    nti ntiVar = (nti) view;
                    if (obj instanceof Integer) {
                        ntiVar.setItemWidth(((Integer) obj).intValue());
                        return true;
                    } else if (!(obj instanceof cqtv)) {
                        return false;
                    } else {
                        ntiVar.setItemWidth(((cqtv) obj).e(ntiVar.getContext()));
                        return true;
                    }
                case 3:
                    if (view instanceof cov) {
                        cov covVar = (cov) view;
                        if (this.b.b()) {
                            covVar.setDayNightStyle(2);
                        } else {
                            covVar.setDayNightStyle(3);
                        }
                    } else if (!(view instanceof nsq)) {
                        return false;
                    } else {
                        nsq nsqVar = (nsq) view;
                        if (this.b.b()) {
                            nsqVar.setNightMode();
                        } else {
                            nsqVar.setDayMode();
                        }
                    }
                    return true;
                case 4:
                    if (!(view instanceof cov)) {
                        return false;
                    }
                    cov covVar2 = (cov) view;
                    if (!(obj instanceof cou)) {
                        return true;
                    }
                    covVar2.setOnScrollListener((cou) obj);
                    return true;
                case 5:
                    if (!(view instanceof nti)) {
                        return false;
                    }
                    nti ntiVar2 = (nti) view;
                    if (!(obj instanceof nth)) {
                        return true;
                    }
                    ntiVar2.setOnScrollBarVisibilityChangeListener((nth) obj);
                    return true;
                case 6:
                    boolean m = this.c.m(bvjk.gk, false);
                    if (!(view instanceof cov)) {
                        return false;
                    }
                    cov covVar3 = (cov) view;
                    if (m || this.b.b()) {
                        covVar3.setDayNightStyle(2);
                    } else {
                        covVar3.setDayNightStyle(3);
                    }
                    return true;
                case 7:
                    if (!(view instanceof nti)) {
                        return false;
                    }
                    nti ntiVar3 = (nti) view;
                    if (obj == null) {
                        ntiVar3.setScrollBarId(-1);
                        return true;
                    } else if (!(obj instanceof Integer)) {
                        return false;
                    } else {
                        ntiVar3.setScrollBarId(((Integer) obj).intValue());
                        return true;
                    }
                case 8:
                    if (!(view instanceof nti)) {
                        return false;
                    }
                    nti ntiVar4 = (nti) view;
                    if (obj instanceof Integer) {
                        ntiVar4.setScrollBarWidth(((Integer) obj).intValue());
                        return true;
                    } else if (!(obj instanceof cqtv)) {
                        return false;
                    } else {
                        ntiVar4.setScrollBarWidth(((cqtv) obj).e(ntiVar4.getContext()));
                        return true;
                    }
                case 9:
                    if (this.c.m(bvjk.gk, false)) {
                        a = nqu.aS(false, nqo.ad).a(view.getContext());
                    } else {
                        a = nqu.aN(nqo.ad, null, false, -14927783, -2956292).a(view.getContext());
                    }
                    view.setBackground(a);
                    return true;
                case 10:
                    if (!(obj instanceof Boolean)) {
                        return false;
                    }
                    if (view instanceof nti) {
                        ((nti) view).setShowDivider(((Boolean) obj).booleanValue());
                        return true;
                    } else if (!(view instanceof nsq)) {
                        return false;
                    } else {
                        ((nsq) view).setShowDivider(((Boolean) obj).booleanValue());
                        return true;
                    }
                default:
                    return false;
            }
        } else if (cqkuVar != cqfe.LIST_ADAPTER || !(obj instanceof cqiv)) {
            return false;
        } else {
            cqiv cqivVar = (cqiv) obj;
            if (!(view instanceof cov)) {
                return false;
            }
            cov covVar4 = (cov) view;
            abg abgVar = covVar4.a.k;
            if (abgVar instanceof nsj) {
                nsj nsjVar = (nsj) abgVar;
                nsjVar.y();
                for (cqix<?> cqixVar : cqivVar.a) {
                    nsjVar.b(cqixVar);
                }
                nsjVar.s();
            } else {
                nsj nsjVar2 = new nsj(this.a.g());
                for (cqix<?> cqixVar2 : cqivVar.a) {
                    nsjVar2.b(cqixVar2);
                }
                covVar4.setAdapter(nsjVar2);
            }
            return true;
        }
    }

    @Override // defpackage.cqfb, defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof nrf) {
            nrf nrfVar = nrf.END_PADDING_WHEN_SCROLL_BAR_HIDDEN;
            int ordinal = ((nrf) cqkuVar).ordinal();
            if (ordinal == 4) {
                if (view instanceof cov) {
                    ((cov) view).setOnScrollListener(null);
                    return true;
                }
            } else if (ordinal != 5 || !(view instanceof nti)) {
                return false;
            } else {
                ((nti) view).setOnScrollBarVisibilityChangeListener(null);
                return true;
            }
        }
        return false;
    }
}
