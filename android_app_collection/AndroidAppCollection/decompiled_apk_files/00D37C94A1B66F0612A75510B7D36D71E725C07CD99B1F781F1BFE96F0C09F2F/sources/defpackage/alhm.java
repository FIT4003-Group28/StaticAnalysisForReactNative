package defpackage;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
/* compiled from: PG */
/* renamed from: alhm  reason: default package */
/* loaded from: classes.dex */
final class alhm {
    private final alcq a;
    private final aldj b;
    private final File c;

    public alhm(alcq alcqVar, aldj aldjVar, File file) {
        this.a = alcqVar;
        this.b = aldjVar;
        this.c = file;
    }

    public final aldh a() {
        int I;
        alcq alcqVar = this.a;
        if (alcqVar == null || (I = aqxo.I(alcqVar.c)) == 0 || I != 6) {
            return this.b.f(this.c);
        }
        boolean z = true;
        aqxo.y((this.a.b & 2) != 0);
        File file = new File(this.a.d);
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        anek.f(new BufferedInputStream(new FileInputStream(file)), bArr, length);
        aldh f = this.b.f(this.c);
        vsl c = vsm.c();
        c.a = 4;
        alcq alcqVar2 = this.a;
        c.b = alcqVar2.g;
        c.c = alcqVar2.e;
        c.d = bArr;
        vsm a = c.a();
        if (a.a() > a.b()) {
            z = false;
        }
        aqxo.p(z);
        return new aldh(new vtd(new vte(f, a.b(), a.d().length), a.a(), a.d()), f.a());
    }
}
