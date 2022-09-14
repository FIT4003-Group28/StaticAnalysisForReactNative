package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Calendar;
/* compiled from: PG */
/* renamed from: alzt  reason: default package */
/* loaded from: classes2.dex */
public final class alzt {
    public final dmxt a;
    public final String b;
    public final String c;
    public final dcdc<Integer> d;
    public final int e;

    public alzt(dmxt dmxtVar, int i, String str, String str2, dcdc<Integer> dcdcVar) {
        this.a = dmxtVar;
        this.e = i;
        this.b = str;
        this.c = str2;
        this.d = dcdcVar;
    }

    public final byte[] a(akry akryVar) {
        Object b;
        if (this.a.h.startsWith("image/")) {
            dtro dtroVar = this.a.g;
            if (dtroVar == null) {
                dtroVar = dtro.a;
            }
            dsqv<dtro, dmwz> dsqvVar = dmwz.c;
            dtroVar.f(dsqvVar);
            if (dtroVar.V.k(dsqvVar.d)) {
                dtro dtroVar2 = this.a.g;
                if (dtroVar2 == null) {
                    dtroVar2 = dtro.a;
                }
                dsqv<dtro, dmwz> dsqvVar2 = dmwz.c;
                dtroVar2.f(dsqvVar2);
                Object l = dtroVar2.V.l(dsqvVar2.d);
                if (l == null) {
                    b = dsqvVar2.b;
                } else {
                    b = dsqvVar2.b(l);
                }
                dsrj<dmwr> dsrjVar = ((dmwz) b).a;
                int size = dsrjVar.size();
                dcen N = dcep.N();
                for (int i = 0; i < size; i++) {
                    N.i(dsrjVar.get(i).a);
                }
                int i2 = Calendar.getInstance().get(1);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    if (akryVar == akry.SATELLITE) {
                        alwv.b(new String[0], (String[]) N.f().toArray(new String[0]), i2, new DataOutputStream(byteArrayOutputStream));
                    } else {
                        alwv.b((String[]) N.f().toArray(new String[0]), new String[0], i2, new DataOutputStream(byteArrayOutputStream));
                    }
                    byte[] bArr = new byte[byteArrayOutputStream.size() + this.a.c.c()];
                    System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr, 0, byteArrayOutputStream.size());
                    System.arraycopy(this.a.c.G(), 0, bArr, byteArrayOutputStream.size(), this.a.c.c());
                    return bArr;
                } catch (IOException unused) {
                    return this.a.c.G();
                }
            }
        }
        return this.a.c.G();
    }
}
