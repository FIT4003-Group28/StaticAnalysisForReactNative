package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: dylk  reason: default package */
/* loaded from: classes6.dex */
final class dylk extends dymf {
    final /* synthetic */ dyvk a;
    final /* synthetic */ dyln b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dylk(dyln dylnVar, dyvk dyvkVar) {
        super(dylnVar.c.d);
        this.b = dylnVar;
        this.a = dyvkVar;
    }

    @Override // defpackage.dymf
    public final void a() {
        int i = dyzn.a;
        if (this.b.b != null) {
            dyow.i(this.a);
            return;
        }
        while (true) {
            InputStream o = this.a.o();
            if (o == null) {
                return;
            }
            try {
                dyln dylnVar = this.b;
                dylnVar.a.c(dylnVar.c.a.e.b(o));
                o.close();
            } catch (Throwable th) {
                dyow.j(o);
                throw th;
            }
        }
    }
}
