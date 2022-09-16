package defpackage;

import java.util.concurrent.CancellationException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kvy  reason: default package */
/* loaded from: classes3.dex */
public final class kvy implements ankb {
    final /* synthetic */ kvz a;
    private final /* synthetic */ int b;

    public kvy(kvz kvzVar) {
        this.a = kvzVar;
    }

    public kvy(kvz kvzVar, int i) {
        this.b = i;
        this.a = kvzVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        if (this.b == 0) {
            if (th instanceof CancellationException) {
                return;
            }
            this.a.aO.a("Error fetching search suggestions", th);
            zep.m("Error fetching search suggestions", th.toString());
        } else if (th instanceof CancellationException) {
        } else {
            this.a.aO.a("Error fetching cached zero-prefix search suggestions", th);
            zep.m("Error fetching cached zero-prefix search suggestions", th.toString());
        }
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (this.b == 0) {
            akht akhtVar = (akht) obj;
            ankt anktVar = this.a.aE;
            if (anktVar != null) {
                anktVar.cancel(true);
            }
            if (!this.a.aM.equals(akhtVar.a)) {
                return;
            }
            this.a.aG(akhtVar);
            return;
        }
        akht akhtVar2 = (akht) obj;
        if (!this.a.aM.equals(akhtVar2.a)) {
            return;
        }
        this.a.aG(akhtVar2);
    }
}
