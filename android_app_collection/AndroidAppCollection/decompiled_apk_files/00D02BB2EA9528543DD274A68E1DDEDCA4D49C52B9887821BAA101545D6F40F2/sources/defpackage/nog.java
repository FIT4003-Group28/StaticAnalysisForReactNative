package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayDeque;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: nog  reason: default package */
/* loaded from: classes7.dex */
public final class nog implements nop, btph {
    public boolean a;
    public boolean b;
    public boolean c;
    private final nov d;
    private final ktf e;
    private boolean g;
    private final noe h;
    private final ArrayDeque<non> f = new ArrayDeque<>();
    private final nof i = new nof(this);

    public nog(noe noeVar, nov novVar, ktf ktfVar) {
        this.h = noeVar;
        this.d = novVar;
        this.e = ktfVar;
    }

    private final void o() {
        if (!this.c || this.f.isEmpty() || this.a) {
            return;
        }
        this.f.getLast().e();
        this.e.b(this.f.getLast().g(), ktd.HIDE);
    }

    private final void p(boolean z) {
        if (!this.c) {
            return;
        }
        if (!this.d.c()) {
            l(z);
            return;
        }
        if (!this.a) {
            this.a = true;
        }
        this.b = z;
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        bvrj.UI_THREAD.c();
        boolean z = this.c;
        int size = this.f.size();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append(str);
        sb.append("overlay stack {isShown=");
        sb.append(z);
        sb.append(", size=");
        sb.append(size);
        sb.append("}:");
        printWriter.println(sb.toString());
        if (this.f.isEmpty()) {
            printWriter.println(String.valueOf(str).concat("  empty stack"));
            return;
        }
        Iterator<non> it = this.f.iterator();
        int i = 0;
        while (it.hasNext()) {
            non next = it.next();
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter2 = new PrintWriter(stringWriter);
            next.NX(String.valueOf(str).concat("    "), printWriter2);
            printWriter2.flush();
            String stringWriter2 = stringWriter.toString();
            String str2 = stringWriter2.length() > 0 ? ":" : "";
            String g = next.g();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 15 + String.valueOf(g).length() + str2.length());
            sb2.append(str);
            sb2.append("  #");
            sb2.append(i);
            sb2.append(" ");
            sb2.append(g);
            sb2.append(str2);
            printWriter.println(sb2.toString());
            printWriter.write(stringWriter2);
            i++;
        }
    }

    @Override // defpackage.noo
    public final void a() {
        bvrj.UI_THREAD.c();
        this.d.a();
        do {
        } while (b() == 1);
        this.d.b();
    }

    @Override // defpackage.noo
    public final int b() {
        bvrj.UI_THREAD.c();
        if (h()) {
            return 2;
        }
        int i = j().i();
        if (i != 2) {
            return i;
        }
        n();
        return 1;
    }

    @dzsi
    public final noq d() {
        bvrj.UI_THREAD.c();
        this.c = true;
        nov novVar = this.d;
        nof nofVar = this.i;
        bvrj.UI_THREAD.c();
        dbsk.s(nofVar);
        novVar.a.add(nofVar);
        if (this.f.isEmpty()) {
            return null;
        }
        if (this.d.c()) {
            if (!this.a) {
                this.a = true;
            }
            this.b = true;
            return null;
        }
        this.f.getLast().g();
        noq b = this.f.getLast().b();
        this.f.getLast().g();
        this.e.b(this.f.getLast().g(), ktd.SHOW);
        return b;
    }

    public final void e() {
        bvrj.UI_THREAD.c();
        if (this.a) {
            this.a = false;
        } else if (!this.f.isEmpty()) {
            this.f.getLast().g();
            this.f.getLast().e();
            this.f.getLast().g();
            this.e.b(this.f.getLast().g(), ktd.HIDE);
        }
        nov novVar = this.d;
        nof nofVar = this.i;
        bvrj.UI_THREAD.c();
        dbsk.s(nofVar);
        if (novVar.a.remove(nofVar)) {
            this.c = false;
            return;
        }
        throw new IllegalStateException("Don't have that listener");
    }

    public final int f() {
        bvrj.UI_THREAD.c();
        return this.f.size();
    }

    @Override // defpackage.nop
    public final boolean g() {
        bvrj.UI_THREAD.c();
        return this.f.isEmpty() || this.f.getLast().h();
    }

    public final boolean h() {
        bvrj.UI_THREAD.c();
        return this.f.isEmpty();
    }

    public final boolean i(Class<?> cls) {
        bvrj.UI_THREAD.c();
        Iterator<non> descendingIterator = this.f.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (cls.isInstance(descendingIterator.next())) {
                return true;
            }
        }
        return false;
    }

    public final non j() {
        bvrj.UI_THREAD.c();
        return this.f.getLast();
    }

    @Override // defpackage.nop
    public final void k(non nonVar) {
        bvrj.UI_THREAD.c();
        dbsk.s(nonVar);
        dbsk.l(!this.g);
        this.g = true;
        o();
        nonVar.g();
        nonVar.a();
        nonVar.g();
        this.f.add(nonVar);
        this.e.b(nonVar.g(), ktd.PUSH);
        p(true);
        this.g = false;
    }

    public final void l(boolean z) {
        if (this.f.isEmpty()) {
            this.h.b(null, z);
            return;
        }
        this.h.b(this.f.getLast().b(), z);
        this.e.b(this.f.getLast().g(), ktd.SHOW);
    }

    public final void m() {
        bvrj.UI_THREAD.c();
        this.d.a();
        while (!h()) {
            n();
        }
        this.d.b();
    }

    public final void n() {
        bvrj.UI_THREAD.c();
        dbsk.m(!this.f.isEmpty(), "Tried to pop an empty stack.");
        dbsk.l(!this.g);
        this.g = true;
        o();
        non removeLast = this.f.removeLast();
        removeLast.g();
        removeLast.f();
        removeLast.g();
        this.e.b(removeLast.g(), ktd.POP);
        p(false);
        this.g = false;
    }
}
