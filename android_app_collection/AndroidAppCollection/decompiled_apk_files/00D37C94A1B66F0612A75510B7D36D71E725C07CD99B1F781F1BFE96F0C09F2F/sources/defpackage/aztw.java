package defpackage;
/* compiled from: PG */
/* renamed from: aztw  reason: default package */
/* loaded from: classes2.dex */
public class aztw extends azvw implements azvo, azqy, azuw {
    public final azrd a;

    public aztw(azrd azrdVar) {
        u((azvo) azrdVar.get(azvo.b));
        this.a = azrdVar.plus(this);
    }

    @Override // defpackage.azvw
    protected final String a() {
        return azst.a(banl.j(this), " was cancelled");
    }

    @Override // defpackage.azvw
    public final String b() {
        String a = azup.a(this.a);
        if (a == null) {
            return banl.j(this);
        }
        return '\"' + a + "\":" + banl.j(this);
    }

    @Override // defpackage.azvw
    public final void c(Throwable th) {
        ayno.h(this.a, th);
    }

    @Override // defpackage.azvw
    protected final void d(Object obj) {
        if (obj instanceof azuk) {
            azuk azukVar = (azuk) obj;
            Throwable th = azukVar.b;
            azukVar.c.a();
        }
    }

    protected void e() {
        g();
    }

    @Override // defpackage.azqy
    public final azrd getContext() {
        return this.a;
    }

    @Override // defpackage.azqy
    public final void resumeWith(Object obj) {
        Object q;
        Object i = ayno.i(obj);
        do {
            q = super.q(p(), i);
            if (q == azvx.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + i;
                Throwable th = null;
                azuk azukVar = i instanceof azuk ? (azuk) i : null;
                if (azukVar != null) {
                    th = azukVar.b;
                }
                throw new IllegalStateException(str, th);
            }
        } while (q == azvx.c);
        if (q == azvx.b) {
            return;
        }
        e();
    }
}
