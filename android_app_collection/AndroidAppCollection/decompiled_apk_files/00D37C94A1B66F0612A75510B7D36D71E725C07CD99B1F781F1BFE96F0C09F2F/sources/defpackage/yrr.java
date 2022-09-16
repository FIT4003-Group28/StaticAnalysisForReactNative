package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
/* compiled from: PG */
/* renamed from: yrr  reason: default package */
/* loaded from: classes4.dex */
public final class yrr {
    private static final List a = new CopyOnWriteArrayList();
    private final Context b;
    private final yrq c;
    private final int d;

    public yrr(yme ymeVar, Context context, ExecutorService executorService, ExecutorService executorService2) {
        this.b = context;
        apfo apfoVar = ymeVar.a().d;
        int b = apfb.b((apfoVar == null ? apfo.a : apfoVar).g);
        b = b == 0 ? 2 : b;
        this.d = b == 2 ? 8 : b;
        if (ymeVar.c().i) {
            this.c = new yrq(executorService2);
        } else {
            this.c = new yrq(executorService);
        }
    }

    private static List b(CronetProvider cronetProvider, CronetProvider cronetProvider2, CronetProvider cronetProvider3) {
        ArrayList arrayList = new ArrayList(4);
        if (cronetProvider != null) {
            arrayList.add(cronetProvider);
        }
        if (cronetProvider2 != null) {
            arrayList.add(cronetProvider2);
        }
        if (cronetProvider3 != null) {
            arrayList.add(cronetProvider3);
        }
        return arrayList;
    }

    private final synchronized void c() {
        if (a.isEmpty()) {
            int i = this.d - 1;
            boolean z = false;
            boolean z2 = (i == 4 || i == 5 || i == 7) ? false : true;
            if (z2) {
                this.c.c(this.b);
            }
            int i2 = this.d - 1;
            boolean z3 = (i2 == 4 || i2 == 6) ? false : true;
            if (i2 != 5 && i2 != 6) {
                z = true;
            }
            CronetProvider cronetProvider = null;
            CronetProvider cronetProvider2 = null;
            CronetProvider cronetProvider3 = null;
            for (CronetProvider cronetProvider4 : CronetProvider.getAllProviders(this.b)) {
                if (cronetProvider4 != null) {
                    String name = cronetProvider4.getName();
                    if (z3 && name.equals(CronetProvider.PROVIDER_NAME_APP_PACKAGED)) {
                        cronetProvider = cronetProvider4;
                    } else if (z && name.equals(CronetProvider.PROVIDER_NAME_FALLBACK)) {
                        cronetProvider3 = cronetProvider4;
                    } else if (z2 && name.equals("Google-Play-Services-Cronet-Provider")) {
                        cronetProvider2 = cronetProvider4;
                    }
                }
            }
            int i3 = this.d - 1;
            if (i3 == 1 || i3 == 3 || i3 == 8) {
                a.addAll(b(cronetProvider, cronetProvider2, cronetProvider3));
            } else {
                a.addAll(b(cronetProvider2, cronetProvider, cronetProvider3));
            }
        }
    }

    public final CronetEngine a(yjd yjdVar) {
        List list = a;
        if (list.isEmpty()) {
            c();
        }
        CronetEngine cronetEngine = null;
        if (this.d == 4) {
            Object a2 = this.c.d() ? yjdVar.a(new ExperimentalCronetEngine.Builder(this.b), "AutoSelect") : null;
            if (a2 != null) {
                return (CronetEngine) a2;
            }
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CronetProvider cronetProvider = (CronetProvider) it.next();
            if (!cronetProvider.getName().equals("Google-Play-Services-Cronet-Provider") || this.c.d()) {
                String name = cronetProvider.getName();
                String version = cronetProvider.getVersion();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 18 + String.valueOf(version).length());
                sb.append("CronetProvider: ");
                sb.append(name);
                sb.append(", ");
                sb.append(version);
                Object a3 = yjdVar.a((ExperimentalCronetEngine.Builder) cronetProvider.createBuilder(), sb.toString());
                if (a3 != null) {
                    cronetEngine = a3;
                    break;
                }
            }
        }
        return cronetEngine;
    }
}
