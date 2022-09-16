package defpackage;

import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bgr  reason: default package */
/* loaded from: classes2.dex */
public final class bgr {
    final /* synthetic */ bgw a;

    public bgr(bgw bgwVar) {
        this.a = bgwVar;
    }

    public final void a(bgg bggVar, bga bgaVar, Collection collection) {
        bgw bgwVar = this.a;
        if (bggVar != bgwVar.v || bgaVar == null) {
            if (bggVar != bgwVar.t) {
                return;
            }
            if (bgaVar != null) {
                bgwVar.a(bgwVar.s, bgaVar);
            }
            this.a.s.h(collection);
            return;
        }
        bhb bhbVar = bgwVar.u.a;
        String n = bgaVar.n();
        bhc bhcVar = new bhc(bhbVar, n, this.a.f(bhbVar, n));
        bhcVar.b(bgaVar);
        bgw bgwVar2 = this.a;
        if (bgwVar2.s == bhcVar) {
            return;
        }
        bgwVar2.i(bgwVar2, bhcVar, bgwVar2.v, 3, bgwVar2.u, collection);
        bgw bgwVar3 = this.a;
        bgwVar3.u = null;
        bgwVar3.v = null;
    }
}
