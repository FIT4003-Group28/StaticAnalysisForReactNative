package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: acrp  reason: default package */
/* loaded from: classes.dex */
public final class acrp implements acrr {
    public final afug a;
    public final acrs b;
    public final Optional c;
    private final afvn d;
    private final snc e;
    private final zah f;
    private final ykw g;

    public acrp(acrs acrsVar, afug afugVar, afvn afvnVar, snc sncVar, zah zahVar, ykw ykwVar, Optional optional) {
        this.a = afugVar;
        this.b = acrsVar;
        this.d = afvnVar;
        this.e = sncVar;
        this.f = zahVar;
        this.g = ykwVar;
        this.c = optional;
    }

    private final void i(String str) {
        String canonicalName = getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 33 + str.length());
        sb.append(canonicalName);
        sb.append(" could not generate ClientEvent: ");
        sb.append(str);
        zep.c("GEL_DELAYED_EVENT_DEBUG", sb.toString());
    }

    private final boolean j(arrh arrhVar, boolean z, long j, afvm afvmVar, afuq afuqVar) {
        String str;
        boolean z2;
        if (!this.b.a.c) {
            return false;
        }
        if (arrhVar == null) {
            i("Unspecified ClientEvent");
            return false;
        }
        arrg b = arrhVar.b();
        if (b == arrg.PAYLOAD_NOT_SET) {
            i("ClientEvent does not have one and only one payload set.");
            return false;
        }
        long c = this.e.c();
        acrs acrsVar = this.b;
        Long l = (Long) acrsVar.g.get(b);
        if (acrsVar.c.contains(b) || (l != null && c < l.longValue())) {
            return false;
        }
        if (j < 0) {
            j = c;
        }
        long a = this.f.a();
        if (afvmVar == null) {
            afvmVar = this.d.c();
        }
        String d = afvmVar.d();
        if (afuqVar == null) {
            str = this.d.g();
        } else {
            str = afuqVar.a;
        }
        if (afuqVar == null) {
            z2 = afvmVar.g();
        } else {
            z2 = afuqVar.b;
        }
        String valueOf = String.valueOf(b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
        sb.append("Pass GEL payload to delayed event service. Payload type: ");
        sb.append(valueOf);
        final String sb2 = sb.toString();
        ylx.i(afzk.a(), new ylw() { // from class: acrn
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                acrp acrpVar = acrp.this;
                String str2 = sb2;
                if (((Boolean) obj).booleanValue()) {
                    String.valueOf(acrpVar.getClass().getCanonicalName()).length();
                    String.valueOf(str2).length();
                }
            }
        });
        arrf arrfVar = (arrf) arrhVar.mo52toBuilder();
        arrfVar.copyOnWrite();
        ((arrh) arrfVar.instance).ct(j);
        aopa mo52toBuilder = arrhVar.e().mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        arri arriVar = (arri) mo52toBuilder.instance;
        arriVar.b |= 1;
        arriVar.c = a;
        arrfVar.copyOnWrite();
        ((arrh) arrfVar.instance).cj((arri) mo52toBuilder.mo39build());
        aopa createBuilder = oro.a.createBuilder();
        aoob byteString = ((arrh) arrfVar.mo39build()).toByteString();
        createBuilder.copyOnWrite();
        oro oroVar = (oro) createBuilder.instance;
        oroVar.b |= 4;
        oroVar.e = byteString;
        createBuilder.copyOnWrite();
        oro oroVar2 = (oro) createBuilder.instance;
        oroVar2.b |= 2;
        oroVar2.d = "event_logging";
        createBuilder.copyOnWrite();
        oro oroVar3 = (oro) createBuilder.instance;
        oroVar3.b |= 16;
        oroVar3.g = d;
        if (!TextUtils.isEmpty(str)) {
            createBuilder.copyOnWrite();
            oro oroVar4 = (oro) createBuilder.instance;
            str.getClass();
            oroVar4.b |= 128;
            oroVar4.j = str;
        }
        createBuilder.copyOnWrite();
        oro oroVar5 = (oro) createBuilder.instance;
        oroVar5.b |= 256;
        oroVar5.k = z2;
        if (z) {
            this.a.p(createBuilder);
            if (this.c.isPresent()) {
                ((Consumer) this.c.get()).accept((oro) createBuilder.mo39build());
            }
        } else {
            this.g.a(2, new acro(this, b, createBuilder));
        }
        return true;
    }

    @Override // defpackage.acrr
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.acrr
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.acrr
    public final boolean c(arrh arrhVar) {
        return j(arrhVar, false, -1L, null, null);
    }

    @Override // defpackage.acrr
    public final void d(arrh arrhVar, afvm afvmVar, long j, afuq afuqVar) {
        j(arrhVar, false, j, afvmVar, afuqVar);
    }

    @Override // defpackage.acrr
    public final void e(arrh arrhVar) {
        j(arrhVar, true, -1L, null, null);
    }

    @Override // defpackage.acrr
    public final void f(arrh arrhVar, long j) {
        j(arrhVar, false, j, null, null);
    }

    @Override // defpackage.acrr
    public final void g(arrh arrhVar, afvm afvmVar) {
        j(arrhVar, false, -1L, afvmVar, null);
    }

    @Override // defpackage.acrr
    public final void h(arrh arrhVar, afvm afvmVar, long j, afuq afuqVar) {
        j(arrhVar, true, j, afvmVar, afuqVar);
    }
}
