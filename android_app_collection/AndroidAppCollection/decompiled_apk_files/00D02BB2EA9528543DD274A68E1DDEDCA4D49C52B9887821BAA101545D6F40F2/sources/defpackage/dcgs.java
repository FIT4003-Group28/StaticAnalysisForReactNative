package defpackage;

import java.util.ListIterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcgs  reason: default package */
/* loaded from: classes5.dex */
final class dcgs extends dcoz {
    final /* synthetic */ dcgx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcgs(ListIterator listIterator, dcgx dcgxVar) {
        super(listIterator);
        this.a = dcgxVar;
    }

    @Override // defpackage.dcoy
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dcoz, java.util.ListIterator
    public final void set(Object obj) {
        dcgx dcgxVar = this.a;
        dbsk.l(dcgxVar.c != null);
        dcgxVar.c.b = obj;
    }
}
