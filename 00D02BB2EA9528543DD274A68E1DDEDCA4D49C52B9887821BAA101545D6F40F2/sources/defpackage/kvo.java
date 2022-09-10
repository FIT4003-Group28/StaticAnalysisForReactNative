package defpackage;

import android.content.Context;
import android.content.res.Resources;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kvo  reason: default package */
/* loaded from: classes7.dex */
public final class kvo implements dbty<amyd> {
    final /* synthetic */ kwf a;

    public kvo(kwf kwfVar) {
        this.a = kwfVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ amyd a() {
        Resources resources = this.a.a.getResources();
        kwf kwfVar = this.a;
        Context context = kwfVar.a;
        cqat cqatVar = kwfVar.h;
        bvnx bvnxVar = kwfVar.i;
        bnsn a = kwfVar.v.a();
        alyx g = this.a.d.g();
        kwf kwfVar2 = this.a;
        cjvm cjvmVar = kwfVar2.m;
        amqu rT = kwfVar2.c.rT();
        dehq tf = this.a.c.tf();
        kwf kwfVar3 = this.a;
        btrm btrmVar = kwfVar3.j;
        ckcw ckcwVar = kwfVar3.g;
        final akpx akpxVar = kwfVar3.c;
        akpxVar.getClass();
        return new amyd(resources, context, cqatVar, bvnxVar, a, g, cjvmVar, rT, tf, btrmVar, ckcwVar, new dxio(akpxVar) { // from class: kvn
            private final akpx a;

            {
                this.a = akpxVar;
            }

            @Override // defpackage.dxio
            public final Object a() {
                return this.a.si();
            }
        });
    }
}
