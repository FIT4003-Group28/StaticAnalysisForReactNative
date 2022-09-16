package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: vdq  reason: default package */
/* loaded from: classes4.dex */
public final class vdq {
    public static final /* synthetic */ int a = 0;
    private static volatile Map b;
    private static volatile vlk d;
    private static final Object c = new Object();
    private static final Object e = new Object();
    private static final vnj f = new vnj(vdr.a);

    public static vdr a(vbw vbwVar) {
        aoob aoobVar;
        aopa createBuilder = vdr.a.createBuilder();
        if (vbwVar == null) {
            return (vdr) createBuilder.mo39build();
        }
        for (vbx vbxVar : vbwVar.f) {
            aopa createBuilder2 = vds.a.createBuilder();
            String str = vbxVar.e;
            createBuilder2.copyOnWrite();
            vds vdsVar = (vds) createBuilder2.instance;
            str.getClass();
            vdsVar.b |= 1;
            vdsVar.e = str;
            int i = vbxVar.c;
            boolean z = false;
            int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            int i3 = i2 - 1;
            if (i2 != 0) {
                if (i3 == 0) {
                    long longValue = i == 1 ? ((Long) vbxVar.d).longValue() : 0L;
                    createBuilder2.copyOnWrite();
                    vds vdsVar2 = (vds) createBuilder2.instance;
                    vdsVar2.c = 2;
                    vdsVar2.d = Long.valueOf(longValue);
                } else if (i3 == 1) {
                    if (i == 2) {
                        z = ((Boolean) vbxVar.d).booleanValue();
                    }
                    createBuilder2.copyOnWrite();
                    vds vdsVar3 = (vds) createBuilder2.instance;
                    vdsVar3.c = 3;
                    vdsVar3.d = Boolean.valueOf(z);
                } else if (i3 == 2) {
                    double doubleValue = i == 3 ? ((Double) vbxVar.d).doubleValue() : 0.0d;
                    createBuilder2.copyOnWrite();
                    vds vdsVar4 = (vds) createBuilder2.instance;
                    vdsVar4.c = 4;
                    vdsVar4.d = Double.valueOf(doubleValue);
                } else if (i3 == 3) {
                    String str2 = i == 4 ? (String) vbxVar.d : "";
                    createBuilder2.copyOnWrite();
                    vds vdsVar5 = (vds) createBuilder2.instance;
                    str2.getClass();
                    vdsVar5.c = 5;
                    vdsVar5.d = str2;
                } else if (i3 == 4) {
                    if (i == 5) {
                        aoobVar = (aoob) vbxVar.d;
                    } else {
                        aoobVar = aoob.b;
                    }
                    createBuilder2.copyOnWrite();
                    vds vdsVar6 = (vds) createBuilder2.instance;
                    aoobVar.getClass();
                    vdsVar6.c = 6;
                    vdsVar6.d = aoobVar;
                } else {
                    throw new IllegalStateException("No known flag type");
                }
                vds vdsVar7 = (vds) createBuilder2.mo39build();
                createBuilder.copyOnWrite();
                vdr vdrVar = (vdr) createBuilder.instance;
                vdsVar7.getClass();
                aopu aopuVar = vdrVar.h;
                if (!aopuVar.c()) {
                    vdrVar.h = aopi.mutableCopy(aopuVar);
                }
                vdrVar.h.add(vdsVar7);
            } else {
                throw null;
            }
        }
        String str3 = vbwVar.e;
        createBuilder.copyOnWrite();
        vdr vdrVar2 = (vdr) createBuilder.instance;
        str3.getClass();
        vdrVar2.b = 4 | vdrVar2.b;
        vdrVar2.e = str3;
        String str4 = vbwVar.c;
        createBuilder.copyOnWrite();
        vdr vdrVar3 = (vdr) createBuilder.instance;
        str4.getClass();
        vdrVar3.b = 1 | vdrVar3.b;
        vdrVar3.c = str4;
        long j = vbwVar.i;
        createBuilder.copyOnWrite();
        vdr vdrVar4 = (vdr) createBuilder.instance;
        vdrVar4.b |= 8;
        vdrVar4.f = j;
        if ((vbwVar.b & 2) != 0) {
            aoob aoobVar2 = vbwVar.d;
            createBuilder.copyOnWrite();
            vdr vdrVar5 = (vdr) createBuilder.instance;
            aoobVar2.getClass();
            vdrVar5.b |= 2;
            vdrVar5.d = aoobVar2;
        }
        long currentTimeMillis = System.currentTimeMillis();
        createBuilder.copyOnWrite();
        vdr vdrVar6 = (vdr) createBuilder.instance;
        vdrVar6.b |= 16;
        vdrVar6.g = currentTimeMillis;
        return (vdr) createBuilder.mo39build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static vlk b(Context context, ankx ankxVar) {
        vlk vlkVar = d;
        if (vlkVar == null) {
            synchronized (e) {
                vlkVar = d;
                if (vlkVar == null) {
                    vjb vjbVar = new vjb(Collections.singletonList(vje.q(context).a()));
                    vll vllVar = new vll();
                    vllVar.a = ankxVar;
                    vllVar.b = vjbVar;
                    vllVar.b(vmo.a);
                    vlk a2 = vllVar.a();
                    d = a2;
                    vlkVar = a2;
                }
            }
        }
        return vlkVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amup c(vdr vdrVar) {
        aoob aoobVar;
        HashMap k = amxp.k(vdrVar.h.size() + 3);
        for (vds vdsVar : vdrVar.h) {
            int i = vdsVar.c;
            boolean z = false;
            int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0) {
                k.put(vdsVar.e, Long.valueOf(i == 2 ? ((Long) vdsVar.d).longValue() : 0L));
            } else if (i3 == 1) {
                String str = vdsVar.e;
                if (i == 3) {
                    z = ((Boolean) vdsVar.d).booleanValue();
                }
                k.put(str, Boolean.valueOf(z));
            } else if (i3 == 2) {
                k.put(vdsVar.e, Double.valueOf(i == 4 ? ((Double) vdsVar.d).doubleValue() : 0.0d));
            } else if (i3 == 3) {
                k.put(vdsVar.e, i == 5 ? (String) vdsVar.d : "");
            } else if (i3 == 4) {
                String str2 = vdsVar.e;
                if (i == 6) {
                    aoobVar = (aoob) vdsVar.d;
                } else {
                    aoobVar = aoob.b;
                }
                k.put(str2, aoobVar.I());
            }
        }
        k.put("__phenotype_server_token", vdrVar.e);
        k.put("__phenotype_snapshot_token", vdrVar.c);
        k.put("__phenotype_configuration_version", Long.valueOf(vdrVar.f));
        return amup.j(k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ankt d(vbk vbkVar, String str, String str2) {
        return anii.h(vbkVar.d().b(str, str2), uag.q, vbkVar.c());
    }

    public static ankt e(vbk vbkVar, String str, String str2, final vdr vdrVar, boolean z) {
        return g(vbkVar, str, str2, z).b(new ampg() { // from class: vdp
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                vdr vdrVar2 = vdr.this;
                vdr vdrVar3 = (vdr) obj;
                int i = vdq.a;
                return vdrVar2;
            }
        }, vbkVar.c());
    }

    public static Map f(Context context) {
        String[] list;
        InputStream open;
        Map map = b;
        if (map == null) {
            synchronized (c) {
                map = b;
                if (map == null) {
                    amum h = amup.h();
                    try {
                        for (String str : context.getAssets().list("phenotype")) {
                            try {
                                AssetManager assets = context.getAssets();
                                String valueOf = String.valueOf(str);
                                open = assets.open(valueOf.length() != 0 ? "phenotype/".concat(valueOf) : new String("phenotype/"));
                            } catch (aopx e2) {
                                String valueOf2 = String.valueOf(str);
                                Log.e("SnapshotHandler", valueOf2.length() != 0 ? "Unable to read Phenotype PackageMetadata for ".concat(valueOf2) : new String("Unable to read Phenotype PackageMetadata for "), e2);
                            }
                            try {
                                vcp vcpVar = new vcp(context, (vcq) aopi.parseFrom(vcq.a, open, aoos.b()));
                                h.f(vcpVar.a, vcpVar);
                                if (open != null) {
                                    open.close();
                                }
                            } catch (Throwable th) {
                                if (open != null) {
                                    try {
                                        open.close();
                                    } catch (Throwable unused) {
                                    }
                                }
                                throw th;
                                break;
                            }
                        }
                    } catch (IOException e3) {
                        Log.e("SnapshotHandler", "Unable to read Phenotype PackageMetadata from assets.", e3);
                    }
                    amup b2 = h.b();
                    b = b2;
                    map = b2;
                }
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static vne g(vbk vbkVar, String str, String str2, boolean z) {
        vli a2 = vlj.a();
        vjf a3 = vjg.a(vbkVar.g);
        a3.e("phenotype");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(str2);
        sb.append(".pb");
        a3.f(sb.toString());
        if (z && sre.f()) {
            a3.d("directboot-files");
        }
        a2.f(a3.a());
        a2.e(vdr.a);
        a2.d(f);
        a2.c();
        return b(vbkVar.g, vbkVar.c()).a(a2.a());
    }
}
