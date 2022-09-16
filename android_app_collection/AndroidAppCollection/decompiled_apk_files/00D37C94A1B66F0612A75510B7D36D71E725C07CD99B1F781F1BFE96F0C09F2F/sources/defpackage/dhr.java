package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dhr  reason: default package */
/* loaded from: classes3.dex */
public final class dhr extends ddq {
    final /* synthetic */ dhv a;
    private final dby c;
    private boolean d;
    private int e = -1;
    private String f;

    public dhr(dhv dhvVar, dby dbyVar) {
        this.a = dhvVar;
        this.c = dbyVar;
    }

    @Override // defpackage.ddq
    public final void a(ddq ddqVar) {
        synchronized (this) {
            if (!this.d) {
                return;
            }
            int i = this.e;
            String str = this.f;
            this.e = -1;
            this.f = null;
            this.d = false;
            try {
                this.a.l(i, str, ddqVar);
            } catch (IndexOutOfBoundsException e) {
                String c = dhv.c(this.a);
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 169 + String.valueOf(message).length());
                sb.append("Index out of bounds while applying a new section. This indicates a bad diff was sent to the RecyclerBinder. See https://bit.ly/39Oq0Hs for more information. Debug info: ");
                sb.append(c);
                sb.append(message);
                throw new RuntimeException(sb.toString(), e);
            }
        }
    }

    public final synchronized void b() {
        if (this.d) {
            this.d = false;
            this.e = -1;
            this.f = null;
            ((dbx) this.c).removeCallbacks(this);
        }
    }

    public final synchronized void c(int i, String str) {
        if (!this.d) {
            this.d = true;
            Throwable th = this.b;
            if (th != null) {
                th.fillInStackTrace();
            }
            ((dbx) this.c).post(this);
            this.e = i;
            this.f = str;
        }
    }
}
