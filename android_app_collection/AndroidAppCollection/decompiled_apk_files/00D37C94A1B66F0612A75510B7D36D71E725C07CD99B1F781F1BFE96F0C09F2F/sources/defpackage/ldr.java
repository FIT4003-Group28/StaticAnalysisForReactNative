package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ldr  reason: default package */
/* loaded from: classes3.dex */
public final class ldr implements aafo {
    private final azqb a;

    public ldr(azqb azqbVar) {
        this.a = azqbVar;
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void a(apzg apzgVar) {
        aafn.a(this, apzgVar);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void b(List list) {
        aafn.b(this, list);
    }

    @Override // defpackage.aafo
    public final void c(apzg apzgVar, Map map) {
        try {
            ((aafi) this.a.get()).f(apzgVar).kD(apzgVar, map);
        } catch (aafy unused) {
        }
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void d(List list, Map map) {
        aafn.c(this, list, map);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void e(List list, Object obj) {
        aafn.d(this, list, obj);
    }
}
