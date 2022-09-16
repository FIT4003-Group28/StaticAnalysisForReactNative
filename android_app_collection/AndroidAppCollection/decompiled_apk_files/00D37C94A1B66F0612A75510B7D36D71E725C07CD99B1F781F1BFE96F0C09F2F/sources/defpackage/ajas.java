package defpackage;
/* compiled from: PG */
/* renamed from: ajas  reason: default package */
/* loaded from: classes.dex */
public final class ajas implements ajar {
    private ajar a;

    public final synchronized void a(ajar ajarVar) {
        this.a = ajarVar;
    }

    @Override // defpackage.ajar
    public final synchronized void aI(afkn afknVar) {
        ajar ajarVar = this.a;
        if (ajarVar != null) {
            ajarVar.aI(afknVar);
        }
    }
}
