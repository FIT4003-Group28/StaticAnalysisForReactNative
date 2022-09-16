package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: gsm  reason: default package */
/* loaded from: classes3.dex */
public final class gsm {
    public final Context a;
    public final aijf b;
    public final azqb c;
    public final yzj d;
    public final eza e;
    private final azqb f;
    private final aizn g;

    public gsm(Context context, aijf aijfVar, azqb azqbVar, azqb azqbVar2, aizn aiznVar, yzj yzjVar, eza ezaVar) {
        this.a = context;
        this.b = aijfVar;
        this.f = azqbVar;
        this.c = azqbVar2;
        this.g = aiznVar;
        this.d = yzjVar;
        this.e = ezaVar;
    }

    public final is a() {
        return this.g.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final gsq b() {
        c().L();
        a().c();
        return gsq.a;
    }

    public final airr c() {
        return (airr) this.f.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        ajbf n;
        PlayerResponseModel c;
        asaa t;
        if (f() || e()) {
            if (!f() && (n = c().n()) != null && (c = n.c()) != null && (t = c.t()) != null) {
                return aijr.g(t);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return this.b.k;
    }

    final boolean f() {
        aijf aijfVar = this.b;
        return aijfVar.f != null || aijfVar.m;
    }
}
