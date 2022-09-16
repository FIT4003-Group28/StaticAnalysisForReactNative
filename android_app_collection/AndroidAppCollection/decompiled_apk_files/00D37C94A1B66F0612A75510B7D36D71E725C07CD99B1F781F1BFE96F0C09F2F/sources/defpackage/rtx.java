package defpackage;

import com.google.android.gms.common.api.Scope;
/* compiled from: PG */
/* renamed from: rtx  reason: default package */
/* loaded from: classes4.dex */
public final class rtx {
    public static final qso a;
    public static final twx b;
    public static final twx c;
    public static final tzc d;
    static final tzc e;

    static {
        twx twxVar = new twx();
        b = twxVar;
        twx twxVar2 = new twx();
        c = twxVar2;
        rtu rtuVar = new rtu();
        d = rtuVar;
        rtv rtvVar = new rtv();
        e = rtvVar;
        new Scope("profile");
        new Scope("email");
        a = new qso("SignIn.API", rtuVar, twxVar, null, null, null);
        new qso("SignIn.INTERNAL_API", rtvVar, twxVar2, null, null, null);
    }
}
