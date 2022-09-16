package defpackage;

import android.net.Uri;
import java.io.File;
/* compiled from: PG */
/* renamed from: alhn  reason: default package */
/* loaded from: classes.dex */
public final class alhn {
    private final aldn a;

    public alhn(aldn aldnVar) {
        this.a = aldnVar;
    }

    public final awxx a(alcw alcwVar, aldi aldiVar) {
        aldn aldnVar = this.a;
        int A = araa.A(alcwVar.r);
        if (A == 0) {
            A = 1;
        }
        aldj d = aldnVar.d(A, Uri.parse(alcwVar.f), aldiVar);
        File g = alht.g(alcwVar);
        alcq alcqVar = alcwVar.v;
        if (alcqVar == null) {
            alcqVar = alcq.a;
        }
        alhm alhmVar = new alhm(alcqVar, d, g);
        aldh a = alhmVar.a();
        if (a.b()) {
            return new alhp(alhmVar, a);
        }
        return new alho(a);
    }
}
