package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: vmg  reason: default package */
/* loaded from: classes4.dex */
final class vmg implements vku {
    private final vmh a;
    private final /* synthetic */ int b;

    public vmg(vmh vmhVar) {
        this.a = vmhVar;
    }

    public vmg(vmh vmhVar, int i) {
        this.b = i;
        this.a = vmhVar;
    }

    @Override // defpackage.vku
    public final ankt a(final ankt anktVar) {
        if (this.b == 0) {
            return this.a.i(anktVar);
        }
        final vmh vmhVar = this.a;
        return vmhVar.j.b(ammo.b(new aniq() { // from class: vma
            @Override // defpackage.aniq
            public final ankt a() {
                ankt i;
                vmh vmhVar2 = vmh.this;
                ankt anktVar2 = anktVar;
                Uri uri = (Uri) anlz.y(vmhVar2.b);
                vju a = vju.a((Closeable) vmhVar2.d.c(uri, vki.b()));
                try {
                    try {
                        vmhVar2.f(uri);
                        i = ankq.a;
                    } catch (IOException unused) {
                        i = vmhVar2.i(anktVar2);
                    }
                    ankt b = vmh.b(i, a.b(), vmhVar2.c);
                    a.close();
                    return b;
                } catch (Throwable th) {
                    try {
                        a.close();
                    } catch (Throwable unused2) {
                    }
                    throw th;
                }
            }
        }), vmhVar.c);
    }
}
