package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajka  reason: default package */
/* loaded from: classes2.dex */
public final class ajka extends ajng {
    public eaow a;
    private dqym b;
    private dbsg<eapd> c = dbpy.a;

    @Override // defpackage.ajng
    public final void b(eapd eapdVar) {
        this.c = dbsg.i(eapdVar);
    }

    @Override // defpackage.ajng
    public final void c(dqym dqymVar) {
        if (dqymVar != null) {
            this.b = dqymVar;
            return;
        }
        throw new NullPointerException("Null justification");
    }

    @Override // defpackage.ajng
    public final ajnh a() {
        String str = this.a == null ? " durationBetweenCollections" : "";
        if (this.b == null) {
            str = str.concat(" justification");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ajkb(this.a, this.b, this.c);
    }
}
