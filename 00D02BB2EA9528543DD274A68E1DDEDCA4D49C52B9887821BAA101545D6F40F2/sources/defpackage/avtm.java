package defpackage;

import android.app.Application;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
/* compiled from: PG */
/* renamed from: avtm  reason: default package */
/* loaded from: classes3.dex */
public final class avtm {
    static final String a = "android.database.CursorWindowAllocationException";
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    private static final String g = "avtm";
    private static final avth h;
    private static final avth i;
    private static final avth j;
    private static final avth k;
    private static final avth l;
    private final avtl m;

    static {
        avth avthVar = new avth();
        avthVar.c("regionId", "TEXT", avth.a);
        avthVar.c("status", "INT", new avtf[0]);
        avthVar.c("failureReason", "INT", new avtf[0]);
        avthVar.c("geometry", "BLOB", new avtf[0]);
        avthVar.c("implicitRegion", "BLOB", new avtf[0]);
        avthVar.c("name", "TEXT", new avtf[0]);
        avthVar.c("expirationTimeMs", "INT", new avtf[0]);
        avthVar.c("estimatedSize", "INT", new avtf[0]);
        avthVar.c("currentSize", "INT", new avtf[0]);
        avthVar.c("estimatedBytesProcessed", "INT", new avtf[0]);
        avthVar.c("onDiskSize", "INT", new avtf[0]);
        avthVar.c("totalNumFiles", "INT", new avtf[0]);
        avthVar.c("numFilesToDownload", "INT", new avtf[0]);
        avthVar.c("numFilesProcessed", "INT", new avtf[0]);
        avthVar.c("regionVersion", "BLOB", new avtf[0]);
        avthVar.c("overrideWifiOnlyForRegion", "INT", avth.d());
        avthVar.c("expiringNotificationShown", "INT", avth.d());
        avthVar.c("hasFailedProcessing", "INT", avth.d());
        avthVar.c("upcomingTripNotificationShown", "INT", avth.d());
        avthVar.c("currentTripNotificationShown", "INT", avth.d());
        h = avthVar;
        b = avthVar.a();
        avth avthVar2 = new avth();
        avthVar2.c("resourceId", "TEXT", avth.a);
        avthVar2.c("url", "TEXT", new avtf[0]);
        avthVar2.c("diffUrl", "TEXT", new avtf[0]);
        avthVar2.c("type", "INT", new avtf[0]);
        avthVar2.c("status", "INT", new avtf[0]);
        avthVar2.c("failureReason", "INT", new avtf[0]);
        avthVar2.c("filePath", "TEXT", new avtf[0]);
        avthVar2.c("estimatedSize", "INT", new avtf[0]);
        avthVar2.c("onDiskSize", "INT", new avtf[0]);
        avthVar2.c("nextRetry", "DATETIME", new avtf[0]);
        avthVar2.c("retryCount", "INT", new avtf[0]);
        avthVar2.c("encryptionKey", "BLOB", new avtf[0]);
        avthVar2.c("verificationKey", "BLOB", new avtf[0]);
        avthVar2.c("lastModifiedMs", "INT", new avtf[0]);
        avthVar2.c("overrideWifiOnly", "INT", avth.d());
        i = avthVar2;
        c = avthVar2.a();
        avth avthVar3 = new avth();
        avthVar3.c("resourceId", "TEXT", avth.a);
        avthVar3.c("regionId", "TEXT", avth.a);
        j = avthVar3;
        d = avthVar3.a();
        avth avthVar4 = new avth();
        avthVar4.c("updateId", "INT", avth.a);
        avthVar4.c("type", "INT", new avtf[0]);
        avthVar4.c("overrideWifiOnlyForUpdate", "INT", avth.d());
        avthVar4.c("state", "INT", avth.d());
        avthVar4.c("willDownloadRegion", "INT", avth.d());
        k = avthVar4;
        e = avthVar4.a();
        avth avthVar5 = new avth();
        avthVar5.c("regionIndependentStateId", "INT", avth.a);
        avthVar5.c("serializedRegionIndependentState", "BLOB", new avtf[0]);
        l = avthVar5;
        f = avthVar5.a();
    }

    public avtm(Application application, avpn avpnVar, avze avzeVar, afec afecVar) {
        File databasePath;
        File parentFile;
        String d2 = avpnVar.d(avzeVar);
        if (d2 != null && (databasePath = application.getDatabasePath(d2)) != null && (parentFile = databasePath.getParentFile()) != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        this.m = new avtl(application, d2, afecVar);
    }

    public static String a(boolean z) {
        return true != z ? "offlineRegions" : "inProcessRegions";
    }

    @dzsi
    public static <T> T b(RuntimeException runtimeException, Class<? extends T> cls) {
        if (runtimeException instanceof SQLiteDatabaseCorruptException) {
            return cls.cast(null);
        }
        T cast = cls.cast(null);
        j(runtimeException);
        return cast;
    }

    public static dcdc<dlpk> d(Cursor cursor) {
        dlpk bK;
        try {
            dccx F = dcdc.F();
            while (cursor.moveToNext()) {
                if (cursor.getCount() == 0) {
                    bK = null;
                } else {
                    dlpi bZ = dlpk.l.bZ();
                    try {
                        dspd P = dspd.P(cursor.getString(cursor.getColumnIndexOrThrow("resourceId")));
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dlpk dlpkVar = (dlpk) bZ.b;
                        P.getClass();
                        dlpkVar.a |= 1;
                        dlpkVar.b = P;
                        String string = cursor.getString(cursor.getColumnIndexOrThrow("url"));
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dlpk dlpkVar2 = (dlpk) bZ.b;
                        string.getClass();
                        dlpkVar2.a |= 4;
                        dlpkVar2.d = string;
                        long j2 = cursor.getLong(cursor.getColumnIndexOrThrow("estimatedSize"));
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dlpk dlpkVar3 = (dlpk) bZ.b;
                        dlpkVar3.a |= 64;
                        dlpkVar3.h = j2;
                        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("type");
                        if (cursor.isNull(columnIndexOrThrow)) {
                            dluy dluyVar = dluy.UNKNOWN_RESOURCE_TYPE;
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dlpk dlpkVar4 = (dlpk) bZ.b;
                            dlpkVar4.c = dluyVar.f;
                            dlpkVar4.a |= 2;
                        } else {
                            dluy b2 = dluy.b(cursor.getInt(columnIndexOrThrow));
                            if (b2 == null) {
                                b2 = dluy.UNKNOWN_RESOURCE_TYPE;
                            }
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dlpk dlpkVar5 = (dlpk) bZ.b;
                            dlpkVar5.c = b2.f;
                            dlpkVar5.a |= 2;
                        }
                        byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow("encryptionKey"));
                        if (blob != null && blob.length > 0) {
                            dspd x = dspd.x(blob);
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dlpk dlpkVar6 = (dlpk) bZ.b;
                            x.getClass();
                            dlpkVar6.a |= 128;
                            dlpkVar6.i = x;
                        }
                        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("diffUrl");
                        if (!cursor.isNull(columnIndexOrThrow2)) {
                            String string2 = cursor.getString(columnIndexOrThrow2);
                            if (!string2.isEmpty()) {
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                dlpk dlpkVar7 = (dlpk) bZ.b;
                                string2.getClass();
                                dlpkVar7.a |= 8;
                                dlpkVar7.e = string2;
                            }
                        }
                        String string3 = cursor.getString(cursor.getColumnIndexOrThrow("filePath"));
                        if (string3 != null && !string3.isEmpty()) {
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dlpk dlpkVar8 = (dlpk) bZ.b;
                            string3.getClass();
                            dlpkVar8.a |= 16;
                            dlpkVar8.f = string3;
                        }
                        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("verificationKey");
                        if (!cursor.isNull(columnIndexOrThrow3)) {
                            try {
                                String str = new String(cursor.getBlob(columnIndexOrThrow3), dbrc.c);
                                if (!str.isEmpty()) {
                                    if (bZ.c) {
                                        bZ.bF();
                                        bZ.c = false;
                                    }
                                    dlpk dlpkVar9 = (dlpk) bZ.b;
                                    dlpkVar9.a |= 256;
                                    dlpkVar9.j = str;
                                }
                            } catch (SQLiteException e2) {
                                e2.getMessage();
                            }
                        }
                        long j3 = cursor.getLong(cursor.getColumnIndexOrThrow("onDiskSize"));
                        if (j3 > 0) {
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dlpk dlpkVar10 = (dlpk) bZ.b;
                            dlpkVar10.a |= 32;
                            dlpkVar10.g = j3;
                        }
                        switch (cursor.getInt(cursor.getColumnIndexOrThrow("status"))) {
                            case 0:
                            case 1:
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                dlpk dlpkVar11 = (dlpk) bZ.b;
                                dlpkVar11.k = 0;
                                int i2 = dlpkVar11.a | 512;
                                dlpkVar11.a = i2;
                                dlpkVar11.a = i2 & (-17);
                                dlpkVar11.f = dlpk.l.f;
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                dlpk dlpkVar12 = (dlpk) bZ.b;
                                int i3 = dlpkVar12.a & (-33);
                                dlpkVar12.a = i3;
                                dlpkVar12.g = 0L;
                                dlpkVar12.a = i3 & (-257);
                                dlpkVar12.j = dlpk.l.j;
                                break;
                            case 2:
                            case 3:
                            case 5:
                            case 7:
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                dlpk dlpkVar13 = (dlpk) bZ.b;
                                dlpkVar13.k = 1;
                                dlpkVar13.a |= 512;
                                break;
                            case 4:
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                dlpk dlpkVar14 = (dlpk) bZ.b;
                                dlpkVar14.k = 2;
                                dlpkVar14.a |= 512;
                                break;
                            case 6:
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                dlpk dlpkVar15 = (dlpk) bZ.b;
                                dlpkVar15.k = 3;
                                dlpkVar15.a |= 512;
                                break;
                            default:
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                dlpk dlpkVar16 = (dlpk) bZ.b;
                                dlpkVar16.k = 1;
                                dlpkVar16.a |= 512;
                                break;
                        }
                        bK = bZ.bK();
                    } catch (UnsupportedEncodingException e3) {
                        throw new RuntimeException("Cannot parse ResourceDump.", e3);
                    }
                }
                dbsk.t(bK, "Resource may not be null");
                F.g(bK);
            }
            return F.f();
        } catch (RuntimeException e4) {
            dcdc<dlpk> e5 = dcdc.e();
            i(e4, e5);
            return e5;
        } finally {
            g(cursor);
        }
    }

    @dzsi
    public static avta e(Cursor cursor, boolean z) {
        int i2;
        if (cursor.getCount() == 0) {
            return null;
        }
        dvff bZ = dvfg.e.bZ();
        try {
            String string = cursor.getString(cursor.getColumnIndexOrThrow("regionId"));
            if (string == null) {
                bvoo.j(new NullPointerException());
                return null;
            }
            dspd P = dspd.P(string);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvfg dvfgVar = (dvfg) bZ.b;
            P.getClass();
            dvfgVar.a |= 1;
            dvfgVar.b = P;
            if (!cursor.isNull(cursor.getColumnIndexOrThrow("implicitRegion"))) {
                try {
                    byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow("implicitRegion"));
                    if (blob != null) {
                        dvfe dvfeVar = (dvfe) dsqw.cq(dvfe.d, blob);
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dvfg dvfgVar2 = (dvfg) bZ.b;
                        dvfeVar.getClass();
                        dvfgVar2.c = dvfeVar;
                        dvfgVar2.a |= 2;
                    }
                } catch (IOException e2) {
                    throw new RuntimeException("Cannot parse ImplicitRegionProto.", e2);
                }
            }
            try {
                byte[] blob2 = cursor.getBlob(cursor.getColumnIndexOrThrow("geometry"));
                int i3 = 4;
                if (blob2 != null) {
                    dlug dlugVar = (dlug) dsqw.cq(dlug.c, blob2);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dvfg dvfgVar3 = (dvfg) bZ.b;
                    dlugVar.getClass();
                    dvfgVar3.d = dlugVar;
                    dvfgVar3.a |= 4;
                }
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow("name"));
                dvfg bK = bZ.bK();
                avsx avsxVar = new avsx();
                avsxVar.e(0L);
                avsxVar.k(0);
                avsxVar.j(0);
                avsxVar.d(0L);
                avsxVar.i(0L);
                avsxVar.h(0L);
                avsxVar.o(0);
                avsxVar.l(0L);
                avsxVar.f(false);
                avsxVar.p(false);
                avsxVar.b(false);
                avsxVar.n(false);
                avsxVar.g(false);
                avsxVar.m(false);
                avsxVar.r(1);
                avsxVar.s = 1;
                avsxVar.t(bK);
                avsxVar.q = 0L;
                avsxVar.c = dbsj.e(string2);
                if ((bK.a & 2) != 0) {
                    dvfe dvfeVar2 = bK.c;
                    if (dvfeVar2 == null) {
                        dvfeVar2 = dvfe.d;
                    }
                    avsxVar.r(true != dvfeVar2.b ? 12 : 13);
                }
                int columnIndexOrThrow = cursor.getColumnIndexOrThrow("failureReason");
                if (!cursor.isNull(columnIndexOrThrow)) {
                    int i4 = cursor.getInt(columnIndexOrThrow);
                    if (i4 == 0) {
                        i2 = 1;
                    } else if (i4 == 1) {
                        i2 = 2;
                    } else if (i4 == 2) {
                        i2 = 3;
                    } else if (i4 == 3) {
                        i2 = 4;
                    } else if (i4 == 4) {
                        i2 = 5;
                    } else if (i4 != 5) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append("Unknown failure reason value: ");
                        sb.append(i4);
                        throw new IllegalStateException(sb.toString());
                    } else {
                        i2 = 6;
                    }
                    avsxVar.s = i2;
                }
                int i5 = cursor.getInt(cursor.getColumnIndexOrThrow("status"));
                switch (i5) {
                    case 0:
                        i3 = 1;
                        break;
                    case 1:
                        i3 = 2;
                        break;
                    case 2:
                        i3 = 3;
                        break;
                    case 3:
                        break;
                    case 4:
                        i3 = 5;
                        break;
                    case 5:
                        i3 = 6;
                        break;
                    case 6:
                        i3 = 7;
                        break;
                    case 7:
                        i3 = 8;
                        break;
                    case 8:
                        i3 = 9;
                        break;
                    case 9:
                        i3 = 10;
                        break;
                    case 10:
                        i3 = 11;
                        break;
                    case 11:
                        i3 = 12;
                        break;
                    case 12:
                        i3 = 13;
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder(33);
                        sb2.append("Unknown status value: ");
                        sb2.append(i5);
                        throw new IllegalStateException(sb2.toString());
                }
                avsxVar.r(i3);
                avsxVar.e(cursor.getLong(cursor.getColumnIndexOrThrow("expirationTimeMs")));
                byte[] blob3 = cursor.getBlob(cursor.getColumnIndexOrThrow("regionVersion"));
                if (blob3 != null) {
                    avsxVar.r = dspd.x(blob3);
                }
                avsxVar.l(cursor.getLong(cursor.getColumnIndexOrThrow("onDiskSize")));
                avsxVar.d(cursor.getLong(cursor.getColumnIndexOrThrow("estimatedSize")));
                avsxVar.h(cursor.getLong(cursor.getColumnIndexOrThrow("currentSize")));
                avsxVar.i(cursor.getLong(cursor.getColumnIndexOrThrow("estimatedBytesProcessed")));
                avsxVar.o(cursor.getInt(cursor.getColumnIndexOrThrow("totalNumFiles")));
                avsxVar.j(cursor.getInt(cursor.getColumnIndexOrThrow("numFilesToDownload")));
                avsxVar.k(cursor.getInt(cursor.getColumnIndexOrThrow("numFilesProcessed")));
                avsxVar.m(cursor.getInt(cursor.getColumnIndexOrThrow("overrideWifiOnlyForRegion")) != 0);
                avsxVar.f(cursor.getInt(cursor.getColumnIndexOrThrow("expiringNotificationShown")) != 0);
                avsxVar.p(cursor.getInt(cursor.getColumnIndexOrThrow("upcomingTripNotificationShown")) != 0);
                avsxVar.b(cursor.getInt(cursor.getColumnIndexOrThrow("currentTripNotificationShown")) != 0);
                avsxVar.n(cursor.getInt(cursor.getColumnIndexOrThrow("hasFailedProcessing")) != 0);
                avsxVar.g(z);
                dvfg s = avsxVar.s();
                if ((s.a & 2) != 0) {
                    dvfe dvfeVar3 = s.c;
                    if (dvfeVar3 == null) {
                        dvfeVar3 = dvfe.d;
                    }
                    boolean z2 = dvfeVar3.c & (avsxVar.q() != 8);
                    dsqp dsqpVar = (dsqp) dvfeVar3.cu(5);
                    dsqpVar.bC(dvfeVar3);
                    dvfd dvfdVar = (dvfd) dsqpVar;
                    if (dvfdVar.c) {
                        dvfdVar.bF();
                        dvfdVar.c = false;
                    }
                    dvfe dvfeVar4 = (dvfe) dvfdVar.b;
                    dvfeVar4.a |= 2;
                    dvfeVar4.c = z2;
                    dvfe bK2 = dvfdVar.bK();
                    dvfg s2 = avsxVar.s();
                    dsqp dsqpVar2 = (dsqp) s2.cu(5);
                    dsqpVar2.bC(s2);
                    dvff dvffVar = (dvff) dsqpVar2;
                    if (dvffVar.c) {
                        dvffVar.bF();
                        dvffVar.c = false;
                    }
                    dvfg dvfgVar4 = (dvfg) dvffVar.b;
                    bK2.getClass();
                    dvfgVar4.c = bK2;
                    dvfgVar4.a |= 2;
                    avsxVar.t(dvffVar.bK());
                }
                if (avsxVar.q() != 7) {
                    avsxVar.s = 1;
                }
                String str = avsxVar.a == null ? " descriptorInternal" : "";
                if (avsxVar.t == 0) {
                    str = str.concat(" status");
                }
                if (avsxVar.s == 0) {
                    str = String.valueOf(str).concat(" failureReason");
                }
                if (avsxVar.b == null) {
                    str = String.valueOf(str).concat(" expirationTimeMs");
                }
                if (avsxVar.c == null) {
                    str = String.valueOf(str).concat(" name");
                }
                if (avsxVar.d == null) {
                    str = String.valueOf(str).concat(" estimatedSizeInBytes");
                }
                if (avsxVar.e == null) {
                    str = String.valueOf(str).concat(" numEstimatedBytesDownloaded");
                }
                if (avsxVar.f == null) {
                    str = String.valueOf(str).concat(" numFilesDownloaded");
                }
                if (avsxVar.g == null) {
                    str = String.valueOf(str).concat(" numEstimatedBytesProcessed");
                }
                if (avsxVar.h == null) {
                    str = String.valueOf(str).concat(" numFilesProcessed");
                }
                if (avsxVar.i == null) {
                    str = String.valueOf(str).concat(" totalNumFiles");
                }
                if (avsxVar.j == null) {
                    str = String.valueOf(str).concat(" onDiskSizeInBytes");
                }
                if (avsxVar.k == null) {
                    str = String.valueOf(str).concat(" overrideWifiOnly");
                }
                if (avsxVar.l == null) {
                    str = String.valueOf(str).concat(" expiringSoonNotificationShown");
                }
                if (avsxVar.m == null) {
                    str = String.valueOf(str).concat(" upcomingTripNotificationShown");
                }
                if (avsxVar.n == null) {
                    str = String.valueOf(str).concat(" currentTripNotificationShown");
                }
                if (avsxVar.o == null) {
                    str = String.valueOf(str).concat(" processingFailed");
                }
                if (avsxVar.p == null) {
                    str = String.valueOf(str).concat(" inProcess");
                }
                if (avsxVar.q == null) {
                    str = String.valueOf(str).concat(" lastUsedMsSinceEpoch");
                }
                if (str.isEmpty()) {
                    return new avsy(avsxVar.a, avsxVar.t, avsxVar.s, avsxVar.b.longValue(), avsxVar.c, avsxVar.d.longValue(), avsxVar.e.longValue(), avsxVar.f.intValue(), avsxVar.g.longValue(), avsxVar.h.intValue(), avsxVar.i.intValue(), avsxVar.j.longValue(), avsxVar.k.booleanValue(), avsxVar.l.booleanValue(), avsxVar.m.booleanValue(), avsxVar.n.booleanValue(), avsxVar.o.booleanValue(), avsxVar.p.booleanValue(), avsxVar.q.longValue(), avsxVar.r);
                }
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            } catch (IOException e3) {
                throw new RuntimeException("Cannot parse RegionGeometry.", e3);
            }
        } catch (IOException e4) {
            throw new RuntimeException("Cannot parse region id.", e4);
        }
    }

    public static String f(dspd dspdVar) {
        try {
            return dspdVar.H("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("Cannot read id string.", e2);
        }
    }

    public static void g(Cursor cursor) {
        cursor.close();
    }

    public static <T> void i(RuntimeException runtimeException, T t) {
        if (runtimeException instanceof SQLiteDatabaseCorruptException) {
            return;
        }
        j(runtimeException);
    }

    private static <T> void j(RuntimeException runtimeException) {
        if (a.equals(runtimeException.getClass().getCanonicalName())) {
            return;
        }
        throw runtimeException;
    }

    public final dcdc<dlpk> c(avta avtaVar) {
        String str = true != avtaVar.p() ? "resourceToRegion" : "inProcessResourceToRegion";
        String[] strArr = {f(avtaVar.v())};
        SQLiteDatabase h2 = h();
        if (h2 == null) {
            return dcdc.e();
        }
        StringBuilder sb = new StringBuilder(str.length() + 80);
        sb.append("SELECT offlineResources.* FROM ");
        sb.append(str);
        sb.append(" NATURAL JOIN ");
        sb.append("offlineResources");
        sb.append(" WHERE ");
        sb.append("regionId = ?");
        return d(h2.rawQuery(sb.toString(), strArr));
    }

    @dzsi
    public final SQLiteDatabase h() {
        SQLiteDatabase a2;
        try {
            try {
                a2 = this.m.a();
            } catch (bvjv e2) {
                bvoq.a();
                bvoo.j(e2);
                a2 = this.m.a();
            }
            if (a2 == null) {
                return null;
            }
            if (a2.getVersion() != 30) {
                new Exception("Not a real exception - just for the stack trace.");
            }
            return a2;
        } catch (Exception e3) {
            bvoo.j(e3);
            return null;
        }
    }
}
