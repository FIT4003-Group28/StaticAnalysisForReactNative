package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: pim  reason: default package */
/* loaded from: classes7.dex */
public abstract class pim<V> {
    public static final dclu<pfm<?>> g = dcln.a.g(pil.a);

    public static long e(@dzsi dfoo dfooVar) {
        if (dfooVar == null) {
            return -1L;
        }
        return TimeUnit.MICROSECONDS.toMillis(dfooVar.c);
    }

    public abstract dehn<dcdc<pfm<V>>> a();

    public abstract void b(pfm<V> pfmVar);
}
