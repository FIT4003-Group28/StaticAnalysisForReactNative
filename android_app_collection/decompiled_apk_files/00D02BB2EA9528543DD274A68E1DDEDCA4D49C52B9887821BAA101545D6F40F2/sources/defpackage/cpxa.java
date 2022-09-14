package defpackage;

import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: cpxa  reason: default package */
/* loaded from: classes5.dex */
public final class cpxa implements clau {
    public final Context a;
    protected final cpxf b;
    public final cpwx c;
    public final cnnm d;
    public cpyo e;
    private final cpwz f = new cpwz(this);

    public cpxa(Context context, cpxf cpxfVar, cpwx cpwxVar, cnnm cnnmVar) {
        this.a = context;
        this.c = cpwxVar;
        this.d = cnnmVar;
        this.b = cpxfVar;
    }

    @Override // defpackage.clau
    public final int a() {
        return this.f.a;
    }

    @Override // defpackage.clau
    public final void b() {
        this.a.unbindService(this.f);
        this.f.a = 0;
        this.e = null;
    }

    @Override // defpackage.clau
    public final boolean c() {
        return this.e != null;
    }

    @Override // defpackage.clau
    public final void d(cpzy cpzyVar) {
        this.e.e(cpzyVar.bS());
    }

    @Override // defpackage.clau
    public final void e() {
        Intent intent = new Intent();
        intent.setAction("com.google.android.apps.gsa.opa.APP_INTEGRATION_SERVICE");
        intent.setPackage("com.google.android.googlequicksearchbox");
        if (this.a.bindService(intent, this.f, 1)) {
            dcqy<String> dcqyVar = dcrd.a;
            this.f.a = 2;
            return;
        }
        dcqy<String> dcqyVar2 = dcrd.a;
    }
}
