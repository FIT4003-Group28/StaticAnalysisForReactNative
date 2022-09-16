package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jmo  reason: default package */
/* loaded from: classes3.dex */
public final class jmo extends jlr {
    private final Context a;

    public jmo(azqb azqbVar, Context context) {
        super(azqbVar, atfa.class);
        this.a = context;
    }

    @Override // defpackage.jlr
    protected final /* bridge */ /* synthetic */ Object a(agvx agvxVar, amup amupVar) {
        int i;
        Iterator it = agvxVar.m().j().iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            agqv agqvVar = (agqv) it.next();
            agqvVar.getClass();
            agqu agquVar = agqvVar.j;
            if (agquVar != null && agquVar.a() > 0) {
                i = (int) TimeUnit.SECONDS.toDays(agquVar.a());
                break;
            }
        }
        if (i > 0) {
            aopa createBuilder = atfc.a.createBuilder();
            arag g = ajgl.g(this.a.getResources().getQuantityString(R.plurals.offline_go_online_to_renew_dialog_message, i, Integer.valueOf(i)));
            createBuilder.copyOnWrite();
            atfc atfcVar = (atfc) createBuilder.instance;
            g.getClass();
            atfcVar.c = g;
            atfcVar.b |= 1;
            atfc atfcVar2 = (atfc) createBuilder.mo39build();
            aopa createBuilder2 = atfa.a.createBuilder();
            aopa createBuilder3 = atfd.a.createBuilder();
            createBuilder3.copyOnWrite();
            atfd atfdVar = (atfd) createBuilder3.instance;
            atfcVar2.getClass();
            atfdVar.c = atfcVar2;
            atfdVar.b |= 1;
            createBuilder2.copyOnWrite();
            atfa atfaVar = (atfa) createBuilder2.instance;
            atfd atfdVar2 = (atfd) createBuilder3.mo39build();
            atfdVar2.getClass();
            atfaVar.f = atfdVar2;
            atfaVar.b |= 2;
            aopa createBuilder4 = atfb.a.createBuilder();
            createBuilder4.copyOnWrite();
            atfb atfbVar = (atfb) createBuilder4.instance;
            atfbVar.c = 2;
            atfbVar.b = 1 | atfbVar.b;
            createBuilder2.copyOnWrite();
            atfa atfaVar2 = (atfa) createBuilder2.instance;
            atfb atfbVar2 = (atfb) createBuilder4.mo39build();
            atfbVar2.getClass();
            atfaVar2.g = atfbVar2;
            atfaVar2.b |= 16;
            return (atfa) createBuilder2.mo39build();
        }
        return null;
    }

    @Override // defpackage.jlr
    protected final /* bridge */ /* synthetic */ Object f() {
        return null;
    }
}
