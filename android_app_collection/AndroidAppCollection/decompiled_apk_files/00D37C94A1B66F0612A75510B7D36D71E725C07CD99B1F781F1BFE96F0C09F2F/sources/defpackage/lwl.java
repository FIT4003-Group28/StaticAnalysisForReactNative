package defpackage;
/* compiled from: PG */
/* renamed from: lwl  reason: default package */
/* loaded from: classes3.dex */
public abstract class lwl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static lwl e(ampq ampqVar, ampq ampqVar2, ampq ampqVar3, ampq ampqVar4) {
        return new lwa(ampqVar, ampqVar2, ampqVar3, ampqVar4);
    }

    public abstract ampq a();

    public abstract ampq b();

    public abstract ampq c();

    public abstract ampq d();

    public boolean f() {
        return a().h() || b().h();
    }

    public final String toString() {
        return String.format("{previousSelectedIndex=%s, currentSelectedIndex=%s, previousSelectedLayerableFilterFormData=%s currentSelectedLayerableFilterFormData=%s}", d(), a(), c(), b());
    }
}
