package defpackage;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ahtx  reason: default package */
/* loaded from: classes.dex */
public final class ahtx {
    public final Set a = new HashSet();
    public acum b;
    public byte[] c;
    public byte[] d;
    public acti e;

    public static acum a(apzg apzgVar) {
        if (apzgVar == null || !apzgVar.qn(atno.b)) {
            return null;
        }
        awbs awbsVar = ((atnp) apzgVar.qm(atno.b)).h;
        if (awbsVar == null) {
            awbsVar = awbs.a;
        }
        return acun.a(awbsVar);
    }

    public static void c(acti actiVar, acum acumVar, String str) {
        if (acumVar == null) {
            actiVar.r(str);
        } else {
            actiVar.s(acumVar, str);
        }
    }

    public final void b(Runnable runnable, ByteBuffer byteBuffer, apzg apzgVar) {
        acum a = a(apzgVar);
        byte[] array = byteBuffer.array();
        if (a != null) {
            this.e.E(new acte(array), a);
        } else {
            this.e.D(new acte(array));
        }
        runnable.run();
    }

    public final void d(acti actiVar) {
        actiVar.getClass();
        this.e = actiVar;
    }
}
