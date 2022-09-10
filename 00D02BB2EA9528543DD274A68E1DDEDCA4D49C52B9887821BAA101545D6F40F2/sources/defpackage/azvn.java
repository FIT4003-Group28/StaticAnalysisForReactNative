package defpackage;
/* compiled from: PG */
/* renamed from: azvn  reason: default package */
/* loaded from: classes3.dex */
public final class azvn extends azwh<azvo> {
    public final dogc a;
    @dzsi
    public final azvm b;

    public azvn(azvm azvmVar) {
        super(azwm.h, azwm.i);
        dbsk.s(azvmVar);
        this.d = "Auto-generate a ClientId, please!";
        this.g = "ServerIds do not apply to this corpus.";
        this.a = dogc.e;
        this.b = azvmVar;
    }

    @Override // defpackage.azwh
    /* renamed from: a */
    public final azvo b() {
        return new azvo(this);
    }

    public azvn(azvo azvoVar, @dzsi azvm azvmVar) {
        super(azvoVar);
        this.a = azvoVar.m();
        this.b = azvmVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public azvn(defpackage.dogc r3) {
        /*
            r2 = this;
            dolk r0 = r3.b
            if (r0 != 0) goto L6
            dolk r0 = defpackage.dolk.h
        L6:
            dojz r1 = r3.c
            if (r1 != 0) goto Lc
            dojz r1 = defpackage.dojz.c
        Lc:
            r2.<init>(r0, r1)
            java.lang.String r0 = "Auto-generate a ClientId, please!"
            r2.d = r0
            java.lang.String r0 = "ServerIds do not apply to this corpus."
            r2.g = r0
            r2.a = r3
            r3 = 0
            r2.b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azvn.<init>(dogc):void");
    }
}
