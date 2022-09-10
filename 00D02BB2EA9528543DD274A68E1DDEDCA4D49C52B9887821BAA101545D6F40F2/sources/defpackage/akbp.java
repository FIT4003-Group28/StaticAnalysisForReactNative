package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: akbp  reason: default package */
/* loaded from: classes2.dex */
public abstract class akbp extends gga implements btss, akbh {
    public cqkf<akbb> k;
    public dehn<Void> l;
    public bttf m;
    public cqkj n;
    public aijc o;
    public bvrb p;
    public cztz q;
    public akfa r;
    public efc s;
    public dxio<afha> t;

    protected abstract btsy o();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gga, defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public void onCreate(@dzsi Bundle bundle) {
        super.onCreate(bundle);
        if (!bycr.a(this.m)) {
            this.m.e();
        }
    }

    @Override // defpackage.gga
    protected final void q() {
    }

    @Override // defpackage.gga
    public final efc r() {
        return this.s;
    }

    @Override // defpackage.gga
    public void s() {
    }

    @Override // defpackage.btss
    public final <T extends btsy> T t(Class<T> cls) {
        return (T) o();
    }
}
