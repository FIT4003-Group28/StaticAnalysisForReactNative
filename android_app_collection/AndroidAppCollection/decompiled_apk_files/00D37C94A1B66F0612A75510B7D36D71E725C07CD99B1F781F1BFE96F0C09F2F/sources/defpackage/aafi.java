package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aafi  reason: default package */
/* loaded from: classes.dex */
public abstract class aafi implements aafo {
    public static aafe g() {
        return new aafe();
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
    public void c(apzg apzgVar, Map map) {
        try {
            f(apzgVar).kD(apzgVar, map);
        } catch (aafy unused) {
            String valueOf = String.valueOf(apzgVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Unknown command not resolved: ");
            sb.append(valueOf);
            zep.b(sb.toString());
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

    public abstract aafl f(apzg apzgVar);
}
