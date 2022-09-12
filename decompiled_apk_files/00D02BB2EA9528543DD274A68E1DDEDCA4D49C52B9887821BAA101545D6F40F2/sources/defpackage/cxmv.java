package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cxmv  reason: default package */
/* loaded from: classes5.dex */
final class cxmv {
    public static final /* synthetic */ int a = 0;
    private static volatile Map<String, cxlc> b;
    private static volatile czkq d;
    private static final Object c = new Object();
    private static final Object e = new Object();
    private static final czms<cxmx> f = new czms<>(cxmx.h);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri a(Context context, String str, boolean z) {
        czik a2 = czil.a(context);
        a2.c("phenotype");
        a2.d(String.valueOf(str).concat(".pb"));
        if (z) {
            a2.b("directboot-files");
        }
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static czkm<cxmx> b(cxji cxjiVar, String str, boolean z) {
        czkn i = czko.i();
        i.e(a(cxjiVar.b, str, z));
        i.d(cxmx.h);
        i.c(f);
        i.b();
        return h(cxjiVar.b, cxjiVar.c()).a(i.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dehn<cxmx> c(cxji cxjiVar, String str, String str2) {
        return deew.h(cxjiVar.d().b(str, str2), cxmt.a, cxjiVar.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dehn<Void> d(cxji cxjiVar, String str, final cxmx cxmxVar, boolean z) {
        return b(cxjiVar, str, z).c(new dbrn(cxmxVar) { // from class: cxmu
            private final cxmx a;

            {
                this.a = cxmxVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cxmx cxmxVar2 = this.a;
                cxmx cxmxVar3 = (cxmx) obj;
                int i = cxmv.a;
                return cxmxVar2;
            }
        }, cxjiVar.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cxmx e(cxjy cxjyVar) {
        dspd dspdVar;
        cxmw bZ = cxmx.h.bZ();
        if (cxjyVar == null) {
            return bZ.bK();
        }
        for (cxka cxkaVar : cxjyVar.e) {
            cxmy bZ2 = cxmz.e.bZ();
            String str = cxkaVar.d;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            cxmz cxmzVar = (cxmz) bZ2.b;
            str.getClass();
            cxmzVar.a |= 1;
            cxmzVar.d = str;
            int i = cxkaVar.b;
            int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            int i3 = i2 - 1;
            if (i2 != 0) {
                if (i3 == 0) {
                    long longValue = i == 1 ? ((Long) cxkaVar.c).longValue() : 0L;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    cxmz cxmzVar2 = (cxmz) bZ2.b;
                    cxmzVar2.b = 2;
                    cxmzVar2.c = Long.valueOf(longValue);
                } else if (i3 == 1) {
                    boolean booleanValue = i == 2 ? ((Boolean) cxkaVar.c).booleanValue() : false;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    cxmz cxmzVar3 = (cxmz) bZ2.b;
                    cxmzVar3.b = 3;
                    cxmzVar3.c = Boolean.valueOf(booleanValue);
                } else if (i3 == 2) {
                    double doubleValue = i == 3 ? ((Double) cxkaVar.c).doubleValue() : dcyn.a;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    cxmz cxmzVar4 = (cxmz) bZ2.b;
                    cxmzVar4.b = 4;
                    cxmzVar4.c = Double.valueOf(doubleValue);
                } else if (i3 == 3) {
                    String str2 = i == 4 ? (String) cxkaVar.c : "";
                    cxmz cxmzVar5 = (cxmz) bZ2.b;
                    str2.getClass();
                    cxmzVar5.b = 5;
                    cxmzVar5.c = str2;
                } else if (i3 == 4) {
                    if (i == 5) {
                        dspdVar = (dspd) cxkaVar.c;
                    } else {
                        dspdVar = dspd.b;
                    }
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    cxmz cxmzVar6 = (cxmz) bZ2.b;
                    dspdVar.getClass();
                    cxmzVar6.b = 6;
                    cxmzVar6.c = dspdVar;
                } else {
                    throw new IllegalStateException("No known flag type");
                }
                cxmz bK = bZ2.bK();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cxmx cxmxVar = (cxmx) bZ.b;
                bK.getClass();
                cxmxVar.b();
                cxmxVar.g.add(bK);
            } else {
                throw null;
            }
        }
        String str3 = cxjyVar.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cxmx cxmxVar2 = (cxmx) bZ.b;
        str3.getClass();
        int i4 = 4 | cxmxVar2.a;
        cxmxVar2.a = i4;
        cxmxVar2.d = str3;
        String str4 = cxjyVar.b;
        str4.getClass();
        int i5 = 1 | i4;
        cxmxVar2.a = i5;
        cxmxVar2.b = str4;
        long j = cxjyVar.h;
        int i6 = i5 | 8;
        cxmxVar2.a = i6;
        cxmxVar2.e = j;
        if ((cxjyVar.a & 2) != 0) {
            dspd dspdVar2 = cxjyVar.c;
            dspdVar2.getClass();
            cxmxVar2.a = i6 | 2;
            cxmxVar2.c = dspdVar2;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cxmx cxmxVar3 = (cxmx) bZ.b;
        cxmxVar3.a |= 16;
        cxmxVar3.f = currentTimeMillis;
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcdn<String, Object> f(cxmx cxmxVar) {
        dspd dspdVar;
        HashMap f2 = dcjz.f(cxmxVar.g.size() + 3);
        for (cxmz cxmzVar : cxmxVar.g) {
            int i = cxmzVar.b;
            boolean z = false;
            int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0) {
                f2.put(cxmzVar.d, Long.valueOf(i == 2 ? ((Long) cxmzVar.c).longValue() : 0L));
            } else if (i3 == 1) {
                String str = cxmzVar.d;
                if (i == 3) {
                    z = ((Boolean) cxmzVar.c).booleanValue();
                }
                f2.put(str, Boolean.valueOf(z));
            } else if (i3 == 2) {
                f2.put(cxmzVar.d, Double.valueOf(i == 4 ? ((Double) cxmzVar.c).doubleValue() : dcyn.a));
            } else if (i3 == 3) {
                f2.put(cxmzVar.d, i == 5 ? (String) cxmzVar.c : "");
            } else if (i3 == 4) {
                String str2 = cxmzVar.d;
                if (i == 6) {
                    dspdVar = (dspd) cxmzVar.c;
                } else {
                    dspdVar = dspd.b;
                }
                f2.put(str2, dspdVar.G());
            }
        }
        f2.put("__phenotype_server_token", cxmxVar.d);
        f2.put("__phenotype_snapshot_token", cxmxVar.b);
        f2.put("__phenotype_configuration_version", Long.valueOf(cxmxVar.e));
        return dcdn.r(f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, cxlc> g(Context context) {
        String[] list;
        InputStream open;
        if (b == null) {
            synchronized (c) {
                if (b == null) {
                    b = new HashMap();
                    try {
                        for (String str : context.getAssets().list("phenotype")) {
                            try {
                                AssetManager assets = context.getAssets();
                                String valueOf = String.valueOf(str);
                                open = assets.open(valueOf.length() != 0 ? "phenotype/".concat(valueOf) : new String("phenotype/"));
                            } catch (dsrm unused) {
                                if (String.valueOf(str).length() == 0) {
                                    new String("Unable to read Phenotype PackageMetadata for ");
                                }
                            }
                            try {
                                cxlc cxlcVar = new cxlc(context, (cxle) dsqw.cs(cxle.e, open, dsqa.c()));
                                b.put(cxlcVar.a, cxlcVar);
                                if (open != null) {
                                    open.close();
                                }
                            } catch (Throwable th) {
                                if (open != null) {
                                    try {
                                        open.close();
                                    } catch (Throwable th2) {
                                        deki.a(th, th2);
                                    }
                                }
                                throw th;
                                break;
                            }
                        }
                    } catch (IOException unused2) {
                    }
                }
            }
        }
        return b;
    }

    private static synchronized czkq h(Context context, dehq dehqVar) {
        czkq czkqVar;
        synchronized (cxmv.class) {
            if (d == null) {
                synchronized (e) {
                    if (d == null) {
                        czif czifVar = new czif(Collections.singletonList(czii.i(context).a()));
                        czkr czkrVar = new czkr();
                        czkrVar.a = dehqVar;
                        czkrVar.b = czifVar;
                        czkrVar.b(czlw.a);
                        d = czkrVar.a();
                    }
                }
            }
            czkqVar = d;
        }
        return czkqVar;
    }
}
