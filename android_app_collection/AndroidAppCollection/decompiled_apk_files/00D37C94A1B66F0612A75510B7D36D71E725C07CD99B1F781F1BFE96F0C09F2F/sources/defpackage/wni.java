package defpackage;

import j$.util.OptionalLong;
/* compiled from: PG */
/* renamed from: wni  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class wni implements ayqb {
    public final /* synthetic */ wnj a;
    private final /* synthetic */ int b;

    public /* synthetic */ wni(wnj wnjVar, int i) {
        this.b = i;
        this.a = wnjVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            wnj wnjVar = this.a;
            ahhx ahhxVar = (ahhx) obj;
            if (!wnjVar.b.isPresent()) {
                return;
            }
            long e = ahhxVar.e() - wnjVar.b.getAsLong();
            if (e < 0) {
                wwf.c("Expected current position after ad video start time");
            }
            for (wlp wlpVar : wnjVar.a) {
                wlpVar.j(e);
            }
            return;
        }
        wnj wnjVar2 = this.a;
        ahho ahhoVar = (ahho) obj;
        if (!ahhoVar.i()) {
            wnjVar2.b = OptionalLong.empty();
            return;
        }
        if (wnjVar2.b.isPresent()) {
            wwf.c("Unexpected update to adVideoLocalStartTimeMs");
        }
        if (ahhoVar.a() < 0 && !ahhoVar.d().equals(ahhoVar.e())) {
            wwf.c("Expected valid adVideoLocalStartTimeMs");
        }
        wnjVar2.b = OptionalLong.of(ahhoVar.a());
        for (wlp wlpVar2 : wnjVar2.a) {
            wlpVar2.i(ahhoVar.e());
        }
    }
}
