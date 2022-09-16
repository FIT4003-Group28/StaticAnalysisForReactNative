package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bha  reason: default package */
/* loaded from: classes2.dex */
public final class bha {
    final bgj a;
    final int b;
    final bhc c;
    final List d;
    public final WeakReference e;
    private final bhc g;
    private final bhc h;
    public ankt f = null;
    private boolean i = false;
    private boolean j = false;

    public bha(bgw bgwVar, bhc bhcVar, bgj bgjVar, int i, bhc bhcVar2, Collection collection) {
        ArrayList arrayList = null;
        this.e = new WeakReference(bgwVar);
        this.c = bhcVar;
        this.a = bgjVar;
        this.b = i;
        this.g = bgwVar.s;
        this.h = bhcVar2;
        this.d = collection != null ? new ArrayList(collection) : arrayList;
        bgwVar.m.postDelayed(new bgy(this), 15000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (this.i || this.j) {
            return;
        }
        this.j = true;
        bgj bgjVar = this.a;
        if (bgjVar == null) {
            return;
        }
        bgjVar.i(0);
        this.a.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        ankt anktVar;
        bhd.c();
        if (this.i || this.j) {
            return;
        }
        bgw bgwVar = (bgw) this.e.get();
        if (bgwVar != null && bgwVar.A == this && ((anktVar = this.f) == null || !anktVar.isCancelled())) {
            this.i = true;
            bgwVar.A = null;
            bgw bgwVar2 = (bgw) this.e.get();
            if (bgwVar2 != null) {
                bhc bhcVar = bgwVar2.s;
                bhc bhcVar2 = this.g;
                if (bhcVar == bhcVar2) {
                    bgwVar2.m.b(263, bhcVar2, this.b);
                    bgj bgjVar = bgwVar2.t;
                    if (bgjVar != null) {
                        bgjVar.i(this.b);
                        bgwVar2.t.a();
                    }
                    if (!bgwVar2.w.isEmpty()) {
                        for (bgj bgjVar2 : bgwVar2.w.values()) {
                            bgjVar2.i(this.b);
                            bgjVar2.a();
                        }
                        bgwVar2.w.clear();
                    }
                    bgwVar2.t = null;
                }
            }
            bgw bgwVar3 = (bgw) this.e.get();
            if (bgwVar3 == null) {
                return;
            }
            bhc bhcVar3 = this.c;
            bgwVar3.s = bhcVar3;
            bgwVar3.t = this.a;
            bhc bhcVar4 = this.h;
            if (bhcVar4 == null) {
                bgwVar3.m.b(262, new jj(this.g, bhcVar3), this.b);
            } else {
                bgwVar3.m.b(264, new jj(bhcVar4, bhcVar3), this.b);
            }
            bgwVar3.w.clear();
            bgwVar3.h();
            bgwVar3.m();
            List list = this.d;
            if (list == null) {
                return;
            }
            bgwVar3.s.h(list);
            return;
        }
        a();
    }
}
