package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: alht  reason: default package */
/* loaded from: classes.dex */
public final class alht {
    private final snc a;

    public alht(snc sncVar) {
        this.a = sncVar;
    }

    public static long a(alcw alcwVar) {
        alct alctVar = alcwVar.ab;
        if (alctVar == null) {
            alctVar = alct.a;
        }
        long j = alctVar.g;
        if (j == 0) {
            alct alctVar2 = alcwVar.aa;
            if (alctVar2 == null) {
                alctVar2 = alct.a;
            }
            j = alctVar2.g;
        }
        if (j == 0) {
            alct alctVar3 = alcwVar.Y;
            if (alctVar3 == null) {
                alctVar3 = alct.a;
            }
            return alctVar3.g;
        }
        return j;
    }

    public static avia f(avuq avuqVar) {
        for (avur avurVar : avuqVar.e) {
            if ((avurVar.b & 2) != 0) {
                avia aviaVar = avurVar.c;
                return aviaVar == null ? avia.a : aviaVar;
            }
        }
        return null;
    }

    public static File h(alcw alcwVar) {
        if ((alcwVar.b & 134217728) == 0) {
            String valueOf = String.valueOf(alcwVar.k);
            throw new IOException(valueOf.length() != 0 ? "Missing copy file name ".concat(valueOf) : new String("Missing copy file name "));
        }
        alct alctVar = alcwVar.y;
        if (alctVar == null) {
            alctVar = alct.a;
        }
        int z = araa.z(alctVar.c);
        if (z == 0 || z != 2) {
            String valueOf2 = String.valueOf(alcwVar.k);
            throw new IOException(valueOf2.length() != 0 ? "Invalid copy file state ".concat(valueOf2) : new String("Invalid copy file state "));
        }
        String absolutePath = g(alcwVar).getAbsolutePath();
        String str = alcwVar.z;
        StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 1 + String.valueOf(str).length());
        sb.append(absolutePath);
        sb.append("/");
        sb.append(str);
        return new File(sb.toString());
    }

    public static boolean i(avuq avuqVar) {
        Iterator it = avuqVar.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            avus avusVar = (avus) it.next();
            if ((avusVar.b & 128) != 0) {
                avyw avywVar = avusVar.f;
                if (avywVar == null) {
                    avywVar = avyw.a;
                }
                int aa = awwc.aa(avywVar.b);
                if (aa != 0 && aa == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean j(alct alctVar, avun avunVar) {
        int z = araa.z(alctVar.c);
        if (z != 0 && z == 4) {
            avun b = avun.b(alctVar.d);
            if (b == null) {
                b = avun.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
            }
            return b == avunVar;
        }
        return false;
    }

    public static boolean k(alct alctVar) {
        int z = araa.z(alctVar.c);
        if (z != 0 && z == 2) {
            return true;
        }
        int z2 = araa.z(alctVar.c);
        return z2 != 0 && z2 == 4;
    }

    public static boolean l(alcw alcwVar) {
        if (!alcwVar.x || (alcwVar.b & 134217728) == 0) {
            return false;
        }
        alct alctVar = alcwVar.y;
        if (alctVar == null) {
            alctVar = alct.a;
        }
        int z = araa.z(alctVar.c);
        return z != 0 && z == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
        if (r0 == defpackage.avun.UPLOAD_PROCESSOR_FAILURE_REASON_UPLOAD_ALREADY_FAILED) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
        if (r0 == defpackage.avun.UPLOAD_PROCESSOR_FAILURE_REASON_UPLOAD_ALREADY_FAILED) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006e, code lost:
        if (r0 != defpackage.avun.UPLOAD_PROCESSOR_FAILURE_REASON_UPLOAD_ALREADY_FAILED) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0070, code lost:
        return 4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m(defpackage.alcw r3) {
        /*
            alct r0 = r3.Y
            if (r0 != 0) goto L6
            alct r0 = defpackage.alct.a
        L6:
            int r0 = r0.c
            int r0 = defpackage.araa.z(r0)
            r1 = 4
            if (r0 != 0) goto L10
            goto L26
        L10:
            if (r0 != r1) goto L26
            alct r0 = r3.Y
            if (r0 != 0) goto L18
            alct r0 = defpackage.alct.a
        L18:
            int r0 = r0.d
            avun r0 = defpackage.avun.b(r0)
            if (r0 != 0) goto L22
            avun r0 = defpackage.avun.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN
        L22:
            avun r2 = defpackage.avun.UPLOAD_PROCESSOR_FAILURE_REASON_UPLOAD_ALREADY_FAILED
            if (r0 != r2) goto L70
        L26:
            alct r0 = r3.aa
            if (r0 != 0) goto L2c
            alct r0 = defpackage.alct.a
        L2c:
            int r0 = r0.c
            int r0 = defpackage.araa.z(r0)
            if (r0 != 0) goto L35
            goto L4b
        L35:
            if (r0 != r1) goto L4b
            alct r0 = r3.aa
            if (r0 != 0) goto L3d
            alct r0 = defpackage.alct.a
        L3d:
            int r0 = r0.d
            avun r0 = defpackage.avun.b(r0)
            if (r0 != 0) goto L47
            avun r0 = defpackage.avun.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN
        L47:
            avun r2 = defpackage.avun.UPLOAD_PROCESSOR_FAILURE_REASON_UPLOAD_ALREADY_FAILED
            if (r0 != r2) goto L70
        L4b:
            alct r0 = r3.ab
            if (r0 != 0) goto L51
            alct r0 = defpackage.alct.a
        L51:
            int r0 = r0.c
            int r0 = defpackage.araa.z(r0)
            if (r0 != 0) goto L5a
            goto L71
        L5a:
            if (r0 != r1) goto L71
            alct r0 = r3.ab
            if (r0 != 0) goto L62
            alct r0 = defpackage.alct.a
        L62:
            int r0 = r0.d
            avun r0 = defpackage.avun.b(r0)
            if (r0 != 0) goto L6c
            avun r0 = defpackage.avun.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN
        L6c:
            avun r2 = defpackage.avun.UPLOAD_PROCESSOR_FAILURE_REASON_UPLOAD_ALREADY_FAILED
            if (r0 == r2) goto L71
        L70:
            return r1
        L71:
            alct r3 = r3.ab
            if (r3 != 0) goto L77
            alct r3 = defpackage.alct.a
        L77:
            int r3 = r3.c
            int r3 = defpackage.araa.z(r3)
            if (r3 != 0) goto L80
            goto L84
        L80:
            r0 = 2
            if (r3 != r0) goto L84
            return r0
        L84:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alht.m(alcw):int");
    }

    public static int n(alcu alcuVar) {
        alcu alcuVar2 = alcu.UNKNOWN_UPLOAD;
        int ordinal = alcuVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                return 3;
            }
            return ordinal != 5 ? 1 : 4;
        }
        return 2;
    }

    public static void o(aopa aopaVar) {
        aqxo.p(((alcw) aopaVar.instance).s);
        aopaVar.copyOnWrite();
        alcw alcwVar = (alcw) aopaVar.instance;
        alcwVar.ah = null;
        alcwVar.c &= -67108865;
        aopaVar.copyOnWrite();
        alcw alcwVar2 = (alcw) aopaVar.instance;
        alcwVar2.w = null;
        alcwVar2.b &= -16777217;
        aopaVar.copyOnWrite();
        alcw alcwVar3 = (alcw) aopaVar.instance;
        alcwVar3.v = null;
        alcwVar3.b &= -8388609;
        if (alcwVar3.x) {
            aopaVar.copyOnWrite();
            alcw alcwVar4 = (alcw) aopaVar.instance;
            alcwVar4.y = null;
            alcwVar4.b &= -67108865;
            aopaVar.copyOnWrite();
            alcw alcwVar5 = (alcw) aopaVar.instance;
            alcwVar5.b &= -134217729;
            alcwVar5.z = alcw.a.z;
            aopaVar.copyOnWrite();
            alcw alcwVar6 = (alcw) aopaVar.instance;
            alcwVar6.b &= -268435457;
            alcwVar6.A = 0L;
            aopaVar.copyOnWrite();
            alcw alcwVar7 = (alcw) aopaVar.instance;
            alcwVar7.b &= -1073741825;
            alcwVar7.C = 0L;
            aopaVar.copyOnWrite();
            alcw alcwVar8 = (alcw) aopaVar.instance;
            alcwVar8.b |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            alcwVar8.D = true;
        }
        aopaVar.copyOnWrite();
        alcw alcwVar9 = (alcw) aopaVar.instance;
        alcwVar9.I = null;
        alcwVar9.c &= -17;
        aopaVar.copyOnWrite();
        alcw alcwVar10 = (alcw) aopaVar.instance;
        alcwVar10.H = null;
        alcwVar10.c &= -9;
        aopaVar.copyOnWrite();
        alcw alcwVar11 = (alcw) aopaVar.instance;
        alcwVar11.ak = null;
        alcwVar11.c &= -536870913;
        aopaVar.copyOnWrite();
        alcw alcwVar12 = (alcw) aopaVar.instance;
        alcwVar12.f62J = null;
        alcwVar12.c &= -33;
        aopaVar.copyOnWrite();
        alcw alcwVar13 = (alcw) aopaVar.instance;
        alcwVar13.K = null;
        alcwVar13.c &= -65;
        aopaVar.copyOnWrite();
        alcw alcwVar14 = (alcw) aopaVar.instance;
        alcwVar14.aa = null;
        alcwVar14.c &= -524289;
        aopaVar.copyOnWrite();
        alcw alcwVar15 = (alcw) aopaVar.instance;
        alcwVar15.Y = null;
        alcwVar15.c &= -131073;
    }

    public final alct b(long j) {
        long c = this.a.c();
        aopa createBuilder = alct.a.createBuilder();
        createBuilder.copyOnWrite();
        alct alctVar = (alct) createBuilder.instance;
        alctVar.b |= 8;
        alctVar.f = j + c;
        createBuilder.copyOnWrite();
        alct alctVar2 = (alct) createBuilder.instance;
        alctVar2.b |= 16;
        alctVar2.g = c;
        return (alct) createBuilder.mo39build();
    }

    public final alct c(avun avunVar) {
        aopa createBuilder = alct.a.createBuilder();
        createBuilder.copyOnWrite();
        alct alctVar = (alct) createBuilder.instance;
        alctVar.c = 3;
        alctVar.b |= 1;
        createBuilder.copyOnWrite();
        alct alctVar2 = (alct) createBuilder.instance;
        alctVar2.d = avunVar.aB;
        alctVar2.b |= 2;
        long c = this.a.c();
        createBuilder.copyOnWrite();
        alct alctVar3 = (alct) createBuilder.instance;
        alctVar3.b |= 16;
        alctVar3.g = c;
        return (alct) createBuilder.mo39build();
    }

    public final alct d(avun avunVar, alct alctVar, List list, akze akzeVar) {
        aopa createBuilder = alct.a.createBuilder();
        long c = this.a.c();
        int i = (alctVar.b & 1) != 0 ? alctVar.e : 0;
        if (i >= list.size()) {
            int i2 = avunVar.aB;
            StringBuilder sb = new StringBuilder(41);
            sb.append("Retry count exceeded. Reason[");
            sb.append(i2);
            sb.append("]");
            akzeVar.b(sb.toString(), new Exception());
            createBuilder.copyOnWrite();
            alct alctVar2 = (alct) createBuilder.instance;
            alctVar2.c = 3;
            alctVar2.b |= 1;
        } else {
            createBuilder.copyOnWrite();
            alct alctVar3 = (alct) createBuilder.instance;
            alctVar3.c = 2;
            alctVar3.b |= 1;
            long longValue = ((Long) list.get(i)).longValue();
            createBuilder.copyOnWrite();
            alct alctVar4 = (alct) createBuilder.instance;
            alctVar4.b |= 8;
            alctVar4.f = longValue + c;
            createBuilder.copyOnWrite();
            alct alctVar5 = (alct) createBuilder.instance;
            alctVar5.b |= 4;
            alctVar5.e = i + 1;
        }
        createBuilder.copyOnWrite();
        alct alctVar6 = (alct) createBuilder.instance;
        alctVar6.d = avunVar.aB;
        alctVar6.b |= 2;
        createBuilder.copyOnWrite();
        alct alctVar7 = (alct) createBuilder.instance;
        alctVar7.b |= 16;
        alctVar7.g = c;
        return (alct) createBuilder.mo39build();
    }

    public final alct e() {
        aopa createBuilder = alct.a.createBuilder();
        createBuilder.copyOnWrite();
        alct alctVar = (alct) createBuilder.instance;
        alctVar.c = 1;
        alctVar.b = 1 | alctVar.b;
        long c = this.a.c();
        createBuilder.copyOnWrite();
        alct alctVar2 = (alct) createBuilder.instance;
        alctVar2.b |= 16;
        alctVar2.g = c;
        return (alct) createBuilder.mo39build();
    }

    public static File g(alcw alcwVar) {
        if ((alcwVar.c & 268435456) == 0) {
            String valueOf = String.valueOf(alcwVar.k);
            throw new IOException(valueOf.length() != 0 ? "Missing working directory ".concat(valueOf) : new String("Missing working directory "));
        }
        File file = new File(alcwVar.aj);
        if (file.exists() || file.mkdir()) {
            return file;
        }
        String valueOf2 = String.valueOf(alcwVar.k);
        throw new IOException(valueOf2.length() != 0 ? "Could not create working directory ".concat(valueOf2) : new String("Could not create working directory "));
    }
}
