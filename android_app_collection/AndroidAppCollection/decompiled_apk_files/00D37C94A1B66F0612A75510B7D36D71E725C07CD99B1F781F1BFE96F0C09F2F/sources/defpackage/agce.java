package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
/* compiled from: PG */
/* renamed from: agce  reason: default package */
/* loaded from: classes.dex */
public final class agce implements zdx {
    public final ajxh a;
    public final Map b;
    public final agcd c;
    public final Handler d;
    private final agca e;
    private final agcc f;

    public agce(ajxh ajxhVar, agca agcaVar, agcd agcdVar) {
        ajxhVar.getClass();
        this.a = ajxhVar;
        agcaVar.getClass();
        this.e = agcaVar;
        this.f = new agcc(this);
        this.b = new HashMap();
        agcdVar.getClass();
        this.c = agcdVar;
        this.d = new Handler(Looper.getMainLooper());
    }

    public static String a(asky askyVar) {
        if (TextUtils.isEmpty(askyVar.e)) {
            String valueOf = String.valueOf(Integer.toHexString(askyVar.c));
            String valueOf2 = String.valueOf(aneg.f.f().i(askyVar.d.I()));
            return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return aneg.f.f().i(askyVar.e.getBytes(Charset.forName("UTF-8")));
    }

    public final void b(ajfz ajfzVar) {
        askw askwVar = (askw) ajna.h(ajfzVar, askw.class);
        askwVar.getClass();
        asky askyVar = askwVar.c;
        if (askyVar == null) {
            askyVar = asky.a;
        }
        String a = a(askyVar);
        synchronized (this.b) {
            boolean containsKey = this.b.containsKey(a);
            if (containsKey) {
                this.a.X(a);
            }
            this.b.put(a, ajfzVar);
            if (askwVar.d != 0) {
                this.a.ae(a, ajfzVar, new Timer());
            }
            if (!containsKey) {
                this.e.a(askyVar, this.f);
            }
        }
    }

    public final void c() {
        synchronized (this.b) {
            for (ajfz ajfzVar : this.b.values()) {
                askw askwVar = (askw) ajna.h(ajfzVar, askw.class);
                askwVar.getClass();
                asky askyVar = askwVar.c;
                if (askyVar == null) {
                    askyVar = asky.a;
                }
                synchronized (this.b) {
                    this.a.X(a(askyVar));
                    this.b.remove(a(askyVar));
                    this.e.b(askyVar, this.f);
                }
            }
        }
    }

    @Override // defpackage.zdx
    public final void j() {
        throw null;
    }
}
