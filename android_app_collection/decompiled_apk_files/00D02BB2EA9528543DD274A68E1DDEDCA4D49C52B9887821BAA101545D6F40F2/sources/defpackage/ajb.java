package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajb  reason: default package */
/* loaded from: classes2.dex */
public final class ajb extends aix {
    final /* synthetic */ ajc c;

    public ajb(ajc ajcVar) {
        this.c = ajcVar;
    }

    @Override // defpackage.aix
    protected final String f() {
        aiy aiyVar = (aiy) this.c.a.get();
        if (aiyVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + aiyVar.a + "]";
    }
}
