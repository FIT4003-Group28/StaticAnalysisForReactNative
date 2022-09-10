package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jdq  reason: default package */
/* loaded from: classes7.dex */
public final class jdq implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        jdn jdnVar;
        jdo jdoVar;
        View view = cqjzVar.c;
        if (cqkuVar instanceof iug) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            switch (((iug) cqkuVar).ordinal()) {
                case 17:
                    if (view instanceof jdp) {
                        jdp jdpVar = (jdp) view;
                        if (obj instanceof jdn) {
                            jdpVar.setCalloutAlignment((jdn) obj);
                        } else {
                            if (obj instanceof Integer) {
                                jdnVar = jdn.values()[((Integer) obj).intValue()];
                            } else if (obj instanceof cqnx) {
                                V v = cqjzVar.j;
                                if (v == 0) {
                                    throw new RuntimeException("Can't apply a viewModel property to a view with a null viewmodel");
                                }
                                jdnVar = jdn.values()[((Integer) ((cqnx) obj).a(v, new Object[0])).intValue()];
                            }
                            jdpVar.setCalloutAlignment(jdnVar);
                        }
                        return true;
                    }
                    break;
                case 18:
                    if ((view instanceof jdp) && (obj == null || (obj instanceof cqtv))) {
                        jdp jdpVar2 = (jdp) view;
                        cqtv cqtvVar = (cqtv) obj;
                        if (cqtvVar != null) {
                            jdpVar2.setCalloutHeight((int) cqtvVar.a(jdpVar2.getContext()));
                        }
                        return true;
                    }
                    break;
                case 19:
                    if ((view instanceof jdp) && (obj == null || (obj instanceof cqtv))) {
                        jdp jdpVar3 = (jdp) view;
                        cqtv cqtvVar2 = (cqtv) obj;
                        if (cqtvVar2 != null) {
                            jdpVar3.setCalloutPosition((int) cqtvVar2.a(jdpVar3.getContext()));
                        }
                        return true;
                    }
                    break;
                case 20:
                    if ((view instanceof jdp) && (obj == null || (obj instanceof cqtv))) {
                        jdp jdpVar4 = (jdp) view;
                        cqtv cqtvVar3 = (cqtv) obj;
                        if (cqtvVar3 != null) {
                            jdpVar4.setCalloutWidth((int) cqtvVar3.a(jdpVar4.getContext()));
                        }
                        return true;
                    }
                    break;
                case 21:
                    if (view instanceof jdp) {
                        jdp jdpVar5 = (jdp) view;
                        if (obj instanceof jdo) {
                            jdpVar5.setCalloutType((jdo) obj);
                        } else {
                            if (obj instanceof Integer) {
                                jdoVar = jdo.values()[((Integer) obj).intValue()];
                            } else if (obj instanceof cqnx) {
                                V v2 = cqjzVar.j;
                                if (v2 == 0) {
                                    throw new RuntimeException("Can't apply a viewModel property to a view with a null viewmodel");
                                }
                                jdoVar = jdo.values()[((Integer) ((cqnx) obj).a(v2, new Object[0])).intValue()];
                            }
                            jdpVar5.setCalloutType(jdoVar);
                        }
                        return true;
                    }
                    break;
                case 22:
                    if ((view instanceof jdp) && (obj == null || (obj instanceof cqtv))) {
                        ((jdp) view).g((cqtv) obj);
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
        return false;
    }
}
