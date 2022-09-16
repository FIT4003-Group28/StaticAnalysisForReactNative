package defpackage;
/* compiled from: PG */
/* renamed from: aztp  reason: default package */
/* loaded from: classes2.dex */
public final class aztp extends azsu implements azsc {
    final /* synthetic */ CharSequence a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aztp(CharSequence charSequence) {
        super(1);
        this.a = charSequence;
    }

    @Override // defpackage.azsc
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aztd aztdVar = (aztd) obj;
        aztdVar.getClass();
        return this.a.subSequence(Integer.valueOf(aztdVar.a).intValue(), Integer.valueOf(aztdVar.b).intValue() + 1).toString();
    }
}
