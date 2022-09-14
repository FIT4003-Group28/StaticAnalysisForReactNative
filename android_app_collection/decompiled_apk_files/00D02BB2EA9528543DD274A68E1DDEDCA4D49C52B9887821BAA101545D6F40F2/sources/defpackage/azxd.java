package defpackage;
/* compiled from: PG */
/* renamed from: azxd  reason: default package */
/* loaded from: classes3.dex */
public final class azxd extends azwh<azxe> {
    public final drjs a;

    public azxd(azxe azxeVar) {
        super(azxeVar);
        this.a = azxeVar.g();
    }

    @Override // defpackage.azwh
    /* renamed from: a */
    public final azxe b() {
        return new azxe(this);
    }

    public azxd(drjs drjsVar) {
        super(azwm.h, azwm.i);
        String str = drjsVar.c;
        this.d = str;
        this.g = str;
        if (!drjsVar.e.isEmpty()) {
            this.h = drjsVar.e;
        }
        this.a = drjsVar;
    }
}
