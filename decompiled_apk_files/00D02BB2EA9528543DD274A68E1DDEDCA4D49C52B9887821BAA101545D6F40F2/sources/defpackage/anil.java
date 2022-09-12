package defpackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: anil  reason: default package */
/* loaded from: classes2.dex */
public final class anil<K, V> {
    public final anij<K, V> a;
    public final LinkedList<anik<K, V>> b;
    public final List<aniw> c;
    public int d;
    public final anii e;
    private final anix f;

    public anil(anix anixVar, anij anijVar, anii aniiVar) {
        dbsk.a(true);
        this.f = anixVar;
        this.a = anijVar;
        this.b = new LinkedList<>();
        this.e = aniiVar;
        this.c = new ArrayList();
        this.d = -1;
    }

    private final void h(anik<K, V> anikVar) {
        for (aniw aniwVar : this.c) {
            eapy eapyVar = (eapy) anikVar.a();
            ((anjl) anikVar.b()).f();
        }
    }

    private final anik<K, V> i(K k) {
        return anik.c(k, this.a.a(k));
    }

    public final boolean a() {
        return this.b.isEmpty();
    }

    public final int b() {
        dbsk.l(!a());
        return this.d;
    }

    public final anik<K, V> c() {
        return this.b.get(b());
    }

    public final void e() {
        dbsk.l(!this.b.isEmpty());
        this.d--;
        h(this.b.removeFirst());
    }

    public final void f(anik<K, V> anikVar) {
        for (aniw aniwVar : this.c) {
            anic anicVar = (anic) anikVar;
            eapy eapyVar = (eapy) anicVar.a;
            ((anjl) anicVar.b).e();
        }
    }

    public final void g(anik<K, V> anikVar) {
        for (aniw aniwVar : this.c) {
            K a = anikVar.a();
            anjl anjlVar = (anjl) anikVar.b();
            aniwVar.b.a((eapy) a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        while (this.d - 2 > 0) {
            e();
        }
        while (this.d + 2 < this.b.size() - 1) {
            dbsk.l(!this.b.isEmpty());
            h(this.b.removeLast());
        }
        while (this.d - 2 < 0) {
            dbsk.l(!this.b.isEmpty());
            anik<K, V> i = i(((dbsu) dbsg.i(((eapy) this.b.getFirst().a()).b(eaoz.e, -1))).a);
            this.b.addFirst(i);
            this.d++;
            f(i);
        }
        while (this.d + 2 > this.b.size() - 1) {
            dbsk.l(!this.b.isEmpty());
            anix anixVar = this.f;
            eapy c = ((eapy) this.b.getLast().a()).c(1);
            eapg j = aogc.j(anixVar.a);
            dbsg i2 = c.B(new eapy(j.r(), j.s())) ? dbpy.a : dbsg.i(c);
            if (!i2.a()) {
                break;
            }
            anik<K, V> i3 = i(i2.b());
            this.b.addLast(i3);
            f(i3);
        }
        for (aniw aniwVar : this.c) {
            cqkx.p(aniwVar.a);
        }
    }
}
