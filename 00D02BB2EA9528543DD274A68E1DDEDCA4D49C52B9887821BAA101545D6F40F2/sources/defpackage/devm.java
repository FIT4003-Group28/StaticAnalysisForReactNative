package defpackage;

import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: devm  reason: default package */
/* loaded from: classes6.dex */
public final /* synthetic */ class devm implements depa {
    static final depa a = new devm();

    private devm() {
    }

    @Override // defpackage.depa
    public final Object a(deox deoxVar) {
        depr deprVar = (depr) deoxVar;
        if (!deprVar.a.contains(devp.class)) {
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", devp.class));
        }
        depn<Set<?>> depnVar = ((depf) deprVar.b).b.get(devp.class);
        if (depnVar == null) {
            depnVar = depf.a;
        }
        return new devn((Set) depnVar.a(), devo.getInstance());
    }
}
