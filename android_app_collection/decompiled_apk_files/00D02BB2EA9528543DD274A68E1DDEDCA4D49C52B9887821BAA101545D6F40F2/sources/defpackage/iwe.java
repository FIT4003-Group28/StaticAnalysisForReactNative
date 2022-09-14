package defpackage;

import defpackage.cqkp;
import java.util.List;
/* compiled from: PG */
/* renamed from: iwe  reason: default package */
/* loaded from: classes6.dex */
public class iwe<T extends cqkp> implements izf<T> {
    private final List<T> a;

    public iwe(List<T> list) {
        this.a = list;
    }

    @Override // defpackage.izf
    public List<T> Pd() {
        return this.a;
    }
}
