package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dbzg  reason: default package */
/* loaded from: classes.dex */
final class dbzg extends dbzj<Map.Entry> {
    final /* synthetic */ dbzn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbzg(dbzn dbznVar) {
        super(dbznVar);
        this.a = dbznVar;
    }

    @Override // defpackage.dbzj
    public final /* bridge */ /* synthetic */ Map.Entry a(int i) {
        return new dbzl(this.a, i);
    }
}
