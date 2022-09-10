package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: ckrz  reason: default package */
/* loaded from: classes4.dex */
public final class ckrz implements cksf {
    private final dehq a;
    private final btvo b;
    private final buyi c;
    private final crdz d;

    public ckrz(buyi buyiVar, dehq dehqVar, btvo btvoVar, crdz crdzVar) {
        this.c = buyiVar;
        this.a = dehqVar;
        this.b = btvoVar;
        this.d = crdzVar;
    }

    @Override // defpackage.cksf
    public final boolean a(crfk crfkVar, String str) {
        djud bK;
        djuf b;
        btvo btvoVar = this.b;
        crdz crdzVar = this.d;
        dspd dspdVar = ((crff) crfkVar).b;
        if (dspdVar == null) {
            bK = null;
        } else {
            String a = bvom.a(Locale.getDefault());
            djuc bZ = djud.e.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djud djudVar = (djud) bZ.b;
            dspdVar.getClass();
            int i = djudVar.a | 1;
            djudVar.a = i;
            djudVar.b = dspdVar;
            a.getClass();
            djudVar.a = i | 2;
            djudVar.c = a;
            if (crdzVar.a()) {
                String b2 = crdzVar.b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                djud djudVar2 = (djud) bZ.b;
                b2.getClass();
                djudVar2.a |= 4;
                djudVar2.d = b2;
            } else if ((btvoVar.getTextToSpeechParameters().a & 512) != 0) {
                String str2 = btvoVar.getTextToSpeechParameters().m;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                djud djudVar3 = (djud) bZ.b;
                str2.getClass();
                djudVar3.a |= 4;
                djudVar3.d = str2;
            }
            bK = bZ.bK();
        }
        if (bK != null && (b = b(bK)) != null && (b.a & 1) != 0) {
            dspd dspdVar2 = b.b;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
                try {
                    dspdVar2.l(fileOutputStream);
                    return true;
                } catch (IOException unused) {
                } finally {
                    fileOutputStream.close();
                }
            } catch (FileNotFoundException | IOException unused2) {
            }
        }
        return false;
    }

    @dzsi
    final djuf b(djud djudVar) {
        deig d = deig.d();
        dbsi a = dbsi.a(d, this.c.b(djudVar, new ckry(d), this.a));
        try {
            return (djuf) ((dehn) a.a).get(2L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException unused2) {
            return null;
        } catch (TimeoutException unused3) {
            ((btzc) a.b).a();
            return null;
        }
    }
}
