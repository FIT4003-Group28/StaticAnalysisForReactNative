package defpackage;
/* compiled from: PG */
/* renamed from: jkc  reason: default package */
/* loaded from: classes3.dex */
final class jkc implements flz {
    private apwv a;

    public jkc(apwv apwvVar) {
        this.a = apwvVar;
    }

    @Override // defpackage.flz
    public final CharSequence a() {
        return this.a.c;
    }

    @Override // defpackage.flz
    public final /* bridge */ /* synthetic */ Object b() {
        return this.a;
    }

    @Override // defpackage.flz
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        apwv apwvVar = (apwv) obj;
        apwvVar.getClass();
        this.a = apwvVar;
    }

    @Override // defpackage.flz
    public final boolean d() {
        return this.a.d;
    }
}
