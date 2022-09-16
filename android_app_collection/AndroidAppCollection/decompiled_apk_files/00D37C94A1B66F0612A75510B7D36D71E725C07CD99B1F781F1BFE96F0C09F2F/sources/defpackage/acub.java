package defpackage;

import com.google.android.libraries.youtube.logging.interaction.GelVisibilityUpdate;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
/* compiled from: PG */
/* renamed from: acub  reason: default package */
/* loaded from: classes.dex */
public final class acub implements acuk {
    public final actz a;
    public final Set b;
    private final actm c;
    private final acul d;
    private final Hashtable e;

    public acub(actm actmVar, actz actzVar, acul aculVar) {
        this.c = actmVar;
        this.a = actzVar;
        aculVar.getClass();
        this.d = aculVar;
        aculVar.b(this);
        this.b = new HashSet();
        this.e = new Hashtable();
    }

    private final void f() {
        InteractionLoggingScreen c;
        if (this.d.a() && (c = this.a.c()) != null) {
            synchronized (this.e) {
                for (GelVisibilityUpdate gelVisibilityUpdate : this.e.values()) {
                    if (gelVisibilityUpdate instanceof GelVisibilityUpdate.ShownVisibilityUpdate) {
                        this.c.h(c, (GelVisibilityUpdate.ShownVisibilityUpdate) gelVisibilityUpdate);
                    } else if (gelVisibilityUpdate instanceof GelVisibilityUpdate.HiddenVisibilityUpdate) {
                        this.c.g(c, (GelVisibilityUpdate.HiddenVisibilityUpdate) gelVisibilityUpdate);
                    }
                }
                this.e.clear();
            }
        }
    }

    @Override // defpackage.acuk
    public final void a() {
        InteractionLoggingScreen c;
        c();
        if (!this.d.a() && (c = this.a.c()) != null) {
            HashSet<GelVisibilityUpdate> hashSet = new HashSet();
            for (GelVisibilityUpdate gelVisibilityUpdate : c.g.values()) {
                if (gelVisibilityUpdate.f == 5) {
                    hashSet.add(gelVisibilityUpdate);
                }
            }
            synchronized (this.e) {
                for (GelVisibilityUpdate gelVisibilityUpdate2 : hashSet) {
                    this.c.g(c, new GelVisibilityUpdate.HiddenVisibilityUpdate(gelVisibilityUpdate2.b, gelVisibilityUpdate2.c, gelVisibilityUpdate2.d));
                }
                for (GelVisibilityUpdate gelVisibilityUpdate3 : hashSet) {
                    e(new GelVisibilityUpdate.ShownVisibilityUpdate(gelVisibilityUpdate3.b, gelVisibilityUpdate3.c, gelVisibilityUpdate3.d));
                }
            }
        }
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        synchronized (this.b) {
            this.b.clear();
        }
        synchronized (this.e) {
            this.e.clear();
        }
    }

    public final void c() {
        InteractionLoggingScreen c;
        if (this.d.a() && (c = this.a.c()) != null) {
            synchronized (this.b) {
                for (acua acuaVar : this.b) {
                    this.c.h(c, new GelVisibilityUpdate.ShownVisibilityUpdate(actm.a(acuaVar.a), GelVisibilityUpdate.a, acuaVar.b));
                }
                this.b.clear();
            }
        }
    }

    public final void d(GelVisibilityUpdate.HiddenVisibilityUpdate hiddenVisibilityUpdate) {
        InteractionLoggingScreen c = this.a.c();
        if (this.d.a() || c.h(hiddenVisibilityUpdate.d)) {
            synchronized (this.e) {
                this.e.put(hiddenVisibilityUpdate.d, hiddenVisibilityUpdate);
            }
            f();
            return;
        }
        synchronized (this.e) {
            this.e.remove(hiddenVisibilityUpdate.d);
        }
    }

    public final void e(GelVisibilityUpdate.ShownVisibilityUpdate shownVisibilityUpdate) {
        InteractionLoggingScreen c = this.a.c();
        if (this.d.a() || !c.h(shownVisibilityUpdate.d)) {
            synchronized (this.e) {
                this.e.put(shownVisibilityUpdate.d, shownVisibilityUpdate);
            }
            f();
            return;
        }
        synchronized (this.e) {
            this.e.remove(shownVisibilityUpdate.d);
        }
    }
}
