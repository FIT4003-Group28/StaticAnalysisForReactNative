package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: atcy  reason: default package */
/* loaded from: classes2.dex */
public abstract class atcy implements asmo, atcv {
    @dzsi
    private atcu a;
    public final atcw b;

    public atcy(atcu atcuVar, atcw atcwVar) {
        dbsk.s(atcuVar);
        this.a = atcuVar;
        this.b = atcwVar;
    }

    @Override // defpackage.asmo
    public void NZ(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public void Qo(Configuration configuration) {
    }

    @Override // defpackage.asmo
    public void Qp() {
        this.a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final atcu Qq() {
        atcu atcuVar = this.a;
        dbsk.s(atcuVar);
        return atcuVar;
    }

    @Override // defpackage.asmo
    public void Qr(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public void b() {
    }

    @Override // defpackage.asmo
    public void c() {
    }
}
