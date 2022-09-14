package defpackage;

import android.text.TextUtils;
import android.view.View;
/* compiled from: PG */
/* renamed from: jcc  reason: default package */
/* loaded from: classes7.dex */
public final class jcc implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        cpms cpmsVar;
        CharSequence charSequence;
        View view = cqjzVar.c;
        if (cqkuVar instanceof iug) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            int ordinal = ((iug) cqkuVar).ordinal();
            if (ordinal == 0) {
                if (!(view instanceof jcd)) {
                    return false;
                }
                if (obj != null && !(obj instanceof cpmx)) {
                    return false;
                }
                jcd jcdVar = (jcd) view;
                cpmx cpmxVar = (cpmx) obj;
                if (cpmxVar != null) {
                    cpmk cpmkVar = jcdVar.b;
                    if (cpmxVar != cpmkVar.d) {
                        cpmkVar.d = cpmxVar;
                        cpmkVar.c.setAdapter(new cpmu(cpmkVar.b, cpmkVar.d));
                        cpmkVar.c.setOnItemClickListener(new cpmi(cpmkVar));
                    }
                }
                return true;
            } else if (ordinal == 1) {
                if (!(view instanceof jcd)) {
                    return false;
                }
                if (obj != null && !(obj instanceof cpnm)) {
                    return false;
                }
                jcd jcdVar2 = (jcd) view;
                cpnm cpnmVar = (cpnm) obj;
                if (cpnmVar != null) {
                    cpmk cpmkVar2 = jcdVar2.b;
                    cpmkVar2.e = cpnmVar;
                    ((cpnk) cpmkVar2.h).c = cpnmVar;
                }
                return true;
            } else if (ordinal == 2) {
                if (!(view instanceof jcd)) {
                    return false;
                }
                if (obj != null && !(obj instanceof jca)) {
                    return false;
                }
                jcd jcdVar3 = (jcd) view;
                jca jcaVar = (jca) obj;
                if (jcaVar != null) {
                    cpmk cpmkVar3 = jcdVar3.b;
                    cpmm cpmmVar = jcaVar.a;
                    dbsk.t(cpmmVar, "AddressWidget.setAddressWidgetListeners must not be called with null parameter.");
                    cpmkVar3.g = cpmmVar;
                    cpmkVar3.c.setInputListener(cpmmVar.b());
                    if (cpmmVar.c() != null) {
                        cpmkVar3.c.a(cpmmVar.c());
                    }
                    if (cpmmVar.d() != null) {
                        cpmkVar3.h.c(cpmmVar.d());
                    }
                }
                return true;
            } else if (ordinal != 3) {
                if (ordinal != 4 || !(view instanceof jcd)) {
                    return false;
                }
                jcd jcdVar4 = (jcd) view;
                if (obj instanceof cqsn) {
                    charSequence = ((cqsn) obj).a(jcdVar4.getContext());
                } else if (obj instanceof CharSequence) {
                    charSequence = (CharSequence) obj;
                } else if (obj instanceof Integer) {
                    charSequence = jcdVar4.getResources().getString(((Integer) obj).intValue());
                } else if (obj != null) {
                    String valueOf = String.valueOf(obj.getClass());
                    String valueOf2 = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28 + String.valueOf(valueOf2).length());
                    sb.append("Unable to resolve String: ");
                    sb.append(valueOf);
                    sb.append(": ");
                    sb.append(valueOf2);
                    throw new IllegalArgumentException(sb.toString());
                } else {
                    charSequence = null;
                }
                if (!TextUtils.equals(jcdVar4.b.d(), charSequence)) {
                    jcdVar4.b.c.setTextSilently(charSequence.toString());
                }
                return true;
            } else if (!(view instanceof jcd)) {
                return false;
            } else {
                if (obj != null && !(obj instanceof jcb)) {
                    return false;
                }
                jcd jcdVar5 = (jcd) view;
                jcb jcbVar = (jcb) obj;
                if (jcbVar != null && (cpmsVar = jcbVar.a) != null) {
                    cpmk cpmkVar4 = jcdVar5.b;
                    cpmkVar4.f = cpmsVar;
                    cpmkVar4.a();
                }
                return true;
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
