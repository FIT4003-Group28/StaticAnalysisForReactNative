package defpackage;

import android.content.Intent;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: agby  reason: default package */
/* loaded from: classes.dex */
public final class agby extends afhs<dspd> {
    public static final dbsl<afga> b = agbw.a;
    public final dxio<akfc> c;
    private final dxio<acyp> d;
    private final dxio<afzv> e;
    private final dxio<akfa> i;
    private final dxio<cjot> j;

    public agby(dxio<acyp> dxioVar, dxio<afzv> dxioVar2, dxio<akfa> dxioVar3, dxio<akfc> dxioVar4, dxio<cjot> dxioVar5, Intent intent, @dzsi String str) {
        super(intent, str, afid.LOCAL_STREAM_FOCUS_ITEM_ACTION);
        this.d = dxioVar;
        this.e = dxioVar2;
        this.i = dxioVar3;
        this.c = dxioVar4;
        this.j = dxioVar5;
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_MAPS_LOCAL_STREAM;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afhs
    public final /* bridge */ /* synthetic */ void d(dspd dspdVar) {
        dspd dspdVar2 = dspdVar;
        if (this.d.a().a()) {
            this.j.a().c(dspdVar2);
        } else {
            this.e.a().n(dspdVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afhs
    public final void e(ExecutionException executionException) {
        bvoo.k(executionException);
    }

    @Override // defpackage.afhs
    protected final void i(deig<dspd> deigVar) {
        byte[] byteArrayExtra = this.f.getByteArrayExtra("item_id");
        if (byteArrayExtra == null) {
            return;
        }
        dspd x = dspd.x(byteArrayExtra);
        String stringExtra = this.f.getStringExtra("oid");
        if (dbsj.d(stringExtra) || stringExtra.equals(btlu.h(this.i.a().j()))) {
            l(x, deigVar);
        } else {
            this.c.a().o(stringExtra, new agbx(this, x, deigVar));
        }
    }

    public final void l(dspd dspdVar, deig<dspd> deigVar) {
        this.e.a().l(dspdVar);
        deigVar.j(dspdVar);
    }
}
