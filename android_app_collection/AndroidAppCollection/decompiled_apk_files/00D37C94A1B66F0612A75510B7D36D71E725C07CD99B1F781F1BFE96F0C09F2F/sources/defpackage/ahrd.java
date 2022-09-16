package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: ahrd  reason: default package */
/* loaded from: classes.dex */
public final class ahrd implements ahih, ahku {
    public final Set a;
    public auaz b;
    private final Context c;
    private final ajmy d;
    private final ViewGroup e;
    private ahrc f;
    private boolean g;

    public ahrd(Context context, ajmy ajmyVar, ViewGroup viewGroup) {
        this.c = context;
        ajmyVar.getClass();
        this.d = ajmyVar;
        viewGroup.getClass();
        this.e = viewGroup;
        this.a = new CopyOnWriteArraySet();
    }

    @Override // defpackage.ahih
    public final void kT() {
        ahrc ahrcVar = this.f;
        if (ahrcVar != null) {
            ahrcVar.l = true;
            this.b = null;
        }
    }

    @Override // defpackage.ahih
    public final void l(auaz auazVar, boolean z) {
        arag aragVar;
        if (this.f == null || auazVar == null) {
            return;
        }
        if (auazVar.equals(this.b) && this.g == z) {
            return;
        }
        this.b = auazVar;
        this.g = z;
        ahrc ahrcVar = this.f;
        arag aragVar2 = null;
        if ((auazVar.b & 2) != 0) {
            aragVar = auazVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        String obj = ajgl.b(aragVar).toString();
        if ((auazVar.b & 4) != 0 && (aragVar2 = auazVar.e) == null) {
            aragVar2 = arag.a;
        }
        String obj2 = ajgl.b(aragVar2).toString();
        avhn avhnVar = auazVar.j;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ahrcVar.b.l = true;
        ahrcVar.a.l(akel.q(avhnVar), new ahrb(ahrcVar));
        ahrcVar.e.c(obj);
        ahrcVar.e.a(obj2);
        ahob ahobVar = ahrcVar.c;
        ahobVar.a.b.l = true;
        ahnz ahnzVar = ahobVar.i;
        if (ahnzVar != null) {
            ((ahpx) ahnzVar).k();
        }
        ahrcVar.l = false;
    }

    @Override // defpackage.ahih
    public final void m(final long j, final long j2) {
        ahrc ahrcVar = this.f;
        if (ahrcVar != null) {
            final ahjp ahjpVar = ahrcVar.f;
            if (ahjpVar == null) {
                zep.b("Attempting to update progress on a null countdown progress UI component.");
                return;
            }
            ahjo ahjoVar = ahjpVar.k;
            if (ahjoVar != null && !ahjoVar.isIndeterminate()) {
                ahjpVar.j.post(new Runnable() { // from class: ahjl
                    @Override // java.lang.Runnable
                    public final void run() {
                        ahjp ahjpVar2 = ahjp.this;
                        long j3 = j;
                        long j4 = j2;
                        ahjo ahjoVar2 = ahjpVar2.k;
                        if (ahjoVar2 == null || ahjoVar2.isIndeterminate()) {
                            return;
                        }
                        ahjoVar2.setMax((int) j4);
                        ahjoVar2.setProgress((int) j3);
                    }
                });
            }
            if (j != j2 || j == 0) {
                return;
            }
            ahrcVar.c.g();
        }
    }

    @Override // defpackage.ahku
    public final void qT(ahof ahofVar, ahob ahobVar) {
        ahrc ahrcVar = new ahrc(this.c, ahofVar, ahobVar, this.d, this.e, this);
        this.f = ahrcVar;
        ahobVar.d(ahrcVar);
        ahobVar.k = this.f;
    }

    @Override // defpackage.ahku
    public final void qU() {
        this.f = null;
    }
}
