package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: vsx  reason: default package */
/* loaded from: classes4.dex */
public final class vsx extends vso {
    protected final List a;

    public vsx(vss vssVar) {
        super(vssVar);
        this.a = new ArrayList();
    }

    @Override // defpackage.vso
    public final List c() {
        return this.a;
    }

    @Override // defpackage.vso
    public final void e(vsn vsnVar) {
        vsn f = vsnVar.f(a());
        while (f.b() > 8) {
            vso a = vsr.a(vss.a(f));
            a.e(f);
            this.a.add(a);
        }
        f.k(f.b());
        vsnVar.j(f);
    }
}
