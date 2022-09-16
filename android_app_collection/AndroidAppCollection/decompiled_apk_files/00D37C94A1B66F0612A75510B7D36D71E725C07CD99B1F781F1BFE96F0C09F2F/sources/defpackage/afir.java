package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afir  reason: default package */
/* loaded from: classes.dex */
public final class afir implements afiv {
    final /* synthetic */ afiz a;
    private final afst b;
    private int c = -1;
    private final boolean d;

    public afir(afiz afizVar, afst afstVar, boolean z) {
        this.a = afizVar;
        this.b = afstVar;
        this.d = z;
    }

    @Override // defpackage.afiv
    public final int a() {
        int i = 0;
        int i2 = true != this.d ? 0 : 20;
        int i3 = this.c;
        if (i3 == -1) {
            int i4 = 10;
            for (Map.Entry entry : this.b.a().entrySet()) {
                i4 += ((String) entry.getKey()).length() + 2 + ((String) entry.getValue()).length();
            }
            this.c = i4;
            i3 = i4;
        }
        int i5 = i3 + 20;
        if (this.a.j > 0) {
            i = 8;
        }
        return i5 + i + i2;
    }

    @Override // defpackage.afiv
    public final void c(afix afixVar) {
        for (Map.Entry entry : this.b.a().entrySet()) {
            afixVar.b((String) entry.getKey(), (String) entry.getValue());
        }
        String e = this.a.e();
        int a = this.a.b.a.a();
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 12);
        sb.append(e);
        sb.append(":");
        sb.append(a);
        afixVar.d("conn", sb.toString());
        afiz afizVar = this.a;
        if (afizVar.r != null) {
            String e2 = afizVar.e();
            String valueOf = String.valueOf(this.a.r);
            StringBuilder sb2 = new StringBuilder(String.valueOf(e2).length() + 1 + String.valueOf(valueOf).length());
            sb2.append(e2);
            sb2.append(":");
            sb2.append(valueOf);
            afixVar.d("dt", sb2.toString());
        }
        afiz afizVar2 = this.a;
        if (afizVar2.q) {
            return;
        }
        int i = afizVar2.n;
        afizVar2.n = i + 1;
        afixVar.b("seq", String.valueOf(i));
        if (!this.d) {
            return;
        }
        String e3 = this.a.e();
        String valueOf2 = String.valueOf(this.a.i);
        StringBuilder sb3 = new StringBuilder(String.valueOf(e3).length() + 1 + String.valueOf(valueOf2).length());
        sb3.append(e3);
        sb3.append(":");
        sb3.append(valueOf2);
        afixVar.d("vps", sb3.toString());
    }
}
