package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: fcd  reason: default package */
/* loaded from: classes3.dex */
public final class fcd implements ynl {
    private final Set c = Collections.newSetFromMap(new WeakHashMap());
    public boolean a = false;
    public final azpb b = azpa.as(false).ax();

    public final void a(fcc fccVar) {
        this.c.add(fccVar);
    }

    public final void b(fcc fccVar) {
        this.c.remove(fccVar);
    }

    public final void c(boolean z) {
        ylr.c();
        if (this.a != z) {
            this.a = z;
            this.b.c(Boolean.valueOf(z));
            if (this.c.isEmpty()) {
                return;
            }
            amuk o = amuk.o(this.c);
            int size = o.size();
            for (int i = 0; i < size; i++) {
                ((fcc) o.get(i)).a();
            }
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                agoj agojVar = (agoj) obj;
                c(false);
                return null;
            } else if (i == 1) {
                agok agokVar = (agok) obj;
                c(true);
                return null;
            } else if (i == 2) {
                agol agolVar = (agol) obj;
                c(false);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{agoj.class, agok.class, agol.class};
    }
}
