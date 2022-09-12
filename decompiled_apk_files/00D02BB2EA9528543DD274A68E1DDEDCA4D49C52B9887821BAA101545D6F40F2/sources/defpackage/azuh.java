package defpackage;

import java.util.regex.Pattern;
/* renamed from: azuh  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class azuh implements dbsl {
    static final dbsl a = new azuh();

    private azuh() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        afga afgaVar = (afga) obj;
        Pattern pattern = azui.a;
        return afhf.a(afgaVar.b(), "/maps/placelists/all") && azui.a.matcher(afgaVar.b().getPath()).matches();
    }
}
