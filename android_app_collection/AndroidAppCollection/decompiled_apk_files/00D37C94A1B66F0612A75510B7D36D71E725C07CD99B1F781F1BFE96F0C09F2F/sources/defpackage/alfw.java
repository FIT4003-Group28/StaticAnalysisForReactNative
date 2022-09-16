package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: alfw  reason: default package */
/* loaded from: classes.dex */
public abstract class alfw extends aleo {
    private final snc a;
    private final aadd b;
    private final akze c;
    private final alez e;
    private final aldn f;

    public alfw(avuo avuoVar, snc sncVar, aadd aaddVar, akze akzeVar, albf albfVar, alez alezVar, aldn aldnVar, alht alhtVar) {
        super(aaddVar, avuoVar, albfVar, akzeVar, alhtVar);
        this.a = sncVar;
        this.b = aaddVar;
        this.c = akzeVar;
        this.e = alezVar;
        this.f = aldnVar;
    }

    @Override // defpackage.aleo
    public akzs k(Throwable th, alcw alcwVar, boolean z) {
        int A;
        int A2;
        avun avunVar;
        if (th instanceof FileNotFoundException) {
            akze akzeVar = this.c;
            String concat = f().concat(" File Not Found");
            alcu a = alcu.a(alcwVar.l);
            if (a == null) {
                a = alcu.UNKNOWN_UPLOAD;
            }
            akzeVar.c(concat, th, a);
            return t(this.d.c(this.e.a(alcwVar)), z);
        } else if (!(th instanceof IOException) || (((A = araa.A(alcwVar.r)) == 0 || A != 2) && ((A2 = araa.A(alcwVar.r)) == 0 || A2 != 3))) {
            return super.k(th, alcwVar, z);
        } else {
            akze akzeVar2 = this.c;
            String f = f();
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(f.length() + 33 + String.valueOf(message).length());
            sb.append(f);
            sb.append(" while reusing file input stream ");
            sb.append(message);
            String sb2 = sb.toString();
            alcu a2 = alcu.a(alcwVar.l);
            if (a2 == null) {
                a2 = alcu.UNKNOWN_UPLOAD;
            }
            akzeVar2.c(sb2, th, a2);
            this.f.c();
            if (th instanceof akzc) {
                avunVar = ((akzc) th).a;
            } else {
                avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_SOURCE_FAILED;
            }
            alht alhtVar = this.d;
            alct b = b(alcwVar);
            b.getClass();
            return u(alhtVar.d(avunVar, b, amuk.r(0L), this.c), z, alfv.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aleo
    public final void q(alcw alcwVar) {
        long c = this.a.c();
        avvf avvfVar = this.b.a().h;
        if (avvfVar == null) {
            avvfVar = avvf.a;
        }
        long j = avvfVar.l;
        if (j <= 0 || c - alcwVar.h <= j) {
            return;
        }
        throw akzh.a(avun.UPLOAD_PROCESSOR_FAILURE_REASON_MAX_STORAGE_USAGE_TIME_EXCEEDED);
    }
}
