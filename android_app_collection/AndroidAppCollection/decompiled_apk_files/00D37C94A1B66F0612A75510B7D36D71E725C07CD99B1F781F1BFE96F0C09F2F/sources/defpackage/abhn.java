package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: abhn  reason: default package */
/* loaded from: classes.dex */
public final class abhn extends abhr {
    private Queue g;
    private final abhm h;
    private long i;
    private long j;
    private boolean k;

    public abhn(Handler handler, abha abhaVar, abgz abgzVar, abhm abhmVar) {
        super(handler, abhaVar, abgzVar);
        this.h = abhmVar;
    }

    @Override // defpackage.abhr, defpackage.abhc
    public final synchronized void a(List list, long j) {
        if (this.g == null) {
            return;
        }
        this.i = Long.MIN_VALUE;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            apzg apzgVar = (apzg) it.next();
            if (apzgVar.qn(LiveChatAction.ReplayChatItemAction.replayChatItemAction)) {
                LiveChatAction.ReplayChatItemAction replayChatItemAction = (LiveChatAction.ReplayChatItemAction) apzgVar.qm(LiveChatAction.ReplayChatItemAction.replayChatItemAction);
                this.g.add(replayChatItemAction);
                long j2 = replayChatItemAction.c;
                if (j2 > this.i) {
                    this.i = j2;
                }
            }
        }
        this.k = true;
        g(this.j);
    }

    public final synchronized void f(long j) {
        this.j = j;
        this.i = Long.MIN_VALUE;
        ((abiq) this.a).d.mX();
        this.g.clear();
        abhm abhmVar = this.h;
        Runnable runnable = new Runnable() { // from class: abhl
            @Override // java.lang.Runnable
            public final void run() {
                ((abiq) abhn.this.a).b.q();
            }
        };
        List<assp> list = ((abiq) abhmVar).f;
        if (list != null) {
            for (assp asspVar : list) {
                if ((asspVar.b & 16) != 0) {
                    ((abiq) abhmVar).f = null;
                    abin abinVar = ((abiq) abhmVar).m;
                    aubu aubuVar = asspVar.g;
                    if (aubuVar == null) {
                        aubuVar = aubu.a;
                    }
                    abkq o = abinVar.d.o();
                    if (o != null) {
                        o.A();
                    }
                    aopa createBuilder = asqk.a.createBuilder();
                    createBuilder.copyOnWrite();
                    asqk asqkVar = (asqk) createBuilder.instance;
                    asqkVar.b |= 2;
                    asqkVar.c = j;
                    ajfz g = ajna.g(aubuVar);
                    aayq d = abinVar.d.j.d();
                    d.t(g);
                    d.a = (asqk) createBuilder.mo39build();
                    d.k(aubuVar.d.I());
                    abinVar.m(d, ((ajgc) g).b, runnable);
                    this.k = false;
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0154 A[Catch: all -> 0x0191, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x000b, B:10:0x001b, B:18:0x002b, B:20:0x0033, B:22:0x0040, B:26:0x0049, B:28:0x004f, B:30:0x005b, B:32:0x006e, B:43:0x00ea, B:44:0x00f3, B:33:0x0074, B:34:0x0080, B:36:0x0088, B:38:0x0098, B:40:0x00d8, B:48:0x0102, B:49:0x0105, B:53:0x010b, B:55:0x0113, B:56:0x0117, B:58:0x011d, B:60:0x0129, B:62:0x012d, B:63:0x012f, B:65:0x0135, B:67:0x013b, B:69:0x0143, B:71:0x014b, B:73:0x0154, B:74:0x0157, B:76:0x015e, B:77:0x0162, B:79:0x0168, B:81:0x0174, B:83:0x017c, B:84:0x017e, B:89:0x018c), top: B:97:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015e A[Catch: all -> 0x0191, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x000b, B:10:0x001b, B:18:0x002b, B:20:0x0033, B:22:0x0040, B:26:0x0049, B:28:0x004f, B:30:0x005b, B:32:0x006e, B:43:0x00ea, B:44:0x00f3, B:33:0x0074, B:34:0x0080, B:36:0x0088, B:38:0x0098, B:40:0x00d8, B:48:0x0102, B:49:0x0105, B:53:0x010b, B:55:0x0113, B:56:0x0117, B:58:0x011d, B:60:0x0129, B:62:0x012d, B:63:0x012f, B:65:0x0135, B:67:0x013b, B:69:0x0143, B:71:0x014b, B:73:0x0154, B:74:0x0157, B:76:0x015e, B:77:0x0162, B:79:0x0168, B:81:0x0174, B:83:0x017c, B:84:0x017e, B:89:0x018c), top: B:97:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void g(long r21) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abhn.g(long):void");
    }

    @Override // defpackage.abhr, defpackage.abhc, defpackage.abrg
    public final synchronized void mU() {
        this.k = false;
    }

    @Override // defpackage.abhc, defpackage.abrg
    public final synchronized void mV() {
        this.k = true;
    }

    @Override // defpackage.abhr, defpackage.abhc, defpackage.abrg
    public final synchronized void mW() {
        this.g = new ArrayDeque();
        this.j = 0L;
        this.k = true;
        this.i = Long.MIN_VALUE;
    }

    @Override // defpackage.abhr, defpackage.abhc, defpackage.abrg
    public final synchronized void mX() {
        this.g = null;
        this.k = false;
    }
}
