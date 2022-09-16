package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: aslu  reason: default package */
/* loaded from: classes2.dex */
public class aslu implements asmo {
    protected final awpk a;
    private final asmp b;

    public aslu(awpk awpkVar, asmp asmpVar) {
        dbsk.t(awpkVar, "pantasticController");
        this.a = awpkVar;
        dbsk.t(asmpVar, "stateController");
        this.b = asmpVar;
    }

    @Override // defpackage.asmo
    public final void NZ(@dzsi Bundle bundle) {
        this.a.NZ(bundle);
    }

    @Override // defpackage.asmo
    public final void Qo(Configuration configuration) {
    }

    @Override // defpackage.asmo
    public final void Qp() {
        this.a.Qp();
    }

    @Override // defpackage.asmo
    public final void Qr(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public final void b() {
        this.a.h(this.b);
        this.a.b();
    }

    @Override // defpackage.asmo
    public final void c() {
        this.a.c();
        this.a.h(null);
    }
}
