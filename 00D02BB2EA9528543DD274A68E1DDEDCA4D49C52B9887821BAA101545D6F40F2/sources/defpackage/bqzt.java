package defpackage;

import android.os.Bundle;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bqzt  reason: default package */
/* loaded from: classes4.dex */
public final class bqzt extends gen {
    private static final dcqe c = dcqe.c("bqzt");
    public bwqv a;
    public bsql b;
    @dzsi
    private bwrs<brln> d = null;

    public static bqzt g(bwqv bwqvVar, bwrs<brln> bwrsVar) {
        bqzt bqztVar = new bqzt();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "searchRequestRef", bwrsVar);
        bqztVar.B(bundle);
        return bqztVar;
    }

    @dzsi
    private final brln q() {
        bwrs<brln> bwrsVar = this.d;
        if (bwrsVar != null) {
            return bwrsVar.c();
        }
        return null;
    }

    @Override // defpackage.ges
    protected final void Nv() {
        ((bqzu) btsx.b(bqzu.class, this)).df(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010c  */
    @Override // defpackage.gen
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Dialog i(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqzt.i(android.os.Bundle):android.app.Dialog");
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        try {
            this.d = this.a.e(brln.class, this.o, "searchRequestRef");
        } catch (IOException | IllegalArgumentException e) {
            bvoo.h("Corrupt storage data: %s", e);
            this.d = null;
        }
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtxw.dE;
    }
}
