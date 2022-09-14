package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bbvd  reason: default package */
/* loaded from: classes3.dex */
public abstract class bbvd implements Serializable {
    public static bbvd e(@dzsi akqq akqqVar) {
        bbsy bbsyVar = new bbsy();
        bbsyVar.a = akqqVar;
        bbsyVar.b(false);
        bbsyVar.c(false);
        return bbsyVar.a();
    }

    public static bbvd f(@dzsi akqq akqqVar) {
        bbsy bbsyVar = new bbsy();
        bbsyVar.a = akqqVar;
        bbsyVar.b(true);
        bbsyVar.c(false);
        return bbsyVar.a();
    }

    @dzsi
    public abstract akqq a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract bbvc d();
}
