package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cgdn  reason: default package */
/* loaded from: classes4.dex */
public final class cgdn extends akvn<aktd> {
    final /* synthetic */ cjtd a;
    final /* synthetic */ ilo b;
    final /* synthetic */ cgdv c;

    public cgdn(cgdv cgdvVar, cjtd cjtdVar, ilo iloVar) {
        this.c = cgdvVar;
        this.a = cjtdVar;
        this.b = iloVar;
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        aktd aktdVar = (aktd) obj;
        cgdv cgdvVar = this.c;
        if (!cgdvVar.aD || cgdvVar.e.f().booleanValue()) {
            return;
        }
        this.c.bg.i(this.a);
        akqi ai = this.b.ai();
        List<cgwi> b = this.c.e.b();
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i).z().ai().equals(ai)) {
                this.c.bG(i);
            }
        }
    }
}
