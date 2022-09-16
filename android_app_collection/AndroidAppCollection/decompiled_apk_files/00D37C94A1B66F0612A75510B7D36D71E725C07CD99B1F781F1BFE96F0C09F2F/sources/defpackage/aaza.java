package defpackage;

import com.google.protos.youtube.api.innertube.LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aaza  reason: default package */
/* loaded from: classes.dex */
public final class aaza extends aars implements aari {
    public final afvn a;
    public final aayy b;
    public final aarl c;
    public final aarl g;
    public final aarl h;
    public final aarl i;
    public final aarl j;
    public final aarl k;
    private final aarl l;
    private final Set m;

    public aaza(aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, yqw yqwVar, Set set) {
        super(aaqfVar, yqwVar);
        this.a = afvnVar;
        this.m = set;
        this.b = new aayy(aaqjVar, yqwVar);
        this.c = c(ascm.a, aaqjVar, aayx.c, aayd.n);
        this.l = c(arvr.a, aaqjVar, aayx.e, aayd.i);
        this.g = c(arvu.a, aaqjVar, aayx.f, aayd.j);
        this.h = c(arwn.a, aaqjVar, aayx.a, aayd.m);
        this.i = c(arvp.a, aaqjVar, aayx.d, aayd.h);
        this.j = c(arvw.a, aaqjVar, aaxa.u, aayd.k);
        this.k = c(arvy.a, aaqjVar, aayx.b, aayd.l);
    }

    @Override // defpackage.aari
    public final /* bridge */ /* synthetic */ aaqs a(ajfz ajfzVar) {
        aays e = e();
        e.b = aays.g(ajfzVar.b());
        e.k(ajfzVar.d());
        return e;
    }

    @Override // defpackage.aari
    public final void b(aaqs aaqsVar, aarh aarhVar, afzf afzfVar) {
        this.b.j((aays) aaqsVar, aarhVar, afzfVar);
    }

    public final aayo d(apzg apzgVar) {
        aayo aayoVar = new aayo(this.e, this.a.c());
        aayoVar.a = ((LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint) apzgVar.qm(LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.liveChatItemContextMenuEndpoint)).b;
        if ((apzgVar.b & 1) == 0) {
            aayoVar.i();
        } else {
            aayoVar.j(apzgVar.c);
        }
        return aayoVar;
    }

    public final aays e() {
        return new aays(this.e, this.a.c(), this.m);
    }

    public final void f(aayo aayoVar, afzf afzfVar) {
        this.l.e(aayoVar, afzfVar);
    }
}
