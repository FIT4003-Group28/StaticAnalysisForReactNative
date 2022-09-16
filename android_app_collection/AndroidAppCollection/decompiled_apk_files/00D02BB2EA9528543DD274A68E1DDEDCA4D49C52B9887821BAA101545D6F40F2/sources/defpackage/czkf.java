package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: czkf  reason: default package */
/* loaded from: classes5.dex */
public final class czkf implements czkt {
    public static final TimeUnit a = TimeUnit.MILLISECONDS;
    public final Context b;
    public final String c;
    public final Handler d;
    public final dbty<Integer> e;
    public final TimeUnit f;
    public final czmt g;
    private final defg<Uri, Set<String>> h;

    public czkf(czkc czkcVar) {
        this.b = czkcVar.a;
        this.h = czkcVar.b;
        this.c = czkcVar.c;
        this.d = czkcVar.d;
        this.e = czkcVar.e;
        this.f = czkcVar.f;
        this.g = czkcVar.g;
    }

    @Override // defpackage.czkt
    public final dehn<Void> a(final dehn<Uri> dehnVar, czjw czjwVar) {
        dbsk.s(czjwVar);
        final dehn g = deew.g(dehnVar, this.h, dege.a);
        return deha.m(dehnVar, g).a(new deff(this, dehnVar, g) { // from class: czjy
            private final czkf a;
            private final dehn b;
            private final dehn c;

            {
                this.a = this;
                this.b = dehnVar;
                this.c = g;
            }

            @Override // defpackage.deff
            public final dehn a() {
                czkf czkfVar = this.a;
                dehn dehnVar2 = this.b;
                dehn dehnVar3 = this.c;
                Uri uri = (Uri) deha.r(dehnVar2);
                Set<String> set = (Set) deha.r(dehnVar3);
                czke czkeVar = new czke(set);
                for (String str : set) {
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.libraries.storage.protostore.MULTI_APP");
                    intent.setData(uri);
                    intent.setPackage(str);
                    intent.setFlags(268435456);
                    czkfVar.b.sendOrderedBroadcast(intent, null, czkeVar, czkfVar.d, -1, null, null);
                }
                dbtp c = dbtp.c(dbpc.a);
                final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                Integer num = (Integer) ((dbuc) czkfVar.e).a;
                dehn g2 = deee.g(degp.q(czkeVar.a).r(num.intValue(), czkfVar.f, null), TimeoutException.class, new dbrn(atomicBoolean) { // from class: czka
                    private final AtomicBoolean a;

                    {
                        this.a = atomicBoolean;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        TimeoutException timeoutException = (TimeoutException) obj;
                        this.a.set(false);
                        return null;
                    }
                }, dege.a);
                deha.q(g2, new czkb(czkfVar, atomicBoolean, set, c, czkeVar, num), dege.a);
                return g2;
            }
        }, dege.a);
    }

    @Override // defpackage.czkt
    public final dehn<Void> b(dehn<Uri> dehnVar, final Runnable runnable, czjw czjwVar) {
        dbsk.s(czjwVar);
        return deew.h(dehnVar, new dbrn(this, runnable) { // from class: czjz
            private final czkf a;
            private final Runnable b;

            {
                this.a = this;
                this.b = runnable;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                czkf czkfVar = this.a;
                Runnable runnable2 = this.b;
                Uri uri = (Uri) obj;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.libraries.storage.protostore.MULTI_APP");
                intentFilter.addDataScheme(uri.getScheme());
                intentFilter.addDataPath(uri.getPath(), 0);
                intentFilter.addDataAuthority("*", null);
                czkfVar.b.registerReceiver(new czkd(runnable2), intentFilter, czkfVar.c, czkfVar.d);
                return null;
            }
        }, dege.a);
    }
}
