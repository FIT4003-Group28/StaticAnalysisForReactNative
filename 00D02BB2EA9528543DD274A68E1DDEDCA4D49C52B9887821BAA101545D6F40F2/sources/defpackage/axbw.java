package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: axbw  reason: default package */
/* loaded from: classes.dex */
public final class axbw {
    public final ckcw a;
    private final Set<awvv<?>> b = new aih();

    public axbw(ckcw ckcwVar) {
        this.a = ckcwVar;
    }

    public static int c(axds axdsVar) {
        int i = 0;
        for (awvv<?> awvvVar : awvv.a()) {
            i += awwy.a(awvvVar).a(axdsVar);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(awwb awwbVar) {
        awvv<?>[] a;
        for (awvv<?> awvvVar : awvv.a()) {
            if (awwbVar.c(awvvVar) != awwa.NOT_REQUESTED && !this.b.contains(awvvVar)) {
                ckcw ckcwVar = this.a;
                if (ckih.j.containsKey(awvvVar)) {
                    ((ckcm) ckcwVar.a(ckih.j.get(awvvVar))).a(awwbVar.a(awvvVar).a());
                    this.b.add(awvvVar);
                } else {
                    throw new UnsupportedOperationException(String.format("No is initially displayable metric for content type %s", awvvVar));
                }
            }
        }
    }

    public final void b(awvv<?> awvvVar) {
        ((ckcn) this.a.a(ckih.h)).a();
        drbk drbkVar = awvvVar.O;
    }
}
