package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ags  reason: default package */
/* loaded from: classes.dex */
public final class ags extends ago {
    final /* synthetic */ agt c;

    public ags(agt agtVar) {
        this.c = agtVar;
    }

    @Override // defpackage.ago
    protected final String d() {
        agp agpVar = (agp) this.c.a.get();
        if (agpVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + agpVar.a + "]";
    }
}
