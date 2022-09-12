package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: iyr  reason: default package */
/* loaded from: classes7.dex */
public class iyr implements jbs {
    private final List<jbt> a;

    public iyr(jbt... jbtVarArr) {
        dbsk.b(true, "Instantiating ContainerViewModel with no ViewModels");
        this.a = dchl.b(jbtVarArr);
    }

    @Override // defpackage.jbs
    public List<jbt> a() {
        return this.a;
    }

    public void b(jbt jbtVar) {
        this.a.add(jbtVar);
    }
}
