package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hs  reason: default package */
/* loaded from: classes.dex */
public final class hs implements avr {
    public o a = null;
    public avq b = null;

    @Override // defpackage.m
    public final k Nh() {
        a();
        return this.a;
    }

    @Override // defpackage.avr
    public final avp Qg() {
        return this.b.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (this.a == null) {
            this.a = new o(this);
            this.b = avq.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(i iVar) {
        this.a.e(iVar);
    }
}
