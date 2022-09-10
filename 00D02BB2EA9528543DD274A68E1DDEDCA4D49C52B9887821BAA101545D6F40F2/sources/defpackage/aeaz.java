package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: aeaz  reason: default package */
/* loaded from: classes.dex */
public final class aeaz {
    private final ckcw a;
    private final ckgz b;
    private boolean c = false;

    public aeaz(ckcw ckcwVar, ckgz ckgzVar) {
        this.a = ckcwVar;
        this.b = ckgzVar;
    }

    public final void a(final awwb awwbVar, Set<awvv<?>> set) {
        if (this.c) {
            return;
        }
        this.c = true;
        if (!dcft.j(set, new dbsl(awwbVar) { // from class: awwf
            private final awwb a;

            {
                this.a = awwbVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                awwb awwbVar2 = this.a;
                return awwbVar2 != null && awwbVar2.a((awvv) obj).a();
            }
        })) {
            ((ckco) this.a.a(this.b)).a(ckff.a(1));
        } else if (awwh.a(awwbVar, set)) {
            ((ckco) this.a.a(this.b)).a(ckff.a(2));
        } else {
            ((ckco) this.a.a(this.b)).a(ckff.a(3));
        }
    }
}
