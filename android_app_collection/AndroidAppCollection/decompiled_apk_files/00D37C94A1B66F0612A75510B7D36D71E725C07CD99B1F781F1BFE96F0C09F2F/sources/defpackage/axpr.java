package defpackage;

import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: axpr  reason: default package */
/* loaded from: classes2.dex */
final class axpr extends axpn {
    final /* synthetic */ axps d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axpr(axps axpsVar, axpl axplVar) {
        super(axplVar, null, null, 0L);
        this.d = axpsVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.axpn
    public final void c(OutputStream outputStream) {
        axps axpsVar = this.d;
        axpsVar.a = outputStream;
        axpsVar.c = 2;
        super.c(outputStream);
        axps axpsVar2 = this.d;
        axpsVar2.c = 3;
        axpsVar2.c();
        this.d.e();
    }
}
