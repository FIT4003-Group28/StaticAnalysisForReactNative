package defpackage;

import android.os.Handler;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: jor  reason: default package */
/* loaded from: classes3.dex */
public final class jor implements ynl {
    public final azqb a;
    public final azqb b;
    public final azqb c;
    private final Handler d;

    public jor(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, Handler handler) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = handler;
    }

    public final void a(final String str) {
        this.d.post(new Runnable() { // from class: jop
            @Override // java.lang.Runnable
            public final void run() {
                jor jorVar = jor.this;
                String str2 = str;
                joo jooVar = (joo) jorVar.c.get();
                joq joqVar = new joq();
                ylr.c();
                jon jonVar = jooVar.e;
                if (jonVar != null) {
                    jooVar.c.removeCallbacks(jonVar);
                    jooVar.e = null;
                }
                jooVar.d.put(str2, joqVar);
                jooVar.e = new jon(jooVar);
                jooVar.c.postDelayed(jooVar.e, joo.a);
            }
        });
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        String str;
        if (i != -1) {
            if (i == 0) {
                aspb a = ((gaf) obj).a();
                if ((a != aspb.LIKE && a != aspb.INDIFFERENT) || !((ahdn) this.a.get()).c()) {
                    return null;
                }
                Iterator it = ((agrf) this.b.get()).a().i().j().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    agqf agqfVar = ((agqh) it.next()).a;
                    agqa agqaVar = agqfVar.c;
                    if (agqfVar.a.startsWith("LL") && agqaVar != null && agqaVar.e) {
                        str = agqfVar.a;
                        break;
                    }
                }
                if (amps.e(str)) {
                    return null;
                }
                a(str);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{gaf.class};
    }
}
