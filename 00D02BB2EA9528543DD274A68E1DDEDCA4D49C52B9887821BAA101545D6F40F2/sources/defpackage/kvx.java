package defpackage;

import android.content.res.Resources;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kvx  reason: default package */
/* loaded from: classes7.dex */
public final class kvx implements dbty<hwe> {
    final /* synthetic */ kwf a;

    public kvx(kwf kwfVar) {
        this.a = kwfVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ hwe a() {
        Resources resources = this.a.b.getContext().getResources();
        kwf kwfVar = this.a;
        return new hwc(resources, kwfVar.p, kwfVar.j, new dxio(this) { // from class: kvv
            private final kvx a;

            {
                this.a = this;
            }

            @Override // defpackage.dxio
            public final Object a() {
                return this.a.a.x.a().a().aC();
            }
        }, new dxio(this) { // from class: kvw
            private final kvx a;

            {
                this.a = this;
            }

            @Override // defpackage.dxio
            public final Object a() {
                return this.a.a.x.a().a().aE();
            }
        });
    }
}
