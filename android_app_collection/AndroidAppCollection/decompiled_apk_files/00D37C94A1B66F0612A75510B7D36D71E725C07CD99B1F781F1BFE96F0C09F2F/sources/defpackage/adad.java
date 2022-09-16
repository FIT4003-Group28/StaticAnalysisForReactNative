package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: adad  reason: default package */
/* loaded from: classes.dex */
public final class adad extends acvk {
    private String b;
    private String c;
    private String d;
    private String e;

    public adad(int i, boolean z) {
        super("mdx_command", i, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acvk
    public final boolean a(ymg ymgVar) {
        boolean a = super.a(ymgVar);
        if ((ymgVar instanceof adaf) && this.d == null) {
            adaf adafVar = (adaf) ymgVar;
            this.d = adafVar.b();
            this.e = adafVar.a();
        }
        return a;
    }

    @Override // defpackage.acvk
    public final dvo b() {
        g("method_start", this.b);
        g("start_channel_type", this.c);
        g("method_received", this.d);
        g("end_channel_type", this.e);
        return super.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acvk
    public final void c(ymg ymgVar, Set set, Set set2) {
        if (ymgVar instanceof adag) {
            adag adagVar = (adag) ymgVar;
            this.b = adagVar.b();
            this.c = adagVar.a();
        }
        super.c(ymgVar, set, set2);
    }
}
