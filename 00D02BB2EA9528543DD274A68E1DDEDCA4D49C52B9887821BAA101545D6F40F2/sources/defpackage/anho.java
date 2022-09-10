package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: anho  reason: default package */
/* loaded from: classes2.dex */
public abstract class anho implements Serializable {
    private static final dcqe a = dcqe.c("anho");

    public static anho c(dpop dpopVar, aogy aogyVar) {
        if (aogc.i(aogyVar.a().a()) < dpopVar.b || aogc.g(aogyVar.a().b()) > dpopVar.c) {
            bvoo.h("(%s, %s) cannot contain %s", Long.valueOf(dpopVar.b), Long.valueOf(dpopVar.c), aogyVar.a());
        }
        return new angl(bvrt.b(dpopVar), aogyVar);
    }

    public abstract bvrt<dpop> a();

    public abstract aogy b();
}
