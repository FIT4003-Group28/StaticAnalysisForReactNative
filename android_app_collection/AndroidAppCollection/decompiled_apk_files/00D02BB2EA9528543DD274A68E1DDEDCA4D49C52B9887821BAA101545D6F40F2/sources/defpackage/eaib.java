package defpackage;

import java.io.OutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eaib  reason: default package */
/* loaded from: classes6.dex */
public abstract class eaib extends eaen {
    private long a;
    public eaka c;
    public OutputStream d;
    boolean e;

    @Override // defpackage.eaen
    public final eaeb a() {
        return null;
    }

    @Override // defpackage.eaen
    public long b() {
        return this.a;
    }

    public eaem d(eaem eaemVar) {
        return eaemVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(eaja eajaVar, long j) {
        this.c = eajaVar.b();
        this.a = j;
        this.d = new eaia(this, j, eajaVar);
    }
}
