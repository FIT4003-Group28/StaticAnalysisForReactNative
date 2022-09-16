package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: aczz  reason: default package */
/* loaded from: classes.dex */
public final class aczz extends acvk {
    private String b;

    public aczz(int i, boolean z) {
        super("mdx_cast", i, z);
        this.b = "unknown";
    }

    @Override // defpackage.acvk
    public final dvo b() {
        g("method_start", this.b);
        return super.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acvk
    public final void c(ymg ymgVar, Set set, Set set2) {
        if (ymgVar instanceof adab) {
            this.b = "play";
        } else if (ymgVar instanceof adaa) {
            this.b = "pause";
        } else if (ymgVar instanceof adac) {
            this.b = "seekTo";
        }
        super.c(ymgVar, set, set2);
    }
}
