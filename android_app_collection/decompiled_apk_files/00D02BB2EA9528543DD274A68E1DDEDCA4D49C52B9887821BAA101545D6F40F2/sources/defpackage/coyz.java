package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
/* compiled from: PG */
/* renamed from: coyz  reason: default package */
/* loaded from: classes.dex */
public final class coyz {
    public static final cnoa<cozi> a;
    public static final cnoa<cozi> b;
    public static final cnnp<cozi, cozb> c;
    static final cnnp<cozi, coyy> d;
    public static final Api<cozb> e;

    static {
        cnoa<cozi> cnoaVar = new cnoa<>();
        a = cnoaVar;
        cnoa<cozi> cnoaVar2 = new cnoa<>();
        b = cnoaVar2;
        coyw coywVar = new coyw();
        c = coywVar;
        coyx coyxVar = new coyx();
        d = coyxVar;
        new Scope("profile");
        new Scope("email");
        e = new Api<>("SignIn.API", coywVar, cnoaVar);
        new Api("SignIn.INTERNAL_API", coyxVar, cnoaVar2);
    }
}
