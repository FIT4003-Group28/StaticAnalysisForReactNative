package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcdu  reason: default package */
/* loaded from: classes5.dex */
final class dcdu extends dcdc {
    final /* synthetic */ dcdc a;

    public dcdu(dcdc dcdcVar) {
        this.a = dcdcVar;
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return ((Map.Entry) this.a.get(i)).getValue();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
