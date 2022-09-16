package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Random;
/* compiled from: PG */
/* renamed from: cnzu  reason: default package */
/* loaded from: classes5.dex */
public final class cnzu extends cnzv<String> {
    final /* synthetic */ Map a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnzu(cnzw cnzwVar, Map map) {
        super(cnzwVar);
        this.a = map;
    }

    @Override // defpackage.cnzv
    public final /* bridge */ /* synthetic */ String a(String str) {
        String valueOf = String.valueOf(str);
        return coaj.a(coaj.b(valueOf.length() != 0 ? "getResults ".concat(valueOf) : new String("getResults ")));
    }

    @Override // defpackage.cnzv
    public final /* bridge */ /* synthetic */ String b(cnzr cnzrVar) {
        byte[] b;
        Map map = this.a;
        coac coacVar = (coac) cnzrVar;
        coai b2 = coacVar.c.b();
        b2.c(14, coak.COARSE);
        if (coacVar.b != null) {
            b = coacVar.b;
        } else {
            cnzt cnztVar = new cnzt();
            coacVar.d.d(new coaa(coacVar, map, cnztVar));
            try {
                b = (byte[]) cnztVar.b(((coac) cnzrVar).a);
                if (b == null) {
                    long j = ((coac) cnzrVar).a;
                    StringBuilder sb = new StringBuilder(41);
                    sb.append("Snapshot timeout: ");
                    sb.append(j);
                    sb.append(" ms");
                    b = coaj.b(sb.toString());
                }
            } catch (InterruptedException e) {
                String valueOf = String.valueOf(e.toString());
                b = coaj.b(valueOf.length() != 0 ? "Results transfer failed: ".concat(valueOf) : new String("Results transfer failed: "));
            }
        }
        b2.c(15, coak.COARSE);
        if (dxyx.b()) {
            dbmi bZ = dbmj.f.bZ();
            dspd x = dspd.x(b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dbmj dbmjVar = (dbmj) bZ.b;
            x.getClass();
            dbmjVar.a |= 2;
            dbmjVar.c = x;
            dbmh a = b2.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dbmj dbmjVar2 = (dbmj) bZ.b;
            a.getClass();
            dbmjVar2.d = a;
            dbmjVar2.a |= 4;
            dbmc dbmcVar = dbmc.c;
            dbmb bZ2 = dbmc.c.bZ();
            if (dbmcVar.b != dxza.b()) {
                boolean b3 = dxza.b();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dbmc dbmcVar2 = (dbmc) bZ2.b;
                dbmcVar2.a |= 1;
                dbmcVar2.b = b3;
            }
            dbmc bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dbmj dbmjVar3 = (dbmj) bZ.b;
            bK.getClass();
            dbmjVar3.e = bK;
            dbmjVar3.a |= 8;
            dbmj bK2 = bZ.bK();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8];
                new Random().nextBytes(bArr);
                bArr[0] = 10;
                bArr[1] = 6;
                int i = 3;
                for (int i2 = 0; i2 < 8; i2++) {
                    i ^= bArr[i2];
                }
                bArr[2] = (byte) (bArr[2] ^ ((byte) i));
                byteArrayOutputStream.write(bArr);
                dsqp dsqpVar = (dsqp) bK2.cu(5);
                dsqpVar.bC(bK2);
                dbmi dbmiVar = (dbmi) dsqpVar;
                if (dbmiVar.c) {
                    dbmiVar.bF();
                    dbmiVar.c = false;
                }
                dbmj dbmjVar4 = (dbmj) dbmiVar.b;
                dbmjVar4.a &= -2;
                dbmjVar4.b = dbmj.f.b;
                dbmiVar.bK().bT(byteArrayOutputStream);
                b = byteArrayOutputStream.toByteArray();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        String a2 = coaj.a(b);
        cnzrVar.a();
        return a2;
    }
}
