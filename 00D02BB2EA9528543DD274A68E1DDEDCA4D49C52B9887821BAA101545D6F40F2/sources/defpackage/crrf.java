package defpackage;

import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: crrf  reason: default package */
/* loaded from: classes5.dex */
public class crrf extends crpu {
    public final dpjl a;
    public final long c;
    public final TimeZone d;

    public crrf(dpjl dpjlVar, long j, TimeZone timeZone) {
        this.a = dpjlVar;
        this.c = j;
        this.d = timeZone;
    }

    @Override // defpackage.crqw
    public final crqv a() {
        return crqv.WAYPOINT_ALERT;
    }

    @Override // defpackage.crqw
    public final boolean b() {
        int a = dpjk.a(this.a.d);
        if (a != 0 && a == 6) {
            return false;
        }
        int a2 = dpjk.a(this.a.d);
        return a2 == 0 || a2 != 7;
    }

    @Override // defpackage.crqw
    public final boolean c() {
        return false;
    }
}
