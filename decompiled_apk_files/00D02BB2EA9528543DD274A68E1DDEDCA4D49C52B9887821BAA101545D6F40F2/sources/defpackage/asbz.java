package defpackage;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: asbz  reason: default package */
/* loaded from: classes2.dex */
public abstract class asbz implements Serializable {
    public static asbz d(dqvj dqvjVar) {
        asby e = e();
        e.d(dqvjVar);
        return e.a();
    }

    public static asby e() {
        asbw asbwVar = new asbw();
        asbwVar.c(Collections.emptyList());
        asbwVar.b(false);
        return asbwVar;
    }

    public abstract dqvj a();

    public abstract List<amvh> b();

    public abstract boolean c();
}
