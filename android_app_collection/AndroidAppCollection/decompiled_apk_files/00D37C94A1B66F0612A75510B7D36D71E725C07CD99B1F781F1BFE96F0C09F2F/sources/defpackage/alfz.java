package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: alfz  reason: default package */
/* loaded from: classes.dex */
public final class alfz {
    public final albf a;
    private final akzp c;
    private final zdj d;
    public final Set b = new CopyOnWriteArraySet();
    private boolean g = false;
    private final yok e = new yok() { // from class: alfy
        @Override // defpackage.yok
        public final void a() {
            alfz alfzVar = alfz.this;
            alfzVar.a(alfzVar.a, avul.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_MOVED_APP_TO_FOREGROUND, alfzVar.b);
        }
    };
    private final yoj f = new yoj() { // from class: alfx
        @Override // defpackage.yoj
        public final void g() {
            alfz alfzVar = alfz.this;
            alfzVar.a(alfzVar.a, avul.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_MOVED_APP_TO_BACKGROUND, alfzVar.b);
        }
    };

    public alfz(akzp akzpVar, albf albfVar, zdj zdjVar) {
        this.c = akzpVar;
        this.a = albfVar;
        this.d = zdjVar;
    }

    public final void a(albf albfVar, avul avulVar, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                alcw b = this.c.b(str);
                if (b != null) {
                    albfVar.d(str, b.e, avulVar);
                }
            } catch (akzq unused) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "JobStorageException for job ".concat(valueOf);
                }
            }
        }
    }

    public final synchronized void b(String str) {
        this.b.add(str);
        if (!this.g) {
            this.d.a(this.e);
            this.d.a(this.f);
            this.g = true;
        }
    }

    public final synchronized void c(String str) {
        this.b.remove(str);
        if (!this.b.isEmpty() || !this.g) {
            return;
        }
        this.d.b(this.e);
        this.d.b(this.f);
        this.g = false;
    }
}
