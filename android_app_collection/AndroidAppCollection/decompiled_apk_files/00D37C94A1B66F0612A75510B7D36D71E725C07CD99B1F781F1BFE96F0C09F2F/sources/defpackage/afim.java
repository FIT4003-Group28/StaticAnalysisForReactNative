package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afim  reason: default package */
/* loaded from: classes.dex */
public final class afim implements afiv {
    final /* synthetic */ afiz a;

    public afim(afiz afizVar) {
        this.a = afizVar;
    }

    @Override // defpackage.afiv
    public final int a() {
        return 20;
    }

    public final String b() {
        float a = this.a.b.b.a();
        if (a != -1.0f) {
            return String.format(Locale.US, "%s:%s:%d", this.a.e(), this.a.b(a, 3), Integer.valueOf(this.a.b.b.b() ? 1 : 0));
        }
        return null;
    }

    @Override // defpackage.afiv
    public final void c(afix afixVar) {
        String b = b();
        if (b != null) {
            afixVar.c("bat", b);
        }
    }
}
