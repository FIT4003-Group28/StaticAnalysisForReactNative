package defpackage;
/* compiled from: PG */
/* renamed from: eto  reason: default package */
/* loaded from: classes3.dex */
public final class eto extends acvk {
    /* JADX INFO: Access modifiers changed from: protected */
    public eto(int i, boolean z) {
        super("browse", i, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acvk
    public final boolean a(ymg ymgVar) {
        boolean a = super.a(ymgVar);
        if (!a || ymgVar.getClass() == ewh.class) {
            return a;
        }
        f("abandoned_browse");
        return true;
    }
}
