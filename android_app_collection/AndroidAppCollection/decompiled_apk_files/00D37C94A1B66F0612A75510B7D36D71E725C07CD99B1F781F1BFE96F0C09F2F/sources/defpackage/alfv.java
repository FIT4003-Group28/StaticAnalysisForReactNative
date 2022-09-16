package defpackage;

import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: alfv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class alfv implements ayqb {
    private final /* synthetic */ int c;
    public static final /* synthetic */ alfv b = new alfv(1);
    public static final /* synthetic */ alfv a = new alfv();

    private /* synthetic */ alfv() {
    }

    private /* synthetic */ alfv(int i) {
        this.c = i;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.c == 0) {
            aopa aopaVar = (aopa) obj;
            aopaVar.copyOnWrite();
            alcw alcwVar = (alcw) aopaVar.instance;
            alcw alcwVar2 = alcw.a;
            alcwVar.r = 0;
            alcwVar.b |= 65536;
            return;
        }
        aopa aopaVar2 = (aopa) obj;
        Charset charset = alfp.a;
        aopaVar2.copyOnWrite();
        alcw alcwVar3 = (alcw) aopaVar2.instance;
        alcw alcwVar4 = alcw.a;
        alcwVar3.b |= 33554432;
        alcwVar3.x = false;
    }
}
