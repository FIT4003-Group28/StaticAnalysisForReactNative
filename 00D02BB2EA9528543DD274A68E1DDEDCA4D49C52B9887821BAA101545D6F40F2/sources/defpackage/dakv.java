package defpackage;

import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dakv  reason: default package */
/* loaded from: classes5.dex */
final class dakv implements dali {
    private final dxio<dall> a;
    private final dxio<damu> b;
    private final dxio<File> c;

    public dakv(dxio<dall> dxioVar, dxio<damu> dxioVar2, dxio<File> dxioVar3) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = dxioVar3;
    }

    private final dali f() {
        if (this.c.a() == null) {
            return this.a.a();
        }
        return this.b.a();
    }

    @Override // defpackage.dali
    public final danb<Integer> a(dalt daltVar) {
        return f().a(daltVar);
    }

    @Override // defpackage.dali
    public final danb<Void> b(List<Locale> list) {
        return f().b(list);
    }

    @Override // defpackage.dali
    public final danb<Void> c(List<Locale> list) {
        return f().c(list);
    }

    @Override // defpackage.dali
    public final Set<String> d() {
        return f().d();
    }

    @Override // defpackage.dali
    public final void e(btbl btblVar) {
        f().e(btblVar);
    }
}
