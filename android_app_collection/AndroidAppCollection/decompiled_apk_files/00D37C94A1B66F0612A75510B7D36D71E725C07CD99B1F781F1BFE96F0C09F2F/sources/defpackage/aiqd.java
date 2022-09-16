package defpackage;
/* compiled from: PG */
/* renamed from: aiqd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aiqd implements ayqb {
    public final /* synthetic */ aiqf a;
    private final /* synthetic */ int b;

    public /* synthetic */ aiqd(aiqf aiqfVar, int i) {
        this.b = i;
        this.a = aiqfVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            aiqf aiqfVar = this.a;
            ahhm ahhmVar = (ahhm) obj;
            if (ahhmVar.c() != aijx.VIDEO_WATCH_LOADED || !aiqfVar.j || ((aheu) aiqfVar.c.get()).c(aiqk.c) != 2) {
                if (ahhmVar.c() != aijx.VIDEO_LOADING) {
                    return;
                }
                aiqfVar.j = false;
                return;
            }
            aiqfVar.h = true;
            aiqfVar.b.post(aiqfVar.f);
            aiqfVar.j = false;
        } else if (i == 1) {
            ahhk ahhkVar = (ahhk) obj;
            this.a.a();
        } else if (i == 2) {
            aiqf aiqfVar2 = this.a;
            ahhw ahhwVar = (ahhw) obj;
            if (ahhwVar.c() != aika.PLAYBACK_PENDING || aiqfVar2.i <= 0) {
                if (ahhwVar.c() != aika.VIDEO_PLAYING) {
                    return;
                }
                aiqfVar2.a();
                return;
            }
            aiqfVar2.k.f.c(new ahht());
        } else if (i == 3) {
            aiqf aiqfVar3 = this.a;
            aiim aiimVar = aiim.START;
            switch (((aiin) obj).a().ordinal()) {
                case 0:
                case 1:
                case 2:
                case 6:
                case 7:
                    aiqfVar3.a();
                    return;
                case 3:
                case 4:
                case 5:
                    if (!aiqfVar3.h) {
                        return;
                    }
                    aiqfVar3.i++;
                    return;
                default:
                    return;
            }
        } else {
            aiqf aiqfVar4 = this.a;
            aikd aikdVar = (aikd) obj;
            axnm axnmVar = aiqfVar4.c;
            if (axnmVar == null || ((!airu.b(((aheu) axnmVar.get()).c(aiqk.c)) && !airu.b(((aheu) aiqfVar4.c.get()).c(aiqk.d))) || !aikdVar.a() || aiqfVar4.i >= aiqfVar4.a.g)) {
                aiqfVar4.a();
            } else if (((aheu) aiqfVar4.c.get()).c(aiqk.c) == 2) {
                aiqfVar4.h = true;
                aiqfVar4.b.post(aiqfVar4.f);
            } else if (((aheu) aiqfVar4.c.get()).c(aiqk.d) == 2) {
                aiqfVar4.h = true;
                aiqfVar4.b.post(aiqfVar4.g);
            } else if (((aheu) aiqfVar4.c.get()).c(aiqk.c) != 3) {
            } else {
                aiqfVar4.j = true;
            }
        }
    }
}
