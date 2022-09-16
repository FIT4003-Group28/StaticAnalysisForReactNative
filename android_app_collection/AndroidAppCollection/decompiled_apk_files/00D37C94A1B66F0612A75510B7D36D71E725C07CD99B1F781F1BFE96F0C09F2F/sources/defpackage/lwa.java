package defpackage;
/* compiled from: PG */
/* renamed from: lwa  reason: default package */
/* loaded from: classes3.dex */
final class lwa extends lwl {
    private final ampq a;
    private final ampq b;
    private final ampq c;
    private final ampq d;

    public lwa(ampq ampqVar, ampq ampqVar2, ampq ampqVar3, ampq ampqVar4) {
        if (ampqVar != null) {
            this.a = ampqVar;
            if (ampqVar2 != null) {
                this.b = ampqVar2;
                if (ampqVar3 != null) {
                    this.c = ampqVar3;
                    if (ampqVar4 != null) {
                        this.d = ampqVar4;
                        return;
                    }
                    throw new NullPointerException("Null currentSelectedLayerableFilterFormData");
                }
                throw new NullPointerException("Null previousSelectedLayerableFilterFormData");
            }
            throw new NullPointerException("Null currentSelectedFilterIndex");
        }
        throw new NullPointerException("Null previouslySelectedFilterIndex");
    }

    @Override // defpackage.lwl
    public ampq a() {
        return this.b;
    }

    @Override // defpackage.lwl
    public ampq b() {
        return this.d;
    }

    @Override // defpackage.lwl
    public ampq c() {
        return this.c;
    }

    @Override // defpackage.lwl
    public ampq d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lwl) {
            lwl lwlVar = (lwl) obj;
            if (this.a.equals(lwlVar.d()) && this.b.equals(lwlVar.a()) && this.c.equals(lwlVar.c()) && this.d.equals(lwlVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }
}
