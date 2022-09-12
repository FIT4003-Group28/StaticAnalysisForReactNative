package defpackage;
/* compiled from: PG */
/* renamed from: duiw  reason: default package */
/* loaded from: classes6.dex */
public final class duiw {
    public final duic a;

    public duiw(duic duicVar) {
        this.a = duicVar;
    }

    public static duiv a(duic duicVar) {
        return new duiv(duicVar);
    }

    public final duio b(String str, @dzsi duhx duhxVar, duhv duhvVar, @dzsi String str2, @dzsi duiu duiuVar) {
        dbsk.a(true);
        if (duhvVar.h() == -1 || duhvVar.h() >= 0) {
            return new duim(str, "POST", duhxVar, duhvVar, str2, this.a, duiuVar, false);
        }
        return new duih(str, duhxVar, duhvVar, str2, this.a);
    }
}
