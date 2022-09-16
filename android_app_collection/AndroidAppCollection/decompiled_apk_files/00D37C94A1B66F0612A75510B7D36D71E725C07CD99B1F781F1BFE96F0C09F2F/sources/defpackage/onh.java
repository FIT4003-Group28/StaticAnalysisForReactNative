package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: onh  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class onh implements ayqb {
    public final /* synthetic */ onj a;
    private final /* synthetic */ int b;

    public /* synthetic */ onh(onj onjVar, int i) {
        this.b = i;
        this.a = onjVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            onj onjVar = this.a;
            int intValue = ((Integer) obj).intValue();
            onjVar.a.b();
            onjVar.a.c(intValue, TimeUnit.MINUTES);
            onjVar.d.aa();
            return;
        }
        onj onjVar2 = this.a;
        zhx zhxVar = (zhx) obj;
        if (onjVar2.g == null) {
            onjVar2.h = true;
        } else {
            onjVar2.c();
        }
    }
}
