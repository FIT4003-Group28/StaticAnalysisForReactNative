package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ujp  reason: default package */
/* loaded from: classes4.dex */
public final class ujp implements ujo {
    private final uhh a;
    private final ucs b;
    private final ufe c;
    private final ude d;
    private final ues e;

    public ujp(uhh uhhVar, ude udeVar, ucs ucsVar, ufe ufeVar, ues uesVar) {
        this.a = uhhVar;
        this.d = udeVar;
        this.b = ucsVar;
        this.c = ufeVar;
        this.e = uesVar;
    }

    @Override // defpackage.ujo
    public final void a(ubz ubzVar) {
        for (ucp ucpVar : this.b.c()) {
            amzt listIterator = ((amuk) this.d.a(ucpVar.b)).listIterator();
            while (listIterator.hasNext()) {
                this.a.c(ucpVar, (ucw) listIterator.next(), true, true, ubzVar, null, null);
            }
        }
        amzt listIterator2 = ((amuk) this.d.a(null)).listIterator();
        while (listIterator2.hasNext()) {
            this.a.c(null, (ucw) listIterator2.next(), true, true, ubzVar, null, null);
        }
    }

    @Override // defpackage.ujo
    public final void b() {
        for (ucp ucpVar : this.b.c()) {
            c(ucpVar);
        }
        c(null);
    }

    public final void c(ucp ucpVar) {
        List a = this.d.a(ucpVar == null ? null : ucpVar.b);
        if (!a.isEmpty()) {
            ufe ufeVar = this.c;
            uea l = ueb.l();
            l.f(uec.API);
            l.h(1);
            l.a = "com.google.android.libraries.notifications.NOTIFICATION_DISMISSED";
            l.b = ucpVar;
            l.b(a);
            aopa createBuilder = aomr.a.createBuilder();
            createBuilder.copyOnWrite();
            aomr aomrVar = (aomr) createBuilder.instance;
            aomrVar.f = 2;
            aomrVar.b |= 8;
            createBuilder.copyOnWrite();
            aomr aomrVar2 = (aomr) createBuilder.instance;
            aomrVar2.e = 2;
            aomrVar2.b |= 4;
            l.g((aomr) createBuilder.mo39build());
            l.e(aojl.DISMISSED_BY_API);
            ufeVar.b(l.a());
            uep a2 = this.e.a(aojw.DISMISSED_BY_API);
            a2.d(ucpVar);
            a2.c(a);
            a2.i();
        }
    }
}
