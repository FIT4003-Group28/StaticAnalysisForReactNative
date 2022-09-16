package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: aioy  reason: default package */
/* loaded from: classes.dex */
public final class aioy extends aios implements ynl {
    private final afvn a;
    private final azqb e;
    private final aiow f;

    public aioy(Context context, aijf aijfVar, afvn afvnVar, azqb azqbVar, aiow aiowVar) {
        super(context, aijfVar);
        afvnVar.getClass();
        this.a = afvnVar;
        azqbVar.getClass();
        this.e = azqbVar;
        this.f = aiowVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aios
    public final void b(asaa asaaVar, yiw yiwVar, String str) {
        aiou j = j();
        if (j == null) {
            aiot.a(yiwVar, h(asaaVar, str));
        } else {
            ((afwc) this.e.get()).c(j.a(), null, new aiox(this, asaaVar, yiwVar, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aios
    public final void e() {
        if (this.a.t()) {
            this.f.e(this.a.c(), true);
        }
    }

    public final void g() {
        ankt q;
        if (this.a.t()) {
            q = this.f.a(this.a.c());
        } else {
            q = anlz.q(false);
        }
        this.b = q;
        this.c = false;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                g();
                return null;
            } else if (i == 1) {
                afwd afwdVar = (afwd) obj;
                g();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{afwb.class, afwd.class};
    }
}
