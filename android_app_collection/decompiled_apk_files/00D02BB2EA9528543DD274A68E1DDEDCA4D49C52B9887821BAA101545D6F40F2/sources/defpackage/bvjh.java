package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bvjh  reason: default package */
/* loaded from: classes.dex */
public final class bvjh implements dbty<dbsg> {
    final /* synthetic */ String a;
    final /* synthetic */ dbty b;
    final /* synthetic */ bvjj c;

    public bvjh(bvjj bvjjVar, String str, dbty dbtyVar) {
        this.c = bvjjVar;
        this.a = str;
        this.b = dbtyVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ dbsg a() {
        Object a;
        return (!this.c.d.contains(this.a) || (a = this.b.a()) == null) ? dbpy.a : dbsg.i(a);
    }
}
