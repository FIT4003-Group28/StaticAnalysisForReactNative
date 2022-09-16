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
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bhz  reason: default package */
/* loaded from: classes2.dex */
public final class bhz {
    public final Context a;
    final bhy b;
    public boolean d;
    private final PackageManager g;
    private final ArrayList h = new ArrayList();
    public final BroadcastReceiver e = new bhw(this);
    public final Runnable f = new bhx(this);
    public final Handler c = new Handler();

    public bhz(Context context, bhy bhyVar) {
        this.a = context;
        this.b = bhyVar;
        this.g = context.getPackageManager();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        int i;
        if (!this.d) {
            return;
        }
        ArrayList<ServiceInfo> arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 30) {
            Intent intent = new Intent("android.media.MediaRoute2ProviderService");
            ArrayList arrayList2 = new ArrayList();
            for (ResolveInfo resolveInfo : this.g.queryIntentServices(intent, 0)) {
                arrayList2.add(resolveInfo.serviceInfo);
            }
            arrayList = arrayList2;
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
                if (bhd.e() && !arrayList.isEmpty()) {
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
                    bhu bhuVar = (bhu) this.h.get(i4);
                    if (bhuVar.a.getPackageName().equals(str) && bhuVar.a.getClassName().equals(str2)) {
                        i3 = i4;
                        break;
                    }
                    i4++;
                }
                if (i3 < 0) {
                    bhu bhuVar2 = new bhu(this.a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                    bhuVar2.n = new bhv(this);
                    bhuVar2.n();
                    i = i2 + 1;
                    this.h.add(i2, bhuVar2);
                    this.b.g(bhuVar2);
                } else if (i3 >= i2) {
                    bhu bhuVar3 = (bhu) this.h.get(i3);
                    bhuVar3.n();
                    if (bhuVar3.d == null && bhuVar3.q()) {
                        bhuVar3.o();
                        bhuVar3.f();
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
            bhu bhuVar4 = (bhu) this.h.get(size2);
            bgw bgwVar = (bgw) this.b;
            bhb b = bgwVar.b(bhuVar4);
            if (b != null) {
                bhuVar4.jK(null);
                bhuVar4.jM(null);
                bgwVar.n(b, null);
                bgwVar.m.a(514, b);
                bgwVar.j.remove(b);
            }
            this.h.remove(bhuVar4);
            bhuVar4.n = null;
            if (bhuVar4.c) {
                bhuVar4.c = false;
                bhuVar4.p();
            }
        }
    }
}
