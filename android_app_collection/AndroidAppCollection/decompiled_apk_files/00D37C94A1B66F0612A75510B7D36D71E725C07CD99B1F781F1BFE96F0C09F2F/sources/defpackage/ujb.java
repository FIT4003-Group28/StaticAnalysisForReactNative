package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: ujb  reason: default package */
/* loaded from: classes4.dex */
public final class ujb implements ugk {
    private final ucs a;
    private final snc b;
    private final ampq c;
    private final uhz d;
    private final ugx e;

    public ujb(ucs ucsVar, uhz uhzVar, snc sncVar, ampq ampqVar, ugx ugxVar) {
        this.a = ucsVar;
        this.b = sncVar;
        this.c = ampqVar;
        this.d = uhzVar;
        this.e = ugxVar;
    }

    public static int c(aolb aolbVar) {
        aopa mo52toBuilder = aolbVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        aolb aolbVar2 = (aolb) mo52toBuilder.instance;
        aolbVar2.h = null;
        aolbVar2.b &= -33;
        return ((aolb) mo52toBuilder.mo39build()).hashCode();
    }

    @Override // defpackage.ugk
    public final void a(String str, aoqu aoquVar, Throwable th) {
        uev.g("StoreTargetCallback", "Registration finished for account: %s (FAILURE).", str);
        try {
            ucl b = this.a.b(str).b();
            b.d(ubx.FAILED_REGISTRATION);
            this.a.e(b.a());
            ((agax) ((ampv) this.c).a).a(th);
        } catch (ucr unused) {
        }
    }

    @Override // defpackage.ugk
    public final void b(String str, aoqu aoquVar, aoqu aoquVar2) {
        uev.e("StoreTargetCallback", "Registration finished for account: %s (SUCCESS).", str);
        aolb aolbVar = (aolb) aoquVar;
        aolc aolcVar = (aolc) aoquVar2;
        try {
            ucp b = this.a.b(str);
            ucl b2 = b.b();
            b2.c(c(aolbVar));
            b2.d(ubx.REGISTERED);
            b2.e = Long.valueOf(this.b.c());
            if (aolcVar.d != 0 && b.h == 0 && b.i.longValue() == 0) {
                b2.f = Long.valueOf(aolcVar.d);
            }
            if ((aolcVar.b & 4) != 0) {
                b2.b = aolcVar.c;
            } else if (TextUtils.isEmpty(b.c)) {
                try {
                    b2.b = this.d.a(str);
                } catch (Exception e) {
                    uev.c("StoreTargetCallback", e, "Failed to get the obfuscated account ID for: %s", str);
                }
            }
            ucp a = b2.a();
            this.a.e(a);
            ((agax) ((ampv) this.c).a).b();
            aomi a2 = aomi.a(aolbVar.c);
            if (a2 == null) {
                a2 = aomi.REGISTRATION_REASON_UNSPECIFIED;
            }
            if (a2 != aomi.LOCALE_CHANGED) {
                return;
            }
            this.e.b(a, aomb.LOCALE_CHANGED);
        } catch (ucr unused) {
        }
    }
}
