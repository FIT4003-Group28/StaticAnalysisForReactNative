package defpackage;
/* compiled from: PG */
/* renamed from: eue  reason: default package */
/* loaded from: classes3.dex */
public final class eue extends acvk {
    /* JADX INFO: Access modifiers changed from: protected */
    public eue(int i, boolean z) {
        super("inline_playback", i, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acvk
    public final boolean a(ymg ymgVar) {
        boolean a = super.a(ymgVar);
        if (!a || ymgVar.getClass() == ahgv.class) {
            return a;
        }
        f("abandoned_inline_playback");
        return true;
    }
}
