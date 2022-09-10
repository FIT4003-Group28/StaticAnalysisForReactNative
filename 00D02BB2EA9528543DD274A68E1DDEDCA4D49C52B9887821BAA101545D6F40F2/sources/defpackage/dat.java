package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: dat  reason: default package */
/* loaded from: classes5.dex */
final class dat implements cvib {
    final /* synthetic */ File a;
    final /* synthetic */ deig b;
    final /* synthetic */ dffw c;
    final /* synthetic */ dau d;

    public dat(dau dauVar, File file, deig deigVar, dffw dffwVar) {
        this.d = dauVar;
        this.a = file;
        this.b = deigVar;
        this.c = dffwVar;
    }

    @Override // defpackage.cvib
    public final void a(File file, cvia cviaVar) {
        int i;
        dbtm dbtmVar = dau.a;
        dau dauVar = this.d;
        cvhz cvhzVar = cvhz.UNKNOWN;
        switch (cviaVar.a.ordinal()) {
            case 0:
            default:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = cviaVar.b;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 4;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 7;
                break;
            case 9:
                i = 8;
                break;
            case 10:
                i = 9;
                break;
            case 11:
                i = 10;
                break;
        }
        dauVar.b(i);
        drtd bZ = drte.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drte drteVar = (drte) bZ.b;
        int i2 = 8 | drteVar.a;
        drteVar.a = i2;
        drteVar.e = 13;
        String str = cviaVar.c;
        if (str != null) {
            str.getClass();
            drteVar.a = i2 | 4;
            drteVar.d = str;
        }
        deig deigVar = this.b;
        dffw dffwVar = this.c;
        if (dffwVar.c) {
            dffwVar.bF();
            dffwVar.c = false;
        }
        dffx dffxVar = (dffx) dffwVar.b;
        drte bK = bZ.bK();
        dffx dffxVar2 = dffx.e;
        bK.getClass();
        dffxVar.c = bK;
        dffxVar.b = 3;
        deigVar.j(dffwVar.bK());
    }

    @Override // defpackage.cvib
    public final void b(File file) {
        if (file.renameTo(this.a)) {
            dbtm dbtmVar = dau.a;
            this.a.getAbsolutePath();
            this.d.b(-1);
            deig deigVar = this.b;
            dffw dffwVar = this.c;
            String absolutePath = this.a.getAbsolutePath();
            if (dffwVar.c) {
                dffwVar.bF();
                dffwVar.c = false;
            }
            dffx dffxVar = (dffx) dffwVar.b;
            dffx dffxVar2 = dffx.e;
            absolutePath.getClass();
            dffxVar.b = 2;
            dffxVar.c = absolutePath;
            deigVar.j(dffwVar.bK());
            return;
        }
        dbtm dbtmVar2 = dau.a;
        this.d.b(8);
        drtd bZ = drte.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drte drteVar = (drte) bZ.b;
        drteVar.a = 8 | drteVar.a;
        drteVar.e = 13;
        deig deigVar2 = this.b;
        dffw dffwVar2 = this.c;
        if (dffwVar2.c) {
            dffwVar2.bF();
            dffwVar2.c = false;
        }
        dffx dffxVar3 = (dffx) dffwVar2.b;
        drte bK = bZ.bK();
        dffx dffxVar4 = dffx.e;
        bK.getClass();
        dffxVar3.c = bK;
        dffxVar3.b = 3;
        deigVar2.j(dffwVar2.bK());
    }
}
