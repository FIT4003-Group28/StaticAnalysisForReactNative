package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: iat  reason: default package */
/* loaded from: classes3.dex */
final class iat implements ahua {
    public String a;
    public String b;
    private final ihp c;
    private final icp d;

    public iat(acuu acuuVar, ifu ifuVar, ihp ihpVar) {
        this.c = ihpVar;
        this.d = new icp(acuuVar, ifuVar);
    }

    @Override // defpackage.ahua
    public final void a(acti actiVar, apzg apzgVar, ahuc ahucVar) {
        if (apzgVar == null) {
            zep.b("No reel nav endpoint.");
        } else {
            this.d.b(Optional.ofNullable(this.c.b), actiVar, apzgVar, this.a, this.b, false, false);
        }
    }
}
