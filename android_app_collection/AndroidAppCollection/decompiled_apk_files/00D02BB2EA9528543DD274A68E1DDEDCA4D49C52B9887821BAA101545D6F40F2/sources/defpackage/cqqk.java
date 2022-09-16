package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqqk  reason: default package */
/* loaded from: classes.dex */
public final class cqqk extends cqfb {
    private final cqho a;

    public cqqk(cqho cqhoVar) {
        this.a = cqhoVar;
    }

    public static void c(RecyclerView recyclerView, abg<?> abgVar) {
        recyclerView.setAdapter(abgVar);
        cqrf.a(recyclerView).b(abgVar);
    }

    private static void d(List<cqix<?>> list, cqrj cqrjVar) {
        for (cqix<?> cqixVar : list) {
            cqrjVar.b(cqixVar);
        }
    }

    @Override // defpackage.cqfb, defpackage.cqkv
    public final boolean a(cqku cqkuVar, @dzsi Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        cqrj cqrjVar = null;
        ColorStateList colorStateList = null;
        ColorStateList colorStateList2 = null;
        if (cqkuVar instanceof cqqi) {
            cqfe cqfeVar = cqfe.ACCESSIBILITY_DELEGATE;
            cqqi cqqiVar = cqqi.AUTO_SIZE_CONFIG;
            switch (((cqqi) cqkuVar).ordinal()) {
                case 0:
                    if (view instanceof TextView) {
                        if (obj instanceof cqrn) {
                            cqrn cqrnVar = (cqrn) obj;
                            qf.b((TextView) view, cqrnVar.a, cqrnVar.b, cqrnVar.c, cqrnVar.d);
                            return true;
                        } else if (obj instanceof cqrm) {
                            TextView textView = (TextView) view;
                            int[] iArr = ((cqrm) obj).a;
                            if (Build.VERSION.SDK_INT >= 27) {
                                textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, 2);
                                return true;
                            } else if (!(textView instanceof pu)) {
                                return true;
                            } else {
                                ((pu) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, 2);
                                return true;
                            }
                        }
                    }
                    return false;
                case 1:
                    od.W(view, cqfp.o(obj, view));
                    return true;
                case 2:
                    if (!(view instanceof CompoundButton)) {
                        return false;
                    }
                    ((CompoundButton) view).setButtonTintList(cqfp.o(obj, view));
                    return true;
                case 3:
                    if (view instanceof CardView) {
                        CardView cardView = (CardView) view;
                        if (obj == null) {
                            cardView.setCardBackgroundColor(0);
                            return true;
                        } else if (obj instanceof cqss) {
                            cardView.setCardBackgroundColor(((cqss) obj).c(view.getContext()));
                            return true;
                        } else if (obj instanceof Integer) {
                            cardView.setCardBackgroundColor(((Integer) obj).intValue());
                            return true;
                        }
                    }
                    return false;
                case 4:
                    if (!(obj instanceof cqtv) || !(view instanceof CardView)) {
                        return false;
                    }
                    ((CardView) view).setRadius(((cqtv) obj).a(view.getContext()));
                    return true;
                case 5:
                    if (!(obj instanceof cqtv) || !(view instanceof CardView)) {
                        return false;
                    }
                    ((CardView) view).setCardElevation(((cqtv) obj).a(view.getContext()));
                    return true;
                case 6:
                    if (!(view instanceof CardView)) {
                        return false;
                    }
                    int g = cqfp.g(obj, view);
                    ((CardView) view).setContentPadding(g, g, g, g);
                    return true;
                case 7:
                    if (!(view instanceof CardView)) {
                        return false;
                    }
                    int g2 = cqfp.g(obj, view);
                    CardView cardView2 = (CardView) view;
                    cardView2.setContentPadding(cardView2.Sy(), cardView2.c(), cardView2.b(), g2);
                    return true;
                case 8:
                    if (!(view instanceof CardView)) {
                        return false;
                    }
                    int g3 = cqfp.g(obj, view);
                    CardView cardView3 = (CardView) view;
                    cardView3.setContentPadding(g3, cardView3.c(), cardView3.b(), cardView3.d());
                    return true;
                case 9:
                    if (!(view instanceof CardView)) {
                        return false;
                    }
                    int g4 = cqfp.g(obj, view);
                    CardView cardView4 = (CardView) view;
                    cardView4.setContentPadding(cardView4.Sy(), cardView4.c(), g4, cardView4.d());
                    return true;
                case 10:
                    if (!(view instanceof CardView)) {
                        return false;
                    }
                    int g5 = cqfp.g(obj, view);
                    CardView cardView5 = (CardView) view;
                    cardView5.setContentPadding(cardView5.Sy(), g5, cardView5.b(), cardView5.d());
                    return true;
                case 11:
                    if (!(obj instanceof Boolean) || !(view instanceof RecyclerView)) {
                        return false;
                    }
                    ((RecyclerView) view).setHasFixedSize(((Boolean) obj).booleanValue());
                    return true;
                case 12:
                    if (!(view instanceof RecyclerView) || (obj != null && !(obj instanceof abn))) {
                        return false;
                    }
                    ((RecyclerView) view).setItemAnimator((abn) obj);
                    return true;
                case 13:
                    if (!(view instanceof RecyclerView) || (obj != null && !(obj instanceof abp))) {
                        return false;
                    }
                    abp abpVar = (abp) view.getTag(R.id.recycler_view_item_decoration);
                    abp abpVar2 = (abp) obj;
                    if (abpVar != null) {
                        ((RecyclerView) view).h(abpVar);
                    }
                    if (abpVar2 != null) {
                        ((RecyclerView) view).g(abpVar2);
                    }
                    view.setTag(R.id.recycler_view_item_decoration, abpVar2);
                    return true;
                case 14:
                    if (!(view instanceof RecyclerView) || !(obj instanceof aga)) {
                        return false;
                    }
                    ((aga) obj).e((RecyclerView) view);
                    return true;
                case 15:
                    if (!(obj instanceof cqrb) || !(view instanceof RecyclerView)) {
                        return false;
                    }
                    ((RecyclerView) view).setLayoutManager(((cqrb) obj).a(view.getContext()));
                    return true;
                case 16:
                    if (!(obj instanceof cqtv) || !(view instanceof CardView)) {
                        return false;
                    }
                    ((CardView) view).setMaxCardElevation(((cqtv) obj).a(view.getContext()));
                    return true;
                case 17:
                    if (!(view instanceof RecyclerView) || (obj != null && !(obj instanceof abw))) {
                        return false;
                    }
                    cqrf a = cqrf.a((RecyclerView) view);
                    abw abwVar = (abw) obj;
                    abw abwVar2 = a.c;
                    if (abwVar2 != null) {
                        a.a.E(abwVar2);
                    }
                    if (abwVar != null) {
                        a.a.D(abwVar);
                    }
                    a.c = abwVar;
                    return true;
                case 18:
                    if (!(view instanceof RecyclerView) || (obj != null && !(obj instanceof abx))) {
                        return false;
                    }
                    ((RecyclerView) view).setOnScrollListener((abx) obj);
                    return true;
                case 19:
                    if ((obj != null && !(obj instanceof cqrh)) || !(view instanceof RecyclerView)) {
                        return false;
                    }
                    cqrf.a((RecyclerView) view).b = (cqrh) obj;
                    return true;
                case 20:
                    if ((obj != null && !(obj instanceof cqrf)) || !(view instanceof RecyclerView)) {
                        return false;
                    }
                    cqrf.a((RecyclerView) view);
                    cqrf cqrfVar = (cqrf) obj;
                    return true;
                case 21:
                    if ((obj instanceof Integer) && (view instanceof RecyclerView)) {
                        abs absVar = ((RecyclerView) view).l;
                        if (absVar instanceof aag) {
                            ((aag) absVar).G(((Integer) obj).intValue());
                            return true;
                        }
                    }
                    return false;
                case 22:
                    if (!(obj instanceof Boolean) || !(view instanceof CardView)) {
                        return false;
                    }
                    ((CardView) view).setPreventCornerOverlap(((Boolean) obj).booleanValue());
                    return true;
                case 23:
                    if (!(view instanceof RecyclerView) || (obj != null && !(obj instanceof acb))) {
                        return false;
                    }
                    ((RecyclerView) view).setRecyclerListener((acb) obj);
                    return true;
                case 24:
                    if (!(view instanceof RecyclerView) || !(obj instanceof cqrl)) {
                        return false;
                    }
                    RecyclerView recyclerView = (RecyclerView) view;
                    cqrl cqrlVar = (cqrl) obj;
                    abs absVar2 = recyclerView.l;
                    if (absVar2 instanceof aag) {
                        aag aagVar = (aag) absVar2;
                        int ac = aagVar.ac();
                        int a2 = cqrlVar.a();
                        if (ac == a2) {
                            return true;
                        }
                        if (Math.abs(ac - a2) > cqrlVar.b()) {
                            aagVar.P(((-Integer.signum(a2 - ac)) * cqrlVar.b()) + a2, 0);
                        }
                        cqqj cqqjVar = new cqqj(recyclerView.getContext());
                        cqqjVar.g = a2;
                        recyclerView.l.aw(cqqjVar);
                        return true;
                    }
                    String valueOf = String.valueOf(absVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
                    sb.append("Invalid LayoutManager type. Expected LinearLayoutManager, found ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                case 25:
                    if (!(obj instanceof cqrd) || !(view instanceof RecyclerView)) {
                        return false;
                    }
                    RecyclerView recyclerView2 = (RecyclerView) view;
                    adz a3 = ((cqrd) obj).a(view.getContext());
                    adz a4 = cqre.a(recyclerView2);
                    if (a4 != null) {
                        a4.f(null);
                    }
                    if (a3 != null) {
                        a3.f(recyclerView2);
                    }
                    recyclerView2.setTag(R.id.recycler_view_snap_helper, a3);
                    return true;
                case 26:
                    if (view instanceof RecyclerView) {
                        abs absVar3 = ((RecyclerView) view).l;
                        if (absVar3 instanceof zy) {
                            zy zyVar = (zy) absVar3;
                            if (obj instanceof Integer) {
                                Integer num = (Integer) obj;
                                if (num.intValue() <= 0) {
                                    num = 1;
                                }
                                zyVar.q(num.intValue());
                                return true;
                            }
                        }
                    }
                    return false;
                case 27:
                    if (view instanceof RecyclerView) {
                        abs absVar4 = ((RecyclerView) view).l;
                        if (absVar4 instanceof zy) {
                            zy zyVar2 = (zy) absVar4;
                            if (obj instanceof zx) {
                                zyVar2.g = (zx) obj;
                                return true;
                            }
                        }
                    }
                    return false;
                case 28:
                    if (view instanceof SwitchCompat) {
                        SwitchCompat switchCompat = (SwitchCompat) view;
                        if (obj == null) {
                            switchCompat.setThumbDrawable(null);
                            return true;
                        } else if (obj instanceof cqtd) {
                            switchCompat.setThumbDrawable(((cqtd) obj).a(switchCompat.getContext()));
                            return true;
                        }
                    }
                    return false;
                case 29:
                    if (!(view instanceof SwitchCompat)) {
                        return false;
                    }
                    SwitchCompat switchCompat2 = (SwitchCompat) view;
                    if (obj != null) {
                        colorStateList2 = cqfp.o(obj, view);
                    }
                    switchCompat2.setThumbTintList(colorStateList2);
                    return true;
                case com.google.android.filament.R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    if (view instanceof SwitchCompat) {
                        SwitchCompat switchCompat3 = (SwitchCompat) view;
                        if (obj == null) {
                            switchCompat3.setThumbTintMode(null);
                            return true;
                        } else if (obj instanceof PorterDuff.Mode) {
                            switchCompat3.setThumbTintMode((PorterDuff.Mode) obj);
                            return true;
                        }
                    }
                    return false;
                case com.google.android.filament.R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    if (!(view instanceof SwitchCompat)) {
                        return false;
                    }
                    SwitchCompat switchCompat4 = (SwitchCompat) view;
                    if (obj != null) {
                        colorStateList = cqfp.o(obj, view);
                    }
                    switchCompat4.setTrackTintList(colorStateList);
                    return true;
                case com.google.android.filament.R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    if (view instanceof SwitchCompat) {
                        SwitchCompat switchCompat5 = (SwitchCompat) view;
                        if (obj == null) {
                            switchCompat5.setTrackTintMode(null);
                            return true;
                        } else if (obj instanceof PorterDuff.Mode) {
                            switchCompat5.setTrackTintMode((PorterDuff.Mode) obj);
                            return true;
                        }
                    }
                    return false;
                case com.google.android.filament.R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    if (!(obj instanceof Boolean) || !(view instanceof CardView)) {
                        return false;
                    }
                    ((CardView) view).setUseCompatPadding(((Boolean) obj).booleanValue());
                    return true;
                case com.google.android.filament.R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    if (!(obj instanceof Boolean) || !(view.getLayoutParams() instanceof aec)) {
                        return false;
                    }
                    ((aec) view.getLayoutParams()).b = ((Boolean) obj).booleanValue();
                    return true;
            }
        } else if (cqkuVar instanceof cqfe) {
            cqfe cqfeVar2 = cqfe.ACCESSIBILITY_DELEGATE;
            cqqi cqqiVar2 = cqqi.AUTO_SIZE_CONFIG;
            int ordinal = ((cqfe) cqkuVar).ordinal();
            if (ordinal != 31) {
                if (ordinal == 92) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (!(layoutParams instanceof aev) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((aev) layoutParams).a = ((Integer) obj).intValue();
                    view.setLayoutParams(layoutParams);
                    return true;
                } else if (ordinal == 109) {
                    if (view instanceof RecyclerView) {
                        RecyclerView recyclerView3 = (RecyclerView) view;
                        if (obj instanceof abg) {
                            c(recyclerView3, (abg) obj);
                            if (obj instanceof cqrj) {
                                cqrjVar = (cqrj) obj;
                            }
                        } else if (obj instanceof cqiv) {
                            cqkj g6 = this.a.g();
                            cqiv cqivVar = (cqiv) obj;
                            abg abgVar = recyclerView3.k;
                            if (!(abgVar instanceof cqrj)) {
                                List<cqix<?>> list = cqivVar.a;
                                cqrjVar = new cqrj(g6);
                                d(list, cqrjVar);
                                c(recyclerView3, cqrjVar);
                            } else {
                                cqrjVar = (cqrj) abgVar;
                                cqrjVar.y();
                                d(cqivVar.a, cqrjVar);
                                cqrjVar.s();
                            }
                        }
                        if (cqrjVar == null) {
                            return true;
                        }
                        recyclerView3.setRecycledViewPool(new cqrc(this.a.g(), cqrjVar));
                        return true;
                    }
                    return false;
                } else if ((ordinal != 173 && ordinal != 167 && ordinal != 168 && ordinal != 170 && ordinal != 171) || !cqjh.a || !(view instanceof CardView)) {
                    return false;
                } else {
                    throw new IllegalArgumentException("Cannot apply padding to a CardView. Use contentPadding instead. See https://developer.android.com/reference/android/support/v7/widget/CardView.html");
                }
            } else if ((view instanceof RecyclerView) && (obj instanceof Boolean)) {
                ((RecyclerView) view).setClipToPadding(((Boolean) obj).booleanValue());
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqfb, defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof cqfe) {
            cqfe cqfeVar = cqfe.ACCESSIBILITY_DELEGATE;
            cqqi cqqiVar = cqqi.AUTO_SIZE_CONFIG;
            if (((cqfe) cqkuVar).ordinal() != 109 || !(view instanceof RecyclerView)) {
                return false;
            }
            RecyclerView recyclerView = (RecyclerView) view;
            abg abgVar = recyclerView.k;
            if (!(abgVar instanceof cqrj)) {
                return false;
            }
            recyclerView.setAdapter(null);
            ((cqrj) abgVar).y();
            return false;
        }
        return false;
    }
}
