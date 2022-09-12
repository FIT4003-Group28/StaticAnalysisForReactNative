package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.filament.R;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: cuzv  reason: default package */
/* loaded from: classes5.dex */
public final class cuzv implements cuvx {
    private static final dcdn<String, Integer> j = dcdn.n("tel", 1, "mailto", 2, "http", 3, "https", 3);
    public final ctxo a;
    public UUID d;
    public long f;
    private final ConversationId k;
    private final ctyy l;
    public final Set<String> b = new HashSet();
    public final Set<String> c = new HashSet();
    public boolean e = true;
    public dbsg<Long> g = dbpy.a;
    public dbsg<String> h = dbpy.a;
    public dcdc<cvdw> i = dcdc.e();

    public cuzv(ConversationId conversationId, ctyy ctyyVar, ctxo ctxoVar) {
        this.k = conversationId;
        this.l = ctyyVar;
        this.a = ctxoVar;
    }

    private final void m(int i, boolean z, boolean z2, boolean z3, long j2) {
        ctxu ctxuVar = new ctxu();
        ctxuVar.c = Boolean.valueOf(z);
        ctxuVar.a = Boolean.valueOf(z2);
        ctxuVar.b = Long.valueOf(j2);
        ctxuVar.d = Boolean.valueOf(z3);
        String str = ctxuVar.a == null ? " pageLoadedSuccess" : "";
        if (ctxuVar.b == null) {
            str = str.concat(" pageLoadTimeMs");
        }
        if (ctxuVar.c == null) {
            str = String.valueOf(str).concat(" dismissedByNativeUi");
        }
        if (ctxuVar.d == null) {
            str = String.valueOf(str).concat(" userDidCompleteAction");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        ctxv ctxvVar = new ctxv(ctxuVar.a.booleanValue(), ctxuVar.b.longValue(), ctxuVar.c.booleanValue(), ctxuVar.d.booleanValue());
        ctxo ctxoVar = this.a;
        ctxm k = k(i);
        cuii l = l();
        l.c(new cubu(ctxvVar));
        k.r(l.a());
        ctxoVar.b(k.a());
    }

    @Override // defpackage.cuvx
    public final void a(cugu cuguVar, Uri uri) {
        Integer num = j.get(uri.getScheme());
        ctxo ctxoVar = this.a;
        ctxm k = k(R.styleable.AppCompatTheme_windowFixedWidthMajor);
        cuii l = l();
        l.b(cuguVar.a());
        k.r(l.a());
        k.k(num != null ? num.intValue() : 0);
        ctxoVar.b(k.a());
    }

    @Override // defpackage.cuvx
    public final void b(cugu cuguVar, String str) {
        Integer num = j.get(str);
        ctxo ctxoVar = this.a;
        ctxm k = k(R.styleable.AppCompatTheme_windowMinWidthMajor);
        cuii l = l();
        l.b(cuguVar.a());
        l.c(cubw.a);
        k.r(l.a());
        k.k(num != null ? num.intValue() : 0);
        ctxoVar.b(k.a());
    }

    @Override // defpackage.cuvx
    public final void c(cugu cuguVar) {
        ctxo ctxoVar = this.a;
        ctxm k = k(R.styleable.AppCompatTheme_windowMinWidthMajor);
        cuii l = l();
        l.b(cuguVar.a());
        l.c(cubz.a);
        k.r(l.a());
        ctxoVar.b(k.a());
    }

    @Override // defpackage.cuvx
    public final void d(boolean z, boolean z2) {
        m(R.styleable.AppCompatTheme_windowNoTitle, z, false, z2, 0L);
    }

    @Override // defpackage.cuvx
    public final void e(boolean z, long j2) {
        m(R.styleable.AppCompatTheme_windowMinWidthMajor, false, z, false, j2);
    }

    public final void f() {
        j(R.styleable.AppCompatTheme_textColorAlertDialogListItem);
    }

    public final void g(int i, cuib cuibVar, int i2) {
        ctya f = ctyb.f();
        ctxs ctxsVar = (ctxs) f;
        ctxsVar.c = dbsg.i(Integer.valueOf(cuibVar.c().get(i2).d().f().l));
        f.b(cuibVar.a());
        ctxsVar.a = dbsg.i(Integer.valueOf(cuibVar.c().get(i2).a()));
        ctxsVar.b = dbsg.i(Integer.valueOf(i2));
        f.c(cuibVar.d());
        ctyb a = f.a();
        ctxo ctxoVar = this.a;
        ctxm k = k(i);
        cuii l = l();
        l.c(cucc.a(a));
        l.b(cuibVar.b());
        k.r(l.a());
        ctxoVar.b(k.a());
    }

    public final void h(cugu cuguVar) {
        if (!this.b.add(cuguVar.a())) {
            return;
        }
        ctxm k = k(105);
        k.f(cuguVar.o() == 1 ? 155 : 156);
        ctyi c = ctyj.c();
        c.c(cuguVar.l());
        c.b(cuguVar.k().a().h);
        k.i(c.a());
        final cuii l = l();
        l.b(cuguVar.a());
        if (cuguVar.f().a() == 3) {
            dcdc<cvdw> dcdcVar = this.i;
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                cvdw cvdwVar = dcdcVar.get(i);
                if (cvdwVar.a().g(cuguVar)) {
                    dbsg<cuij> c2 = cvdwVar.c(cuguVar);
                    l.getClass();
                    cstn.a(c2, new mw(l) { // from class: cuzu
                        private final cuii a;

                        {
                            this.a = l;
                        }

                        @Override // defpackage.mw
                        public final void a(Object obj) {
                            this.a.c((cuij) obj);
                        }
                    });
                }
            }
        }
        ctxo ctxoVar = this.a;
        k.r(l.a());
        ctxoVar.b(k.a());
    }

    public final void i(String str, cuij cuijVar) {
        if (!this.c.add(String.valueOf(str))) {
            return;
        }
        ctxo ctxoVar = this.a;
        ctxm k = k(R.styleable.AppCompatTheme_windowMinWidthMajor);
        cuii l = l();
        ((cuev) l).e = dbsg.i(str);
        l.c(cuijVar);
        k.r(l.a());
        ctxoVar.b(k.a());
    }

    public final void j(int i) {
        ctxo ctxoVar = this.a;
        ctxm k = k(i);
        k.r(l().a());
        ctxoVar.b(k.a());
    }

    public final ctxm k(int i) {
        ctxm r = ctxn.r();
        UUID uuid = this.d;
        if (uuid != null) {
            r.p(uuid.toString());
        }
        r.g(i);
        r.n(this.l.b().e());
        r.o(this.l.c().J());
        r.d(this.k);
        return r;
    }

    public final cuii l() {
        cuii h = cuil.h();
        if (this.f > 0) {
            ((cuev) h).d = dbsg.i(Long.valueOf(SystemClock.elapsedRealtime() - this.f));
        }
        if (this.g.a()) {
            ((cuev) h).a = dbsg.i(Long.valueOf(this.g.b().longValue()));
        }
        if (this.h.a()) {
            ((cuev) h).b = dbsg.i(this.h.b());
        }
        return h;
    }
}
