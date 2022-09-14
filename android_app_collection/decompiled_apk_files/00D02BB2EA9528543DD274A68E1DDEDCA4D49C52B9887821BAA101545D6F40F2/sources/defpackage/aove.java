package defpackage;

import java.io.Serializable;
import java.lang.Comparable;
/* compiled from: PG */
/* renamed from: aove  reason: default package */
/* loaded from: classes2.dex */
abstract class aove<K extends Comparable<? super K>, U extends Serializable> {
    public static <K extends Comparable<? super K>, U extends Serializable> aove<K, U> c(angu<K, U> anguVar, angt<K, U> angtVar) {
        return new aoun(anguVar, angtVar);
    }

    public abstract angu<K, U> a();

    public abstract angt<K, U> b();
}
