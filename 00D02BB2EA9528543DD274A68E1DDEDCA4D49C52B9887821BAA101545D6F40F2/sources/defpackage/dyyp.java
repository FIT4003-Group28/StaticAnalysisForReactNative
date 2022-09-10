package defpackage;

import defpackage.dssj;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyyp  reason: default package */
/* loaded from: classes6.dex */
public final class dyyp<T extends dssj> implements dyhp<T> {
    private final T a;

    public dyyp(T t) {
        this.a = t;
    }

    @Override // defpackage.dyhp
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        try {
            return (dssj) ((dssr) ((dsqw) this.a).cu(7)).i(bArr, dyyq.a);
        } catch (dsrm e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.dyhp
    public final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        return ((dssj) obj).bS();
    }
}
