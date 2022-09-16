package defpackage;
/* compiled from: PG */
/* renamed from: ttm  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ttm implements anir {
    public final /* synthetic */ tuk a;
    public final /* synthetic */ tqm b;
    private final /* synthetic */ int c;

    public /* synthetic */ ttm(tuk tukVar, tqm tqmVar) {
        this.a = tukVar;
        this.b = tqmVar;
    }

    public /* synthetic */ ttm(tuk tukVar, tqm tqmVar, int i) {
        this.c = i;
        this.a = tukVar;
        this.b = tqmVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        long c;
        int i = this.c;
        if (i == 0) {
            tuk tukVar = this.a;
            typ.d("%s: Encountered SharedFileMissingException for group: %s", "FileGroupManager", this.b.d);
            tukVar.c.a((tww) obj, "Shared file not found in getFileGroupDownloadStatus", new Object[0]);
            return anlz.q(tqu.NONE);
        } else if (i == 1) {
            tuk tukVar2 = this.a;
            tqm tqmVar = this.b;
            tqm tqmVar2 = (tqm) obj;
            if (tqmVar2 == null || !tuk.q(tqmVar, tqmVar2)) {
                c = tukVar2.f.c();
            } else {
                tql tqlVar = tqmVar2.c;
                if (tqlVar == null) {
                    tqlVar = tql.a;
                }
                c = tqlVar.d;
            }
            tql tqlVar2 = tqmVar.c;
            if (tqlVar2 == null) {
                tqlVar2 = tql.a;
            }
            aopa mo52toBuilder = tqlVar2.mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            tql tqlVar3 = (tql) mo52toBuilder.instance;
            tqlVar3.b = 2 | tqlVar3.b;
            tqlVar3.d = c;
            tql tqlVar4 = (tql) mo52toBuilder.mo39build();
            aopa mo52toBuilder2 = tqmVar.mo52toBuilder();
            mo52toBuilder2.copyOnWrite();
            tqm tqmVar3 = (tqm) mo52toBuilder2.instance;
            tqlVar4.getClass();
            tqmVar3.c = tqlVar4;
            tqmVar3.b |= 1;
            return anlz.q((tqm) mo52toBuilder2.mo39build());
        } else if (i != 2) {
            tuk tukVar3 = this.a;
            tqm tqmVar4 = this.b;
            Void r14 = (Void) obj;
            tuk.u(1009, tukVar3.b, tqmVar4);
            aopa createBuilder = angn.a.createBuilder();
            String str = tqmVar4.e;
            createBuilder.copyOnWrite();
            angn angnVar = (angn) createBuilder.instance;
            str.getClass();
            angnVar.b |= 4;
            angnVar.e = str;
            String str2 = tqmVar4.d;
            createBuilder.copyOnWrite();
            angn angnVar2 = (angn) createBuilder.instance;
            str2.getClass();
            angnVar2.b |= 1;
            angnVar2.c = str2;
            int i2 = tqmVar4.f;
            createBuilder.copyOnWrite();
            angn angnVar3 = (angn) createBuilder.instance;
            angnVar3.b |= 2;
            angnVar3.d = i2;
            int size = tqmVar4.n.size();
            createBuilder.copyOnWrite();
            angn angnVar4 = (angn) createBuilder.instance;
            angnVar4.b |= 8;
            angnVar4.f = size;
            long j = tqmVar4.r;
            createBuilder.copyOnWrite();
            angn angnVar5 = (angn) createBuilder.instance;
            angnVar5.b |= 32;
            angnVar5.h = j;
            String str3 = tqmVar4.s;
            createBuilder.copyOnWrite();
            angn angnVar6 = (angn) createBuilder.instance;
            str3.getClass();
            angnVar6.b |= 64;
            angnVar6.i = str3;
            angn angnVar7 = (angn) createBuilder.mo39build();
            tql tqlVar5 = tqmVar4.c;
            if (tqlVar5 == null) {
                tqlVar5 = tql.a;
            }
            if (tqlVar5.g == 0) {
                int i3 = typ.a;
            } else {
                long j2 = tqlVar5.d;
                long j3 = tqlVar5.f;
                long j4 = tqlVar5.e;
                aopa createBuilder2 = angr.a.createBuilder();
                int i4 = tqlVar5.g;
                createBuilder2.copyOnWrite();
                angr angrVar = (angr) createBuilder2.instance;
                angrVar.b = 1 | angrVar.b;
                angrVar.c = i4;
                createBuilder2.copyOnWrite();
                angr angrVar2 = (angr) createBuilder2.instance;
                angrVar2.b = 2 | angrVar2.b;
                angrVar2.d = j4 - j3;
                createBuilder2.copyOnWrite();
                angr angrVar3 = (angr) createBuilder2.instance;
                angrVar3.b |= 4;
                angrVar3.e = j4 - j2;
                tukVar3.b.b(angnVar7, (angr) createBuilder2.mo39build());
            }
            return anlz.q(tui.DOWNLOADED);
        } else {
            tuk tukVar4 = this.a;
            tqm tqmVar5 = this.b;
            if (((Boolean) obj).booleanValue()) {
                return ankq.a;
            }
            return anhq.i(anko.q(tukVar4.c(tqmVar5)), tqa.class, new ttf(tqmVar5, 1), tukVar4.h);
        }
    }
}
