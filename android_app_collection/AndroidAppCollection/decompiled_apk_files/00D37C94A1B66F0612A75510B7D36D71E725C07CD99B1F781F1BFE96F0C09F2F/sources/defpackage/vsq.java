package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: vsq  reason: default package */
/* loaded from: classes4.dex */
public final class vsq extends vso {
    public String a;
    public List b;

    public vsq(vss vssVar) {
        super(vssVar);
    }

    @Override // defpackage.vso
    public final void e(vsn vsnVar) {
        vsn f = vsnVar.f(a());
        this.a = f.g();
        f.d();
        this.b = new ArrayList();
        while (f.b() > 4) {
            this.b.add(f.g());
        }
        f.k(f.b());
        vsnVar.j(f);
    }
}
