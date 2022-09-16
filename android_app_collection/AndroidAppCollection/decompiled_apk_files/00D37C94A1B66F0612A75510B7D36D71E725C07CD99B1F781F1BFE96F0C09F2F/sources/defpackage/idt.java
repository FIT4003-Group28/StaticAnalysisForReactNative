package defpackage;

import android.graphics.Bitmap;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: idt  reason: default package */
/* loaded from: classes3.dex */
final class idt implements yiw {
    final /* synthetic */ Optional a;
    final /* synthetic */ idw b;

    public idt(idw idwVar, Optional optional) {
        this.b = idwVar;
        this.a = optional;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Bitmap bitmap = (Bitmap) obj;
        this.a.ifPresent(fyb.j);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj;
        idw idwVar = this.b;
        idwVar.c.a(idwVar.e, (Bitmap) obj2);
        if (this.a.isPresent()) {
            hzx hzxVar = (hzx) this.a.get();
            if (hzxVar.c.a.t != 2) {
                return;
            }
            hzxVar.a.g();
            hzxVar.c.a(hzxVar.b);
        }
    }
}
