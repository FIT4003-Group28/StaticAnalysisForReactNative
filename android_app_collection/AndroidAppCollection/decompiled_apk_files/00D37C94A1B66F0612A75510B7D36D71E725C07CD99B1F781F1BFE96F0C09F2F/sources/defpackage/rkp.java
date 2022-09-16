package defpackage;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rkp  reason: default package */
/* loaded from: classes4.dex */
public final class rkp implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ rks f;

    public rkp(rks rksVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f = rksVar;
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rlf h = this.f.w.h();
        if (h.m()) {
            rks rksVar = this.f;
            if (rksVar.a == 0) {
                rjp J2 = rksVar.J();
                if (J2.b == null) {
                    synchronized (J2) {
                        if (J2.b == null) {
                            ApplicationInfo applicationInfo = J2.I().getApplicationInfo();
                            String a = qyl.a();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                J2.b = Boolean.valueOf(str != null && str.equals(a));
                            }
                            if (J2.b == null) {
                                J2.b = Boolean.TRUE;
                                J2.aG().c.a("My process not in the list of running processes");
                            }
                        }
                    }
                }
                if (J2.b.booleanValue()) {
                    rks rksVar2 = this.f;
                    rksVar2.P();
                    rksVar2.a = 'C';
                } else {
                    rks rksVar3 = this.f;
                    rksVar3.P();
                    rksVar3.a = 'c';
                }
            }
            rks rksVar4 = this.f;
            if (rksVar4.b < 0) {
                rksVar4.J().y();
                rksVar4.b = 43009L;
            }
            char charAt = "01VDIWEA?".charAt(this.a);
            rks rksVar5 = this.f;
            char c = rksVar5.a;
            long j = rksVar5.b;
            String b = rks.b(true, this.b, this.c, this.d, this.e);
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(c);
            sb.append(j);
            sb.append(":");
            sb.append(b);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.b.substring(0, 1024);
            }
            rld rldVar = h.c;
            if (rldVar == null) {
                return;
            }
            rldVar.e.n();
            if (rldVar.a() == 0) {
                rldVar.b();
            }
            if (sb2 == null) {
                sb2 = "";
            }
            long j2 = rldVar.e.a().getLong(rldVar.b, 0L);
            if (j2 <= 0) {
                SharedPreferences.Editor edit = rldVar.e.a().edit();
                edit.putString(rldVar.c, sb2);
                edit.putLong(rldVar.b, 1L);
                edit.apply();
                return;
            }
            long nextLong = rldVar.e.N().B().nextLong();
            long j3 = j2 + 1;
            SharedPreferences.Editor edit2 = rldVar.e.a().edit();
            if ((Long.MAX_VALUE & nextLong) < Long.MAX_VALUE / j3) {
                edit2.putString(rldVar.c, sb2);
            }
            edit2.putLong(rldVar.b, j3);
            edit2.apply();
            return;
        }
        this.f.g(6, "Persisted config not initialized. Not logging error/warn");
    }
}
