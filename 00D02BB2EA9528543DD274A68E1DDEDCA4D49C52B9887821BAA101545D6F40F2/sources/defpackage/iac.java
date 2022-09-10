package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ListAdapter;
import com.google.android.apps.gmm.base.mod.components.tabs.GmmTabLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: iac  reason: default package */
/* loaded from: classes.dex */
public final class iac implements cqkv {
    final cqlg a;

    public iac(cqlg cqlgVar) {
        this.a = cqlgVar;
    }

    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        int i = 0;
        if (cqkuVar instanceof cqfe) {
            iab iabVar = iab.INLINE_LABEL;
            cqfe cqfeVar = cqfe.ACCESSIBILITY_DELEGATE;
            if (((cqfe) cqkuVar).ordinal() == 109 && (view instanceof GmmTabLayout) && (obj instanceof cqiv)) {
                GmmTabLayout gmmTabLayout = (GmmTabLayout) view;
                ListAdapter h = ((cqiv) obj).h(cqjzVar.g.g());
                int i2 = gmmTabLayout.i();
                int count = h.getCount();
                hzu.a(gmmTabLayout, count, i2 - 1);
                Integer num = (Integer) gmmTabLayout.getTag(R.id.initial_selected_tab_index);
                int intValue = num == null ? 0 : num.intValue();
                for (int i3 = 0; i3 < count; i3++) {
                    dagb j = gmmTabLayout.j(i3);
                    if (j == null) {
                        dagb c = gmmTabLayout.c();
                        c.d(h.getView(i3, null, null));
                        gmmTabLayout.f(c, i3, false);
                        if (i3 == intValue) {
                            gmmTabLayout.getViewTreeObserver().addOnPreDrawListener(new hzt(gmmTabLayout, intValue));
                        }
                    } else {
                        cqjzVar.g.g();
                        cqkf<?> a = cqke.a(j.e);
                        if (a != null) {
                            a.e((cqkp) h.getItem(i3));
                        }
                    }
                }
                return true;
            }
        }
        if (cqkuVar instanceof iab) {
            iab iabVar2 = iab.INLINE_LABEL;
            cqfe cqfeVar2 = cqfe.ACCESSIBILITY_DELEGATE;
            switch (((iab) cqkuVar).ordinal()) {
                case 0:
                    if ((view instanceof dagg) && (obj instanceof Boolean)) {
                        ((dagg) view).setInlineLabel(((Boolean) obj).booleanValue());
                        return true;
                    }
                    break;
                case 1:
                    if ((view instanceof dagg) && (obj instanceof dafw)) {
                        ((dagg) view).a((dafw) obj);
                        return true;
                    }
                    break;
                case 2:
                    if ((view instanceof dagg) && (obj instanceof dafw)) {
                        ((dagg) view).a((dafw) obj);
                        return true;
                    }
                    break;
                case 3:
                    if ((view instanceof dagg) && (obj == null || (obj instanceof iax))) {
                        iax iaxVar = (iax) obj;
                        dagg daggVar = (dagg) view;
                        if (iaxVar != null) {
                            daggVar.setScrollPosition(iaxVar.a(), iaxVar.b(), iaxVar.c(), iaxVar.d());
                        }
                        return true;
                    }
                    break;
                case 4:
                    if ((view instanceof dagg) && (obj instanceof iaz)) {
                        iaz iazVar = (iaz) obj;
                        dagg daggVar2 = (dagg) view;
                        if (daggVar2.k() != iazVar.a()) {
                            if (daggVar2.k() == -1 && iazVar.a() == 0) {
                                i = 1;
                            }
                            if (daggVar2.i() == 0 || i != 0) {
                                daggVar2.setTag(R.id.initial_selected_tab_index, Integer.valueOf(iazVar.a()));
                            } else {
                                dagb j2 = daggVar2.j(iazVar.a());
                                if (j2 != null) {
                                    daggVar2.p(j2, iazVar.b());
                                }
                            }
                        }
                        return true;
                    }
                    break;
                case 5:
                    if (view instanceof dagg) {
                        if (obj == null || (obj instanceof Drawable)) {
                            Drawable drawable = (Drawable) obj;
                            cqlg.u(view, drawable);
                            ((dagg) view).setSelectedTabIndicator(drawable);
                            return true;
                        } else if (obj instanceof cqtd) {
                            ((dagg) view).setSelectedTabIndicator(this.a.c(view, (cqtd) obj));
                            return true;
                        } else if (obj instanceof Picture) {
                            ((dagg) view).setSelectedTabIndicator(this.a.d(view, (Picture) obj));
                            return true;
                        } else if (obj instanceof Integer) {
                            ((dagg) view).setSelectedTabIndicator(this.a.e(view, ((Integer) obj).intValue()));
                            return true;
                        }
                    }
                    break;
                case 6:
                    if ((view instanceof dagg) && (obj instanceof Integer)) {
                        int intValue2 = ((Integer) obj).intValue();
                        if (true == hzh.b.contains(Integer.valueOf(intValue2))) {
                            i = intValue2;
                        }
                        ((dagg) view).setSelectedTabIndicatorGravity(i);
                        return true;
                    }
                    break;
                case 7:
                    if ((view instanceof dagg) && (obj instanceof Integer)) {
                        int intValue3 = ((Integer) obj).intValue();
                        if (true == hzh.a.contains(Integer.valueOf(intValue3))) {
                            i = intValue3;
                        }
                        ((dagg) view).setTabGravity(i);
                        return true;
                    }
                    break;
                case 8:
                    if ((view instanceof dagg) && (obj instanceof Boolean)) {
                        ((dagg) view).setTabIndicatorFullWidth(((Boolean) obj).booleanValue());
                        return true;
                    }
                    break;
                case 9:
                    if ((view instanceof dagg) && (obj instanceof Integer)) {
                        int intValue4 = ((Integer) obj).intValue();
                        if (true == hzh.c.contains(Integer.valueOf(intValue4))) {
                            i = intValue4;
                        }
                        ((dagg) view).setTabMode(i);
                        return true;
                    }
                    break;
                case 10:
                    if (view instanceof dagg) {
                        if (obj == null || (obj instanceof cqss)) {
                            ((dagg) view).setTabRippleColor(this.a.g(view, (cqss) obj));
                            return true;
                        } else if (obj instanceof Number) {
                            ((dagg) view).setTabRippleColor(this.a.o((Number) obj));
                            return true;
                        } else if (obj instanceof ColorStateList) {
                            ((dagg) view).setTabRippleColor((ColorStateList) obj);
                            return true;
                        }
                    }
                    break;
                case 11:
                    if ((view instanceof dagg) && (obj instanceof Boolean)) {
                        ((dagg) view).setUnboundedRipple(((Boolean) obj).booleanValue());
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof cqfe) {
            iab iabVar = iab.INLINE_LABEL;
            cqfe cqfeVar = cqfe.ACCESSIBILITY_DELEGATE;
            if (((cqfe) cqkuVar).ordinal() == 109 && (view instanceof dagg)) {
                dagg daggVar = (dagg) view;
                hzu.a(daggVar, 0, daggVar.i() - 1);
                return true;
            }
        }
        if (cqkuVar instanceof iab) {
            iab iabVar2 = iab.INLINE_LABEL;
            cqfe cqfeVar2 = cqfe.ACCESSIBILITY_DELEGATE;
            int ordinal = ((iab) cqkuVar).ordinal();
            if (ordinal != 1) {
                if (ordinal == 2 && (view instanceof dagg)) {
                    ((dagg) view).b();
                    return true;
                }
            } else if (view instanceof dagg) {
                ((dagg) view).b();
                return true;
            }
        }
        return false;
    }
}
