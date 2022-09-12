package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kwb  reason: default package */
/* loaded from: classes7.dex */
public final class kwb implements dbty<axxl> {
    final /* synthetic */ kwf a;

    public kwb(kwf kwfVar) {
        this.a = kwfVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ axxl a() {
        Object d = this.a.e.d();
        Context context = this.a.a;
        dxio dxioVar = new dxio(this) { // from class: kvy
            private final kwb a;

            {
                this.a = this;
            }

            @Override // defpackage.dxio
            public final Object a() {
                return this.a.a.x.a().a().aC();
            }
        };
        dxio dxioVar2 = new dxio(this) { // from class: kvz
            private final kwb a;

            {
                this.a = this;
            }

            @Override // defpackage.dxio
            public final Object a() {
                return this.a.a.x.a().a().aE();
            }
        };
        kwf kwfVar = this.a;
        return new axxl(d, context, dxioVar, dxioVar2, kwfVar.j, kwfVar.e.b(), this.a.c.tg(), this.a.y.a(), this.a.x.a().b(), this.a.d.d(), new kwa(), this.a.s);
    }
}
