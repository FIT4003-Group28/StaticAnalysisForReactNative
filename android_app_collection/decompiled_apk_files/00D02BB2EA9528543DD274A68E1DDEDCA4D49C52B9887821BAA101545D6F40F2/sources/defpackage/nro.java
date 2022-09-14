package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: nro  reason: default package */
/* loaded from: classes7.dex */
public final class nro extends cqfb {
    private static boolean c(@dzsi Object obj, View view) {
        if (!(view instanceof nst) || !(obj instanceof Boolean)) {
            return false;
        }
        ((nst) view).setRememberChildFocus(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // defpackage.cqfb, defpackage.cqkv
    public final boolean a(cqku cqkuVar, @dzsi Object obj, final cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof nrl) {
            cqfe cqfeVar = cqfe.ACCESSIBILITY_DELEGATE;
            nrl nrlVar = nrl.AVAILABLE_TEXT_HEIGHT;
            switch (((nrl) cqkuVar).ordinal()) {
                case 0:
                    if (!(view instanceof nta) || (obj != null && !(obj instanceof cqtv))) {
                        return false;
                    }
                    ((nta) view).setAvailableTextHeight((cqtv) obj);
                    return true;
                case 1:
                    if (!(view instanceof ViewGroup)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof Integer)) {
                        return false;
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    int intValue = obj == null ? -1 : ((Integer) obj).intValue();
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (intValue == childAt.getId()) {
                            childAt.setVisibility(0);
                        } else {
                            childAt.setVisibility(8);
                        }
                    }
                    return true;
                case 2:
                    if (!(view instanceof nst)) {
                        return false;
                    }
                    nst nstVar = (nst) view;
                    if (obj instanceof cqjg) {
                        final cqjg cqjgVar = (cqjg) obj;
                        nstVar.setDefaultViewProvider(new nss(cqjzVar, cqjgVar) { // from class: nrm
                            private final cqjz a;
                            private final cqjg b;

                            {
                                this.a = cqjzVar;
                                this.b = cqjgVar;
                            }

                            @Override // defpackage.nss
                            public final View a(nst nstVar2) {
                                cqjz cqjzVar2 = this.a;
                                cqjg cqjgVar2 = this.b;
                                cqjzVar2.g.t();
                                return cqhu.a(nstVar2, cqjgVar2);
                            }
                        });
                        return true;
                    } else if (!(obj instanceof Integer)) {
                        return false;
                    } else {
                        final int intValue2 = ((Integer) obj).intValue();
                        nstVar.setDefaultViewProvider(new nss(intValue2) { // from class: nrn
                            private final int a;

                            {
                                this.a = intValue2;
                            }

                            @Override // defpackage.nss
                            public final View a(nst nstVar2) {
                                return nstVar2.findViewById(this.a);
                            }
                        });
                        return true;
                    }
                case 3:
                    if (!(view instanceof nsm)) {
                        return false;
                    }
                    nsm nsmVar = (nsm) view;
                    if (obj instanceof cqjg) {
                        cqjzVar.g.t();
                        nsmVar.setFocusCenter(cqhu.a(view, (cqjg) obj));
                    } else if (obj instanceof Integer) {
                        nsmVar.setFocusCenter(view.findViewById(((Integer) obj).intValue()));
                    } else {
                        if (obj != null) {
                            return false;
                        }
                        nsmVar.setFocusCenter(null);
                        return true;
                    }
                    return true;
                case 4:
                    if (view instanceof nsy) {
                        nsy nsyVar = (nsy) view;
                        if (obj instanceof Boolean) {
                            nsyVar.setRestrictInteraction(((Boolean) obj).booleanValue());
                            return true;
                        }
                    }
                    return false;
                case 5:
                    if (view instanceof nsy) {
                        nsy nsyVar2 = (nsy) view;
                        if (obj instanceof View.OnTouchListener) {
                            nsyVar2.setOnRestrictedTouchListener((View.OnTouchListener) obj);
                            return true;
                        }
                    }
                    return false;
                case 6:
                    if (!(view instanceof nto)) {
                        return false;
                    }
                    nto ntoVar = (nto) view;
                    if (obj instanceof Integer) {
                        int intValue3 = ((Integer) obj).intValue();
                        if (intValue3 == 0) {
                            ntoVar.setLongText("");
                        } else {
                            ntoVar.setLongText(view.getContext().getString(intValue3));
                        }
                    } else if (obj instanceof CharSequence) {
                        ntoVar.setLongText((CharSequence) obj);
                    } else if (!(obj instanceof cqsn)) {
                        return false;
                    } else {
                        ntoVar.setLongText(((cqsn) obj).a(view.getContext()));
                        return true;
                    }
                    return true;
                case 7:
                    if (!(view instanceof nsu) || !(obj instanceof cqtv)) {
                        return false;
                    }
                    ((nsu) view).setMinWidth(((cqtv) obj).e(view.getContext()));
                    return true;
                case 8:
                    if (!(view instanceof nta) || obj == null || !(obj instanceof dcep)) {
                        return false;
                    }
                    ((nta) view).setPreferredTextSizes((dcep) obj);
                    return true;
                case 9:
                    return c(obj, view);
                case 10:
                    if (!(view instanceof nto)) {
                        return false;
                    }
                    nto ntoVar2 = (nto) view;
                    if (obj instanceof Integer) {
                        int intValue4 = ((Integer) obj).intValue();
                        if (intValue4 == 0) {
                            ntoVar2.setShortText("");
                        } else {
                            ntoVar2.setShortText(view.getContext().getString(intValue4));
                        }
                    } else if (obj instanceof CharSequence) {
                        ntoVar2.setShortText((CharSequence) obj);
                    } else if (!(obj instanceof cqsn)) {
                        return false;
                    } else {
                        ntoVar2.setShortText(((cqsn) obj).a(view.getContext()));
                        return true;
                    }
                    return true;
                case 11:
                    if (!(view instanceof nud) || !(obj instanceof cqss)) {
                        return false;
                    }
                    ((nud) view).setBaseColor(((cqss) obj).b(view.getContext()));
                    return true;
                case 12:
                    if (!(view instanceof nud) || !(obj instanceof cqtd)) {
                        return false;
                    }
                    ((nud) view).setButtonIcon(((cqtd) obj).a(view.getContext()));
                    return true;
                case 13:
                    if (!(view instanceof nud) || !(obj instanceof cqtv)) {
                        return false;
                    }
                    ((nud) view).setButtonSize(((cqtv) obj).e(view.getContext()));
                    return true;
                case 14:
                    if (!(view instanceof nud) || !(obj instanceof cqtv)) {
                        return false;
                    }
                    ((nud) view).setZoomWidgetCollapsedTopMargin(((cqtv) obj).NR(view.getContext()));
                    return true;
                case 15:
                    if (!(view instanceof nud) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((nud) view).setContainerId(((Integer) obj).intValue());
                    return true;
                case 16:
                    if (!(view instanceof nud) || !(obj instanceof cqtv)) {
                        return false;
                    }
                    ((nud) view).setThumbSize(((cqtv) obj).e(view.getContext()));
                    return true;
                case 17:
                    if (!(view instanceof nud) || !(obj instanceof cqss)) {
                        return false;
                    }
                    ((nud) view).setTrackColor(((cqss) obj).b(view.getContext()));
                    return true;
                case 18:
                    if (!(view instanceof nud) || !(obj instanceof cqtd)) {
                        return false;
                    }
                    ((nud) view).setZoomInIcon(((cqtd) obj).a(view.getContext()));
                    return true;
                case 19:
                    if (!(view instanceof nud) || !(obj instanceof cqtd)) {
                        return false;
                    }
                    ((nud) view).setZoomOutIcon(((cqtd) obj).a(view.getContext()));
                    return true;
            }
        } else if (cqkuVar instanceof cqfe) {
            cqfe cqfeVar2 = cqfe.ACCESSIBILITY_DELEGATE;
            nrl nrlVar2 = nrl.AVAILABLE_TEXT_HEIGHT;
            if (((cqfe) cqkuVar).ordinal() == 18 && (view instanceof nud) && (obj instanceof cqtd)) {
                ((nud) view).setCardBackground(((cqtd) obj).a(view.getContext()));
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqfb, defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar == nrl.REMEMBER_CHILD_FOCUS) {
            return c(false, view);
        }
        return false;
    }
}
