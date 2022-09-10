package defpackage;
/* compiled from: PG */
/* renamed from: cwek  reason: default package */
/* loaded from: classes5.dex */
public final class cwek<AccountT> extends cwem<AccountT> {
    public final dbsg<cwdy> a = dbpy.a;
    public dcdc<cwea> b;
    public dcdc<cwbe<AccountT, ? extends cwbn>> c;

    @Override // defpackage.cwem
    public final void a(dcdc<cwea> dcdcVar) {
        if (dcdcVar != null) {
            this.b = dcdcVar;
            return;
        }
        throw new NullPointerException("Null customActions");
    }
}
