package defpackage;

import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.SessionContext;
import java.util.List;
/* compiled from: PG */
/* renamed from: cyxu  reason: default package */
/* loaded from: classes5.dex */
public final class cyxu {
    public static final dbsl<cyvs> a = new cyxs();
    public final ClientConfigInternal b;

    public cyxu(ClientConfigInternal clientConfigInternal) {
        this.b = clientConfigInternal;
    }

    public static <T extends cyff & cyft> T a(final T t, SessionContext sessionContext) {
        if (dcft.m(sessionContext.a(), new dbsl(t) { // from class: cyxl
            private final cyff a;

            {
                this.a = t;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((ContactMethodField) obj).k().equals(this.a.k());
            }
        }).a()) {
            return null;
        }
        return t;
    }

    public static final cygr b(int i) {
        if (i != 0) {
            if (i == 1) {
                return cyxo.a;
            }
            if (i == 2) {
                return cyxp.a;
            }
            if (i == 3) {
                return dyaq.e() ? cyxq.a : cyxr.a;
            }
            StringBuilder sb = new StringBuilder(43);
            sb.append("Not a valid SessionContextRule: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return cyxn.a;
    }

    public static final <T extends cyff & cyft> dcdc<T> c(cygr cygrVar, List<T> list, SessionContext sessionContext) {
        dccx F = dcdc.F();
        for (T t : list) {
            cyff a2 = cygrVar.a(t, sessionContext);
            if (a2 != null) {
                F.g(a2);
            }
        }
        return F.f();
    }
}
