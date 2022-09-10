package defpackage;
/* compiled from: PG */
/* renamed from: aedi  reason: default package */
/* loaded from: classes2.dex */
public final class aedi implements aeck {
    private final wdt a;
    private final aecm b;

    public aedi(wdt wdtVar, aecm aecmVar) {
        this.a = wdtVar;
        this.b = aecmVar;
    }

    @Override // defpackage.aeck
    public final String a() {
        return "saved_trips";
    }

    @Override // defpackage.aeck
    public final void b() {
        boolean z = false;
        if (this.a.g() && !this.a.i()) {
            z = true;
        }
        this.b.b(dktk.TRANSPORTATION, z);
    }

    @Override // defpackage.aeck
    public final void c() {
    }
}
