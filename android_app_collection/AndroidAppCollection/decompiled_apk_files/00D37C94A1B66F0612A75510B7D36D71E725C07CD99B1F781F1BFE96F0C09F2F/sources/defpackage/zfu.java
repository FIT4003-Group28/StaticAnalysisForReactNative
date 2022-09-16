package defpackage;

import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zfu  reason: default package */
/* loaded from: classes4.dex */
public final class zfu implements zfx {
    private final ajc a;

    public zfu(ajc ajcVar) {
        this.a = ajcVar;
    }

    @Override // defpackage.zfx
    public final /* bridge */ /* synthetic */ boolean a(ViewGroup.LayoutParams layoutParams) {
        ajf ajfVar = (ajf) layoutParams;
        ajc ajcVar = ajfVar.a;
        ajc ajcVar2 = this.a;
        if (ajcVar == ajcVar2) {
            return false;
        }
        ajfVar.b(ajcVar2);
        return true;
    }
}
