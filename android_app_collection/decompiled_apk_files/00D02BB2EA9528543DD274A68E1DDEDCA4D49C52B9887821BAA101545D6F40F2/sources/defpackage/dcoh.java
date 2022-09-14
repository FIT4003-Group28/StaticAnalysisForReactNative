package defpackage;

import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dcoh  reason: default package */
/* loaded from: classes5.dex */
final class dcoh extends dcoy<Collection, Collection> {
    final /* synthetic */ dcoi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcoh(dcoi dcoiVar, Iterator it) {
        super(it);
        this.a = dcoiVar;
    }

    @Override // defpackage.dcoy
    public final /* bridge */ /* synthetic */ Collection a(Collection collection) {
        return dcos.e(collection, this.a.g);
    }
}
