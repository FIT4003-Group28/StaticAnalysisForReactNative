package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
/* compiled from: PG */
/* renamed from: alfu  reason: default package */
/* loaded from: classes.dex */
public final class alfu extends aleo {
    private final aldn a;
    private final akze b;
    private final alez c;
    private final alhl e;
    private final aqxo f;

    public alfu(aadd aaddVar, aldn aldnVar, aqxo aqxoVar, albf albfVar, akze akzeVar, alht alhtVar, alez alezVar, alhl alhlVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(aaddVar, avuo.UPLOAD_PROCESSOR_TYPE_SOURCE_VIDEO_CHECK, albfVar, akzeVar, alhtVar);
        this.a = aldnVar;
        this.f = aqxoVar;
        this.b = akzeVar;
        this.c = alezVar;
        this.e = alhlVar;
    }

    @Override // defpackage.algt
    public final albu a(alcw alcwVar) {
        return this.e;
    }

    @Override // defpackage.algt
    public final alct b(alcw alcwVar) {
        alct alctVar = alcwVar.ah;
        return alctVar == null ? alct.a : alctVar;
    }

    @Override // defpackage.aleo
    public final ankt c(String str, akzp akzpVar, alcw alcwVar) {
        this.f.N();
        this.a.d(2, Uri.parse(alcwVar.g), null).f(null);
        return anlz.q(t(this.d.e(), true));
    }

    @Override // defpackage.algt
    public final aypx e() {
        return akxp.u;
    }

    @Override // defpackage.algt
    public final String f() {
        return "SourceFileCheckerTask";
    }

    @Override // defpackage.algt
    public final boolean h() {
        return true;
    }

    @Override // defpackage.aleo
    public final boolean i(alcw alcwVar) {
        int i = alcwVar.b;
        return ((i & 4) == 0 || (i & 64) == 0) ? false : true;
    }

    @Override // defpackage.aleo
    public final akzs k(Throwable th, alcw alcwVar, boolean z) {
        if (th instanceof FileNotFoundException) {
            akze akzeVar = this.b;
            alcu a = alcu.a(alcwVar.l);
            if (a == null) {
                a = alcu.UNKNOWN_UPLOAD;
            }
            akzeVar.c("SourceFileCheckerTask File Not Found", th, a);
            return t(this.d.c(this.c.a(alcwVar)), z);
        }
        return super.k(th, alcwVar, z);
    }
}
