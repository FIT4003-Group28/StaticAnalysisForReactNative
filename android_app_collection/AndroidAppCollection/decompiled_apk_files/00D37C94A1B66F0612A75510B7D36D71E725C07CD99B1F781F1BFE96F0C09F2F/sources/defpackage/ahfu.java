package defpackage;
/* compiled from: PG */
/* renamed from: ahfu  reason: default package */
/* loaded from: classes.dex */
public final class ahfu extends acvk {
    private final String b;

    public ahfu(String str, int i, boolean z) {
        super("prebuffer", i, z);
        this.b = str;
    }

    @Override // defpackage.acvk
    public final dvo b() {
        g("mod_trans", this.b);
        return super.b();
    }
}
