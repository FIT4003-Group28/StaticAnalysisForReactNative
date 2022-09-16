package defpackage;

import java.lang.reflect.Array;
import java.math.BigInteger;
import org.chromium.net.PrivateKeyType;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: antw  reason: default package */
/* loaded from: classes.dex */
public final class antw {
    static final long[] a;
    static final long[] b;
    static final long[] c;
    static final antp[][] d;
    static final antp[] e;
    private static final BigInteger f;
    private static final BigInteger g;
    private static final BigInteger h;
    private static final BigInteger i;

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(PrivateKeyType.INVALID).subtract(BigInteger.valueOf(19L));
        f = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        g = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        h = mod2;
        BigInteger modPow = BigInteger.valueOf(2L).modPow(subtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), subtract);
        i = modPow;
        antv antvVar = new antv();
        antvVar.b = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract);
        BigInteger bigInteger = antvVar.b;
        BigInteger multiply = bigInteger.pow(2).subtract(BigInteger.ONE).multiply(mod.multiply(bigInteger.pow(2)).add(BigInteger.ONE).modInverse(subtract));
        BigInteger modPow2 = multiply.modPow(subtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), subtract);
        if (!modPow2.pow(2).subtract(multiply).mod(subtract).equals(BigInteger.ZERO)) {
            modPow2 = modPow2.multiply(modPow).mod(subtract);
        }
        if (modPow2.testBit(0)) {
            modPow2 = subtract.subtract(modPow2);
        }
        antvVar.a = modPow2;
        a = anue.h(c(mod));
        b = anue.h(c(mod2));
        c = anue.h(c(modPow));
        d = (antp[][]) Array.newInstance(antp.class, 32, 8);
        antv antvVar2 = antvVar;
        for (int i2 = 0; i2 < 32; i2++) {
            antv antvVar3 = antvVar2;
            for (int i3 = 0; i3 < 8; i3++) {
                d[i2][i3] = a(antvVar3);
                antvVar3 = b(antvVar3, antvVar2);
            }
            for (int i4 = 0; i4 < 8; i4++) {
                antvVar2 = b(antvVar2, antvVar2);
            }
        }
        antv b2 = b(antvVar, antvVar);
        e = new antp[8];
        for (int i5 = 0; i5 < 8; i5++) {
            e[i5] = a(antvVar);
            antvVar = b(antvVar, b2);
        }
    }

    private static antp a(antv antvVar) {
        BigInteger add = antvVar.b.add(antvVar.a);
        BigInteger bigInteger = f;
        return new antp(anue.h(c(add.mod(bigInteger))), anue.h(c(antvVar.b.subtract(antvVar.a).mod(bigInteger))), anue.h(c(h.multiply(antvVar.a).multiply(antvVar.b).mod(bigInteger))));
    }

    private static antv b(antv antvVar, antv antvVar2) {
        antv antvVar3 = new antv();
        BigInteger multiply = g.multiply(antvVar.a.multiply(antvVar2.a).multiply(antvVar.b).multiply(antvVar2.b));
        BigInteger bigInteger = f;
        BigInteger mod = multiply.mod(bigInteger);
        antvVar3.a = antvVar.a.multiply(antvVar2.b).add(antvVar2.a.multiply(antvVar.b)).multiply(BigInteger.ONE.add(mod).modInverse(bigInteger)).mod(bigInteger);
        antvVar3.b = antvVar.b.multiply(antvVar2.b).add(antvVar.a.multiply(antvVar2.a)).multiply(BigInteger.ONE.subtract(mod).modInverse(bigInteger)).mod(bigInteger);
        return antvVar3;
    }

    private static byte[] c(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = bArr[i2];
            int i3 = (32 - i2) - 1;
            bArr[i2] = bArr[i3];
            bArr[i3] = b2;
        }
        return bArr;
    }
}
