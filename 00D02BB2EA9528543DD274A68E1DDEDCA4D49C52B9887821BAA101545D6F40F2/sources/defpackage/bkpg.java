package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bkpg  reason: default package */
/* loaded from: classes3.dex */
public abstract class bkpg implements Serializable {
    public static bkpf e(cdjk cdjkVar) {
        bkpa bkpaVar = new bkpa();
        if (cdjkVar != null) {
            bkpaVar.b = cdjkVar;
            bkpaVar.b("");
            bkpaVar.a = null;
            bkpaVar.d(false);
            return bkpaVar;
        }
        throw new NullPointerException("Null surface");
    }

    public static bkpg f(cdjk cdjkVar) {
        return e(cdjkVar).a();
    }

    public abstract String a();

    @dzsi
    public abstract bvrt<djck> b();

    public abstract boolean c();

    public abstract cdjk d();
}
