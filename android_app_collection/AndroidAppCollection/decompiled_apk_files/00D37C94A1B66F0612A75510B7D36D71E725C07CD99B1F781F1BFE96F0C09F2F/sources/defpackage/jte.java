package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: jte  reason: default package */
/* loaded from: classes3.dex */
public final class jte implements jut {
    private final Context a;
    private final aagi b;
    private final ampq c;

    public jte(Context context, aagi aagiVar, ampq ampqVar) {
        this.a = context;
        this.b = aagiVar;
        this.c = ampqVar;
    }

    @Override // defpackage.jut
    public final amuk a(jnb jnbVar) {
        ampq ampqVar;
        awkg b;
        ampq l;
        if (!this.c.h()) {
            return amuk.q();
        }
        awka awkaVar = (awka) this.c.c();
        aagh c = this.b.c();
        Iterator it = awkaVar.getDownloads().iterator();
        while (true) {
            if (it.hasNext()) {
                awkb awkbVar = (awkb) it.next();
                int i = awkbVar.b;
                if (i == 1) {
                    ampqVar = pku.l(pku.k((String) awkbVar.c, c));
                } else {
                    if (i == 2) {
                        ampq i2 = ampq.i((awjm) c.f((String) awkbVar.c).g(awjm.class).W());
                        if (i2.h() && (b = ((awjm) i2.c()).b()) != null) {
                            amuk b2 = b.b();
                            int i3 = ((amxx) b2).c;
                            int i4 = 0;
                            while (i4 < i3) {
                                awkx b3 = ((awkp) b2.get(i4)).b();
                                if (b3 == null) {
                                    l = amon.a;
                                } else {
                                    List downloads = awkaVar.getDownloads();
                                    aopa createBuilder = awkb.a.createBuilder();
                                    String h = emn.h(b3.getVideoId());
                                    createBuilder.copyOnWrite();
                                    awkb awkbVar2 = (awkb) createBuilder.instance;
                                    h.getClass();
                                    awkbVar2.b = 1;
                                    awkbVar2.c = h;
                                    l = downloads.contains(createBuilder.mo39build()) ? amon.a : pku.l(pku.k(emn.h(b3.getVideoId()), c));
                                }
                                i4++;
                                if (l.h()) {
                                    ampqVar = l;
                                    break;
                                }
                            }
                        }
                    }
                    ampqVar = amon.a;
                }
                if (ampqVar.h()) {
                    break;
                }
            } else {
                ampqVar = amon.a;
                break;
            }
        }
        if (!ampqVar.h() || ((Integer) ampqVar.c()).intValue() <= 0) {
            return amuk.q();
        }
        aopa createBuilder2 = atfc.a.createBuilder();
        arag g = ajgl.g(this.a.getResources().getQuantityString(R.plurals.offline_go_online_to_renew_dialog_message, ((Integer) ampqVar.c()).intValue(), ampqVar.c()));
        createBuilder2.copyOnWrite();
        atfc atfcVar = (atfc) createBuilder2.instance;
        g.getClass();
        atfcVar.c = g;
        atfcVar.b |= 1;
        atfc atfcVar2 = (atfc) createBuilder2.mo39build();
        aopa createBuilder3 = aslt.a.createBuilder();
        aopa createBuilder4 = atfa.a.createBuilder();
        aopa createBuilder5 = atfd.a.createBuilder();
        createBuilder5.copyOnWrite();
        atfd atfdVar = (atfd) createBuilder5.instance;
        atfcVar2.getClass();
        atfdVar.c = atfcVar2;
        atfdVar.b |= 1;
        createBuilder4.copyOnWrite();
        atfa atfaVar = (atfa) createBuilder4.instance;
        atfd atfdVar2 = (atfd) createBuilder5.mo39build();
        atfdVar2.getClass();
        atfaVar.f = atfdVar2;
        atfaVar.b |= 2;
        aopa createBuilder6 = atfb.a.createBuilder();
        createBuilder6.copyOnWrite();
        atfb atfbVar = (atfb) createBuilder6.instance;
        atfbVar.c = 2;
        atfbVar.b |= 1;
        createBuilder4.copyOnWrite();
        atfa atfaVar2 = (atfa) createBuilder4.instance;
        atfb atfbVar2 = (atfb) createBuilder6.mo39build();
        atfbVar2.getClass();
        atfaVar2.g = atfbVar2;
        atfaVar2.b |= 16;
        atfa atfaVar3 = (atfa) createBuilder4.mo39build();
        createBuilder3.copyOnWrite();
        aslt asltVar = (aslt) createBuilder3.instance;
        atfaVar3.getClass();
        asltVar.Y = atfaVar3;
        asltVar.d |= 64;
        return amuk.r(new jur((aslt) createBuilder3.mo39build()));
    }
}
