package defpackage;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anni  reason: default package */
/* loaded from: classes.dex */
public final class anni {
    static {
        Charset.forName("UTF-8");
    }

    public static anrh a(anrf anrfVar) {
        aopa createBuilder = anrh.a.createBuilder();
        int i = anrfVar.b;
        createBuilder.copyOnWrite();
        ((anrh) createBuilder.instance).b = i;
        for (anre anreVar : anrfVar.c) {
            aopa createBuilder2 = anrg.a.createBuilder();
            anrb anrbVar = anreVar.b;
            if (anrbVar == null) {
                anrbVar = anrb.a;
            }
            String str = anrbVar.b;
            createBuilder2.copyOnWrite();
            str.getClass();
            ((anrg) createBuilder2.instance).b = str;
            int i2 = answ.i(anreVar.c);
            int i3 = 1;
            if (i2 == 0) {
                i2 = 1;
            }
            createBuilder2.copyOnWrite();
            anrg anrgVar = (anrg) createBuilder2.instance;
            if (i2 != 1) {
                anrgVar.c = i2 - 2;
                int h = answ.h(anreVar.e);
                if (h != 0) {
                    i3 = h;
                }
                createBuilder2.copyOnWrite();
                ((anrg) createBuilder2.instance).e = answ.g(i3);
                int i4 = anreVar.d;
                createBuilder2.copyOnWrite();
                ((anrg) createBuilder2.instance).d = i4;
                anrg anrgVar2 = (anrg) createBuilder2.mo39build();
                createBuilder.copyOnWrite();
                anrh anrhVar = (anrh) createBuilder.instance;
                anrgVar2.getClass();
                aopu aopuVar = anrhVar.c;
                if (!aopuVar.c()) {
                    anrhVar.c = aopi.mutableCopy(aopuVar);
                }
                anrhVar.c.add(anrgVar2);
            } else {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }
        return (anrh) createBuilder.mo39build();
    }

    public static void b(anrf anrfVar) {
        int i = anrfVar.b;
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (anre anreVar : anrfVar.c) {
            int i3 = answ.i(anreVar.c);
            if (i3 != 0 && i3 == 3) {
                if (anreVar.b == null) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(anreVar.d)));
                }
                int h = answ.h(anreVar.e);
                if (h != 0 && h == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(anreVar.d)));
                }
                int i4 = answ.i(anreVar.c);
                if (i4 == 0 || i4 != 2) {
                    if (anreVar.d == i) {
                        if (z) {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                        z = true;
                    }
                    anrb anrbVar = anreVar.b;
                    if (anrbVar == null) {
                        anrbVar = anrb.a;
                    }
                    int j = answ.j(anrbVar.d);
                    z2 &= j != 0 && j == 5;
                    i2++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(anreVar.d)));
                }
            }
        }
        if (i2 != 0) {
            if (!z && !z2) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }
}
