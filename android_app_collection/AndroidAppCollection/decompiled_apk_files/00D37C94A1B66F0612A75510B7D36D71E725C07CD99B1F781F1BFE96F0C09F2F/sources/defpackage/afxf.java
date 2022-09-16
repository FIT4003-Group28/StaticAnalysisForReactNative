package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: afxf  reason: default package */
/* loaded from: classes.dex */
final class afxf extends afyl {
    final /* synthetic */ long a;
    final /* synthetic */ afxg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afxf(afxg afxgVar, String str, cez cezVar, long j) {
        super(5, str, cezVar);
        this.b = afxgVar;
        this.a = j;
    }

    @Override // defpackage.yua
    public final ytz i() {
        return ytz.LOW;
    }

    @Override // defpackage.yua
    public final cfb qy(cew cewVar) {
        String.format(Locale.US, "Prewarm took %dms (%d)", Long.valueOf(((snc) this.b.a.get()).c() - this.a), Integer.valueOf(cewVar.a));
        return cfb.b(null, null);
    }

    @Override // defpackage.yua
    public final /* bridge */ /* synthetic */ void qz(Object obj) {
        Void r1 = (Void) obj;
    }
}
