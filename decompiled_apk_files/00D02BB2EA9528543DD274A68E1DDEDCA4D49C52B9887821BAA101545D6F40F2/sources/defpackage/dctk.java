package defpackage;

import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dctk  reason: default package */
/* loaded from: classes.dex */
public final class dctk extends dctc {
    public dctk(Logger logger) {
        super(logger);
    }

    @Override // defpackage.dcrl
    public final void c(dcrj dcrjVar) {
        e(new dctj(dcrjVar, dcro.a), dcrjVar.k());
    }

    @Override // defpackage.dcrl
    public final void d(RuntimeException runtimeException, dcrj dcrjVar) {
        e(new dctj(runtimeException, dcrjVar, dcro.a), dcrjVar.k());
    }
}
