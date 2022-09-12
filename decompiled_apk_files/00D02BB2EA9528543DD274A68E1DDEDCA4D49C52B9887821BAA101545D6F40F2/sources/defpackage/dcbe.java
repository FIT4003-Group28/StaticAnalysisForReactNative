package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dcbe  reason: default package */
/* loaded from: classes5.dex */
final class dcbe extends dbxh<Iterator> {
    final /* synthetic */ dcbf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcbe(dcbf dcbfVar, int i) {
        super(i, 0);
        this.a = dcbfVar;
    }

    @Override // defpackage.dbxh
    public final /* bridge */ /* synthetic */ Iterator a(int i) {
        return this.a.a[i].iterator();
    }
}
