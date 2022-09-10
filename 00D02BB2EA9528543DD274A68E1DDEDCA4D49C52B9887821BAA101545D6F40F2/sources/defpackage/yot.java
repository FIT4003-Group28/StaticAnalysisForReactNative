package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: yot  reason: default package */
/* loaded from: classes7.dex */
public class yot<T extends Serializable> implements Serializable, ynm {
    private final String a;
    private final dcdc<ynq<T>> b;

    public yot(String str, Iterable<? extends ynq<T>> iterable) {
        this.a = str;
        this.b = dcdc.q(iterable);
    }

    @Override // defpackage.ynm
    public Iterable<ynq<T>> a() {
        return this.b;
    }

    @Override // defpackage.ynm
    public CharSequence b() {
        return this.a;
    }

    @Override // defpackage.ynm
    public Boolean c() {
        return Boolean.valueOf(!this.b.isEmpty());
    }
}
