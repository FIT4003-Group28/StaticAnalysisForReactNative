package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
/* compiled from: PG */
/* renamed from: asz  reason: default package */
/* loaded from: classes2.dex */
public final class asz {
    public final Context a;
    final asy b;
    public boolean d;
    private final PackageManager g;
    private final ArrayList<ast> h = new ArrayList<>();
    public final BroadcastReceiver e = new asw(this);
    public final Runnable f = new asx(this);
    public final Handler c = new Handler();

    public asz(Context context, asy asyVar) {
        this.a = context;
        this.b = asyVar;
        this.g = context.getPackageManager();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        int i;
        if (!this.d) {
            return;
        }
        List<ServiceInfo> arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 30) {
            arrayList = (List) this.g.queryIntentServices(new Intent("android.media.MediaRoute2ProviderService"), 0).stream().map(asv.a).collect(Collectors.toList());
        }
        Iterator<ResolveInfo> it = this.g.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
        int i2 = 0;
        while (true) {
            int i3 = -1;
            if (!it.hasNext()) {
                break;
            }
            ServiceInfo serviceInfo = it.next().serviceInfo;
            if (serviceInfo != null) {
                if (arv.a != null && arv.a.b && arrayList != null && !arrayList.isEmpty()) {
                    for (ServiceInfo serviceInfo2 : arrayList) {
                        if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                        }
                    }
                }
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                int size = this.h.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        break;
                    }
                    ast astVar = this.h.get(i4);
                    if (astVar.a.getPackageName().equals(str) && astVar.a.getClassName().equals(str2)) {
                        i3 = i4;
                        break;
                    }
                    i4++;
                }
                if (i3 < 0) {
                    ast astVar2 = new ast(this.a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                    astVar2.o = new asu(this);
                    astVar2.e();
                    i = i2 + 1;
                    this.h.add(i2, astVar2);
                    this.b.e(astVar2);
                } else if (i3 >= i2) {
                    ast astVar3 = this.h.get(i3);
                    astVar3.e();
                    if (astVar3.m == null && astVar3.j()) {
                        astVar3.l();
                        astVar3.k();
                    }
                    i = i2 + 1;
                    Collections.swap(this.h, i3, i2);
                }
                i2 = i;
            }
        }
        if (i2 >= this.h.size()) {
            return;
        }
        for (int size2 = this.h.size() - 1; size2 >= i2; size2--) {
            ast astVar4 = this.h.get(size2);
            arm armVar = (arm) this.b;
            arp f = armVar.f(astVar4);
            if (f != null) {
                astVar4.Nb(null);
                astVar4.Nc(null);
                armVar.g(f, null);
                armVar.h.a(514, f);
                armVar.g.remove(f);
            }
            this.h.remove(astVar4);
            astVar4.o = null;
            if (astVar4.d) {
                astVar4.d = false;
                astVar4.f();
            }
        }
    }
}
